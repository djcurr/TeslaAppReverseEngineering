package k20;

/* loaded from: classes5.dex */
public final class m0 extends o implements g1 {

    /* renamed from: b  reason: collision with root package name */
    private final k0 f34304b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f34305c;

    public m0(k0 delegate, d0 enhancement) {
        kotlin.jvm.internal.s.g(delegate, "delegate");
        kotlin.jvm.internal.s.g(enhancement, "enhancement");
        this.f34304b = delegate;
        this.f34305c = enhancement;
    }

    @Override // k20.j1
    /* renamed from: O0 */
    public k0 L0(boolean z11) {
        return (k0) h1.e(getOrigin().O0(z11), d0().K0().L0(z11));
    }

    @Override // k20.j1
    /* renamed from: P0 */
    public k0 N0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        kotlin.jvm.internal.s.g(newAnnotations, "newAnnotations");
        return (k0) h1.e(getOrigin().P0(newAnnotations), d0());
    }

    @Override // k20.o
    protected k0 Q0() {
        return this.f34304b;
    }

    @Override // k20.g1
    /* renamed from: T0 */
    public k0 getOrigin() {
        return Q0();
    }

    @Override // k20.o
    /* renamed from: U0 */
    public m0 R0(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new m0((k0) kotlinTypeRefiner.g(Q0()), kotlinTypeRefiner.g(d0()));
    }

    @Override // k20.o
    /* renamed from: V0 */
    public m0 S0(k0 delegate) {
        kotlin.jvm.internal.s.g(delegate, "delegate");
        return new m0(delegate, d0());
    }

    @Override // k20.g1
    public d0 d0() {
        return this.f34305c;
    }
}