package com.stripe.android.link.ui.forms;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.g1;
import c1.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.theme.ThemeKt;
import f2.z;
import h00.q;
import h2.a;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import o1.a;
import o1.f;
import p0.a;
import p0.d0;
import p0.e0;
import p0.i;
import vz.b0;
import x2.d;
import x2.g;
import y0.h0;
import y0.s0;

/* renamed from: com.stripe.android.link.ui.forms.ComposableSingletons$FormUIKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$FormUIKt$lambda1$1 extends u implements q<i, c1.i, Integer, b0> {
    public static final ComposableSingletons$FormUIKt$lambda1$1 INSTANCE = new ComposableSingletons$FormUIKt$lambda1$1();

    ComposableSingletons$FormUIKt$lambda1$1() {
        super(3);
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, c1.i iVar2, Integer num) {
        invoke(iVar, iVar2, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i FormUI, c1.i iVar, int i11) {
        s.g(FormUI, "$this$FormUI");
        if (((i11 & 81) ^ 16) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        f.a aVar = f.f42062f1;
        f n11 = e0.n(e0.o(aVar, g.f(100)), BitmapDescriptorFactory.HUE_RED, 1, null);
        a.c g11 = a.f42039a.g();
        a.e b11 = p0.a.f45228a.b();
        iVar.x(-1989997165);
        z b12 = p0.b0.b(b11, g11, iVar, 54);
        iVar.x(1376089394);
        d dVar = (d) iVar.A(l0.d());
        x2.q qVar = (x2.q) iVar.A(l0.i());
        y1 y1Var = (y1) iVar.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a11 = c0551a.a();
        q<g1<h2.a>, c1.i, Integer, b0> b13 = f2.u.b(n11);
        if (!(iVar.k() instanceof e)) {
            h.c();
        }
        iVar.D();
        if (iVar.f()) {
            iVar.s(a11);
        } else {
            iVar.o();
        }
        iVar.E();
        c1.i a12 = a2.a(iVar);
        a2.c(a12, b12, c0551a.d());
        a2.c(a12, dVar, c0551a.b());
        a2.c(a12, qVar, c0551a.c());
        a2.c(a12, y1Var, c0551a.f());
        iVar.c();
        b13.invoke(g1.a(g1.b(iVar)), iVar, 0);
        iVar.x(2058660585);
        iVar.x(-326682362);
        d0 d0Var = d0.f45271a;
        s0.a(e0.v(aVar, g.f(24)), ThemeKt.getLinkColors(h0.f58131a, iVar, 8).m187getButtonLabel0d7_KjU(), g.f(2), iVar, 390, 0);
        iVar.N();
        iVar.N();
        iVar.q();
        iVar.N();
        iVar.N();
    }
}