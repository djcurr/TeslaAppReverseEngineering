package x70;

/* loaded from: classes5.dex */
public final class a {
    public static <T> T a(String str, T t11, boolean z11) {
        if (z11) {
            return t11;
        }
        throw new IllegalArgumentException("state should be: " + str);
    }

    public static void b(String str, boolean z11) {
        if (z11) {
            return;
        }
        throw new IllegalArgumentException("state should be: " + str);
    }

    public static <T> T c(String str, T t11) {
        if (t11 != null) {
            return t11;
        }
        throw new IllegalArgumentException(str + " can not be null");
    }
}