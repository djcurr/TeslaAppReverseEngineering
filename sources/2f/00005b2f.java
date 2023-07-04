package com.stripe.android.ui.core.elements;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public abstract class SectionMultiFieldElement implements SectionFieldElement {
    public static final int $stable = 0;
    private final IdentifierSpec identifier;

    private SectionMultiFieldElement(IdentifierSpec identifierSpec) {
        this.identifier = identifierSpec;
    }

    public /* synthetic */ SectionMultiFieldElement(IdentifierSpec identifierSpec, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec);
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }
}