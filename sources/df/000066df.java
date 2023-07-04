package e10;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f24509a = new y();

    /* renamed from: b  reason: collision with root package name */
    public static final u10.c f24510b = new u10.c("kotlin.jvm.JvmField");

    static {
        kotlin.jvm.internal.s.f(u10.b.m(new u10.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl")), "topLevel(FqName(\"kotlin.….ReflectionFactoryImpl\"))");
    }

    private y() {
    }

    public static final String a(String propertyName) {
        kotlin.jvm.internal.s.g(propertyName, "propertyName");
        return e(propertyName) ? propertyName : kotlin.jvm.internal.s.p("get", q20.a.a(propertyName));
    }

    public static final boolean b(String name) {
        boolean H;
        boolean H2;
        kotlin.jvm.internal.s.g(name, "name");
        H = kotlin.text.v.H(name, "get", false, 2, null);
        if (!H) {
            H2 = kotlin.text.v.H(name, "is", false, 2, null);
            if (!H2) {
                return false;
            }
        }
        return true;
    }

    public static final boolean c(String name) {
        boolean H;
        kotlin.jvm.internal.s.g(name, "name");
        H = kotlin.text.v.H(name, "set", false, 2, null);
        return H;
    }

    public static final String d(String propertyName) {
        String a11;
        kotlin.jvm.internal.s.g(propertyName, "propertyName");
        if (e(propertyName)) {
            a11 = propertyName.substring(2);
            kotlin.jvm.internal.s.f(a11, "(this as java.lang.String).substring(startIndex)");
        } else {
            a11 = q20.a.a(propertyName);
        }
        return kotlin.jvm.internal.s.p("set", a11);
    }

    public static final boolean e(String name) {
        boolean H;
        kotlin.jvm.internal.s.g(name, "name");
        H = kotlin.text.v.H(name, "is", false, 2, null);
        if (H && name.length() != 2) {
            char charAt = name.charAt(2);
            return kotlin.jvm.internal.s.i(97, charAt) > 0 || kotlin.jvm.internal.s.i(charAt, 122) > 0;
        }
        return false;
    }
}