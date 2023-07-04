package md;

import java.util.Objects;

/* loaded from: classes.dex */
public final class k {
    private static String a(int i11, int i12, String str) {
        if (i11 < 0) {
            return k("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return k("%s (%s) must be less than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }

    public static void b(Boolean bool) {
        if (bool != null && !bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void d(boolean z11, String str, Object... objArr) {
        if (!z11) {
            throw new IllegalArgumentException(k(str, objArr));
        }
    }

    public static int e(int i11, int i12) {
        return f(i11, i12, "index");
    }

    public static int f(int i11, int i12, String str) {
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException(a(i11, i12, str));
        }
        return i11;
    }

    public static <T> T g(T t11) {
        Objects.requireNonNull(t11);
        return t11;
    }

    public static <T> T h(T t11, Object obj) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void i(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    public static void j(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    static String k(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i11 = 0;
        int i12 = 0;
        while (i11 < objArr.length && (indexOf = valueOf.indexOf("%s", i12)) != -1) {
            sb2.append(valueOf.substring(i12, indexOf));
            sb2.append(objArr[i11]);
            i12 = indexOf + 2;
            i11++;
        }
        sb2.append(valueOf.substring(i12));
        if (i11 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i11]);
            for (int i13 = i11 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}