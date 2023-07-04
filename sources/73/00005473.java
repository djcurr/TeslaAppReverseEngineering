package com.stripe.android.payments.paymentlauncher;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.d;
import androidx.lifecycle.g0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public final class PaymentLauncherConfirmationActivity extends d {
    public static final Companion Companion = new Companion(null);
    public static final String EMPTY_ARG_ERROR = "PaymentLauncherConfirmationActivity was started without arguments";
    private final k starterArgs$delegate;
    private final k viewModel$delegate;
    private s0.b viewModelFactory;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PaymentLauncherConfirmationActivity() {
        k a11;
        a11 = m.a(new PaymentLauncherConfirmationActivity$starterArgs$2(this));
        this.starterArgs$delegate = a11;
        this.viewModelFactory = new PaymentLauncherViewModel.Factory(new PaymentLauncherConfirmationActivity$viewModelFactory$1(this), new PaymentLauncherConfirmationActivity$viewModelFactory$2(this), this);
        this.viewModel$delegate = new r0(m0.b(PaymentLauncherViewModel.class), new PaymentLauncherConfirmationActivity$special$$inlined$viewModels$2(this), new PaymentLauncherConfirmationActivity$viewModel$2(this));
    }

    private final void disableAnimations() {
        overridePendingTransition(0, 0);
    }

    public final void finishWithResult(PaymentResult paymentResult) {
        setResult(-1, new Intent().putExtras(paymentResult.toBundle()));
        finish();
    }

    public final PaymentLauncherContract.Args getStarterArgs() {
        return (PaymentLauncherContract.Args) this.starterArgs$delegate.getValue();
    }

    public static /* synthetic */ void getViewModel$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getViewModelFactory$payments_core_release$annotations() {
    }

    public static /* synthetic */ void h(PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity, PaymentResult paymentResult) {
        paymentLauncherConfirmationActivity.finishWithResult(paymentResult);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        disableAnimations();
    }

    public final PaymentLauncherViewModel getViewModel$payments_core_release() {
        return (PaymentLauncherViewModel) this.viewModel$delegate.getValue();
    }

    public final s0.b getViewModelFactory$payments_core_release() {
        return this.viewModelFactory;
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object b11;
        PaymentLauncherContract.Args starterArgs;
        super.onCreate(bundle);
        disableAnimations();
        try {
            q.a aVar = q.f54772b;
            starterArgs = getStarterArgs();
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (starterArgs != null) {
            b11 = q.b(starterArgs);
            Throwable e11 = q.e(b11);
            if (e11 == null) {
                PaymentLauncherContract.Args args = (PaymentLauncherContract.Args) b11;
                Integer statusBarColor = args.getStatusBarColor();
                if (statusBarColor != null) {
                    getWindow().setStatusBarColor(statusBarColor.intValue());
                }
                getViewModel$payments_core_release().getPaymentLauncherResult$payments_core_release().observe(this, new g0() { // from class: com.stripe.android.payments.paymentlauncher.a
                    {
                        PaymentLauncherConfirmationActivity.this = this;
                    }

                    @Override // androidx.lifecycle.g0
                    public final void onChanged(Object obj) {
                        PaymentLauncherConfirmationActivity.h(PaymentLauncherConfirmationActivity.this, (PaymentResult) obj);
                    }
                });
                getViewModel$payments_core_release().register$payments_core_release(this);
                AuthActivityStarterHost create$payments_core_release = AuthActivityStarterHost.Companion.create$payments_core_release(this);
                if (args instanceof PaymentLauncherContract.Args.IntentConfirmationArgs) {
                    getViewModel$payments_core_release().confirmStripeIntent$payments_core_release(((PaymentLauncherContract.Args.IntentConfirmationArgs) args).getConfirmStripeIntentParams(), create$payments_core_release);
                    return;
                } else if (args instanceof PaymentLauncherContract.Args.PaymentIntentNextActionArgs) {
                    getViewModel$payments_core_release().handleNextActionForStripeIntent$payments_core_release(((PaymentLauncherContract.Args.PaymentIntentNextActionArgs) args).getPaymentIntentClientSecret(), create$payments_core_release);
                    return;
                } else if (args instanceof PaymentLauncherContract.Args.SetupIntentNextActionArgs) {
                    getViewModel$payments_core_release().handleNextActionForStripeIntent$payments_core_release(((PaymentLauncherContract.Args.SetupIntentNextActionArgs) args).getSetupIntentClientSecret(), create$payments_core_release);
                    return;
                } else {
                    return;
                }
            }
            finishWithResult(new PaymentResult.Failed(e11));
            return;
        }
        throw new IllegalArgumentException(EMPTY_ARG_ERROR.toString());
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getViewModel$payments_core_release().cleanUp$payments_core_release();
    }

    public final void setViewModelFactory$payments_core_release(s0.b bVar) {
        s.g(bVar, "<set-?>");
        this.viewModelFactory = bVar;
    }
}