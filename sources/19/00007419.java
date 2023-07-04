package i10;

import e10.h0;
import e10.r;
import e10.z;
import g20.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k20.d0;
import k20.k0;
import k20.k1;
import k20.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l10.x;
import l10.y;
import w00.m0;
import w00.p;
import w00.q0;
import w00.s0;
import w00.t;
import w00.t0;
import w00.z;
import w00.z0;
import wz.e0;
import wz.w;
import wz.x0;
import y10.v;

/* loaded from: classes5.dex */
public final class f extends y00.g implements g10.c {
    private static final Set<String> C;
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g A;
    private final j20.i<List<s0>> B;

    /* renamed from: i  reason: collision with root package name */
    private final h10.h f29583i;

    /* renamed from: j  reason: collision with root package name */
    private final l10.g f29584j;

    /* renamed from: k  reason: collision with root package name */
    private final w00.c f29585k;

    /* renamed from: l  reason: collision with root package name */
    private final h10.h f29586l;

    /* renamed from: m  reason: collision with root package name */
    private final vz.k f29587m;

    /* renamed from: n  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.c f29588n;

    /* renamed from: o  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.f f29589o;

    /* renamed from: p  reason: collision with root package name */
    private final z0 f29590p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f29591q;

    /* renamed from: t  reason: collision with root package name */
    private final b f29592t;

    /* renamed from: w  reason: collision with root package name */
    private final g f29593w;

    /* renamed from: x  reason: collision with root package name */
    private final m0<g> f29594x;

    /* renamed from: y  reason: collision with root package name */
    private final d20.f f29595y;

    /* renamed from: z  reason: collision with root package name */
    private final k f29596z;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class b extends k20.b {

        /* renamed from: d  reason: collision with root package name */
        private final j20.i<List<s0>> f29597d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f29598e;

        /* loaded from: classes5.dex */
        static final class a extends u implements h00.a<List<? extends s0>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f29599a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(0);
                this.f29599a = fVar;
            }

