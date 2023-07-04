package k20;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class y extends x implements l {

    /* renamed from: e  reason: collision with root package name */
    public static boolean f34350e;

    /* renamed from: d  reason: collision with root package name */
    private boolean f34351d;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(k0 lowerBound, k0 upperBound) {
        super(lowerBound, upperBound);
        kotlin.jvm.internal.s.g(lowerBound, "lowerBound");
        kotlin.jvm.internal.s.g(upperBound, "upperBound");
    }

    private final void T0() {
        if (!f34350e || this.f34351d) {
            return;
        }
        this.f34351d = true;
        a0.b(P0());
        a0.b(Q0());
        kotlin.jvm.internal.s.c(P0(), Q0());
        kotlin.reflect.jvm.internal.impl.types.checker.f.f35149a.c(P0(), Q0());
    }

    @Override // k20.j1
    public j1 L0(boolean z11) {
        return e0.d(P0().O0(z11), Q0().O0(z11));
    }

    @Override // k20.l
    public d0 M(d0 replacement) {
        j1 d11;
        kotlin.jvm.internal.s.g(replacement, "replacement");
        j1 K0 = replacement.K0();
        if (K0 instanceof x) {
            d11 = K0;
        } else if (!(K0 instanceof k0)) {
            throw new NoWhenBranchMatchedException();
        } else {
            k0 k0Var = (k0) K0;
            d11 = e0.d(k0Var, k0Var.O0(true));
        }
        return h1.b(d11, K0);
    }

    @Override // k20.j1
    public j1 N0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        kotlin.jvm.internal.s.g(newAnnotations, "newAnnotations");
        return e0.d(P0().P0(newAnnotations), Q0().P0(newAnnotations));
    }

    @Override // k20.x
    public k0 O0() {
        T0();
        return P0();
    }

    @Override // k20.x
    public String R0(kotlin.reflect.jvm.internal.impl.renderer.c renderer, kotlin.reflect.jvm.internal.impl.renderer.f options) {
        kotlin.jvm.internal.s.g(renderer, "renderer");
        kotlin.jvm.internal.s.g(options, "options");
        if (options.i()) {
            return CoreConstants.LEFT_PARENTHESIS_CHAR + renderer.w(P0()) + CallerDataConverter.DEFAULT_RANGE_DELIMITER + renderer.w(Q0()) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return renderer.t(renderer.w(P0()), renderer.w(Q0()), n20.a.h(this));
    }

    @Override // k20.j1
    /* renamed from: S0 */
    public x M0(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new y((k0) kotlinTypeRefiner.g(P0()), (k0) kotlinTypeRefiner.g(Q0()));
    }

    @Override // k20.x
    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + P0() + CallerDataConverter.DEFAULT_RANGE_DELIMITER + Q0() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // k20.l
    public boolean w() {
        return (P0().H0().n() instanceof w00.s0) && kotlin.jvm.internal.s.c(P0().H0(), Q0().H0());
    }
}