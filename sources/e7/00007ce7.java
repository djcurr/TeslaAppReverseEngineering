package k20;

import java.util.ArrayList;
import java.util.List;
import t00.k;

/* loaded from: classes5.dex */
public class d1 {

    /* renamed from: b  reason: collision with root package name */
    public static final d1 f34234b = g(b1.f34222a);

    /* renamed from: a  reason: collision with root package name */
    private final b1 f34235a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a implements h00.l<u10.c, Boolean> {
        a() {
        }

        private static /* synthetic */ void a(int i11) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // h00.l
        /* renamed from: b */
        public Boolean invoke(u10.c cVar) {
            if (cVar == null) {
                a(0);
            }
            return Boolean.valueOf(!cVar.equals(k.a.f51356z));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34236a;

        static {
            int[] iArr = new int[d.values().length];
            f34236a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34236a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34236a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected d1(b1 b1Var) {
        if (b1Var == null) {
            a(7);
        }
        this.f34235a = b1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k20.d1.a(int):void");
    }

    private static void b(int i11, y0 y0Var, b1 b1Var) {
        if (i11 <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + o(y0Var) + "; substitution: " + o(b1Var));
    }

    public static k1 c(k1 k1Var, y0 y0Var) {
        if (k1Var == null) {
            a(35);
        }
        if (y0Var == null) {
            a(36);
        }
        if (y0Var.a()) {
            k1 k1Var2 = k1.OUT_VARIANCE;
            if (k1Var2 == null) {
                a(37);
            }
            return k1Var2;
        }
        return d(k1Var, y0Var.b());
    }

    public static k1 d(k1 k1Var, k1 k1Var2) {
        if (k1Var == null) {
            a(38);
        }
        if (k1Var2 == null) {
            a(39);
        }
        k1 k1Var3 = k1.INVARIANT;
        if (k1Var == k1Var3) {
            if (k1Var2 == null) {
                a(40);
            }
            return k1Var2;
        } else if (k1Var2 == k1Var3) {
            if (k1Var == null) {
                a(41);
            }
            return k1Var;
        } else if (k1Var == k1Var2) {
            if (k1Var2 == null) {
                a(42);
            }
            return k1Var2;
        } else {
            throw new AssertionError("Variance conflict: type parameter variance '" + k1Var + "' and projection kind '" + k1Var2 + "' cannot be combined");
        }
    }

    private static d e(k1 k1Var, k1 k1Var2) {
        k1 k1Var3 = k1.IN_VARIANCE;
        if (k1Var == k1Var3 && k1Var2 == k1.OUT_VARIANCE) {
            return d.OUT_IN_IN_POSITION;
        }
        if (k1Var == k1.OUT_VARIANCE && k1Var2 == k1Var3) {
            return d.IN_IN_OUT_POSITION;
        }
        return d.NO_CONFLICT;
    }

    public static d1 f(d0 d0Var) {
        if (d0Var == null) {
            a(6);
        }
        return g(x0.i(d0Var.H0(), d0Var.G0()));
    }

    public static d1 g(b1 b1Var) {
        if (b1Var == null) {
            a(0);
        }
        return new d1(b1Var);
    }

    public static d1 h(b1 b1Var, b1 b1Var2) {
        if (b1Var == null) {
            a(3);
        }
        if (b1Var2 == null) {
            a(4);
        }
        return g(r.i(b1Var, b1Var2));
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (gVar == null) {
            a(33);
        }
        return !gVar.b1(k.a.f51356z) ? gVar : new kotlin.reflect.jvm.internal.impl.descriptors.annotations.l(gVar, new a());
    }

    private static y0 l(d0 d0Var, y0 y0Var, w00.s0 s0Var, y0 y0Var2) {
        if (d0Var == null) {
            a(26);
        }
        if (y0Var == null) {
            a(27);
        }
        if (y0Var2 == null) {
            a(28);
        }
        if (!d0Var.getAnnotations().b1(k.a.f51356z)) {
            if (y0Var == null) {
                a(29);
            }
            return y0Var;
        }
        w0 H0 = y0Var.getType().H0();
        if (H0 instanceof kotlin.reflect.jvm.internal.impl.types.checker.k) {
            y0 projection = ((kotlin.reflect.jvm.internal.impl.types.checker.k) H0).getProjection();
            k1 b11 = projection.b();
            d e11 = e(y0Var2.b(), b11);
            d dVar = d.OUT_IN_IN_POSITION;
            if (e11 == dVar) {
                return new a1(projection.getType());
            }
            return (s0Var != null && e(s0Var.k(), b11) == dVar) ? new a1(projection.getType()) : y0Var;
        }
        return y0Var;
    }

    private static String o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (!s20.c.a(th2)) {
                return "[Exception while computing toString(): " + th2 + "]";
            }
            throw th2;
        }
    }

    private y0 r(y0 y0Var, int i11) {
        d0 type = y0Var.getType();
        k1 b11 = y0Var.b();
        if (type.H0().n() instanceof w00.s0) {
            return y0Var;
        }
        k0 b12 = n0.b(type);
        d0 p11 = b12 != null ? m().p(b12, k1.INVARIANT) : null;
        d0 b13 = c1.b(type, s(type.H0().getParameters(), type.G0(), i11), this.f34235a.d(type.getAnnotations()));
        if ((b13 instanceof k0) && (p11 instanceof k0)) {
            b13 = n0.j((k0) b13, (k0) p11);
        }
        return new a1(b11, b13);
    }

    private List<y0> s(List<w00.s0> list, List<y0> list2, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z11 = false;
        for (int i12 = 0; i12 < list.size(); i12++) {
            w00.s0 s0Var = list.get(i12);
            y0 y0Var = list2.get(i12);
            y0 u11 = u(y0Var, s0Var, i11 + 1);
            int i13 = b.f34236a[e(s0Var.k(), u11.b()).ordinal()];
            if (i13 == 1 || i13 == 2) {
                u11 = f1.t(s0Var);
            } else if (i13 == 3) {
                k1 k11 = s0Var.k();
                k1 k1Var = k1.INVARIANT;
                if (k11 != k1Var && !u11.a()) {
                    u11 = new a1(k1Var, u11.getType());
                }
            }
            if (u11 != y0Var) {
                z11 = true;
            }
            arrayList.add(u11);
        }
        return !z11 ? list2 : arrayList;
    }

    private y0 u(y0 y0Var, w00.s0 s0Var, int i11) {
        d0 r11;
        if (y0Var == null) {
            a(18);
        }
        b(i11, y0Var, this.f34235a);
        if (y0Var.a()) {
            return y0Var;
        }
        d0 type = y0Var.getType();
        if (type instanceof g1) {
            g1 g1Var = (g1) type;
            j1 origin = g1Var.getOrigin();
            d0 d02 = g1Var.d0();
            y0 u11 = u(new a1(y0Var.b(), origin), s0Var, i11 + 1);
            if (u11.a()) {
                return u11;
            }
            d0 p11 = p(d02, y0Var.b());
            j1 K0 = u11.getType().K0();
            if (p11 instanceof g1) {
                p11 = ((g1) p11).d0();
            }
            return new a1(u11.b(), h1.e(K0, p11));
        }
        if (!t.a(type) && !(type.K0() instanceof j0)) {
            y0 e11 = this.f34235a.e(type);
            y0 l11 = e11 != null ? l(type, e11, s0Var, y0Var) : null;
            k1 b11 = y0Var.b();
            if (l11 == null && a0.b(type) && !v0.b(type)) {
                x a11 = a0.a(type);
                int i12 = i11 + 1;
                y0 u12 = u(new a1(b11, a11.P0()), s0Var, i12);
                y0 u13 = u(new a1(b11, a11.Q0()), s0Var, i12);
                return (u12.getType() == a11.P0() && u13.getType() == a11.Q0()) ? y0Var : new a1(u12.b(), e0.d(c1.a(u12.getType()), c1.a(u13.getType())));
            } else if (!t00.h.l0(type) && !f0.a(type)) {
                if (l11 != null) {
                    d e12 = e(b11, l11.b());
                    if (!x10.d.d(type)) {
                        int i13 = b.f34236a[e12.ordinal()];
                        if (i13 == 1) {
                            throw new c("Out-projection in in-position");
                        }
                        if (i13 == 2) {
                            return new a1(k1.OUT_VARIANCE, type.H0().l().I());
                        }
                    }
                    l a12 = v0.a(type);
                    if (l11.a()) {
                        return l11;
                    }
                    if (a12 != null) {
                        r11 = a12.M(l11.getType());
                    } else {
                        r11 = f1.r(l11.getType(), type.I0());
                    }
                    if (!type.getAnnotations().isEmpty()) {
                        r11 = n20.a.r(r11, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.k(r11.getAnnotations(), i(this.f34235a.d(type.getAnnotations()))));
                    }
                    if (e12 == d.NO_CONFLICT) {
                        b11 = d(b11, l11.b());
                    }
                    return new a1(b11, r11);
                }
                y0Var = r(y0Var, i11);
                if (y0Var == null) {
                    a(25);
                }
            }
        }
        return y0Var;
    }

    public b1 j() {
        b1 b1Var = this.f34235a;
        if (b1Var == null) {
            a(8);
        }
        return b1Var;
    }

    public boolean k() {
        return this.f34235a.f();
    }

    public d1 m() {
        b1 b1Var = this.f34235a;
        return ((b1Var instanceof b0) && b1Var.b()) ? new d1(new b0(((b0) this.f34235a).j(), ((b0) this.f34235a).i(), false)) : this;
    }

    public d0 n(d0 d0Var, k1 k1Var) {
        if (d0Var == null) {
            a(9);
        }
        if (k1Var == null) {
            a(10);
        }
        if (k()) {
            if (d0Var == null) {
                a(11);
            }
            return d0Var;
        }
        try {
            d0 type = u(new a1(k1Var, d0Var), null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (c e11) {
            k0 j11 = v.j(e11.getMessage());
            if (j11 == null) {
                a(13);
            }
            return j11;
        }
    }

    public d0 p(d0 d0Var, k1 k1Var) {
        if (d0Var == null) {
            a(14);
        }
        if (k1Var == null) {
            a(15);
        }
        y0 q11 = q(new a1(k1Var, j().g(d0Var, k1Var)));
        if (q11 == null) {
            return null;
        }
        return q11.getType();
    }

    public y0 q(y0 y0Var) {
        if (y0Var == null) {
            a(16);
        }
        y0 t11 = t(y0Var);
        return (this.f34235a.a() || this.f34235a.b()) ? o20.b.c(t11, this.f34235a.b()) : t11;
    }

    public y0 t(y0 y0Var) {
        if (y0Var == null) {
            a(17);
        }
        if (k()) {
            return y0Var;
        }
        try {
            return u(y0Var, null, 0);
        } catch (c unused) {
            return null;
        }
    }
}