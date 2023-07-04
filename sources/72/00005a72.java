package com.stripe.android.ui.core.elements;

import c1.i;
import h00.a;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class DropdownFieldUIKt$DropdownMenuItem$4 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $currentTextColor;
    final /* synthetic */ String $displayValue;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ a<b0> $onClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownFieldUIKt$DropdownMenuItem$4(String str, boolean z11, long j11, a<b0> aVar, int i11, int i12) {
        super(2);
        this.$displayValue = str;
        this.$isSelected = z11;
        this.$currentTextColor = j11;
        this.$onClick = aVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        DropdownFieldUIKt.m440DropdownMenuItemcf5BqRc(this.$displayValue, this.$isSelected, this.$currentTextColor, this.$onClick, iVar, this.$$changed | 1, this.$$default);
    }
}