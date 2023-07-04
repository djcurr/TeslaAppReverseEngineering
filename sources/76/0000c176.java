package y10;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import k20.a1;
import k20.d0;
import k20.e0;
import k20.f0;
import k20.k0;
import k20.k1;
import k20.y0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t00.k;
import w00.s0;

/* loaded from: classes5.dex */
public final class q extends g<b> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f58988b = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g<?> a(d0 argumentType) {
            kotlin.jvm.internal.s.g(argumentType, "argumentType");
            if (f0.a(argumentType)) {
                return null;
            }
            d0 d0Var = argumentType;
            int i11 = 0;
            while (t00.h.c0(d0Var)) {
                d0Var = ((y0) wz.u.C0(d0Var.G0())).getType();
                kotlin.jvm.internal.s.f(d0Var, "type.arguments.single().type");
                i11++;
            }
            w00.e n11 = d0Var.H0().n();
            if (n11 instanceof w00.c) {
                u10.b h11 = a20.a.h(n11);
                return h11 == null ? new q(new b.a(argumentType)) : new q(h11, i11);
            } else if (n11 instanceof s0) {
                u10.b m11 = u10.b.m(k.a.f51324b.l());
                kotlin.jvm.internal.s.f(m11, "topLevel(StandardNames.FqNames.any.toSafe())");
                return new q(m11, 0);
            } else {
                return null;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class b {

        /* loaded from: classes5.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final d0 f58989a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d0 type) {
                super(null);
                kotlin.jvm.internal.s.g(type, "type");
                this.f58989a = type;
            }

            public final d0 a() {
                return this.f58989a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.s.c(this.f58989a, ((a) obj).f58989a);
            }

            public int hashCode() {
                return this.f58989a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f58989a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* renamed from: y10.q$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C1339b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final f f58990a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1339b(f value) {
                super(null);
                kotlin.jvm.internal.s.g(value, "value");
                this.f58990a = value;
            }

            public final int a() {
                return this.f58990a.c();
            }

            public final u10.b b() {
                return this.f58990a.d();
            }

            public final f c() {
                return this.f58990a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1339b) && kotlin.jvm.internal.s.c(this.f58990a, ((C1339b) obj).f58990a);
            }

            public int hashCode() {
                return this.f58990a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f58990a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b value) {
        super(value);
        kotlin.jvm.internal.s.g(value, "value");
    }

    @Override // y10.g
    public d0 a(w00.x module) {
        List d11;
        kotlin.jvm.internal.s.g(module, "module");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b11 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b();
        w00.c E = module.l().E();
        kotlin.jvm.internal.s.f(E, "module.builtIns.kClass");
        d11 = wz.v.d(new a1(c(module)));
        return e0.g(b11, E, d11);
    }

    public final d0 c(w00.x module) {
        kotlin.jvm.internal.s.g(module, "module");
        b b11 = b();
        if (b11 instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (b11 instanceof b.C1339b) {
            f c11 = ((b.C1339b) b()).c();
            u10.b a11 = c11.a();
            int b12 = c11.b();
            w00.c a12 = w00.s.a(module, a11);
            if (a12 == null) {
                k0 j11 = k20.v.j("Unresolved type: " + a11 + " (arrayDimensions=" + b12 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
                kotlin.jvm.internal.s.f(j11, "createErrorType(\"Unresol…sions=$arrayDimensions)\")");
                return j11;
            }
            k0 n11 = a12.n();
            kotlin.jvm.internal.s.f(n11, "descriptor.defaultType");
            d0 t11 = n20.a.t(n11);
            for (int i11 = 0; i11 < b12; i11++) {
                t11 = module.l().l(k1.INVARIANT, t11);
                kotlin.jvm.internal.s.f(t11, "module.builtIns.getArray…Variance.INVARIANT, type)");
            }
            return t11;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(f value) {
        this(new b.C1339b(value));
        kotlin.jvm.internal.s.g(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(u10.b classId, int i11) {
        this(new f(classId, i11));
        kotlin.jvm.internal.s.g(classId, "classId");
    }
}