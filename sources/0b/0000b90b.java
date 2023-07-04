package v20;

/* loaded from: classes5.dex */
public final class v extends b2 implements u {

    /* renamed from: e  reason: collision with root package name */
    public final w f54010e;

    public v(w wVar) {
        this.f54010e = wVar;
    }

    @Override // v20.e0
    public void V(Throwable th2) {
        this.f54010e.n0(W());
    }

    @Override // v20.u
    public boolean c(Throwable th2) {
        return W().M(th2);
    }

    @Override // v20.u
    public a2 getParent() {
        return W();
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
        V(th2);
        return vz.b0.f54756a;
    }
}