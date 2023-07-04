package com.stripe.android.ui.core.elements;

import c1.i;
import h00.p;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import s2.l;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class BsbElementUIKt$BsbElementUI$1$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ BsbElement $element;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ IdentifierSpec $lastTextFieldIdentifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BsbElementUIKt$BsbElementUI$1$2(BsbElement bsbElement, IdentifierSpec identifierSpec, boolean z11, int i11) {
        super(2);
        this.$element = bsbElement;
        this.$lastTextFieldIdentifier = identifierSpec;
        this.$enabled = z11;
        this.$$dirty = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        int d11;
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        TextFieldController controller = this.$element.getTextElement$payments_ui_core_release().getController();
        if (s.c(this.$lastTextFieldIdentifier, this.$element.getIdentifier())) {
            d11 = l.f50115b.b();
        } else {
            d11 = l.f50115b.d();
        }
        TextFieldUIKt.m477TextFieldPwfN4xk(controller, null, d11, this.$enabled, null, iVar, (this.$$dirty << 9) & 7168, 18);
    }
}