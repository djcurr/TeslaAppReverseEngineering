package v20;

/* loaded from: classes5.dex */
final class x1 extends m {

    /* renamed from: a  reason: collision with root package name */
    private final h00.l<Throwable, vz.b0> f54012a;

    /* JADX WARN: Multi-variable type inference failed */
    public x1(h00.l<? super Throwable, vz.b0> lVar) {
        this.f54012a = lVar;
    }

    @Override // v20.n
    public void a(Throwable th2) {
        this.f54012a.invoke(th2);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
        a(th2);
        return vz.b0.f54756a;
    }

    public String toString() {
        return "InvokeOnCancel[" + s0.a(this.f54012a) + '@' + s0.b(this) + ']';
    }
}