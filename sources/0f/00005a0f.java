package com.stripe.android.ui.core.elements;

import android.content.Context;
import com.stripe.android.ui.core.DefaultIsStripeCardScanAvailable;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;

/* loaded from: classes6.dex */
public final class CardDetailsSectionController implements SectionFieldErrorController {
    public static final int $stable = 8;
    private final CardDetailsElement cardDetailsElement;
    private final e<FieldError> error;
    private final boolean isCardScanEnabled;
    private final DefaultIsStripeCardScanAvailable isStripeCardScanAvailable;

    public CardDetailsSectionController(Context context, Map<IdentifierSpec, String> initialValues, Set<IdentifierSpec> viewOnlyFields) {
        s.g(context, "context");
        s.g(initialValues, "initialValues");
        s.g(viewOnlyFields, "viewOnlyFields");
        CardDetailsElement cardDetailsElement = new CardDetailsElement(IdentifierSpec.Companion.Generic("card_detail"), context, initialValues, viewOnlyFields, null, 16, null);
        this.cardDetailsElement = cardDetailsElement;
        this.isCardScanEnabled = cardDetailsElement.isCardScanEnabled();
        this.isStripeCardScanAvailable = new DefaultIsStripeCardScanAvailable();
        this.error = cardDetailsElement.getController().getError();
    }

    public final CardDetailsElement getCardDetailsElement$payments_ui_core_release() {
        return this.cardDetailsElement;
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldErrorController
    public e<FieldError> getError() {
        return this.error;
    }

    public final boolean isCardScanEnabled$payments_ui_core_release() {
        return this.isCardScanEnabled;
    }

    public final DefaultIsStripeCardScanAvailable isStripeCardScanAvailable$payments_ui_core_release() {
        return this.isStripeCardScanAvailable;
    }
}