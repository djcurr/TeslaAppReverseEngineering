package y00;

/* loaded from: classes5.dex */
public abstract class z extends k implements w00.a0 {

    /* renamed from: e  reason: collision with root package name */
    private final u10.c f58934e;

    /* renamed from: f  reason: collision with root package name */
    private final String f58935f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(w00.x module, u10.c fqName) {
        super(module, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b(), fqName.h(), w00.n0.f55303a);
        kotlin.jvm.internal.s.g(module, "module");
        kotlin.jvm.internal.s.g(fqName, "fqName");
        this.f58934e = fqName;
        this.f58935f = "package " + fqName + " of " + module;
    }

    @Override // w00.a0
    public final u10.c e() {
        return this.f58934e;
    }

    @Override // y00.k, w00.l
    public w00.n0 f() {
        w00.n0 NO_SOURCE = w00.n0.f55303a;
        kotlin.jvm.internal.s.f(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // y00.j
    public String toString() {
        return this.f58935f;
    }

    @Override // w00.i
    public <R, D> R v0(w00.k<R, D> visitor, D d11) {
        kotlin.jvm.internal.s.g(visitor, "visitor");
        return visitor.d(this, d11);
    }

    @Override // y00.k, w00.i
    public w00.x b() {
        return (w00.x) super.b();
    }
}