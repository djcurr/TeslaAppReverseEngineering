package i20;

import d20.h;
import d20.k;
import g20.a0;
import g20.c0;
import g20.v;
import g20.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k20.d0;
import k20.k0;
import k20.w0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import p10.c;
import r10.i;
import w00.i0;
import w00.m0;
import w00.n0;
import w00.q;
import w00.q0;
import w00.s0;
import w00.t;
import w00.t0;
import w00.v0;
import w00.z;
import wz.b0;
import wz.e0;
import wz.r0;
import wz.w;
import wz.x;
import wz.y0;

/* loaded from: classes5.dex */
public final class d extends y00.a implements w00.i {
    private final j20.j<t<k0>> A;
    private final y.a B;
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g C;

    /* renamed from: f  reason: collision with root package name */
    private final p10.c f29695f;

    /* renamed from: g  reason: collision with root package name */
    private final r10.a f29696g;

    /* renamed from: h  reason: collision with root package name */
    private final n0 f29697h;

    /* renamed from: i  reason: collision with root package name */
    private final u10.b f29698i;

    /* renamed from: j  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.f f29699j;

    /* renamed from: k  reason: collision with root package name */
    private final q f29700k;

    /* renamed from: l  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.c f29701l;

    /* renamed from: m  reason: collision with root package name */
    private final g20.l f29702m;

    /* renamed from: n  reason: collision with root package name */
    private final d20.i f29703n;

    /* renamed from: o  reason: collision with root package name */
    private final b f29704o;

    /* renamed from: p  reason: collision with root package name */
    private final m0<a> f29705p;

    /* renamed from: q  reason: collision with root package name */
    private final c f29706q;

    /* renamed from: t  reason: collision with root package name */
    private final w00.i f29707t;

    /* renamed from: w  reason: collision with root package name */
    private final j20.j<w00.b> f29708w;

    /* renamed from: x  reason: collision with root package name */
    private final j20.i<Collection<w00.b>> f29709x;

    /* renamed from: y  reason: collision with root package name */
    private final j20.j<w00.c> f29710y;

    /* renamed from: z  reason: collision with root package name */
    private final j20.i<Collection<w00.c>> f29711z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class a extends i20.h {

        /* renamed from: g  reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.types.checker.h f29712g;

        /* renamed from: h  reason: collision with root package name */
        private final j20.i<Collection<w00.i>> f29713h;

        /* renamed from: i  reason: collision with root package name */
        private final j20.i<Collection<d0>> f29714i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ d f29715j;

        /* renamed from: i20.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0571a extends u implements h00.a<List<? extends u10.f>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List<u10.f> f29716a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0571a(List<u10.f> list) {
                super(0);
                this.f29716a = list;
            }

            @Override // h00.a
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final List<? extends u10.f> mo11invoke() {
                return this.f29716a;
            }
        }

        /* loaded from: classes5.dex */
        static final class b extends u implements h00.a<Collection<? extends w00.i>> {
            b() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final Collection<w00.i> mo11invoke() {
                return a.this.k(d20.d.f23458o, d20.h.f23478a.a(), d10.d.WHEN_GET_ALL_DESCRIPTORS);
            }
        }

        /* loaded from: classes5.dex */
        public static final class c extends w10.h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List<D> f29718a;

            c(List<D> list) {
                this.f29718a = list;
            }

            @Override // w10.i
            public void a(kotlin.reflect.jvm.internal.impl.descriptors.b fakeOverride) {
                s.g(fakeOverride, "fakeOverride");
                w10.j.L(fakeOverride, null);
                this.f29718a.add(fakeOverride);
            }

            @Override // w10.h
            protected void e(kotlin.reflect.jvm.internal.impl.descriptors.b fromSuper, kotlin.reflect.jvm.internal.impl.descriptors.b fromCurrent) {
                s.g(fromSuper, "fromSuper");
                s.g(fromCurrent, "fromCurrent");
            }
        }

