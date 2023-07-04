package com.stripe.android.ui.core.elements;

import com.stripe.android.model.CardBrand;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import com.stripe.android.ui.core.elements.TextFieldController;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;

/* loaded from: classes6.dex */
public abstract class CardNumberController implements TextFieldController, SectionFieldErrorController {
    public static final int $stable = 0;

    private CardNumberController() {
    }

    public /* synthetic */ CardNumberController(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract e<CardBrand> getCardBrandFlow();

    public abstract boolean getCardScanEnabled();

    @Override // com.stripe.android.ui.core.elements.TextFieldController
    public boolean getEnabled() {
        return TextFieldController.DefaultImpls.getEnabled(this);
    }

    public final void onCardScanResult(CardScanSheetResult cardScanSheetResult) {
        s.g(cardScanSheetResult, "cardScanSheetResult");
        if (cardScanSheetResult instanceof CardScanSheetResult.Completed) {
            onRawValueChange(((CardScanSheetResult.Completed) cardScanSheetResult).getScannedCard().getPan());
        }
    }
}