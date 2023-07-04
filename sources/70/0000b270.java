package sh;

/* loaded from: classes3.dex */
public final class c<T> implements b<T>, rh.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f50405a;

    static {
        new c(null);
    }

    private c(T t11) {
        this.f50405a = t11;
    }

    public static <T> b<T> a(T t11) {
        return new c(d.c(t11, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.f50405a;
    }
}