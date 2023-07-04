package of;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile InterfaceC0842a f42364a;

    /* renamed from: of.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0842a {
        Runnable a(Runnable runnable, String str);

        boolean b();

        void c(Object obj, Throwable th2);

        Object d(String str);

        Object e(Object obj, String str);

        void f(Object obj);
    }

    public static Runnable a(Runnable runnable, String str) {
        InterfaceC0842a interfaceC0842a = f42364a;
        if (interfaceC0842a == null || runnable == null) {
            return runnable;
        }
        if (str == null) {
            str = "";
        }
        return interfaceC0842a.a(runnable, str);
    }

    public static boolean b() {
        InterfaceC0842a interfaceC0842a = f42364a;
        if (interfaceC0842a == null) {
            return false;
        }
        return interfaceC0842a.b();
    }

    public static void c(Object obj, Throwable th2) {
        InterfaceC0842a interfaceC0842a = f42364a;
        if (interfaceC0842a == null || obj == null) {
            return;
        }
        interfaceC0842a.c(obj, th2);
    }

    public static Object d(String str) {
        InterfaceC0842a interfaceC0842a = f42364a;
        if (interfaceC0842a == null || str == null) {
            return null;
        }
        return interfaceC0842a.d(str);
    }

    public static Object e(Object obj, String str) {
        InterfaceC0842a interfaceC0842a = f42364a;
        if (interfaceC0842a == null || obj == null) {
            return null;
        }
        return interfaceC0842a.e(obj, str);
    }

    public static void f(Object obj) {
        InterfaceC0842a interfaceC0842a = f42364a;
        if (interfaceC0842a == null || obj == null) {
            return;
        }
        interfaceC0842a.f(obj);
    }
}