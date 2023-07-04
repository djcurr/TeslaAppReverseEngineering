package sh;

import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class a<T> implements Provider<T>, rh.a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f50402c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Provider<T> f50403a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f50404b = f50402c;

    private a(Provider<T> provider) {
        this.f50403a = provider;
    }

    public static <P extends Provider<T>, T> rh.a<T> a(P p11) {
        if (p11 instanceof rh.a) {
            return (rh.a) p11;
        }
        return new a((Provider) d.b(p11));
    }

    public static <P extends Provider<T>, T> Provider<T> b(P p11) {
        d.b(p11);
        return p11 instanceof a ? p11 : new a(p11);
    }

    public static Object c(Object obj, Object obj2) {
        if (!(obj != f50402c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t11 = (T) this.f50404b;
        Object obj = f50402c;
        if (t11 == obj) {
            synchronized (this) {
                t11 = this.f50404b;
                if (t11 == obj) {
                    t11 = this.f50403a.get();
                    this.f50404b = c(this.f50404b, t11);
                    this.f50403a = null;
                }
            }
        }
        return t11;
    }
}