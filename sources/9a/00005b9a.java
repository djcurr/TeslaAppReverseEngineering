package com.stripe.android.ui.core.elements.menu;

import c1.i;
import c1.o0;
import h00.l;
import h00.p;
import kotlin.jvm.internal.u;
import l0.n0;
import o1.f;
import q0.g;
import t1.h1;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MenuKt$DropdownMenuContent$3 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ l<g, b0> $content;
    final /* synthetic */ n0<Boolean> $expandedStates;
    final /* synthetic */ int $initialFirstVisibleItemIndex;
    final /* synthetic */ f $modifier;
    final /* synthetic */ o0<h1> $transformOriginState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MenuKt$DropdownMenuContent$3(n0<Boolean> n0Var, o0<h1> o0Var, int i11, f fVar, l<? super g, b0> lVar, int i12, int i13) {
        super(2);
        this.$expandedStates = n0Var;
        this.$transformOriginState = o0Var;
        this.$initialFirstVisibleItemIndex = i11;
        this.$modifier = fVar;
        this.$content = lVar;
        this.$$changed = i12;
        this.$$default = i13;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        MenuKt.DropdownMenuContent(this.$expandedStates, this.$transformOriginState, this.$initialFirstVisibleItemIndex, this.$modifier, this.$content, iVar, this.$$changed | 1, this.$$default);
    }
}