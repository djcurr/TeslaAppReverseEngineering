package q00;

import java.lang.reflect.Field;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import n00.i;
import n00.m;
import q00.d0;
import q00.e;
import t10.d;

/* loaded from: classes5.dex */
public abstract class u<V> extends q00.f<V> implements n00.m<V> {

    /* renamed from: k  reason: collision with root package name */
    private static final Object f47249k;

    /* renamed from: e  reason: collision with root package name */
    private final d0.b<Field> f47250e;

    /* renamed from: f  reason: collision with root package name */
    private final d0.a<w00.i0> f47251f;

    /* renamed from: g  reason: collision with root package name */
    private final k f47252g;

    /* renamed from: h  reason: collision with root package name */
    private final String f47253h;

    /* renamed from: i  reason: collision with root package name */
    private final String f47254i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f47255j;

    /* loaded from: classes5.dex */
    public static abstract class a<PropertyType, ReturnType> extends q00.f<ReturnType> implements n00.h<ReturnType>, m.a<PropertyType> {
        @Override // q00.f
        public boolean A() {
            return E().A();
        }

        public abstract kotlin.reflect.jvm.internal.impl.descriptors.g B();

        public abstract u<PropertyType> E();

        @Override // n00.h
        public boolean isExternal() {
            return B().isExternal();
        }

        @Override // n00.h
        public boolean isInfix() {
            return B().isInfix();
        }

        @Override // n00.h
        public boolean isInline() {
            return B().isInline();
        }

        @Override // n00.h
        public boolean isOperator() {
            return B().isOperator();
        }

        @Override // n00.c
        public boolean isSuspend() {
            return B().isSuspend();
        }

        @Override // q00.f
        public k w() {
            return E().w();
        }

