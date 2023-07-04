package i10;

import e10.f0;
import e10.g0;
import e10.h0;
import e10.o;
import e10.z;
import f10.j;
import i10.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k20.d0;
import k20.f1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import l10.n;
import l10.q;
import l10.r;
import l10.y;
import n10.t;
import s20.f;
import w00.i0;
import w00.j0;
import w00.l0;
import w00.p;
import w00.s0;
import w00.v0;
import w10.j;
import wz.b0;
import wz.e0;
import wz.r0;
import wz.v;
import wz.w;
import wz.x;
import wz.y0;

/* loaded from: classes5.dex */
public final class g extends i10.j {

    /* renamed from: n */
    private final w00.c f29603n;

    /* renamed from: o */
    private final l10.g f29604o;

    /* renamed from: p */
    private final boolean f29605p;

    /* renamed from: q */
    private final j20.i<List<w00.b>> f29606q;

    /* renamed from: r */
    private final j20.i<Set<u10.f>> f29607r;

    /* renamed from: s */
    private final j20.i<Map<u10.f, n>> f29608s;

    /* renamed from: t */
    private final j20.h<u10.f, y00.g> f29609t;

    /* loaded from: classes5.dex */
    public static final class a extends u implements h00.l<q, Boolean> {

        /* renamed from: a */
        public static final a f29610a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean mo12invoke(q it2) {
            s.g(it2, "it");
            return Boolean.valueOf(!it2.k());
        }
    }