            @Override // h00.a
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final List<? extends s0> mo11invoke() {
                return t0.d(this.f29599a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f this$0) {
            super(this$0.f29586l.e());
            s.g(this$0, "this$0");
            this.f29598e = this$0;
            this.f29597d = this$0.f29586l.e().b(new a(this$0));
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
            if ((!r0.d() && r0.i(t00.k.f51316k)) != false) goto L4;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final k20.d0 v() {
            /*
                r8 = this;
                u10.c r0 = r8.w()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto La
            L8:
                r0 = r2
                goto L1d
            La:
                boolean r3 = r0.d()
                if (r3 != 0) goto L1a
                u10.f r3 = t00.k.f51316k
                boolean r3 = r0.i(r3)
                if (r3 == 0) goto L1a
                r3 = r1
                goto L1b
            L1a:
                r3 = 0
            L1b:
                if (r3 == 0) goto L8
            L1d:
                if (r0 != 0) goto L2e
                e10.m r3 = e10.m.f24472a
                i10.f r4 = r8.f29598e
                u10.c r4 = a20.a.i(r4)
                u10.c r3 = r3.b(r4)
                if (r3 != 0) goto L2f
                return r2
            L2e:
                r3 = r0
            L2f:
                i10.f r4 = r8.f29598e
                h10.h r4 = i10.f.H0(r4)
                w00.x r4 = r4.d()
                d10.d r5 = d10.d.FROM_JAVA_LOADER
                w00.c r3 = a20.a.r(r4, r3, r5)
                if (r3 != 0) goto L42
                return r2
            L42:
                k20.w0 r4 = r3.mo234i()
                java.util.List r4 = r4.getParameters()
                int r4 = r4.size()
                i10.f r5 = r8.f29598e
                k20.w0 r5 = r5.mo234i()
                java.util.List r5 = r5.getParameters()
                java.lang.String r6 = "getTypeConstructor().parameters"
                kotlin.jvm.internal.s.f(r5, r6)
                int r6 = r5.size()
                r7 = 10
                if (r6 != r4) goto L8d
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = wz.u.t(r5, r7)
                r0.<init>(r1)
                java.util.Iterator r1 = r5.iterator()
            L72:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto Lc7
                java.lang.Object r2 = r1.next()
                w00.s0 r2 = (w00.s0) r2
                k20.a1 r4 = new k20.a1
                k20.k1 r5 = k20.k1.INVARIANT
                k20.k0 r2 = r2.n()
                r4.<init>(r5, r2)
                r0.add(r4)
                goto L72
            L8d:
                if (r6 != r1) goto Ld2
                if (r4 <= r1) goto Ld2
                if (r0 != 0) goto Ld2
                k20.a1 r0 = new k20.a1
                k20.k1 r2 = k20.k1.INVARIANT
                java.lang.Object r5 = wz.u.C0(r5)
                w00.s0 r5 = (w00.s0) r5
                k20.k0 r5 = r5.n()
                r0.<init>(r2, r5)
                m00.i r2 = new m00.i
                r2.<init>(r1, r4)
                java.util.ArrayList r1 = new java.util.ArrayList
                int r4 = wz.u.t(r2, r7)
                r1.<init>(r4)
                java.util.Iterator r2 = r2.iterator()
            Lb6:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto Lc6
                r4 = r2
                wz.n0 r4 = (wz.n0) r4
                r4.a()
                r1.add(r0)
                goto Lb6
            Lc6:
                r0 = r1
            Lc7:
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r1.b()
                k20.k0 r0 = k20.e0.g(r1, r3, r0)
                return r0
            Ld2:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: i10.f.b.v():k20.d0");
        }

        private final u10.c w() {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g mo140getAnnotations = this.f29598e.mo140getAnnotations();
            u10.c PURELY_IMPLEMENTS_ANNOTATION = z.f24524n;
            s.f(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c mo169l = mo140getAnnotations.mo169l(PURELY_IMPLEMENTS_ANNOTATION);
            if (mo169l == null) {
                return null;
            }
            Object D0 = wz.u.D0(mo169l.g().values());
            v vVar = D0 instanceof v ? (v) D0 : null;
            String b11 = vVar == null ? null : vVar.b();
            if (b11 != null && u10.e.e(b11)) {
                return new u10.c(b11);
            }
            return null;
        }

        @Override // k20.h
        protected Collection<d0> g() {
            List d11;
            List O0;
            int t11;
            Collection<l10.j> a11 = this.f29598e.L0().a();
            ArrayList arrayList = new ArrayList(a11.size());
            ArrayList<x> arrayList2 = new ArrayList(0);
            d0 v11 = v();
            Iterator<l10.j> it2 = a11.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                l10.j next = it2.next();
                d0 f11 = this.f29598e.f29586l.a().r().f(this.f29598e.f29586l.g().o(next, j10.d.d(f10.k.SUPERTYPE, false, null, 3, null)), this.f29598e.f29586l);
                if (f11.H0().n() instanceof z.b) {
                    arrayList2.add(next);
                }
                if (!s.c(f11.H0(), v11 != null ? v11.H0() : null) && !t00.h.b0(f11)) {
                    arrayList.add(f11);
                }
            }
            w00.c cVar = this.f29598e.f29585k;
            s20.a.a(arrayList, cVar != null ? v00.j.a(cVar, this.f29598e).c().p(cVar.n(), k1.INVARIANT) : null);
            s20.a.a(arrayList, v11);
            if (!arrayList2.isEmpty()) {
                q c11 = this.f29598e.f29586l.a().c();
                w00.c n11 = n();
                t11 = wz.x.t(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(t11);
                for (x xVar : arrayList2) {
                    arrayList3.add(((l10.j) xVar).D());
                }
                c11.b(n11, arrayList3);
            }
            if (!arrayList.isEmpty()) {
                O0 = e0.O0(arrayList);
                return O0;
            }
            d11 = wz.v.d(this.f29598e.f29586l.d().l().i());
            return d11;
        }

        @Override // k20.w0
        public List<s0> getParameters() {
            return this.f29597d.mo11invoke();
        }

        @Override // k20.h
        protected q0 k() {
            return this.f29598e.f29586l.a().v();
        }

        @Override // k20.w0
        public boolean o() {
            return true;
        }

        public String toString() {
            String b11 = this.f29598e.getName().b();
            s.f(b11, "name.asString()");
            return b11;
        }

        @Override // k20.k, k20.w0
        /* renamed from: u */
        public w00.c n() {
            return this.f29598e;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends u implements h00.a<List<? extends s0>> {
        c() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<? extends s0> mo11invoke() {
            int t11;
            List<y> typeParameters = f.this.L0().getTypeParameters();
            f fVar = f.this;
            t11 = wz.x.t(typeParameters, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (y yVar : typeParameters) {
                s0 a11 = fVar.f29586l.f().a(yVar);
                if (a11 == null) {
                    throw new AssertionError("Parameter " + yVar + " surely belongs to class " + fVar.L0() + ", so it must be resolved");
                }
                arrayList.add(a11);
            }
            return arrayList;
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends u implements h00.a<List<? extends l10.a>> {
        d() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<? extends l10.a> mo11invoke() {
            u10.b h11 = a20.a.h(f.this);
            if (h11 == null) {
                return null;
            }
            return f.this.N0().a().f().a(h11);
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends u implements h00.l<kotlin.reflect.jvm.internal.impl.types.checker.h, g> {
        e() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final g mo12invoke(kotlin.reflect.jvm.internal.impl.types.checker.h it2) {
            s.g(it2, "it");
            h10.h hVar = f.this.f29586l;
            f fVar = f.this;
            return new g(hVar, fVar, fVar.L0(), f.this.f29585k != null, f.this.f29593w);
        }
    }

    static {
        Set<String> i11;
        new a(null);
        i11 = x0.i("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
        C = i11;
    }

    public /* synthetic */ f(h10.h hVar, w00.i iVar, l10.g gVar, w00.c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, iVar, gVar, (i11 & 8) != 0 ? null : cVar);
    }

    @Override // w00.c
    public w00.b B() {
        return null;
    }

    @Override // w00.c
    public boolean C0() {
        return false;
    }

    public final f J0(f10.g javaResolverCache, w00.c cVar) {
        s.g(javaResolverCache, "javaResolverCache");
        h10.h hVar = this.f29586l;
        h10.h j11 = h10.a.j(hVar, hVar.a().x(javaResolverCache));
        w00.i containingDeclaration = mo223b();
        s.f(containingDeclaration, "containingDeclaration");
        return new f(j11, containingDeclaration, this.f29584j, cVar);
    }

    @Override // w00.c
    /* renamed from: K0 */
    public List<w00.b> mo224g() {
        return this.f29593w.w0().mo11invoke();
    }

    public final l10.g L0() {
        return this.f29584j;
    }

    public final List<l10.a> M0() {
        return (List) this.f29587m.mo16getValue();
    }

    public final h10.h N0() {
        return this.f29583i;
    }

    @Override // y00.a, w00.c
    /* renamed from: O0 */
    public g V() {
        return (g) super.V();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y00.t
    /* renamed from: P0 */
    public g mo233M(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f29594x.c(kotlinTypeRefiner);
    }

    @Override // y00.a, w00.c
    public d20.h S() {
        return this.f29595y;
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

    @Override // w00.u
    public boolean g0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    /* renamed from: getAnnotations */
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g mo140getAnnotations() {
        return this.A;
    }

    @Override // w00.c
    public kotlin.reflect.jvm.internal.impl.descriptors.c getKind() {
        return this.f29588n;
    }

    @Override // w00.c, w00.m, w00.u
    public w00.q getVisibility() {
        if (s.c(this.f29590p, p.f55305a) && this.f29584j.mo37m() == null) {
            w00.q qVar = r.f24482a;
            s.f(qVar, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
            return qVar;
        }
        return h0.a(this.f29590p);
    }

    @Override // w00.c
    /* renamed from: h0 */
    public d20.h mo138h0() {
        return this.f29596z;
    }

    @Override // w00.e
    /* renamed from: i */
    public w0 mo234i() {
        return this.f29592t;
    }

    @Override // w00.c
    public w00.c i0() {
        return null;
    }

    @Override // w00.c
    public boolean isInline() {
        return false;
    }

    @Override // w00.f
    public boolean j() {
        return this.f29591q;
    }

    @Override // w00.c, w00.f
    public List<s0> o() {
        return this.B.mo11invoke();
    }

    @Override // w00.c, w00.u
    public kotlin.reflect.jvm.internal.impl.descriptors.f p() {
        return this.f29589o;
    }

    @Override // w00.c
    public t<k0> t() {
        return null;
    }

    public String toString() {
        return s.p("Lazy Java class ", a20.a.j(this));
    }

    @Override // w00.c
    /* renamed from: x */
    public Collection<w00.c> mo225x() {
        List i11;
        if (this.f29589o == kotlin.reflect.jvm.internal.impl.descriptors.f.SEALED) {
            j10.a d11 = j10.d.d(f10.k.COMMON, false, null, 3, null);
            Collection<l10.j> B = this.f29584j.B();
            ArrayList arrayList = new ArrayList();
            for (l10.j jVar : B) {
                w00.e n11 = this.f29586l.g().o(jVar, d11).H0().n();
                w00.c cVar = n11 instanceof w00.c ? (w00.c) n11 : null;
                if (cVar != null) {
                    arrayList.add(cVar);
                }
            }
            return arrayList;
        }
        i11 = w.i();
        return i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h10.h outerContext, w00.i containingDeclaration, l10.g jClass, w00.c cVar) {
        super(outerContext.e(), containingDeclaration, jClass.getName(), outerContext.a().t().a(jClass), false);
        vz.k a11;
        kotlin.reflect.jvm.internal.impl.descriptors.c cVar2;
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar;
        s.g(outerContext, "outerContext");
        s.g(containingDeclaration, "containingDeclaration");
        s.g(jClass, "jClass");
        this.f29583i = outerContext;
        this.f29584j = jClass;
        this.f29585k = cVar;
        h10.h d11 = h10.a.d(outerContext, this, jClass, 0, 4, null);
        this.f29586l = d11;
        d11.a().h().b(jClass, this);
        jClass.K();
        a11 = vz.m.a(new d());
        this.f29587m = a11;
        if (jClass.p()) {
            cVar2 = kotlin.reflect.jvm.internal.impl.descriptors.c.ANNOTATION_CLASS;
        } else if (jClass.J()) {
            cVar2 = kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE;
        } else {
            cVar2 = jClass.w() ? kotlin.reflect.jvm.internal.impl.descriptors.c.ENUM_CLASS : kotlin.reflect.jvm.internal.impl.descriptors.c.CLASS;
        }
        this.f29588n = cVar2;
        if (!jClass.p() && !jClass.w()) {
            fVar = kotlin.reflect.jvm.internal.impl.descriptors.f.Companion.a(false, jClass.i() || jClass.isAbstract() || jClass.J(), !jClass.isFinal());
        } else {
            fVar = kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL;
        }
        this.f29589o = fVar;
        this.f29590p = jClass.getVisibility();
        this.f29591q = (jClass.mo37m() == null || jClass.k()) ? false : true;
        this.f29592t = new b(this);
        g gVar = new g(d11, this, jClass, cVar != null, null, 16, null);
        this.f29593w = gVar;
        this.f29594x = m0.f55293e.a(this, d11.e(), d11.a().k().d(), new e());
        this.f29595y = new d20.f(gVar);
        this.f29596z = new k(d11, jClass, this);
        this.A = h10.f.a(d11, jClass);
        this.B = d11.e().b(new c());
    }
}