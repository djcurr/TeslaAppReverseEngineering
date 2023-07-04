package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.g1;
import c1.h;
import c1.i;
import c1.o0;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.ui.core.PaymentsThemeKt;
import f2.z;
import h00.p;
import h2.a;
import k2.c;
import kotlin.jvm.internal.u;
import m0.o;
import o1.a;
import o1.f;
import p0.a;
import p0.d0;
import p0.e0;
import vz.b0;
import w1.b;
import x2.d;
import x2.g;
import x2.q;
import y0.h0;
import y0.o1;

/* loaded from: classes6.dex */
final class USBankAccountFormFragment$AccountDetailsForm$1$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $bankIcon;
    final /* synthetic */ String $bankName;
    final /* synthetic */ String $last4;
    final /* synthetic */ o0<Boolean> $openDialog;
    final /* synthetic */ v1<Boolean> $processing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$AccountDetailsForm$1$1(v1<Boolean> v1Var, o0<Boolean> o0Var, int i11, String str, String str2) {
        super(2);
        this.$processing = v1Var;
        this.$openDialog = o0Var;
        this.$bankIcon = i11;
        this.$bankName = str;
        this.$last4 = str2;
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r30v0, types: [c1.i, java.lang.Object] */
    public final void invoke(i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        f.a aVar = f.f42062f1;
        f h11 = p0.u.h(e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null), g.f(8));
        a.C0826a c0826a = o1.a.f42039a;
        a.c g11 = c0826a.g();
        p0.a aVar2 = p0.a.f45228a;
        a.e e11 = aVar2.e();
        v1<Boolean> v1Var = this.$processing;
        o0<Boolean> o0Var = this.$openDialog;
        int i12 = this.$bankIcon;
        String str = this.$bankName;
        String str2 = this.$last4;
        iVar.x(-1989997165);
        z b11 = p0.b0.b(e11, g11, iVar, 54);
        iVar.x(1376089394);
        d dVar = (d) iVar.A(l0.d());
        q qVar = (q) iVar.A(l0.i());
        y1 y1Var = (y1) iVar.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a11 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, b0> b12 = f2.u.b(h11);
        if (!(iVar.k() instanceof e)) {
            h.c();
        }
        iVar.D();
        if (iVar.f()) {
            iVar.s(a11);
        } else {
            iVar.o();
        }
        iVar.E();
        i a12 = a2.a(iVar);
        a2.c(a12, b11, c0551a.d());
        a2.c(a12, dVar, c0551a.b());
        a2.c(a12, qVar, c0551a.c());
        a2.c(a12, y1Var, c0551a.f());
        iVar.c();
        b12.invoke(g1.a(g1.b(iVar)), iVar, 0);
        iVar.x(2058660585);
        iVar.x(-326682362);
        d0 d0Var = d0.f45271a;
        a.c g12 = c0826a.g();
        iVar.x(-1989997165);
        z b13 = p0.b0.b(aVar2.g(), g12, iVar, 48);
        iVar.x(1376089394);
        d dVar2 = (d) iVar.A(l0.d());
        q qVar2 = (q) iVar.A(l0.i());
        y1 y1Var2 = (y1) iVar.A(l0.m());
        h00.a<h2.a> a13 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, b0> b14 = f2.u.b(aVar);
        if (!(iVar.k() instanceof e)) {
            h.c();
        }
        iVar.D();
        if (iVar.f()) {
            iVar.s(a13);
        } else {
            iVar.o();
        }
        iVar.E();
        i a14 = a2.a(iVar);
        a2.c(a14, b13, c0551a.d());
        a2.c(a14, dVar2, c0551a.b());
        a2.c(a14, qVar2, c0551a.c());
        a2.c(a14, y1Var2, c0551a.f());
        iVar.c();
        b14.invoke(g1.a(g1.b(iVar)), iVar, 0);
        iVar.x(2058660585);
        iVar.x(-326682362);
        o.a(c.c(i12, iVar, 0), null, e0.z(e0.o(aVar, g.f(40)), g.f(56)), null, null, BitmapDescriptorFactory.HUE_RED, null, iVar, 440, 120);
        o1.b(((Object) str) + " ••••" + ((Object) str2), q1.a.a(aVar, v1Var.getValue().booleanValue() ? 0.5f : 1.0f), PaymentsThemeKt.getPaymentsColors(h0.f58131a, iVar, 8).m384getOnComponent0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 0, 0, 65528);
        iVar.N();
        iVar.N();
        iVar.q();
        iVar.N();
        iVar.N();
        b c11 = c.c(R.drawable.stripe_ic_clear, iVar, 0);
        float f11 = 20;
        f a15 = q1.a.a(e0.z(e0.o(aVar, g.f(f11)), g.f(f11)), v1Var.getValue().booleanValue() ? 0.5f : 1.0f);
        iVar.x(-3686552);
        boolean O = iVar.O(v1Var) | iVar.O(o0Var);
        Object y11 = iVar.y();
        if (O || y11 == i.f8486a.a()) {
            y11 = new USBankAccountFormFragment$AccountDetailsForm$1$1$1$2$1(v1Var, o0Var);
            iVar.p(y11);
        }
        iVar.N();
        o.a(c11, null, m0.h.e(a15, false, null, null, y11, 7, null), null, null, BitmapDescriptorFactory.HUE_RED, null, iVar, 56, 120);
        iVar.N();
        iVar.N();
        iVar.q();
        iVar.N();
        iVar.N();
    }
}