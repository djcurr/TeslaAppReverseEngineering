package yu;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public class b {
    public static void A(String str, Set<String> set, Context context) {
        at.a.p(str, set, context);
    }

    public static void B(String str, Context context) {
        ct.i.i().t("PUBLIC_KEY_ID", str);
    }

    public static void C(List<String> list, Context context) {
        ct.i.i().t("RECENTLY_SELECTED_VINS", list != null ? TextUtils.join(":", list) : "");
    }

    public static void D(Context context, String str) {
        ct.i.i().t("REMOTE_NOTIFICATION_TOKEN", str);
    }

    public static void E(String str, Context context) {
        ct.i.i().t("SELECTED_PRODUCT", str);
    }

    public static void F(String str, String str2, Context context) {
        ct.i.i().t(str, str2);
    }

    public static void G(String str, String str2, Context context) {
        ct.i.i().t(str, str2);
    }

    public static void H(long j11, String str, Context context) {
        at.a.q(j11, str, context);
    }

    public static void I(Set<String> set, String str, Context context) {
        at.a.r(set, str, context);
    }

    public static String a(Context context) {
        return ct.i.i().g("_ACCOUNT_EMAIL");
    }

    public static String b(Context context) {
        return ct.i.i().g("APP_PREVIOUSLY_LAUNCHED");
    }

    public static String c(Context context) {
        return ct.i.i().g("APP_UUID");
    }

    public static String d(Context context) {
        return ct.i.i().g("_SSO_AUTH_TOKEN");
    }

    public static String e() {
        return "dfcff21a5f";
    }

    public static boolean f(Context context) {
        String g11 = ct.i.i().g("CALENDAR_SYNC_ENABLED");
        return g11 != null && Boolean.parseBoolean(g11);
    }

    public static long g(String str, Context context) {
        return at.a.e(str, context);
    }

    public static String h(Context context) {
        return ct.i.i().g("_KEY_STORE_PASS");
    }

    public static String i(Context context) {
        return ct.i.i().g("LAST_SELECTED_VEHICLE");
    }

    public static String j(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName.replace(' ', CoreConstants.DOT);
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    public static Set<String> k(String str, Context context) {
        return at.a.g(str, context);
    }

    public static String l(Context context) {
        return ct.i.i().g("PUBLIC_KEY_ID");
    }

    public static List<String> m(Context context) {
        String g11 = ct.i.i().g("RECENTLY_SELECTED_VINS");
        if (g11 == null) {
            return new ArrayList();
        }
        return Arrays.asList(TextUtils.split(g11, ":"));
    }

    public static String n(Context context) {
        return ct.i.i().g("REMOTE_NOTIFICATION_TOKEN");
    }

    public static String o(Context context) {
        return ct.i.i().g("SHARED_SELECTED_PRODUCT_DATA");
    }

    public static String p(Context context) {
        return String.format("TeslaApp/%s/%s/android/%s", j(context), e(), Build.VERSION.RELEASE);
    }

    public static String q(String str, Context context) {
        return ct.i.i().g(str);
    }

    public static long r(String str, Context context) {
        return at.a.m(str, context);
    }

    public static Set<String> s(String str, Context context) {
        return at.a.n(str, context);
    }

    public static void t(Context context, String str) {
        ct.i.i().t("_ACCOUNT_EMAIL", str);
    }

    public static void u(Context context, String str) {
        ct.i.i().t("_ACCOUNT_PHONE", str);
    }

    public static void v(Context context, String str) {
        ct.i.i().t("_SSO_AUTH_ID_TOKEN", str);
    }

    public static void w(Context context, String str) {
        ct.i.i().t("_SSO_AUTH_REFRESH_TOKEN", str);
    }

    public static void x(Context context, String str) {
        ct.i.i().t("_ICE_CONFIG", str);
    }

    public static long y(long j11, String str, Context context) {
        return at.a.o(j11, str, context);
    }

    public static void z(String str, Context context) {
        ct.i.i().t("_KEY_STORE_PASS", str);
    }
}