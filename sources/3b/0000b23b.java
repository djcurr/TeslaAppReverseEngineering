package s9;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.stripe.android.networking.FraudDetectionData;
import java.util.Random;
import org.json.JSONObject;
import t9.e;

/* loaded from: classes.dex */
public class a {

    /* renamed from: g  reason: collision with root package name */
    public static Context f50315g;

    /* renamed from: h  reason: collision with root package name */
    public static a f50316h;

    /* renamed from: a  reason: collision with root package name */
    public String f50317a;

    /* renamed from: b  reason: collision with root package name */
    public String f50318b;

    /* renamed from: c  reason: collision with root package name */
    public long f50319c;

    /* renamed from: d  reason: collision with root package name */
    public String f50320d;

    /* renamed from: e  reason: collision with root package name */
    public String f50321e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f50322f = false;

    /* renamed from: s9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C1117a {
        public static String a() {
            String str;
            try {
                str = a.f50315g.getApplicationContext().getPackageName();
            } catch (Throwable th2) {
                e.d(th2);
                str = "";
            }
            return (str + "0000000000000000000000000000").substring(0, 24);
        }

        public static String b(String str, String str2, boolean z11) {
            if (a.f50315g == null) {
                return null;
            }
            String string = a.f50315g.getSharedPreferences(str, 0).getString(str2, null);
            if (!TextUtils.isEmpty(string) && z11) {
                string = i9.e.a(a(), string, string);
                if (TextUtils.isEmpty(string)) {
                    e.f("mspl", "tid_str: pref failed");
                }
            }
            e.f("mspl", "tid_str: from local");
            return string;
        }

        public static void c(String str, String str2, String str3, boolean z11) {
            if (a.f50315g == null) {
                return;
            }
            SharedPreferences sharedPreferences = a.f50315g.getSharedPreferences(str, 0);
            if (z11) {
                String a11 = a();
                String c11 = i9.e.c(a11, str3, str3);
                if (TextUtils.isEmpty(c11)) {
                    String.format("LocalPreference::putLocalPreferences failed %s，%s", str3, a11);
                }
                str3 = c11;
            }
            sharedPreferences.edit().putString(str2, str3).apply();
        }

        public static void d(String str, String str2) {
            if (a.f50315g == null) {
                return;
            }
            a.f50315g.getSharedPreferences(str, 0).edit().remove(str2).apply();
        }
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (f50316h == null) {
                f50316h = new a();
            }
            if (f50315g == null) {
                f50316h.e(context);
            }
            aVar = f50316h;
        }
        return aVar;
    }

    private boolean c(String str, String str2, String str3, String str4) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4);
    }

    private void e(Context context) {
        if (context != null) {
            f50315g = context.getApplicationContext();
        }
        if (this.f50322f) {
            return;
        }
        this.f50322f = true;
        j();
    }

    private String i() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        return hexString + (random.nextInt(9000) + 1000);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j() {
        /*
            r9 = this;
            java.lang.String r0 = ""
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            java.lang.String r3 = "alipay_tid_storage"
            java.lang.String r4 = "tidinfo"
            r5 = 1
            java.lang.String r3 = s9.a.C1117a.b(r3, r4, r5)     // Catch: java.lang.Exception -> L52
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L52
            if (r4 != 0) goto L4e
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L52
            r4.<init>(r3)     // Catch: java.lang.Exception -> L52
            java.lang.String r3 = "tid"
            java.lang.String r3 = r4.optString(r3, r0)     // Catch: java.lang.Exception -> L52
            java.lang.String r5 = "client_key"
            java.lang.String r5 = r4.optString(r5, r0)     // Catch: java.lang.Exception -> L4b
            java.lang.String r6 = "timestamp"
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L48
            long r6 = r4.optLong(r6, r7)     // Catch: java.lang.Exception -> L48
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Exception -> L48
            java.lang.String r6 = "vimei"
            java.lang.String r6 = r4.optString(r6, r0)     // Catch: java.lang.Exception -> L48
            java.lang.String r7 = "vimsi"
            java.lang.String r2 = r4.optString(r7, r0)     // Catch: java.lang.Exception -> L46
            goto L59
        L46:
            r0 = move-exception
            goto L56
        L48:
            r0 = move-exception
            r6 = r2
            goto L56
        L4b:
            r0 = move-exception
            r5 = r2
            goto L55
        L4e:
            r0 = r2
            r5 = r0
            r6 = r5
            goto L5b
        L52:
            r0 = move-exception
            r3 = r2
            r5 = r3
        L55:
            r6 = r5
        L56:
            t9.e.d(r0)
        L59:
            r0 = r2
            r2 = r3
        L5b:
            java.lang.String r3 = "mspl"
            java.lang.String r4 = "tid_str: load"
            t9.e.f(r3, r4)
            boolean r3 = r9.c(r2, r5, r6, r0)
            if (r3 == 0) goto L6c
            r9.k()
            goto L7a
        L6c:
            r9.f50317a = r2
            r9.f50318b = r5
            long r1 = r1.longValue()
            r9.f50319c = r1
            r9.f50320d = r6
            r9.f50321e = r0
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.a.j():void");
    }

    private void k() {
        this.f50317a = "";
        this.f50318b = d();
        this.f50319c = System.currentTimeMillis();
        this.f50320d = i();
        this.f50321e = i();
        C1117a.d("alipay_tid_storage", "tidinfo");
    }

    private void l() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", this.f50317a);
            jSONObject.put("client_key", this.f50318b);
            jSONObject.put(FraudDetectionData.KEY_TIMESTAMP, this.f50319c);
            jSONObject.put("vimei", this.f50320d);
            jSONObject.put("vimsi", this.f50321e);
            C1117a.c("alipay_tid_storage", "tidinfo", jSONObject.toString(), true);
        } catch (Exception e11) {
            e.d(e11);
        }
    }

    private void m() {
    }

    public void b(String str, String str2) {
        e.f("mspl", "tid_str: save");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f50317a = str;
        this.f50318b = str2;
        this.f50319c = System.currentTimeMillis();
        l();
        m();
    }

    public String d() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        return hexString.length() > 10 ? hexString.substring(hexString.length() - 10) : hexString;
    }

    public String f() {
        return this.f50318b;
    }

    public String g() {
        return this.f50317a;
    }
}