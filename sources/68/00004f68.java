package com.stripe.android.link.ui;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.e1;
import c1.g1;
import c1.h;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.R;
import com.stripe.android.link.theme.ThemeKt;
import f2.u;
import f2.z;
import h2.a;
import k2.c;
import kotlin.jvm.internal.s;
import m0.b;
import o1.a;
import o1.f;
import p0.a;
import p0.b0;
import p0.d0;
import p0.e0;
import p0.j;
import x2.d;
import x2.g;
import x2.q;
import y0.h0;
import y0.o1;

/* loaded from: classes6.dex */
public final class CommonKt {
    public static final void ErrorText(String text, i iVar, int i11) {
        int i12;
        i iVar2;
        s.g(text, "text");
        i h11 = iVar.h(-1108777634);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(text) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (((i12 & 11) ^ 2) == 0 && h11.i()) {
            h11.G();
            iVar2 = h11;
        } else {
            f.a aVar = f.f42062f1;
            f n11 = e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null);
            h0 h0Var = h0.f58131a;
            f a11 = b.a(n11, ThemeKt.getLinkColors(h0Var, h11, 8).m194getErrorComponentBackground0d7_KjU(), h0Var.b(h11, 8).e());
            h11.x(-1989997165);
            z b11 = b0.b(a.f45228a.g(), o1.a.f42039a.i(), h11, 0);
            h11.x(1376089394);
            d dVar = (d) h11.A(l0.d());
            q qVar = (q) h11.A(l0.i());
            y1 y1Var = (y1) h11.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a12 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, vz.b0> b12 = u.b(a11);
            if (!(h11.k() instanceof e)) {
                h.c();
            }
            h11.D();
            if (h11.f()) {
                h11.s(a12);
            } else {
                h11.o();
            }
            h11.E();
            i a13 = a2.a(h11);
            a2.c(a13, b11, c0551a.d());
            a2.c(a13, dVar, c0551a.b());
            a2.c(a13, qVar, c0551a.c());
            a2.c(a13, y1Var, c0551a.f());
            h11.c();
            b12.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-326682362);
            d0 d0Var = d0.f45271a;
            float f11 = 12;
            y0.d0.a(c.c(R.drawable.ic_link_error, h11, 0), null, p0.u.h(aVar, g.f(f11)), ThemeKt.getLinkColors(h0Var, h11, 8).m195getErrorText0d7_KjU(), h11, 440, 0);
            iVar2 = h11;
            o1.b(text, p0.u.l(aVar, BitmapDescriptorFactory.HUE_RED, g.f(f11), g.f(f11), g.f(f11), 1, null), ThemeKt.getLinkColors(h0Var, h11, 8).m195getErrorText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, h0Var.c(h11, 8).d(), iVar2, (i12 & 14) | 48, 0, 32760);
            iVar2.N();
            iVar2.N();
            iVar2.q();
            iVar2.N();
            iVar2.N();
        }
        e1 l11 = iVar2.l();
        if (l11 == null) {
            return;
        }
        l11.a(new CommonKt$ErrorText$2(text, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ErrorTextPreview(i iVar, int i11) {
        i h11 = iVar.h(1628468178);
        if (i11 == 0 && h11.i()) {
            h11.G();
        } else {
            ErrorText("Test error message", h11, 6);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new CommonKt$ErrorTextPreview$1(i11));
    }

    public static final void ScrollableTopLevelColumn(h00.q<? super p0.i, ? super i, ? super Integer, vz.b0> content, i iVar, int i11) {
        int i12;
        s.g(content, "content");
        i h11 = iVar.h(-840770555);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(content) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((2 ^ (i12 & 11)) == 0 && h11.i()) {
            h11.G();
        } else {
            f.a aVar = f.f42062f1;
            f g11 = m0.d0.g(aVar, m0.d0.d(0, h11, 0, 1), false, null, false, 14, null);
            h11.x(-1990474327);
            a.C0826a c0826a = o1.a.f42039a;
            z i13 = p0.c.i(c0826a.k(), false, h11, 0);
            h11.x(1376089394);
            d dVar = (d) h11.A(l0.d());
            q qVar = (q) h11.A(l0.i());
            y1 y1Var = (y1) h11.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a11 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, vz.b0> b11 = u.b(g11);
            if (!(h11.k() instanceof e)) {
                h.c();
            }
            h11.D();
            if (h11.f()) {
                h11.s(a11);
            } else {
                h11.o();
            }
            h11.E();
            i a12 = a2.a(h11);
            a2.c(a12, i13, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            h11.c();
            b11.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-1253629305);
            p0.d dVar2 = p0.d.f45270a;
            f h12 = p0.u.h(e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null), g.f(20));
            a.b f11 = c0826a.f();
            h11.x(-1113030915);
            z a13 = p0.h.a(p0.a.f45228a.h(), f11, h11, 48);
            h11.x(1376089394);
            d dVar3 = (d) h11.A(l0.d());
            q qVar2 = (q) h11.A(l0.i());
            y1 y1Var2 = (y1) h11.A(l0.m());
            h00.a<h2.a> a14 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, vz.b0> b12 = u.b(h12);
            if (!(h11.k() instanceof e)) {
                h.c();
            }
            h11.D();
            if (h11.f()) {
                h11.s(a14);
            } else {
                h11.o();
            }
            h11.E();
            i a15 = a2.a(h11);
            a2.c(a15, a13, c0551a.d());
            a2.c(a15, dVar3, c0551a.b());
            a2.c(a15, qVar2, c0551a.c());
            a2.c(a15, y1Var2, c0551a.f());
            h11.c();
            b12.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(276693625);
            content.invoke(j.f45341a, h11, Integer.valueOf(((i12 << 3) & 112) | 6));
            h11.N();
            h11.N();
            h11.q();
            h11.N();
            h11.N();
            h11.N();
            h11.N();
            h11.q();
            h11.N();
            h11.N();
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new CommonKt$ScrollableTopLevelColumn$2(content, i11));
    }
}