package com.stripe.android.ui.core.elements;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class AuBecsDebitMandateElementUIKt$AuBecsDebitMandateElementUI$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AuBecsDebitMandateTextElement $element;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuBecsDebitMandateElementUIKt$AuBecsDebitMandateElementUI$1(AuBecsDebitMandateTextElement auBecsDebitMandateTextElement, int i11) {
        super(2);
        this.$element = auBecsDebitMandateTextElement;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        AuBecsDebitMandateElementUIKt.AuBecsDebitMandateElementUI(this.$element, iVar, this.$$changed | 1);
    }
}