package com.stripe.android.ui.core.elements;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import o1.f;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class OTPElementUIKt$OTPElementUI$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ OTPElement $element;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ f $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPElementUIKt$OTPElementUI$2(boolean z11, OTPElement oTPElement, f fVar, int i11, int i12) {
        super(2);
        this.$enabled = z11;
        this.$element = oTPElement;
        this.$modifier = fVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        OTPElementUIKt.OTPElementUI(this.$enabled, this.$element, this.$modifier, iVar, this.$$changed | 1, this.$$default);
    }
}