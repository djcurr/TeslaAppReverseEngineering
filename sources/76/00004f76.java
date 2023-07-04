package com.stripe.android.link.ui;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.e1;
import c1.g1;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.R;
import com.stripe.android.link.theme.ThemeKt;
import f2.z;
import h00.a;
import h2.a;
import kotlin.jvm.internal.s;
import o1.a;
import o1.f;
import p0.a;
import p0.c;
import p0.c0;
import p0.d0;
import p0.e0;
import p0.h;
import p0.j;
import p0.u;
import vz.b0;
import w1.b;
import x2.d;
import x2.g;
import x2.q;
import y0.h0;

/* loaded from: classes6.dex */
public final class LinkAppBarKt {
    public static final void LinkAppBar(i iVar, int i11) {
        i h11 = iVar.h(-1701800081);
        if (i11 == 0 && h11.i()) {
            h11.G();
        } else {
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkAppBarKt.INSTANCE.m199getLambda2$link_release(), h11, 48, 1);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new LinkAppBarKt$LinkAppBar$1(i11));
    }

    public static final void LinkAppBar(String str, a<b0> onCloseButtonClick, i iVar, int i11) {
        int i12;
        i iVar2;
        s.g(onCloseButtonClick, "onCloseButtonClick");
        i h11 = iVar.h(-1701799858);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(onCloseButtonClick) ? 32 : 16;
        }
        if (((i12 & 91) ^ 18) == 0 && h11.i()) {
            h11.G();
            iVar2 = h11;
        } else {
            f.a aVar = f.f42062f1;
            f h12 = e0.h(u.j(e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null), g.f(20), BitmapDescriptorFactory.HUE_RED, 2, null), BitmapDescriptorFactory.HUE_RED, ThemeKt.getAppBarHeight(), 1, null);
            h11.x(-1113030915);
            p0.a aVar2 = p0.a.f45228a;
            a.k h13 = aVar2.h();
            a.C0826a c0826a = o1.a.f42039a;
            z a11 = h.a(h13, c0826a.h(), h11, 0);
            h11.x(1376089394);
            d dVar = (d) h11.A(l0.d());
            q qVar = (q) h11.A(l0.i());
            y1 y1Var = (y1) h11.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a12 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b11 = f2.u.b(h12);
            if (!(h11.k() instanceof e)) {
                c1.h.c();
            }
            h11.D();
            if (h11.f()) {
                h11.s(a12);
            } else {
                h11.o();
            }
            h11.E();
            i a13 = a2.a(h11);
            a2.c(a13, a11, c0551a.d());
            a2.c(a13, dVar, c0551a.b());
            a2.c(a13, qVar, c0551a.c());
            a2.c(a13, y1Var, c0551a.f());
            h11.c();
            b11.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(276693625);
            j jVar = j.f45341a;
            f l11 = u.l(e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, g.f(18), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            a.e b12 = aVar2.b();
            a.c g11 = c0826a.g();
            h11.x(-1989997165);
            z b13 = p0.b0.b(b12, g11, h11, 54);
            h11.x(1376089394);
            d dVar2 = (d) h11.A(l0.d());
            q qVar2 = (q) h11.A(l0.i());
            y1 y1Var2 = (y1) h11.A(l0.m());
            h00.a<h2.a> a14 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b14 = f2.u.b(l11);
            if (!(h11.k() instanceof e)) {
                c1.h.c();
            }
            h11.D();
            if (h11.f()) {
                h11.s(a14);
            } else {
                h11.o();
            }
            h11.E();
            i a15 = a2.a(h11);
            a2.c(a15, b13, c0551a.d());
            a2.c(a15, dVar2, c0551a.b());
            a2.c(a15, qVar2, c0551a.c());
            a2.c(a15, y1Var2, c0551a.f());
            h11.c();
            b14.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-326682362);
            d0 d0Var = d0.f45271a;
            f e11 = m0.h.e(e0.z(aVar, ThemeKt.getCloseIconWidth()), false, null, null, onCloseButtonClick, 7, null);
            o1.a d11 = c0826a.d();
            h11.x(-1990474327);
            z i13 = c.i(d11, false, h11, 6);
            h11.x(1376089394);
            d dVar3 = (d) h11.A(l0.d());
            q qVar3 = (q) h11.A(l0.i());
            y1 y1Var3 = (y1) h11.A(l0.m());
            h00.a<h2.a> a16 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b15 = f2.u.b(e11);
            if (!(h11.k() instanceof e)) {
                c1.h.c();
            }
            h11.D();
            if (h11.f()) {
                h11.s(a16);
            } else {
                h11.o();
            }
            h11.E();
            i a17 = a2.a(h11);
            a2.c(a17, i13, c0551a.d());
            a2.c(a17, dVar3, c0551a.b());
            a2.c(a17, qVar3, c0551a.c());
            a2.c(a17, y1Var3, c0551a.f());
            h11.c();
            b15.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-1253629305);
            p0.d dVar4 = p0.d.f45270a;
            b c11 = k2.c.c(R.drawable.ic_link_close, h11, 0);
            String b16 = k2.e.b(R.string.close, h11, 0);
            h0 h0Var = h0.f58131a;
            iVar2 = h11;
            y0.d0.a(c11, b16, null, ThemeKt.getLinkColors(h0Var, h11, 8).m188getCloseButton0d7_KjU(), h11, 8, 4);
            iVar2.N();
            iVar2.N();
            iVar2.q();
            iVar2.N();
            iVar2.N();
            f a18 = c0.a.a(d0Var, aVar, 1.0f, false, 2, null);
            a.b f11 = c0826a.f();
            iVar2.x(-1113030915);
            z a19 = h.a(aVar2.h(), f11, iVar2, 48);
            iVar2.x(1376089394);
            d dVar5 = (d) iVar2.A(l0.d());
            q qVar4 = (q) iVar2.A(l0.i());
            y1 y1Var4 = (y1) iVar2.A(l0.m());
            h00.a<h2.a> a21 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b17 = f2.u.b(a18);
            if (!(iVar2.k() instanceof e)) {
                c1.h.c();
            }
            iVar2.D();
            if (iVar2.f()) {
                iVar2.s(a21);
            } else {
                iVar2.o();
            }
            iVar2.E();
            i a22 = a2.a(iVar2);
            a2.c(a22, a19, c0551a.d());
            a2.c(a22, dVar5, c0551a.b());
            a2.c(a22, qVar4, c0551a.c());
            a2.c(a22, y1Var4, c0551a.f());
            iVar2.c();
            b17.invoke(g1.a(g1.b(iVar2)), iVar2, 0);
            iVar2.x(2058660585);
            iVar2.x(276693625);
            y0.d0.a(k2.c.c(R.drawable.ic_link_logo, iVar2, 0), k2.e.b(R.string.link, iVar2, 0), null, ThemeKt.getLinkColors(h0Var, iVar2, 8).m196getLinkLogo0d7_KjU(), iVar2, 8, 4);
            iVar2.N();
            iVar2.N();
            iVar2.q();
            iVar2.N();
            iVar2.N();
            p0.h0.a(e0.z(aVar, ThemeKt.getCloseIconWidth()), iVar2, 6);
            iVar2.N();
            iVar2.N();
            iVar2.q();
            iVar2.N();
            iVar2.N();
            k0.c.b(jVar, !(str == null || str.length() == 0), null, null, null, null, j1.c.b(iVar2, -819893572, true, new LinkAppBarKt$LinkAppBar$2$2(str)), iVar2, 1572870, 30);
            iVar2.N();
            iVar2.N();
            iVar2.q();
            iVar2.N();
            iVar2.N();
        }
        e1 l12 = iVar2.l();
        if (l12 == null) {
            return;
        }
        l12.a(new LinkAppBarKt$LinkAppBar$3(str, onCloseButtonClick, i11));
    }
}