package md;

/* loaded from: classes.dex */
public final class p {
    public static RuntimeException a(Throwable th2) {
        c((Throwable) k.g(th2));
        throw new RuntimeException(th2);
    }

    public static <X extends Throwable> void b(Throwable th2, Class<X> cls) {
        if (th2 != null && cls.isInstance(th2)) {
            throw cls.cast(th2);
        }
    }

    public static void c(Throwable th2) {
        b(th2, Error.class);
        b(th2, RuntimeException.class);
    }
}