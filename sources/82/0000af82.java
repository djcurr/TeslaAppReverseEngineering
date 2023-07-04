package r00;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.s;
import r00.d;
import vz.b0;
import wz.l;

/* loaded from: classes5.dex */
public abstract class e<M extends Member> implements r00.d<M> {

    /* renamed from: e  reason: collision with root package name */
    public static final d f48945e = new d(null);

    /* renamed from: a  reason: collision with root package name */
    private final List<Type> f48946a;

    /* renamed from: b  reason: collision with root package name */
    private final M f48947b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f48948c;

    /* renamed from: d  reason: collision with root package name */
    private final Class<?> f48949d;

    /* loaded from: classes5.dex */
    public static final class a extends e<Constructor<?>> implements r00.c {

        /* renamed from: f  reason: collision with root package name */
        private final Object f48950f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.s.g(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.s.f(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.s.f(r0, r1)
                int r1 = r0.length
                r2 = 2
                if (r1 > r2) goto L1f
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L2b
            L1f:
                int r1 = r0.length
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object[] r0 = wz.l.r(r0, r2, r1)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r0, r1)
            L2b:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f48950f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r00.e.a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // r00.d
        public Object call(Object[] args) {
            s.g(args, "args");
            c(args);
            p0 p0Var = new p0(3);
            p0Var.a(this.f48950f);
            p0Var.b(args);
            p0Var.a(null);
            return b().newInstance(p0Var.d(new Object[p0Var.c()]));
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends e<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.s.g(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.s.f(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.s.f(r0, r1)
                int r1 = r0.length
                r2 = 0
                r4 = 1
                if (r1 > r4) goto L1f
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                goto L2a
            L1f:
                int r1 = r0.length
                int r1 = r1 - r4
                java.lang.Object[] r0 = wz.l.r(r0, r2, r1)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r0, r1)
            L2a:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r00.e.b.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // r00.d
        public Object call(Object[] args) {
            s.g(args, "args");
            c(args);
            p0 p0Var = new p0(2);
            p0Var.b(args);
            p0Var.a(null);
            return b().newInstance(p0Var.d(new Object[p0Var.c()]));
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends e<Constructor<?>> implements r00.c {

        /* renamed from: f  reason: collision with root package name */
        private final Object f48951f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public c(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.s.g(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.s.f(r3, r0)
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.s.f(r5, r0)
                r4 = 0
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f48951f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r00.e.c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // r00.d
        public Object call(Object[] args) {
            s.g(args, "args");
            c(args);
            p0 p0Var = new p0(2);
            p0Var.a(this.f48951f);
            p0Var.b(args);
            return b().newInstance(p0Var.d(new Object[p0Var.c()]));
        }
    }

    /* loaded from: classes5.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: r00.e$e  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C1063e extends e<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C1063e(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.s.g(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.s.f(r3, r0)
                java.lang.Class r0 = r8.getDeclaringClass()
                java.lang.String r1 = "klass"
                kotlin.jvm.internal.s.f(r0, r1)
                java.lang.Class r1 = r0.getDeclaringClass()
                if (r1 == 0) goto L29
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L29
                r4 = r1
                goto L2b
            L29:
                r0 = 0
                r4 = r0
            L2b:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.s.f(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r00.e.C1063e.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // r00.d
        public Object call(Object[] args) {
            s.g(args, "args");
            c(args);
            return b().newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class f extends e<Field> {

        /* loaded from: classes5.dex */
        public static final class a extends f implements r00.c {

            /* renamed from: f  reason: collision with root package name */
            private final Object f48952f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, null);
                s.g(field, "field");
                this.f48952f = obj;
            }

            @Override // r00.e.f, r00.d
            public Object call(Object[] args) {
                s.g(args, "args");
                c(args);
                return b().get(this.f48952f);
            }
        }

        /* loaded from: classes5.dex */
        public static final class b extends f implements r00.c {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, null);
                s.g(field, "field");
            }
        }

        /* loaded from: classes5.dex */
        public static final class c extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, null);
                s.g(field, "field");
            }
        }

