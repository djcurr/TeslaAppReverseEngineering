package w00;

import ch.qos.logback.core.CoreConstants;
import d20.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k20.k1;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final j20.n f55342a;

    /* renamed from: b  reason: collision with root package name */
    private final x f55343b;

    /* renamed from: c  reason: collision with root package name */
    private final j20.g<u10.c, a0> f55344c;

    /* renamed from: d  reason: collision with root package name */
    private final j20.g<a, w00.c> f55345d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final u10.b f55346a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Integer> f55347b;

        public a(u10.b classId, List<Integer> typeParametersCount) {
            kotlin.jvm.internal.s.g(classId, "classId");
            kotlin.jvm.internal.s.g(typeParametersCount, "typeParametersCount");
            this.f55346a = classId;
            this.f55347b = typeParametersCount;
        }

        public final u10.b a() {
            return this.f55346a;
        }

        public final List<Integer> b() {
            return this.f55347b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.s.c(this.f55346a, aVar.f55346a) && kotlin.jvm.internal.s.c(this.f55347b, aVar.f55347b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f55346a.hashCode() * 31) + this.f55347b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f55346a + ", typeParametersCount=" + this.f55347b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends y00.g {

        /* renamed from: i  reason: collision with root package name */
        private final boolean f55348i;

        /* renamed from: j  reason: collision with root package name */
        private final List<s0> f55349j;

        /* renamed from: k  reason: collision with root package name */
        private final k20.j f55350k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j20.n storageManager, i container, u10.f name, boolean z11, int i11) {
            super(storageManager, container, name, n0.f55303a, false);
            m00.i r11;
            int t11;
            Set c11;
            kotlin.jvm.internal.s.g(storageManager, "storageManager");
            kotlin.jvm.internal.s.g(container, "container");
            kotlin.jvm.internal.s.g(name, "name");
            this.f55348i = z11;
            r11 = m00.l.r(0, i11);
            t11 = wz.x.t(r11, 10);
            ArrayList arrayList = new ArrayList(t11);
            Iterator<Integer> it2 = r11.iterator();
            while (it2.hasNext()) {
                int a11 = ((wz.n0) it2).a();
                arrayList.add(y00.k0.N0(this, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b(), false, k1.INVARIANT, u10.f.f(kotlin.jvm.internal.s.p("T", Integer.valueOf(a11))), a11, storageManager));
            }
            this.f55349j = arrayList;
            List<s0> d11 = t0.d(this);
            c11 = wz.w0.c(a20.a.l(this).l().i());
            this.f55350k = new k20.j(this, d11, c11, storageManager);
        }

        @Override // w00.c
        public w00.b B() {
            return null;
        }

        @Override // w00.c
        public boolean C0() {
            return false;
        }

        @Override // w00.c
        /* renamed from: G0 */
        public h.b mo138h0() {
            return h.b.f23482b;
        }

        @Override // w00.e
        /* renamed from: H0 */
        public k20.j mo234i() {
            return this.f55350k;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // y00.t
        /* renamed from: I0 */
        public h.b mo233M(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
            kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return h.b.f23482b;
        }

        @Override // w00.u
        public boolean W() {
            return false;
        }

        @Override // w00.c
        public boolean X() {
            return false;
        }

        @Override // w00.c
        public boolean a0() {
            return false;
        }

        @Override // w00.c
        public boolean f0() {
            return false;
        }

        @Override // w00.c
        /* renamed from: g */
        public Collection<w00.b> mo224g() {
            Set d11;
            d11 = wz.x0.d();
            return d11;
        }

        @Override // w00.u
        public boolean g0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
        /* renamed from: getAnnotations */
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g mo140getAnnotations() {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b();
        }

        @Override // w00.c
        public kotlin.reflect.jvm.internal.impl.descriptors.c getKind() {
            return kotlin.reflect.jvm.internal.impl.descriptors.c.CLASS;
        }

        @Override // w00.c, w00.m, w00.u
        public q getVisibility() {
            q PUBLIC = p.f55309e;
            kotlin.jvm.internal.s.f(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // w00.c
        public w00.c i0() {
            return null;
        }

        @Override // y00.g, w00.u
        public boolean isExternal() {
            return false;
        }

        @Override // w00.c
        public boolean isInline() {
            return false;
        }

        @Override // w00.f
        public boolean j() {
            return this.f55348i;
        }

        @Override // w00.c, w00.f
        public List<s0> o() {
            return this.f55349j;
        }

        @Override // w00.c, w00.u
        public kotlin.reflect.jvm.internal.impl.descriptors.f p() {
            return kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL;
        }

        @Override // w00.c
        public t<k20.k0> t() {
            return null;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // w00.c
        /* renamed from: x */
        public Collection<w00.c> mo225x() {
            List i11;
            i11 = wz.w.i();
            return i11;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<a, w00.c> {
        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final w00.c mo12invoke(a dstr$classId$typeParametersCount) {
            List<Integer> V;
            j d11;
            kotlin.jvm.internal.s.g(dstr$classId$typeParametersCount, "$dstr$classId$typeParametersCount");
            u10.b a11 = dstr$classId$typeParametersCount.a();
            List<Integer> b11 = dstr$classId$typeParametersCount.b();
            if (!a11.k()) {
                u10.b g11 = a11.g();
                if (g11 == null) {
                    d11 = null;
                } else {
                    z zVar = z.this;
                    V = wz.e0.V(b11, 1);
                    d11 = zVar.d(g11, V);
                }
                if (d11 == null) {
                    j20.g gVar = z.this.f55344c;
                    u10.c h11 = a11.h();
                    kotlin.jvm.internal.s.f(h11, "classId.packageFqName");
                    d11 = (w00.d) gVar.mo12invoke(h11);
                }
                j jVar = d11;
                boolean l11 = a11.l();
                j20.n nVar = z.this.f55342a;
                u10.f j11 = a11.j();
                kotlin.jvm.internal.s.f(j11, "classId.shortClassName");
                Integer num = (Integer) wz.u.d0(b11);
                return new b(nVar, jVar, j11, l11, num == null ? 0 : num.intValue());
            }
            throw new UnsupportedOperationException(kotlin.jvm.internal.s.p("Unresolved local class: ", a11));
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.l<u10.c, a0> {
        d() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final a0 mo12invoke(u10.c fqName) {
            kotlin.jvm.internal.s.g(fqName, "fqName");
            return new y00.m(z.this.f55343b, fqName);
        }
    }

    public z(j20.n storageManager, x module) {
        kotlin.jvm.internal.s.g(storageManager, "storageManager");
        kotlin.jvm.internal.s.g(module, "module");
        this.f55342a = storageManager;
        this.f55343b = module;
        this.f55344c = storageManager.e(new d());
        this.f55345d = storageManager.e(new c());
    }

    public final w00.c d(u10.b classId, List<Integer> typeParametersCount) {
        kotlin.jvm.internal.s.g(classId, "classId");
        kotlin.jvm.internal.s.g(typeParametersCount, "typeParametersCount");
        return this.f55345d.mo12invoke(new a(classId, typeParametersCount));
    }
}