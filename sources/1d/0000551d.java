package com.stripe.android.paymentsheet;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.g1;
import c1.i;
import c1.o0;
import c1.s1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.paymentsheet.ui.LpmSelectorTextKt;
import com.stripe.android.ui.core.PaymentsThemeKt;
import com.stripe.android.ui.core.elements.SectionUIKt;
import com.stripe.android.ui.core.elements.SimpleDialogElementUIKt;
import h2.a;
import o1.f;
import p0.e0;
import t1.b0;
import y0.h0;
import z2.k;

/* renamed from: com.stripe.android.paymentsheet.PaymentOptionsAdapterKt$PaymentOptionUi-WtlUe4I$$inlined$ConstraintLayout$2  reason: invalid class name */
/* loaded from: classes6.dex */
public final class PaymentOptionsAdapterKt$PaymentOptionUiWtlUe4I$$inlined$ConstraintLayout$2 extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ int $$dirty1$inlined;
    final /* synthetic */ String $description$inlined;
    final /* synthetic */ int $iconRes$inlined;
    final /* synthetic */ boolean $isEditing$inlined;
    final /* synthetic */ boolean $isEnabled$inlined;
    final /* synthetic */ boolean $isSelected$inlined;
    final /* synthetic */ Integer $labelIcon$inlined;
    final /* synthetic */ String $labelText$inlined;
    final /* synthetic */ h00.a $onHelpersChanged;
    final /* synthetic */ String $onRemoveAccessibilityDescription$inlined;
    final /* synthetic */ h00.a $onRemoveListener$inlined;
    final /* synthetic */ String $removePmDialogTitle$inlined;
    final /* synthetic */ z2.k $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsAdapterKt$PaymentOptionUiWtlUe4I$$inlined$ConstraintLayout$2(z2.k kVar, int i11, h00.a aVar, boolean z11, int i12, boolean z12, h00.a aVar2, String str, String str2, String str3, int i13, Integer num, String str4, boolean z13, int i14) {
        super(2);
        this.$scope = kVar;
        this.$onHelpersChanged = aVar;
        this.$isSelected$inlined = z11;
        this.$$dirty$inlined = i12;
        this.$isEditing$inlined = z12;
        this.$onRemoveListener$inlined = aVar2;
        this.$removePmDialogTitle$inlined = str;
        this.$description$inlined = str2;
        this.$onRemoveAccessibilityDescription$inlined = str3;
        this.$$dirty1$inlined = i13;
        this.$labelIcon$inlined = num;
        this.$labelText$inlined = str4;
        this.$isEnabled$inlined = z13;
        this.$iconRes$inlined = i14;
        this.$$changed = i11;
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return vz.b0.f54756a;
    }

    public final void invoke(c1.i iVar, int i11) {
        z2.e eVar;
        f.a aVar;
        int i12;
        int i13;
        f.a aVar2;
        int i14;
        PaymentOptionsAdapterKt$PaymentOptionUiWtlUe4I$$inlined$ConstraintLayout$2 paymentOptionsAdapterKt$PaymentOptionUiWtlUe4I$$inlined$ConstraintLayout$2;
        z2.e eVar2;
        long g11;
        long g12;
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        int b11 = this.$scope.b();
        this.$scope.c();
        z2.k kVar = this.$scope;
        int i15 = ((this.$$changed >> 3) & 112) | 8;
        if ((i15 & 14) == 0) {
            i15 |= iVar.O(kVar) ? 4 : 2;
        }
        if (((i15 & 91) ^ 18) == 0 && iVar.i()) {
            iVar.G();
            i13 = b11;
            paymentOptionsAdapterKt$PaymentOptionUiWtlUe4I$$inlined$ConstraintLayout$2 = this;
        } else {
            k.b f11 = kVar.f();
            z2.e a11 = f11.a();
            z2.e b12 = f11.b();
            z2.e c11 = f11.c();
            z2.e d11 = f11.d();
            f.a aVar3 = o1.f.f42062f1;
            SectionUIKt.SectionCard(kVar.d(e0.n(p0.u.j(e0.o(aVar3, x2.g.f(64)), x2.g.f(6.0f), BitmapDescriptorFactory.HUE_RED, 2, null), BitmapDescriptorFactory.HUE_RED, 1, null), d11, PaymentOptionsAdapterKt$PaymentOptionUi$2$1.INSTANCE), this.$isSelected$inlined, j1.c.b(iVar, -819905116, true, new PaymentOptionsAdapterKt$PaymentOptionUi$2$2(this.$iconRes$inlined, this.$$dirty$inlined)), iVar, (this.$$dirty$inlined & 112) | 384, 0);
            iVar.x(1719997465);
            if (this.$isSelected$inlined) {
                h0 h0Var = h0.f58131a;
                if (PaymentsThemeKt.m396shouldUseDarkDynamicColor8_81llA(h0Var.a(iVar, 8).j())) {
                    g12 = t1.a0.f51365b.a();
                } else {
                    g12 = t1.a0.f51365b.g();
                }
                long j11 = g12;
                o1.a d12 = o1.a.f42039a.d();
                o1.f b13 = m0.b.b(e0.v(q1.d.a(aVar3, v0.g.d()), x2.g.f(24)), h0Var.a(iVar, 8).j(), null, 2, null);
                iVar.x(-3686930);
                boolean O = iVar.O(d11);
                Object y11 = iVar.y();
                if (O || y11 == c1.i.f8486a.a()) {
                    y11 = new PaymentOptionsAdapterKt$PaymentOptionUi$2$3$1(d11);
                    iVar.p(y11);
                }
                iVar.N();
                o1.f d13 = kVar.d(b13, a11, (h00.l) y11);
                iVar.x(-1990474327);
                f2.z i16 = p0.c.i(d12, false, iVar, 6);
                iVar.x(1376089394);
                x2.d dVar = (x2.d) iVar.A(l0.d());
                x2.q qVar = (x2.q) iVar.A(l0.i());
                y1 y1Var = (y1) iVar.A(l0.m());
                a.C0551a c0551a = h2.a.Y0;
                h00.a<h2.a> a12 = c0551a.a();
                h00.q<g1<h2.a>, c1.i, Integer, vz.b0> b14 = f2.u.b(d13);
                if (!(iVar.k() instanceof c1.e)) {
                    c1.h.c();
                }
                iVar.D();
                if (iVar.f()) {
                    iVar.s(a12);
                } else {
                    iVar.o();
                }
                iVar.E();
                c1.i a13 = a2.a(iVar);
                a2.c(a13, i16, c0551a.d());
                a2.c(a13, dVar, c0551a.b());
                a2.c(a13, qVar, c0551a.c());
                a2.c(a13, y1Var, c0551a.f());
                iVar.c();
                b14.invoke(g1.a(g1.b(iVar)), iVar, 0);
                iVar.x(2058660585);
                iVar.x(-1253629305);
                p0.d dVar2 = p0.d.f45270a;
                aVar = aVar3;
                i12 = 0;
                eVar = c11;
                y0.d0.b(a1.b.a(z0.a.f60037a), null, e0.v(aVar3, x2.g.f(12)), j11, iVar, 432, 0);
                iVar.N();
                iVar.N();
                iVar.q();
                iVar.N();
                iVar.N();
            } else {
                eVar = c11;
                aVar = aVar3;
                i12 = 0;
            }
            iVar.N();
            iVar.x(1719998433);
            if (!this.$isEditing$inlined || this.$onRemoveListener$inlined == null) {
                i13 = b11;
                aVar2 = aVar;
                i14 = -3686930;
                paymentOptionsAdapterKt$PaymentOptionUiWtlUe4I$$inlined$ConstraintLayout$2 = this;
                eVar2 = d11;
            } else {
                iVar.x(-3687241);
                Object y12 = iVar.y();
                i.a aVar4 = c1.i.f8486a;
                if (y12 == aVar4.a()) {
                    y12 = s1.d(Boolean.FALSE, null, 2, null);
                    iVar.p(y12);
                }
                iVar.N();
                o0 o0Var = (o0) y12;
                String str = this.$removePmDialogTitle$inlined;
                String str2 = this.$description$inlined;
                String b15 = k2.e.b(R.string.remove, iVar, i12);
                String b16 = k2.e.b(R.string.cancel, iVar, i12);
                h00.a aVar5 = this.$onRemoveListener$inlined;
                int i17 = this.$$dirty$inlined;
                i13 = b11;
                SimpleDialogElementUIKt.SimpleDialogElementUI(o0Var, str, str2, b15, b16, aVar5, null, iVar, ((i17 >> 18) & 112) | 6 | ((i17 >> 18) & 896) | ((i17 >> 12) & 458752), 64);
                long d14 = h0.f58131a.a(iVar, 8).d();
                if (PaymentsThemeKt.m396shouldUseDarkDynamicColor8_81llA(d14)) {
                    g11 = t1.a0.f51365b.a();
                } else {
                    g11 = t1.a0.f51365b.g();
                }
                long j12 = g11;
                w1.b c12 = k2.c.c(R.drawable.stripe_ic_delete_symbol, iVar, 0);
                t1.b0 b17 = b0.a.b(t1.b0.f51384b, j12, 0, 2, null);
                i14 = -3686930;
                iVar.x(-3686930);
                boolean O2 = iVar.O(d11);
                Object y13 = iVar.y();
                if (O2 || y13 == aVar4.a()) {
                    y13 = new PaymentOptionsAdapterKt$PaymentOptionUi$2$5$1(d11);
                    iVar.p(y13);
                }
                iVar.N();
                f.a aVar6 = aVar;
                o1.f b18 = m0.b.b(q1.d.a(e0.v(kVar.d(aVar6, b12, (h00.l) y13), x2.g.f(20)), v0.g.d()), d14, null, 2, null);
                iVar.x(-3686930);
                boolean O3 = iVar.O(o0Var);
                Object y14 = iVar.y();
                if (O3 || y14 == aVar4.a()) {
                    y14 = new PaymentOptionsAdapterKt$PaymentOptionUi$2$6$1(o0Var);
                    iVar.p(y14);
                }
                iVar.N();
                paymentOptionsAdapterKt$PaymentOptionUiWtlUe4I$$inlined$ConstraintLayout$2 = this;
                aVar2 = aVar6;
                eVar2 = d11;
                m0.o.a(c12, paymentOptionsAdapterKt$PaymentOptionUiWtlUe4I$$inlined$ConstraintLayout$2.$onRemoveAccessibilityDescription$inlined, m0.h.e(b18, false, null, null, (h00.a) y14, 7, null), null, null, BitmapDescriptorFactory.HUE_RED, b17, iVar, ((paymentOptionsAdapterKt$PaymentOptionUiWtlUe4I$$inlined$ConstraintLayout$2.$$dirty1$inlined << 3) & 112) | 8, 56);
            }
            iVar.N();
            long i18 = h0.f58131a.a(iVar, 8).i();
            iVar.x(i14);
            boolean O4 = iVar.O(eVar2);
            Object y15 = iVar.y();
            if (O4 || y15 == c1.i.f8486a.a()) {
                y15 = new PaymentOptionsAdapterKt$PaymentOptionUi$2$7$1(eVar2);
                iVar.p(y15);
            }
            iVar.N();
            o1.f l11 = p0.u.l(kVar.d(aVar2, eVar, (h00.l) y15), x2.g.f(6.0f), x2.g.f(4), x2.g.f(6.0f), BitmapDescriptorFactory.HUE_RED, 8, null);
            iVar.x(i14);
            boolean O5 = iVar.O(paymentOptionsAdapterKt$PaymentOptionUiWtlUe4I$$inlined$ConstraintLayout$2.$description$inlined);
            Object y16 = iVar.y();
            if (O5 || y16 == c1.i.f8486a.a()) {
                y16 = new PaymentOptionsAdapterKt$PaymentOptionUi$2$8$1(paymentOptionsAdapterKt$PaymentOptionUiWtlUe4I$$inlined$ConstraintLayout$2.$description$inlined);
                iVar.p(y16);
            }
            iVar.N();
            o1.f b19 = l2.o.b(l11, false, (h00.l) y16, 1, null);
            Integer num = paymentOptionsAdapterKt$PaymentOptionUiWtlUe4I$$inlined$ConstraintLayout$2.$labelIcon$inlined;
            String str3 = paymentOptionsAdapterKt$PaymentOptionUiWtlUe4I$$inlined$ConstraintLayout$2.$labelText$inlined;
            boolean z11 = paymentOptionsAdapterKt$PaymentOptionUiWtlUe4I$$inlined$ConstraintLayout$2.$isEnabled$inlined;
            int i19 = paymentOptionsAdapterKt$PaymentOptionUiWtlUe4I$$inlined$ConstraintLayout$2.$$dirty$inlined;
            LpmSelectorTextKt.m346LpmSelectorTextT042LqI(num, str3, i18, b19, z11, iVar, ((i19 >> 15) & 14) | ((i19 >> 15) & 112) | ((i19 << 3) & 57344), 0);
        }
        if (paymentOptionsAdapterKt$PaymentOptionUiWtlUe4I$$inlined$ConstraintLayout$2.$scope.b() != i13) {
            paymentOptionsAdapterKt$PaymentOptionUiWtlUe4I$$inlined$ConstraintLayout$2.$onHelpersChanged.mo11invoke();
        }
    }
}