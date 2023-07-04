package q00;

import java.lang.ref.SoftReference;

/* loaded from: classes5.dex */
public class d0 {

    /* loaded from: classes5.dex */
    public static class a<T> extends c<T> implements h00.a<T> {

        /* renamed from: b  reason: collision with root package name */
        private final h00.a<T> f47098b;

        /* renamed from: c  reason: collision with root package name */
        private volatile SoftReference<Object> f47099c;

        public a(T t11, h00.a<T> aVar) {
            if (aVar == null) {
                d(0);
            }
            this.f47099c = null;
            this.f47098b = aVar;
            if (t11 != null) {
                this.f47099c = new SoftReference<>(a(t11));
            }
        }

        private static /* synthetic */ void d(int i11) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // q00.d0.c, h00.a
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f47099c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return c(obj);
            }
            T invoke = this.f47098b.invoke();
            this.f47099c = new SoftReference<>(a(invoke));
            return invoke;
        }
    }

    /* loaded from: classes5.dex */
    public static class b<T> extends c<T> {

        /* renamed from: b  reason: collision with root package name */
        private final h00.a<T> f47100b;

        /* renamed from: c  reason: collision with root package name */
        private volatile Object f47101c;

        public b(h00.a<T> aVar) {
            if (aVar == null) {
                d(0);
            }
            this.f47101c = null;
            this.f47100b = aVar;
        }

        private static /* synthetic */ void d(int i11) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"));
        }

        @Override // q00.d0.c, h00.a
        public T invoke() {
            Object obj = this.f47101c;
            if (obj != null) {
                return c(obj);
            }
            T invoke = this.f47100b.invoke();
            this.f47101c = a(invoke);
            return invoke;
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class c<T> {

        /* renamed from: a  reason: collision with root package name */
        private static final Object f47102a = new a();

        /* loaded from: classes5.dex */
        static class a {
            a() {
            }
        }

        protected Object a(T t11) {
            return t11 == null ? f47102a : t11;
        }

        public final T b(Object obj, Object obj2) {
            return invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected T c(Object obj) {
            if (obj == f47102a) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    private static /* synthetic */ void a(int i11) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i11 == 1 || i11 == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <T> b<T> b(h00.a<T> aVar) {
        if (aVar == null) {
            a(0);
        }
        return new b<>(aVar);
    }

    public static <T> a<T> c(h00.a<T> aVar) {
        if (aVar == null) {
            a(2);
        }
        return d(null, aVar);
    }

    public static <T> a<T> d(T t11, h00.a<T> aVar) {
        if (aVar == null) {
            a(1);
        }
        return new a<>(t11, aVar);
    }
}