package com.stripe.android.ui.core.elements;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class SimpleTextElement extends SectionSingleFieldElement {
    public static final int $stable = 8;
    private final TextFieldController controller;
    private final IdentifierSpec identifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleTextElement(IdentifierSpec identifier, TextFieldController controller) {
        super(identifier, null);
        s.g(identifier, "identifier");
        s.g(controller, "controller");
        this.identifier = identifier;
        this.controller = controller;
    }

    public static /* synthetic */ SimpleTextElement copy$default(SimpleTextElement simpleTextElement, IdentifierSpec identifierSpec, TextFieldController textFieldController, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = simpleTextElement.getIdentifier();
        }
        if ((i11 & 2) != 0) {
            textFieldController = simpleTextElement.getController();
        }
        return simpleTextElement.copy(identifierSpec, textFieldController);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final TextFieldController component2() {
        return getController();
    }

    public final SimpleTextElement copy(IdentifierSpec identifier, TextFieldController controller) {
        s.g(identifier, "identifier");
        s.g(controller, "controller");
        return new SimpleTextElement(identifier, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimpleTextElement) {
            SimpleTextElement simpleTextElement = (SimpleTextElement) obj;
            return s.c(getIdentifier(), simpleTextElement.getIdentifier()) && s.c(getController(), simpleTextElement.getController());
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
        return "SimpleTextElement(identifier=" + getIdentifier() + ", controller=" + getController() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.stripe.android.ui.core.elements.SectionSingleFieldElement
    public TextFieldController getController() {
        return this.controller;
    }
}