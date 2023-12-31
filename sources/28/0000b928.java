package v3;

import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h {
    public static void a(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int c(int i11, int i12, int i13, String str) {
        if (i11 >= i12) {
            if (i11 <= i13) {
                return i11;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i12), Integer.valueOf(i13)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i12), Integer.valueOf(i13)));
    }

    public static int d(int i11) {
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalArgumentException();
    }

    public static int e(int i11, int i12) {
        if ((i11 & i12) == i11) {
            return i11;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(i12) + " are allowed");
    }

    public static <T> T f(T t11) {
        Objects.requireNonNull(t11);
        return t11;
    }

    public static <T> T g(T t11, Object obj) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void h(boolean z11) {
        i(z11, null);
    }

    public static void i(boolean z11, String str) {
        if (!z11) {
            throw new IllegalStateException(str);
        }
    }
}