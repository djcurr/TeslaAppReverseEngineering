package com.stripe.android.link.ui.wallet;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import androidx.lifecycle.p0;
import c1.a2;
import c1.e;
import c1.e1;
import c1.g1;
import c1.h;
import c1.i;
import c1.n1;
import c1.o0;
import c1.s1;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.R;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.CommonKt;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.link.ui.PrimaryButtonKt;
import com.stripe.android.link.ui.wallet.WalletViewModel;
import com.stripe.android.model.ConsumerPaymentDetails;
import f2.u;
import f2.z;
import h00.p;
import h2.a;
import java.util.List;
import k2.c;
import kotlin.jvm.internal.s;
import l2.o;
import m0.b;
import o1.a;
import o1.f;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p0.a;
import p0.b0;
import p0.c0;
import p0.d0;
import p0.e0;
import p0.j;
import r2.l;
import t1.a0;
import wz.w;
import x2.d;
import x2.g;
import x2.q;
import y0.f1;
import y0.h0;
import y0.o1;
import y0.s0;
import y0.u0;
import y0.v0;

/* loaded from: classes6.dex */
public final class WalletScreenKt {
    public static final void CardDetails(ConsumerPaymentDetails.Card card, i iVar, int i11) {
        int i12;
        s.g(card, "card");
        i h11 = iVar.h(1031481803);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(card) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (((i12 & 11) ^ 2) == 0 && h11.i()) {
            h11.G();
        } else {
            a.c g11 = a.f42039a.g();
            h11.x(-1989997165);
            f.a aVar = f.f42062f1;
            z b11 = b0.b(p0.a.f45228a.g(), g11, h11, 48);
            h11.x(1376089394);
            d dVar = (d) h11.A(l0.d());
            q qVar = (q) h11.A(l0.i());
            y1 y1Var = (y1) h11.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a11 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, vz.b0> b12 = u.b(aVar);
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
            a2.c(a12, b11, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            h11.c();
            b12.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-326682362);
            d0 d0Var = d0.f45271a;
            y0.d0.a(c.c(card.getBrand().getIcon(), h11, 0), card.getBrand().getDisplayName(), p0.u.j(aVar, g.f(6), BitmapDescriptorFactory.HUE_RED, 2, null), a0.f51365b.f(), h11, 3464, 0);
            h0 h0Var = h0.f58131a;
            o1.b("•••• ", null, h0Var.a(h11, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h11, 6, 0, 65530);
            o1.b(card.getLast4(), null, h0Var.a(h11, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h11, 0, 0, 65530);
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
        l11.a(new WalletScreenKt$CardDetails$2(card, i11));
    }

    public static final void CardPaymentMethodItem(ConsumerPaymentDetails.Card cardDetails, boolean z11, boolean z12, h00.a<vz.b0> onClick, h00.a<vz.b0> onMenuButtonClick, i iVar, int i11) {
        int i12;
        f.a aVar;
        int i13;
        i iVar2;
        s.g(cardDetails, "cardDetails");
        s.g(onClick, "onClick");
        s.g(onMenuButtonClick, "onMenuButtonClick");
        i h11 = iVar.h(1309656501);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(cardDetails) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.a(z11) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.a(z12) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= h11.O(onClick) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= h11.O(onMenuButtonClick) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i14 = i12;
        if (((i14 & 46811) ^ 9362) == 0 && h11.i()) {
            h11.G();
            iVar2 = h11;
        } else {
            f.a aVar2 = f.f42062f1;
            f e11 = m0.h.e(e0.o(e0.n(aVar2, BitmapDescriptorFactory.HUE_RED, 1, null), g.f(56)), z11, null, null, onClick, 6, null);
            a.C0826a c0826a = o1.a.f42039a;
            a.c g11 = c0826a.g();
            h11.x(-1989997165);
            z b11 = b0.b(p0.a.f45228a.g(), g11, h11, 48);
            h11.x(1376089394);
            d dVar = (d) h11.A(l0.d());
            q qVar = (q) h11.A(l0.i());
            y1 y1Var = (y1) h11.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a11 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, vz.b0> b12 = u.b(e11);
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
            a2.c(a12, b11, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            h11.c();
            b12.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-326682362);
            d0 d0Var = d0.f45271a;
            float f11 = 20;
            float f12 = 6;
            f l11 = p0.u.l(aVar2, g.f(f11), BitmapDescriptorFactory.HUE_RED, g.f(f12), BitmapDescriptorFactory.HUE_RED, 10, null);
            u0 u0Var = u0.f58666a;
            h0 h0Var = h0.f58131a;
            v0.a(z12, null, l11, false, null, u0Var.a(h0Var.a(h11, 8).j(), ThemeKt.getLinkColors(h0Var, h11, 8).m193getDisabledText0d7_KjU(), 0L, h11, 4096, 4), h11, ((i14 >> 6) & 14) | 432, 24);
            CardDetails(cardDetails, h11, ConsumerPaymentDetails.Card.$stable | (i14 & 14));
            p0.h0.a(c0.a.a(d0Var, aVar2, 1.0f, false, 2, null), h11, 0);
            h11.x(1781911596);
            if (cardDetails.isDefault()) {
                aVar = aVar2;
                f a13 = b.a(e0.o(aVar, g.f(f11)), h0Var.a(h11, 8).l(), h0Var.b(h11, 8).e());
                o1.a d11 = c0826a.d();
                h11.x(-1990474327);
                z i15 = p0.c.i(d11, false, h11, 6);
                h11.x(1376089394);
                d dVar2 = (d) h11.A(l0.d());
                q qVar2 = (q) h11.A(l0.i());
                y1 y1Var2 = (y1) h11.A(l0.m());
                h00.a<h2.a> a14 = c0551a.a();
                h00.q<g1<h2.a>, i, Integer, vz.b0> b13 = u.b(a13);
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
                a2.c(a15, i15, c0551a.d());
                a2.c(a15, dVar2, c0551a.b());
                a2.c(a15, qVar2, c0551a.c());
                a2.c(a15, y1Var2, c0551a.f());
                h11.c();
                b13.invoke(g1.a(g1.b(h11)), h11, 0);
                h11.x(2058660585);
                h11.x(-1253629305);
                p0.d dVar3 = p0.d.f45270a;
                i13 = 8;
                o1.b(k2.e.b(R.string.wallet_default, h11, 0), p0.u.i(aVar, g.f(4), g.f(2)), ThemeKt.getLinkColors(h0Var, h11, 8).m193getDisabledText0d7_KjU(), x2.s.f(12), null, l.f49091b.c(), null, 0L, null, null, 0L, 0, false, 0, null, null, h11, 199728, 0, 65488);
                h11.N();
                h11.N();
                h11.q();
                h11.N();
                h11.N();
            } else {
                aVar = aVar2;
                i13 = 8;
            }
            h11.N();
            iVar2 = h11;
            y0.c0.a(onMenuButtonClick, p0.u.l(aVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, g.f(f12), BitmapDescriptorFactory.HUE_RED, 11, null), z11, null, ComposableSingletons$WalletScreenKt.INSTANCE.m247getLambda3$link_release(), iVar2, ((i14 >> 12) & 14) | 24624 | ((i14 << 3) & 896), 8);
            iVar2.N();
            iVar2.N();
            iVar2.q();
            iVar2.N();
            iVar2.N();
            f1.f58111a.a(null, g.f(1), ThemeKt.getLinkColors(h0Var, iVar2, i13).m191getComponentDivider0d7_KjU(), iVar2, 4144, 1);
        }
        e1 l12 = iVar2.l();
        if (l12 == null) {
            return;
        }
        l12.a(new WalletScreenKt$CardPaymentMethodItem$2(cardDetails, z11, z12, onClick, onMenuButtonClick, i11));
    }

    public static final void CollapsedPaymentDetails(ConsumerPaymentDetails.PaymentDetails selectedPaymentMethod, boolean z11, h00.a<vz.b0> onClick, i iVar, int i11) {
        int i12;
        i iVar2;
        s.g(selectedPaymentMethod, "selectedPaymentMethod");
        s.g(onClick, "onClick");
        i h11 = iVar.h(1686905326);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(selectedPaymentMethod) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.a(z11) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.O(onClick) ? 256 : 128;
        }
        if (((i12 & 731) ^ 146) == 0 && h11.i()) {
            h11.G();
            iVar2 = h11;
        } else {
            f.a aVar = f.f42062f1;
            f o11 = e0.o(e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null), g.f(64));
            float f11 = g.f(1);
            h0 h0Var = h0.f58131a;
            f e11 = m0.h.e(b.a(m0.d.g(o11, f11, ThemeKt.getLinkColors(h0Var, h11, 8).m190getComponentBorder0d7_KjU(), h0Var.b(h11, 8).c()), ThemeKt.getLinkColors(h0Var, h11, 8).m189getComponentBackground0d7_KjU(), h0Var.b(h11, 8).c()), z11, null, null, onClick, 6, null);
            a.c g11 = o1.a.f42039a.g();
            h11.x(-1989997165);
            z b11 = b0.b(p0.a.f45228a.g(), g11, h11, 48);
            h11.x(1376089394);
            d dVar = (d) h11.A(l0.d());
            q qVar = (q) h11.A(l0.i());
            y1 y1Var = (y1) h11.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a11 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, vz.b0> b12 = u.b(e11);
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
            a2.c(a12, b11, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            h11.c();
            b12.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-326682362);
            d0 d0Var = d0.f45271a;
            o1.b(k2.e.b(R.string.wallet_pay_with, h11, 0), p0.u.j(aVar, ThemeKt.getHorizontalPadding(), BitmapDescriptorFactory.HUE_RED, 2, null), ThemeKt.getLinkColors(h0Var, h11, 8).m193getDisabledText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h11, 48, 0, 65528);
            h11.x(634159698);
            if (selectedPaymentMethod instanceof ConsumerPaymentDetails.Card) {
                CardDetails((ConsumerPaymentDetails.Card) selectedPaymentMethod, h11, ConsumerPaymentDetails.Card.$stable);
            }
            h11.N();
            p0.h0.a(c0.a.a(d0Var, aVar, 1.0f, false, 2, null), h11, 0);
            iVar2 = h11;
            y0.d0.a(c.c(R.drawable.ic_link_chevron, h11, 0), k2.e.b(R.string.wallet_expand_accessibility, h11, 0), o.b(p0.u.l(aVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, g.f(22), BitmapDescriptorFactory.HUE_RED, 11, null), false, WalletScreenKt$CollapsedPaymentDetails$1$1.INSTANCE, 1, null), ThemeKt.getLinkColors(h0Var, h11, 8).m193getDisabledText0d7_KjU(), iVar2, 8, 0);
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
        l11.a(new WalletScreenKt$CollapsedPaymentDetails$2(selectedPaymentMethod, z11, onClick, i11));
    }

    public static final void ExpandedPaymentDetails(List<? extends ConsumerPaymentDetails.PaymentDetails> paymentDetails, int i11, boolean z11, h00.l<? super Integer, vz.b0> onIndexSelected, h00.l<? super ConsumerPaymentDetails.Card, vz.b0> onMenuButtonClick, h00.a<vz.b0> onAddNewPaymentMethodClick, h00.a<vz.b0> onCollapse, i iVar, int i12) {
        Object obj;
        s.g(paymentDetails, "paymentDetails");
        s.g(onIndexSelected, "onIndexSelected");
        s.g(onMenuButtonClick, "onMenuButtonClick");
        s.g(onAddNewPaymentMethodClick, "onAddNewPaymentMethodClick");
        s.g(onCollapse, "onCollapse");
        i h11 = iVar.h(-2048890633);
        f.a aVar = f.f42062f1;
        f n11 = e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null);
        float f11 = g.f(1);
        h0 h0Var = h0.f58131a;
        f a11 = b.a(m0.d.g(n11, f11, ThemeKt.getLinkColors(h0Var, h11, 8).m190getComponentBorder0d7_KjU(), h0Var.b(h11, 8).c()), ThemeKt.getLinkColors(h0Var, h11, 8).m189getComponentBackground0d7_KjU(), h0Var.b(h11, 8).c());
        h11.x(-1113030915);
        p0.a aVar2 = p0.a.f45228a;
        a.k h12 = aVar2.h();
        a.C0826a c0826a = o1.a.f42039a;
        z a12 = p0.h.a(h12, c0826a.h(), h11, 0);
        h11.x(1376089394);
        d dVar = (d) h11.A(l0.d());
        q qVar = (q) h11.A(l0.i());
        y1 y1Var = (y1) h11.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a13 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, vz.b0> b11 = u.b(a11);
        if (!(h11.k() instanceof e)) {
            h.c();
        }
        h11.D();
        if (h11.f()) {
            h11.s(a13);
        } else {
            h11.o();
        }
        h11.E();
        i a14 = a2.a(h11);
        a2.c(a14, a12, c0551a.d());
        a2.c(a14, dVar, c0551a.b());
        a2.c(a14, qVar, c0551a.c());
        a2.c(a14, y1Var, c0551a.f());
        h11.c();
        b11.invoke(g1.a(g1.b(h11)), h11, 0);
        h11.x(2058660585);
        h11.x(276693625);
        j jVar = j.f45341a;
        f e11 = m0.h.e(e0.o(aVar, g.f(44)), z11, null, null, onCollapse, 6, null);
        a.c g11 = c0826a.g();
        h11.x(-1989997165);
        z b12 = b0.b(aVar2.g(), g11, h11, 48);
        h11.x(1376089394);
        d dVar2 = (d) h11.A(l0.d());
        q qVar2 = (q) h11.A(l0.i());
        y1 y1Var2 = (y1) h11.A(l0.m());
        h00.a<h2.a> a15 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, vz.b0> b13 = u.b(e11);
        if (!(h11.k() instanceof e)) {
            h.c();
        }
        h11.D();
        if (h11.f()) {
            h11.s(a15);
        } else {
            h11.o();
        }
        h11.E();
        i a16 = a2.a(h11);
        a2.c(a16, b12, c0551a.d());
        a2.c(a16, dVar2, c0551a.b());
        a2.c(a16, qVar2, c0551a.c());
        a2.c(a16, y1Var2, c0551a.f());
        h11.c();
        b13.invoke(g1.a(g1.b(h11)), h11, 0);
        h11.x(2058660585);
        h11.x(-326682362);
        d0 d0Var = d0.f45271a;
        float f12 = 20;
        boolean z12 = false;
        o1.b(k2.e.b(R.string.wallet_expanded_title, h11, 0), p0.u.l(aVar, ThemeKt.getHorizontalPadding(), g.f(f12), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), h0Var.a(h11, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, h0Var.c(h11, 8).e(), h11, 48, 0, 32760);
        p0.h0.a(c0.a.a(d0Var, aVar, 1.0f, false, 2, null), h11, 0);
        Object obj2 = null;
        y0.d0.a(c.c(R.drawable.ic_link_chevron, h11, 0), k2.e.b(R.string.wallet_expand_accessibility, h11, 0), o.b(q1.o.a(p0.u.l(aVar, BitmapDescriptorFactory.HUE_RED, g.f(f12), g.f(22), BitmapDescriptorFactory.HUE_RED, 9, null), 180.0f), false, WalletScreenKt$ExpandedPaymentDetails$1$1$1.INSTANCE, 1, null), h0Var.a(h11, 8).g(), h11, 8, 0);
        h11.N();
        h11.N();
        h11.q();
        h11.N();
        h11.N();
        h11.x(-193420291);
        int i13 = 0;
        for (Object obj3 : paymentDetails) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                w.s();
            }
            ConsumerPaymentDetails.PaymentDetails paymentDetails2 = (ConsumerPaymentDetails.PaymentDetails) obj3;
            if (paymentDetails2 instanceof ConsumerPaymentDetails.Card) {
                ConsumerPaymentDetails.Card card = (ConsumerPaymentDetails.Card) paymentDetails2;
                boolean z13 = i11 == i13 ? true : z12;
                Integer valueOf = Integer.valueOf(i13);
                h11.x(-3686552);
                boolean O = h11.O(valueOf) | h11.O(onIndexSelected);
                Object y11 = h11.y();
                if (O || y11 == i.f8486a.a()) {
                    y11 = new WalletScreenKt$ExpandedPaymentDetails$1$2$1$1(onIndexSelected, i13);
                    h11.p(y11);
                }
                h11.N();
                obj = null;
                CardPaymentMethodItem(card, z11, z13, (h00.a) y11, new WalletScreenKt$ExpandedPaymentDetails$1$2$2(onMenuButtonClick, paymentDetails2), h11, ConsumerPaymentDetails.Card.$stable | ((i12 >> 3) & 112));
            } else {
                obj = obj2;
            }
            obj2 = obj;
            i13 = i14;
            z12 = false;
        }
        h11.N();
        f.a aVar3 = f.f42062f1;
        f e12 = m0.h.e(e0.o(e0.n(aVar3, BitmapDescriptorFactory.HUE_RED, 1, obj2), g.f(60)), z11, null, null, onAddNewPaymentMethodClick, 6, null);
        a.c g12 = o1.a.f42039a.g();
        h11.x(-1989997165);
        z b14 = b0.b(p0.a.f45228a.g(), g12, h11, 48);
        h11.x(1376089394);
        d dVar3 = (d) h11.A(l0.d());
        q qVar3 = (q) h11.A(l0.i());
        y1 y1Var3 = (y1) h11.A(l0.m());
        a.C0551a c0551a2 = h2.a.Y0;
        h00.a<h2.a> a17 = c0551a2.a();
        h00.q<g1<h2.a>, i, Integer, vz.b0> b15 = u.b(e12);
        if (!(h11.k() instanceof e)) {
            h.c();
        }
        h11.D();
        if (h11.f()) {
            h11.s(a17);
        } else {
            h11.o();
        }
        h11.E();
        i a18 = a2.a(h11);
        a2.c(a18, b14, c0551a2.d());
        a2.c(a18, dVar3, c0551a2.b());
        a2.c(a18, qVar3, c0551a2.c());
        a2.c(a18, y1Var3, c0551a2.f());
        h11.c();
        b15.invoke(g1.a(g1.b(h11)), h11, 0);
        h11.x(2058660585);
        h11.x(-326682362);
        d0 d0Var2 = d0.f45271a;
        y0.d0.a(c.c(R.drawable.ic_link_add, h11, 0), null, p0.u.l(aVar3, ThemeKt.getHorizontalPadding(), BitmapDescriptorFactory.HUE_RED, g.f(12), BitmapDescriptorFactory.HUE_RED, 10, null), a0.f51365b.f(), h11, 3512, 0);
        String b16 = k2.e.b(R.string.wallet_add_new_payment_method, h11, 0);
        f l11 = p0.u.l(aVar3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ThemeKt.getHorizontalPadding(), g.f(4), 3, null);
        h0 h0Var2 = h0.f58131a;
        o1.b(b16, l11, h0Var2.a(h11, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, h0Var2.c(h11, 8).e(), h11, 48, 0, 32760);
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
        e1 l12 = h11.l();
        if (l12 == null) {
            return;
        }
        l12.a(new WalletScreenKt$ExpandedPaymentDetails$2(paymentDetails, i11, z11, onIndexSelected, onMenuButtonClick, onAddNewPaymentMethodClick, onCollapse, i12));
    }

    public static final void WalletBody(LinkAccount linkAccount, NonFallbackInjector injector, h00.l<? super h00.q<? super p0.i, ? super i, ? super Integer, vz.b0>, vz.b0> showBottomSheetContent, i iVar, int i11) {
        int i12;
        i iVar2;
        s.g(linkAccount, "linkAccount");
        s.g(injector, "injector");
        s.g(showBottomSheetContent, "showBottomSheetContent");
        i h11 = iVar.h(-1813703190);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(linkAccount) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(injector) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.O(showBottomSheetContent) ? 256 : 128;
        }
        if (((i12 & 731) ^ 146) == 0 && h11.i()) {
            h11.G();
            iVar2 = h11;
        } else {
            WalletViewModel.Factory factory = new WalletViewModel.Factory(linkAccount, injector);
            h11.x(564614654);
            androidx.lifecycle.u0 a11 = m4.a.f38401a.a(h11, 0);
            if (a11 != null) {
                p0 b11 = m4.b.b(WalletViewModel.class, a11, null, factory, h11, 4168, 0);
                h11.N();
                WalletViewModel walletViewModel = (WalletViewModel) b11;
                v1 b12 = n1.b(walletViewModel.getPaymentDetails(), null, h11, 8, 1);
                v1 b13 = n1.b(walletViewModel.isProcessing(), null, h11, 8, 1);
                v1 b14 = n1.b(walletViewModel.getErrorMessage(), null, h11, 8, 1);
                boolean m249WalletBody$lambda1 = m249WalletBody$lambda1(b13);
                List<ConsumerPaymentDetails.PaymentDetails> m248WalletBody$lambda0 = m248WalletBody$lambda0(b12);
                LinkActivityContract.Args args = walletViewModel.getArgs();
                Resources resources = ((Context) h11.A(androidx.compose.ui.platform.z.g())).getResources();
                s.f(resources, "LocalContext.current.resources");
                iVar2 = h11;
                WalletBody(m249WalletBody$lambda1, m248WalletBody$lambda0, PrimaryButtonKt.primaryButtonLabel(args, resources), m251WalletBody$lambda2(b14), new WalletScreenKt$WalletBody$1(walletViewModel), new WalletScreenKt$WalletBody$2(walletViewModel), new WalletScreenKt$WalletBody$3(walletViewModel), new WalletScreenKt$WalletBody$4(walletViewModel), new WalletScreenKt$WalletBody$5(walletViewModel), showBottomSheetContent, h11, ((i12 << 21) & 1879048192) | 64);
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        }
        e1 l11 = iVar2.l();
        if (l11 == null) {
            return;
        }
        l11.a(new WalletScreenKt$WalletBody$6(linkAccount, injector, showBottomSheetContent, i11));
    }

    /* renamed from: WalletBody$lambda-0  reason: not valid java name */
    private static final List<ConsumerPaymentDetails.PaymentDetails> m248WalletBody$lambda0(v1<? extends List<? extends ConsumerPaymentDetails.PaymentDetails>> v1Var) {
        return (List) v1Var.getValue();
    }

    /* renamed from: WalletBody$lambda-1  reason: not valid java name */
    private static final boolean m249WalletBody$lambda1(v1<Boolean> v1Var) {
        return v1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WalletBody$lambda-10  reason: not valid java name */
    public static final void m250WalletBody$lambda10(o0<Boolean> o0Var, boolean z11) {
        o0Var.setValue(Boolean.valueOf(z11));
    }

    /* renamed from: WalletBody$lambda-2  reason: not valid java name */
    private static final ErrorMessage m251WalletBody$lambda2(v1<? extends ErrorMessage> v1Var) {
        return v1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WalletBody$lambda-3  reason: not valid java name */
    public static final boolean m252WalletBody$lambda3(o0<Boolean> o0Var) {
        return o0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WalletBody$lambda-4  reason: not valid java name */
    public static final void m253WalletBody$lambda4(o0<Boolean> o0Var, boolean z11) {
        o0Var.setValue(Boolean.valueOf(z11));
    }

    /* renamed from: WalletBody$lambda-6  reason: not valid java name */
    private static final ConsumerPaymentDetails.Card m254WalletBody$lambda6(o0<ConsumerPaymentDetails.Card> o0Var) {
        return o0Var.getValue();
    }

    /* renamed from: WalletBody$lambda-9  reason: not valid java name */
    private static final boolean m256WalletBody$lambda9(o0<Boolean> o0Var) {
        return o0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WalletBodyPreview(i iVar, int i11) {
        i h11 = iVar.h(-762941846);
        if (i11 == 0 && h11.i()) {
            h11.G();
        } else {
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$WalletScreenKt.INSTANCE.m246getLambda2$link_release(), h11, 48, 1);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new WalletScreenKt$WalletBodyPreview$1(i11));
    }

    public static final void WalletBody(boolean z11, List<? extends ConsumerPaymentDetails.PaymentDetails> paymentDetails, String primaryButtonLabel, ErrorMessage errorMessage, h00.a<vz.b0> onAddNewPaymentMethodClick, h00.l<? super ConsumerPaymentDetails.PaymentDetails, vz.b0> onEditPaymentMethod, h00.l<? super ConsumerPaymentDetails.PaymentDetails, vz.b0> onDeletePaymentMethod, h00.l<? super ConsumerPaymentDetails.PaymentDetails, vz.b0> onPrimaryButtonClick, h00.a<vz.b0> onPayAnotherWayClick, h00.l<? super h00.q<? super p0.i, ? super i, ? super Integer, vz.b0>, vz.b0> showBottomSheetContent, i iVar, int i11) {
        s.g(paymentDetails, "paymentDetails");
        s.g(primaryButtonLabel, "primaryButtonLabel");
        s.g(onAddNewPaymentMethodClick, "onAddNewPaymentMethodClick");
        s.g(onEditPaymentMethod, "onEditPaymentMethod");
        s.g(onDeletePaymentMethod, "onDeletePaymentMethod");
        s.g(onPrimaryButtonClick, "onPrimaryButtonClick");
        s.g(onPayAnotherWayClick, "onPayAnotherWayClick");
        s.g(showBottomSheetContent, "showBottomSheetContent");
        i h11 = iVar.h(-1813702064);
        o0 o0Var = (o0) l1.b.b(new Object[0], null, null, WalletScreenKt$WalletBody$isWalletExpanded$2.INSTANCE, h11, 3080, 6);
        h11.x(-3687241);
        Object y11 = h11.y();
        i.a aVar = i.f8486a;
        if (y11 == aVar.a()) {
            y11 = s1.d(null, null, 2, null);
            h11.p(y11);
        }
        h11.N();
        o0 o0Var2 = (o0) y11;
        h11.x(-3687241);
        Object y12 = h11.y();
        if (y12 == aVar.a()) {
            y12 = s1.d(Boolean.FALSE, null, 2, null);
            h11.p(y12);
        }
        h11.N();
        o0 o0Var3 = (o0) y12;
        ConsumerPaymentDetails.Card m254WalletBody$lambda6 = m254WalletBody$lambda6(o0Var2);
        h11.x(-1813701279);
        if (m254WalletBody$lambda6 != null) {
            h11.x(-3686930);
            boolean O = h11.O(o0Var3);
            Object y13 = h11.y();
            if (O || y13 == aVar.a()) {
                y13 = new WalletScreenKt$WalletBody$7$1$1(o0Var3, null);
                h11.p(y13);
            }
            h11.N();
            c1.b0.d(m254WalletBody$lambda6, (p) y13, h11, ConsumerPaymentDetails.Card.$stable);
            WalletModalsKt.ConfirmRemoveDialog(m256WalletBody$lambda9(o0Var3), new WalletScreenKt$WalletBody$7$2(onDeletePaymentMethod, m254WalletBody$lambda6, o0Var3, o0Var2), h11, 0);
        }
        h11.N();
        if (paymentDetails.isEmpty()) {
            h11.x(-1813700873);
            f n11 = e0.n(e0.j(f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            o1.a d11 = o1.a.f42039a.d();
            h11.x(-1990474327);
            z i12 = p0.c.i(d11, false, h11, 6);
            h11.x(1376089394);
            d dVar = (d) h11.A(l0.d());
            q qVar = (q) h11.A(l0.i());
            y1 y1Var = (y1) h11.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a11 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, vz.b0> b11 = u.b(n11);
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
            a2.c(a12, i12, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            h11.c();
            b11.invoke(g1.a(g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-1253629305);
            p0.d dVar2 = p0.d.f45270a;
            s0.a(null, 0L, BitmapDescriptorFactory.HUE_RED, h11, 0, 7);
            h11.N();
            h11.N();
            h11.q();
            h11.N();
            h11.N();
            h11.N();
        } else {
            h11.x(-1813700639);
            CommonKt.ScrollableTopLevelColumn(j1.c.b(h11, -819888299, true, new WalletScreenKt$WalletBody$9(paymentDetails, z11, showBottomSheetContent, onEditPaymentMethod, o0Var2, i11, onAddNewPaymentMethodClick, o0Var, errorMessage, primaryButtonLabel, onPayAnotherWayClick, onPrimaryButtonClick)), h11, 6);
            h11.N();
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new WalletScreenKt$WalletBody$10(z11, paymentDetails, primaryButtonLabel, errorMessage, onAddNewPaymentMethodClick, onEditPaymentMethod, onDeletePaymentMethod, onPrimaryButtonClick, onPayAnotherWayClick, showBottomSheetContent, i11));
    }
}