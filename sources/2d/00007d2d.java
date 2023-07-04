package k20;

/* loaded from: classes5.dex */
public final class s extends x implements m20.f {

    /* renamed from: d  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f34318d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(t00.h r3, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4) {
        /*
            r2 = this;
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.s.g(r4, r0)
            k20.k0 r0 = r3.H()
            java.lang.String r1 = "builtIns.nothingType"
            kotlin.jvm.internal.s.f(r0, r1)
            k20.k0 r3 = r3.I()
            java.lang.String r1 = "builtIns.nullableAnyType"
            kotlin.jvm.internal.s.f(r3, r1)
            r2.<init>(r0, r3)
            r2.f34318d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k20.s.<init>(t00.h, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g):void");
    }

    @Override // k20.x, k20.d0
    public boolean I0() {
        return false;
    }

    @Override // k20.x
    public k0 O0() {
        return Q0();
    }

    @Override // k20.x
    public String R0(kotlin.reflect.jvm.internal.impl.renderer.c renderer, kotlin.reflect.jvm.internal.impl.renderer.f options) {
        kotlin.jvm.internal.s.g(renderer, "renderer");
        kotlin.jvm.internal.s.g(options, "options");
        return "dynamic";
    }

    @Override // k20.j1
    /* renamed from: S0 */
    public s L0(boolean z11) {
        return this;
    }

    @Override // k20.j1
    /* renamed from: T0 */
    public s M0(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // k20.j1
    /* renamed from: U0 */
    public s N0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        kotlin.jvm.internal.s.g(newAnnotations, "newAnnotations");
        return new s(n20.a.h(O0()), newAnnotations);
    }

    @Override // k20.x, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.f34318d;
    }
}