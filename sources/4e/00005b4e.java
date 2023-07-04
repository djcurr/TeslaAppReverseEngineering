package com.stripe.android.ui.core.elements;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class SimpleDropdownElement extends SectionSingleFieldElement {
    public static final int $stable = 8;
    private final DropdownFieldController controller;
    private final IdentifierSpec identifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleDropdownElement(IdentifierSpec identifier, DropdownFieldController controller) {
        super(identifier, null);
        s.g(identifier, "identifier");
        s.g(controller, "controller");
        this.identifier = identifier;
        this.controller = controller;
    }

    public static /* synthetic */ SimpleDropdownElement copy$default(SimpleDropdownElement simpleDropdownElement, IdentifierSpec identifierSpec, DropdownFieldController dropdownFieldController, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = simpleDropdownElement.getIdentifier();
        }
        if ((i11 & 2) != 0) {
            dropdownFieldController = simpleDropdownElement.getController();
        }
        return simpleDropdownElement.copy(identifierSpec, dropdownFieldController);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final DropdownFieldController component2() {
        return getController();
    }

    public final SimpleDropdownElement copy(IdentifierSpec identifier, DropdownFieldController controller) {
        s.g(identifier, "identifier");
        s.g(controller, "controller");
        return new SimpleDropdownElement(identifier, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimpleDropdownElement) {
            SimpleDropdownElement simpleDropdownElement = (SimpleDropdownElement) obj;
            return s.c(getIdentifier(), simpleDropdownElement.getIdentifier()) && s.c(getController(), simpleDropdownElement.getController());
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
        return "SimpleDropdownElement(identifier=" + getIdentifier() + ", controller=" + getController() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.stripe.android.ui.core.elements.SectionSingleFieldElement
    public DropdownFieldController getController() {
        return this.controller;
    }
}