package com.stripe.android.ui.core.elements;

import c1.i;
import h00.p;
import java.util.List;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CardDetailsElementUIKt$CardDetailsElementUI$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ CardDetailsController $controller;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ List<IdentifierSpec> $hiddenIdentifiers;
    final /* synthetic */ IdentifierSpec $lastTextFieldIdentifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsElementUIKt$CardDetailsElementUI$2(boolean z11, CardDetailsController cardDetailsController, List<IdentifierSpec> list, IdentifierSpec identifierSpec, int i11) {
        super(2);
        this.$enabled = z11;
        this.$controller = cardDetailsController;
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
        CardDetailsElementUIKt.CardDetailsElementUI(this.$enabled, this.$controller, this.$hiddenIdentifiers, this.$lastTextFieldIdentifier, iVar, this.$$changed | 1);
    }
}