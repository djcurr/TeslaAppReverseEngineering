package com.stripe.android.view;

import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.model.ShippingMethod;

/* loaded from: classes6.dex */
final class PaymentFlowActivity$paymentFlowPagerAdapter$2 extends kotlin.jvm.internal.u implements h00.a<PaymentFlowPagerAdapter> {
    final /* synthetic */ PaymentFlowActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.PaymentFlowActivity$paymentFlowPagerAdapter$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.u implements h00.l<ShippingMethod, vz.b0> {
        final /* synthetic */ PaymentFlowActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaymentFlowActivity paymentFlowActivity) {
            super(1);
            this.this$0 = paymentFlowActivity;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(ShippingMethod shippingMethod) {
            invoke2(shippingMethod);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ShippingMethod it2) {
            PaymentFlowViewModel viewModel;
            kotlin.jvm.internal.s.g(it2, "it");
            viewModel = this.this$0.getViewModel();
            viewModel.setSelectedShippingMethod$payments_core_release(it2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivity$paymentFlowPagerAdapter$2(PaymentFlowActivity paymentFlowActivity) {
        super(0);
        this.this$0 = paymentFlowActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentFlowPagerAdapter invoke() {
        PaymentSessionConfig paymentSessionConfig;
        PaymentSessionConfig paymentSessionConfig2;
        PaymentFlowActivity paymentFlowActivity = this.this$0;
        paymentSessionConfig = paymentFlowActivity.getPaymentSessionConfig();
        paymentSessionConfig2 = this.this$0.getPaymentSessionConfig();
        return new PaymentFlowPagerAdapter(paymentFlowActivity, paymentSessionConfig, paymentSessionConfig2.getAllowedShippingCountryCodes(), new AnonymousClass1(this.this$0));
    }
}