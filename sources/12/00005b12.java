package com.stripe.android.ui.core.elements;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import androidx.compose.ui.platform.z;
import c1.a2;
import c1.e1;
import c1.g1;
import c1.i;
import c1.n1;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.menu.CheckboxKt;
import h00.l;
import h2.a;
import k2.e;
import kotlin.jvm.internal.s;
import l2.h;
import l2.o;
import o1.a;
import o1.f;
import p0.b0;
import p0.d0;
import p0.e0;
import p0.u;
import u0.b;
import x2.d;
import x2.g;
import x2.q;

/* loaded from: classes6.dex */
public final class SaveForFutureUseElementUIKt {
    public static final String SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG = "SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG";

    public static final void SaveForFutureUseElementUI(boolean z11, SaveForFutureUseElement element, i iVar, int i11) {
        int i12;
        s.g(element, "element");
        i h11 = iVar.h(1516597541);
        SaveForFutureUseController controller = element.getController();
        v1 a11 = n1.a(controller.getSaveForFutureUse(), Boolean.TRUE, null, h11, 56, 2);
        v1 a12 = n1.a(controller.getLabel(), null, null, h11, 56, 2);
        Resources resources = ((Context) h11.A(z.g())).getResources();
        if (m472SaveForFutureUseElementUI$lambda0(a11)) {
            i12 = R.string.selected;
        } else {
            i12 = R.string.not_selected;
        }
        String b11 = e.b(i12, h11, 0);
        f.a aVar = f.f42062f1;
        f j11 = u.j(aVar, BitmapDescriptorFactory.HUE_RED, g.f(2), 1, null);
        h11.x(-3686930);
        boolean O = h11.O(b11);
        Object y11 = h11.y();
        if (O || y11 == i.f8486a.a()) {
            y11 = new SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$1$1(b11);
            h11.p(y11);
        }
        h11.N();
        f r11 = e0.r(e0.n(b.b(o.b(j11, false, (l) y11, 1, null), m472SaveForFutureUseElementUI$lambda0(a11), z11, h.g(h.f36408b.b()), new SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$2(controller, a11)), BitmapDescriptorFactory.HUE_RED, 1, null), g.f(48));
        a.C0826a c0826a = a.f42039a;
        a.c g11 = c0826a.g();
        h11.x(-1989997165);
        f2.z b12 = b0.b(p0.a.f45228a.g(), g11, h11, 48);
        h11.x(1376089394);
        d dVar = (d) h11.A(l0.d());
        q qVar = (q) h11.A(l0.i());
        y1 y1Var = (y1) h11.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a13 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, vz.b0> b13 = f2.u.b(r11);
        if (!(h11.k() instanceof c1.e)) {
            c1.h.c();
        }
        h11.D();
        if (h11.f()) {
            h11.s(a13);
        } else {
            h11.o();
        }
        h11.E();
        i a14 = a2.a(h11);
        a2.c(a14, b12, c0551a.d());
        a2.c(a14, dVar, c0551a.b());
        a2.c(a14, qVar, c0551a.c());
        a2.c(a14, y1Var, c0551a.f());
        h11.c();
        b13.invoke(g1.a(g1.b(h11)), h11, 0);
        h11.x(2058660585);
        h11.x(-326682362);
        d0 d0Var = d0.f45271a;
        CheckboxKt.Checkbox(m472SaveForFutureUseElementUI$lambda0(a11), null, null, z11, h11, ((i11 << 9) & 7168) | 48, 4);
        Integer m473SaveForFutureUseElementUI$lambda1 = m473SaveForFutureUseElementUI$lambda1(a12);
        if (m473SaveForFutureUseElementUI$lambda1 != null) {
            String string = resources.getString(m473SaveForFutureUseElementUI$lambda1.intValue(), element.getMerchantName());
            s.f(string, "resources.getString(it, element.merchantName)");
            H6TextKt.H6Text(string, d0Var.b(u.l(aVar, g.f(4), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), c0826a.g()), h11, 0, 0);
        }
        h11.N();
        h11.N();
        h11.q();
        h11.N();
        h11.N();
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$4(z11, element, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SaveForFutureUseElementUI$lambda-0  reason: not valid java name */
    public static final boolean m472SaveForFutureUseElementUI$lambda0(v1<Boolean> v1Var) {
        return v1Var.getValue().booleanValue();
    }

    /* renamed from: SaveForFutureUseElementUI$lambda-1  reason: not valid java name */
    private static final Integer m473SaveForFutureUseElementUI$lambda1(v1<Integer> v1Var) {
        return v1Var.getValue();
    }
}