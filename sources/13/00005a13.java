package com.stripe.android.ui.core.elements;

import android.content.Intent;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import com.stripe.android.stripecardscan.cardscan.exception.UnknownScanException;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$1$2 extends u implements l<Intent, b0> {
    final /* synthetic */ CardDetailsSectionController $controller;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$1$2(CardDetailsSectionController cardDetailsSectionController) {
        super(1);
        this.$controller = cardDetailsSectionController;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(Intent intent) {
        invoke2(intent);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Intent it2) {
        s.g(it2, "it");
        CardNumberController controller = this.$controller.getCardDetailsElement$payments_ui_core_release().getController().getNumberElement().getController();
        CardScanSheetResult cardScanSheetResult = (CardScanSheetResult) it2.getParcelableExtra(CardScanActivity.CARD_SCAN_PARCELABLE_NAME);
        if (cardScanSheetResult == null) {
            cardScanSheetResult = (CardScanSheetResult) new CardScanSheetResult.Failed(new UnknownScanException("No data in the result intent"));
        }
        controller.onCardScanResult(cardScanSheetResult);
    }
}