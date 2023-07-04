package on;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class a {
    public static void a(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T b(T t11) {
        Objects.requireNonNull(t11);
        return t11;
    }
}