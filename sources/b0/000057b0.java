package com.stripe.android.paymentsheet.ui;

import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PrimaryButtonKt$LabelUI$2 extends u implements h00.p<c1.i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonKt$LabelUI$2(String str, int i11) {
        super(2);
        this.$label = str;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(c1.i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(c1.i iVar, int i11) {
        PrimaryButtonKt.LabelUI(this.$label, iVar, this.$$changed | 1);
    }
}