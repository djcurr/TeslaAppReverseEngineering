package com.stripe.android.ui.core.elements;

import android.content.Context;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.j0;
import vz.p;
import wz.w;

/* loaded from: classes6.dex */
public final class CardDetailsElement extends SectionMultiFieldElement {
    private final CardDetailsController controller;
    private final boolean isCardScanEnabled;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CardDetailsElement(com.stripe.android.ui.core.elements.IdentifierSpec r7, android.content.Context r8, java.util.Map r9, java.util.Set r10, com.stripe.android.ui.core.elements.CardDetailsController r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 8
            if (r13 == 0) goto L8
            java.util.Set r10 = wz.v0.d()
        L8:
            r4 = r10
            r10 = r12 & 16
            if (r10 == 0) goto L1c
            com.stripe.android.ui.core.elements.CardDetailsController r11 = new com.stripe.android.ui.core.elements.CardDetailsController
            com.stripe.android.ui.core.elements.IdentifierSpec$Companion r10 = com.stripe.android.ui.core.elements.IdentifierSpec.Companion
            com.stripe.android.ui.core.elements.IdentifierSpec r10 = r10.getCardNumber()
            boolean r10 = r4.contains(r10)
            r11.<init>(r8, r9, r10)
        L1c:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.CardDetailsElement.<init>(com.stripe.android.ui.core.elements.IdentifierSpec, android.content.Context, java.util.Map, java.util.Set, com.stripe.android.ui.core.elements.CardDetailsController, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final CardDetailsController getController() {
        return this.controller;
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public e<List<p<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        return g.j(this.controller.getNumberElement().getController().getFormFieldValue(), this.controller.getCvcElement().getController().getFormFieldValue(), this.controller.getExpirationDateElement().getController().getFormFieldValue(), this.controller.getNumberElement().getController().getCardBrandFlow(), new CardDetailsElement$getFormFieldValueFlow$1(this, null));
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public e<List<IdentifierSpec>> getTextFieldIdentifiers() {
        List l11;
        l11 = w.l(this.controller.getNumberElement().getIdentifier(), this.controller.getExpirationDateElement().getIdentifier(), this.controller.getCvcElement().getIdentifier());
        return j0.a(l11);
    }

    public final boolean isCardScanEnabled() {
        return this.isCardScanEnabled;
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public SectionFieldErrorController sectionFieldErrorController() {
        return this.controller;
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public void setRawValue(Map<IdentifierSpec, String> rawValuesMap) {
        s.g(rawValuesMap, "rawValuesMap");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsElement(IdentifierSpec identifier, Context context, Map<IdentifierSpec, String> initialValues, Set<IdentifierSpec> viewOnlyFields, CardDetailsController controller) {
        super(identifier, null);
        s.g(identifier, "identifier");
        s.g(context, "context");
        s.g(initialValues, "initialValues");
        s.g(viewOnlyFields, "viewOnlyFields");
        s.g(controller, "controller");
        this.controller = controller;
        this.isCardScanEnabled = controller.getNumberElement().getController().getCardScanEnabled();
    }
}