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
public final class MandateTextElement extends FormElement {
    public static final int $stable = 8;
    private final InputController controller;
    private final IdentifierSpec identifier;
    private final String merchantName;
    private final int stringResId;

    public /* synthetic */ MandateTextElement(IdentifierSpec identifierSpec, int i11, String str, InputController inputController, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, i11, str, (i12 & 8) != 0 ? null : inputController);
    }

    public static /* synthetic */ MandateTextElement copy$default(MandateTextElement mandateTextElement, IdentifierSpec identifierSpec, int i11, String str, InputController inputController, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            identifierSpec = mandateTextElement.getIdentifier();
        }
        if ((i12 & 2) != 0) {
            i11 = mandateTextElement.stringResId;
        }
        if ((i12 & 4) != 0) {
            str = mandateTextElement.merchantName;
        }
        if ((i12 & 8) != 0) {
            inputController = mandateTextElement.getController();
        }
        return mandateTextElement.copy(identifierSpec, i11, str, inputController);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final int component2() {
        return this.stringResId;
    }

    public final String component3() {
        return this.merchantName;
    }

    public final InputController component4() {
        return getController();
    }

    public final MandateTextElement copy(IdentifierSpec identifier, int i11, String str, InputController inputController) {
        s.g(identifier, "identifier");
        return new MandateTextElement(identifier, i11, str, inputController);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MandateTextElement) {
            MandateTextElement mandateTextElement = (MandateTextElement) obj;
            return s.c(getIdentifier(), mandateTextElement.getIdentifier()) && this.stringResId == mandateTextElement.stringResId && s.c(this.merchantName, mandateTextElement.merchantName) && s.c(getController(), mandateTextElement.getController());
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

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final int getStringResId() {
        return this.stringResId;
    }

    public int hashCode() {
        int hashCode = ((getIdentifier().hashCode() * 31) + Integer.hashCode(this.stringResId)) * 31;
        String str = this.merchantName;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (getController() != null ? getController().hashCode() : 0);
    }

    public String toString() {
        return "MandateTextElement(identifier=" + getIdentifier() + ", stringResId=" + this.stringResId + ", merchantName=" + ((Object) this.merchantName) + ", controller=" + getController() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MandateTextElement(IdentifierSpec identifier, int i11, String str, InputController inputController) {
        super(null);
        s.g(identifier, "identifier");
        this.identifier = identifier;
        this.stringResId = i11;
        this.merchantName = str;
        this.controller = inputController;
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public InputController getController() {
        return this.controller;
    }
}