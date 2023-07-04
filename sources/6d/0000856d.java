package m0;

import o1.f;
import q1.h;

/* loaded from: classes.dex */
final class s implements q1.h {

    /* renamed from: a  reason: collision with root package name */
    private final q f38078a;

    public s(q indicationInstance) {
        kotlin.jvm.internal.s.g(indicationInstance, "indicationInstance");
        this.f38078a = indicationInstance;
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) h.a.b(this, r11, pVar);
    }

    @Override // q1.h
    public void X(v1.c cVar) {
        kotlin.jvm.internal.s.g(cVar, "<this>");
        this.f38078a.a(cVar);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) h.a.c(this, r11, pVar);
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return h.a.d(this, fVar);
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return h.a.a(this, lVar);
    }
}