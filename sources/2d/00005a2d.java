package com.stripe.android.ui.core.elements;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class CardNumberElement extends SectionSingleFieldElement {
    private final IdentifierSpec _identifier;
    private final CardNumberController controller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberElement(IdentifierSpec _identifier, CardNumberController controller) {
        super(_identifier, null);
        s.g(_identifier, "_identifier");
        s.g(controller, "controller");
        this._identifier = _identifier;
        this.controller = controller;
    }

    public static /* synthetic */ CardNumberElement copy$default(CardNumberElement cardNumberElement, IdentifierSpec identifierSpec, CardNumberController cardNumberController, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = cardNumberElement._identifier;
        }
        if ((i11 & 2) != 0) {
            cardNumberController = cardNumberElement.getController();
        }
        return cardNumberElement.copy(identifierSpec, cardNumberController);
    }

    public final IdentifierSpec component1() {
        return this._identifier;
    }

    public final CardNumberController component2() {
        return getController();
    }

    public final CardNumberElement copy(IdentifierSpec _identifier, CardNumberController controller) {
        s.g(_identifier, "_identifier");
        s.g(controller, "controller");
        return new CardNumberElement(_identifier, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardNumberElement) {
            CardNumberElement cardNumberElement = (CardNumberElement) obj;
            return s.c(this._identifier, cardNumberElement._identifier) && s.c(getController(), cardNumberElement.getController());
        }
        return false;
    }

    public final IdentifierSpec get_identifier() {
        return this._identifier;
    }

    public int hashCode() {
        return (this._identifier.hashCode() * 31) + getController().hashCode();
    }

    @Override // com.stripe.android.ui.core.elements.SectionSingleFieldElement, com.stripe.android.ui.core.elements.SectionFieldElement
    public void setRawValue(Map<IdentifierSpec, String> rawValuesMap) {
        s.g(rawValuesMap, "rawValuesMap");
    }

    public String toString() {
        return "CardNumberElement(_identifier=" + this._identifier + ", controller=" + getController() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.stripe.android.ui.core.elements.SectionSingleFieldElement
    public CardNumberController getController() {
        return this.controller;
    }
}