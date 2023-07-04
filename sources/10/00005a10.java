package com.stripe.android.ui.core.elements;

import android.content.Context;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import vz.p;

/* loaded from: classes6.dex */
public final class CardDetailsSectionElement extends FormElement {
    public static final int $stable = 8;
    private final Context context;
    private final CardDetailsSectionController controller;
    private final IdentifierSpec identifier;

    public /* synthetic */ CardDetailsSectionElement(Context context, Map map, Set set, IdentifierSpec identifierSpec, CardDetailsSectionController cardDetailsSectionController, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, map, set, identifierSpec, (i11 & 16) != 0 ? new CardDetailsSectionController(context, map, set) : cardDetailsSectionController);
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public e<List<p<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        return getController().getCardDetailsElement$payments_ui_core_release().getFormFieldValueFlow();
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public e<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return getController().getCardDetailsElement$payments_ui_core_release().getTextFieldIdentifiers();
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public CardDetailsSectionController getController() {
        return this.controller;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsSectionElement(Context context, Map<IdentifierSpec, String> initialValues, Set<IdentifierSpec> viewOnlyFields, IdentifierSpec identifier, CardDetailsSectionController controller) {
        super(null);
        s.g(context, "context");
        s.g(initialValues, "initialValues");
        s.g(viewOnlyFields, "viewOnlyFields");
        s.g(identifier, "identifier");
        s.g(controller, "controller");
        this.context = context;
        this.identifier = identifier;
        this.controller = controller;
    }
}