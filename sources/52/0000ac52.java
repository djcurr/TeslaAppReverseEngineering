package q00;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q00.c;
import q00.d;
import q00.d0;
import r00.a;
import r00.e;

/* loaded from: classes5.dex */
public final class l extends f<Object> implements kotlin.jvm.internal.n<Object>, n00.h<Object>, q00.c {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ n00.m[] f47188k = {kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(l.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(l.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(l.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

    /* renamed from: e  reason: collision with root package name */
    private final d0.a f47189e;

    /* renamed from: f  reason: collision with root package name */
    private final d0.b f47190f;

    /* renamed from: g  reason: collision with root package name */
    private final d0.b f47191g;

    /* renamed from: h  reason: collision with root package name */
    private final k f47192h;

    /* renamed from: i  reason: collision with root package name */
    private final String f47193i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f47194j;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<r00.d<? extends Member>> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final r00.d<Member> mo11invoke() {
            int t11;
            Object b11;
            r00.d K;
            int t12;
            d g11 = h0.f47174b.g(l.this.y());
            if (g11 instanceof d.C1011d) {
                if (l.this.z()) {
                    Class<?> d11 = l.this.w().d();
                    List<n00.l> parameters = l.this.getParameters();
                    t12 = wz.x.t(parameters, 10);
                    ArrayList arrayList = new ArrayList(t12);
                    for (n00.l lVar : parameters) {
                        String name = lVar.getName();
                        kotlin.jvm.internal.s.e(name);
                        arrayList.add(name);
                    }
                    return new r00.a(d11, arrayList, a.EnumC1061a.POSITIONAL_CALL, a.b.KOTLIN, null, 16, null);
                }
                b11 = l.this.w().t(((d.C1011d) g11).b());
            } else if (g11 instanceof d.e) {
                d.e eVar = (d.e) g11;
                b11 = l.this.w().x(eVar.c(), eVar.b());
            } else if (g11 instanceof d.c) {
                b11 = ((d.c) g11).b();
            } else if (!(g11 instanceof d.b)) {
                if (g11 instanceof d.a) {
                    List<Method> b12 = ((d.a) g11).b();
                    Class<?> d12 = l.this.w().d();
                    t11 = wz.x.t(b12, 10);
                    ArrayList arrayList2 = new ArrayList(t11);
                    for (Method it2 : b12) {
                        kotlin.jvm.internal.s.f(it2, "it");
                        arrayList2.add(it2.getName());
                    }
                    return new r00.a(d12, arrayList2, a.EnumC1061a.POSITIONAL_CALL, a.b.JAVA, b12);
                }
                throw new NoWhenBranchMatchedException();
            } else {
                b11 = ((d.b) g11).b();
            }
            if (b11 instanceof Constructor) {
                l lVar2 = l.this;
                K = lVar2.I((Constructor) b11, lVar2.y());
            } else if (b11 instanceof Method) {
                Method method = (Method) b11;
                K = !Modifier.isStatic(method.getModifiers()) ? l.this.K(method) : l.this.y().mo140getAnnotations().mo169l(l0.j()) != null ? l.this.M(method) : l.this.N(method);
            } else {
                throw new b0("Could not compute caller for function: " + l.this.y() + " (member = " + b11 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
            return r00.h.c(K, l.this.y(), false, 2, null);
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<r00.d<? extends Member>> {
        b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.reflect.Member, java.lang.Object] */
        @Override // h00.a
        /* renamed from: a */
        public final r00.d<Member> mo11invoke() {
            GenericDeclaration genericDeclaration;
            int t11;
            int t12;
            r00.d dVar;
            ?? b11;
            d g11 = h0.f47174b.g(l.this.y());
            if (g11 instanceof d.e) {
                k w11 = l.this.w();
                d.e eVar = (d.e) g11;
                String c11 = eVar.c();
                String b12 = eVar.b();
                kotlin.jvm.internal.s.e(l.this.v().b());
                genericDeclaration = w11.v(c11, b12, !Modifier.isStatic(b11.getModifiers()));
            } else if (g11 instanceof d.C1011d) {
                if (l.this.z()) {
                    Class<?> d11 = l.this.w().d();
                    List<n00.l> parameters = l.this.getParameters();
                    t12 = wz.x.t(parameters, 10);
                    ArrayList arrayList = new ArrayList(t12);
                    for (n00.l lVar : parameters) {
                        String name = lVar.getName();
                        kotlin.jvm.internal.s.e(name);
                        arrayList.add(name);
                    }
                    return new r00.a(d11, arrayList, a.EnumC1061a.CALL_BY_NAME, a.b.KOTLIN, null, 16, null);
                }
                genericDeclaration = l.this.w().u(((d.C1011d) g11).b());
            } else if (g11 instanceof d.a) {
                List<Method> b13 = ((d.a) g11).b();
                Class<?> d12 = l.this.w().d();
                t11 = wz.x.t(b13, 10);
                ArrayList arrayList2 = new ArrayList(t11);
                for (Method it2 : b13) {
                    kotlin.jvm.internal.s.f(it2, "it");
                    arrayList2.add(it2.getName());
                }
                return new r00.a(d12, arrayList2, a.EnumC1061a.CALL_BY_NAME, a.b.JAVA, b13);
            } else {
                genericDeclaration = null;
            }
            if (genericDeclaration instanceof Constructor) {
                l lVar2 = l.this;
                dVar = lVar2.I((Constructor) genericDeclaration, lVar2.y());
            } else if (genericDeclaration instanceof Method) {
                if (l.this.y().mo140getAnnotations().mo169l(l0.j()) != null) {
                    w00.i mo223b = l.this.y().mo223b();
                    Objects.requireNonNull(mo223b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (!((w00.c) mo223b).X()) {
                        dVar = l.this.M((Method) genericDeclaration);
                    }
                }
                dVar = l.this.N((Method) genericDeclaration);
            } else {
                dVar = null;
            }
            if (dVar != null) {
                return r00.h.b(dVar, l.this.y(), true);
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.a<kotlin.reflect.jvm.internal.impl.descriptors.e> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f47198b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.f47198b = str;
        }

        @Override // h00.a
        /* renamed from: a */
        public final kotlin.reflect.jvm.internal.impl.descriptors.e mo11invoke() {
            return l.this.w().w(this.f47198b, l.this.f47193i);
        }
    }

    /* synthetic */ l(k kVar, String str, String str2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, str, str2, eVar, (i11 & 16) != 0 ? kotlin.jvm.internal.f.NO_RECEIVER : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r00.e<Constructor<?>> I(Constructor<?> constructor, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (b20.b.f(eVar)) {
            if (A()) {
                return new e.a(constructor, O());
            }
            return new e.b(constructor);
        } else if (A()) {
            return new e.c(constructor, O());
        } else {
            return new e.C1063e(constructor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.h K(Method method) {
        return A() ? new e.h.a(method, O()) : new e.h.d(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.h M(Method method) {
        return A() ? new e.h.b(method) : new e.h.C1066e(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.h N(Method method) {
        return A() ? new e.h.c(method, O()) : new e.h.f(method);
    }

    private final Object O() {
        return r00.h.a(this.f47194j, y());
    }

    @Override // q00.f
    public boolean A() {
        return !kotlin.jvm.internal.s.c(this.f47194j, kotlin.jvm.internal.f.NO_RECEIVER);
    }

    @Override // h00.v
    public Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return c.a.i(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // h00.t
    public Object J(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return c.a.g(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // h00.u
    public Object L(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return c.a.h(this, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // q00.f
    /* renamed from: P */
    public kotlin.reflect.jvm.internal.impl.descriptors.e mo212y() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.e) this.f47189e.b(this, f47188k[0]);
    }

    public boolean equals(Object obj) {
        l c11 = l0.c(obj);
        return c11 != null && kotlin.jvm.internal.s.c(w(), c11.w()) && kotlin.jvm.internal.s.c(getName(), c11.getName()) && kotlin.jvm.internal.s.c(this.f47193i, c11.f47193i) && kotlin.jvm.internal.s.c(this.f47194j, c11.f47194j);
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return r00.f.a(v());
    }

    @Override // n00.c
    public String getName() {
        String b11 = y().getName().b();
        kotlin.jvm.internal.s.f(b11, "descriptor.name.asString()");
        return b11;
    }

    public int hashCode() {
        return (((w().hashCode() * 31) + getName().hashCode()) * 31) + this.f47193i.hashCode();
    }

    @Override // h00.a
    /* renamed from: invoke */
    public Object mo11invoke() {
        return c.a.a(this);
    }

    @Override // n00.h
    public boolean isExternal() {
        return y().isExternal();
    }

    @Override // n00.h
    public boolean isInfix() {
        return y().isInfix();
    }

    @Override // n00.h
    public boolean isInline() {
        return y().isInline();
    }

    @Override // n00.h
    public boolean isOperator() {
        return y().isOperator();
    }

    @Override // n00.c
    public boolean isSuspend() {
        return y().isSuspend();
    }

    @Override // h00.w
    public Object n0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return c.a.j(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public String toString() {
        return g0.f47130b.d(y());
    }

    @Override // q00.f
    public r00.d<?> v() {
        return (r00.d) this.f47190f.b(this, f47188k[1]);
    }

    @Override // q00.f
    public k w() {
        return this.f47192h;
    }

    @Override // q00.f
    public r00.d<?> x() {
        return (r00.d) this.f47191g.b(this, f47188k[2]);
    }

    private l(k kVar, String str, String str2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, Object obj) {
        this.f47192h = kVar;
        this.f47193i = str2;
        this.f47194j = obj;
        this.f47189e = d0.d(eVar, new c(str));
        this.f47190f = d0.b(new a());
        this.f47191g = d0.b(new b());
    }

    @Override // h00.l
    /* renamed from: invoke */
    public Object mo12invoke(Object obj) {
        return c.a.b(this, obj);
    }

    @Override // h00.p
    /* renamed from: invoke */
    public Object mo160invoke(Object obj, Object obj2) {
        return c.a.c(this, obj, obj2);
    }

    @Override // h00.q
    public Object invoke(Object obj, Object obj2, Object obj3) {
        return c.a.d(this, obj, obj2, obj3);
    }

    @Override // h00.r
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return c.a.e(this, obj, obj2, obj3, obj4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(k container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(signature, "signature");
    }

    @Override // h00.s
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return c.a.f(this, obj, obj2, obj3, obj4, obj5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(q00.k r10, kotlin.reflect.jvm.internal.impl.descriptors.e r11) {
        /*
            r9 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.s.g(r10, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.s.g(r11, r0)
            u10.f r0 = r11.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "descriptor.name.asString()"
            kotlin.jvm.internal.s.f(r3, r0)
            q00.h0 r0 = q00.h0.f47174b
            q00.d r0 = r0.g(r11)
            java.lang.String r4 = r0.a()
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q00.l.<init>(q00.k, kotlin.reflect.jvm.internal.impl.descriptors.e):void");
    }
}