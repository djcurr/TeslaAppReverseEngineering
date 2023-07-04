package k0;

import f2.v;
import o1.f;

/* loaded from: classes.dex */
public abstract class s implements f2.v {
    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) v.a.b(this, r11, pVar);
    }

    @Override // f2.v
    public final int L(f2.k kVar, f2.j measurable, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        return measurable.a(i11);
    }

    @Override // f2.v
    public final int S(f2.k kVar, f2.j measurable, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        return measurable.u(i11);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) v.a.c(this, r11, pVar);
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return v.a.h(this, fVar);
    }

    @Override // f2.v
    public final int h0(f2.k kVar, f2.j measurable, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        return measurable.T(i11);
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return v.a.a(this, lVar);
    }

    @Override // f2.v
    public final int t(f2.k kVar, f2.j measurable, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        return measurable.S(i11);
    }
}