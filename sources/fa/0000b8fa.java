package v20;

/* loaded from: classes5.dex */
final class q2 extends f {

    /* renamed from: a  reason: collision with root package name */
    private final kotlinx.coroutines.internal.s f53990a;

    public q2(kotlinx.coroutines.internal.s sVar) {
        this.f53990a = sVar;
    }

    @Override // v20.n
    public void a(Throwable th2) {
        this.f53990a.N();
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
        a(th2);
        return vz.b0.f54756a;
    }

    public String toString() {
        return "RemoveOnCancel[" + this.f53990a + ']';
    }
}