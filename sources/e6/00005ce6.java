package com.stripe.android.view;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import java.util.List;

/* loaded from: classes6.dex */
final class PaymentMethodsActivity$adapter$2 extends kotlin.jvm.internal.u implements h00.a<PaymentMethodsAdapter> {
    final /* synthetic */ PaymentMethodsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$adapter$2(PaymentMethodsActivity paymentMethodsActivity) {
        super(0);
        this.this$0 = paymentMethodsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentMethodsAdapter invoke() {
        PaymentMethodsActivityStarter.Args args;
        PaymentMethodsActivityStarter.Args args2;
        PaymentMethodsViewModel viewModel;
        PaymentMethodsActivityStarter.Args args3;
        PaymentMethodsActivityStarter.Args args4;
        PaymentMethodsActivityStarter.Args args5;
        args = this.this$0.getArgs();
        args2 = this.this$0.getArgs();
        List<PaymentMethod.Type> paymentMethodTypes$payments_core_release = args2.getPaymentMethodTypes$payments_core_release();
        viewModel = this.this$0.getViewModel();
        String selectedPaymentMethodId$payments_core_release = viewModel.getSelectedPaymentMethodId$payments_core_release();
        args3 = this.this$0.getArgs();
        boolean shouldShowGooglePay$payments_core_release = args3.getShouldShowGooglePay$payments_core_release();
        args4 = this.this$0.getArgs();
        boolean useGooglePay$payments_core_release = args4.getUseGooglePay$payments_core_release();
        args5 = this.this$0.getArgs();
        return new PaymentMethodsAdapter(args, paymentMethodTypes$payments_core_release, selectedPaymentMethodId$payments_core_release, shouldShowGooglePay$payments_core_release, useGooglePay$payments_core_release, args5.getCanDeletePaymentMethods$payments_core_release());
    }
}