        /* renamed from: i20.d$a$d  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0572d extends u implements h00.a<Collection<? extends d0>> {
            C0572d() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final Collection<d0> mo11invoke() {
                return a.this.f29712g.f(a.this.C());
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(i20.d r8, kotlin.reflect.jvm.internal.impl.types.checker.h r9) {
            /*
                r7 = this;
                java.lang.String r0 = "this$0"
                kotlin.jvm.internal.s.g(r8, r0)
                java.lang.String r0 = "kotlinTypeRefiner"
                kotlin.jvm.internal.s.g(r9, r0)
                r7.f29715j = r8
                g20.l r2 = r8.U0()
                p10.c r0 = r8.V0()
                java.util.List r3 = r0.o0()
                java.lang.String r0 = "classProto.functionList"
                kotlin.jvm.internal.s.f(r3, r0)
                p10.c r0 = r8.V0()
                java.util.List r4 = r0.v0()
                java.lang.String r0 = "classProto.propertyList"
                kotlin.jvm.internal.s.f(r4, r0)
                p10.c r0 = r8.V0()
                java.util.List r5 = r0.D0()
                java.lang.String r0 = "classProto.typeAliasList"
                kotlin.jvm.internal.s.f(r5, r0)
                p10.c r0 = r8.V0()
                java.util.List r0 = r0.s0()
                java.lang.String r1 = "classProto.nestedClassNameList"
                kotlin.jvm.internal.s.f(r0, r1)
                g20.l r8 = r8.U0()
                r10.c r8 = r8.g()
                java.util.ArrayList r1 = new java.util.ArrayList
                r6 = 10
                int r6 = wz.u.t(r0, r6)
                r1.<init>(r6)
                java.util.Iterator r0 = r0.iterator()
            L5b:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L73
                java.lang.Object r6 = r0.next()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                u10.f r6 = g20.w.b(r8, r6)
                r1.add(r6)
                goto L5b
            L73:
                i20.d$a$a r6 = new i20.d$a$a
                r6.<init>(r1)
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f29712g = r9
                g20.l r8 = r7.q()
                j20.n r8 = r8.h()
                i20.d$a$b r9 = new i20.d$a$b
                r9.<init>()
                j20.i r8 = r8.b(r9)
                r7.f29713h = r8
                g20.l r8 = r7.q()
                j20.n r8 = r8.h()
                i20.d$a$d r9 = new i20.d$a$d
                r9.<init>()
                j20.i r8 = r8.b(r9)
                r7.f29714i = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i20.d.a.<init>(i20.d, kotlin.reflect.jvm.internal.impl.types.checker.h):void");
        }

        private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> void B(u10.f fVar, Collection<? extends D> collection, List<D> list) {
            q().c().m().a().w(fVar, collection, new ArrayList(list), C(), new c(list));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final d C() {
            return this.f29715j;
        }

        public void D(u10.f name, d10.b location) {
            s.g(name, "name");
            s.g(location, "location");
            c10.a.a(q().c().o(), location, C(), name);
        }

        @Override // i20.h, d20.i, d20.h
        public Collection<i0> a(u10.f name, d10.b location) {
            s.g(name, "name");
            s.g(location, "location");
            D(name, location);
            return super.a(name, location);
        }

        @Override // i20.h, d20.i, d20.h
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f name, d10.b location) {
            s.g(name, "name");
            s.g(location, "location");
            D(name, location);
            return super.c(name, location);
        }

        @Override // i20.h, d20.i, d20.k
        /* renamed from: e */
        public w00.e mo137e(u10.f name, d10.b location) {
            w00.c f11;
            s.g(name, "name");
            s.g(location, "location");
            D(name, location);
            c cVar = C().f29706q;
            return (cVar == null || (f11 = cVar.f(name)) == null) ? super.mo137e(name, location) : f11;
        }

        @Override // d20.i, d20.k
        public Collection<w00.i> g(d20.d kindFilter, h00.l<? super u10.f, Boolean> nameFilter) {
            s.g(kindFilter, "kindFilter");
            s.g(nameFilter, "nameFilter");
            return this.f29713h.mo11invoke();
        }

        @Override // i20.h
        protected void j(Collection<w00.i> result, h00.l<? super u10.f, Boolean> nameFilter) {
            s.g(result, "result");
            s.g(nameFilter, "nameFilter");
            c cVar = C().f29706q;
            Collection<w00.c> d11 = cVar == null ? null : cVar.d();
            if (d11 == null) {
                d11 = w.i();
            }
            result.addAll(d11);
        }

