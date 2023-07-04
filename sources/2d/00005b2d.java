package com.stripe.android.ui.core.elements;

import c1.i;
import h00.p;
import java.util.List;
import kotlin.jvm.internal.u;
import o1.f;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SectionFieldElementUIKt$SectionFieldElementUI$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ SectionFieldElement $field;
    final /* synthetic */ List<IdentifierSpec> $hiddenIdentifiers;
    final /* synthetic */ IdentifierSpec $lastTextFieldIdentifier;
    final /* synthetic */ f $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionFieldElementUIKt$SectionFieldElementUI$1(boolean z11, SectionFieldElement sectionFieldElement, f fVar, List<IdentifierSpec> list, IdentifierSpec identifierSpec, int i11, int i12) {
        super(2);
        this.$enabled = z11;
        this.$field = sectionFieldElement;
        this.$modifier = fVar;
        this.$hiddenIdentifiers = list;
        this.$lastTextFieldIdentifier = identifierSpec;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        SectionFieldElementUIKt.SectionFieldElementUI(this.$enabled, this.$field, this.$modifier, this.$hiddenIdentifiers, this.$lastTextFieldIdentifier, iVar, this.$$changed | 1, this.$$default);
    }
}