    /* loaded from: classes5.dex */
    /* synthetic */ class b extends o implements h00.l<u10.f, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> {
        b(Object obj) {
            super(1, obj);
        }

        @Override // h00.l
        /* renamed from: d */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> mo12invoke(u10.f p02) {
            s.g(p02, "p0");
            return ((g) this.receiver).I0(p02);
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.f
        public final n00.g getOwner() {
            return m0.b(g.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    /* loaded from: classes5.dex */
    /* synthetic */ class c extends o implements h00.l<u10.f, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> {
        c(Object obj) {
            super(1, obj);
        }

        @Override // h00.l
        /* renamed from: d */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> mo12invoke(u10.f p02) {
            s.g(p02, "p0");
            return ((g) this.receiver).J0(p02);
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.f
        public final n00.g getOwner() {
            return m0.b(g.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends u implements h00.l<u10.f, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(1);
            g.this = r1;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> mo12invoke(u10.f it2) {
            s.g(it2, "it");
            return g.this.I0(it2);
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends u implements h00.l<u10.f, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(1);
            g.this = r1;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> mo12invoke(u10.f it2) {
            s.g(it2, "it");
            return g.this.J0(it2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends u implements h00.a<List<? extends w00.b>> {

        /* renamed from: b */
        final /* synthetic */ h10.h f29614b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(h10.h hVar) {
            super(0);
            g.this = r1;
            this.f29614b = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
        @Override // h00.a
        /* renamed from: invoke */
        public final List<? extends w00.b> mo11invoke() {
            List<? extends w00.b> O0;
            ?? m11;
            Collection<l10.k> mo32g = g.this.f29604o.mo32g();
            ArrayList<w00.b> arrayList = new ArrayList(mo32g.size());
            for (l10.k kVar : mo32g) {
                arrayList.add(g.this.G0(kVar));
            }
            if (g.this.f29604o.r()) {
                w00.b e02 = g.this.e0();
                boolean z11 = false;
                String c11 = t.c(e02, false, false, 2, null);
                if (!arrayList.isEmpty()) {
                    for (w00.b bVar : arrayList) {
                        if (s.c(t.c(bVar, false, false, 2, null), c11)) {
                            break;
                        }
                    }
                }
                z11 = true;
                if (z11) {
                    arrayList.add(e02);
                    this.f29614b.a().h().a(g.this.f29604o, e02);
                }
            }
            this.f29614b.a().w().d(g.this.C(), arrayList);
            m10.l r11 = this.f29614b.a().r();
            h10.h hVar = this.f29614b;
            g gVar = g.this;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = arrayList;
            if (isEmpty) {
                m11 = w.m(gVar.d0());
                arrayList2 = m11;
            }
            O0 = e0.O0(r11.e(hVar, arrayList2));
            return O0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i10.g$g */
    /* loaded from: classes5.dex */
    public static final class C0567g extends u implements h00.a<Map<u10.f, ? extends n>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0567g() {
            super(0);
            g.this = r1;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public final Map<u10.f, ? extends n> mo11invoke() {
            int t11;
            int e11;
            int d11;
            Collection<n> mo35getFields = g.this.f29604o.mo35getFields();
            ArrayList arrayList = new ArrayList();
            for (Object obj : mo35getFields) {
                if (((n) obj).H()) {
                    arrayList.add(obj);
                }
            }
            t11 = x.t(arrayList, 10);
            e11 = r0.e(t11);
            d11 = m00.l.d(e11, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((n) obj2).getName(), obj2);
            }
            return linkedHashMap;
        }
    }

    /* loaded from: classes5.dex */
    public static final class h extends u implements h00.l<u10.f, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> {

        /* renamed from: a */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.h f29616a;

        /* renamed from: b */
        final /* synthetic */ g f29617b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(kotlin.reflect.jvm.internal.impl.descriptors.h hVar, g gVar) {
            super(1);
            this.f29616a = hVar;
            this.f29617b = gVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> mo12invoke(u10.f accessorName) {
            List y02;
            List d11;
            s.g(accessorName, "accessorName");
            if (!s.c(this.f29616a.getName(), accessorName)) {
                y02 = e0.y0(this.f29617b.I0(accessorName), this.f29617b.J0(accessorName));
                return y02;
            }
            d11 = v.d(this.f29616a);
            return d11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class i extends u implements h00.a<Set<? extends u10.f>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i() {
            super(0);
            g.this = r1;
        }

        @Override // h00.a
        /* renamed from: a */
        public final Set<u10.f> mo11invoke() {
            Set<u10.f> S0;
            S0 = e0.S0(g.this.f29604o.mo38z());
            return S0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class j extends u implements h00.l<u10.f, y00.g> {

        /* renamed from: b */
        final /* synthetic */ h10.h f29620b;

        /* loaded from: classes5.dex */
        public static final class a extends u implements h00.a<Set<? extends u10.f>> {

            /* renamed from: a */
            final /* synthetic */ g f29621a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(0);
                this.f29621a = gVar;
            }

            @Override // h00.a
            /* renamed from: a */
            public final Set<u10.f> mo11invoke() {
                Set<u10.f> m11;
                m11 = y0.m(this.f29621a.b(), this.f29621a.d());
                return m11;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(h10.h hVar) {
            super(1);
            g.this = r1;
            this.f29620b = hVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final y00.g mo12invoke(u10.f name) {
            s.g(name, "name");
            if (!((Set) g.this.f29607r.mo11invoke()).contains(name)) {
                n nVar = (n) ((Map) g.this.f29608s.mo11invoke()).get(name);
                if (nVar != null) {
                    return y00.n.H0(this.f29620b.e(), g.this.C(), name, this.f29620b.e().b(new a(g.this)), h10.f.a(this.f29620b, nVar), this.f29620b.a().t().a(nVar));
                }
                return null;
            }
            e10.o d11 = this.f29620b.a().d();
            u10.b h11 = a20.a.h(g.this.C());
            s.e(h11);
            u10.b d12 = h11.d(name);
            s.f(d12, "ownerDescriptor.classId!…createNestedClassId(name)");
            l10.g c11 = d11.c(new o.a(d12, null, g.this.f29604o, 2, null));
            if (c11 == null) {
                return null;
            }
            h10.h hVar = this.f29620b;
            i10.f fVar = new i10.f(hVar, g.this.C(), c11, null, 8, null);
            hVar.a().e().a(fVar);
            return fVar;
        }
    }

    public /* synthetic */ g(h10.h hVar, w00.c cVar, l10.g gVar, boolean z11, g gVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, cVar, gVar, z11, (i11 & 16) != 0 ? null : gVar2);
    }

    private final boolean A0(kotlin.reflect.jvm.internal.impl.descriptors.h hVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        String c11 = t.c(hVar, false, false, 2, null);
        kotlin.reflect.jvm.internal.impl.descriptors.e a11 = eVar.a();
        s.f(a11, "builtinWithErasedParameters.original");
        return s.c(c11, t.c(a11, false, false, 2, null)) && !o0(hVar, eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x006d, code lost:
        if (e10.y.c(r4) == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0074 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean B0(kotlin.reflect.jvm.internal.impl.descriptors.h r7) {
        /*
            r6 = this;
            u10.f r0 = r7.getName()
            java.lang.String r1 = "function.name"
            kotlin.jvm.internal.s.f(r0, r1)
            java.util.List r0 = e10.d0.a(r0)
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1b
        L19:
            r0 = r3
            goto L78
        L1b:
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            u10.f r1 = (u10.f) r1
            java.util.Set r1 = r6.z0(r1)
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L3b
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L3b
        L39:
            r1 = r3
            goto L75
        L3b:
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r4 = r1.next()
            w00.i0 r4 = (w00.i0) r4
            i10.g$h r5 = new i10.g$h
            r5.<init>(r7, r6)
            boolean r5 = r6.n0(r4, r5)
            if (r5 == 0) goto L71
            boolean r4 = r4.L()
            if (r4 != 0) goto L6f
            u10.f r4 = r7.getName()
            java.lang.String r4 = r4.b()
            java.lang.String r5 = "function.name.asString()"
            kotlin.jvm.internal.s.f(r4, r5)
            boolean r4 = e10.y.c(r4)
            if (r4 != 0) goto L71
        L6f:
            r4 = r2
            goto L72
        L71:
            r4 = r3
        L72:
            if (r4 == 0) goto L3f
            r1 = r2
        L75:
            if (r1 == 0) goto L1f
            r0 = r2
        L78:
            if (r0 == 0) goto L7b
            return r3
        L7b:
            boolean r0 = r6.p0(r7)
            if (r0 != 0) goto L8e
            boolean r0 = r6.K0(r7)
            if (r0 != 0) goto L8e
            boolean r7 = r6.r0(r7)
            if (r7 != 0) goto L8e
            goto L8f
        L8e:
            r2 = r3
        L8f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i10.g.B0(kotlin.reflect.jvm.internal.impl.descriptors.h):boolean");
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.h C0(kotlin.reflect.jvm.internal.impl.descriptors.h hVar, h00.l<? super u10.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> lVar, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> collection) {
        kotlin.reflect.jvm.internal.impl.descriptors.h g02;
        kotlin.reflect.jvm.internal.impl.descriptors.e k11 = e10.f.k(hVar);
        if (k11 == null || (g02 = g0(k11, lVar)) == null) {
            return null;
        }
        if (!B0(g02)) {
            g02 = null;
        }
        if (g02 == null) {
            return null;
        }
        return f0(g02, k11, collection);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.h D0(kotlin.reflect.jvm.internal.impl.descriptors.h hVar, h00.l<? super u10.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> lVar, u10.f fVar, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> collection) {
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.h) f0.d(hVar);
        if (hVar2 == null) {
            return null;
        }
        String b11 = f0.b(hVar2);
        s.e(b11);
        u10.f f11 = u10.f.f(b11);
        s.f(f11, "identifier(nameInJava)");
        for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar3 : lVar.mo12invoke(f11)) {
            kotlin.reflect.jvm.internal.impl.descriptors.h l02 = l0(hVar3, fVar);
            if (q0(hVar2, l02)) {
                return f0(l02, hVar2, collection);
            }
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.h E0(kotlin.reflect.jvm.internal.impl.descriptors.h hVar, h00.l<? super u10.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> lVar) {
        if (hVar.isSuspend()) {
            u10.f name = hVar.getName();
            s.f(name, "descriptor.name");
            for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar2 : lVar.mo12invoke(name)) {
                kotlin.reflect.jvm.internal.impl.descriptors.h m02 = m0(hVar2);
                if (m02 == null || !o0(m02, hVar)) {
                    m02 = null;
                    continue;
                }
                if (m02 != null) {
                    return m02;
                }
            }
            return null;
        }
        return null;
    }

    public final g10.b G0(l10.k kVar) {
        int t11;
        List<s0> y02;
        w00.c C = C();
        g10.b o12 = g10.b.o1(C, h10.f.a(w(), kVar), false, w().a().t().a(kVar));
        s.f(o12, "createJavaConstructor(\n …ce(constructor)\n        )");
        h10.h e11 = h10.a.e(w(), o12, kVar, C.o().size());
        j.b K = K(e11, o12, kVar.h());
        List<s0> o11 = C.o();
        s.f(o11, "classDescriptor.declaredTypeParameters");
        List<y> typeParameters = kVar.getTypeParameters();
        t11 = x.t(typeParameters, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (y yVar : typeParameters) {
            s0 a11 = e11.f().a(yVar);
            s.e(a11);
            arrayList.add(a11);
        }
        y02 = e0.y0(o11, arrayList);
        o12.m1(K.a(), h0.a(kVar.getVisibility()), y02);
        o12.U0(false);
        o12.V0(K.b());
        o12.c1(C.n());
        e11.a().h().a(kVar, o12);
        return o12;
    }

    private final g10.e H0(l10.w wVar) {
        List<? extends s0> i11;
        List<v0> i12;
        g10.e l12 = g10.e.l1(C(), h10.f.a(w(), wVar), wVar.getName(), w().a().t().a(wVar), true);
        s.f(l12, "createJavaMethod(\n      …omponent), true\n        )");
        d0 o11 = w().g().o(wVar.getType(), j10.d.d(f10.k.COMMON, false, null, 2, null));
        l0 z11 = z();
        i11 = w.i();
        i12 = w.i();
        l12.k1(null, z11, i11, i12, o11, kotlin.reflect.jvm.internal.impl.descriptors.f.Companion.a(false, false, true), p.f55309e, null);
        l12.o1(false, false);
        w().a().h().e(wVar, l12);
        return l12;
    }

    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> I0(u10.f fVar) {
        int t11;
        Collection<r> f11 = y().mo11invoke().f(fVar);
        t11 = x.t(f11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (r rVar : f11) {
            arrayList.add(I(rVar));
        }
        return arrayList;
    }

    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> J0(u10.f fVar) {
        Set<kotlin.reflect.jvm.internal.impl.descriptors.h> x02 = x0(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : x02) {
            kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) obj;
            if (!(f0.a(hVar) || e10.f.k(hVar) != null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean K0(kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
        e10.f fVar = e10.f.f24442m;
        u10.f name = hVar.getName();
        s.f(name, "name");
        if (fVar.l(name)) {
            u10.f name2 = hVar.getName();
            s.f(name2, "name");
            Set<kotlin.reflect.jvm.internal.impl.descriptors.h> x02 = x0(name2);
            ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.e> arrayList = new ArrayList();
            for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar2 : x02) {
                kotlin.reflect.jvm.internal.impl.descriptors.e k11 = e10.f.k(hVar2);
                if (k11 != null) {
                    arrayList.add(k11);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar : arrayList) {
                if (A0(hVar, eVar)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private final void U(List<v0> list, kotlin.reflect.jvm.internal.impl.descriptors.d dVar, int i11, r rVar, d0 d0Var, d0 d0Var2) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b11 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b();
        u10.f name = rVar.getName();
        d0 o11 = f1.o(d0Var);
        s.f(o11, "makeNotNullable(returnType)");
        list.add(new y00.l0(dVar, null, i11, b11, name, o11, rVar.M(), false, false, d0Var2 == null ? null : f1.o(d0Var2), w().a().t().a(rVar)));
    }

    private final void V(Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> collection, u10.f fVar, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> collection2, boolean z11) {
        List y02;
        int t11;
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> d11 = f10.a.d(fVar, collection2, collection, C(), w().a().c(), w().a().k().a());
        s.f(d11, "resolveOverridesForNonSt….overridingUtil\n        )");
        if (!z11) {
            collection.addAll(d11);
            return;
        }
        y02 = e0.y0(collection, d11);
        t11 = x.t(d11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (kotlin.reflect.jvm.internal.impl.descriptors.h resolvedOverride : d11) {
            kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) f0.e(resolvedOverride);
            if (hVar == null) {
                s.f(resolvedOverride, "resolvedOverride");
            } else {
                s.f(resolvedOverride, "resolvedOverride");
                resolvedOverride = f0(resolvedOverride, hVar, y02);
            }
            arrayList.add(resolvedOverride);
        }
        collection.addAll(arrayList);
    }

    private final void W(u10.f fVar, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> collection, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> collection2, Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> collection3, h00.l<? super u10.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> lVar) {
        for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar : collection2) {
            s20.a.a(collection3, D0(hVar, lVar, fVar, collection));
            s20.a.a(collection3, C0(hVar, lVar, collection));
            s20.a.a(collection3, E0(hVar, lVar));
        }
    }

    private final void X(Set<? extends i0> set, Collection<i0> collection, Set<i0> set2, h00.l<? super u10.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> lVar) {
        for (i0 i0Var : set) {
            g10.f h02 = h0(i0Var, lVar);
            if (h02 != null) {
                collection.add(h02);
                if (set2 == null) {
                    return;
                }
                set2.add(i0Var);
                return;
            }
        }
    }

    private final void Y(u10.f fVar, Collection<i0> collection) {
        r rVar = (r) wz.u.D0(y().mo11invoke().f(fVar));
        if (rVar == null) {
            return;
        }
        collection.add(j0(this, rVar, null, kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL, 2, null));
    }

    private final Collection<d0> b0() {
        if (this.f29605p) {
            Collection<d0> a11 = C().mo234i().a();
            s.f(a11, "ownerDescriptor.typeConstructor.supertypes");
            return a11;
        }
        return w().a().k().d().f(C());
    }

    private final List<v0> c0(y00.f fVar) {
        vz.p pVar;
        Collection<r> A = this.f29604o.A();
        ArrayList arrayList = new ArrayList(A.size());
        j10.a d11 = j10.d.d(f10.k.COMMON, true, null, 2, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : A) {
            if (s.c(((r) obj).getName(), z.f24512b)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        vz.p pVar2 = new vz.p(arrayList2, arrayList3);
        List list = (List) pVar2.a();
        List<r> list2 = (List) pVar2.b();
        list.size();
        r rVar = (r) wz.u.d0(list);
        if (rVar != null) {
            l10.x mo40getReturnType = rVar.mo40getReturnType();
            if (mo40getReturnType instanceof l10.f) {
                l10.f fVar2 = (l10.f) mo40getReturnType;
                pVar = new vz.p(w().g().k(fVar2, d11, true), w().g().o(fVar2.mo31o(), d11));
            } else {
                pVar = new vz.p(w().g().o(mo40getReturnType, d11), null);
            }
            U(arrayList, fVar, 0, rVar, (d0) pVar.a(), (d0) pVar.b());
        }
        int i11 = 0;
        int i12 = rVar == null ? 0 : 1;
        for (r rVar2 : list2) {
            U(arrayList, fVar, i11 + i12, rVar2, w().g().o(rVar2.mo40getReturnType(), d11), null);
            i11++;
        }
        return arrayList;
    }

    public final w00.b d0() {
        List<v0> emptyList;
        boolean p11 = this.f29604o.p();
        if ((this.f29604o.J() || !this.f29604o.s()) && !p11) {
            return null;
        }
        w00.c C = C();
        g10.b o12 = g10.b.o1(C, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b(), true, w().a().t().a(this.f29604o));
        s.f(o12, "createJavaConstructor(\n ….source(jClass)\n        )");
        if (p11) {
            emptyList = c0(o12);
        } else {
            emptyList = Collections.emptyList();
        }
        o12.V0(false);
        o12.l1(emptyList, v0(C));
        o12.U0(true);
        o12.c1(C.n());
        w().a().h().a(this.f29604o, o12);
        return o12;
    }

    public final w00.b e0() {
        w00.c C = C();
        g10.b o12 = g10.b.o1(C, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b(), true, w().a().t().a(this.f29604o));
        s.f(o12, "createJavaConstructor(\n ….source(jClass)\n        )");
        List<v0> k02 = k0(o12);
        o12.V0(false);
        o12.l1(k02, v0(C));
        o12.U0(false);
        o12.c1(C.n());
        return o12;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.h f0(kotlin.reflect.jvm.internal.impl.descriptors.h hVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> collection) {
        boolean z11;
        boolean z12 = false;
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar2 : collection) {
                if (!s.c(hVar, hVar2) && hVar2.n0() == null && o0(hVar2, aVar)) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            }
        }
        z12 = true;
        if (z12) {
            return hVar;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h build = hVar.s().mo244e().build();
        s.e(build);
        return build;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.h g0(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, h00.l<? super u10.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> lVar) {
        Object obj;
        int t11;
        u10.f name = eVar.getName();
        s.f(name, "overridden.name");
        Iterator<T> it2 = lVar.mo12invoke(name).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (A0((kotlin.reflect.jvm.internal.impl.descriptors.h) obj, eVar)) {
                break;
            }
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) obj;
        if (hVar == null) {
            return null;
        }
        e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> s11 = hVar.s();
        List<v0> h11 = eVar.h();
        s.f(h11, "overridden.valueParameters");
        t11 = x.t(h11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (v0 v0Var : h11) {
            d0 type = v0Var.getType();
            s.f(type, "it.type");
            arrayList.add(new g10.i(type, v0Var.u0()));
        }
        List<v0> h12 = hVar.h();
        s.f(h12, "override.valueParameters");
        s11.mo242c(g10.h.a(arrayList, h12, eVar));
        s11.mo258s();
        s11.mo248i();
        return s11.build();
    }

    private final g10.f h0(i0 i0Var, h00.l<? super u10.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> lVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar;
        List<? extends s0> i11;
        y00.e0 e0Var = null;
        if (n0(i0Var, lVar)) {
            kotlin.reflect.jvm.internal.impl.descriptors.h t02 = t0(i0Var, lVar);
            s.e(t02);
            if (i0Var.L()) {
                hVar = u0(i0Var, lVar);
                s.e(hVar);
            } else {
                hVar = null;
            }
            if (hVar != null) {
                hVar.p();
                t02.p();
            }
            g10.d dVar = new g10.d(C(), t02, hVar, i0Var);
            d0 returnType = t02.getReturnType();
            s.e(returnType);
            i11 = w.i();
            dVar.V0(returnType, i11, z(), null);
            y00.d0 h11 = w10.c.h(dVar, t02.mo140getAnnotations(), false, false, false, t02.f());
            h11.J0(t02);
            h11.M0(dVar.getType());
            s.f(h11, "createGetter(\n          …escriptor.type)\n        }");
            if (hVar != null) {
                List<v0> h12 = hVar.h();
                s.f(h12, "setterMethod.valueParameters");
                v0 v0Var = (v0) wz.u.d0(h12);
                if (v0Var != null) {
                    e0Var = w10.c.j(dVar, hVar.mo140getAnnotations(), v0Var.mo140getAnnotations(), false, false, false, hVar.getVisibility(), hVar.f());
                    e0Var.J0(hVar);
                } else {
                    throw new AssertionError(s.p("No parameter found for ", hVar));
                }
            }
            dVar.P0(h11, e0Var);
            return dVar;
        }
        return null;
    }

    private final g10.f i0(r rVar, d0 d0Var, kotlin.reflect.jvm.internal.impl.descriptors.f fVar) {
        List<? extends s0> i11;
        g10.f X0 = g10.f.X0(C(), h10.f.a(w(), rVar), fVar, h0.a(rVar.getVisibility()), false, rVar.getName(), w().a().t().a(rVar), false);
        s.f(X0, "create(\n            owne…inal = */ false\n        )");
        y00.d0 b11 = w10.c.b(X0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b());
        s.f(b11, "createDefaultGetter(prop…iptor, Annotations.EMPTY)");
        X0.P0(b11, null);
        d0 q11 = d0Var == null ? q(rVar, h10.a.f(w(), X0, rVar, 0, 4, null)) : d0Var;
        i11 = w.i();
        X0.V0(q11, i11, z(), null);
        b11.M0(q11);
        return X0;
    }

    static /* synthetic */ g10.f j0(g gVar, r rVar, d0 d0Var, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            d0Var = null;
        }
        return gVar.i0(rVar, d0Var, fVar);
    }

    private final List<v0> k0(y00.f fVar) {
        Collection<l10.w> n11 = this.f29604o.n();
        ArrayList arrayList = new ArrayList(n11.size());
        d0 d0Var = null;
        j10.a d11 = j10.d.d(f10.k.COMMON, false, null, 2, null);
        int i11 = 0;
        for (l10.w wVar : n11) {
            int i12 = i11 + 1;
            d0 o11 = w().g().o(wVar.getType(), d11);
            arrayList.add(new y00.l0(fVar, null, i11, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b(), wVar.getName(), o11, false, false, false, wVar.b() ? w().a().m().l().k(o11) : d0Var, w().a().t().a(wVar)));
            i11 = i12;
            d0Var = null;
        }
        return arrayList;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.h l0(kotlin.reflect.jvm.internal.impl.descriptors.h hVar, u10.f fVar) {
        e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> s11 = hVar.s();
        s11.mo254o(fVar);
        s11.mo258s();
        s11.mo248i();
        kotlin.reflect.jvm.internal.impl.descriptors.h build = s11.build();
        s.e(build);
        return build;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x004e, code lost:
        if (t00.l.a(r3, w().a().q().c()) == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.reflect.jvm.internal.impl.descriptors.h m0(kotlin.reflect.jvm.internal.impl.descriptors.h r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.h()
            java.lang.String r1 = "valueParameters"
            kotlin.jvm.internal.s.f(r0, r1)
            java.lang.Object r0 = wz.u.p0(r0)
            w00.v0 r0 = (w00.v0) r0
            r2 = 0
            if (r0 != 0) goto L14
        L12:
            r0 = r2
            goto L50
        L14:
            k20.d0 r3 = r0.getType()
            k20.w0 r3 = r3.H0()
            w00.e r3 = r3.n()
            if (r3 != 0) goto L24
        L22:
            r3 = r2
            goto L3a
        L24:
            u10.d r3 = a20.a.j(r3)
            if (r3 != 0) goto L2b
            goto L22
        L2b:
            boolean r4 = r3.f()
            if (r4 == 0) goto L32
            goto L33
        L32:
            r3 = r2
        L33:
            if (r3 != 0) goto L36
            goto L22
        L36:
            u10.c r3 = r3.l()
        L3a:
            h10.h r4 = r5.w()
            h10.c r4 = r4.a()
            h10.d r4 = r4.q()
            boolean r4 = r4.c()
            boolean r3 = t00.l.a(r3, r4)
            if (r3 == 0) goto L12
        L50:
            if (r0 != 0) goto L53
            return r2
        L53:
            kotlin.reflect.jvm.internal.impl.descriptors.e$a r2 = r6.s()
            java.util.List r6 = r6.h()
            kotlin.jvm.internal.s.f(r6, r1)
            r1 = 1
            java.util.List r6 = wz.u.W(r6, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.e$a r6 = r2.mo242c(r6)
            k20.d0 r0 = r0.getType()
            java.util.List r0 = r0.G0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            k20.y0 r0 = (k20.y0) r0
            k20.d0 r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.e$a r6 = r6.mo246g(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.e r6 = r6.build()
            kotlin.reflect.jvm.internal.impl.descriptors.h r6 = (kotlin.reflect.jvm.internal.impl.descriptors.h) r6
            r0 = r6
            y00.g0 r0 = (y00.g0) r0
            if (r0 != 0) goto L8a
            goto L8d
        L8a:
            r0.d1(r1)
        L8d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i10.g.m0(kotlin.reflect.jvm.internal.impl.descriptors.h):kotlin.reflect.jvm.internal.impl.descriptors.h");
    }

    private final boolean n0(i0 i0Var, h00.l<? super u10.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> lVar) {
        if (i10.c.a(i0Var)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h t02 = t0(i0Var, lVar);
        kotlin.reflect.jvm.internal.impl.descriptors.h u02 = u0(i0Var, lVar);
        if (t02 == null) {
            return false;
        }
        if (i0Var.L()) {
            return u02 != null && u02.p() == t02.p();
        }
        return true;
    }

    private final boolean o0(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        j.i.a c11 = w10.j.f55379d.G(aVar2, aVar, true).c();
        s.f(c11, "DEFAULT.isOverridableByW…iptor, this, true).result");
        return c11 == j.i.a.OVERRIDABLE && !e10.s.f24486a.a(aVar2, aVar);
    }

    private final boolean p0(kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
        boolean z11;
        g0.a aVar = g0.f24453a;
        u10.f name = hVar.getName();
        s.f(name, "name");
        List<u10.f> b11 = aVar.b(name);
        if (!(b11 instanceof Collection) || !b11.isEmpty()) {
            for (u10.f fVar : b11) {
                Set<kotlin.reflect.jvm.internal.impl.descriptors.h> x02 = x0(fVar);
                ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.h> arrayList = new ArrayList();
                for (Object obj : x02) {
                    if (f0.a((kotlin.reflect.jvm.internal.impl.descriptors.h) obj)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    kotlin.reflect.jvm.internal.impl.descriptors.h l02 = l0(hVar, fVar);
                    if (!arrayList.isEmpty()) {
                        for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar2 : arrayList) {
                            if (q0(hVar2, l02)) {
                                z11 = true;
                                continue;
                                break;
                            }
                        }
                    }
                }
                z11 = false;
                continue;
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean q0(kotlin.reflect.jvm.internal.impl.descriptors.h hVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (e10.e.f24440m.k(hVar)) {
            eVar = eVar.a();
        }
        s.f(eVar, "if (superDescriptor.isRe…iginal else subDescriptor");
        return o0(eVar, hVar);
    }

    private final boolean r0(kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
        boolean z11;
        kotlin.reflect.jvm.internal.impl.descriptors.h m02 = m0(hVar);
        if (m02 == null) {
            return false;
        }
        u10.f name = hVar.getName();
        s.f(name, "name");
        Set<kotlin.reflect.jvm.internal.impl.descriptors.h> x02 = x0(name);
        if ((x02 instanceof Collection) && x02.isEmpty()) {
            return false;
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar2 : x02) {
            if (hVar2.isSuspend() && o0(m02, hVar2)) {
                z11 = true;
                continue;
            } else {
                z11 = false;
                continue;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.h s0(i0 i0Var, String str, h00.l<? super u10.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> lVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar;
        u10.f f11 = u10.f.f(str);
        s.f(f11, "identifier(getterName)");
        Iterator<T> it2 = lVar.mo12invoke(f11).iterator();
        do {
            hVar = null;
            if (!it2.hasNext()) {
                break;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.h hVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.h) it2.next();
            if (hVar2.h().size() == 0) {
                kotlin.reflect.jvm.internal.impl.types.checker.f fVar = kotlin.reflect.jvm.internal.impl.types.checker.f.f35149a;
                d0 returnType = hVar2.getReturnType();
                if (returnType == null ? false : fVar.c(returnType, i0Var.getType())) {
                    hVar = hVar2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (hVar == null);
        return hVar;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.h t0(i0 i0Var, h00.l<? super u10.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> lVar) {
        j0 mo239getGetter = i0Var.mo239getGetter();
        j0 j0Var = mo239getGetter == null ? null : (j0) f0.d(mo239getGetter);
        String a11 = j0Var != null ? e10.i.f24467a.a(j0Var) : null;
        if (a11 != null && !f0.f(C(), j0Var)) {
            return s0(i0Var, a11, lVar);
        }
        String b11 = i0Var.getName().b();
        s.f(b11, "name.asString()");
        return s0(i0Var, e10.y.a(b11), lVar);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.h u0(i0 i0Var, h00.l<? super u10.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> lVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar;
        d0 returnType;
        String b11 = i0Var.getName().b();
        s.f(b11, "name.asString()");
        u10.f f11 = u10.f.f(e10.y.d(b11));
        s.f(f11, "identifier(JvmAbi.setterName(name.asString()))");
        Iterator<T> it2 = lVar.mo12invoke(f11).iterator();
        do {
            hVar = null;
            if (!it2.hasNext()) {
                break;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.h hVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.h) it2.next();
            if (hVar2.h().size() == 1 && (returnType = hVar2.getReturnType()) != null && t00.h.A0(returnType)) {
                kotlin.reflect.jvm.internal.impl.types.checker.f fVar = kotlin.reflect.jvm.internal.impl.types.checker.f.f35149a;
                List<v0> h11 = hVar2.h();
                s.f(h11, "descriptor.valueParameters");
                if (fVar.b(((v0) wz.u.C0(h11)).getType(), i0Var.getType())) {
                    hVar = hVar2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (hVar == null);
        return hVar;
    }

    private final w00.q v0(w00.c cVar) {
        w00.q visibility = cVar.getVisibility();
        s.f(visibility, "classDescriptor.visibility");
        if (s.c(visibility, e10.r.f24483b)) {
            w00.q PROTECTED_AND_PACKAGE = e10.r.f24484c;
            s.f(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
            return PROTECTED_AND_PACKAGE;
        }
        return visibility;
    }

    private final Set<kotlin.reflect.jvm.internal.impl.descriptors.h> x0(u10.f fVar) {
        Collection<d0> b02 = b0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (d0 d0Var : b02) {
            b0.z(linkedHashSet, d0Var.m().c(fVar, d10.d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    private final Set<i0> z0(u10.f fVar) {
        Set<i0> S0;
        int t11;
        Collection<d0> b02 = b0();
        ArrayList arrayList = new ArrayList();
        for (d0 d0Var : b02) {
            Collection<? extends i0> a11 = d0Var.m().a(fVar, d10.d.WHEN_GET_SUPER_MEMBERS);
            t11 = x.t(a11, 10);
            ArrayList arrayList2 = new ArrayList(t11);
            for (i0 i0Var : a11) {
                arrayList2.add(i0Var);
            }
            b0.z(arrayList, arrayList2);
        }
        S0 = e0.S0(arrayList);
        return S0;
    }

    public void F0(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        c10.a.a(w().a().l(), location, C(), name);
    }

    @Override // i10.j
    protected boolean G(g10.e eVar) {
        s.g(eVar, "<this>");
        if (this.f29604o.p()) {
            return false;
        }
        return B0(eVar);
    }

    @Override // i10.j
    protected j.a H(r method, List<? extends s0> methodTypeParameters, d0 returnType, List<? extends v0> valueParameters) {
        s.g(method, "method");
        s.g(methodTypeParameters, "methodTypeParameters");
        s.g(returnType, "returnType");
        s.g(valueParameters, "valueParameters");
        j.b b11 = w().a().s().b(method, C(), returnType, null, valueParameters, methodTypeParameters);
        s.f(b11, "c.components.signaturePr…dTypeParameters\n        )");
        d0 d11 = b11.d();
        s.f(d11, "propagated.returnType");
        d0 c11 = b11.c();
        List<v0> f11 = b11.f();
        s.f(f11, "propagated.valueParameters");
        List<s0> e11 = b11.e();
        s.f(e11, "propagated.typeParameters");
        boolean g11 = b11.g();
        List<String> b12 = b11.b();
        s.f(b12, "propagated.errors");
        return new j.a(d11, c11, f11, e11, g11, b12);
    }

    @Override // i10.j
    /* renamed from: Z */
    public LinkedHashSet<u10.f> n(d20.d kindFilter, h00.l<? super u10.f, Boolean> lVar) {
        s.g(kindFilter, "kindFilter");
        Collection<d0> a11 = C().mo234i().a();
        s.f(a11, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet<u10.f> linkedHashSet = new LinkedHashSet<>();
        for (d0 d0Var : a11) {
            b0.z(linkedHashSet, d0Var.m().b());
        }
        linkedHashSet.addAll(y().mo11invoke().a());
        linkedHashSet.addAll(y().mo11invoke().c());
        linkedHashSet.addAll(l(kindFilter, lVar));
        linkedHashSet.addAll(w().a().w().a(C()));
        return linkedHashSet;
    }

    @Override // i10.j, d20.i, d20.h
    public Collection<i0> a(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        F0(name, location);
        return super.a(name, location);
    }

    @Override // i10.j
    /* renamed from: a0 */
    public i10.a p() {
        return new i10.a(this.f29604o, a.f29610a);
    }

    @Override // i10.j, d20.i, d20.h
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        F0(name, location);
        return super.c(name, location);
    }

    @Override // d20.i, d20.k
    /* renamed from: e */
    public w00.e mo137e(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        F0(name, location);
        g gVar = (g) B();
        y00.g mo12invoke = gVar == null ? null : gVar.f29609t.mo12invoke(name);
        return mo12invoke == null ? this.f29609t.mo12invoke(name) : mo12invoke;
    }

    @Override // i10.j
    protected Set<u10.f> l(d20.d kindFilter, h00.l<? super u10.f, Boolean> lVar) {
        Set<u10.f> m11;
        s.g(kindFilter, "kindFilter");
        m11 = y0.m(this.f29607r.mo11invoke(), this.f29608s.mo11invoke().keySet());
        return m11;
    }

    @Override // i10.j
    protected void o(Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> result, u10.f name) {
        s.g(result, "result");
        s.g(name, "name");
        if (this.f29604o.r() && y().mo11invoke().b(name) != null) {
            boolean z11 = true;
            if (!result.isEmpty()) {
                Iterator<T> it2 = result.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((kotlin.reflect.jvm.internal.impl.descriptors.h) it2.next()).h().isEmpty()) {
                        z11 = false;
                        break;
                    }
                }
            }
            if (z11) {
                l10.w b11 = y().mo11invoke().b(name);
                s.e(b11);
                result.add(H0(b11));
            }
        }
        w().a().w().b(C(), name, result);
    }

    @Override // i10.j
    protected void r(Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> result, u10.f name) {
        List i11;
        List y02;
        boolean z11;
        s.g(result, "result");
        s.g(name, "name");
        Set<kotlin.reflect.jvm.internal.impl.descriptors.h> x02 = x0(name);
        if (!g0.f24453a.k(name) && !e10.f.f24442m.l(name)) {
            if (!(x02 instanceof Collection) || !x02.isEmpty()) {
                for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar : x02) {
                    if (eVar.isSuspend()) {
                        z11 = false;
                        break;
                    }
                }
            }
            z11 = true;
            if (z11) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : x02) {
                    if (B0((kotlin.reflect.jvm.internal.impl.descriptors.h) obj)) {
                        arrayList.add(obj);
                    }
                }
                V(result, name, arrayList, false);
                return;
            }
        }
        s20.f a11 = s20.f.f50187c.a();
        i11 = w.i();
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> d11 = f10.a.d(name, x02, i11, C(), g20.q.f27438a, w().a().k().a());
        s.f(d11, "resolveOverridesForNonSt….overridingUtil\n        )");
        W(name, result, d11, result, new b(this));
        W(name, result, d11, a11, new c(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : x02) {
            if (B0((kotlin.reflect.jvm.internal.impl.descriptors.h) obj2)) {
                arrayList2.add(obj2);
            }
        }
        y02 = e0.y0(arrayList2, a11);
        V(result, name, y02, true);
    }

    @Override // i10.j
    protected void s(u10.f name, Collection<i0> result) {
        Set<? extends i0> k11;
        Set m11;
        s.g(name, "name");
        s.g(result, "result");
        if (this.f29604o.p()) {
            Y(name, result);
        }
        Set<i0> z02 = z0(name);
        if (z02.isEmpty()) {
            return;
        }
        f.b bVar = s20.f.f50187c;
        s20.f a11 = bVar.a();
        s20.f a12 = bVar.a();
        X(z02, result, a11, new d());
        k11 = y0.k(z02, a11);
        X(k11, a12, null, new e());
        m11 = y0.m(z02, a12);
        Collection<? extends i0> d11 = f10.a.d(name, m11, result, C(), w().a().c(), w().a().k().a());
        s.f(d11, "resolveOverridesForNonSt…rridingUtil\n            )");
        result.addAll(d11);
    }

    @Override // i10.j
    protected Set<u10.f> t(d20.d kindFilter, h00.l<? super u10.f, Boolean> lVar) {
        s.g(kindFilter, "kindFilter");
        if (this.f29604o.p()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(y().mo11invoke().d());
        Collection<d0> a11 = C().mo234i().a();
        s.f(a11, "ownerDescriptor.typeConstructor.supertypes");
        for (d0 d0Var : a11) {
            b0.z(linkedHashSet, d0Var.m().d());
        }
        return linkedHashSet;
    }

    @Override // i10.j
    public String toString() {
        return s.p("Lazy Java member scope for ", this.f29604o.e());
    }

    public final j20.i<List<w00.b>> w0() {
        return this.f29606q;
    }

    @Override // i10.j
    /* renamed from: y0 */
    public w00.c C() {
        return this.f29603n;
    }

    @Override // i10.j
    protected l0 z() {
        return w10.d.l(C());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h10.h c11, w00.c ownerDescriptor, l10.g jClass, boolean z11, g gVar) {
        super(c11, gVar);
        s.g(c11, "c");
        s.g(ownerDescriptor, "ownerDescriptor");
        s.g(jClass, "jClass");
        this.f29603n = ownerDescriptor;
        this.f29604o = jClass;
        this.f29605p = z11;
        this.f29606q = c11.e().b(new f(c11));
        this.f29607r = c11.e().b(new i());
        this.f29608s = c11.e().b(new C0567g());
        this.f29609t = c11.e().h(new j(c11));
    }
}