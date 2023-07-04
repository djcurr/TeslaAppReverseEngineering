package k20;

import java.util.List;

/* loaded from: classes5.dex */
public abstract class x extends j1 implements m20.g {

    /* renamed from: b  reason: collision with root package name */
    private final k0 f34345b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f34346c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(k0 lowerBound, k0 upperBound) {
        super(null);
        kotlin.jvm.internal.s.g(lowerBound, "lowerBound");
        kotlin.jvm.internal.s.g(upperBound, "upperBound");
        this.f34345b = lowerBound;
        this.f34346c = upperBound;
    }

    @Override // k20.d0
    public List<y0> G0() {
        return O0().G0();
    }

    @Override // k20.d0
    public w0 H0() {
        return O0().H0();
    }

    @Override // k20.d0
    public boolean I0() {
        return O0().I0();
    }

    public abstract k0 O0();

    public final k0 P0() {
        return this.f34345b;
    }

    public final k0 Q0() {
        return this.f34346c;
    }

    public abstract String R0(kotlin.reflect.jvm.internal.impl.renderer.c cVar, kotlin.reflect.jvm.internal.impl.renderer.f fVar);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return O0().getAnnotations();
    }

    @Override // k20.d0
    public d20.h m() {
        return O0().m();
    }

    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.c.f35081c.w(this);
    }
}