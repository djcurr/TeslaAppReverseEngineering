package com.stripe.android.ui.core.elements;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import o1.f;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SectionUIKt$SectionCard$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ p<i, Integer, b0> $content;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ f $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SectionUIKt$SectionCard$2(f fVar, boolean z11, p<? super i, ? super Integer, b0> pVar, int i11, int i12) {
        super(2);
        this.$modifier = fVar;
        this.$isSelected = z11;
        this.$content = pVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        SectionUIKt.SectionCard(this.$modifier, this.$isSelected, this.$content, iVar, this.$$changed | 1, this.$$default);
    }
}