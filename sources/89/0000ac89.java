package q00;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import k20.f1;
import k20.y0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q00.d0;
import w00.r0;
import w00.s0;

/* loaded from: classes5.dex */
public final class x implements kotlin.jvm.internal.t {

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ n00.m[] f47275e = {kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(x.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(x.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* renamed from: a  reason: collision with root package name */
    private final d0.a<Type> f47276a;

    /* renamed from: b  reason: collision with root package name */
    private final d0.a f47277b;

    /* renamed from: c  reason: collision with root package name */
    private final d0.a f47278c;

    /* renamed from: d  reason: collision with root package name */
    private final k20.d0 f47279d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<List<? extends n00.r>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.a f47281b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q00.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C1017a extends kotlin.jvm.internal.u implements h00.a<Type> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f47282a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f47283b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ vz.k f47284c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ n00.m f47285d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1017a(int i11, a aVar, vz.k kVar, n00.m mVar) {
                super(0);
                this.f47282a = i11;
                this.f47283b = aVar;
                this.f47284c = kVar;
                this.f47285d = mVar;
            }

            @Override // h00.a
            /* renamed from: a */
            public final Type invoke() {
                Type h11 = x.this.h();
                if (h11 instanceof Class) {
                    Class cls = (Class) h11;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    kotlin.jvm.internal.s.f(componentType, "if (javaType.isArray) ja…Type else Any::class.java");
                    return componentType;
                } else if (h11 instanceof GenericArrayType) {
                    if (this.f47282a == 0) {
                        Type genericComponentType = ((GenericArrayType) h11).getGenericComponentType();
                        kotlin.jvm.internal.s.f(genericComponentType, "javaType.genericComponentType");
                        return genericComponentType;
                    }
                    throw new b0("Array type has been queried for a non-0th argument: " + x.this);
                } else if (h11 instanceof ParameterizedType) {
                    Type type = (Type) ((List) this.f47284c.getValue()).get(this.f47282a);
                    if (type instanceof WildcardType) {
                        WildcardType wildcardType = (WildcardType) type;
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        kotlin.jvm.internal.s.f(lowerBounds, "argument.lowerBounds");
                        Type type2 = (Type) wz.l.H(lowerBounds);
                        if (type2 != null) {
                            type = type2;
                        } else {
                            Type[] upperBounds = wildcardType.getUpperBounds();
                            kotlin.jvm.internal.s.f(upperBounds, "argument.upperBounds");
                            type = (Type) wz.l.G(upperBounds);
                        }
                    }
                    kotlin.jvm.internal.s.f(type, "if (argument !is Wildcar…ument.upperBounds.first()");
                    return type;
                } else {
                    throw new b0("Non-generic type has been queried for arguments: " + x.this);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.a<List<? extends Type>> {
            b() {
                super(0);
            }

            @Override // h00.a
            public final List<? extends Type> invoke() {
                Type h11 = x.this.h();
                kotlin.jvm.internal.s.e(h11);
                return b10.b.d(h11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h00.a aVar) {
            super(0);
            this.f47281b = aVar;
        }

        @Override // h00.a
        public final List<? extends n00.r> invoke() {
            vz.k b11;
            int t11;
            n00.r d11;
            List<? extends n00.r> i11;
            List<y0> G0 = x.this.r().G0();
            if (G0.isEmpty()) {
                i11 = wz.w.i();
                return i11;
            }
            b11 = vz.m.b(kotlin.b.PUBLICATION, new b());
            t11 = wz.x.t(G0, 10);
            ArrayList arrayList = new ArrayList(t11);
            int i12 = 0;
            for (Object obj : G0) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    wz.w.s();
                }
                y0 y0Var = (y0) obj;
                if (y0Var.a()) {
                    d11 = n00.r.f40137c.c();
                } else {
                    k20.d0 type = y0Var.getType();
                    kotlin.jvm.internal.s.f(type, "typeProjection.type");
                    x xVar = new x(type, this.f47281b != null ? new C1017a(i12, this, b11, null) : null);
                    int i14 = w.f47274a[y0Var.b().ordinal()];
                    if (i14 == 1) {
                        d11 = n00.r.f40137c.d(xVar);
                    } else if (i14 == 2) {
                        d11 = n00.r.f40137c.a(xVar);
                    } else if (i14 != 3) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        d11 = n00.r.f40137c.b(xVar);
                    }
                }
                arrayList.add(d11);
                i12 = i13;
            }
            return arrayList;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<n00.f> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final n00.f invoke() {
            x xVar = x.this;
            return xVar.k(xVar.r());
        }
    }

    public x(k20.d0 type, h00.a<? extends Type> aVar) {
        kotlin.jvm.internal.s.g(type, "type");
        this.f47279d = type;
        d0.a<Type> aVar2 = null;
        d0.a<Type> aVar3 = (d0.a) (!(aVar instanceof d0.a) ? null : aVar);
        if (aVar3 != null) {
            aVar2 = aVar3;
        } else if (aVar != null) {
            aVar2 = d0.c(aVar);
        }
        this.f47276a = aVar2;
        this.f47277b = d0.c(new b());
        this.f47278c = d0.c(new a(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n00.f k(k20.d0 d0Var) {
        k20.d0 type;
        w00.e n11 = d0Var.H0().n();
        if (n11 instanceof w00.c) {
            Class<?> p11 = l0.p((w00.c) n11);
            if (p11 != null) {
                if (p11.isArray()) {
                    y0 y0Var = (y0) wz.u.E0(d0Var.G0());
                    if (y0Var != null && (type = y0Var.getType()) != null) {
                        kotlin.jvm.internal.s.f(type, "type.arguments.singleOrN…return KClassImpl(jClass)");
                        n00.f k11 = k(type);
                        if (k11 != null) {
                            return new h(l0.f(g00.a.b(p00.b.a(k11))));
                        }
                        throw new b0("Cannot determine classifier for array element type: " + this);
                    }
                    return new h(p11);
                } else if (!f1.m(d0Var)) {
                    Class<?> e11 = b10.b.e(p11);
                    if (e11 != null) {
                        p11 = e11;
                    }
                    return new h(p11);
                } else {
                    return new h(p11);
                }
            }
            return null;
        } else if (n11 instanceof s0) {
            return new z(null, (s0) n11);
        } else {
            if (n11 instanceof r0) {
                throw new vz.o("An operation is not implemented: Type alias classifiers are not yet supported");
            }
            return null;
        }
    }

    @Override // n00.p
    public n00.f c() {
        return (n00.f) this.f47277b.b(this, f47275e[0]);
    }

    @Override // n00.p
    public boolean e() {
        return this.f47279d.I0();
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && kotlin.jvm.internal.s.c(this.f47279d, ((x) obj).f47279d);
    }

    @Override // n00.p
    public List<n00.r> f() {
        return (List) this.f47278c.b(this, f47275e[1]);
    }

    @Override // n00.b
    public List<Annotation> getAnnotations() {
        return l0.e(this.f47279d);
    }

    @Override // kotlin.jvm.internal.t
    public Type h() {
        d0.a<Type> aVar = this.f47276a;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    public int hashCode() {
        return this.f47279d.hashCode();
    }

    public final k20.d0 r() {
        return this.f47279d;
    }

    public String toString() {
        return g0.f47130b.h(this.f47279d);
    }

    public /* synthetic */ x(k20.d0 d0Var, h00.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, (i11 & 2) != 0 ? null : aVar);
    }
}