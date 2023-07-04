package l8;

import android.os.Build;
import com.adyen.checkout.components.model.payments.response.SdkAction;
import java.io.File;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static e f37111a = new e();

    public static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public static e b() {
        return f37111a;
    }

    public static String c() {
        return "android";
    }

    public static boolean d() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i11 = 0; i11 < 5; i11++) {
            try {
                if (new File(strArr[i11] + "su").exists()) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean e() {
        try {
            if (!Build.HARDWARE.contains("goldfish") && !Build.PRODUCT.contains(SdkAction.ACTION_TYPE)) {
                if (!Build.FINGERPRINT.contains("generic")) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String f() {
        return Build.BOARD;
    }

    public static String g() {
        return Build.BRAND;
    }

    public static String h() {
        return Build.DEVICE;
    }

    public static String i() {
        return Build.DISPLAY;
    }

    public static String j() {
        return Build.VERSION.INCREMENTAL;
    }

    public static String k() {
        return Build.MANUFACTURER;
    }

    public static String l() {
        return Build.MODEL;
    }

    public static String m() {
        return Build.PRODUCT;
    }

    public static String n() {
        return Build.VERSION.RELEASE;
    }

    public static String o() {
        return Build.VERSION.SDK;
    }

    public static String p() {
        return Build.TAGS;
    }

    public static String q() {
        return a("ro.kernel.qemu", "0");
    }
}