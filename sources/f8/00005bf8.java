package com.stripe.android.view;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class AddPaymentMethodNetbankingView$netbankingAdapter$1 extends kotlin.jvm.internal.u implements h00.l<Integer, vz.b0> {
    final /* synthetic */ AddPaymentMethodNetbankingView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodNetbankingView$netbankingAdapter$1(AddPaymentMethodNetbankingView addPaymentMethodNetbankingView) {
        super(1);
        this.this$0 = addPaymentMethodNetbankingView;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(Integer num) {
        invoke(num.intValue());
        return vz.b0.f54756a;
    }

    public final void invoke(int i11) {
        this.this$0.selectedPosition = Integer.valueOf(i11);
    }
}