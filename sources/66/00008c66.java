package nh;

/* loaded from: classes3.dex */
public abstract class c<T> {
    public static <T> c<T> d(T t11) {
        return new a(null, t11, d.DEFAULT);
    }

    public static <T> c<T> e(T t11) {
        return new a(null, t11, d.VERY_LOW);
    }

    public static <T> c<T> f(T t11) {
        return new a(null, t11, d.HIGHEST);
    }

    public abstract Integer a();

    public abstract T b();

    public abstract d c();
}