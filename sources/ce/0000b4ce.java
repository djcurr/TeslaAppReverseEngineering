package t9;

import android.content.Context;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static c f51759a;

    public c(Context context) {
    }

    public static c b(Context context) {
        if (f51759a == null) {
            f51759a = new c(context);
        }
        return f51759a;
    }

    public static String d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static f f(Context context) {
        try {
            NetworkInfo a11 = u9.b.a(null, context);
            if (a11 != null && a11.getType() == 0) {
                return f.a(a11.getSubtype());
            }
            if (a11 != null && a11.getType() == 1) {
                return f.WIFI;
            }
            return f.NONE;
        } catch (Exception unused) {
            return f.NONE;
        }
    }

    public String a() {
        return "000000000000000";
    }

    public String c() {
        return "000000000000000";
    }

    public String e() {
        return "00:00:00:00:00:00";
    }
}