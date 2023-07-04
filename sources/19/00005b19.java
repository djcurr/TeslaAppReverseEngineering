package com.stripe.android.ui.core.elements;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import androidx.compose.ui.platform.z;
import c1.a2;
import c1.e;
import c1.e1;
import c1.g1;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.R;
import d.b;
import d.g;
import f.f;
import f2.u;
import h00.l;
import h2.a;
import k2.c;
import kotlin.jvm.internal.s;
import m0.h;
import m0.o;
import o0.m;
import o1.a;
import o1.f;
import p0.d0;
import p0.e0;
import t1.b0;
import vz.b0;
import x2.d;
import x2.q;
import y0.h0;
import y0.o1;

/* loaded from: classes6.dex */
public final class ScanCardButtonUIKt {
    public static final void ScanCardButtonUI(l<? super Intent, b0> onResult, i iVar, int i11) {
        int i12;
        s.g(onResult, "onResult");
        i h11 = iVar.h(2132944693);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(onResult) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (((i12 & 11) ^ 2) == 0 && h11.i()) {
            h11.G();
        } else {
            Context context = (Context) h11.A(z.g());
            f fVar = new f();
            h11.x(-3686930);
            boolean O = h11.O(onResult);
            Object y11 = h11.y();
            if (O || y11 == i.f8486a.a()) {
                y11 = new ScanCardButtonUIKt$ScanCardButtonUI$cardScanLauncher$1$1(onResult);
                h11.p(y11);
            }
            h11.N();
            g a11 = b.a(fVar, (l) y11, h11, 8);
            a.c g11 = a.f42039a.g();
            f.a aVar = o1.f.f42062f1;
            h11.x(-3687241);
            Object y12 = h11.y();
            if (y12 == i.f8486a.a()) {
                y12 = o0.l.a();
                h11.p(y12);
            }
            h11.N();
            o1.f c11 = h.c(aVar, (m) y12, null, false, null, null, new ScanCardButtonUIKt$ScanCardButtonUI$2(a11, context), 28, null);
            h11.x(-1989997165);
            f2.z b11 = p0.b0.b(p0.a.f45228a.g(), g11, h11, 48);
            h11.x(1376089394);
            d dVar = (d) h11.A(l0.d());
            q qVar = (q) h11.A(l0.i());
            y1 y1Var = (y1) h11.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a12 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b12 = u.b(c11);
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
            a2.c(a13, b11, c0551a.d());
            a2.c(a13, dVar, c0551a.b());
            a2.c(a13, qVar, c0551a.c());
            a2.c(a13, y1Var, c0551a.f());
            h11.c();
            b12.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-326682362);
            d0 d0Var = d0.f45271a;
            w1.b c12 = c.c(R.drawable.ic_photo_camera, h11, 0);
            int i13 = R.string.scan_card;
            String b13 = k2.e.b(i13, h11, 0);
            b0.a aVar2 = t1.b0.f51384b;
            h0 h0Var = h0.f58131a;
            t1.b0 b14 = b0.a.b(aVar2, h0Var.a(h11, 8).j(), 0, 2, null);
            float f11 = 18;
            o.a(c12, b13, e0.o(e0.z(aVar, x2.g.f(f11)), x2.g.f(f11)), null, null, BitmapDescriptorFactory.HUE_RED, b14, h11, 392, 56);
            o1.b(k2.e.b(i13, h11, 0), p0.u.l(aVar, x2.g.f(4), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), h0Var.a(h11, 8).j(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, h0Var.c(h11, 8).j(), h11, 48, 0, 32760);
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
        l11.a(new ScanCardButtonUIKt$ScanCardButtonUI$4(onResult, i11));
    }
}