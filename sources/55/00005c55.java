package com.stripe.android.view;

/* loaded from: classes6.dex */
final class CardInputWidget$initView$14 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
    final /* synthetic */ CardInputWidget this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardInputWidget$initView$14(CardInputWidget cardInputWidget) {
        super(0);
        this.this$0 = cardInputWidget;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ vz.b0 invoke() {
        invoke2();
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.this$0.getPostalCodeEnabled()) {
            this.this$0.getPostalCodeEditText$payments_core_release().requestFocus();
        }
    }
}