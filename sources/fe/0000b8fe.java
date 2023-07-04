package v20;

import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class r2<T> extends g2 {

    /* renamed from: e  reason: collision with root package name */
    private final p<T> f53996e;

    /* JADX WARN: Multi-variable type inference failed */
    public r2(p<? super T> pVar) {
        this.f53996e = pVar;
    }

    @Override // v20.e0
    public void V(Throwable th2) {
        Object d02 = W().d0();
        if (r0.a() && !(!(d02 instanceof v1))) {
            throw new AssertionError();
        }
        if (d02 instanceof c0) {
            p<T> pVar = this.f53996e;
            q.a aVar = vz.q.f54772b;
            pVar.resumeWith(vz.q.b(vz.r.a(((c0) d02).f53902a)));
            return;
        }
        p<T> pVar2 = this.f53996e;
        q.a aVar2 = vz.q.f54772b;
        pVar2.resumeWith(vz.q.b(i2.h(d02)));
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
        V(th2);
        return vz.b0.f54756a;
    }
}