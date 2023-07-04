package sh;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class d {
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
}