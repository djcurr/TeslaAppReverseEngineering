package k20;

/* loaded from: classes5.dex */
public abstract class p extends o {

    /* renamed from: b  reason: collision with root package name */
    private final k0 f34308b;

    public p(k0 delegate) {
        kotlin.jvm.internal.s.g(delegate, "delegate");
        this.f34308b = delegate;
    }

    @Override // k20.j1
    /* renamed from: O0 */
    public k0 L0(boolean z11) {
        return z11 == I0() ? this : Q0().O0(z11).P0(getAnnotations());
    }

    @Override // k20.o
    protected k0 Q0() {
        return this.f34308b;
    }

    @Override // k20.k0
    /* renamed from: T0 */
    public p P0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        kotlin.jvm.internal.s.g(newAnnotations, "newAnnotations");
        return newAnnotations != getAnnotations() ? new i(this, newAnnotations) : this;
    }
}