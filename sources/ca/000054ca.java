package com.stripe.android.paymentsheet;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.g1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.elements.SectionUIKt;
import h2.a;
import o1.f;
import p0.e0;
import t1.b0;

/* loaded from: classes6.dex */
final class PaymentMethodsUIKt$PaymentMethodUI$1 extends kotlin.jvm.internal.u implements h00.q<x2.g, c1.i, Integer, vz.b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $color;
    final /* synthetic */ int $iconRes;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ int $itemIndex;
    final /* synthetic */ h00.p<c1.i, Integer, vz.b0> $lpmTextSelector;
    final /* synthetic */ o1.f $modifier;
    final /* synthetic */ h00.l<Integer, vz.b0> $onItemSelectedListener;
    final /* synthetic */ boolean $tintOnSelected;
    final /* synthetic */ float $viewWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.PaymentMethodsUIKt$PaymentMethodUI$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ long $color;
        final /* synthetic */ int $iconRes;
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> $lpmTextSelector;
        final /* synthetic */ boolean $tintOnSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(boolean z11, long j11, int i11, int i12, h00.p<? super c1.i, ? super Integer, vz.b0> pVar) {
            super(2);
            this.$tintOnSelected = z11;
            this.$color = j11;
            this.$iconRes = i11;
            this.$$dirty = i12;
            this.$lpmTextSelector = pVar;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            boolean z11 = this.$tintOnSelected;
            long j11 = this.$color;
            int i12 = this.$iconRes;
            int i13 = this.$$dirty;
            h00.p<c1.i, Integer, vz.b0> pVar = this.$lpmTextSelector;
            iVar.x(-1113030915);
            f.a aVar = o1.f.f42062f1;
            f2.z a11 = p0.h.a(p0.a.f45228a.h(), o1.a.f42039a.h(), iVar, 0);
            iVar.x(1376089394);
            x2.d dVar = (x2.d) iVar.A(l0.d());
            x2.q qVar = (x2.q) iVar.A(l0.i());
            y1 y1Var = (y1) iVar.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a12 = c0551a.a();
            h00.q<g1<h2.a>, c1.i, Integer, vz.b0> b11 = f2.u.b(aVar);
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
            a2.c(a13, a11, c0551a.d());
            a2.c(a13, dVar, c0551a.b());
            a2.c(a13, qVar, c0551a.c());
            a2.c(a13, y1Var, c0551a.f());
            iVar.c();
            b11.invoke(g1.a(g1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(276693625);
            p0.j jVar = p0.j.f45341a;
            m0.o.a(k2.c.c(i12, iVar, (i13 >> 3) & 14), null, p0.u.l(aVar, x2.g.f(12.0f), x2.g.f(12.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null), null, null, BitmapDescriptorFactory.HUE_RED, z11 ? b0.a.b(t1.b0.f51384b, j11, 0, 2, null) : null, iVar, 56, 56);
            pVar.mo160invoke(iVar, 6);
            iVar.N();
            iVar.N();
            iVar.q();
            iVar.N();
            iVar.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsUIKt$PaymentMethodUI$1(o1.f fVar, boolean z11, float f11, boolean z12, h00.l<? super Integer, vz.b0> lVar, int i11, int i12, boolean z13, long j11, int i13, h00.p<? super c1.i, ? super Integer, vz.b0> pVar) {
        super(3);
        this.$modifier = fVar;
        this.$isEnabled = z11;
        this.$viewWidth = f11;
        this.$isSelected = z12;
        this.$onItemSelectedListener = lVar;
        this.$itemIndex = i11;
        this.$$dirty = i12;
        this.$tintOnSelected = z13;
        this.$color = j11;
        this.$iconRes = i13;
        this.$lpmTextSelector = pVar;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ vz.b0 invoke(x2.g gVar, c1.i iVar, Integer num) {
        m299invoke8Feqmps(gVar.l(), iVar, num.intValue());
        return vz.b0.f54756a;
    }

    /* renamed from: invoke-8Feqmps  reason: not valid java name */
    public final void m299invoke8Feqmps(float f11, c1.i iVar, int i11) {
        int i12;
        if ((i11 & 14) == 0) {
            i12 = i11 | (iVar.b(f11) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (((i12 & 91) ^ 18) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        o1.f j11 = p0.u.j(e0.z(e0.o(q1.a.a(this.$modifier, this.$isEnabled ? 1.0f : 0.6f), x2.g.f(60)), ((x2.g) yz.a.d(x2.g.c(this.$viewWidth), x2.g.c(x2.g.f(x2.g.f(f11 + x2.g.f(x2.g.f(6.0f) * 2)) + x2.g.f(12.0f))))).l()), x2.g.f(6.0f), BitmapDescriptorFactory.HUE_RED, 2, null);
        boolean z11 = this.$isSelected;
        boolean z12 = this.$isEnabled;
        h00.l<Integer, vz.b0> lVar = this.$onItemSelectedListener;
        Integer valueOf = Integer.valueOf(this.$itemIndex);
        h00.l<Integer, vz.b0> lVar2 = this.$onItemSelectedListener;
        int i13 = this.$itemIndex;
        iVar.x(-3686552);
        boolean O = iVar.O(lVar) | iVar.O(valueOf);
        Object y11 = iVar.y();
        if (O || y11 == c1.i.f8486a.a()) {
            y11 = new PaymentMethodsUIKt$PaymentMethodUI$1$1$1(lVar2, i13);
            iVar.p(y11);
        }
        iVar.N();
        SectionUIKt.SectionCard(u0.a.c(j11, z11, z12, null, (h00.a) y11, 4, null), this.$isSelected, j1.c.b(iVar, -819892202, true, new AnonymousClass2(this.$tintOnSelected, this.$color, this.$iconRes, this.$$dirty, this.$lpmTextSelector)), iVar, ((this.$$dirty >> 6) & 112) | 384, 0);
    }
}