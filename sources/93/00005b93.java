package com.stripe.android.ui.core.elements.menu;

import c1.i;
import h00.l;
import h00.p;
import kotlin.jvm.internal.u;
import o1.f;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CheckboxKt$Checkbox$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ f $modifier;
    final /* synthetic */ l<Boolean, b0> $onCheckedChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckboxKt$Checkbox$1(boolean z11, l<? super Boolean, b0> lVar, f fVar, boolean z12, int i11, int i12) {
        super(2);
        this.$checked = z11;
        this.$onCheckedChange = lVar;
        this.$modifier = fVar;
        this.$enabled = z12;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        CheckboxKt.Checkbox(this.$checked, this.$onCheckedChange, this.$modifier, this.$enabled, iVar, this.$$changed | 1, this.$$default);
    }
}