        @Override // i20.h
        protected void l(u10.f name, List<kotlin.reflect.jvm.internal.impl.descriptors.h> functions) {
            s.g(name, "name");
            s.g(functions, "functions");
            ArrayList arrayList = new ArrayList();
            for (d0 d0Var : this.f29714i.mo11invoke()) {
                arrayList.addAll(d0Var.m().c(name, d10.d.FOR_ALREADY_TRACKED));
            }
            functions.addAll(q().c().c().e(name, this.f29715j));
            B(name, arrayList, functions);
        }

        @Override // i20.h
        protected void m(u10.f name, List<i0> descriptors) {
            s.g(name, "name");
            s.g(descriptors, "descriptors");
            ArrayList arrayList = new ArrayList();
            for (d0 d0Var : this.f29714i.mo11invoke()) {
                arrayList.addAll(d0Var.m().a(name, d10.d.FOR_ALREADY_TRACKED));
            }
            B(name, arrayList, descriptors);
        }

        @Override // i20.h
        protected u10.b n(u10.f name) {
            s.g(name, "name");
            u10.b d11 = this.f29715j.f29698i.d(name);
            s.f(d11, "classId.createNestedClassId(name)");
            return d11;
        }

        @Override // i20.h
        protected Set<u10.f> t() {
            List<d0> a11 = C().f29704o.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (d0 d0Var : a11) {
                Set<u10.f> f11 = d0Var.m().f();
                if (f11 == null) {
                    return null;
                }
                b0.z(linkedHashSet, f11);
            }
            return linkedHashSet;
        }

        @Override // i20.h
        protected Set<u10.f> u() {
            List<d0> a11 = C().f29704o.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (d0 d0Var : a11) {
                b0.z(linkedHashSet, d0Var.m().b());
            }
            linkedHashSet.addAll(q().c().c().d(this.f29715j));
            return linkedHashSet;
        }

        @Override // i20.h
        protected Set<u10.f> v() {
            List<d0> a11 = C().f29704o.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (d0 d0Var : a11) {
                b0.z(linkedHashSet, d0Var.m().d());
            }
            return linkedHashSet;
        }

