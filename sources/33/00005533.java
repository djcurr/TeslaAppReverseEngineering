package com.stripe.android.paymentsheet;

/* loaded from: classes6.dex */
final class PaymentOptionsListFragment$sheetViewModel$2 extends kotlin.jvm.internal.u implements h00.a<PaymentOptionsViewModel> {
    final /* synthetic */ PaymentOptionsListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsListFragment$sheetViewModel$2(PaymentOptionsListFragment paymentOptionsListFragment) {
        super(0);
        this.this$0 = paymentOptionsListFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentOptionsViewModel invoke() {
        PaymentOptionsViewModel activityViewModel;
        activityViewModel = this.this$0.getActivityViewModel();
        return activityViewModel;
    }
}