package com.stripe.android.ui.core.elements;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class IbanElement extends SectionSingleFieldElement {
    private final TextFieldController controller;
    private final IdentifierSpec identifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IbanElement(IdentifierSpec identifier, TextFieldController controller) {
        super(identifier, null);
        s.g(identifier, "identifier");
        s.g(controller, "controller");
        this.identifier = identifier;
        this.controller = controller;
    }

    public static /* synthetic */ IbanElement copy$default(IbanElement ibanElement, IdentifierSpec identifierSpec, TextFieldController textFieldController, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = ibanElement.getIdentifier();
        }
        if ((i11 & 2) != 0) {
            textFieldController = ibanElement.getController();
        }
        return ibanElement.copy(identifierSpec, textFieldController);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final TextFieldController component2() {
        return getController();
    }

    public final IbanElement copy(IdentifierSpec identifier, TextFieldController controller) {
        s.g(identifier, "identifier");
        s.g(controller, "controller");
        return new IbanElement(identifier, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IbanElement) {
            IbanElement ibanElement = (IbanElement) obj;
            return s.c(getIdentifier(), ibanElement.getIdentifier()) && s.c(getController(), ibanElement.getController());
        }
        return false;
    }

    @Override // com.stripe.android.ui.core.elements.SectionSingleFieldElement, com.stripe.android.ui.core.elements.SectionFieldElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return (getIdentifier().hashCode() * 31) + getController().hashCode();
    }

    public String toString() {
        return "IbanElement(identifier=" + getIdentifier() + ", controller=" + getController() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.stripe.android.ui.core.elements.SectionSingleFieldElement
    public TextFieldController getController() {
        return this.controller;
    }
}