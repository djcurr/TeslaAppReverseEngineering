package com.stripe.android.view;

import android.view.View;
import android.view.ViewGroup;
import com.stripe.android.R;
import com.stripe.android.databinding.PaymentFlowActivityBinding;
import java.util.Objects;

/* loaded from: classes6.dex */
final class PaymentFlowActivity$viewBinding$2 extends kotlin.jvm.internal.u implements h00.a<PaymentFlowActivityBinding> {
    final /* synthetic */ PaymentFlowActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivity$viewBinding$2(PaymentFlowActivity paymentFlowActivity) {
        super(0);
        this.this$0 = paymentFlowActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentFlowActivityBinding invoke() {
        this.this$0.getViewStub$payments_core_release().setLayoutResource(R.layout.payment_flow_activity);
        View inflate = this.this$0.getViewStub$payments_core_release().inflate();
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        PaymentFlowActivityBinding bind = PaymentFlowActivityBinding.bind((ViewGroup) inflate);
        kotlin.jvm.internal.s.f(bind, "bind(root)");
        return bind;
    }
}