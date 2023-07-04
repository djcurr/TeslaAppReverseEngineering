package com.stripe.android.link;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.g1;
import c1.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.z;
import h00.q;
import h2.a;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import o1.a;
import o1.f;
import p0.c;
import p0.e0;
import p0.i;
import vz.b0;
import x2.d;
import x2.g;

/* renamed from: com.stripe.android.link.ComposableSingletons$LinkActivityKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$LinkActivityKt$lambda1$1 extends u implements q<i, c1.i, Integer, b0> {
    public static final ComposableSingletons$LinkActivityKt$lambda1$1 INSTANCE = new ComposableSingletons$LinkActivityKt$lambda1$1();

    ComposableSingletons$LinkActivityKt$lambda1$1() {
        super(3);
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, c1.i iVar2, Integer num) {
        invoke(iVar, iVar2, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, c1.i iVar2, int i11) {
        s.g(iVar, "$this$null");
        if (((i11 & 81) ^ 16) == 0 && iVar2.i()) {
            iVar2.G();
            return;
        }
        f h11 = e0.h(f.f42062f1, BitmapDescriptorFactory.HUE_RED, g.f(1), 1, null);
        iVar2.x(-1990474327);
        z i12 = c.i(a.f42039a.k(), false, iVar2, 0);
        iVar2.x(1376089394);
        d dVar = (d) iVar2.A(l0.d());
        x2.q qVar = (x2.q) iVar2.A(l0.i());
        y1 y1Var = (y1) iVar2.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a11 = c0551a.a();
        q<g1<h2.a>, c1.i, Integer, b0> b11 = f2.u.b(h11);
        if (!(iVar2.k() instanceof e)) {
            h.c();
        }
        iVar2.D();
        if (iVar2.f()) {
            iVar2.s(a11);
        } else {
            iVar2.o();
        }
        iVar2.E();
        c1.i a12 = a2.a(iVar2);
        a2.c(a12, i12, c0551a.d());
        a2.c(a12, dVar, c0551a.b());
        a2.c(a12, qVar, c0551a.c());
        a2.c(a12, y1Var, c0551a.f());
        iVar2.c();
        b11.invoke(g1.a(g1.b(iVar2)), iVar2, 0);
        iVar2.x(2058660585);
        iVar2.x(-1253629305);
        p0.d dVar2 = p0.d.f45270a;
        iVar2.N();
        iVar2.N();
        iVar2.q();
        iVar2.N();
        iVar2.N();
    }
}