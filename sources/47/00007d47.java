package k20;

/* loaded from: classes5.dex */
public final class z extends x implements g1 {

    /* renamed from: d  reason: collision with root package name */
    private final x f34352d;

    /* renamed from: e  reason: collision with root package name */
    private final d0 f34353e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(x origin, d0 enhancement) {
        super(origin.P0(), origin.Q0());
        kotlin.jvm.internal.s.g(origin, "origin");
        kotlin.jvm.internal.s.g(enhancement, "enhancement");
        this.f34352d = origin;
        this.f34353e = enhancement;
    }

    @Override // k20.j1
    public j1 L0(boolean z11) {
        return h1.e(getOrigin().L0(z11), d0().K0().L0(z11));
    }

    @Override // k20.j1
    public j1 N0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        kotlin.jvm.internal.s.g(newAnnotations, "newAnnotations");
        return h1.e(getOrigin().N0(newAnnotations), d0());
    }

    @Override // k20.x
    public k0 O0() {
        return getOrigin().O0();
    }

    @Override // k20.x
    public String R0(kotlin.reflect.jvm.internal.impl.renderer.c renderer, kotlin.reflect.jvm.internal.impl.renderer.f options) {
        kotlin.jvm.internal.s.g(renderer, "renderer");
        kotlin.jvm.internal.s.g(options, "options");
        if (options.d()) {
            return renderer.w(d0());
        }
        return getOrigin().R0(renderer, options);
    }

    @Override // k20.g1
    /* renamed from: S0 */
    public x getOrigin() {
        return this.f34352d;
    }

    @Override // k20.j1
    /* renamed from: T0 */
    public z M0(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new z((x) kotlinTypeRefiner.g(getOrigin()), kotlinTypeRefiner.g(d0()));
    }

    @Override // k20.g1
    public d0 d0() {
        return this.f34353e;
    }
}