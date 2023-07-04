package kotlin.reflect.jvm.internal.impl.utils;

import s20.c;

/* loaded from: classes5.dex */
public class WrappedValues {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f35183a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f35184b = false;

    /* loaded from: classes5.dex */
    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th2) {
            super("Rethrow stored exception", th2);
        }
    }

    /* loaded from: classes5.dex */
    static class a {
        a() {
        }

        public String toString() {
            return "NULL_VALUE";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f35185a;

        /* synthetic */ b(Throwable th2, a aVar) {
            this(th2);
        }

        private static /* synthetic */ void a(int i11) {
            String str = i11 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 1 ? 3 : 2];
            if (i11 != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i11 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i11 != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 == 1) {
                throw new IllegalStateException(format);
            }
        }

        public Throwable b() {
            Throwable th2 = this.f35185a;
            if (th2 == null) {
                a(1);
            }
            return th2;
        }

        public String toString() {
            return this.f35185a.toString();
        }

        private b(Throwable th2) {
            if (th2 == null) {
                a(0);
            }
            this.f35185a = th2;
        }
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 1 || i11 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 2) ? 2 : 3];
        if (i11 == 1 || i11 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i11 != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i11 == 1 || i11 == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i11 != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String format = String.format(str, objArr);
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static <V> Object b(V v11) {
        if (v11 == null && (v11 = (V) f35183a) == null) {
            a(1);
        }
        return v11;
    }

    public static Object c(Throwable th2) {
        if (th2 == null) {
            a(3);
        }
        return new b(th2, null);
    }

    public static <V> V d(Object obj) {
        if (obj == null) {
            a(4);
        }
        return (V) e(f(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V e(Object obj) {
        if (obj == 0) {
            a(0);
        }
        if (obj == f35183a) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V f(Object obj) {
        if (obj instanceof b) {
            Throwable b11 = ((b) obj).b();
            if (f35184b && c.a(b11)) {
                throw new WrappedProcessCanceledException(b11);
            }
            throw c.b(b11);
        }
        return obj;
    }
}