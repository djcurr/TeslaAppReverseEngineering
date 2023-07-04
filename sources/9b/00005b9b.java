package com.stripe.android.ui.core.elements.menu;

import c1.i;
import h00.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l0.a1;
import l0.c0;
import l0.c1;
import l0.j;

/* loaded from: classes6.dex */
final class MenuKt$DropdownMenuContent$alpha$2 extends u implements q<a1.b<Boolean>, i, Integer, c0<Float>> {
    public static final MenuKt$DropdownMenuContent$alpha$2 INSTANCE = new MenuKt$DropdownMenuContent$alpha$2();

    MenuKt$DropdownMenuContent$alpha$2() {
        super(3);
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ c0<Float> invoke(a1.b<Boolean> bVar, i iVar, Integer num) {
        return invoke(bVar, iVar, num.intValue());
    }

    public final c0<Float> invoke(a1.b<Boolean> animateFloat, i iVar, int i11) {
        c1 k11;
        s.g(animateFloat, "$this$animateFloat");
        iVar.x(-8440879);
        if (animateFloat.c(Boolean.FALSE, Boolean.TRUE)) {
            k11 = j.k(30, 0, null, 6, null);
        } else {
            k11 = j.k(75, 0, null, 6, null);
        }
        iVar.N();
        return k11;
    }
}