package com.reactnativestripesdk;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.stripe.android.ApiResultCallback;
import com.stripe.android.Stripe;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncher;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class g0 extends Fragment {

    /* renamed from: l */
    public static final a f20278l = new a(null);

    /* renamed from: a */
    private final ReactApplicationContext f20279a;

    /* renamed from: b */
    private final Stripe f20280b;

    /* renamed from: c */
    private final String f20281c;

    /* renamed from: d */
    private final String f20282d;

    /* renamed from: e */
    private final Promise f20283e;

    /* renamed from: f */
    private final String f20284f;

    /* renamed from: g */
    private final ConfirmPaymentIntentParams f20285g;

    /* renamed from: h */
    private final String f20286h;

    /* renamed from: i */
    private final ConfirmSetupIntentParams f20287i;

    /* renamed from: j */
    private final String f20288j;

    /* renamed from: k */
    private PaymentLauncher f20289k;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(g0 g0Var, ReactApplicationContext reactApplicationContext, Promise promise) {
            Object obj;
            Activity currentActivity = reactApplicationContext.getCurrentActivity();
            Object obj2 = null;
            androidx.appcompat.app.d dVar = currentActivity instanceof androidx.appcompat.app.d ? (androidx.appcompat.app.d) currentActivity : null;
            if (dVar != null) {
                try {
                    obj = Integer.valueOf(dVar.getSupportFragmentManager().m().e(g0Var, "payment_launcher_fragment").h());
                } catch (IllegalStateException e11) {
                    promise.resolve(hr.a.d(com.reactnativestripesdk.utils.d.Failed.toString(), e11.getMessage()));
                    obj = vz.b0.f54756a;
                }
                obj2 = obj;
            }
            if (obj2 == null) {
                promise.resolve(hr.a.f());
            }
        }

        public final g0 b(ReactApplicationContext context, Stripe stripe, String publishableKey, String str, Promise promise, String handleNextActionClientSecret) {
            kotlin.jvm.internal.s.g(context, "context");
            kotlin.jvm.internal.s.g(stripe, "stripe");
            kotlin.jvm.internal.s.g(publishableKey, "publishableKey");
            kotlin.jvm.internal.s.g(promise, "promise");
            kotlin.jvm.internal.s.g(handleNextActionClientSecret, "handleNextActionClientSecret");
            g0 g0Var = new g0(context, stripe, publishableKey, str, promise, null, null, null, null, handleNextActionClientSecret, 480, null);
            a(g0Var, context, promise);
            return g0Var;
        }

        public final g0 c(ReactApplicationContext context, Stripe stripe, String publishableKey, String str, Promise promise, String paymentIntentClientSecret, ConfirmPaymentIntentParams confirmPaymentParams) {
            kotlin.jvm.internal.s.g(context, "context");
            kotlin.jvm.internal.s.g(stripe, "stripe");
            kotlin.jvm.internal.s.g(publishableKey, "publishableKey");
            kotlin.jvm.internal.s.g(promise, "promise");
            kotlin.jvm.internal.s.g(paymentIntentClientSecret, "paymentIntentClientSecret");
            kotlin.jvm.internal.s.g(confirmPaymentParams, "confirmPaymentParams");
            g0 g0Var = new g0(context, stripe, publishableKey, str, promise, paymentIntentClientSecret, confirmPaymentParams, null, null, null, 896, null);
            a(g0Var, context, promise);
            return g0Var;
        }

        public final g0 d(ReactApplicationContext context, Stripe stripe, String publishableKey, String str, Promise promise, String setupIntentClientSecret, ConfirmSetupIntentParams confirmSetupParams) {
            kotlin.jvm.internal.s.g(context, "context");
            kotlin.jvm.internal.s.g(stripe, "stripe");
            kotlin.jvm.internal.s.g(publishableKey, "publishableKey");
            kotlin.jvm.internal.s.g(promise, "promise");
            kotlin.jvm.internal.s.g(setupIntentClientSecret, "setupIntentClientSecret");
            kotlin.jvm.internal.s.g(confirmSetupParams, "confirmSetupParams");
            g0 g0Var = new g0(context, stripe, publishableKey, str, promise, null, null, setupIntentClientSecret, confirmSetupParams, null, 608, null);
            a(g0Var, context, promise);
            return g0Var;
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20290a;

        static {
            int[] iArr = new int[StripeIntent.NextActionType.values().length];
            iArr[StripeIntent.NextActionType.DisplayOxxoDetails.ordinal()] = 1;
            iArr[StripeIntent.NextActionType.VerifyWithMicrodeposits.ordinal()] = 2;
            iArr[StripeIntent.NextActionType.RedirectToUrl.ordinal()] = 3;
            iArr[StripeIntent.NextActionType.UseStripeSdk.ordinal()] = 4;
            iArr[StripeIntent.NextActionType.AlipayRedirect.ordinal()] = 5;
            iArr[StripeIntent.NextActionType.BlikAuthorize.ordinal()] = 6;
            iArr[StripeIntent.NextActionType.WeChatPayRedirect.ordinal()] = 7;
            f20290a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements ApiResultCallback<PaymentIntent> {

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f20292a;

            static {
                int[] iArr = new int[StripeIntent.Status.values().length];
                iArr[StripeIntent.Status.Succeeded.ordinal()] = 1;
                iArr[StripeIntent.Status.Processing.ordinal()] = 2;
                iArr[StripeIntent.Status.RequiresConfirmation.ordinal()] = 3;
                iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 4;
                iArr[StripeIntent.Status.RequiresAction.ordinal()] = 5;
                iArr[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 6;
                iArr[StripeIntent.Status.Canceled.ordinal()] = 7;
                f20292a = iArr;
            }
        }

        c() {
            g0.this = r1;
        }

        @Override // com.stripe.android.ApiResultCallback
        /* renamed from: a */
        public void onSuccess(PaymentIntent result) {
            vz.b0 b0Var;
            kotlin.jvm.internal.s.g(result, "result");
            StripeIntent.Status status = result.getStatus();
            switch (status == null ? -1 : a.f20292a[status.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    g0.this.f20283e.resolve(hr.d.d("paymentIntent", hr.d.u(result)));
                    break;
                case 5:
                    if (g0.this.g(result.getNextActionType())) {
                        g0.this.f20283e.resolve(hr.d.d("paymentIntent", hr.d.u(result)));
                        break;
                    } else {
                        PaymentIntent.Error lastPaymentError = result.getLastPaymentError();
                        if (lastPaymentError == null) {
                            b0Var = null;
                        } else {
                            g0.this.f20283e.resolve(hr.a.a(com.reactnativestripesdk.utils.a.Canceled.toString(), lastPaymentError));
                            b0Var = vz.b0.f54756a;
                        }
                        if (b0Var == null) {
                            g0.this.f20283e.resolve(hr.a.d(com.reactnativestripesdk.utils.a.Canceled.toString(), "The payment has been canceled"));
                            break;
                        }
                    }
                    break;
                case 6:
                    g0.this.f20283e.resolve(hr.a.a(com.reactnativestripesdk.utils.a.Failed.toString(), result.getLastPaymentError()));
                    break;
                case 7:
                    g0.this.f20283e.resolve(hr.a.a(com.reactnativestripesdk.utils.a.Canceled.toString(), result.getLastPaymentError()));
                    break;
                default:
                    g0.this.f20283e.resolve(hr.a.d(com.reactnativestripesdk.utils.a.Unknown.toString(), kotlin.jvm.internal.s.p("unhandled error: ", result.getStatus())));
                    break;
            }
            g0 g0Var = g0.this;
            hr.c.c(g0Var, g0Var.f20279a);
        }

        @Override // com.stripe.android.ApiResultCallback
        public void onError(Exception e11) {
            kotlin.jvm.internal.s.g(e11, "e");
            g0.this.f20283e.resolve(hr.a.c(com.reactnativestripesdk.utils.a.Failed.toString(), e11));
            g0 g0Var = g0.this;
            hr.c.c(g0Var, g0Var.f20279a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements ApiResultCallback<SetupIntent> {

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f20294a;

            static {
                int[] iArr = new int[StripeIntent.Status.values().length];
                iArr[StripeIntent.Status.Succeeded.ordinal()] = 1;
                iArr[StripeIntent.Status.Processing.ordinal()] = 2;
                iArr[StripeIntent.Status.RequiresConfirmation.ordinal()] = 3;
                iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 4;
                iArr[StripeIntent.Status.RequiresAction.ordinal()] = 5;
                iArr[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 6;
                iArr[StripeIntent.Status.Canceled.ordinal()] = 7;
                f20294a = iArr;
            }
        }

        d() {
            g0.this = r1;
        }

        @Override // com.stripe.android.ApiResultCallback
        /* renamed from: a */
        public void onSuccess(SetupIntent result) {
            vz.b0 b0Var;
            kotlin.jvm.internal.s.g(result, "result");
            StripeIntent.Status status = result.getStatus();
            switch (status == null ? -1 : a.f20294a[status.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    g0.this.f20283e.resolve(hr.d.d("setupIntent", hr.d.x(result)));
                    break;
                case 5:
                    if (g0.this.g(result.getNextActionType())) {
                        g0.this.f20283e.resolve(hr.d.d("setupIntent", hr.d.x(result)));
                        break;
                    } else {
                        SetupIntent.Error lastSetupError = result.getLastSetupError();
                        if (lastSetupError == null) {
                            b0Var = null;
                        } else {
                            g0.this.f20283e.resolve(hr.a.b(com.reactnativestripesdk.utils.b.Canceled.toString(), lastSetupError));
                            b0Var = vz.b0.f54756a;
                        }
                        if (b0Var == null) {
                            g0.this.f20283e.resolve(hr.a.d(com.reactnativestripesdk.utils.b.Canceled.toString(), "Setup has been canceled"));
                            break;
                        }
                    }
                    break;
                case 6:
                    g0.this.f20283e.resolve(hr.a.b(com.reactnativestripesdk.utils.b.Failed.toString(), result.getLastSetupError()));
                    break;
                case 7:
                    g0.this.f20283e.resolve(hr.a.b(com.reactnativestripesdk.utils.b.Canceled.toString(), result.getLastSetupError()));
                    break;
                default:
                    g0.this.f20283e.resolve(hr.a.d(com.reactnativestripesdk.utils.b.Unknown.toString(), kotlin.jvm.internal.s.p("unhandled error: ", result.getStatus())));
                    break;
            }
            g0 g0Var = g0.this;
            hr.c.c(g0Var, g0Var.f20279a);
        }

        @Override // com.stripe.android.ApiResultCallback
        public void onError(Exception e11) {
            kotlin.jvm.internal.s.g(e11, "e");
            g0.this.f20283e.resolve(hr.a.c(com.reactnativestripesdk.utils.b.Failed.toString(), e11));
            g0 g0Var = g0.this;
            hr.c.c(g0Var, g0Var.f20279a);
        }
    }

    public /* synthetic */ g0(ReactApplicationContext reactApplicationContext, Stripe stripe, String str, String str2, Promise promise, String str3, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str4, ConfirmSetupIntentParams confirmSetupIntentParams, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, stripe, str, str2, promise, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : confirmPaymentIntentParams, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : confirmSetupIntentParams, (i11 & 512) != 0 ? null : str5);
    }

    public static /* synthetic */ void a(g0 g0Var, PaymentResult paymentResult) {
        f(g0Var, paymentResult);
    }

    private final PaymentLauncher e() {
        return PaymentLauncher.Companion.create(this, this.f20281c, this.f20282d, new PaymentLauncher.PaymentResultCallback() { // from class: com.reactnativestripesdk.f0
            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncher.PaymentResultCallback
            public final void onPaymentResult(PaymentResult paymentResult) {
                g0.a(g0.this, paymentResult);
            }
        });
    }

    public static final void f(g0 this$0, PaymentResult paymentResult) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(paymentResult, "paymentResult");
        if (paymentResult instanceof PaymentResult.Completed) {
            String str = this$0.f20284f;
            if (str != null) {
                this$0.h(str, this$0.f20282d);
                return;
            }
            String str2 = this$0.f20288j;
            if (str2 != null) {
                this$0.h(str2, this$0.f20282d);
                return;
            }
            String str3 = this$0.f20286h;
            if (str3 != null) {
                this$0.i(str3, this$0.f20282d);
                return;
            }
            throw new Exception("Failed to create Payment Launcher. No client secret provided.");
        } else if (paymentResult instanceof PaymentResult.Canceled) {
            this$0.f20283e.resolve(hr.a.d(com.reactnativestripesdk.utils.a.Canceled.toString(), null));
            hr.c.c(this$0, this$0.f20279a);
        } else if (paymentResult instanceof PaymentResult.Failed) {
            this$0.f20283e.resolve(hr.a.e(com.reactnativestripesdk.utils.a.Failed.toString(), ((PaymentResult.Failed) paymentResult).getThrowable()));
            hr.c.c(this$0, this$0.f20279a);
        }
    }

    public final boolean g(StripeIntent.NextActionType nextActionType) {
        switch (nextActionType == null ? -1 : b.f20290a[nextActionType.ordinal()]) {
            case -1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return false;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
                return true;
        }
    }

    private final void h(String str, String str2) {
        this.f20280b.retrievePaymentIntent(str, str2, new c());
    }

    private final void i(String str, String str2) {
        this.f20280b.retrieveSetupIntent(str, str2, new d());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        PaymentLauncher e11 = e();
        this.f20289k = e11;
        if (this.f20284f != null && this.f20285g != null) {
            if (e11 == null) {
                kotlin.jvm.internal.s.x("paymentLauncher");
                e11 = null;
            }
            e11.confirm(this.f20285g);
        } else if (this.f20286h != null && this.f20287i != null) {
            if (e11 == null) {
                kotlin.jvm.internal.s.x("paymentLauncher");
                e11 = null;
            }
            e11.confirm(this.f20287i);
        } else if (this.f20288j == null) {
            throw new Exception("Invalid parameters provided to PaymentLauncher. Ensure that you are providing the correct client secret and setup params (if necessary).");
        } else {
            if (e11 == null) {
                kotlin.jvm.internal.s.x("paymentLauncher");
                e11 = null;
            }
            e11.handleNextActionForPaymentIntent(this.f20288j);
        }
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    public g0(ReactApplicationContext context, Stripe stripe, String publishableKey, String str, Promise promise, String str2, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str3, ConfirmSetupIntentParams confirmSetupIntentParams, String str4) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(stripe, "stripe");
        kotlin.jvm.internal.s.g(publishableKey, "publishableKey");
        kotlin.jvm.internal.s.g(promise, "promise");
        this.f20279a = context;
        this.f20280b = stripe;
        this.f20281c = publishableKey;
        this.f20282d = str;
        this.f20283e = promise;
        this.f20284f = str2;
        this.f20285g = confirmPaymentIntentParams;
        this.f20286h = str3;
        this.f20287i = confirmSetupIntentParams;
        this.f20288j = str4;
    }
}