        @Override // i20.h
        protected boolean y(kotlin.reflect.jvm.internal.impl.descriptors.h function) {
            s.g(function, "function");
            return q().c().s().b(this.f29715j, function);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class b extends k20.b {

        /* renamed from: d  reason: collision with root package name */
        private final j20.i<List<s0>> f29720d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f29721e;

        /* loaded from: classes5.dex */
        static final class a extends u implements h00.a<List<? extends s0>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f29722a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(0);
                this.f29722a = dVar;
            }

            @Override // h00.a
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final List<? extends s0> mo11invoke() {
                return t0.d(this.f29722a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d this$0) {
            super(this$0.U0().h());
            s.g(this$0, "this$0");
            this.f29721e = this$0;
            this.f29720d = this$0.U0().h().b(new a(this$0));
        }

        @Override // k20.h
        protected Collection<d0> g() {
            int t11;
            List y02;
            List O0;
            int t12;
            u10.c b11;
            List<p10.q> l11 = r10.f.l(this.f29721e.V0(), this.f29721e.U0().j());
            d dVar = this.f29721e;
            t11 = x.t(l11, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (p10.q qVar : l11) {
                arrayList.add(dVar.U0().i().q(qVar));
            }
            y02 = e0.y0(arrayList, this.f29721e.U0().c().c().c(this.f29721e));
            ArrayList<z.b> arrayList2 = new ArrayList();
            Iterator it2 = y02.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                w00.e n11 = ((d0) it2.next()).H0().n();
                z.b bVar = n11 instanceof z.b ? (z.b) n11 : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                g20.q i11 = this.f29721e.U0().c().i();
                d dVar2 = this.f29721e;
                t12 = x.t(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(t12);
                for (z.b bVar2 : arrayList2) {
                    u10.b h11 = a20.a.h(bVar2);
                    String b12 = (h11 == null || (b11 = h11.b()) == null) ? null : b11.b();
                    if (b12 == null) {
                        b12 = bVar2.getName().b();
                    }
                    arrayList3.add(b12);
                }
                i11.b(dVar2, arrayList3);
            }
            O0 = e0.O0(y02);
            return O0;
        }

        @Override // k20.w0
        public List<s0> getParameters() {
            return this.f29720d.mo11invoke();
        }

        @Override // k20.h
        protected q0 k() {
            return q0.a.f55322a;
        }

        @Override // k20.w0
        public boolean o() {
            return true;
        }

        public String toString() {
            String fVar = this.f29721e.getName().toString();
            s.f(fVar, "name.toString()");
            return fVar;
        }

        @Override // k20.b
        /* renamed from: v */
        public d u() {
            return this.f29721e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Map<u10.f, p10.g> f29723a;

        /* renamed from: b  reason: collision with root package name */
        private final j20.h<u10.f, w00.c> f29724b;

        /* renamed from: c  reason: collision with root package name */
        private final j20.i<Set<u10.f>> f29725c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f29726d;

        /* loaded from: classes5.dex */
        static final class a extends u implements h00.l<u10.f, w00.c> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f29728b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: i20.d$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0573a extends u implements h00.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f29729a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ p10.g f29730b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0573a(d dVar, p10.g gVar) {
                    super(0);
                    this.f29729a = dVar;
                    this.f29730b = gVar;
                }

                @Override // h00.a
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> mo11invoke() {
                    List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> O0;
                    O0 = e0.O0(this.f29729a.U0().c().d().h(this.f29729a.Z0(), this.f29730b));
                    return O0;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(1);
                this.f29728b = dVar;
            }

            @Override // h00.l
            /* renamed from: a */
            public final w00.c mo12invoke(u10.f name) {
                s.g(name, "name");
                p10.g gVar = (p10.g) c.this.f29723a.get(name);
                if (gVar == null) {
                    return null;
                }
                d dVar = this.f29728b;
                return y00.n.H0(dVar.U0().h(), dVar, name, c.this.f29725c, new i20.a(dVar.U0().h(), new C0573a(dVar, gVar)), n0.f55303a);
            }
        }

        /* loaded from: classes5.dex */
        static final class b extends u implements h00.a<Set<? extends u10.f>> {
            b() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final Set<u10.f> mo11invoke() {
                return c.this.e();
            }
        }

        public c(d this$0) {
            int t11;
            int e11;
            int d11;
            s.g(this$0, "this$0");
            this.f29726d = this$0;
            List<p10.g> j02 = this$0.V0().j0();
            s.f(j02, "classProto.enumEntryList");
            t11 = x.t(j02, 10);
            e11 = r0.e(t11);
            d11 = m00.l.d(e11, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
            for (Object obj : j02) {
                linkedHashMap.put(g20.w.b(this$0.U0().g(), ((p10.g) obj).z()), obj);
            }
            this.f29723a = linkedHashMap;
            this.f29724b = this.f29726d.U0().h().h(new a(this.f29726d));
            this.f29725c = this.f29726d.U0().h().b(new b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<u10.f> e() {
            Set<u10.f> m11;
            HashSet hashSet = new HashSet();
            for (d0 d0Var : this.f29726d.mo234i().a()) {
                for (w00.i iVar : k.a.a(d0Var.m(), null, null, 3, null)) {
                    if ((iVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.h) || (iVar instanceof i0)) {
                        hashSet.add(iVar.getName());
                    }
                }
            }
            List<p10.i> o02 = this.f29726d.V0().o0();
            s.f(o02, "classProto.functionList");
            d dVar = this.f29726d;
            for (p10.i iVar2 : o02) {
                hashSet.add(g20.w.b(dVar.U0().g(), iVar2.Q()));
            }
            List<p10.n> v02 = this.f29726d.V0().v0();
            s.f(v02, "classProto.propertyList");
            d dVar2 = this.f29726d;
            for (p10.n nVar : v02) {
                hashSet.add(g20.w.b(dVar2.U0().g(), nVar.P()));
            }
            m11 = y0.m(hashSet, hashSet);
            return m11;
        }

        public final Collection<w00.c> d() {
            Set<u10.f> keySet = this.f29723a.keySet();
            ArrayList arrayList = new ArrayList();
            for (u10.f fVar : keySet) {
                w00.c f11 = f(fVar);
                if (f11 != null) {
                    arrayList.add(f11);
                }
            }
            return arrayList;
        }

        public final w00.c f(u10.f name) {
            s.g(name, "name");
            return this.f29724b.mo12invoke(name);
        }
    }

    /* renamed from: i20.d$d  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0574d extends u implements h00.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {
        C0574d() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> mo11invoke() {
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> O0;
            O0 = e0.O0(d.this.U0().c().d().b(d.this.Z0()));
            return O0;
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends u implements h00.a<w00.c> {
        e() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final w00.c mo11invoke() {
            return d.this.O0();
        }
    }

    /* loaded from: classes5.dex */
    static final class f extends u implements h00.a<Collection<? extends w00.b>> {
        f() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Collection<w00.b> mo11invoke() {
            return d.this.P0();
        }
    }

    /* loaded from: classes5.dex */
    static final class g extends u implements h00.a<t<k0>> {
        g() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final t<k0> mo11invoke() {
            return d.this.Q0();
        }
    }

    /* loaded from: classes5.dex */
    /* synthetic */ class h extends o implements h00.l<kotlin.reflect.jvm.internal.impl.types.checker.h, a> {
        h(Object obj) {
            super(1, obj);
        }

        @Override // h00.l
        /* renamed from: d */
        public final a mo12invoke(kotlin.reflect.jvm.internal.impl.types.checker.h p02) {
            s.g(p02, "p0");
            return new a((d) this.receiver, p02);
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.f
        public final n00.g getOwner() {
            return kotlin.jvm.internal.m0.b(a.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }
    }

    /* loaded from: classes5.dex */
    static final class i extends u implements h00.a<w00.b> {
        i() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final w00.b mo11invoke() {
            return d.this.R0();
        }
    }

    /* loaded from: classes5.dex */
    static final class j extends u implements h00.a<Collection<? extends w00.c>> {
        j() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Collection<w00.c> mo11invoke() {
            return d.this.T0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g20.l outerContext, p10.c classProto, r10.c nameResolver, r10.a metadataVersion, n0 sourceElement) {
        super(outerContext.h(), g20.w.a(nameResolver, classProto.l0()).j());
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g nVar;
        s.g(outerContext, "outerContext");
        s.g(classProto, "classProto");
        s.g(nameResolver, "nameResolver");
        s.g(metadataVersion, "metadataVersion");
        s.g(sourceElement, "sourceElement");
        this.f29695f = classProto;
        this.f29696g = metadataVersion;
        this.f29697h = sourceElement;
        this.f29698i = g20.w.a(nameResolver, classProto.l0());
        g20.z zVar = g20.z.f27479a;
        this.f29699j = zVar.b(r10.b.f49034e.d(classProto.k0()));
        this.f29700k = a0.a(zVar, r10.b.f49033d.d(classProto.k0()));
        kotlin.reflect.jvm.internal.impl.descriptors.c a11 = zVar.a(r10.b.f49035f.d(classProto.k0()));
        this.f29701l = a11;
        List<p10.s> G0 = classProto.G0();
        s.f(G0, "classProto.typeParameterList");
        p10.t H0 = classProto.H0();
        s.f(H0, "classProto.typeTable");
        r10.g gVar = new r10.g(H0);
        i.a aVar = r10.i.f49075b;
        p10.w J0 = classProto.J0();
        s.f(J0, "classProto.versionRequirementTable");
        g20.l a12 = outerContext.a(this, G0, nameResolver, gVar, aVar.a(J0), metadataVersion);
        this.f29702m = a12;
        kotlin.reflect.jvm.internal.impl.descriptors.c cVar = kotlin.reflect.jvm.internal.impl.descriptors.c.ENUM_CLASS;
        this.f29703n = a11 == cVar ? new d20.l(a12.h(), this) : h.b.f23482b;
        this.f29704o = new b(this);
        this.f29705p = m0.f55293e.a(this, a12.h(), a12.c().m().d(), new h(this));
        this.f29706q = a11 == cVar ? new c(this) : null;
        w00.i e11 = outerContext.e();
        this.f29707t = e11;
        this.f29708w = a12.h().i(new i());
        this.f29709x = a12.h().b(new f());
        this.f29710y = a12.h().i(new e());
        this.f29711z = a12.h().b(new j());
        this.A = a12.h().i(new g());
        r10.c g11 = a12.g();
        r10.g j11 = a12.j();
        d dVar = e11 instanceof d ? (d) e11 : null;
        this.B = new y.a(classProto, g11, j11, sourceElement, dVar != null ? dVar.B : null);
        if (!r10.b.f49032c.d(classProto.k0()).booleanValue()) {
            nVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b();
        } else {
            nVar = new n(a12.h(), new C0574d());
        }
        this.C = nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w00.c O0() {
        if (this.f29695f.K0()) {
            w00.e mo137e = W0().mo137e(g20.w.b(this.f29702m.g(), this.f29695f.b0()), d10.d.FROM_DESERIALIZATION);
            if (mo137e instanceof w00.c) {
                return (w00.c) mo137e;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<w00.b> P0() {
        List m11;
        List y02;
        List y03;
        List<w00.b> S0 = S0();
        m11 = w.m(B());
        y02 = e0.y0(S0, m11);
        y03 = e0.y0(y02, this.f29702m.c().c().a(this));
        return y03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t<k0> Q0() {
        u10.f name;
        Object obj = null;
        if (w10.f.b(this)) {
            if (this.f29695f.N0()) {
                name = g20.w.b(this.f29702m.g(), this.f29695f.p0());
            } else if (!this.f29696g.c(1, 5, 1)) {
                w00.b B = B();
                if (B != null) {
                    List<v0> h11 = B.h();
                    s.f(h11, "constructor.valueParameters");
                    name = ((v0) wz.u.b0(h11)).getName();
                    s.f(name, "{\n                // Bef…irst().name\n            }");
                } else {
                    throw new IllegalStateException(s.p("Inline class has no primary constructor: ", this).toString());
                }
            } else {
                throw new IllegalStateException(s.p("Inline class has no underlying property name in metadata: ", this).toString());
            }
            p10.q f11 = r10.f.f(this.f29695f, this.f29702m.j());
            k0 o11 = f11 == null ? null : c0.o(this.f29702m.i(), f11, false, 2, null);
            if (o11 == null) {
                Iterator<T> it2 = W0().a(name, d10.d.FROM_DESERIALIZATION).iterator();
                Object obj2 = null;
                boolean z11 = false;
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (((i0) next).N() == null) {
                            if (z11) {
                                break;
                            }
                            z11 = true;
                            obj2 = next;
                        }
                    } else if (z11) {
                        obj = obj2;
                    }
                }
                i0 i0Var = (i0) obj;
                if (i0Var != null) {
                    o11 = (k0) i0Var.getType();
                } else {
                    throw new IllegalStateException(s.p("Inline class has no underlying property: ", this).toString());
                }
            }
            return new t<>(name, o11);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w00.b R0() {
        Object obj;
        if (this.f29701l.isSingleton()) {
            y00.f i11 = w10.c.i(this, n0.f55303a);
            i11.c1(n());
            return i11;
        }
        List<p10.d> e02 = this.f29695f.e0();
        s.f(e02, "classProto.constructorList");
        Iterator<T> it2 = e02.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (!r10.b.f49042m.d(((p10.d) obj).E()).booleanValue()) {
                break;
            }
        }
        p10.d dVar = (p10.d) obj;
        if (dVar == null) {
            return null;
        }
        return U0().f().m(dVar, true);
    }

    private final List<w00.b> S0() {
        int t11;
        List<p10.d> e02 = this.f29695f.e0();
        s.f(e02, "classProto.constructorList");
        ArrayList<p10.d> arrayList = new ArrayList();
        for (Object obj : e02) {
            Boolean d11 = r10.b.f49042m.d(((p10.d) obj).E());
            s.f(d11, "IS_SECONDARY.get(it.flags)");
            if (d11.booleanValue()) {
                arrayList.add(obj);
            }
        }
        t11 = x.t(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(t11);
        for (p10.d it2 : arrayList) {
            v f11 = U0().f();
            s.f(it2, "it");
            arrayList2.add(f11.m(it2, false));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<w00.c> T0() {
        List i11;
        if (this.f29699j != kotlin.reflect.jvm.internal.impl.descriptors.f.SEALED) {
            i11 = w.i();
            return i11;
        }
        List<Integer> fqNames = this.f29695f.w0();
        s.f(fqNames, "fqNames");
        if (!fqNames.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Integer index : fqNames) {
                g20.j c11 = U0().c();
                r10.c g11 = U0().g();
                s.f(index, "index");
                w00.c b11 = c11.b(g20.w.a(g11, index.intValue()));
                if (b11 != null) {
                    arrayList.add(b11);
                }
            }
            return arrayList;
        }
        return w10.a.f55368a.a(this, false);
    }

    private final a W0() {
        return this.f29705p.c(this.f29702m.c().m().d());
    }

    @Override // w00.c
    public w00.b B() {
        return this.f29708w.mo11invoke();
    }

    @Override // w00.c
    public boolean C0() {
        Boolean d11 = r10.b.f49037h.d(this.f29695f.k0());
        s.f(d11, "IS_DATA.get(classProto.flags)");
        return d11.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y00.t
    /* renamed from: M */
    public d20.h mo233M(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f29705p.c(kotlinTypeRefiner);
    }

    public final g20.l U0() {
        return this.f29702m;
    }

    public final p10.c V0() {
        return this.f29695f;
    }

    @Override // w00.u
    public boolean W() {
        return false;
    }

    @Override // w00.c
    public boolean X() {
        return r10.b.f49035f.d(this.f29695f.k0()) == c.EnumC0974c.COMPANION_OBJECT;
    }

    public final r10.a X0() {
        return this.f29696g;
    }

    @Override // w00.c
    /* renamed from: Y0 */
    public d20.i mo138h0() {
        return this.f29703n;
    }

    public final y.a Z0() {
        return this.B;
    }

    @Override // w00.c
    public boolean a0() {
        Boolean d11 = r10.b.f49041l.d(this.f29695f.k0());
        s.f(d11, "IS_FUN_INTERFACE.get(classProto.flags)");
        return d11.booleanValue();
    }

    public final boolean a1(u10.f name) {
        s.g(name, "name");
        return W0().r().contains(name);
    }

    @Override // w00.c, w00.j, w00.i
    /* renamed from: b */
    public w00.i mo223b() {
        return this.f29707t;
    }

    @Override // w00.l
    public n0 f() {
        return this.f29697h;
    }

    @Override // w00.c
    public boolean f0() {
        Boolean d11 = r10.b.f49040k.d(this.f29695f.k0());
        s.f(d11, "IS_INLINE_CLASS.get(classProto.flags)");
        return d11.booleanValue() && this.f29696g.c(1, 4, 2);
    }

    @Override // w00.c
    /* renamed from: g */
    public Collection<w00.b> mo224g() {
        return this.f29709x.mo11invoke();
    }

    @Override // w00.u
    public boolean g0() {
        Boolean d11 = r10.b.f49039j.d(this.f29695f.k0());
        s.f(d11, "IS_EXPECT_CLASS.get(classProto.flags)");
        return d11.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    /* renamed from: getAnnotations */
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g mo140getAnnotations() {
        return this.C;
    }

    @Override // w00.c
    public kotlin.reflect.jvm.internal.impl.descriptors.c getKind() {
        return this.f29701l;
    }

    @Override // w00.c, w00.m, w00.u
    public q getVisibility() {
        return this.f29700k;
    }

    @Override // w00.e
    /* renamed from: i */
    public w0 mo234i() {
        return this.f29704o;
    }

    @Override // w00.c
    public w00.c i0() {
        return this.f29710y.mo11invoke();
    }

    @Override // w00.u
    public boolean isExternal() {
        Boolean d11 = r10.b.f49038i.d(this.f29695f.k0());
        s.f(d11, "IS_EXTERNAL_CLASS.get(classProto.flags)");
        return d11.booleanValue();
    }

    @Override // w00.c
    public boolean isInline() {
        Boolean d11 = r10.b.f49040k.d(this.f29695f.k0());
        s.f(d11, "IS_INLINE_CLASS.get(classProto.flags)");
        return d11.booleanValue() && this.f29696g.e(1, 4, 1);
    }

    @Override // w00.f
    public boolean j() {
        Boolean d11 = r10.b.f49036g.d(this.f29695f.k0());
        s.f(d11, "IS_INNER.get(classProto.flags)");
        return d11.booleanValue();
    }

    @Override // w00.c, w00.f
    public List<s0> o() {
        return this.f29702m.i().k();
    }

    @Override // w00.c, w00.u
    public kotlin.reflect.jvm.internal.impl.descriptors.f p() {
        return this.f29699j;
    }

    @Override // w00.c
    public t<k0> t() {
        return this.A.mo11invoke();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deserialized ");
        sb2.append(g0() ? "expect " : "");
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // w00.c
    /* renamed from: x */
    public Collection<w00.c> mo225x() {
        return this.f29711z.mo11invoke();
    }
}