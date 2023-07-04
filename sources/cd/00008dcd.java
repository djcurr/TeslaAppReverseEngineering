package o8;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class a {
    public static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static m8.a b(Context context) {
        String str = Build.BRAND;
        q8.a.c("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.equalsIgnoreCase("huawei") && !str.equalsIgnoreCase("honor") && !str.equalsIgnoreCase("华为")) {
            if (!str.equalsIgnoreCase("xiaomi") && !str.equalsIgnoreCase("redmi") && !str.equalsIgnoreCase("meitu") && !str.equalsIgnoreCase("小米") && !str.equalsIgnoreCase("blackshark")) {
                if (str.equalsIgnoreCase("vivo")) {
                    return new h();
                }
                if (!str.equalsIgnoreCase("oppo") && !str.equalsIgnoreCase("oneplus") && !str.equalsIgnoreCase("realme")) {
                    if (!str.equalsIgnoreCase("lenovo") && !str.equalsIgnoreCase("zuk")) {
                        if (str.equalsIgnoreCase("nubia")) {
                            return new e();
                        }
                        if (str.equalsIgnoreCase("samsung")) {
                            return new g();
                        }
                        if (c()) {
                            return new b();
                        }
                        if (str.equalsIgnoreCase("meizu") || str.equalsIgnoreCase("mblu")) {
                            return new d();
                        }
                        return null;
                    }
                    return new c();
                }
                return new f();
            }
            return new i();
        }
        return new b();
    }

    public static boolean c() {
        return (TextUtils.isEmpty(a("ro.build.version.emui")) && TextUtils.isEmpty(a("hw_sc.build.platform.version"))) ? false : true;
    }
}