package com.stripe.android.view;

/* loaded from: classes6.dex */
final class CardInputWidget$initView$16 extends kotlin.jvm.internal.u implements h00.l<Boolean, vz.b0> {
    final /* synthetic */ CardInputWidget this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardInputWidget$initView$16(CardInputWidget cardInputWidget) {
        super(1);
        this.this$0 = cardInputWidget;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return vz.b0.f54756a;
    }

    public final void invoke(boolean z11) {
        this.this$0.getCardBrandView$payments_core_release().setLoading(z11);
    }
}