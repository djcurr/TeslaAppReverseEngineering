package com.stripe.android.ui.core.elements;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.g1;
import c1.i;
import f2.z;
import h00.p;
import h2.a;
import kotlin.jvm.internal.u;
import o1.f;
import p0.a;
import p0.h;
import p0.j;
import vz.b0;
import x2.d;
import x2.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SectionUIKt$SectionCard$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ p<i, Integer, b0> $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SectionUIKt$SectionCard$1(p<? super i, ? super Integer, b0> pVar, int i11) {
        super(2);
        this.$content = pVar;
        this.$$dirty = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        p<i, Integer, b0> pVar = this.$content;
        int i12 = this.$$dirty;
        iVar.x(-1113030915);
        f.a aVar = f.f42062f1;
        z a11 = h.a(a.f45228a.h(), o1.a.f42039a.h(), iVar, 0);
        iVar.x(1376089394);
        d dVar = (d) iVar.A(l0.d());
        q qVar = (q) iVar.A(l0.i());
        y1 y1Var = (y1) iVar.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a12 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, b0> b11 = f2.u.b(aVar);
        if (!(iVar.k() instanceof e)) {
            c1.h.c();
        }
        iVar.D();
        if (iVar.f()) {
            iVar.s(a12);
        } else {
            iVar.o();
        }
        iVar.E();
        i a13 = a2.a(iVar);
        a2.c(a13, a11, c0551a.d());
        a2.c(a13, dVar, c0551a.b());
        a2.c(a13, qVar, c0551a.c());
        a2.c(a13, y1Var, c0551a.f());
        iVar.c();
        b11.invoke(g1.a(g1.b(iVar)), iVar, 0);
        iVar.x(2058660585);
        iVar.x(276693625);
        j jVar = j.f45341a;
        pVar.invoke(iVar, Integer.valueOf((i12 >> 6) & 14));
        iVar.N();
        iVar.N();
        iVar.q();
        iVar.N();
        iVar.N();
    }
}