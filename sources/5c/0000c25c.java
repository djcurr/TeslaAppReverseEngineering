package ye;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static Object f59454a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static Object f59455b = new b();

    /* loaded from: classes3.dex */
    private static class b {
        private b() {
        }
    }

    /* loaded from: classes3.dex */
    private static class c {
        private c() {
        }
    }

    public static Object a(Object obj, String str) {
        HashMap hashMap = (HashMap) obj;
        if (hashMap.containsKey(str)) {
            Object obj2 = hashMap.get(str);
            return obj2 == null ? b() : obj2;
        }
        return d();
    }

    public static Object b() {
        return f59455b;
    }

    public static void c(Object obj, String str, Object obj2) {
        ((HashMap) obj).put(str, obj2);
    }

    public static Object d() {
        return f59454a;
    }

    public static boolean e(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public static double f(Object obj) {
        return ((Double) obj).doubleValue();
    }

    public static Map<String, Object> g(Object obj) {
        return (HashMap) obj;
    }

    public static String h(Object obj) {
        return (String) obj;
    }

    public static boolean i(Object obj) {
        return obj instanceof Boolean;
    }

    public static boolean j(Object obj) {
        return obj instanceof b;
    }

    public static boolean k(Object obj) {
        return obj instanceof Double;
    }

    public static boolean l(Object obj) {
        return obj instanceof HashMap;
    }

    public static boolean m(Object obj) {
        return obj instanceof String;
    }

    public static boolean n(Object obj) {
        return obj instanceof c;
    }

    public static Object o(boolean z11) {
        return new Boolean(z11);
    }

    public static Object p(double d11) {
        return new Double(d11);
    }

    public static Object q() {
        return new HashMap();
    }

    public static Object r(String str) {
        return str;
    }
}