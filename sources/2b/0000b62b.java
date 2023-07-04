package tw;

/* loaded from: classes6.dex */
public final class f<T> implements e<T>, sw.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f52637a;

    static {
        new f(null);
    }

    private f(T t11) {
        this.f52637a = t11;
    }

    public static <T> e<T> a(T t11) {
        return new f(h.c(t11, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.f52637a;
    }
}