package com.stripe.android.googlepaylauncher;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.g0;
import androidx.lifecycle.r0;
import androidx.lifecycle.w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import v20.a2;
import vz.k;
import vz.v;

/* loaded from: classes6.dex */
public final class GooglePayPaymentMethodLauncherActivity extends androidx.appcompat.app.d {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int LOAD_PAYMENT_DATA_REQUEST_CODE = 4444;
    private GooglePayPaymentMethodLauncherContract.Args args;
    private final k viewModel$delegate = new r0(m0.b(GooglePayPaymentMethodLauncherViewModel.class), new GooglePayPaymentMethodLauncherActivity$special$$inlined$viewModels$2(this), new GooglePayPaymentMethodLauncherActivity$viewModel$2(this));

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void disableAnimations() {
        overridePendingTransition(0, 0);
    }

    public final void finishWithResult(GooglePayPaymentMethodLauncher.Result result) {
        setResult(-1, new Intent().putExtras(r3.b.a(v.a("extra_result", result))));
        finish();
    }

    public final GooglePayPaymentMethodLauncherViewModel getViewModel() {
        return (GooglePayPaymentMethodLauncherViewModel) this.viewModel$delegate.getValue();
    }

    private final int googlePayStatusCodeToErrorCode(int i11) {
        if (i11 != 7) {
            return i11 != 10 ? 1 : 2;
        }
        return 3;
    }

    public static /* synthetic */ void h(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity, GooglePayPaymentMethodLauncher.Result result) {
        m143onCreate$lambda0(googlePayPaymentMethodLauncherActivity, result);
    }

    public final void launchGooglePay(Task<PaymentData> task) {
        AutoResolveHelper.resolveTask(task, this, LOAD_PAYMENT_DATA_REQUEST_CODE);
    }

    /* renamed from: onCreate$lambda-0 */
    public static final void m143onCreate$lambda0(GooglePayPaymentMethodLauncherActivity this$0, GooglePayPaymentMethodLauncher.Result result) {
        s.g(this$0, "this$0");
        if (result == null) {
            return;
        }
        this$0.finishWithResult(result);
    }

    private final void onGooglePayResult(Intent intent) {
        PaymentData fromIntent;
        a2 a2Var = null;
        if (intent != null && (fromIntent = PaymentData.getFromIntent(intent)) != null) {
            a2Var = v20.k.d(w.a(this), null, null, new GooglePayPaymentMethodLauncherActivity$onGooglePayResult$2$1(this, fromIntent, null), 3, null);
        }
        if (a2Var == null) {
            updateResult(new GooglePayPaymentMethodLauncher.Result.Failed(new IllegalArgumentException("Google Pay data was not available"), 1));
        }
    }

    public final void updateResult(GooglePayPaymentMethodLauncher.Result result) {
        getViewModel().updateResult(result);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        disableAnimations();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == LOAD_PAYMENT_DATA_REQUEST_CODE) {
            if (i12 == -1) {
                onGooglePayResult(intent);
            } else if (i12 == 0) {
                updateResult(GooglePayPaymentMethodLauncher.Result.Canceled.INSTANCE);
            } else {
                if (i12 != 1) {
                    updateResult(new GooglePayPaymentMethodLauncher.Result.Failed(new RuntimeException("Google Pay returned an expected result code."), 1));
                    return;
                }
                Status statusFromIntent = AutoResolveHelper.getStatusFromIntent(intent);
                String statusMessage = statusFromIntent == null ? null : statusFromIntent.getStatusMessage();
                if (statusMessage == null) {
                    statusMessage = "";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Google Pay failed with error ");
                sb2.append(statusFromIntent != null ? Integer.valueOf(statusFromIntent.getStatusCode()) : null);
                sb2.append(": ");
                sb2.append(statusMessage);
                updateResult(new GooglePayPaymentMethodLauncher.Result.Failed(new RuntimeException(sb2.toString()), statusFromIntent != null ? googlePayStatusCodeToErrorCode(statusFromIntent.getStatusCode()) : 1));
            }
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("extra_status_bar_color", -1);
        if (intExtra != -1) {
            getWindow().setStatusBarColor(intExtra);
        }
        disableAnimations();
        GooglePayPaymentMethodLauncherContract.Args.Companion companion = GooglePayPaymentMethodLauncherContract.Args.Companion;
        Intent intent = getIntent();
        s.f(intent, "intent");
        GooglePayPaymentMethodLauncherContract.Args fromIntent = companion.fromIntent(intent);
        if (fromIntent == null) {
            finishWithResult(new GooglePayPaymentMethodLauncher.Result.Failed(new RuntimeException("GooglePayPaymentMethodLauncherActivity was started without arguments."), 2));
            return;
        }
        this.args = fromIntent;
        getViewModel().getGooglePayResult$payments_core_release().observe(this, new g0() { // from class: com.stripe.android.googlepaylauncher.f
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                GooglePayPaymentMethodLauncherActivity.h(GooglePayPaymentMethodLauncherActivity.this, (GooglePayPaymentMethodLauncher.Result) obj);
            }
        });
        if (getViewModel().getHasLaunched$payments_core_release()) {
            return;
        }
        v20.k.d(w.a(this), null, null, new GooglePayPaymentMethodLauncherActivity$onCreate$2(this, null), 3, null);
    }
}