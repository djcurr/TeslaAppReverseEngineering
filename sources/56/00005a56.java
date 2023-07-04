package com.stripe.android.ui.core.elements;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class CvcElement extends SectionSingleFieldElement {
    private final IdentifierSpec _identifier;
    private final CvcController controller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CvcElement(IdentifierSpec _identifier, CvcController controller) {
        super(_identifier, null);
        s.g(_identifier, "_identifier");
        s.g(controller, "controller");
        this._identifier = _identifier;
        this.controller = controller;
    }

    public static /* synthetic */ CvcElement copy$default(CvcElement cvcElement, IdentifierSpec identifierSpec, CvcController cvcController, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = cvcElement._identifier;
        }
        if ((i11 & 2) != 0) {
            cvcController = cvcElement.getController();
        }
        return cvcElement.copy(identifierSpec, cvcController);
    }

    public final IdentifierSpec component1() {
        return this._identifier;
    }

    public final CvcController component2() {
        return getController();
    }

    public final CvcElement copy(IdentifierSpec _identifier, CvcController controller) {
        s.g(_identifier, "_identifier");
        s.g(controller, "controller");
        return new CvcElement(_identifier, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CvcElement) {
            CvcElement cvcElement = (CvcElement) obj;
            return s.c(this._identifier, cvcElement._identifier) && s.c(getController(), cvcElement.getController());
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
        return "CvcElement(_identifier=" + this._identifier + ", controller=" + getController() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.stripe.android.ui.core.elements.SectionSingleFieldElement
    public CvcController getController() {
        return this.controller;
    }
}