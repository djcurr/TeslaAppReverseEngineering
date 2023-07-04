package v20;

/* loaded from: classes5.dex */
final class h1 extends m {

    /* renamed from: a  reason: collision with root package name */
    private final g1 f53927a;

    public h1(g1 g1Var) {
        this.f53927a = g1Var;
    }

    @Override // v20.n
    public void a(Throwable th2) {
        this.f53927a.dispose();
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
        a(th2);
        return vz.b0.f54756a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f53927a + ']';
    }
}