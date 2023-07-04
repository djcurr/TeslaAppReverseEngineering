package com.stripe.android.googlepaylauncher;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.g0;
import androidx.lifecycle.r0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.googlepaylauncher.GooglePayLauncherResult;
import com.stripe.android.googlepaylauncher.StripeGooglePayContract;
import com.stripe.android.model.GooglePayResult;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.ShippingInformation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import vz.b0;
import vz.k;
import vz.m;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public final class StripeGooglePayActivity extends androidx.appcompat.app.d {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int LOAD_PAYMENT_DATA_REQUEST_CODE = 4444;
    private StripeGooglePayContract.Args args;
    private final k paymentsClient$delegate;
    private final k publishableKey$delegate;
    private final k stripeAccountId$delegate;
    private final k viewModel$delegate;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public StripeGooglePayActivity() {
        k a11;
        k a12;
        k a13;
        a11 = m.a(new StripeGooglePayActivity$paymentsClient$2(this));
        this.paymentsClient$delegate = a11;
        a12 = m.a(new StripeGooglePayActivity$publishableKey$2(this));
        this.publishableKey$delegate = a12;
        a13 = m.a(new StripeGooglePayActivity$stripeAccountId$2(this));
        this.stripeAccountId$delegate = a13;
        this.viewModel$delegate = new r0(m0.b(StripeGooglePayViewModel.class), new StripeGooglePayActivity$special$$inlined$viewModels$2(this), new StripeGooglePayActivity$viewModel$2(this));
    }

    private final void finishWithResult(GooglePayLauncherResult googlePayLauncherResult) {
        setResult(-1, new Intent().putExtras(googlePayLauncherResult.toBundle()));
        finish();
    }

    private final PaymentsClient getPaymentsClient() {
        return (PaymentsClient) this.paymentsClient$delegate.getValue();
    }

    public final String getPublishableKey() {
        return (String) this.publishableKey$delegate.getValue();
    }

    public final String getStripeAccountId() {
        return (String) this.stripeAccountId$delegate.getValue();
    }

    private final StripeGooglePayViewModel getViewModel() {
        return (StripeGooglePayViewModel) this.viewModel$delegate.getValue();
    }

    public static /* synthetic */ void h(StripeGooglePayActivity stripeGooglePayActivity, JSONObject jSONObject, Task task) {
        m144isReadyToPay$lambda4(stripeGooglePayActivity, jSONObject, task);
    }

    private final void isReadyToPay(final JSONObject jSONObject) {
        getPaymentsClient().isReadyToPay(getViewModel().createIsReadyToPayRequest()).addOnCompleteListener(new OnCompleteListener() { // from class: com.stripe.android.googlepaylauncher.i
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                StripeGooglePayActivity.h(StripeGooglePayActivity.this, jSONObject, task);
            }
        });
    }

    /* renamed from: isReadyToPay$lambda-4 */
    public static final void m144isReadyToPay$lambda4(StripeGooglePayActivity this$0, JSONObject paymentDataRequest, Task task) {
        Object b11;
        s.g(this$0, "this$0");
        s.g(paymentDataRequest, "$paymentDataRequest");
        s.g(task, "task");
        try {
            q.a aVar = q.f54772b;
            if (task.isSuccessful()) {
                this$0.payWithGoogle(paymentDataRequest);
            } else {
                this$0.getViewModel().updateGooglePayResult(GooglePayLauncherResult.Unavailable.INSTANCE);
            }
            b11 = q.b(b0.f54756a);
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        Throwable e11 = q.e(b11);
        if (e11 != null) {
            this$0.getViewModel().updateGooglePayResult(new GooglePayLauncherResult.Error(e11, null, null, null, 14, null));
        }
    }

    public static /* synthetic */ void k(StripeGooglePayActivity stripeGooglePayActivity, GooglePayLauncherResult googlePayLauncherResult) {
        m145onCreate$lambda1(stripeGooglePayActivity, googlePayLauncherResult);
    }

    public static /* synthetic */ void l(StripeGooglePayActivity stripeGooglePayActivity, ShippingInformation shippingInformation, q qVar) {
        m146onGooglePayResult$lambda8(stripeGooglePayActivity, shippingInformation, qVar);
    }

    /* renamed from: onCreate$lambda-1 */
    public static final void m145onCreate$lambda1(StripeGooglePayActivity this$0, GooglePayLauncherResult googlePayLauncherResult) {
        s.g(this$0, "this$0");
        if (googlePayLauncherResult == null) {
            return;
        }
        this$0.finishWithResult(googlePayLauncherResult);
    }

    private final void onGooglePayResult(Intent intent) {
        PaymentData fromIntent = intent == null ? null : PaymentData.getFromIntent(intent);
        if (fromIntent == null) {
            getViewModel().updateGooglePayResult(new GooglePayLauncherResult.Error(new IllegalArgumentException("Google Pay data was not available"), null, null, null, 14, null));
            return;
        }
        JSONObject jSONObject = new JSONObject(fromIntent.toJson());
        final ShippingInformation shippingInformation = GooglePayResult.Companion.fromJson(jSONObject).getShippingInformation();
        getViewModel().createPaymentMethod(PaymentMethodCreateParams.Companion.createFromGooglePay(jSONObject)).observe(this, new g0() { // from class: com.stripe.android.googlepaylauncher.h
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                StripeGooglePayActivity.l(StripeGooglePayActivity.this, shippingInformation, (q) obj);
            }
        });
    }

    /* renamed from: onGooglePayResult$lambda-8 */
    public static final void m146onGooglePayResult$lambda8(StripeGooglePayActivity this$0, ShippingInformation shippingInformation, q qVar) {
        s.g(this$0, "this$0");
        if (qVar == null) {
            return;
        }
        Object j11 = qVar.j();
        Throwable e11 = q.e(j11);
        if (e11 == null) {
            this$0.onPaymentMethodCreated((PaymentMethod) j11, shippingInformation);
            return;
        }
        this$0.getViewModel().setPaymentMethod(null);
        this$0.getViewModel().updateGooglePayResult(new GooglePayLauncherResult.Error(e11, null, null, null, 14, null));
    }

    private final void onPaymentMethodCreated(PaymentMethod paymentMethod, ShippingInformation shippingInformation) {
        getViewModel().setPaymentMethod(paymentMethod);
        getViewModel().updateGooglePayResult(new GooglePayLauncherResult.PaymentData(paymentMethod, shippingInformation));
    }

    private final void payWithGoogle(JSONObject jSONObject) {
        AutoResolveHelper.resolveTask(getPaymentsClient().loadPaymentData(PaymentDataRequest.fromJson(jSONObject.toString())), this, LOAD_PAYMENT_DATA_REQUEST_CODE);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == LOAD_PAYMENT_DATA_REQUEST_CODE) {
            if (i12 == -1) {
                onGooglePayResult(intent);
            } else if (i12 == 0) {
                getViewModel().updateGooglePayResult(GooglePayLauncherResult.Canceled.INSTANCE);
            } else if (i12 != 1) {
                getViewModel().updateGooglePayResult(new GooglePayLauncherResult.Error(new RuntimeException("Google Pay returned an expected result code."), null, null, null, 14, null));
            } else {
                getViewModel().updateGooglePayResult(new GooglePayLauncherResult.Error(new RuntimeException("Google Pay returned an error. See googlePayStatus property for more information."), AutoResolveHelper.getStatusFromIntent(intent), null, null, 12, null));
            }
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setResult(-1, new Intent().putExtras(GooglePayLauncherResult.Canceled.INSTANCE.toBundle()));
        StripeGooglePayContract.Args.Companion companion = StripeGooglePayContract.Args.Companion;
        Intent intent = getIntent();
        s.f(intent, "intent");
        StripeGooglePayContract.Args create$payments_core_release = companion.create$payments_core_release(intent);
        if (create$payments_core_release == null) {
            finishWithResult(new GooglePayLauncherResult.Error(new RuntimeException("StripeGooglePayActivity was started without arguments."), null, null, null, 14, null));
            return;
        }
        this.args = create$payments_core_release;
        Integer statusBarColor = create$payments_core_release.getStatusBarColor();
        if (statusBarColor != null) {
            getWindow().setStatusBarColor(statusBarColor.intValue());
        }
        getViewModel().getGooglePayResult$payments_core_release().observe(this, new g0() { // from class: com.stripe.android.googlepaylauncher.g
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                StripeGooglePayActivity.k(StripeGooglePayActivity.this, (GooglePayLauncherResult) obj);
            }
        });
        if (getViewModel().getHasLaunched()) {
            return;
        }
        getViewModel().setHasLaunched(true);
        isReadyToPay(getViewModel().createPaymentDataRequestForPaymentIntentArgs());
    }
}