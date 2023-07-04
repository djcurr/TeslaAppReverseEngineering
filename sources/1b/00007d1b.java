package k20;

import java.util.List;
import k20.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class l0 extends k0 {

    /* renamed from: b  reason: collision with root package name */
    private final w0 f34296b;

    /* renamed from: c  reason: collision with root package name */
    private final List<y0> f34297c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f34298d;

    /* renamed from: e  reason: collision with root package name */
    private final d20.h f34299e;

    /* renamed from: f  reason: collision with root package name */
    private final h00.l<kotlin.reflect.jvm.internal.impl.types.checker.h, k0> f34300f;

    /* JADX WARN: Multi-variable type inference failed */
    public l0(w0 constructor, List<? extends y0> arguments, boolean z11, d20.h memberScope, h00.l<? super kotlin.reflect.jvm.internal.impl.types.checker.h, ? extends k0> refinedTypeFactory) {
        kotlin.jvm.internal.s.g(constructor, "constructor");
        kotlin.jvm.internal.s.g(arguments, "arguments");
        kotlin.jvm.internal.s.g(memberScope, "memberScope");
        kotlin.jvm.internal.s.g(refinedTypeFactory, "refinedTypeFactory");
        this.f34296b = constructor;
        this.f34297c = arguments;
        this.f34298d = z11;
        this.f34299e = memberScope;
        this.f34300f = refinedTypeFactory;
        if (m() instanceof v.d) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + m() + '\n' + H0());
        }
    }

    @Override // k20.d0
    public List<y0> G0() {
        return this.f34297c;
    }

    @Override // k20.d0
    public w0 H0() {
        return this.f34296b;
    }

    @Override // k20.d0
    public boolean I0() {
        return this.f34298d;
    }

    @Override // k20.j1
    /* renamed from: O0 */
    public k0 L0(boolean z11) {
        if (z11 == I0()) {
            return this;
        }
        if (z11) {
            return new i0(this);
        }
        return new h0(this);
    }

    @Override // k20.j1
    /* renamed from: P0 */
    public k0 N0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        kotlin.jvm.internal.s.g(newAnnotations, "newAnnotations");
        return newAnnotations.isEmpty() ? this : new i(this, newAnnotations);
    }

    @Override // k20.j1
    /* renamed from: Q0 */
    public k0 M0(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        k0 invoke = this.f34300f.invoke(kotlinTypeRefiner);
        return invoke == null ? this : invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b();
    }

    @Override // k20.d0
    public d20.h m() {
        return this.f34299e;
    }
}