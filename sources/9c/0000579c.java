package com.stripe.android.paymentsheet.ui;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e1;
import c1.g1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.u;
import f2.z;
import h2.a;
import kotlin.jvm.internal.s;
import o1.a;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p0.b0;
import p0.d0;
import t1.a0;
import x2.q;
import y0.h0;
import y0.o1;

/* loaded from: classes6.dex */
public final class LpmSelectorTextKt {
    /* renamed from: LpmSelectorText-T042LqI  reason: not valid java name */
    public static final void m346LpmSelectorTextT042LqI(Integer num, String text, long j11, o1.f modifier, boolean z11, c1.i iVar, int i11, int i12) {
        Object obj;
        int i13;
        c1.i iVar2;
        Integer num2;
        s.g(text, "text");
        s.g(modifier, "modifier");
        c1.i h11 = iVar.h(-50977558);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            obj = num;
        } else if ((i11 & 14) == 0) {
            obj = num;
            i13 = (h11.O(obj) ? 4 : 2) | i11;
        } else {
            obj = num;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= h11.O(text) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            i13 |= h11.e(j11) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            i13 |= h11.O(modifier) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((57344 & i11) == 0) {
            i13 |= h11.a(z11) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i15 = i13;
        if (((i15 & 46811) ^ 9362) == 0 && h11.i()) {
            h11.G();
            num2 = obj;
            iVar2 = h11;
        } else {
            Integer num3 = i14 != 0 ? null : obj;
            a.c g11 = o1.a.f42039a.g();
            int i16 = ((i15 >> 9) & 14) | 384;
            h11.x(-1989997165);
            int i17 = i16 >> 3;
            z b11 = b0.b(p0.a.f45228a.g(), g11, h11, (i17 & 112) | (i17 & 14));
            h11.x(1376089394);
            x2.d dVar = (x2.d) h11.A(l0.d());
            q qVar = (q) h11.A(l0.i());
            y1 y1Var = (y1) h11.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a11 = c0551a.a();
            h00.q<g1<h2.a>, c1.i, Integer, vz.b0> b12 = u.b(modifier);
            int i18 = ((((i16 << 3) & 112) << 9) & 7168) | 6;
            if (!(h11.k() instanceof c1.e)) {
                c1.h.c();
            }
            h11.D();
            if (h11.f()) {
                h11.s(a11);
            } else {
                h11.o();
            }
            h11.E();
            c1.i a12 = a2.a(h11);
            a2.c(a12, b11, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            h11.c();
            b12.invoke(g1.a(g1.b(h11)), h11, Integer.valueOf((i18 >> 3) & 112));
            h11.x(2058660585);
            h11.x(-326682362);
            if (((((i18 >> 9) & 14) & 11) ^ 2) == 0 && h11.i()) {
                h11.G();
            } else {
                d0 d0Var = d0.f45271a;
                if ((((((i16 >> 6) & 112) | 6) & 81) ^ 16) == 0 && h11.i()) {
                    h11.G();
                } else {
                    h11.x(1758886802);
                    if (num3 != null) {
                        y0.d0.a(k2.c.c(num3.intValue(), h11, 0), null, p0.u.j(o1.f.f42062f1, x2.g.f(4), BitmapDescriptorFactory.HUE_RED, 2, null), h0.f58131a.a(h11, 8).i(), h11, 440, 0);
                    }
                    h11.N();
                    iVar2 = h11;
                    o1.b(text, null, z11 ? j11 : a0.l(j11, 0.6f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 0L, null, null, null, 0L, null, null, 0L, w2.k.f55428a.b(), false, 1, null, h0.f58131a.c(h11, 8).f(), iVar2, (i15 >> 3) & 14, 3120, 22522);
                    iVar2.N();
                    iVar2.N();
                    iVar2.q();
                    iVar2.N();
                    iVar2.N();
                    num2 = num3;
                }
            }
            iVar2 = h11;
            iVar2.N();
            iVar2.N();
            iVar2.q();
            iVar2.N();
            iVar2.N();
            num2 = num3;
        }
        e1 l11 = iVar2.l();
        if (l11 == null) {
            return;
        }
        l11.a(new LpmSelectorTextKt$LpmSelectorText$2(num2, text, j11, modifier, z11, i11, i12));
    }
}