package com.stripe.android.paymentsheet;

/* loaded from: classes6.dex */
final class PaymentSheetListFragment$sheetViewModel$2 extends kotlin.jvm.internal.u implements h00.a<PaymentSheetViewModel> {
    final /* synthetic */ PaymentSheetListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetListFragment$sheetViewModel$2(PaymentSheetListFragment paymentSheetListFragment) {
        super(0);
        this.this$0 = paymentSheetListFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentSheetViewModel invoke() {
        PaymentSheetViewModel activityViewModel;
        activityViewModel = this.this$0.getActivityViewModel();
        return activityViewModel;
    }
}