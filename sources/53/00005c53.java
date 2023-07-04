package com.stripe.android.view;

import com.stripe.android.model.CardBrand;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CardInputWidget$initView$12 extends kotlin.jvm.internal.u implements h00.l<CardBrand, vz.b0> {
    final /* synthetic */ CardInputWidget this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardInputWidget$initView$12(CardInputWidget cardInputWidget) {
        super(1);
        this.this$0 = cardInputWidget;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(CardBrand cardBrand) {
        invoke2(cardBrand);
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CardBrand brand) {
        kotlin.jvm.internal.s.g(brand, "brand");
        this.this$0.getCardBrandView$payments_core_release().setBrand(brand);
        CardInputWidget cardInputWidget = this.this$0;
        cardInputWidget.hiddenCardText = cardInputWidget.createHiddenCardText$payments_core_release(cardInputWidget.getCardNumberEditText$payments_core_release().getPanLength$payments_core_release());
        this.this$0.updateCvc();
    }
}