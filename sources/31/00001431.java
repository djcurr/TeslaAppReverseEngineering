package com.alipay.apmobilesecuritysdk.e;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static String f10168a = "";

    /* renamed from: b  reason: collision with root package name */
    public static String f10169b = "";

    /* renamed from: c  reason: collision with root package name */
    public static String f10170c = "";

    /* renamed from: d  reason: collision with root package name */
    public static String f10171d = "";

    /* renamed from: e  reason: collision with root package name */
    public static String f10172e = "";

    /* renamed from: f  reason: collision with root package name */
    public static Map<String, String> f10173f = new HashMap();

    public static synchronized String a(String str) {
        synchronized (i.class) {
            String str2 = "apdidTokenCache" + str;
            if (f10173f.containsKey(str2)) {
                String str3 = f10173f.get(str2);
                if (x9.a.f(str3)) {
                    return str3;
                }
            }
            return "";
        }
    }

    public static synchronized void a() {
        synchronized (i.class) {
        }
    }

    public static synchronized void a(b bVar) {
        synchronized (i.class) {
            if (bVar != null) {
                f10168a = bVar.f10154a;
                f10169b = bVar.f10155b;
                f10170c = bVar.f10156c;
            }
        }
    }

    public static synchronized void a(c cVar) {
        synchronized (i.class) {
            if (cVar != null) {
                f10168a = cVar.f10157a;
                f10169b = cVar.f10158b;
                f10171d = cVar.f10160d;
                f10172e = cVar.f10161e;
                f10170c = cVar.f10159c;
            }
        }
    }

    public static synchronized void a(String str, String str2) {
        synchronized (i.class) {
            String str3 = "apdidTokenCache" + str;
            if (f10173f.containsKey(str3)) {
                f10173f.remove(str3);
            }
            f10173f.put(str3, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
        if (r1 < 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean a(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Class<com.alipay.apmobilesecuritysdk.e.i> r0 = com.alipay.apmobilesecuritysdk.e.i.class
            monitor-enter(r0)
            long r1 = com.alipay.apmobilesecuritysdk.e.h.a(r5)     // Catch: java.lang.Throwable -> Ld
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L10
        Ld:
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
        L10:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L24
            long r5 = com.alipay.apmobilesecuritysdk.e.h.h(r5, r6)     // Catch: java.lang.Throwable -> L24
            long r3 = r3 - r5
            long r5 = java.lang.Math.abs(r3)     // Catch: java.lang.Throwable -> L24
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 >= 0) goto L28
            r5 = 1
        L22:
            monitor-exit(r0)
            return r5
        L24:
            r5 = move-exception
            com.alipay.apmobilesecuritysdk.c.a.a(r5)     // Catch: java.lang.Throwable -> L2a
        L28:
            r5 = 0
            goto L22
        L2a:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.apmobilesecuritysdk.e.i.a(android.content.Context, java.lang.String):boolean");
    }

    public static synchronized String b() {
        String str;
        synchronized (i.class) {
            str = f10168a;
        }
        return str;
    }

    public static void b(String str) {
        f10168a = str;
    }

    public static synchronized String c() {
        String str;
        synchronized (i.class) {
            str = f10169b;
        }
        return str;
    }

    public static void c(String str) {
        f10169b = str;
    }

    public static synchronized String d() {
        String str;
        synchronized (i.class) {
            str = f10171d;
        }
        return str;
    }

    public static void d(String str) {
        f10170c = str;
    }

    public static synchronized String e() {
        String str;
        synchronized (i.class) {
            str = f10172e;
        }
        return str;
    }

    public static void e(String str) {
        f10171d = str;
    }

    public static synchronized String f() {
        String str;
        synchronized (i.class) {
            str = f10170c;
        }
        return str;
    }

    public static void f(String str) {
        f10172e = str;
    }

    public static synchronized c g() {
        c cVar;
        synchronized (i.class) {
            cVar = new c(f10168a, f10169b, f10170c, f10171d, f10172e);
        }
        return cVar;
    }

    public static void h() {
        f10173f.clear();
        f10168a = "";
        f10169b = "";
        f10171d = "";
        f10172e = "";
        f10170c = "";
    }
}