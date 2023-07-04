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
public final class AuBecsDebitMandateTextElement extends FormElement {
    public static final int $stable = 8;
    private final InputController controller;
    private final IdentifierSpec identifier;
    private final String merchantName;

    public /* synthetic */ AuBecsDebitMandateTextElement(IdentifierSpec identifierSpec, String str, InputController inputController, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, str, (i11 & 4) != 0 ? null : inputController);
    }

    public static /* synthetic */ AuBecsDebitMandateTextElement copy$default(AuBecsDebitMandateTextElement auBecsDebitMandateTextElement, IdentifierSpec identifierSpec, String str, InputController inputController, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = auBecsDebitMandateTextElement.getIdentifier();
        }
        if ((i11 & 2) != 0) {
            str = auBecsDebitMandateTextElement.merchantName;
        }
        if ((i11 & 4) != 0) {
            inputController = auBecsDebitMandateTextElement.getController();
        }
        return auBecsDebitMandateTextElement.copy(identifierSpec, str, inputController);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final String component2() {
        return this.merchantName;
    }

    public final InputController component3() {
        return getController();
    }

    public final AuBecsDebitMandateTextElement copy(IdentifierSpec identifier, String str, InputController inputController) {
        s.g(identifier, "identifier");
        return new AuBecsDebitMandateTextElement(identifier, str, inputController);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuBecsDebitMandateTextElement) {
            AuBecsDebitMandateTextElement auBecsDebitMandateTextElement = (AuBecsDebitMandateTextElement) obj;
            return s.c(getIdentifier(), auBecsDebitMandateTextElement.getIdentifier()) && s.c(this.merchantName, auBecsDebitMandateTextElement.merchantName) && s.c(getController(), auBecsDebitMandateTextElement.getController());
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

    public int hashCode() {
        int hashCode = getIdentifier().hashCode() * 31;
        String str = this.merchantName;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (getController() != null ? getController().hashCode() : 0);
    }

    public String toString() {
        return "AuBecsDebitMandateTextElement(identifier=" + getIdentifier() + ", merchantName=" + ((Object) this.merchantName) + ", controller=" + getController() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuBecsDebitMandateTextElement(IdentifierSpec identifier, String str, InputController inputController) {
        super(null);
        s.g(identifier, "identifier");
        this.identifier = identifier;
        this.merchantName = str;
        this.controller = inputController;
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public InputController getController() {
        return this.controller;
    }
}