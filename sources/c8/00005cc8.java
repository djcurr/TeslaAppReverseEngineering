package com.stripe.android.view;

import com.stripe.android.databinding.PaymentFlowActivityBinding;

/* loaded from: classes6.dex */
final class PaymentFlowActivity$viewPager$2 extends kotlin.jvm.internal.u implements h00.a<PaymentFlowViewPager> {
    final /* synthetic */ PaymentFlowActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivity$viewPager$2(PaymentFlowActivity paymentFlowActivity) {
        super(0);
        this.this$0 = paymentFlowActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentFlowViewPager invoke() {
        PaymentFlowActivityBinding viewBinding;
        viewBinding = this.this$0.getViewBinding();
        PaymentFlowViewPager paymentFlowViewPager = viewBinding.shippingFlowViewpager;
        kotlin.jvm.internal.s.f(paymentFlowViewPager, "viewBinding.shippingFlowViewpager");
        return paymentFlowViewPager;
    }
}