package tw;

import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class d<T> implements Provider<T>, sw.a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f52634c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Provider<T> f52635a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f52636b = f52634c;

    private d(Provider<T> provider) {
        this.f52635a = provider;
    }

    public static <P extends Provider<T>, T> sw.a<T> a(P p11) {
        if (p11 instanceof sw.a) {
            return (sw.a) p11;
        }
        return new d((Provider) h.b(p11));
    }

    public static <P extends Provider<T>, T> Provider<T> b(P p11) {
        h.b(p11);
        return p11 instanceof d ? p11 : new d(p11);
    }

    private static Object c(Object obj, Object obj2) {
        if (!(obj != f52634c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t11 = (T) this.f52636b;
        Object obj = f52634c;
        if (t11 == obj) {
            synchronized (this) {
                t11 = this.f52636b;
                if (t11 == obj) {
                    t11 = this.f52635a.get();
                    this.f52636b = c(this.f52636b, t11);
                    this.f52635a = null;
                }
            }
        }
        return t11;
    }
}