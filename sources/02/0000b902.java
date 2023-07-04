package v20;

import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class s2 extends g2 {

    /* renamed from: e  reason: collision with root package name */
    private final zz.d<vz.b0> f53998e;

    /* JADX WARN: Multi-variable type inference failed */
    public s2(zz.d<? super vz.b0> dVar) {
        this.f53998e = dVar;
    }

    @Override // v20.e0
    public void V(Throwable th2) {
        zz.d<vz.b0> dVar = this.f53998e;
        q.a aVar = vz.q.f54772b;
        dVar.resumeWith(vz.q.b(vz.b0.f54756a));
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
        V(th2);
        return vz.b0.f54756a;
    }
}