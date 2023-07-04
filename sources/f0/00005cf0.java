package com.stripe.android.view;

import android.app.Application;
import androidx.lifecycle.s0;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import com.stripe.android.view.PaymentMethodsViewModel;

/* loaded from: classes6.dex */
final class PaymentMethodsActivity$viewModel$2 extends kotlin.jvm.internal.u implements h00.a<s0.b> {
    final /* synthetic */ PaymentMethodsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$viewModel$2(PaymentMethodsActivity paymentMethodsActivity) {
        super(0);
        this.this$0 = paymentMethodsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        Object m535getCustomerSessiond1pmJ48;
        PaymentMethodsActivityStarter.Args args;
        boolean startedFromPaymentSession;
        Application application = this.this$0.getApplication();
        kotlin.jvm.internal.s.f(application, "application");
        m535getCustomerSessiond1pmJ48 = this.this$0.m535getCustomerSessiond1pmJ48();
        args = this.this$0.getArgs();
        String initialPaymentMethodId$payments_core_release = args.getInitialPaymentMethodId$payments_core_release();
        startedFromPaymentSession = this.this$0.getStartedFromPaymentSession();
        return new PaymentMethodsViewModel.Factory(application, m535getCustomerSessiond1pmJ48, initialPaymentMethodId$payments_core_release, startedFromPaymentSession);
    }
}