package a9;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f356a = false;

    /* renamed from: b  reason: collision with root package name */
    public static String f357b;

    public static String a() {
        c b11 = c.b(c.CANCELED.b());
        return b(b11.b(), b11.a(), "");
    }

    public static String b(int i11, String str, String str2) {
        return "resultStatus={" + i11 + "};memo={" + str + "};result={" + str2 + "}";
    }

    public static void c(String str) {
        f357b = str;
    }

    public static void d(boolean z11) {
        f356a = z11;
    }

    public static String e() {
        c b11 = c.b(c.DOUBLE_REQUEST.b());
        return b(b11.b(), b11.a(), "");
    }

    public static boolean f() {
        return f356a;
    }

    public static String g() {
        return f357b;
    }

    public static String h() {
        c b11 = c.b(c.PARAMS_ERROR.b());
        return b(b11.b(), b11.a(), "");
    }
}