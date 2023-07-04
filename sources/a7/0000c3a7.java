package yy;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Throwable f59922a = new a();

    /* loaded from: classes5.dex */
    static final class a extends Throwable {
        a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    public static boolean a(AtomicReference<Throwable> atomicReference, Throwable th2) {
        Throwable th3;
        do {
            th3 = atomicReference.get();
            if (th3 == f59922a) {
                return false;
            }
        } while (!atomicReference.compareAndSet(th3, th3 == null ? th2 : new CompositeException(th3, th2)));
        return true;
    }

    public static NullPointerException b(String str) {
        return new NullPointerException(d(str));
    }

    public static <T> T c(T t11, String str) {
        if (t11 != null) {
            return t11;
        }
        throw b(str);
    }

    public static String d(String str) {
        return str + " Null values are generally not allowed in 3.x operators and sources.";
    }

    public static Throwable e(AtomicReference<Throwable> atomicReference) {
        Throwable th2 = atomicReference.get();
        Throwable th3 = f59922a;
        return th2 != th3 ? atomicReference.getAndSet(th3) : th2;
    }

    public static <E extends Throwable> Exception f(Throwable th2) {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        throw th2;
    }

    public static String g(long j11, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j11 + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    public static RuntimeException h(Throwable th2) {
        if (!(th2 instanceof Error)) {
            if (th2 instanceof RuntimeException) {
                return (RuntimeException) th2;
            }
            return new RuntimeException(th2);
        }
        throw ((Error) th2);
    }
}