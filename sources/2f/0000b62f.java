package tw;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class h {
    public static <T> void a(T t11, Class<T> cls) {
        if (t11 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static <T> T b(T t11) {
        Objects.requireNonNull(t11);
        return t11;
    }

    public static <T> T c(T t11, String str) {
        Objects.requireNonNull(t11, str);
        return t11;
    }

    public static <T> T d(T t11) {
        Objects.requireNonNull(t11, "Cannot return null from a non-@Nullable component method");
        return t11;
    }

    public static <T> T e(T t11) {
        Objects.requireNonNull(t11, "Cannot return null from a non-@Nullable @Provides method");
        return t11;
    }
}