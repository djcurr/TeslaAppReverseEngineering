package com.stripe.android.ui.core.elements;

import c1.i;
import com.stripe.android.ui.core.PaymentsThemeKt;
import h00.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import n2.a0;
import o1.f;
import p0.c0;
import r2.l;
import vz.b0;
import x2.g;
import y0.h0;
import y0.o1;

/* renamed from: com.stripe.android.ui.core.elements.ComposableSingletons$AfterpayClearpayElementUIKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$AfterpayClearpayElementUIKt$lambda1$1 extends u implements q<c0, i, Integer, b0> {
    public static final ComposableSingletons$AfterpayClearpayElementUIKt$lambda1$1 INSTANCE = new ComposableSingletons$AfterpayClearpayElementUIKt$lambda1$1();

    ComposableSingletons$AfterpayClearpayElementUIKt$lambda1$1() {
        super(3);
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(c0 c0Var, i iVar, Integer num) {
        invoke(c0Var, iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(c0 TextButton, i iVar, int i11) {
        s.g(TextButton, "$this$TextButton");
        if (((i11 & 81) ^ 16) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        o1.b("ⓘ", p0.u.h(f.f42062f1, g.f(0)), PaymentsThemeKt.getPaymentsColors(h0.f58131a, iVar, 8).m386getSubtitle0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, new a0(0L, 0L, l.f49091b.a(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262139, null), iVar, 54, 0, 32760);
    }
}