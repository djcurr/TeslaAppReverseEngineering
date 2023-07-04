package com.stripe.android.link.ui.wallet;

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
import f2.u;
import f2.z;
import h00.a;
import h00.l;
import h2.a;
import j1.c;
import kotlin.jvm.internal.s;
import o1.a;
import o1.f;
import p0.a;
import p0.d0;
import p0.e0;
import p0.h;
import p0.j;
import vz.b0;
import x2.d;
import x2.g;
import x2.q;
import y0.b;
import y0.o1;

/* loaded from: classes6.dex */
public final class WalletModalsKt {
    public static final void ConfirmRemoveDialog(boolean z11, l<? super Boolean, b0> onDialogDismissed, i iVar, int i11) {
        int i12;
        s.g(onDialogDismissed, "onDialogDismissed");
        i h11 = iVar.h(1912947386);
        if ((i11 & 14) == 0) {
            i12 = (h11.a(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(onDialogDismissed) ? 32 : 16;
        }
        if (((i12 & 91) ^ 18) == 0 && h11.i()) {
            h11.G();
        } else if (z11) {
            h11.x(-3686930);
            boolean O = h11.O(onDialogDismissed);
            Object y11 = h11.y();
            if (O || y11 == i.f8486a.a()) {
                y11 = new WalletModalsKt$ConfirmRemoveDialog$1$1(onDialogDismissed);
                h11.p(y11);
            }
            h11.N();
            b.a((a) y11, c.b(h11, -819892985, true, new WalletModalsKt$ConfirmRemoveDialog$2(onDialogDismissed, i12)), null, c.b(h11, -819893353, true, new WalletModalsKt$ConfirmRemoveDialog$3(onDialogDismissed, i12)), null, ComposableSingletons$WalletModalsKt.INSTANCE.m244getLambda3$link_release(), null, 0L, 0L, null, h11, 199728, 980);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new WalletModalsKt$ConfirmRemoveDialog$4(z11, onDialogDismissed, i11));
    }

    public static final void WalletBottomSheetContent(i iVar, int i11) {
        i h11 = iVar.h(1359183950);
        if (i11 == 0 && h11.i()) {
            h11.G();
        } else {
            WalletBottomSheetContent(WalletModalsKt$WalletBottomSheetContent$1.INSTANCE, WalletModalsKt$WalletBottomSheetContent$2.INSTANCE, WalletModalsKt$WalletBottomSheetContent$3.INSTANCE, h11, 438);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new WalletModalsKt$WalletBottomSheetContent$4(i11));
    }

    public static final void WalletBottomSheetContent(a<b0> onCancelClick, a<b0> onEditClick, a<b0> onRemoveClick, i iVar, int i11) {
        int i12;
        i iVar2;
        s.g(onCancelClick, "onCancelClick");
        s.g(onEditClick, "onEditClick");
        s.g(onRemoveClick, "onRemoveClick");
        i h11 = iVar.h(1359184124);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(onCancelClick) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(onEditClick) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.O(onRemoveClick) ? 256 : 128;
        }
        if (((i12 & 731) ^ 146) == 0 && h11.i()) {
            h11.G();
            iVar2 = h11;
        } else {
            f.a aVar = f.f42062f1;
            f n11 = e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null);
            h11.x(-1113030915);
            p0.a aVar2 = p0.a.f45228a;
            a.k h12 = aVar2.h();
            a.C0826a c0826a = o1.a.f42039a;
            z a11 = h.a(h12, c0826a.h(), h11, 0);
            h11.x(1376089394);
            d dVar = (d) h11.A(l0.d());
            q qVar = (q) h11.A(l0.i());
            y1 y1Var = (y1) h11.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a12 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b11 = u.b(n11);
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
            f e11 = m0.h.e(e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null), false, null, null, onEditClick, 7, null);
            h11.x(-1989997165);
            z b12 = p0.b0.b(aVar2.g(), c0826a.i(), h11, 0);
            h11.x(1376089394);
            d dVar2 = (d) h11.A(l0.d());
            q qVar2 = (q) h11.A(l0.i());
            y1 y1Var2 = (y1) h11.A(l0.m());
            h00.a<h2.a> a14 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b13 = u.b(e11);
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
            a2.c(a15, b12, c0551a.d());
            a2.c(a15, dVar2, c0551a.b());
            a2.c(a15, qVar2, c0551a.c());
            a2.c(a15, y1Var2, c0551a.f());
            h11.c();
            b13.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-326682362);
            d0 d0Var = d0.f45271a;
            o1.b(k2.e.b(R.string.wallet_update_card, h11, 0), p0.u.k(aVar, ThemeKt.getHorizontalPadding(), g.f(24), ThemeKt.getHorizontalPadding(), g.f(10)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h11, 48, 0, 65532);
            h11.N();
            h11.N();
            h11.q();
            h11.N();
            h11.N();
            f e12 = m0.h.e(e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null), false, null, null, onRemoveClick, 7, null);
            h11.x(-1989997165);
            z b14 = p0.b0.b(aVar2.g(), c0826a.i(), h11, 0);
            h11.x(1376089394);
            d dVar3 = (d) h11.A(l0.d());
            q qVar3 = (q) h11.A(l0.i());
            y1 y1Var3 = (y1) h11.A(l0.m());
            h00.a<h2.a> a16 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b15 = u.b(e12);
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
            a2.c(a17, b14, c0551a.d());
            a2.c(a17, dVar3, c0551a.b());
            a2.c(a17, qVar3, c0551a.c());
            a2.c(a17, y1Var3, c0551a.f());
            h11.c();
            b15.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-326682362);
            o1.b(k2.e.b(R.string.wallet_remove_card, h11, 0), p0.u.i(aVar, ThemeKt.getHorizontalPadding(), g.f(10)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h11, 48, 0, 65532);
            h11.N();
            h11.N();
            h11.q();
            h11.N();
            h11.N();
            f e13 = m0.h.e(e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null), false, null, null, onCancelClick, 7, null);
            h11.x(-1989997165);
            z b16 = p0.b0.b(aVar2.g(), c0826a.i(), h11, 0);
            h11.x(1376089394);
            d dVar4 = (d) h11.A(l0.d());
            q qVar4 = (q) h11.A(l0.i());
            y1 y1Var4 = (y1) h11.A(l0.m());
            h00.a<h2.a> a18 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b17 = u.b(e13);
            if (!(h11.k() instanceof e)) {
                c1.h.c();
            }
            h11.D();
            if (h11.f()) {
                h11.s(a18);
            } else {
                h11.o();
            }
            h11.E();
            i a19 = a2.a(h11);
            a2.c(a19, b16, c0551a.d());
            a2.c(a19, dVar4, c0551a.b());
            a2.c(a19, qVar4, c0551a.c());
            a2.c(a19, y1Var4, c0551a.f());
            h11.c();
            b17.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-326682362);
            iVar2 = h11;
            o1.b(k2.e.b(R.string.cancel, h11, 0), p0.u.k(aVar, ThemeKt.getHorizontalPadding(), g.f(10), ThemeKt.getHorizontalPadding(), g.f(24)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar2, 48, 0, 65532);
            iVar2.N();
            iVar2.N();
            iVar2.q();
            iVar2.N();
            iVar2.N();
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
        l11.a(new WalletModalsKt$WalletBottomSheetContent$6(onCancelClick, onEditClick, onRemoveClick, i11));
    }
}