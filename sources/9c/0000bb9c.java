package w00;

/* loaded from: classes5.dex */
public abstract class n extends q {

    /* renamed from: a  reason: collision with root package name */
    private final z0 f55302a;

    public n(z0 delegate) {
        kotlin.jvm.internal.s.g(delegate, "delegate");
        this.f55302a = delegate;
    }

    @Override // w00.q
    public z0 b() {
        return this.f55302a;
    }

    @Override // w00.q
    public String c() {
        return b().b();
    }

    @Override // w00.q
    public q f() {
        q j11 = p.j(b().d());
        kotlin.jvm.internal.s.f(j11, "toDescriptorVisibility(delegate.normalize())");
        return j11;
    }
}