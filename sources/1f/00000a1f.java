package at;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes6.dex */
public class a {
    public static String a(Context context) {
        return g.c().g("ACCOUNT_EMAIL", g.i(context));
    }

    public static String b(Context context) {
        return g.c().g("APP_PREVIOUSLY_LAUNCHED", g.d(context));
    }

    public static String c(Context context) {
        return g.c().g("APP_UUID", g.i(context));
    }

    public static String d(Context context) {
        return g.c().g("OWNERAPI_AUTH_TOKEN", g.i(context));
    }

    public static long e(String str, Context context) {
        return g.c().e(str, g.j(context));
    }

    public static String f(Context context) {
        return g.c().g("KEY_STORE_PASS", g.j(context));
    }

    public static Set<String> g(String str, Context context) {
        return g.c().h(str, g.j(context), Collections.EMPTY_SET);
    }

    public static String h(Context context) {
        return g.c().g("SELECTED_PRODUCT", g.i(context));
    }

    public static String i(Context context) {
        return g.c().g("SELECTED_VIN", g.d(context));
    }

    public static String j(Context context) {
        return g.c().g("SHARED_SELECTED_PRODUCT_DATA", g.i(context));
    }

    public static String k(Context context) {
        return g.c().g("COLORIZED_IMAGE_DIRECTORY_HASH", g.d(context));
    }

    public static String l(String str, Context context) {
        return g.c().g(str, g.j(context));
    }

    public static long m(String str, Context context) {
        return g.c().e(str, g.j(context));
    }

    public static Set<String> n(String str, Context context) {
        return g.c().f(str, g.j(context));
    }

    public static long o(long j11, String str, Context context) {
        return g.c().k(str, j11, g.j(context));
    }

    public static void p(String str, Set<String> set, Context context) {
        g.c().m(str, set, g.j(context));
    }

    public static long q(long j11, String str, Context context) {
        return g.c().k(str, j11, g.j(context));
    }

    public static Set<String> r(Set<String> set, String str, Context context) {
        return g.c().l(str, set, g.j(context));
    }
}