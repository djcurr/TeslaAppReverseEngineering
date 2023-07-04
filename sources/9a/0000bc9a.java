package wf;

/* loaded from: classes3.dex */
public class a {
    public static void a(boolean z11) {
        if (!z11) {
            throw new AssertionError();
        }
    }

    public static void b(boolean z11, String str) {
        if (!z11) {
            throw new AssertionError(str);
        }
    }

    public static <T> T c(T t11) {
        if (t11 != null) {
            return t11;
        }
        throw new AssertionError();
    }

    public static <T> T d(T t11, String str) {
        if (t11 != null) {
            return t11;
        }
        throw new AssertionError(str);
    }

    public static AssertionError e() {
        throw new AssertionError();
    }

    public static <T> T f(T t11) {
        return t11;
    }
}