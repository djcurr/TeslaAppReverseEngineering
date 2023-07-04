package com.stripe.android.ui.core.elements;

import c1.i;
import h00.p;
import java.util.List;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SectionElementUIKt$SectionElementUI$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ SectionElement $element;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ List<IdentifierSpec> $hiddenIdentifiers;
    final /* synthetic */ IdentifierSpec $lastTextFieldIdentifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionElementUIKt$SectionElementUI$2(boolean z11, SectionElement sectionElement, List<IdentifierSpec> list, IdentifierSpec identifierSpec, int i11) {
        super(2);
        this.$enabled = z11;
        this.$element = sectionElement;
        this.$hiddenIdentifiers = list;
        this.$lastTextFieldIdentifier = identifierSpec;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        SectionElementUIKt.SectionElementUI(this.$enabled, this.$element, this.$hiddenIdentifiers, this.$lastTextFieldIdentifier, iVar, this.$$changed | 1);
    }
}