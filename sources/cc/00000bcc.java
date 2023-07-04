package b10;

import b10.f;
import b10.t;
import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.p0;
import l10.d0;
import w00.z0;

/* loaded from: classes5.dex */
public final class j extends n implements b10.f, t, l10.g {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f7303a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a extends kotlin.jvm.internal.o implements h00.l<Member, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f7304a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: d */
        public final Boolean invoke(Member p02) {
            kotlin.jvm.internal.s.g(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.f
        public final n00.g getOwner() {
            return m0.b(Member.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "isSynthetic()Z";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b extends kotlin.jvm.internal.o implements h00.l<Constructor<?>, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f7305a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: d */
        public final m invoke(Constructor<?> p02) {
            kotlin.jvm.internal.s.g(p02, "p0");
            return new m(p02);
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.f
        public final n00.g getOwner() {
            return m0.b(m.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public /* synthetic */ class c extends kotlin.jvm.internal.o implements h00.l<Member, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f7306a = new c();

        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: d */
        public final Boolean invoke(Member p02) {
            kotlin.jvm.internal.s.g(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.f
        public final n00.g getOwner() {
            return m0.b(Member.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "isSynthetic()Z";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public /* synthetic */ class d extends kotlin.jvm.internal.o implements h00.l<Field, p> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f7307a = new d();

        d() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: d */
        public final p invoke(Field p02) {
            kotlin.jvm.internal.s.g(p02, "p0");
            return new p(p02);
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.f
        public final n00.g getOwner() {
            return m0.b(p.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.l<Class<?>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f7308a = new e();

        e() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            kotlin.jvm.internal.s.f(simpleName, "it.simpleName");
            return Boolean.valueOf(simpleName.length() == 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.l<Class<?>, u10.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f7309a = new f();

        f() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final u10.f invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            if (!u10.f.h(simpleName)) {
                simpleName = null;
            }
            if (simpleName == null) {
                return null;
            }
            return u10.f.f(simpleName);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.l<Method, Boolean> {
        g() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
            if (r0.Y(r5) == false) goto L4;
         */
        @Override // h00.l
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(java.lang.reflect.Method r5) {
            /*
                r4 = this;
                boolean r0 = r5.isSynthetic()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto La
            L8:
                r1 = r2
                goto L1f
            La:
                b10.j r0 = b10.j.this
                boolean r0 = r0.w()
                if (r0 == 0) goto L1f
                b10.j r0 = b10.j.this
                java.lang.String r3 = "method"
                kotlin.jvm.internal.s.f(r5, r3)
                boolean r5 = b10.j.P(r0, r5)
                if (r5 != 0) goto L8
            L1f:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: b10.j.g.invoke(java.lang.reflect.Method):java.lang.Boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public /* synthetic */ class h extends kotlin.jvm.internal.o implements h00.l<Method, s> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f7311a = new h();

        h() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: d */
        public final s invoke(Method p02) {
            kotlin.jvm.internal.s.g(p02, "p0");
            return new s(p02);
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.f
        public final n00.g getOwner() {
            return m0.b(s.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }
    }

    public j(Class<?> klass) {
        kotlin.jvm.internal.s.g(klass, "klass");
        this.f7303a = klass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Y(Method method) {
        String name = method.getName();
        if (kotlin.jvm.internal.s.c(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            kotlin.jvm.internal.s.f(parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                return true;
            }
        } else if (kotlin.jvm.internal.s.c(name, CoreConstants.VALUE_OF)) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // l10.g
    public Collection<l10.j> B() {
        List i11;
        i11 = wz.w.i();
        return i11;
    }

    @Override // l10.d
    public boolean C() {
        return f.a.c(this);
    }

    @Override // b10.t
    public int G() {
        return this.f7303a.getModifiers();
    }

    @Override // l10.g
    public boolean J() {
        return this.f7303a.isInterface();
    }

    @Override // l10.g
    public d0 K() {
        return null;
    }

    @Override // l10.d
    /* renamed from: Q */
    public b10.c l(u10.c cVar) {
        return f.a.a(this, cVar);
    }

    @Override // l10.d
    /* renamed from: R */
    public List<b10.c> getAnnotations() {
        return f.a.b(this);
    }

    @Override // l10.g
    /* renamed from: S */
    public List<m> g() {
        u20.h B;
        u20.h r11;
        u20.h B2;
        List<m> I;
        Constructor<?>[] declaredConstructors = this.f7303a.getDeclaredConstructors();
        kotlin.jvm.internal.s.f(declaredConstructors, "klass.declaredConstructors");
        B = wz.p.B(declaredConstructors);
        r11 = u20.p.r(B, a.f7304a);
        B2 = u20.p.B(r11, b.f7305a);
        I = u20.p.I(B2);
        return I;
    }

    @Override // b10.f
    /* renamed from: T */
    public Class<?> getElement() {
        return this.f7303a;
    }

    @Override // l10.g
    /* renamed from: U */
    public List<p> getFields() {
        u20.h B;
        u20.h r11;
        u20.h B2;
        List<p> I;
        Field[] declaredFields = this.f7303a.getDeclaredFields();
        kotlin.jvm.internal.s.f(declaredFields, "klass.declaredFields");
        B = wz.p.B(declaredFields);
        r11 = u20.p.r(B, c.f7306a);
        B2 = u20.p.B(r11, d.f7307a);
        I = u20.p.I(B2);
        return I;
    }

    @Override // l10.g
    /* renamed from: V */
    public List<u10.f> z() {
        u20.h B;
        u20.h r11;
        u20.h C;
        List<u10.f> I;
        Class<?>[] declaredClasses = this.f7303a.getDeclaredClasses();
        kotlin.jvm.internal.s.f(declaredClasses, "klass.declaredClasses");
        B = wz.p.B(declaredClasses);
        r11 = u20.p.r(B, e.f7308a);
        C = u20.p.C(r11, f.f7309a);
        I = u20.p.I(C);
        return I;
    }

    @Override // l10.g
    /* renamed from: W */
    public List<s> A() {
        u20.h B;
        u20.h q11;
        u20.h B2;
        List<s> I;
        Method[] declaredMethods = this.f7303a.getDeclaredMethods();
        kotlin.jvm.internal.s.f(declaredMethods, "klass.declaredMethods");
        B = wz.p.B(declaredMethods);
        q11 = u20.p.q(B, new g());
        B2 = u20.p.B(q11, h.f7311a);
        I = u20.p.I(B2);
        return I;
    }

    @Override // l10.g
    /* renamed from: X */
    public j m() {
        Class<?> declaringClass = this.f7303a.getDeclaringClass();
        if (declaringClass == null) {
            return null;
        }
        return new j(declaringClass);
    }

    @Override // l10.g
    public Collection<l10.j> a() {
        Class cls;
        List<Type> l11;
        int t11;
        List i11;
        cls = Object.class;
        if (kotlin.jvm.internal.s.c(this.f7303a, cls)) {
            i11 = wz.w.i();
            return i11;
        }
        p0 p0Var = new p0(2);
        Object genericSuperclass = this.f7303a.getGenericSuperclass();
        p0Var.a(genericSuperclass != null ? genericSuperclass : Object.class);
        Type[] genericInterfaces = this.f7303a.getGenericInterfaces();
        kotlin.jvm.internal.s.f(genericInterfaces, "klass.genericInterfaces");
        p0Var.b(genericInterfaces);
        l11 = wz.w.l(p0Var.d(new Type[p0Var.c()]));
        t11 = wz.x.t(l11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (Type type : l11) {
            arrayList.add(new l(type));
        }
        return arrayList;
    }

    @Override // l10.g
    public u10.c e() {
        u10.c b11 = b10.b.a(this.f7303a).b();
        kotlin.jvm.internal.s.f(b11, "klass.classId.asSingleFqName()");
        return b11;
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && kotlin.jvm.internal.s.c(this.f7303a, ((j) obj).f7303a);
    }

    @Override // l10.t
    public u10.f getName() {
        u10.f f11 = u10.f.f(this.f7303a.getSimpleName());
        kotlin.jvm.internal.s.f(f11, "identifier(klass.simpleName)");
        return f11;
    }

    @Override // l10.z
    public List<x> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f7303a.getTypeParameters();
        kotlin.jvm.internal.s.f(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new x(typeVariable));
        }
        return arrayList;
    }

    @Override // l10.s
    public z0 getVisibility() {
        return t.a.a(this);
    }

    public int hashCode() {
        return this.f7303a.hashCode();
    }

    @Override // l10.g
    public boolean i() {
        return false;
    }

    @Override // l10.s
    public boolean isAbstract() {
        return t.a.b(this);
    }

    @Override // l10.s
    public boolean isFinal() {
        return t.a.c(this);
    }

    @Override // l10.s
    public boolean k() {
        return t.a.d(this);
    }

    @Override // l10.g
    public Collection<l10.w> n() {
        List i11;
        i11 = wz.w.i();
        return i11;
    }

    @Override // l10.g
    public boolean p() {
        return this.f7303a.isAnnotation();
    }

    @Override // l10.g
    public boolean r() {
        return false;
    }

    @Override // l10.g
    public boolean s() {
        return false;
    }

    public String toString() {
        return j.class.getName() + ": " + this.f7303a;
    }

    @Override // l10.g
    public boolean w() {
        return this.f7303a.isEnum();
    }
}