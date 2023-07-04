package i10;

import e10.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import k20.k0;
import k20.k1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.KProperty;
import l10.o;
import vz.p;
import vz.v;
import w00.v0;
import w00.x;
import wz.s0;
import y10.q;

/* loaded from: classes5.dex */
public final class e implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, g10.g {

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f29571i = {m0.j(new f0(m0.b(e.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), m0.j(new f0(m0.b(e.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), m0.j(new f0(m0.b(e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: a  reason: collision with root package name */
    private final h10.h f29572a;

    /* renamed from: b  reason: collision with root package name */
    private final l10.a f29573b;

    /* renamed from: c  reason: collision with root package name */
    private final j20.j f29574c;

    /* renamed from: d  reason: collision with root package name */
    private final j20.i f29575d;

    /* renamed from: e  reason: collision with root package name */
    private final k10.a f29576e;

    /* renamed from: f  reason: collision with root package name */
    private final j20.i f29577f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f29578g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f29579h;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.a<Map<u10.f, ? extends y10.g<?>>> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Map<u10.f, ? extends y10.g<?>> mo11invoke() {
            Map<u10.f, ? extends y10.g<?>> t11;
            Collection<l10.b> f11 = e.this.f29573b.f();
            e eVar = e.this;
            ArrayList arrayList = new ArrayList();
            for (l10.b bVar : f11) {
                u10.f name = bVar.getName();
                if (name == null) {
                    name = z.f24512b;
                }
                y10.g m11 = eVar.m(bVar);
                p a11 = m11 == null ? null : v.a(name, m11);
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
            t11 = s0.t(arrayList);
            return t11;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends u implements h00.a<u10.c> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final u10.c mo11invoke() {
            u10.b j11 = e.this.f29573b.j();
            if (j11 == null) {
                return null;
            }
            return j11.b();
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends u implements h00.a<k0> {
        c() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final k0 mo11invoke() {
            u10.c e11 = e.this.e();
            if (e11 == null) {
                return k20.v.j(s.p("No fqName: ", e.this.f29573b));
            }
            w00.c h11 = v00.d.h(v00.d.f53803a, e11, e.this.f29572a.d().l(), null, 4, null);
            if (h11 == null) {
                l10.g mo30u = e.this.f29573b.mo30u();
                h11 = mo30u == null ? null : e.this.f29572a.a().n().a(mo30u);
                if (h11 == null) {
                    h11 = e.this.i(e11);
                }
            }
            return h11.n();
        }
    }

    public e(h10.h c11, l10.a javaAnnotation, boolean z11) {
        s.g(c11, "c");
        s.g(javaAnnotation, "javaAnnotation");
        this.f29572a = c11;
        this.f29573b = javaAnnotation;
        this.f29574c = c11.e().i(new b());
        this.f29575d = c11.e().b(new c());
        this.f29576e = c11.a().t().a(javaAnnotation);
        this.f29577f = c11.e().b(new a());
        this.f29578g = javaAnnotation.d();
        this.f29579h = javaAnnotation.E() || z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w00.c i(u10.c cVar) {
        x d11 = this.f29572a.d();
        u10.b m11 = u10.b.m(cVar);
        s.f(m11, "topLevel(fqName)");
        return w00.s.c(d11, m11, this.f29572a.a().b().e().q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y10.g<?> m(l10.b bVar) {
        if (bVar instanceof o) {
            return y10.h.f58969a.c(((o) bVar).getValue());
        }
        if (bVar instanceof l10.m) {
            l10.m mVar = (l10.m) bVar;
            return p(mVar.d(), mVar.e());
        } else if (!(bVar instanceof l10.e)) {
            if (bVar instanceof l10.c) {
                return n(((l10.c) bVar).a());
            }
            if (bVar instanceof l10.h) {
                return q(((l10.h) bVar).b());
            }
            return null;
        } else {
            l10.e eVar = (l10.e) bVar;
            u10.f name = eVar.getName();
            if (name == null) {
                name = z.f24512b;
            }
            s.f(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            return o(name, eVar.c());
        }
    }

    private final y10.g<?> n(l10.a aVar) {
        return new y10.a(new e(this.f29572a, aVar, false, 4, null));
    }

    private final y10.g<?> o(u10.f fVar, List<? extends l10.b> list) {
        int t11;
        k0 type = getType();
        s.f(type, "type");
        if (k20.f0.a(type)) {
            return null;
        }
        w00.c f11 = a20.a.f(this);
        s.e(f11);
        v0 b11 = f10.a.b(fVar, f11);
        k0 type2 = b11 != null ? b11.getType() : null;
        if (type2 == null) {
            type2 = this.f29572a.a().m().l().l(k1.INVARIANT, k20.v.j("Unknown array element type"));
        }
        s.f(type2, "DescriptorResolverUtils.… type\")\n                )");
        t11 = wz.x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (l10.b bVar : list) {
            y10.g<?> m11 = m(bVar);
            if (m11 == null) {
                m11 = new y10.s();
            }
            arrayList.add(m11);
        }
        return y10.h.f58969a.a(arrayList, type2);
    }

    private final y10.g<?> p(u10.b bVar, u10.f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new y10.j(bVar, fVar);
    }

    private final y10.g<?> q(l10.x xVar) {
        return q.f58988b.a(this.f29572a.g().o(xVar, j10.d.d(f10.k.COMMON, false, null, 3, null)));
    }

    @Override // g10.g
    public boolean d() {
        return this.f29578g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public u10.c e() {
        return (u10.c) j20.m.b(this.f29574c, this, f29571i[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map<u10.f, y10.g<?>> g() {
        return (Map) j20.m.a(this.f29577f, this, f29571i[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    /* renamed from: j */
    public k10.a f() {
        return this.f29576e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    /* renamed from: k */
    public k0 mo131getType() {
        return (k0) j20.m.a(this.f29575d, this, f29571i[1]);
    }

    public final boolean l() {
        return this.f29579h;
    }

    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.c.s(kotlin.reflect.jvm.internal.impl.renderer.c.f35080b, this, null, 2, null);
    }

    public /* synthetic */ e(h10.h hVar, l10.a aVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, aVar, (i11 & 4) != 0 ? false : z11);
    }
}