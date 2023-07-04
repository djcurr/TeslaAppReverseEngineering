package com.stripe.android.ui.core.elements.menu;

import c1.o0;
import c1.v1;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import t1.g0;
import t1.h1;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MenuKt$DropdownMenuContent$1$1 extends u implements l<g0, b0> {
    final /* synthetic */ v1<Float> $alpha$delegate;
    final /* synthetic */ v1<Float> $scale$delegate;
    final /* synthetic */ o0<h1> $transformOriginState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuContent$1$1(o0<h1> o0Var, v1<Float> v1Var, v1<Float> v1Var2) {
        super(1);
        this.$transformOriginState = o0Var;
        this.$scale$delegate = v1Var;
        this.$alpha$delegate = v1Var2;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(g0 g0Var) {
        invoke2(g0Var);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(g0 graphicsLayer) {
        float m502DropdownMenuContent$lambda1;
        float m502DropdownMenuContent$lambda12;
        float m503DropdownMenuContent$lambda3;
        s.g(graphicsLayer, "$this$graphicsLayer");
        m502DropdownMenuContent$lambda1 = MenuKt.m502DropdownMenuContent$lambda1(this.$scale$delegate);
        graphicsLayer.f(m502DropdownMenuContent$lambda1);
        m502DropdownMenuContent$lambda12 = MenuKt.m502DropdownMenuContent$lambda1(this.$scale$delegate);
        graphicsLayer.m(m502DropdownMenuContent$lambda12);
        m503DropdownMenuContent$lambda3 = MenuKt.m503DropdownMenuContent$lambda3(this.$alpha$delegate);
        graphicsLayer.b(m503DropdownMenuContent$lambda3);
        graphicsLayer.H(this.$transformOriginState.getValue().j());
    }
}