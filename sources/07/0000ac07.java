package q00;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t10.d;

/* loaded from: classes5.dex */
public abstract class d {

    /* loaded from: classes5.dex */
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        private final List<Method> f47088a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<?> f47089b;

        /* renamed from: q00.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C1010a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                int a11;
                Method it2 = (Method) t11;
                kotlin.jvm.internal.s.f(it2, "it");
                String name = it2.getName();
                Method it3 = (Method) t12;
                kotlin.jvm.internal.s.f(it3, "it");
                a11 = yz.b.a(name, it3.getName());
                return a11;
            }
        }

        /* loaded from: classes5.dex */
        static final class b extends kotlin.jvm.internal.u implements h00.l<Method, CharSequence> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f47090a = new b();

            b() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: a */
            public final CharSequence invoke(Method it2) {
                kotlin.jvm.internal.s.f(it2, "it");
                Class<?> returnType = it2.getReturnType();
                kotlin.jvm.internal.s.f(returnType, "it.returnType");
                return b10.b.b(returnType);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<?> jClass) {
            super(null);
            List<Method> k02;
            kotlin.jvm.internal.s.g(jClass, "jClass");
            this.f47089b = jClass;
            Method[] declaredMethods = jClass.getDeclaredMethods();
            kotlin.jvm.internal.s.f(declaredMethods, "jClass.declaredMethods");
            k02 = wz.p.k0(declaredMethods, new C1010a());
            this.f47088a = k02;
        }

        @Override // q00.d
        public String a() {
            String l02;
            l02 = wz.e0.l0(this.f47088a, "", "<init>(", ")V", 0, null, b.f47090a, 24, null);
            return l02;
        }

        public final List<Method> b() {
            return this.f47088a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        private final Constructor<?> f47091a;

        /* loaded from: classes5.dex */
        static final class a extends kotlin.jvm.internal.u implements h00.l<Class<?>, CharSequence> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f47092a = new a();

            a() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: a */
            public final CharSequence invoke(Class<?> it2) {
                kotlin.jvm.internal.s.f(it2, "it");
                return b10.b.b(it2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor<?> constructor) {
            super(null);
            kotlin.jvm.internal.s.g(constructor, "constructor");
            this.f47091a = constructor;
        }

        @Override // q00.d
        public String a() {
            String Y;
            Class<?>[] parameterTypes = this.f47091a.getParameterTypes();
            kotlin.jvm.internal.s.f(parameterTypes, "constructor.parameterTypes");
            Y = wz.p.Y(parameterTypes, "", "<init>(", ")V", 0, null, a.f47092a, 24, null);
            return Y;
        }

        public final Constructor<?> b() {
            return this.f47091a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        private final Method f47093a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super(null);
            kotlin.jvm.internal.s.g(method, "method");
            this.f47093a = method;
        }

        @Override // q00.d
        public String a() {
            String b11;
            b11 = i0.b(this.f47093a);
            return b11;
        }

        public final Method b() {
            return this.f47093a;
        }
    }

    /* renamed from: q00.d$d  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C1011d extends d {

        /* renamed from: a  reason: collision with root package name */
        private final String f47094a;

        /* renamed from: b  reason: collision with root package name */
        private final d.b f47095b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1011d(d.b signature) {
            super(null);
            kotlin.jvm.internal.s.g(signature, "signature");
            this.f47095b = signature;
            this.f47094a = signature.a();
        }

        @Override // q00.d
        public String a() {
            return this.f47094a;
        }

        public final String b() {
            return this.f47095b.b();
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends d {

        /* renamed from: a  reason: collision with root package name */
        private final String f47096a;

        /* renamed from: b  reason: collision with root package name */
        private final d.b f47097b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d.b signature) {
            super(null);
            kotlin.jvm.internal.s.g(signature, "signature");
            this.f47097b = signature;
            this.f47096a = signature.a();
        }

        @Override // q00.d
        public String a() {
            return this.f47096a;
        }

        public final String b() {
            return this.f47097b.b();
        }

        public final String c() {
            return this.f47097b.c();
        }
    }

    private d() {
    }

    public abstract String a();

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}