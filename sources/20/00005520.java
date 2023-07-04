package com.stripe.android.paymentsheet;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.g1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h2.a;
import o1.a;
import o1.f;
import p0.a;
import p0.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentOptionsAdapterKt$PaymentOptionUi$2$2 extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $iconRes;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsAdapterKt$PaymentOptionUi$2$2(int i11, int i12) {
        super(2);
        this.$iconRes = i11;
        this.$$dirty = i12;
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
        a.e b11 = p0.a.f45228a.b();
        a.b f11 = o1.a.f42039a.f();
        f.a aVar = o1.f.f42062f1;
        o1.f l11 = e0.l(aVar, BitmapDescriptorFactory.HUE_RED, 1, null);
        int i12 = this.$iconRes;
        int i13 = this.$$dirty;
        iVar.x(-1113030915);
        f2.z a11 = p0.h.a(b11, f11, iVar, 54);
        iVar.x(1376089394);
        x2.d dVar = (x2.d) iVar.A(l0.d());
        x2.q qVar = (x2.q) iVar.A(l0.i());
        y1 y1Var = (y1) iVar.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a12 = c0551a.a();
        h00.q<g1<h2.a>, c1.i, Integer, vz.b0> b12 = f2.u.b(l11);
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
        b12.invoke(g1.a(g1.b(iVar)), iVar, 0);
        iVar.x(2058660585);
        iVar.x(276693625);
        p0.j jVar = p0.j.f45341a;
        m0.o.a(k2.c.c(i12, iVar, (i13 >> 12) & 14), null, e0.z(e0.o(aVar, x2.g.f(40)), x2.g.f(56)), null, null, BitmapDescriptorFactory.HUE_RED, null, iVar, 440, 120);
        iVar.N();
        iVar.N();
        iVar.q();
        iVar.N();
        iVar.N();
    }
}