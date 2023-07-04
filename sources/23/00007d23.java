package k20;

/* loaded from: classes5.dex */
public final class o0 extends z0 {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f34307a;

    public o0(t00.h kotlinBuiltIns) {
        kotlin.jvm.internal.s.g(kotlinBuiltIns, "kotlinBuiltIns");
        k0 I = kotlinBuiltIns.I();
        kotlin.jvm.internal.s.f(I, "kotlinBuiltIns.nullableAnyType");
        this.f34307a = I;
    }

    @Override // k20.y0
    public boolean a() {
        return true;
    }

    @Override // k20.y0
    public k1 b() {
        return k1.OUT_VARIANCE;
    }

    @Override // k20.y0
    public d0 getType() {
        return this.f34307a;
    }

    @Override // k20.y0
    public y0 m(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}