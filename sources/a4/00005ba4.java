package com.stripe.android.ui.core.forms;

import com.stripe.android.ui.core.elements.BillingSpecKt;
import com.stripe.android.ui.core.elements.CardBillingSpec;
import com.stripe.android.ui.core.elements.CardDetailsSectionSpec;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.LayoutSpec;
import com.stripe.android.ui.core.elements.SaveForFutureUseSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class CardSpecKt {
    private static final LayoutSpec CardForm;
    private static final LayoutSpec LinkCardForm;

    static {
        LayoutSpec.Companion companion = LayoutSpec.Companion;
        IdentifierSpec.Companion companion2 = IdentifierSpec.Companion;
        CardForm = companion.create(new CardDetailsSectionSpec(companion2.Generic("card_details_section")), new CardBillingSpec((IdentifierSpec) null, BillingSpecKt.getSupportedBillingCountries(), 1, (DefaultConstructorMarker) null), new SaveForFutureUseSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null));
        LinkCardForm = companion.create(new CardDetailsSectionSpec(companion2.Generic("card_details_section")), new CardBillingSpec((IdentifierSpec) null, BillingSpecKt.getSupportedBillingCountries(), 1, (DefaultConstructorMarker) null));
    }

    public static final LayoutSpec getCardForm() {
        return CardForm;
    }

    public static final LayoutSpec getLinkCardForm() {
        return LinkCardForm;
    }
}