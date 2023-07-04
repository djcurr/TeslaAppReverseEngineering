package nd;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static c f40777a = b.g();

    public static void A(Class<?> cls, String str, Object... objArr) {
        if (f40777a.f(2)) {
            f40777a.v(n(cls), m(str, objArr));
        }
    }

    public static void B(String str, String str2, Object... objArr) {
        if (f40777a.f(2)) {
            f40777a.v(str, m(str2, objArr));
        }
    }

    public static void C(Class<?> cls, String str) {
        if (f40777a.f(5)) {
            f40777a.w(n(cls), str);
        }
    }

    public static void D(Class<?> cls, String str, Throwable th2) {
        if (f40777a.f(5)) {
            f40777a.d(n(cls), str, th2);
        }
    }

    public static void E(Class<?> cls, String str, Object... objArr) {
        if (f40777a.f(5)) {
            f40777a.w(n(cls), m(str, objArr));
        }
    }

    public static void F(Class<?> cls, Throwable th2, String str, Object... objArr) {
        if (u(5)) {
            D(cls, m(str, objArr), th2);
        }
    }

    public static void G(String str, String str2) {
        if (f40777a.f(5)) {
            f40777a.w(str, str2);
        }
    }

    public static void H(String str, String str2, Throwable th2) {
        if (f40777a.f(5)) {
            f40777a.d(str, str2, th2);
        }
    }

    public static void I(String str, String str2, Object... objArr) {
        if (f40777a.f(5)) {
            f40777a.w(str, m(str2, objArr));
        }
    }

    public static void J(String str, Throwable th2, String str2, Object... objArr) {
        if (f40777a.f(5)) {
            f40777a.d(str, m(str2, objArr), th2);
        }
    }

    public static void K(Class<?> cls, String str, Throwable th2) {
        if (f40777a.f(6)) {
            f40777a.c(n(cls), str, th2);
        }
    }

    public static void L(String str, String str2) {
        if (f40777a.f(6)) {
            f40777a.a(str, str2);
        }
    }

    public static void M(String str, String str2, Throwable th2) {
        if (f40777a.f(6)) {
            f40777a.c(str, str2, th2);
        }
    }

    public static void N(String str, String str2, Object... objArr) {
        if (f40777a.f(6)) {
            f40777a.a(str, m(str2, objArr));
        }
    }

    public static void a(Class<?> cls, String str, Object obj) {
        if (f40777a.f(3)) {
            f40777a.d(n(cls), m(str, obj));
        }
    }

    public static void b(String str, String str2) {
        if (f40777a.f(3)) {
            f40777a.d(str, str2);
        }
    }

    public static void c(String str, String str2, Object obj) {
        if (f40777a.f(3)) {
            f40777a.d(str, m(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        if (f40777a.f(3)) {
            f40777a.d(str, m(str2, obj, obj2));
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        if (f40777a.f(3)) {
            f40777a.b(str, str2, th2);
        }
    }

    public static void f(Class<?> cls, String str) {
        if (f40777a.f(6)) {
            f40777a.e(n(cls), str);
        }
    }

    public static void g(Class<?> cls, String str, Throwable th2) {
        if (f40777a.f(6)) {
            f40777a.e(n(cls), str, th2);
        }
    }

    public static void h(Class<?> cls, String str, Object... objArr) {
        if (f40777a.f(6)) {
            f40777a.e(n(cls), m(str, objArr));
        }
    }

    public static void i(Class<?> cls, Throwable th2, String str, Object... objArr) {
        if (f40777a.f(6)) {
            f40777a.e(n(cls), m(str, objArr), th2);
        }
    }

    public static void j(String str, String str2) {
        if (f40777a.f(6)) {
            f40777a.e(str, str2);
        }
    }

    public static void k(String str, String str2, Throwable th2) {
        if (f40777a.f(6)) {
            f40777a.e(str, str2, th2);
        }
    }

    public static void l(String str, String str2, Object... objArr) {
        if (f40777a.f(6)) {
            f40777a.e(str, m(str2, objArr));
        }
    }

    private static String m(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    private static String n(Class<?> cls) {
        return cls.getSimpleName();
    }

    public static void o(String str, String str2) {
        if (f40777a.f(4)) {
            f40777a.i(str, str2);
        }
    }

    public static void p(String str, String str2, Object obj) {
        if (f40777a.f(4)) {
            f40777a.i(str, m(str2, obj));
        }
    }

    public static void q(String str, String str2, Object obj, Object obj2) {
        if (f40777a.f(4)) {
            f40777a.i(str, m(str2, obj, obj2));
        }
    }

    public static void r(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (f40777a.f(4)) {
            f40777a.i(str, m(str2, obj, obj2, obj3));
        }
    }

    public static void s(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f40777a.f(4)) {
            f40777a.i(str, m(str2, obj, obj2, obj3, obj4));
        }
    }

    public static void t(String str, String str2, Object... objArr) {
        if (f40777a.f(4)) {
            f40777a.i(str, m(str2, objArr));
        }
    }

    public static boolean u(int i11) {
        return f40777a.f(i11);
    }

    public static void v(Class<?> cls, String str) {
        if (f40777a.f(2)) {
            f40777a.v(n(cls), str);
        }
    }

    public static void w(Class<?> cls, String str, Object obj) {
        if (f40777a.f(2)) {
            f40777a.v(n(cls), m(str, obj));
        }
    }

    public static void x(Class<?> cls, String str, Object obj, Object obj2) {
        if (f40777a.f(2)) {
            f40777a.v(n(cls), m(str, obj, obj2));
        }
    }

    public static void y(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (u(2)) {
            v(cls, m(str, obj, obj2, obj3));
        }
    }

    public static void z(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f40777a.f(2)) {
            f40777a.v(n(cls), m(str, obj, obj2, obj3, obj4));
        }
    }
}