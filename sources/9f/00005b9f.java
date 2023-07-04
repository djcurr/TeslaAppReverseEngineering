package com.stripe.android.ui.core.elements.menu;

import c1.i;
import h00.a;
import h00.p;
import h00.q;
import kotlin.jvm.internal.u;
import o0.m;
import o1.f;
import p0.c0;
import p0.w;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MenuKt$DropdownMenuItemContent$3 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ q<c0, i, Integer, b0> $content;
    final /* synthetic */ w $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ m $interactionSource;
    final /* synthetic */ f $modifier;
    final /* synthetic */ a<b0> $onClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MenuKt$DropdownMenuItemContent$3(a<b0> aVar, f fVar, boolean z11, w wVar, m mVar, q<? super c0, ? super i, ? super Integer, b0> qVar, int i11, int i12) {
        super(2);
        this.$onClick = aVar;
        this.$modifier = fVar;
        this.$enabled = z11;
        this.$contentPadding = wVar;
        this.$interactionSource = mVar;
        this.$content = qVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        MenuKt.DropdownMenuItemContent(this.$onClick, this.$modifier, this.$enabled, this.$contentPadding, this.$interactionSource, this.$content, iVar, this.$$changed | 1, this.$$default);
    }
}