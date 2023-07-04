package c9;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import t9.i;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0175a {
        public static synchronized int a(Context context, String str) {
            synchronized (C0175a.class) {
                t9.e.f("RecordPref", "stat remove " + str);
                if (context != null && !TextUtils.isEmpty(str)) {
                    C0176a b11 = b(context);
                    if (b11.f9019a.isEmpty()) {
                        return 0;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<String, String> entry : b11.f9019a.entrySet()) {
                        if (str.equals(entry.getValue())) {
                            arrayList.add(entry.getKey());
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        b11.f9019a.remove((String) it2.next());
                    }
                    d(context, b11);
                    return arrayList.size();
                }
                return 0;
            }
        }

        public static synchronized C0176a b(Context context) {
            synchronized (C0175a.class) {
                try {
                    String b11 = i.b(null, context, "alipay_cashier_statistic_record", null);
                    if (TextUtils.isEmpty(b11)) {
                        return new C0176a();
                    }
                    return new C0176a(b11);
                } catch (Throwable th2) {
                    t9.e.d(th2);
                    return new C0176a();
                }
            }
        }

        public static synchronized String c(Context context, String str, String str2) {
            synchronized (C0175a.class) {
                t9.e.f("RecordPref", "stat append " + str2 + " , " + str);
                if (context != null && !TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(str2)) {
                        str2 = UUID.randomUUID().toString();
                    }
                    C0176a b11 = b(context);
                    if (b11.f9019a.size() > 20) {
                        b11.f9019a.clear();
                    }
                    b11.f9019a.put(str2, str);
                    d(context, b11);
                    return str2;
                }
                return null;
            }
        }

        public static synchronized void d(Context context, C0176a c0176a) {
            synchronized (C0175a.class) {
                if (c0176a == null) {
                    try {
                        c0176a = new C0176a();
                    } catch (Throwable th2) {
                        t9.e.d(th2);
                    }
                }
                i.c(null, context, "alipay_cashier_statistic_record", c0176a.a());
            }
        }

        public static synchronized String e(Context context) {
            synchronized (C0175a.class) {
                t9.e.f("RecordPref", "stat peek");
                if (context == null) {
                    return null;
                }
                C0176a b11 = b(context);
                if (b11.f9019a.isEmpty()) {
                    return null;
                }
                return b11.f9019a.entrySet().iterator().next().getValue();
            }
        }

        /* renamed from: c9.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0176a {

            /* renamed from: a  reason: collision with root package name */
            public final LinkedHashMap<String, String> f9019a = new LinkedHashMap<>();

            public C0176a() {
            }

            public String a() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, String> entry : this.f9019a.entrySet()) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(entry.getKey()).put(entry.getValue());
                        jSONArray.put(jSONArray2);
                    }
                    return jSONArray.toString();
                } catch (Throwable th2) {
                    t9.e.d(th2);
                    return new JSONArray().toString();
                }
            }

            public C0176a(String str) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i11);
                        this.f9019a.put(jSONArray2.getString(0), jSONArray2.getString(1));
                    }
                } catch (Throwable th2) {
                    t9.e.d(th2);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c9.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class RunnableC0177a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f9020a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Context f9021b;

            public RunnableC0177a(String str, Context context) {
                this.f9020a = str;
                this.f9021b = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(this.f9020a) || b.d(this.f9021b, this.f9020a)) {
                    for (int i11 = 0; i11 < 4; i11++) {
                        String e11 = C0175a.e(this.f9021b);
                        if (TextUtils.isEmpty(e11) || !b.d(this.f9021b, e11)) {
                            return;
                        }
                    }
                }
            }
        }

        public static synchronized void a(Context context, c9.b bVar, String str, String str2) {
            synchronized (b.class) {
                if (context == null || bVar == null || str == null) {
                    return;
                }
                b(context, bVar.e(str), str2);
            }
        }

        public static synchronized void b(Context context, String str, String str2) {
            synchronized (b.class) {
                if (context == null) {
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    C0175a.c(context, str, str2);
                }
                new Thread(new RunnableC0177a(str, context)).start();
            }
        }

        public static synchronized boolean d(Context context, String str) {
            synchronized (b.class) {
                t9.e.f("mspl", "stat sub " + str);
                if ((g9.a.d().r() ? new n9.c() : new n9.d()).g(null, context, str) != null) {
                    C0175a.a(context, str);
                    return true;
                }
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static synchronized long a(Context context) {
            long a11;
            synchronized (c.class) {
                a11 = d.a(context, "alipay_cashier_ap_seq_v");
            }
            return a11;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        /* JADX WARN: Can't wrap try/catch for region: R(8:3|(2:4|5)|(5:7|8|9|10|11)|17|8|9|10|11) */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static synchronized long a(android.content.Context r6, java.lang.String r7) {
            /*
                java.lang.Class<c9.a$d> r0 = c9.a.d.class
                monitor-enter(r0)
                r1 = 0
                java.lang.String r2 = t9.i.b(r1, r6, r7, r1)     // Catch: java.lang.Throwable -> L13
                boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L13
                if (r3 != 0) goto L13
                long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r2 = 0
            L15:
                r4 = 1
                long r2 = r2 + r4
                java.lang.String r4 = java.lang.Long.toString(r2)     // Catch: java.lang.Throwable -> L1f
                t9.i.c(r1, r6, r7, r4)     // Catch: java.lang.Throwable -> L1f
            L1f:
                monitor-exit(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: c9.a.d.a(android.content.Context, java.lang.String):long");
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public static synchronized long a(Context context) {
            long a11;
            synchronized (e.class) {
                a11 = d.a(context, "alipay_cashier_statistic_v");
            }
            return a11;
        }
    }

    public static synchronized void a(Context context, r9.a aVar, String str, String str2) {
        synchronized (a.class) {
            if (context == null || aVar == null) {
                return;
            }
            try {
                C0175a.c(context, aVar.f49324l.e(str), str2);
            } catch (Throwable th2) {
                t9.e.d(th2);
            }
        }
    }

    public static void b(r9.a aVar, String str, String str2) {
        if (aVar == null) {
            return;
        }
        aVar.f49324l.g(str, str2);
    }

    public static void c(r9.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.f49324l.h(str, str2, str3);
    }

    public static void d(r9.a aVar, String str, String str2, Throwable th2) {
        if (aVar == null) {
            return;
        }
        aVar.f49324l.i(str, str2, th2);
    }

    public static void e(r9.a aVar, String str, String str2, Throwable th2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.f49324l.j(str, str2, th2, str3);
    }

    public static void f(r9.a aVar, String str, Throwable th2) {
        if (aVar == null || th2 == null) {
            return;
        }
        aVar.f49324l.i(str, th2.getClass().getSimpleName(), th2);
    }

    public static synchronized void g(Context context, r9.a aVar, String str, String str2) {
        synchronized (a.class) {
            if (context == null || aVar == null) {
                return;
            }
            b.a(context, aVar.f49324l, str, str2);
        }
    }

    public static void h(r9.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.f49324l.n(str, str2, str3);
    }
}