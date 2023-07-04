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
public final class AffirmHeaderElement extends FormElement {
    public static final int $stable = 8;
    private final Controller controller;
    private final IdentifierSpec identifier;

    public /* synthetic */ AffirmHeaderElement(IdentifierSpec identifierSpec, Controller controller, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, (i11 & 2) != 0 ? null : controller);
    }

    public static /* synthetic */ AffirmHeaderElement copy$default(AffirmHeaderElement affirmHeaderElement, IdentifierSpec identifierSpec, Controller controller, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = affirmHeaderElement.getIdentifier();
        }
        if ((i11 & 2) != 0) {
            controller = affirmHeaderElement.getController();
        }
        return affirmHeaderElement.copy(identifierSpec, controller);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final Controller component2() {
        return getController();
    }

    public final AffirmHeaderElement copy(IdentifierSpec identifier, Controller controller) {
        s.g(identifier, "identifier");
        return new AffirmHeaderElement(identifier, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AffirmHeaderElement) {
            AffirmHeaderElement affirmHeaderElement = (AffirmHeaderElement) obj;
            return s.c(getIdentifier(), affirmHeaderElement.getIdentifier()) && s.c(getController(), affirmHeaderElement.getController());
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
        return "AffirmHeaderElement(identifier=" + getIdentifier() + ", controller=" + getController() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AffirmHeaderElement(IdentifierSpec identifier, Controller controller) {
        super(null);
        s.g(identifier, "identifier");
        this.identifier = identifier;
        this.controller = controller;
    }
}