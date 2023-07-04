package i20;

import d20.d;
import g20.v;
import g20.w;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import p10.r;
import u20.p;
import w00.i0;
import w00.r0;
import wz.a0;
import wz.b0;
import wz.e0;
import wz.s0;
import wz.x;
import wz.y0;

/* loaded from: classes5.dex */
public abstract class h extends d20.i {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f29738f = {m0.j(new f0(m0.b(h.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), m0.j(new f0(m0.b(h.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b  reason: collision with root package name */
    private final g20.l f29739b;

    /* renamed from: c  reason: collision with root package name */
    private final a f29740c;

    /* renamed from: d  reason: collision with root package name */
    private final j20.i f29741d;

    /* renamed from: e  reason: collision with root package name */
    private final j20.j f29742e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public interface a {
        Collection<i0> a(u10.f fVar, d10.b bVar);

        Set<u10.f> b();

        Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f fVar, d10.b bVar);

        Set<u10.f> d();

        Set<u10.f> e();

        void f(Collection<w00.i> collection, d20.d dVar, h00.l<? super u10.f, Boolean> lVar, d10.b bVar);

        r0 g(u10.f fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class b implements a {

        /* renamed from: o  reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f29743o = {m0.j(new f0(m0.b(b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), m0.j(new f0(m0.b(b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), m0.j(new f0(m0.b(b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), m0.j(new f0(m0.b(b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), m0.j(new f0(m0.b(b.class), "allProperties", "getAllProperties()Ljava/util/List;")), m0.j(new f0(m0.b(b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), m0.j(new f0(m0.b(b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), m0.j(new f0(m0.b(b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), m0.j(new f0(m0.b(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), m0.j(new f0(m0.b(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a  reason: collision with root package name */
        private final List<p10.i> f29744a;

        /* renamed from: b  reason: collision with root package name */
        private final List<p10.n> f29745b;

        /* renamed from: c  reason: collision with root package name */
        private final List<r> f29746c;

        /* renamed from: d  reason: collision with root package name */
        private final j20.i f29747d;

        /* renamed from: e  reason: collision with root package name */
        private final j20.i f29748e;

        /* renamed from: f  reason: collision with root package name */
        private final j20.i f29749f;

        /* renamed from: g  reason: collision with root package name */
        private final j20.i f29750g;

        /* renamed from: h  reason: collision with root package name */
        private final j20.i f29751h;

        /* renamed from: i  reason: collision with root package name */
        private final j20.i f29752i;

        /* renamed from: j  reason: collision with root package name */
        private final j20.i f29753j;

        /* renamed from: k  reason: collision with root package name */
        private final j20.i f29754k;

        /* renamed from: l  reason: collision with root package name */
        private final j20.i f29755l;

        /* renamed from: m  reason: collision with root package name */
        private final j20.i f29756m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ h f29757n;

        /* loaded from: classes5.dex */
        static final class a extends u implements h00.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> {
            a() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> mo11invoke() {
                List<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> y02;
                y02 = e0.y0(b.this.D(), b.this.t());
                return y02;
            }
        }

        /* renamed from: i20.h$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0575b extends u implements h00.a<List<? extends i0>> {
            C0575b() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final List<? extends i0> mo11invoke() {
                List<? extends i0> y02;
                y02 = e0.y0(b.this.E(), b.this.u());
                return y02;
            }
        }

        /* loaded from: classes5.dex */
        static final class c extends u implements h00.a<List<? extends r0>> {
            c() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final List<? extends r0> mo11invoke() {
                return b.this.z();
            }
        }

        /* loaded from: classes5.dex */
        static final class d extends u implements h00.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> {
            d() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> mo11invoke() {
                return b.this.v();
            }
        }

        /* loaded from: classes5.dex */
        static final class e extends u implements h00.a<List<? extends i0>> {
            e() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final List<? extends i0> mo11invoke() {
                return b.this.y();
            }
        }

        /* loaded from: classes5.dex */
        static final class f extends u implements h00.a<Set<? extends u10.f>> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f29764b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(h hVar) {
                super(0);
                this.f29764b = hVar;
            }

            @Override // h00.a
            /* renamed from: a */
            public final Set<u10.f> mo11invoke() {
                Set<u10.f> m11;
                b bVar = b.this;
                List<o> list = bVar.f29744a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                h hVar = bVar.f29757n;
                for (o oVar : list) {
                    linkedHashSet.add(w.b(hVar.f29739b.g(), ((p10.i) oVar).Q()));
                }
                m11 = y0.m(linkedHashSet, this.f29764b.u());
                return m11;
            }
        }

        /* loaded from: classes5.dex */
        static final class g extends u implements h00.a<Map<u10.f, ? extends List<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>>> {
            g() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Map<u10.f, ? extends List<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> mo11invoke() {
                List A = b.this.A();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : A) {
                    u10.f name = ((kotlin.reflect.jvm.internal.impl.descriptors.h) obj).getName();
                    s.f(name, "it.name");
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* renamed from: i20.h$b$h  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0576h extends u implements h00.a<Map<u10.f, ? extends List<? extends i0>>> {
            C0576h() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Map<u10.f, ? extends List<? extends i0>> mo11invoke() {
                List B = b.this.B();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : B) {
                    u10.f name = ((i0) obj).getName();
                    s.f(name, "it.name");
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* loaded from: classes5.dex */
        static final class i extends u implements h00.a<Map<u10.f, ? extends r0>> {
            i() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Map<u10.f, ? extends r0> mo11invoke() {
                int t11;
                int e11;
                int d11;
                List C = b.this.C();
                t11 = x.t(C, 10);
                e11 = wz.r0.e(t11);
                d11 = m00.l.d(e11, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
                for (Object obj : C) {
                    u10.f name = ((r0) obj).getName();
                    s.f(name, "it.name");
                    linkedHashMap.put(name, obj);
                }
                return linkedHashMap;
            }
        }

        /* loaded from: classes5.dex */
        static final class j extends u implements h00.a<Set<? extends u10.f>> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f29769b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(h hVar) {
                super(0);
                this.f29769b = hVar;
            }

            @Override // h00.a
            /* renamed from: a */
            public final Set<u10.f> mo11invoke() {
                Set<u10.f> m11;
                b bVar = b.this;
                List<o> list = bVar.f29745b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                h hVar = bVar.f29757n;
                for (o oVar : list) {
                    linkedHashSet.add(w.b(hVar.f29739b.g(), ((p10.n) oVar).P()));
                }
                m11 = y0.m(linkedHashSet, this.f29769b.v());
                return m11;
            }
        }

        public b(h this$0, List<p10.i> functionList, List<p10.n> propertyList, List<r> typeAliasList) {
            s.g(this$0, "this$0");
            s.g(functionList, "functionList");
            s.g(propertyList, "propertyList");
            s.g(typeAliasList, "typeAliasList");
            this.f29757n = this$0;
            this.f29744a = functionList;
            this.f29745b = propertyList;
            this.f29746c = this$0.q().c().g().c() ? typeAliasList : wz.w.i();
            this.f29747d = this$0.q().h().b(new d());
            this.f29748e = this$0.q().h().b(new e());
            this.f29749f = this$0.q().h().b(new c());
            this.f29750g = this$0.q().h().b(new a());
            this.f29751h = this$0.q().h().b(new C0575b());
            this.f29752i = this$0.q().h().b(new i());
            this.f29753j = this$0.q().h().b(new g());
            this.f29754k = this$0.q().h().b(new C0576h());
            this.f29755l = this$0.q().h().b(new f(this$0));
            this.f29756m = this$0.q().h().b(new j(this$0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.h> A() {
            return (List) j20.m.a(this.f29750g, this, f29743o[3]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<i0> B() {
            return (List) j20.m.a(this.f29751h, this, f29743o[4]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<r0> C() {
            return (List) j20.m.a(this.f29749f, this, f29743o[2]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.h> D() {
            return (List) j20.m.a(this.f29747d, this, f29743o[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<i0> E() {
            return (List) j20.m.a(this.f29748e, this, f29743o[1]);
        }

        private final Map<u10.f, Collection<kotlin.reflect.jvm.internal.impl.descriptors.h>> F() {
            return (Map) j20.m.a(this.f29753j, this, f29743o[6]);
        }

        private final Map<u10.f, Collection<i0>> G() {
            return (Map) j20.m.a(this.f29754k, this, f29743o[7]);
        }

        private final Map<u10.f, r0> H() {
            return (Map) j20.m.a(this.f29752i, this, f29743o[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.h> t() {
            Set<u10.f> u11 = this.f29757n.u();
            ArrayList arrayList = new ArrayList();
            for (u10.f fVar : u11) {
                b0.z(arrayList, w(fVar));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<i0> u() {
            Set<u10.f> v11 = this.f29757n.v();
            ArrayList arrayList = new ArrayList();
            for (u10.f fVar : v11) {
                b0.z(arrayList, x(fVar));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.h> v() {
            List<p10.i> list = this.f29744a;
            h hVar = this.f29757n;
            ArrayList arrayList = new ArrayList();
            for (o oVar : list) {
                kotlin.reflect.jvm.internal.impl.descriptors.h n11 = hVar.f29739b.f().n((p10.i) oVar);
                if (!hVar.y(n11)) {
                    n11 = null;
                }
                if (n11 != null) {
                    arrayList.add(n11);
                }
            }
            return arrayList;
        }

        private final List<kotlin.reflect.jvm.internal.impl.descriptors.h> w(u10.f fVar) {
            List<kotlin.reflect.jvm.internal.impl.descriptors.h> D = D();
            h hVar = this.f29757n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : D) {
                if (s.c(((w00.i) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            hVar.l(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List<i0> x(u10.f fVar) {
            List<i0> E = E();
            h hVar = this.f29757n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : E) {
                if (s.c(((w00.i) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            hVar.m(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<i0> y() {
            List<p10.n> list = this.f29745b;
            h hVar = this.f29757n;
            ArrayList arrayList = new ArrayList();
            for (o oVar : list) {
                i0 p11 = hVar.f29739b.f().p((p10.n) oVar);
                if (p11 != null) {
                    arrayList.add(p11);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<r0> z() {
            List<r> list = this.f29746c;
            h hVar = this.f29757n;
            ArrayList arrayList = new ArrayList();
            for (o oVar : list) {
                r0 q11 = hVar.f29739b.f().q((r) oVar);
                if (q11 != null) {
                    arrayList.add(q11);
                }
            }
            return arrayList;
        }

        @Override // i20.h.a
        public Collection<i0> a(u10.f name, d10.b location) {
            List i11;
            List i12;
            s.g(name, "name");
            s.g(location, "location");
            if (!d().contains(name)) {
                i12 = wz.w.i();
                return i12;
            }
            Collection<i0> collection = G().get(name);
            if (collection != null) {
                return collection;
            }
            i11 = wz.w.i();
            return i11;
        }

        @Override // i20.h.a
        public Set<u10.f> b() {
            return (Set) j20.m.a(this.f29755l, this, f29743o[8]);
        }

        @Override // i20.h.a
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f name, d10.b location) {
            List i11;
            List i12;
            s.g(name, "name");
            s.g(location, "location");
            if (!b().contains(name)) {
                i12 = wz.w.i();
                return i12;
            }
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> collection = F().get(name);
            if (collection != null) {
                return collection;
            }
            i11 = wz.w.i();
            return i11;
        }

        @Override // i20.h.a
        public Set<u10.f> d() {
            return (Set) j20.m.a(this.f29756m, this, f29743o[9]);
        }

        @Override // i20.h.a
        public Set<u10.f> e() {
            List<r> list = this.f29746c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            h hVar = this.f29757n;
            for (o oVar : list) {
                linkedHashSet.add(w.b(hVar.f29739b.g(), ((r) oVar).R()));
            }
            return linkedHashSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // i20.h.a
        public void f(Collection<w00.i> result, d20.d kindFilter, h00.l<? super u10.f, Boolean> nameFilter, d10.b location) {
            s.g(result, "result");
            s.g(kindFilter, "kindFilter");
            s.g(nameFilter, "nameFilter");
            s.g(location, "location");
            if (kindFilter.a(d20.d.f23446c.i())) {
                for (Object obj : B()) {
                    u10.f name = ((i0) obj).getName();
                    s.f(name, "it.name");
                    if (nameFilter.mo12invoke(name).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.a(d20.d.f23446c.d())) {
                for (Object obj2 : A()) {
                    u10.f name2 = ((kotlin.reflect.jvm.internal.impl.descriptors.h) obj2).getName();
                    s.f(name2, "it.name");
                    if (nameFilter.mo12invoke(name2).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }

        @Override // i20.h.a
        public r0 g(u10.f name) {
            s.g(name, "name");
            return H().get(name);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class c implements a {

        /* renamed from: j  reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f29770j = {m0.j(new f0(m0.b(c.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), m0.j(new f0(m0.b(c.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a  reason: collision with root package name */
        private final Map<u10.f, byte[]> f29771a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<u10.f, byte[]> f29772b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<u10.f, byte[]> f29773c;

        /* renamed from: d  reason: collision with root package name */
        private final j20.g<u10.f, Collection<kotlin.reflect.jvm.internal.impl.descriptors.h>> f29774d;

        /* renamed from: e  reason: collision with root package name */
        private final j20.g<u10.f, Collection<i0>> f29775e;

        /* renamed from: f  reason: collision with root package name */
        private final j20.h<u10.f, r0> f29776f;

        /* renamed from: g  reason: collision with root package name */
        private final j20.i f29777g;

        /* renamed from: h  reason: collision with root package name */
        private final j20.i f29778h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h f29779i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [M] */
        /* loaded from: classes5.dex */
        public static final class a<M> extends u implements h00.a<M> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q<M> f29780a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ByteArrayInputStream f29781b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h f29782c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q<M> qVar, ByteArrayInputStream byteArrayInputStream, h hVar) {
                super(0);
                this.f29780a = qVar;
                this.f29781b = byteArrayInputStream;
                this.f29782c = hVar;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TM; */
            @Override // h00.a
            /* renamed from: a */
            public final o mo11invoke() {
                return (o) this.f29780a.d(this.f29781b, this.f29782c.q().c().j());
            }
        }

        /* loaded from: classes5.dex */
        static final class b extends u implements h00.a<Set<? extends u10.f>> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f29784b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar) {
                super(0);
                this.f29784b = hVar;
            }

            @Override // h00.a
            /* renamed from: a */
            public final Set<u10.f> mo11invoke() {
                Set<u10.f> m11;
                m11 = y0.m(c.this.f29771a.keySet(), this.f29784b.u());
                return m11;
            }
        }

        /* renamed from: i20.h$c$c  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0577c extends u implements h00.l<u10.f, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> {
            C0577c() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: a */
            public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> mo12invoke(u10.f it2) {
                s.g(it2, "it");
                return c.this.m(it2);
            }
        }

        /* loaded from: classes5.dex */
        static final class d extends u implements h00.l<u10.f, Collection<? extends i0>> {
            d() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: a */
            public final Collection<i0> mo12invoke(u10.f it2) {
                s.g(it2, "it");
                return c.this.n(it2);
            }
        }

        /* loaded from: classes5.dex */
        static final class e extends u implements h00.l<u10.f, r0> {
            e() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: a */
            public final r0 mo12invoke(u10.f it2) {
                s.g(it2, "it");
                return c.this.o(it2);
            }
        }

        /* loaded from: classes5.dex */
        static final class f extends u implements h00.a<Set<? extends u10.f>> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f29789b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(h hVar) {
                super(0);
                this.f29789b = hVar;
            }

            @Override // h00.a
            /* renamed from: a */
            public final Set<u10.f> mo11invoke() {
                Set<u10.f> m11;
                m11 = y0.m(c.this.f29772b.keySet(), this.f29789b.v());
                return m11;
            }
        }

        public c(h this$0, List<p10.i> functionList, List<p10.n> propertyList, List<r> typeAliasList) {
            Map<u10.f, byte[]> i11;
            s.g(this$0, "this$0");
            s.g(functionList, "functionList");
            s.g(propertyList, "propertyList");
            s.g(typeAliasList, "typeAliasList");
            this.f29779i = this$0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                u10.f b11 = w.b(this$0.f29739b.g(), ((p10.i) ((o) obj)).Q());
                Object obj2 = linkedHashMap.get(b11);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(b11, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.f29771a = p(linkedHashMap);
            h hVar = this.f29779i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : propertyList) {
                u10.f b12 = w.b(hVar.f29739b.g(), ((p10.n) ((o) obj3)).P());
                Object obj4 = linkedHashMap2.get(b12);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(b12, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.f29772b = p(linkedHashMap2);
            if (this.f29779i.q().c().g().c()) {
                h hVar2 = this.f29779i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj5 : typeAliasList) {
                    u10.f b13 = w.b(hVar2.f29739b.g(), ((r) ((o) obj5)).R());
                    Object obj6 = linkedHashMap3.get(b13);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap3.put(b13, obj6);
                    }
                    ((List) obj6).add(obj5);
                }
                i11 = p(linkedHashMap3);
            } else {
                i11 = s0.i();
            }
            this.f29773c = i11;
            this.f29774d = this.f29779i.q().h().e(new C0577c());
            this.f29775e = this.f29779i.q().h().e(new d());
            this.f29776f = this.f29779i.q().h().h(new e());
            this.f29777g = this.f29779i.q().h().b(new b(this.f29779i));
            this.f29778h = this.f29779i.q().h().b(new f(this.f29779i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> m(u10.f fVar) {
            u20.h i11;
            List<p10.i> I;
            Map<u10.f, byte[]> map = this.f29771a;
            q<p10.i> PARSER = p10.i.f45620w;
            s.f(PARSER, "PARSER");
            h hVar = this.f29779i;
            byte[] bArr = map.get(fVar);
            if (bArr == null) {
                I = null;
            } else {
                i11 = u20.n.i(new a(PARSER, new ByteArrayInputStream(bArr), this.f29779i));
                I = p.I(i11);
            }
            if (I == null) {
                I = wz.w.i();
            }
            ArrayList arrayList = new ArrayList(I.size());
            for (p10.i it2 : I) {
                v f11 = hVar.q().f();
                s.f(it2, "it");
                kotlin.reflect.jvm.internal.impl.descriptors.h n11 = f11.n(it2);
                if (!hVar.y(n11)) {
                    n11 = null;
                }
                if (n11 != null) {
                    arrayList.add(n11);
                }
            }
            hVar.l(fVar, arrayList);
            return s20.a.c(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<i0> n(u10.f fVar) {
            u20.h i11;
            List<p10.n> I;
            Map<u10.f, byte[]> map = this.f29772b;
            q<p10.n> PARSER = p10.n.f45683w;
            s.f(PARSER, "PARSER");
            h hVar = this.f29779i;
            byte[] bArr = map.get(fVar);
            if (bArr == null) {
                I = null;
            } else {
                i11 = u20.n.i(new a(PARSER, new ByteArrayInputStream(bArr), this.f29779i));
                I = p.I(i11);
            }
            if (I == null) {
                I = wz.w.i();
            }
            ArrayList arrayList = new ArrayList(I.size());
            for (p10.n it2 : I) {
                v f11 = hVar.q().f();
                s.f(it2, "it");
                i0 p11 = f11.p(it2);
                if (p11 != null) {
                    arrayList.add(p11);
                }
            }
            hVar.m(fVar, arrayList);
            return s20.a.c(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final r0 o(u10.f fVar) {
            r i02;
            byte[] bArr = this.f29773c.get(fVar);
            if (bArr == null || (i02 = r.i0(new ByteArrayInputStream(bArr), this.f29779i.q().c().j())) == null) {
                return null;
            }
            return this.f29779i.q().f().q(i02);
        }

        private final Map<u10.f, byte[]> p(Map<u10.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.protobuf.a>> map) {
            int e11;
            int t11;
            e11 = wz.r0.e(map.size());
            LinkedHashMap linkedHashMap = new LinkedHashMap(e11);
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<kotlin.reflect.jvm.internal.impl.protobuf.a> iterable = (Iterable) entry.getValue();
                t11 = x.t(iterable, 10);
                ArrayList arrayList = new ArrayList(t11);
                for (kotlin.reflect.jvm.internal.impl.protobuf.a aVar : iterable) {
                    aVar.c(byteArrayOutputStream);
                    arrayList.add(vz.b0.f54756a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        @Override // i20.h.a
        public Collection<i0> a(u10.f name, d10.b location) {
            List i11;
            s.g(name, "name");
            s.g(location, "location");
            if (d().contains(name)) {
                return this.f29775e.mo12invoke(name);
            }
            i11 = wz.w.i();
            return i11;
        }

        @Override // i20.h.a
        public Set<u10.f> b() {
            return (Set) j20.m.a(this.f29777g, this, f29770j[0]);
        }

        @Override // i20.h.a
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f name, d10.b location) {
            List i11;
            s.g(name, "name");
            s.g(location, "location");
            if (b().contains(name)) {
                return this.f29774d.mo12invoke(name);
            }
            i11 = wz.w.i();
            return i11;
        }

        @Override // i20.h.a
        public Set<u10.f> d() {
            return (Set) j20.m.a(this.f29778h, this, f29770j[1]);
        }

        @Override // i20.h.a
        public Set<u10.f> e() {
            return this.f29773c.keySet();
        }

        @Override // i20.h.a
        public void f(Collection<w00.i> result, d20.d kindFilter, h00.l<? super u10.f, Boolean> nameFilter, d10.b location) {
            s.g(result, "result");
            s.g(kindFilter, "kindFilter");
            s.g(nameFilter, "nameFilter");
            s.g(location, "location");
            if (kindFilter.a(d20.d.f23446c.i())) {
                Set<u10.f> d11 = d();
                ArrayList arrayList = new ArrayList();
                for (u10.f fVar : d11) {
                    if (nameFilter.mo12invoke(fVar).booleanValue()) {
                        arrayList.addAll(a(fVar, location));
                    }
                }
                w10.g INSTANCE = w10.g.f55377a;
                s.f(INSTANCE, "INSTANCE");
                a0.y(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.a(d20.d.f23446c.d())) {
                Set<u10.f> b11 = b();
                ArrayList arrayList2 = new ArrayList();
                for (u10.f fVar2 : b11) {
                    if (nameFilter.mo12invoke(fVar2).booleanValue()) {
                        arrayList2.addAll(c(fVar2, location));
                    }
                }
                w10.g INSTANCE2 = w10.g.f55377a;
                s.f(INSTANCE2, "INSTANCE");
                a0.y(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }

        @Override // i20.h.a
        public r0 g(u10.f name) {
            s.g(name, "name");
            return this.f29776f.mo12invoke(name);
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends u implements h00.a<Set<? extends u10.f>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.a<Collection<u10.f>> f29790a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(h00.a<? extends Collection<u10.f>> aVar) {
            super(0);
            this.f29790a = aVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final Set<u10.f> mo11invoke() {
            Set<u10.f> S0;
            S0 = e0.S0(this.f29790a.mo11invoke());
            return S0;
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends u implements h00.a<Set<? extends u10.f>> {
        e() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Set<u10.f> mo11invoke() {
            Set m11;
            Set<u10.f> m12;
            Set<u10.f> t11 = h.this.t();
            if (t11 == null) {
                return null;
            }
            m11 = y0.m(h.this.r(), h.this.f29740c.e());
            m12 = y0.m(m11, t11);
            return m12;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h(g20.l c11, List<p10.i> functionList, List<p10.n> propertyList, List<r> typeAliasList, h00.a<? extends Collection<u10.f>> classNames) {
        s.g(c11, "c");
        s.g(functionList, "functionList");
        s.g(propertyList, "propertyList");
        s.g(typeAliasList, "typeAliasList");
        s.g(classNames, "classNames");
        this.f29739b = c11;
        this.f29740c = o(functionList, propertyList, typeAliasList);
        this.f29741d = c11.h().b(new d(classNames));
        this.f29742e = c11.h().i(new e());
    }

    private final a o(List<p10.i> list, List<p10.n> list2, List<r> list3) {
        if (this.f29739b.c().g().a()) {
            return new b(this, list, list2, list3);
        }
        return new c(this, list, list2, list3);
    }

    private final w00.c p(u10.f fVar) {
        return this.f29739b.c().b(n(fVar));
    }

    private final Set<u10.f> s() {
        return (Set) j20.m.b(this.f29742e, this, f29738f[1]);
    }

    private final r0 w(u10.f fVar) {
        return this.f29740c.g(fVar);
    }

    @Override // d20.i, d20.h
    public Collection<i0> a(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        return this.f29740c.a(name, location);
    }

    @Override // d20.i, d20.h
    public Set<u10.f> b() {
        return this.f29740c.b();
    }

    @Override // d20.i, d20.h
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        return this.f29740c.c(name, location);
    }

    @Override // d20.i, d20.h
    public Set<u10.f> d() {
        return this.f29740c.d();
    }

    @Override // d20.i, d20.k
    /* renamed from: e */
    public w00.e mo137e(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        if (x(name)) {
            return p(name);
        }
        if (this.f29740c.e().contains(name)) {
            return w(name);
        }
        return null;
    }

    @Override // d20.i, d20.h
    public Set<u10.f> f() {
        return s();
    }

    protected abstract void j(Collection<w00.i> collection, h00.l<? super u10.f, Boolean> lVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final Collection<w00.i> k(d20.d kindFilter, h00.l<? super u10.f, Boolean> nameFilter, d10.b location) {
        s.g(kindFilter, "kindFilter");
        s.g(nameFilter, "nameFilter");
        s.g(location, "location");
        ArrayList arrayList = new ArrayList(0);
        d.a aVar = d20.d.f23446c;
        if (kindFilter.a(aVar.g())) {
            j(arrayList, nameFilter);
        }
        this.f29740c.f(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.a(aVar.c())) {
            for (u10.f fVar : r()) {
                if (nameFilter.mo12invoke(fVar).booleanValue()) {
                    s20.a.a(arrayList, p(fVar));
                }
            }
        }
        if (kindFilter.a(d20.d.f23446c.h())) {
            for (u10.f fVar2 : this.f29740c.e()) {
                if (nameFilter.mo12invoke(fVar2).booleanValue()) {
                    s20.a.a(arrayList, this.f29740c.g(fVar2));
                }
            }
        }
        return s20.a.c(arrayList);
    }

    protected void l(u10.f name, List<kotlin.reflect.jvm.internal.impl.descriptors.h> functions) {
        s.g(name, "name");
        s.g(functions, "functions");
    }

    protected void m(u10.f name, List<i0> descriptors) {
        s.g(name, "name");
        s.g(descriptors, "descriptors");
    }

    protected abstract u10.b n(u10.f fVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final g20.l q() {
        return this.f29739b;
    }

    public final Set<u10.f> r() {
        return (Set) j20.m.a(this.f29741d, this, f29738f[0]);
    }

    protected abstract Set<u10.f> t();

    protected abstract Set<u10.f> u();

    protected abstract Set<u10.f> v();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean x(u10.f name) {
        s.g(name, "name");
        return r().contains(name);
    }

    protected boolean y(kotlin.reflect.jvm.internal.impl.descriptors.h function) {
        s.g(function, "function");
        return true;
    }
}