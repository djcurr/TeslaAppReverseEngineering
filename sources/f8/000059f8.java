package com.stripe.android.ui.core.elements;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class BsbElementUIKt$BsbElementUI$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ BsbElement $element;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ IdentifierSpec $lastTextFieldIdentifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BsbElementUIKt$BsbElementUI$2(boolean z11, BsbElement bsbElement, IdentifierSpec identifierSpec, int i11) {
        super(2);
        this.$enabled = z11;
        this.$element = bsbElement;
        this.$lastTextFieldIdentifier = identifierSpec;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        BsbElementUIKt.BsbElementUI(this.$enabled, this.$element, this.$lastTextFieldIdentifier, iVar, this.$$changed | 1);
    }
}