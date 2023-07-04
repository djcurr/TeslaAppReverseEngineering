package j10;

import ch.qos.logback.core.CoreConstants;
import h00.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import k20.d0;
import k20.d1;
import k20.k0;
import k20.k1;
import k20.v;
import k20.x0;
import k20.y0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.k;
import vz.m;
import vz.p;
import w00.s0;
import wz.r0;
import wz.w0;
import wz.x;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final j20.f f33103a;

    /* renamed from: b  reason: collision with root package name */
    private final k f33104b;

    /* renamed from: c  reason: collision with root package name */
    private final e f33105c;

    /* renamed from: d  reason: collision with root package name */
    private final j20.g<a, d0> f33106d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final s0 f33107a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f33108b;

        /* renamed from: c  reason: collision with root package name */
        private final j10.a f33109c;

        public a(s0 typeParameter, boolean z11, j10.a typeAttr) {
            s.g(typeParameter, "typeParameter");
            s.g(typeAttr, "typeAttr");
            this.f33107a = typeParameter;
            this.f33108b = z11;
            this.f33109c = typeAttr;
        }

        public final j10.a a() {
            return this.f33109c;
        }

        public final s0 b() {
            return this.f33107a;
        }

        public final boolean c() {
            return this.f33108b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return s.c(aVar.f33107a, this.f33107a) && aVar.f33108b == this.f33108b && aVar.f33109c.d() == this.f33109c.d() && aVar.f33109c.e() == this.f33109c.e() && aVar.f33109c.g() == this.f33109c.g() && s.c(aVar.f33109c.c(), this.f33109c.c());
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f33107a.hashCode();
            int i11 = hashCode + (hashCode * 31) + (this.f33108b ? 1 : 0);
            int hashCode2 = i11 + (i11 * 31) + this.f33109c.d().hashCode();
            int hashCode3 = hashCode2 + (hashCode2 * 31) + this.f33109c.e().hashCode();
            int i12 = hashCode3 + (hashCode3 * 31) + (this.f33109c.g() ? 1 : 0);
            int i13 = i12 * 31;
            k0 c11 = this.f33109c.c();
            return i12 + i13 + (c11 != null ? c11.hashCode() : 0);
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f33107a + ", isRaw=" + this.f33108b + ", typeAttr=" + this.f33109c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends u implements h00.a<k0> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final k0 mo11invoke() {
            return v.j("Can't compute erased upper bound of type parameter `" + g.this + '`');
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends u implements l<a, d0> {
        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final d0 mo12invoke(a aVar) {
            return g.this.d(aVar.b(), aVar.c(), aVar.a());
        }
    }

    public g(e eVar) {
        k a11;
        j20.f fVar = new j20.f("Type parameter upper bound erasion results");
        this.f33103a = fVar;
        a11 = m.a(new b());
        this.f33104b = a11;
        this.f33105c = eVar == null ? new e(this) : eVar;
        j20.g<a, d0> e11 = fVar.e(new c());
        s.f(e11, "storage.createMemoizedFu… isRaw, typeAttr) }\n    }");
        this.f33106d = e11;
    }

    private final d0 b(j10.a aVar) {
        k0 c11 = aVar.c();
        d0 t11 = c11 == null ? null : n20.a.t(c11);
        if (t11 == null) {
            k0 erroneousErasedBound = e();
            s.f(erroneousErasedBound, "erroneousErasedBound");
            return erroneousErasedBound;
        }
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d0 d(s0 s0Var, boolean z11, j10.a aVar) {
        int t11;
        int e11;
        int d11;
        y0 j11;
        Set<s0> f11 = aVar.f();
        if (f11 != null && f11.contains(s0Var.a())) {
            return b(aVar);
        }
        k0 n11 = s0Var.n();
        s.f(n11, "typeParameter.defaultType");
        Set<s0> f12 = n20.a.f(n11, f11);
        t11 = x.t(f12, 10);
        e11 = r0.e(t11);
        d11 = m00.l.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (s0 s0Var2 : f12) {
            if (f11 != null && f11.contains(s0Var2)) {
                j11 = d.b(s0Var2, aVar);
            } else {
                e eVar = this.f33105c;
                j10.a i11 = z11 ? aVar : aVar.i(j10.b.INFLEXIBLE);
                d0 c11 = c(s0Var2, z11, aVar.j(s0Var));
                s.f(c11, "getErasedUpperBound(it, …Parameter(typeParameter))");
                j11 = eVar.j(s0Var2, i11, c11);
            }
            p a11 = vz.v.a(s0Var2.mo234i(), j11);
            linkedHashMap.put(a11.c(), a11.d());
        }
        d1 g11 = d1.g(x0.a.e(x0.f34347b, linkedHashMap, false, 2, null));
        s.f(g11, "create(TypeConstructorSu…rsMap(erasedUpperBounds))");
        List<d0> upperBounds = s0Var.getUpperBounds();
        s.f(upperBounds, "typeParameter.upperBounds");
        d0 firstUpperBound = (d0) wz.u.b0(upperBounds);
        if (firstUpperBound.H0().n() instanceof w00.c) {
            s.f(firstUpperBound, "firstUpperBound");
            return n20.a.s(firstUpperBound, g11, linkedHashMap, k1.OUT_VARIANCE, aVar.f());
        }
        Set<s0> f13 = aVar.f();
        if (f13 == null) {
            f13 = w0.c(this);
        }
        w00.e n12 = firstUpperBound.H0().n();
        Objects.requireNonNull(n12, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        while (true) {
            s0 s0Var3 = (s0) n12;
            if (!f13.contains(s0Var3)) {
                List<d0> upperBounds2 = s0Var3.getUpperBounds();
                s.f(upperBounds2, "current.upperBounds");
                d0 nextUpperBound = (d0) wz.u.b0(upperBounds2);
                if (nextUpperBound.H0().n() instanceof w00.c) {
                    s.f(nextUpperBound, "nextUpperBound");
                    return n20.a.s(nextUpperBound, g11, linkedHashMap, k1.OUT_VARIANCE, aVar.f());
                }
                n12 = nextUpperBound.H0().n();
                Objects.requireNonNull(n12, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            } else {
                return b(aVar);
            }
        }
    }

    private final k0 e() {
        return (k0) this.f33104b.mo16getValue();
    }

    public final d0 c(s0 typeParameter, boolean z11, j10.a typeAttr) {
        s.g(typeParameter, "typeParameter");
        s.g(typeAttr, "typeAttr");
        return this.f33106d.mo12invoke(new a(typeParameter, z11, typeAttr));
    }

    public /* synthetic */ g(e eVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : eVar);
    }
}