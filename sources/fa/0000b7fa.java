package ul;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class z {
    public static void a(boolean z11, String str) {
        if (!z11) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T b(T t11) {
        Objects.requireNonNull(t11);
        return t11;
    }

    public static <T> T c(T t11, String str) {
        Objects.requireNonNull(t11, str);
        return t11;
    }

    public static void d(boolean z11, String str) {
        if (!z11) {
            throw new IllegalStateException(str);
        }
    }
}