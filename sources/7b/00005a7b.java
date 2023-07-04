package com.stripe.android.ui.core.elements;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class EmailElement extends SectionSingleFieldElement {
    public static final int $stable = 8;
    private final TextFieldController controller;
    private final IdentifierSpec identifier;
    private final String initialValue;

    public EmailElement() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ EmailElement(com.stripe.android.ui.core.elements.IdentifierSpec r7, java.lang.String r8, com.stripe.android.ui.core.elements.TextFieldController r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r6 = this;
            r11 = r10 & 1
            if (r11 == 0) goto La
            com.stripe.android.ui.core.elements.IdentifierSpec$Companion r7 = com.stripe.android.ui.core.elements.IdentifierSpec.Companion
            com.stripe.android.ui.core.elements.IdentifierSpec r7 = r7.getEmail()
        La:
            r11 = r10 & 2
            if (r11 == 0) goto L10
            java.lang.String r8 = ""
        L10:
            r10 = r10 & 4
            if (r10 == 0) goto L23
            com.stripe.android.ui.core.elements.SimpleTextFieldController r9 = new com.stripe.android.ui.core.elements.SimpleTextFieldController
            com.stripe.android.ui.core.elements.EmailConfig r1 = new com.stripe.android.ui.core.elements.EmailConfig
            r1.<init>()
            r2 = 0
            r4 = 2
            r5 = 0
            r0 = r9
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
        L23:
            r6.<init>(r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.EmailElement.<init>(com.stripe.android.ui.core.elements.IdentifierSpec, java.lang.String, com.stripe.android.ui.core.elements.TextFieldController, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ EmailElement copy$default(EmailElement emailElement, IdentifierSpec identifierSpec, String str, TextFieldController textFieldController, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = emailElement.getIdentifier();
        }
        if ((i11 & 2) != 0) {
            str = emailElement.initialValue;
        }
        if ((i11 & 4) != 0) {
            textFieldController = emailElement.getController();
        }
        return emailElement.copy(identifierSpec, str, textFieldController);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final String component2() {
        return this.initialValue;
    }

    public final TextFieldController component3() {
        return getController();
    }

    public final EmailElement copy(IdentifierSpec identifier, String str, TextFieldController controller) {
        s.g(identifier, "identifier");
        s.g(controller, "controller");
        return new EmailElement(identifier, str, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmailElement) {
            EmailElement emailElement = (EmailElement) obj;
            return s.c(getIdentifier(), emailElement.getIdentifier()) && s.c(this.initialValue, emailElement.initialValue) && s.c(getController(), emailElement.getController());
        }
        return false;
    }

    @Override // com.stripe.android.ui.core.elements.SectionSingleFieldElement, com.stripe.android.ui.core.elements.SectionFieldElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    public final String getInitialValue() {
        return this.initialValue;
    }

    public int hashCode() {
        int hashCode = getIdentifier().hashCode() * 31;
        String str = this.initialValue;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + getController().hashCode();
    }

    public String toString() {
        return "EmailElement(identifier=" + getIdentifier() + ", initialValue=" + ((Object) this.initialValue) + ", controller=" + getController() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.stripe.android.ui.core.elements.SectionSingleFieldElement
    public TextFieldController getController() {
        return this.controller;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailElement(IdentifierSpec identifier, String str, TextFieldController controller) {
        super(identifier, null);
        s.g(identifier, "identifier");
        s.g(controller, "controller");
        this.identifier = identifier;
        this.initialValue = str;
        this.controller = controller;
    }
}