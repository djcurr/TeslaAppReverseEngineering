package k20;

/* loaded from: classes5.dex */
public final class a extends o {

    /* renamed from: b  reason: collision with root package name */
    private final k0 f34215b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f34216c;

    public a(k0 delegate, k0 abbreviation) {
        kotlin.jvm.internal.s.g(delegate, "delegate");
        kotlin.jvm.internal.s.g(abbreviation, "abbreviation");
        this.f34215b = delegate;
        this.f34216c = abbreviation;
    }

    public final k0 E() {
        return Q0();
    }

    @Override // k20.o
    protected k0 Q0() {
        return this.f34215b;
    }

    public final k0 T0() {
        return this.f34216c;
    }

    @Override // k20.k0
    /* renamed from: U0 */
    public a O0(boolean z11) {
        return new a(Q0().O0(z11), this.f34216c.O0(z11));
    }

    @Override // k20.o
    /* renamed from: V0 */
    public a R0(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a((k0) kotlinTypeRefiner.g(Q0()), (k0) kotlinTypeRefiner.g(this.f34216c));
    }

    @Override // k20.k0
    /* renamed from: W0 */
    public a P0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        kotlin.jvm.internal.s.g(newAnnotations, "newAnnotations");
        return new a(Q0().P0(newAnnotations), this.f34216c);
    }

    @Override // k20.o
    /* renamed from: X0 */
    public a S0(k0 delegate) {
        kotlin.jvm.internal.s.g(delegate, "delegate");
        return new a(delegate, this.f34216c);
    }
}