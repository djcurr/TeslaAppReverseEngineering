package q00;

import ch.qos.logback.core.CoreConstants;
import d20.h;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import q00.d0;
import q00.k;

/* loaded from: classes5.dex */
public final class p extends k {

    /* renamed from: d  reason: collision with root package name */
    private final d0.b<a> f47211d;

    /* renamed from: e  reason: collision with root package name */
    private final Class<?> f47212e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class a extends k.b {

        /* renamed from: i  reason: collision with root package name */
        static final /* synthetic */ n00.m[] f47213i = {kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "metadata", "getMetadata()Lkotlin/Triple;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(a.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* renamed from: d  reason: collision with root package name */
        private final d0.a f47214d;

        /* renamed from: e  reason: collision with root package name */
        private final d0.a f47215e;

        /* renamed from: f  reason: collision with root package name */
        private final d0.b f47216f;

        /* renamed from: g  reason: collision with root package name */
        private final d0.b f47217g;

        /* renamed from: q00.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C1016a extends kotlin.jvm.internal.u implements h00.a<a10.f> {
            C1016a() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final a10.f mo11invoke() {
                return a10.f.f117c.a(p.this.d());
            }
        }

        /* loaded from: classes5.dex */
        static final class b extends kotlin.jvm.internal.u implements h00.a<Collection<? extends f<?>>> {
            b() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final Collection<f<?>> mo11invoke() {
                a aVar = a.this;
                return p.this.C(aVar.f(), k.c.DECLARED);
            }
        }

        /* loaded from: classes5.dex */
        static final class c extends kotlin.jvm.internal.u implements h00.a<vz.u<? extends t10.f, ? extends p10.l, ? extends t10.e>> {
            c() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final vz.u<t10.f, p10.l, t10.e> mo11invoke() {
                o10.a a11;
                a10.f c11 = a.this.c();
                if (c11 == null || (a11 = c11.a()) == null) {
                    return null;
                }
                String[] a12 = a11.a();
                String[] g11 = a11.g();
                if (a12 == null || g11 == null) {
                    return null;
                }
                vz.p<t10.f, p10.l> m11 = t10.g.m(a12, g11);
                return new vz.u<>(m11.a(), m11.b(), a11.d());
            }
        }

        /* loaded from: classes5.dex */
        static final class d extends kotlin.jvm.internal.u implements h00.a<Class<?>> {
            d() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final Class<?> mo11invoke() {
                String C;
                o10.a a11;
                a10.f c11 = a.this.c();
                String e11 = (c11 == null || (a11 = c11.a()) == null) ? null : a11.e();
                if (e11 != null) {
                    if (e11.length() > 0) {
                        ClassLoader classLoader = p.this.d().getClassLoader();
                        C = kotlin.text.v.C(e11, '/', CoreConstants.DOT, false, 4, null);
                        return classLoader.loadClass(C);
                    }
                    return null;
                }
                return null;
            }
        }

        /* loaded from: classes5.dex */
        static final class e extends kotlin.jvm.internal.u implements h00.a<d20.h> {
            e() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final d20.h mo11invoke() {
                a10.f c11 = a.this.c();
                if (c11 != null) {
                    return a.this.a().c().a(c11);
                }
                return h.b.f23482b;
            }
        }

        public a() {
            super();
            this.f47214d = d0.c(new C1016a());
            this.f47215e = d0.c(new e());
            this.f47216f = d0.b(new d());
            this.f47217g = d0.b(new c());
            d0.c(new b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final a10.f c() {
            return (a10.f) this.f47214d.b(this, f47213i[0]);
        }

        public final vz.u<t10.f, p10.l, t10.e> d() {
            return (vz.u) this.f47217g.b(this, f47213i[3]);
        }

        public final Class<?> e() {
            return (Class) this.f47216f.b(this, f47213i[2]);
        }

        public final d20.h f() {
            return (d20.h) this.f47215e.b(this, f47213i[1]);
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<a> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final a mo11invoke() {
            return new a();
        }
    }

    /* loaded from: classes5.dex */
    static final /* synthetic */ class c extends kotlin.jvm.internal.o implements h00.p<g20.v, p10.n, w00.i0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f47225a = new c();

        c() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: d */
        public final w00.i0 mo160invoke(g20.v p12, p10.n p22) {
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

    public p(Class<?> jClass, String str) {
        kotlin.jvm.internal.s.g(jClass, "jClass");
        this.f47212e = jClass;
        d0.b<a> b11 = d0.b(new b());
        kotlin.jvm.internal.s.f(b11, "ReflectProperties.lazy { Data() }");
        this.f47211d = b11;
    }

    private final d20.h M() {
        return this.f47211d.mo11invoke().f();
    }

    @Override // q00.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> A(u10.f name) {
        kotlin.jvm.internal.s.g(name, "name");
        return M().c(name, d10.d.FROM_REFLECTION);
    }

    @Override // q00.k
    public w00.i0 B(int i11) {
        vz.u<t10.f, p10.l, t10.e> d11 = this.f47211d.mo11invoke().d();
        if (d11 != null) {
            t10.f a11 = d11.a();
            p10.l b11 = d11.b();
            t10.e c11 = d11.c();
            h.f<p10.l, List<p10.n>> fVar = s10.a.f49986n;
            kotlin.jvm.internal.s.f(fVar, "JvmProtoBuf.packageLocalVariable");
            p10.n nVar = (p10.n) r10.e.b(b11, fVar, i11);
            if (nVar != null) {
                Class<?> d12 = d();
                p10.t Q = b11.Q();
                kotlin.jvm.internal.s.f(Q, "packageProto.typeTable");
                return (w00.i0) l0.h(d12, nVar, a11, new r10.g(Q), c11, c.f47225a);
            }
            return null;
        }
        return null;
    }

    @Override // q00.k
    protected Class<?> E() {
        Class<?> e11 = this.f47211d.mo11invoke().e();
        return e11 != null ? e11 : d();
    }

    @Override // q00.k
    public Collection<w00.i0> F(u10.f name) {
        kotlin.jvm.internal.s.g(name, "name");
        return M().a(name, d10.d.FROM_REFLECTION);
    }

    @Override // kotlin.jvm.internal.h
    public Class<?> d() {
        return this.f47212e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof p) && kotlin.jvm.internal.s.c(d(), ((p) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return "file class " + b10.b.a(d()).b();
    }

    @Override // q00.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> z() {
        List i11;
        i11 = wz.w.i();
        return i11;
    }
}