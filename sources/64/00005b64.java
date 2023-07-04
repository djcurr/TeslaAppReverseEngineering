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
public final class StaticTextElement extends FormElement {
    public static final int $stable = 8;
    private final InputController controller;
    private final IdentifierSpec identifier;
    private final int stringResId;

    public /* synthetic */ StaticTextElement(IdentifierSpec identifierSpec, int i11, InputController inputController, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, i11, (i12 & 4) != 0 ? null : inputController);
    }

    public static /* synthetic */ StaticTextElement copy$default(StaticTextElement staticTextElement, IdentifierSpec identifierSpec, int i11, InputController inputController, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            identifierSpec = staticTextElement.getIdentifier();
        }
        if ((i12 & 2) != 0) {
            i11 = staticTextElement.stringResId;
        }
        if ((i12 & 4) != 0) {
            inputController = staticTextElement.getController();
        }
        return staticTextElement.copy(identifierSpec, i11, inputController);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final int component2() {
        return this.stringResId;
    }

    public final InputController component3() {
        return getController();
    }

    public final StaticTextElement copy(IdentifierSpec identifier, int i11, InputController inputController) {
        s.g(identifier, "identifier");
        return new StaticTextElement(identifier, i11, inputController);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StaticTextElement) {
            StaticTextElement staticTextElement = (StaticTextElement) obj;
            return s.c(getIdentifier(), staticTextElement.getIdentifier()) && this.stringResId == staticTextElement.stringResId && s.c(getController(), staticTextElement.getController());
        }
        return false;
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

    public final int getStringResId() {
        return this.stringResId;
    }

    public int hashCode() {
        return (((getIdentifier().hashCode() * 31) + Integer.hashCode(this.stringResId)) * 31) + (getController() == null ? 0 : getController().hashCode());
    }

    public String toString() {
        return "StaticTextElement(identifier=" + getIdentifier() + ", stringResId=" + this.stringResId + ", controller=" + getController() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticTextElement(IdentifierSpec identifier, int i11, InputController inputController) {
        super(null);
        s.g(identifier, "identifier");
        this.identifier = identifier;
        this.stringResId = i11;
        this.controller = inputController;
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public InputController getController() {
        return this.controller;
    }
}