        /* loaded from: classes5.dex */
        public static final class d extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, null);
                s.g(field, "field");
            }

            @Override // r00.e
            public void c(Object[] args) {
                s.g(args, "args");
                super.c(args);
                d(l.H(args));
            }
        }

        /* renamed from: r00.e$f$e  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C1064e extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1064e(Field field) {
                super(field, false, null);
                s.g(field, "field");
            }
        }

        public /* synthetic */ f(Field field, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z11);
        }

        @Override // r00.d
        public Object call(Object[] args) {
            s.g(args, "args");
            c(args);
            return b().get(e() != null ? l.G(args) : null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private f(java.lang.reflect.Field r7, boolean r8) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r0 = "field.genericType"
                kotlin.jvm.internal.s.f(r2, r0)
                if (r8 == 0) goto L10
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L11
            L10:
                r8 = 0
            L11:
                r3 = r8
                r8 = 0
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r8]
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r00.e.f.<init>(java.lang.reflect.Field, boolean):void");
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class g extends e<Field> {

        /* renamed from: f  reason: collision with root package name */
        private final boolean f48953f;

        /* loaded from: classes5.dex */
        public static final class a extends g implements r00.c {

            /* renamed from: g  reason: collision with root package name */
            private final Object f48954g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z11, Object obj) {
                super(field, z11, false, null);
                s.g(field, "field");
                this.f48954g = obj;
            }

            @Override // r00.e.g, r00.d
            public Object call(Object[] args) {
                s.g(args, "args");
                c(args);
                b().set(this.f48954g, l.G(args));
                return b0.f54756a;
            }
        }

        /* loaded from: classes5.dex */
        public static final class b extends g implements r00.c {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z11) {
                super(field, z11, false, null);
                s.g(field, "field");
            }

            @Override // r00.e.g, r00.d
            public Object call(Object[] args) {
                s.g(args, "args");
                c(args);
                b().set(null, l.Z(args));
                return b0.f54756a;
            }
        }

        /* loaded from: classes5.dex */
        public static final class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z11) {
                super(field, z11, true, null);
                s.g(field, "field");
            }
        }

        /* loaded from: classes5.dex */
        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z11) {
                super(field, z11, true, null);
                s.g(field, "field");
            }

            @Override // r00.e.g, r00.e
            public void c(Object[] args) {
                s.g(args, "args");
                super.c(args);
                d(l.H(args));
            }
        }

        /* renamed from: r00.e$g$e  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C1065e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1065e(Field field, boolean z11) {
                super(field, z11, false, null);
                s.g(field, "field");
            }
        }

        public /* synthetic */ g(Field field, boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z11, z12);
        }

        @Override // r00.e
        public void c(Object[] args) {
            s.g(args, "args");
            super.c(args);
            if (this.f48953f && l.Z(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // r00.d
        public Object call(Object[] args) {
            s.g(args, "args");
            c(args);
            b().set(e() != null ? l.G(args) : null, l.Z(args));
            return b0.f54756a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private g(java.lang.reflect.Field r7, boolean r8, boolean r9) {
            /*
                r6 = this;
                java.lang.Class r2 = java.lang.Void.TYPE
                java.lang.String r0 = "Void.TYPE"
                kotlin.jvm.internal.s.f(r2, r0)
                if (r9 == 0) goto Le
                java.lang.Class r9 = r7.getDeclaringClass()
                goto Lf
            Le:
                r9 = 0
            Lf:
                r3 = r9
                r9 = 1
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r9]
                r9 = 0
                java.lang.reflect.Type r0 = r7.getGenericType()
                java.lang.String r1 = "field.genericType"
                kotlin.jvm.internal.s.f(r0, r1)
                r4[r9] = r0
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f48953f = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r00.e.g.<init>(java.lang.reflect.Field, boolean, boolean):void");
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class h extends e<Method> {

        /* renamed from: f  reason: collision with root package name */
        private final boolean f48955f;

        /* loaded from: classes5.dex */
        public static final class a extends h implements r00.c {

            /* renamed from: g  reason: collision with root package name */
            private final Object f48956g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, null, 4, null);
                s.g(method, "method");
                this.f48956g = obj;
            }

            @Override // r00.d
            public Object call(Object[] args) {
                s.g(args, "args");
                c(args);
                return f(this.f48956g, args);
            }
        }

        /* loaded from: classes5.dex */
        public static final class b extends h implements r00.c {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, null, 4, null);
                s.g(method, "method");
            }

            @Override // r00.d
            public Object call(Object[] args) {
                s.g(args, "args");
                c(args);
                return f(null, args);
            }
        }

        /* loaded from: classes5.dex */
        public static final class c extends h implements r00.c {

            /* renamed from: g  reason: collision with root package name */
            private final Object f48957g;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public c(java.lang.reflect.Method r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.s.g(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "method.genericParameterTypes"
                    kotlin.jvm.internal.s.f(r0, r1)
                    int r1 = r0.length
                    r2 = 1
                    r3 = 0
                    if (r1 > r2) goto L16
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r3]
                    goto L20
                L16:
                    int r1 = r0.length
                    java.lang.Object[] r0 = wz.l.r(r0, r2, r1)
                    java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                    java.util.Objects.requireNonNull(r0, r1)
                L20:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r1 = 0
                    r4.<init>(r5, r3, r0, r1)
                    r4.f48957g = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: r00.e.h.c.<init>(java.lang.reflect.Method, java.lang.Object):void");
            }

            @Override // r00.d
            public Object call(Object[] args) {
                s.g(args, "args");
                c(args);
                p0 p0Var = new p0(2);
                p0Var.a(this.f48957g);
                p0Var.b(args);
                return f(null, p0Var.d(new Object[p0Var.c()]));
            }
        }

        /* loaded from: classes5.dex */
        public static final class d extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Method method) {
                super(method, false, null, 6, null);
                s.g(method, "method");
            }

            @Override // r00.d
            public Object call(Object[] args) {
                Object[] r11;
                s.g(args, "args");
                c(args);
                Object obj = args[0];
                if (args.length <= 1) {
                    r11 = new Object[0];
                } else {
                    r11 = l.r(args, 1, args.length);
                    Objects.requireNonNull(r11, "null cannot be cast to non-null type kotlin.Array<T>");
                }
                return f(obj, r11);
            }
        }

        /* renamed from: r00.e$h$e  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C1066e extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1066e(Method method) {
                super(method, true, null, 4, null);
                s.g(method, "method");
            }

            @Override // r00.d
            public Object call(Object[] args) {
                Object[] r11;
                s.g(args, "args");
                c(args);
                d(l.H(args));
                if (args.length <= 1) {
                    r11 = new Object[0];
                } else {
                    r11 = l.r(args, 1, args.length);
                    Objects.requireNonNull(r11, "null cannot be cast to non-null type kotlin.Array<T>");
                }
                return f(null, r11);
            }
        }

        /* loaded from: classes5.dex */
        public static final class f extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, false, null, 6, null);
                s.g(method, "method");
            }

            @Override // r00.d
            public Object call(Object[] args) {
                s.g(args, "args");
                c(args);
                return f(null, args);
            }
        }

        public /* synthetic */ h(Method method, boolean z11, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z11, typeArr);
        }

        protected final Object f(Object obj, Object[] args) {
            s.g(args, "args");
            return this.f48955f ? b0.f54756a : b().invoke(obj, Arrays.copyOf(args, args.length));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ h(java.lang.reflect.Method r1, boolean r2, java.lang.reflect.Type[] r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            /*
                r0 = this;
                r5 = r4 & 2
                if (r5 == 0) goto Le
                int r2 = r1.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r2 = r2 ^ 1
            Le:
                r4 = r4 & 4
                if (r4 == 0) goto L1b
                java.lang.reflect.Type[] r3 = r1.getGenericParameterTypes()
                java.lang.String r4 = "method.genericParameterTypes"
                kotlin.jvm.internal.s.f(r3, r4)
            L1b:
                r0.<init>(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r00.e.h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private h(java.lang.reflect.Method r7, boolean r8, java.lang.reflect.Type[] r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericReturnType()
                java.lang.String r0 = "method.genericReturnType"
                kotlin.jvm.internal.s.f(r2, r0)
                if (r8 == 0) goto L10
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L11
            L10:
                r8 = 0
            L11:
                r3 = r8
                r5 = 0
                r0 = r6
                r1 = r7
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.reflect.Type r7 = r6.getReturnType()
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r7 = kotlin.jvm.internal.s.c(r7, r8)
                r6.f48955f = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r00.e.h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r1 != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private e(M r1, java.lang.reflect.Type r2, java.lang.Class<?> r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f48947b = r1
            r0.f48948c = r2
            r0.f48949d = r3
            if (r3 == 0) goto L2a
            kotlin.jvm.internal.p0 r1 = new kotlin.jvm.internal.p0
            r2 = 2
            r1.<init>(r2)
            r1.a(r3)
            r1.b(r4)
            int r2 = r1.c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.d(r2)
            java.lang.reflect.Type[] r1 = (java.lang.reflect.Type[]) r1
            java.util.List r1 = wz.u.l(r1)
            if (r1 == 0) goto L2a
            goto L2e
        L2a:
            java.util.List r1 = wz.l.s0(r4)
        L2e:
            r0.f48946a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r00.e.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }

    @Override // r00.d
    public List<Type> a() {
        return this.f48946a;
    }

    @Override // r00.d
    public final M b() {
        return this.f48947b;
    }

    public void c(Object[] args) {
        s.g(args, "args");
        d.a.a(this, args);
    }

    protected final void d(Object obj) {
        if (obj == null || !this.f48947b.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public final Class<?> e() {
        return this.f48949d;
    }

    @Override // r00.d
    public final Type getReturnType() {
        return this.f48948c;
    }

    public /* synthetic */ e(Member member, Type type, Class cls, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(member, type, cls, typeArr);
    }
}