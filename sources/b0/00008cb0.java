package nr;

import nr.s;
import v20.o0;

/* loaded from: classes2.dex */
public final class e implements s {

    /* renamed from: a  reason: collision with root package name */
    public static final e f41794a = new e();

    private e() {
    }

    @Override // nr.s
    public void a(o0 o0Var, s.c cVar) {
        s.a.d(this, o0Var, cVar);
    }

    @Override // nr.s
    public <P, S, O, R> R b(P p11, S s11, a<? extends P, S, ? super O> aVar, h00.q<? super P, ? super S, ? super s.b<P, S, O>, ? extends R> qVar, s.c cVar) {
        return (R) s.a.c(this, p11, s11, aVar, qVar, cVar);
    }

    @Override // nr.s
    public <P, S> S c(P p11, P p12, S s11, h00.q<? super P, ? super P, ? super S, ? extends S> qVar, s.c cVar) {
        return (S) s.a.b(this, p11, p12, s11, qVar, cVar);
    }

    @Override // nr.s
    public <S> i d(S s11, h00.l<? super S, i> lVar, s.c cVar) {
        return s.a.e(this, s11, lVar, cVar);
    }

    @Override // nr.s
    public <P, S> S e(P p11, i iVar, h00.p<? super P, ? super i, ? extends S> pVar, s.c cVar) {
        return (S) s.a.a(this, p11, iVar, pVar, cVar);
    }
}