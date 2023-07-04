package k20;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class e extends k0 {

    /* renamed from: b  reason: collision with root package name */
    private final w0 f34237b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f34238c;

    /* renamed from: d  reason: collision with root package name */
    private final d20.h f34239d;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public e(w0 originalTypeVariable, boolean z11) {
        kotlin.jvm.internal.s.g(originalTypeVariable, "originalTypeVariable");
        this.f34237b = originalTypeVariable;
        this.f34238c = z11;
        d20.h h11 = v.h(kotlin.jvm.internal.s.p("Scope for stub type: ", originalTypeVariable));
        kotlin.jvm.internal.s.f(h11, "createErrorScope(\"Scope …: $originalTypeVariable\")");
        this.f34239d = h11;
    }

    @Override // k20.d0
    public List<y0> G0() {
        List<y0> i11;
        i11 = wz.w.i();
        return i11;
    }

    @Override // k20.d0
    public boolean I0() {
        return this.f34238c;
    }

    @Override // k20.j1
    /* renamed from: O0 */
    public k0 L0(boolean z11) {
        return z11 == I0() ? this : R0(z11);
    }

    @Override // k20.j1
    /* renamed from: P0 */
    public k0 N0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        kotlin.jvm.internal.s.g(newAnnotations, "newAnnotations");
        return this;
    }

    public final w0 Q0() {
        return this.f34237b;
    }

    public abstract e R0(boolean z11);

    @Override // k20.j1
    /* renamed from: S0 */
    public e M0(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b();
    }

    @Override // k20.d0
    public d20.h m() {
        return this.f34239d;
    }
}