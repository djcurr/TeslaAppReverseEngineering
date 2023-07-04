package q00;

import ch.qos.logback.core.CoreConstants;
import d20.k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import k20.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.r0;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import o10.a;
import q00.d0;
import q00.k;
import w00.s0;

/* loaded from: classes5.dex */
public final class h<T> extends k implements n00.d<T>, j, a0 {

    /* renamed from: d  reason: collision with root package name */
    private final d0.b<h<T>.a> f47133d;

    /* renamed from: e  reason: collision with root package name */
    private final Class<T> f47134e;

    /* loaded from: classes5.dex */
    public final class a extends k.b {

        /* renamed from: r  reason: collision with root package name */
        static final /* synthetic */ n00.m[] f47135r = {kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "annotations", "getAnnotations()Ljava/util/List;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* renamed from: d  reason: collision with root package name */
        private final d0.a f47136d;

        /* renamed from: e  reason: collision with root package name */
        private final d0.a f47137e;

        /* renamed from: f  reason: collision with root package name */
        private final d0.a f47138f;

        /* renamed from: g  reason: collision with root package name */
        private final d0.a f47139g;

        /* renamed from: h  reason: collision with root package name */
        private final d0.a f47140h;

        /* renamed from: i  reason: collision with root package name */
        private final d0.b f47141i;

        /* renamed from: j  reason: collision with root package name */
        private final d0.a f47142j;

        /* renamed from: k  reason: collision with root package name */
        private final d0.a f47143k;

        /* renamed from: l  reason: collision with root package name */
        private final d0.a f47144l;

        /* renamed from: m  reason: collision with root package name */
        private final d0.a f47145m;

        /* renamed from: n  reason: collision with root package name */
        private final d0.a f47146n;

        /* renamed from: o  reason: collision with root package name */
        private final d0.a f47147o;

        /* renamed from: p  reason: collision with root package name */
        private final d0.a f47148p;

        /* renamed from: q00.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C1013a extends kotlin.jvm.internal.u implements h00.a<List<? extends q00.f<?>>> {
            C1013a() {
                super(0);
            }

            @Override // h00.a
            public final List<? extends q00.f<?>> invoke() {
                List<? extends q00.f<?>> y02;
                y02 = wz.e0.y0(a.this.g(), a.this.h());
                return y02;
            }
        }

        /* loaded from: classes5.dex */
        static final class b extends kotlin.jvm.internal.u implements h00.a<List<? extends q00.f<?>>> {
            b() {
                super(0);
            }

            @Override // h00.a
            public final List<? extends q00.f<?>> invoke() {
                List<? extends q00.f<?>> y02;
                y02 = wz.e0.y0(a.this.k(), a.this.n());
                return y02;
            }
        }

        /* loaded from: classes5.dex */
        static final class c extends kotlin.jvm.internal.u implements h00.a<List<? extends q00.f<?>>> {
            c() {
                super(0);
            }

            @Override // h00.a
            public final List<? extends q00.f<?>> invoke() {
                List<? extends q00.f<?>> y02;
                y02 = wz.e0.y0(a.this.l(), a.this.o());
                return y02;
            }
        }

        /* loaded from: classes5.dex */
        static final class d extends kotlin.jvm.internal.u implements h00.a<List<? extends Annotation>> {
            d() {
                super(0);
            }

            @Override // h00.a
            public final List<? extends Annotation> invoke() {
                return l0.e(a.this.m());
            }
        }

        /* loaded from: classes5.dex */
        static final class e extends kotlin.jvm.internal.u implements h00.a<List<? extends n00.h<? extends T>>> {
            e() {
                super(0);
            }

            @Override // h00.a
            public final List<n00.h<T>> invoke() {
                int t11;
                Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> z11 = h.this.z();
                t11 = wz.x.t(z11, 10);
                ArrayList arrayList = new ArrayList(t11);
                for (kotlin.reflect.jvm.internal.impl.descriptors.d dVar : z11) {
                    arrayList.add(new q00.l(h.this, dVar));
                }
                return arrayList;
            }
        }

        /* loaded from: classes5.dex */
        static final class f extends kotlin.jvm.internal.u implements h00.a<List<? extends q00.f<?>>> {
            f() {
                super(0);
            }

            @Override // h00.a
            public final List<? extends q00.f<?>> invoke() {
                List<? extends q00.f<?>> y02;
                y02 = wz.e0.y0(a.this.k(), a.this.l());
                return y02;
            }
        }

        /* loaded from: classes5.dex */
        static final class g extends kotlin.jvm.internal.u implements h00.a<Collection<? extends q00.f<?>>> {
            g() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final Collection<q00.f<?>> invoke() {
                h hVar = h.this;
                return hVar.C(hVar.R(), k.c.DECLARED);
            }
        }

        /* renamed from: q00.h$a$h  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C1014h extends kotlin.jvm.internal.u implements h00.a<Collection<? extends q00.f<?>>> {
            C1014h() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final Collection<q00.f<?>> invoke() {
                h hVar = h.this;
                return hVar.C(hVar.S(), k.c.DECLARED);
            }
        }

        /* loaded from: classes5.dex */
        static final class i extends kotlin.jvm.internal.u implements h00.a<w00.c> {
            i() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final w00.c invoke() {
                u10.b O = h.this.O();
                a10.k a11 = h.this.P().invoke().a();
                w00.c b11 = O.k() ? a11.a().b(O) : w00.s.a(a11.b(), O);
                if (b11 != null) {
                    return b11;
                }
                h.this.T();
                throw null;
            }
        }

        /* loaded from: classes5.dex */
        static final class j extends kotlin.jvm.internal.u implements h00.a<Collection<? extends q00.f<?>>> {
            j() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final Collection<q00.f<?>> invoke() {
                h hVar = h.this;
                return hVar.C(hVar.R(), k.c.INHERITED);
            }
        }

        /* loaded from: classes5.dex */
        static final class k extends kotlin.jvm.internal.u implements h00.a<Collection<? extends q00.f<?>>> {
            k() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final Collection<q00.f<?>> invoke() {
                h hVar = h.this;
                return hVar.C(hVar.S(), k.c.INHERITED);
            }
        }

        /* loaded from: classes5.dex */
        static final class l extends kotlin.jvm.internal.u implements h00.a<List<? extends h<? extends Object>>> {
            l() {
                super(0);
            }

            @Override // h00.a
            public final List<? extends h<? extends Object>> invoke() {
                Collection a11 = k.a.a(a.this.m().S(), null, null, 3, null);
                ArrayList<w00.i> arrayList = new ArrayList();
                for (T t11 : a11) {
                    if (!w10.d.B((w00.i) t11)) {
                        arrayList.add(t11);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (w00.i iVar : arrayList) {
                    if (!(iVar instanceof w00.c)) {
                        iVar = null;
                    }
                    w00.c cVar = (w00.c) iVar;
                    Class<?> p11 = cVar != null ? l0.p(cVar) : null;
                    h hVar = p11 != null ? new h(p11) : null;
                    if (hVar != null) {
                        arrayList2.add(hVar);
                    }
                }
                return arrayList2;
            }
        }

        /* loaded from: classes5.dex */
        static final class m extends kotlin.jvm.internal.u implements h00.a<T> {
            m() {
                super(0);
            }

            @Override // h00.a
            public final T invoke() {
                Field declaredField;
                w00.c m11 = a.this.m();
                if (m11.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.c.OBJECT) {
                    return null;
                }
                if (m11.X() && !t00.d.a(t00.c.f51279a, m11)) {
                    declaredField = h.this.d().getEnclosingClass().getDeclaredField(m11.getName().b());
                } else {
                    declaredField = h.this.d().getDeclaredField("INSTANCE");
                }
                T t11 = (T) declaredField.get(null);
                Objects.requireNonNull(t11, "null cannot be cast to non-null type T");
                return t11;
            }
        }

        /* loaded from: classes5.dex */
        static final class n extends kotlin.jvm.internal.u implements h00.a<String> {
            n() {
                super(0);
            }

            @Override // h00.a
            public final String invoke() {
                if (h.this.d().isAnonymousClass()) {
                    return null;
                }
                u10.b O = h.this.O();
                if (O.k()) {
                    return null;
                }
                return O.b().b();
            }
        }

        /* loaded from: classes5.dex */
        static final class o extends kotlin.jvm.internal.u implements h00.a<List<? extends h<? extends T>>> {
            o() {
                super(0);
            }

            @Override // h00.a
            public final List<h<? extends T>> invoke() {
                Collection<w00.c> x11 = a.this.m().x();
                kotlin.jvm.internal.s.f(x11, "descriptor.sealedSubclasses");
                ArrayList arrayList = new ArrayList();
                for (w00.c cVar : x11) {
                    Objects.requireNonNull(cVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class<?> p11 = l0.p(cVar);
                    h hVar = p11 != null ? new h(p11) : null;
                    if (hVar != null) {
                        arrayList.add(hVar);
                    }
                }
                return arrayList;
            }
        }

        /* loaded from: classes5.dex */
        static final class p extends kotlin.jvm.internal.u implements h00.a<String> {
            p() {
                super(0);
            }

            @Override // h00.a
            public final String invoke() {
                if (h.this.d().isAnonymousClass()) {
                    return null;
                }
                u10.b O = h.this.O();
                if (O.k()) {
                    a aVar = a.this;
                    return aVar.f(h.this.d());
                }
                String b11 = O.j().b();
                kotlin.jvm.internal.s.f(b11, "classId.shortClassName.asString()");
                return b11;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class q extends kotlin.jvm.internal.u implements h00.a<List<? extends x>> {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: q00.h$a$q$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C1015a extends kotlin.jvm.internal.u implements h00.a<Type> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ k20.d0 f47167a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ q f47168b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1015a(k20.d0 d0Var, q qVar) {
                    super(0);
                    this.f47167a = d0Var;
                    this.f47168b = qVar;
                }

                @Override // h00.a
                /* renamed from: a */
                public final Type invoke() {
                    int O;
                    w00.e n11 = this.f47167a.H0().n();
                    if (n11 instanceof w00.c) {
                        Class<?> p11 = l0.p((w00.c) n11);
                        if (p11 != null) {
                            if (kotlin.jvm.internal.s.c(h.this.d().getSuperclass(), p11)) {
                                Type genericSuperclass = h.this.d().getGenericSuperclass();
                                kotlin.jvm.internal.s.f(genericSuperclass, "jClass.genericSuperclass");
                                return genericSuperclass;
                            }
                            Class<?>[] interfaces = h.this.d().getInterfaces();
                            kotlin.jvm.internal.s.f(interfaces, "jClass.interfaces");
                            O = wz.p.O(interfaces, p11);
                            if (O >= 0) {
                                Type type = h.this.d().getGenericInterfaces()[O];
                                kotlin.jvm.internal.s.f(type, "jClass.genericInterfaces[index]");
                                return type;
                            }
                            throw new b0("No superclass of " + a.this + " in Java reflection for " + n11);
                        }
                        throw new b0("Unsupported superclass of " + a.this + ": " + n11);
                    }
                    throw new b0("Supertype not a class: " + n11);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class b extends kotlin.jvm.internal.u implements h00.a<Type> {

                /* renamed from: a  reason: collision with root package name */
                public static final b f47169a = new b();

                b() {
                    super(0);
                }

                @Override // h00.a
                /* renamed from: a */
                public final Type invoke() {
                    return Object.class;
                }
            }

            q() {
                super(0);
            }

            @Override // h00.a
            public final List<? extends x> invoke() {
                boolean z11;
                w0 i11 = a.this.m().i();
                kotlin.jvm.internal.s.f(i11, "descriptor.typeConstructor");
                Collection<k20.d0> a11 = i11.a();
                kotlin.jvm.internal.s.f(a11, "descriptor.typeConstructor.supertypes");
                ArrayList<x> arrayList = new ArrayList(a11.size());
                for (k20.d0 kotlinType : a11) {
                    kotlin.jvm.internal.s.f(kotlinType, "kotlinType");
                    arrayList.add(new x(kotlinType, new C1015a(kotlinType, this)));
                }
                if (!t00.h.s0(a.this.m())) {
                    boolean z12 = false;
                    if (!arrayList.isEmpty()) {
                        for (x xVar : arrayList) {
                            w00.c e11 = w10.d.e(xVar.r());
                            kotlin.jvm.internal.s.f(e11, "DescriptorUtils.getClassDescriptorForType(it.type)");
                            kotlin.reflect.jvm.internal.impl.descriptors.c kind = e11.getKind();
                            kotlin.jvm.internal.s.f(kind, "DescriptorUtils.getClass…ptorForType(it.type).kind");
                            if (kind == kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE || kind == kotlin.reflect.jvm.internal.impl.descriptors.c.ANNOTATION_CLASS) {
                                z11 = true;
                                continue;
                            } else {
                                z11 = false;
                                continue;
                            }
                            if (!z11) {
                                break;
                            }
                        }
                    }
                    z12 = true;
                    if (z12) {
                        k20.k0 i12 = a20.a.g(a.this.m()).i();
                        kotlin.jvm.internal.s.f(i12, "descriptor.builtIns.anyType");
                        arrayList.add(new x(i12, b.f47169a));
                    }
                }
                return s20.a.c(arrayList);
            }
        }

        /* loaded from: classes5.dex */
        static final class r extends kotlin.jvm.internal.u implements h00.a<List<? extends z>> {
            r() {
                super(0);
            }

            @Override // h00.a
            public final List<? extends z> invoke() {
                int t11;
                List<s0> o11 = a.this.m().o();
                kotlin.jvm.internal.s.f(o11, "descriptor.declaredTypeParameters");
                t11 = wz.x.t(o11, 10);
                ArrayList arrayList = new ArrayList(t11);
                for (s0 descriptor : o11) {
                    h hVar = h.this;
                    kotlin.jvm.internal.s.f(descriptor, "descriptor");
                    arrayList.add(new z(hVar, descriptor));
                }
                return arrayList;
            }
        }

        public a() {
            super();
            this.f47136d = d0.c(new i());
            this.f47137e = d0.c(new d());
            this.f47138f = d0.c(new p());
            this.f47139g = d0.c(new n());
            this.f47140h = d0.c(new e());
            d0.c(new l());
            this.f47141i = d0.b(new m());
            d0.c(new r());
            this.f47142j = d0.c(new q());
            d0.c(new o());
            this.f47143k = d0.c(new g());
            this.f47144l = d0.c(new C1014h());
            this.f47145m = d0.c(new j());
            this.f47146n = d0.c(new k());
            this.f47147o = d0.c(new b());
            this.f47148p = d0.c(new c());
            d0.c(new f());
            d0.c(new C1013a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(Class<?> cls) {
            String O0;
            String P0;
            String P02;
            String name = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                kotlin.jvm.internal.s.f(name, "name");
                P02 = kotlin.text.w.P0(name, enclosingMethod.getName() + "$", null, 2, null);
                return P02;
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                kotlin.jvm.internal.s.f(name, "name");
                P0 = kotlin.text.w.P0(name, enclosingConstructor.getName() + "$", null, 2, null);
                return P0;
            }
            kotlin.jvm.internal.s.f(name, "name");
            O0 = kotlin.text.w.O0(name, CoreConstants.DOLLAR, null, 2, null);
            return O0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<q00.f<?>> l() {
            return (Collection) this.f47144l.b(this, f47135r[11]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<q00.f<?>> n() {
            return (Collection) this.f47145m.b(this, f47135r[12]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<q00.f<?>> o() {
            return (Collection) this.f47146n.b(this, f47135r[13]);
        }

        public final Collection<q00.f<?>> g() {
            return (Collection) this.f47147o.b(this, f47135r[14]);
        }

        public final Collection<q00.f<?>> h() {
            return (Collection) this.f47148p.b(this, f47135r[15]);
        }

        public final List<Annotation> i() {
            return (List) this.f47137e.b(this, f47135r[1]);
        }

        public final Collection<n00.h<T>> j() {
            return (Collection) this.f47140h.b(this, f47135r[4]);
        }

        public final Collection<q00.f<?>> k() {
            return (Collection) this.f47143k.b(this, f47135r[10]);
        }

        public final w00.c m() {
            return (w00.c) this.f47136d.b(this, f47135r[0]);
        }

        public final T p() {
            return this.f47141i.b(this, f47135r[6]);
        }

        public final String q() {
            return (String) this.f47139g.b(this, f47135r[3]);
        }

        public final String r() {
            return (String) this.f47138f.b(this, f47135r[2]);
        }

        public final List<n00.p> s() {
            return (List) this.f47142j.b(this, f47135r[8]);
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<h<T>.a> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final h<T>.a invoke() {
            return new a();
        }
    }

    /* loaded from: classes5.dex */
    static final /* synthetic */ class c extends kotlin.jvm.internal.o implements h00.p<g20.v, p10.n, w00.i0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f47172a = new c();

        c() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: d */
        public final w00.i0 invoke(g20.v p12, p10.n p22) {
            kotlin.jvm.internal.s.g(p12, "p1");
            kotlin.jvm.internal.s.g(p22, "p2");
            return p12.p(p22);
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.f
        public final n00.g getOwner() {
            return kotlin.jvm.internal.m0.b(g20.v.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }
    }

    public h(Class<T> jClass) {
        kotlin.jvm.internal.s.g(jClass, "jClass");
        this.f47134e = jClass;
        d0.b<h<T>.a> b11 = d0.b(new b());
        kotlin.jvm.internal.s.f(b11, "ReflectProperties.lazy { Data() }");
        this.f47133d = b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u10.b O() {
        return h0.f47174b.c(d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Void T() {
        o10.a a11;
        a10.f a12 = a10.f.f117c.a(d());
        a.EnumC0828a c11 = (a12 == null || (a11 = a12.a()) == null) ? null : a11.c();
        if (c11 != null) {
            switch (i.f47175a[c11.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new UnsupportedOperationException("Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: " + d());
                case 4:
                    throw new UnsupportedOperationException("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations does it have. Please use Java reflection to inspect this class: " + d());
                case 5:
                    throw new b0("Unknown class: " + d() + " (kind = " + c11 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
                case 6:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        throw new b0("Unresolved class: " + d());
    }

    @Override // q00.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> A(u10.f name) {
        List y02;
        kotlin.jvm.internal.s.g(name, "name");
        d20.h R = R();
        d10.d dVar = d10.d.FROM_REFLECTION;
        y02 = wz.e0.y0(R.c(name, dVar), S().c(name, dVar));
        return y02;
    }

    @Override // q00.k
    public w00.i0 B(int i11) {
        Class<?> declaringClass;
        if (kotlin.jvm.internal.s.c(d().getSimpleName(), "DefaultImpls") && (declaringClass = d().getDeclaringClass()) != null && declaringClass.isInterface()) {
            n00.d e11 = g00.a.e(declaringClass);
            Objects.requireNonNull(e11, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((h) e11).B(i11);
        }
        w00.c descriptor = getDescriptor();
        if (!(descriptor instanceof i20.d)) {
            descriptor = null;
        }
        i20.d dVar = (i20.d) descriptor;
        if (dVar != null) {
            p10.c V0 = dVar.V0();
            h.f<p10.c, List<p10.n>> fVar = s10.a.f49982j;
            kotlin.jvm.internal.s.f(fVar, "JvmProtoBuf.classLocalVariable");
            p10.n nVar = (p10.n) r10.e.b(V0, fVar, i11);
            if (nVar != null) {
                return (w00.i0) l0.h(d(), nVar, dVar.U0().g(), dVar.U0().j(), dVar.X0(), c.f47172a);
            }
            return null;
        }
        return null;
    }

    @Override // q00.k
    public Collection<w00.i0> F(u10.f name) {
        List y02;
        kotlin.jvm.internal.s.g(name, "name");
        d20.h R = R();
        d10.d dVar = d10.d.FROM_REFLECTION;
        y02 = wz.e0.y0(R.a(name, dVar), S().a(name, dVar));
        return y02;
    }

    public final d0.b<h<T>.a> P() {
        return this.f47133d;
    }

    @Override // q00.j
    /* renamed from: Q */
    public w00.c getDescriptor() {
        return this.f47133d.invoke().m();
    }

    public final d20.h R() {
        return getDescriptor().n().m();
    }

    public final d20.h S() {
        d20.h h02 = getDescriptor().h0();
        kotlin.jvm.internal.s.f(h02, "descriptor.staticScope");
        return h02;
    }

    @Override // n00.d
    public List<n00.p> a() {
        return this.f47133d.invoke().s();
    }

    @Override // kotlin.jvm.internal.h
    public Class<T> d() {
        return this.f47134e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && kotlin.jvm.internal.s.c(g00.a.c(this), g00.a.c((n00.d) obj));
    }

    @Override // n00.d
    public Collection<n00.h<T>> g() {
        return this.f47133d.invoke().j();
    }

    @Override // n00.b
    public List<Annotation> getAnnotations() {
        return this.f47133d.invoke().i();
    }

    @Override // n00.d
    public int hashCode() {
        return g00.a.c(this).hashCode();
    }

    @Override // n00.d
    public boolean i() {
        return getDescriptor().p() == kotlin.reflect.jvm.internal.impl.descriptors.f.SEALED;
    }

    @Override // n00.d
    public boolean isAbstract() {
        return getDescriptor().p() == kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT;
    }

    @Override // n00.d
    public boolean j() {
        return getDescriptor().j();
    }

    @Override // n00.d
    public T l() {
        return this.f47133d.invoke().p();
    }

    @Override // n00.d
    public boolean m(Object obj) {
        Integer c11 = b10.b.c(d());
        if (c11 != null) {
            return r0.m(obj, c11.intValue());
        }
        Class g11 = b10.b.g(d());
        if (g11 == null) {
            g11 = d();
        }
        return g11.isInstance(obj);
    }

    @Override // n00.d
    public String n() {
        return this.f47133d.invoke().q();
    }

    @Override // n00.d
    public String o() {
        return this.f47133d.invoke().r();
    }

    public String toString() {
        String str;
        String C;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("class ");
        u10.b O = O();
        u10.c h11 = O.h();
        kotlin.jvm.internal.s.f(h11, "classId.packageFqName");
        if (h11.d()) {
            str = "";
        } else {
            str = h11.b() + ".";
        }
        String b11 = O.i().b();
        kotlin.jvm.internal.s.f(b11, "classId.relativeClassName.asString()");
        C = kotlin.text.v.C(b11, CoreConstants.DOT, CoreConstants.DOLLAR, false, 4, null);
        sb2.append(str + C);
        return sb2.toString();
    }

    @Override // q00.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> z() {
        List i11;
        w00.c descriptor = getDescriptor();
        if (descriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE && descriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.c.OBJECT) {
            Collection<w00.b> g11 = descriptor.g();
            kotlin.jvm.internal.s.f(g11, "descriptor.constructors");
            return g11;
        }
        i11 = wz.w.i();
        return i11;
    }
}