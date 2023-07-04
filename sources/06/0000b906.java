package v20;

/* loaded from: classes5.dex */
final class t2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final j0 f54003a;

    /* renamed from: b  reason: collision with root package name */
    private final o<vz.b0> f54004b;

    /* JADX WARN: Multi-variable type inference failed */
    public t2(j0 j0Var, o<? super vz.b0> oVar) {
        this.f54003a = j0Var;
        this.f54004b = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f54004b.v(this.f54003a, vz.b0.f54756a);
    }
}