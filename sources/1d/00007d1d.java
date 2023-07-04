package k20;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class m extends o implements l, m20.e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f34301d = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private final k0 f34302b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f34303c;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean a(j1 j1Var) {
            return (j1Var.H0() instanceof kotlin.reflect.jvm.internal.impl.types.checker.o) || (j1Var.H0().n() instanceof w00.s0) || (j1Var instanceof kotlin.reflect.jvm.internal.impl.types.checker.j) || (j1Var instanceof r0);
        }

        public static /* synthetic */ m c(a aVar, j1 j1Var, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            return aVar.b(j1Var, z11);
        }

        private final boolean d(j1 j1Var, boolean z11) {
            if (a(j1Var)) {
                if (j1Var instanceof r0) {
                    return f1.m(j1Var);
                }
                if (z11 && (j1Var.H0().n() instanceof w00.s0)) {
                    return f1.m(j1Var);
                }
                return !kotlin.reflect.jvm.internal.impl.types.checker.p.f35175a.a(j1Var);
            }
            return false;
        }

        public final m b(j1 type, boolean z11) {
            kotlin.jvm.internal.s.g(type, "type");
            if (type instanceof m) {
                return (m) type;
            }
            if (d(type, z11)) {
                if (type instanceof x) {
                    x xVar = (x) type;
                    kotlin.jvm.internal.s.c(xVar.P0().H0(), xVar.Q0().H0());
                }
                return new m(a0.c(type), z11, null);
            }
            return null;
        }
    }

    private m(k0 k0Var, boolean z11) {
        this.f34302b = k0Var;
        this.f34303c = z11;
    }

    public /* synthetic */ m(k0 k0Var, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(k0Var, z11);
    }

    @Override // k20.o, k20.d0
    public boolean I0() {
        return false;
    }

    @Override // k20.l
    public d0 M(d0 replacement) {
        kotlin.jvm.internal.s.g(replacement, "replacement");
        return n0.e(replacement.K0(), this.f34303c);
    }

    @Override // k20.j1
    /* renamed from: O0 */
    public k0 L0(boolean z11) {
        return z11 ? Q0().O0(z11) : this;
    }

    @Override // k20.o
    protected k0 Q0() {
        return this.f34302b;
    }

    public final k0 T0() {
        return this.f34302b;
    }

    @Override // k20.k0
    /* renamed from: U0 */
    public m P0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        kotlin.jvm.internal.s.g(newAnnotations, "newAnnotations");
        return new m(Q0().P0(newAnnotations), this.f34303c);
    }

    @Override // k20.o
    /* renamed from: V0 */
    public m S0(k0 delegate) {
        kotlin.jvm.internal.s.g(delegate, "delegate");
        return new m(delegate, this.f34303c);
    }

    @Override // k20.k0
    public String toString() {
        return Q0() + "!!";
    }

    @Override // k20.l
    public boolean w() {
        return (Q0().H0() instanceof kotlin.reflect.jvm.internal.impl.types.checker.o) || (Q0().H0().n() instanceof w00.s0);
    }
}