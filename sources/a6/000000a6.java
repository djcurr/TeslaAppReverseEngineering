package ak;

import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a {
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

    public static int c(int i11, int i12, int i13) {
        if (i11 < i12 || i11 >= i13) {
            throw new IndexOutOfBoundsException();
        }
        return i11;
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static <T> T e(T t11) {
        Objects.requireNonNull(t11);
        return t11;
    }

    public static void f(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    public static void g(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static <T> T h(T t11) {
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException();
    }

    public static <T> T i(T t11, Object obj) {
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}