package com.stripe.android.ui.core.elements;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j0;
import vz.p;
import wz.w;

/* loaded from: classes6.dex */
public final class EmptyFormElement extends FormElement {
    public static final int $stable = 8;
    private final Controller controller;
    private final IdentifierSpec identifier;

    public EmptyFormElement() {
        this(null, null, 3, null);
    }

    public /* synthetic */ EmptyFormElement(IdentifierSpec identifierSpec, Controller controller, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IdentifierSpec.Companion.Generic("empty_form") : identifierSpec, (i11 & 2) != 0 ? null : controller);
    }

    public static /* synthetic */ EmptyFormElement copy$default(EmptyFormElement emptyFormElement, IdentifierSpec identifierSpec, Controller controller, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = emptyFormElement.getIdentifier();
        }
        if ((i11 & 2) != 0) {
            controller = emptyFormElement.getController();
        }
        return emptyFormElement.copy(identifierSpec, controller);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final Controller component2() {
        return getController();
    }

    public final EmptyFormElement copy(IdentifierSpec identifier, Controller controller) {
        s.g(identifier, "identifier");
        return new EmptyFormElement(identifier, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmptyFormElement) {
            EmptyFormElement emptyFormElement = (EmptyFormElement) obj;
            return s.c(getIdentifier(), emptyFormElement.getIdentifier()) && s.c(getController(), emptyFormElement.getController());
        }
        return false;
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public Controller getController() {
        return this.controller;
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public e<List<p<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        List i11;
        i11 = w.i();
        return j0.a(i11);
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return (getIdentifier().hashCode() * 31) + (getController() == null ? 0 : getController().hashCode());
    }

    public String toString() {
        return "EmptyFormElement(identifier=" + getIdentifier() + ", controller=" + getController() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyFormElement(IdentifierSpec identifier, Controller controller) {
        super(null);
        s.g(identifier, "identifier");
        this.identifier = identifier;
        this.controller = controller;
    }
}