        @Override // q00.f
        public r00.d<?> x() {
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class c<V> extends a<V, V> implements m.b<V> {

        /* renamed from: g  reason: collision with root package name */
        static final /* synthetic */ n00.m[] f47256g = {kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(c.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: e  reason: collision with root package name */
        private final d0.a f47257e = d0.c(new b());

        /* renamed from: f  reason: collision with root package name */
        private final d0.b f47258f = d0.b(new a());

        /* loaded from: classes5.dex */
        static final class a extends kotlin.jvm.internal.u implements h00.a<r00.d<?>> {
            a() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final r00.d<?> invoke() {
                return v.a(c.this, true);
            }
        }

        /* loaded from: classes5.dex */
        static final class b extends kotlin.jvm.internal.u implements h00.a<w00.j0> {
            b() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final w00.j0 invoke() {
                w00.j0 getter = c.this.E().y().getGetter();
                return getter != null ? getter : w10.c.b(c.this.E().y(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b());
            }
        }

        @Override // q00.f
        /* renamed from: F */
        public w00.j0 y() {
            return (w00.j0) this.f47257e.b(this, f47256g[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && kotlin.jvm.internal.s.c(E(), ((c) obj).E());
        }

        @Override // n00.c
        public String getName() {
            return "<get-" + E().getName() + '>';
        }

        public int hashCode() {
            return E().hashCode();
        }

        public String toString() {
            return "getter of " + E();
        }

        @Override // q00.f
        public r00.d<?> v() {
            return (r00.d) this.f47258f.b(this, f47256g[1]);
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class d<V> extends a<V, vz.b0> implements i.a<V> {

        /* renamed from: g  reason: collision with root package name */
        static final /* synthetic */ n00.m[] f47261g = {kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(d.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: e  reason: collision with root package name */
        private final d0.a f47262e = d0.c(new b());

        /* renamed from: f  reason: collision with root package name */
        private final d0.b f47263f = d0.b(new a());

        /* loaded from: classes5.dex */
        static final class a extends kotlin.jvm.internal.u implements h00.a<r00.d<?>> {
            a() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final r00.d<?> invoke() {
                return v.a(d.this, false);
            }
        }

        /* loaded from: classes5.dex */
        static final class b extends kotlin.jvm.internal.u implements h00.a<w00.k0> {
            b() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final w00.k0 invoke() {
                w00.k0 setter = d.this.E().y().getSetter();
                if (setter != null) {
                    return setter;
                }
                w00.i0 y11 = d.this.E().y();
                g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1;
                return w10.c.c(y11, aVar.b(), aVar.b());
            }
        }

        @Override // q00.f
        /* renamed from: F */
        public w00.k0 y() {
            return (w00.k0) this.f47262e.b(this, f47261g[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && kotlin.jvm.internal.s.c(E(), ((d) obj).E());
        }

        @Override // n00.c
        public String getName() {
            return "<set-" + E().getName() + '>';
        }

        public int hashCode() {
            return E().hashCode();
        }

        public String toString() {
            return "setter of " + E();
        }

        @Override // q00.f
        public r00.d<?> v() {
            return (r00.d) this.f47263f.b(this, f47261g[1]);
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.a<w00.i0> {
        e() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final w00.i0 invoke() {
            return u.this.w().y(u.this.getName(), u.this.K());
        }
    }

    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.u implements h00.a<Field> {
        f() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Field invoke() {
            Class<?> enclosingClass;
            q00.e f11 = h0.f47174b.f(u.this.y());
            if (f11 instanceof e.c) {
                e.c cVar = (e.c) f11;
                w00.i0 b11 = cVar.b();
                d.a d11 = t10.g.d(t10.g.f51558a, cVar.e(), cVar.d(), cVar.g(), false, 8, null);
                if (d11 != null) {
                    if (!e10.k.e(b11) && !t10.g.f(cVar.e())) {
                        w00.i b12 = b11.b();
                        enclosingClass = b12 instanceof w00.c ? l0.p((w00.c) b12) : u.this.w().d();
                    } else {
                        enclosingClass = u.this.w().d().getEnclosingClass();
                    }
                    if (enclosingClass != null) {
                        try {
                            return enclosingClass.getDeclaredField(d11.c());
                        } catch (NoSuchFieldException unused) {
                            return null;
                        }
                    }
                    return null;
                }
                return null;
            } else if (f11 instanceof e.a) {
                return ((e.a) f11).b();
            } else {
                if ((f11 instanceof e.b) || (f11 instanceof e.d)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    static {
        new b(null);
        f47249k = new Object();
    }

    private u(k kVar, String str, String str2, w00.i0 i0Var, Object obj) {
        this.f47252g = kVar;
        this.f47253h = str;
        this.f47254i = str2;
        this.f47255j = obj;
        d0.b<Field> b11 = d0.b(new f());
        kotlin.jvm.internal.s.f(b11, "ReflectProperties.lazy {…y -> null\n        }\n    }");
        this.f47250e = b11;
        d0.a<w00.i0> d11 = d0.d(i0Var, new e());
        kotlin.jvm.internal.s.f(d11, "ReflectProperties.lazySo…or(name, signature)\n    }");
        this.f47251f = d11;
    }

    @Override // q00.f
    public boolean A() {
        return !kotlin.jvm.internal.s.c(this.f47255j, kotlin.jvm.internal.f.NO_RECEIVER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Field B() {
        if (y().z()) {
            return I();
        }
        return null;
    }

    public final Object E() {
        return r00.h.a(this.f47255j, y());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return r2.get(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object F(java.lang.reflect.Field r2, java.lang.Object r3) {
        /*
            r1 = this;
            java.lang.Object r0 = q00.u.f47249k     // Catch: java.lang.IllegalAccessException -> L39
            if (r3 != r0) goto L30
            w00.i0 r0 = r1.y()     // Catch: java.lang.IllegalAccessException -> L39
            w00.l0 r0 = r0.N()     // Catch: java.lang.IllegalAccessException -> L39
            if (r0 == 0) goto Lf
            goto L30
        Lf:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.IllegalAccessException -> L39
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> L39
            r3.<init>()     // Catch: java.lang.IllegalAccessException -> L39
            r0 = 39
            r3.append(r0)     // Catch: java.lang.IllegalAccessException -> L39
            r3.append(r1)     // Catch: java.lang.IllegalAccessException -> L39
            java.lang.String r0 = "' is not an extension property and thus getExtensionDelegate() "
            r3.append(r0)     // Catch: java.lang.IllegalAccessException -> L39
            java.lang.String r0 = "is not going to work, use getDelegate() instead"
            r3.append(r0)     // Catch: java.lang.IllegalAccessException -> L39
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalAccessException -> L39
            r2.<init>(r3)     // Catch: java.lang.IllegalAccessException -> L39
            throw r2     // Catch: java.lang.IllegalAccessException -> L39
        L30:
            if (r2 == 0) goto L37
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.IllegalAccessException -> L39
            goto L38
        L37:
            r2 = 0
        L38:
            return r2
        L39:
            r2 = move-exception
            kotlin.reflect.full.IllegalPropertyDelegateAccessException r3 = new kotlin.reflect.full.IllegalPropertyDelegateAccessException
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q00.u.F(java.lang.reflect.Field, java.lang.Object):java.lang.Object");
    }

    @Override // q00.f
    /* renamed from: G */
    public w00.i0 y() {
        w00.i0 invoke = this.f47251f.invoke();
        kotlin.jvm.internal.s.f(invoke, "_descriptor()");
        return invoke;
    }

    public abstract c<V> H();

    public final Field I() {
        return this.f47250e.invoke();
    }

    public final String K() {
        return this.f47254i;
    }

    public boolean equals(Object obj) {
        u<?> d11 = l0.d(obj);
        return d11 != null && kotlin.jvm.internal.s.c(w(), d11.w()) && kotlin.jvm.internal.s.c(getName(), d11.getName()) && kotlin.jvm.internal.s.c(this.f47254i, d11.f47254i) && kotlin.jvm.internal.s.c(this.f47255j, d11.f47255j);
    }

    @Override // n00.c
    public String getName() {
        return this.f47253h;
    }

    public int hashCode() {
        return (((w().hashCode() * 31) + getName().hashCode()) * 31) + this.f47254i.hashCode();
    }

    @Override // n00.m
    public boolean isConst() {
        return y().isConst();
    }

    @Override // n00.m
    public boolean isLateinit() {
        return y().s0();
    }

    @Override // n00.c
    public boolean isSuspend() {
        return false;
    }

    public String toString() {
        return g0.f47130b.g(y());
    }

    @Override // q00.f
    public r00.d<?> v() {
        return H().v();
    }

    @Override // q00.f
    public k w() {
        return this.f47252g;
    }

    @Override // q00.f
    public r00.d<?> x() {
        return H().x();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(k container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u(q00.k r8, w00.i0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.s.g(r8, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.s.g(r9, r0)
            u10.f r0 = r9.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "descriptor.name.asString()"
            kotlin.jvm.internal.s.f(r3, r0)
            q00.h0 r0 = q00.h0.f47174b
            q00.e r0 = r0.f(r9)
            java.lang.String r4 = r0.a()
            java.lang.Object r6 = kotlin.jvm.internal.f.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q00.u.<init>(q00.k, w00.i0):void");
    }
}