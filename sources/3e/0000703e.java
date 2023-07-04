package g9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.Random;
import t9.c;
import t9.m;

/* loaded from: classes.dex */
public class b {

    /* renamed from: d  reason: collision with root package name */
    public static volatile b f27890d;

    /* renamed from: a  reason: collision with root package name */
    public String f27891a;

    /* renamed from: b  reason: collision with root package name */
    public String f27892b = "sdk-and-lite";

    /* renamed from: c  reason: collision with root package name */
    public String f27893c;

    public b() {
        String a11 = a9.a.a();
        if (a9.a.c()) {
            return;
        }
        this.f27892b += '_' + a11;
    }

    public static String a(Context context) {
        return Float.toString(new TextView(context).getTextSize());
    }

    public static synchronized void c(String str) {
        synchronized (b.class) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            PreferenceManager.getDefaultSharedPreferences(r9.b.e().c()).edit().putString("trideskey", str).apply();
            e9.a.f25022b = str;
        }
    }

    public static synchronized b d() {
        b bVar;
        synchronized (b.class) {
            if (f27890d == null) {
                f27890d = new b();
            }
            bVar = f27890d;
        }
        return bVar;
    }

    public static String e(Context context) {
        if (context != null) {
            try {
                StringBuilder sb2 = new StringBuilder();
                String packageName = context.getPackageName();
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
                sb2.append("(");
                sb2.append(packageName);
                sb2.append(";");
                sb2.append(packageInfo.versionCode);
                sb2.append(")");
                return sb2.toString();
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static String f() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        return hexString + (random.nextInt(9000) + 1000);
    }

    public static String g() {
        return "-1;-1";
    }

    public static String h() {
        return "1";
    }

    public static String i() {
        String a11;
        Context c11 = r9.b.e().c();
        SharedPreferences sharedPreferences = c11.getSharedPreferences("virtualImeiAndImsi", 0);
        String string = sharedPreferences.getString("virtual_imei", null);
        if (TextUtils.isEmpty(string)) {
            if (TextUtils.isEmpty(s9.a.a(c11).g())) {
                a11 = f();
            } else {
                a11 = c.b(c11).a();
            }
            String str = a11;
            sharedPreferences.edit().putString("virtual_imei", str).apply();
            return str;
        }
        return string;
    }

    public static String j() {
        String c11;
        Context c12 = r9.b.e().c();
        SharedPreferences sharedPreferences = c12.getSharedPreferences("virtualImeiAndImsi", 0);
        String string = sharedPreferences.getString("virtual_imsi", null);
        if (TextUtils.isEmpty(string)) {
            if (TextUtils.isEmpty(s9.a.a(c12).g())) {
                String d11 = r9.b.e().d();
                if (!TextUtils.isEmpty(d11) && d11.length() >= 18) {
                    c11 = d11.substring(3, 18);
                } else {
                    c11 = f();
                }
            } else {
                c11 = c.b(c12).c();
            }
            String str = c11;
            sharedPreferences.edit().putString("virtual_imsi", str).apply();
            return str;
        }
        return string;
    }

    public static String k() {
        return "00";
    }

    public static String l() {
        return "-1";
    }

    public String b(r9.a aVar, s9.a aVar2, boolean z11) {
        Context c11 = r9.b.e().c();
        c b11 = c.b(c11);
        if (TextUtils.isEmpty(this.f27891a)) {
            String S = m.S();
            String P = m.P();
            String H = m.H(c11);
            String Q = m.Q(c11);
            String T = m.T(c11);
            String a11 = a(c11);
            this.f27891a = "Msp/15.8.14 (" + S + ";" + P + ";" + H + ";" + Q + ";" + T + ";" + a11;
        }
        String b12 = c.f(c11).b();
        String C = m.C(c11);
        String h11 = h();
        String c12 = b11.c();
        String a12 = b11.a();
        String j11 = j();
        String i11 = i();
        if (aVar2 != null) {
            this.f27893c = aVar2.f();
        }
        String replace = Build.MANUFACTURER.replace(";", " ");
        String replace2 = Build.MODEL.replace(";", " ");
        boolean f11 = r9.b.f();
        String e11 = b11.e();
        String l11 = l();
        String k11 = k();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27891a);
        sb2.append(";");
        sb2.append(b12);
        sb2.append(";");
        sb2.append(C);
        sb2.append(";");
        sb2.append(h11);
        sb2.append(";");
        sb2.append(c12);
        sb2.append(";");
        sb2.append(a12);
        sb2.append(";");
        sb2.append(this.f27893c);
        sb2.append(";");
        sb2.append(replace);
        sb2.append(";");
        sb2.append(replace2);
        sb2.append(";");
        sb2.append(f11);
        sb2.append(";");
        sb2.append(e11);
        sb2.append(";");
        sb2.append(g());
        sb2.append(";");
        sb2.append(this.f27892b);
        sb2.append(";");
        sb2.append(j11);
        sb2.append(";");
        sb2.append(i11);
        sb2.append(";");
        sb2.append(l11);
        sb2.append(";");
        sb2.append(k11);
        if (aVar2 != null) {
            String b13 = u9.b.b(aVar, c11, s9.a.a(c11).g(), u9.b.d(aVar, c11));
            if (!TextUtils.isEmpty(b13)) {
                sb2.append(";;;");
                sb2.append(b13);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}