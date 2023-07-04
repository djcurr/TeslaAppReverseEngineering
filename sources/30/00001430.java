package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import java.util.UUID;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static String f10167a = "";

    public static long a(Context context) {
        String a11 = n8.a.a(context, "vkeyid_settings", "update_time_interval");
        if (x9.a.f(a11)) {
            try {
                return Long.parseLong(a11);
            } catch (Exception unused) {
                return CoreConstants.MILLIS_IN_ONE_DAY;
            }
        }
        return CoreConstants.MILLIS_IN_ONE_DAY;
    }

    public static void a(Context context, String str) {
        a(context, "update_time_interval", str);
    }

    public static void a(Context context, String str, long j11) {
        n8.a.b(context, "vkeyid_settings", "vkey_valid" + str, String.valueOf(j11));
    }

    public static void a(Context context, String str, String str2) {
        n8.a.b(context, "vkeyid_settings", str, str2);
    }

    public static void a(Context context, boolean z11) {
        a(context, "log_switch", z11 ? "1" : "0");
    }

    public static String b(Context context) {
        return n8.a.a(context, "vkeyid_settings", "last_apdid_env");
    }

    public static void b(Context context, String str) {
        a(context, "last_machine_boot_time", str);
    }

    public static void c(Context context, String str) {
        a(context, "last_apdid_env", str);
    }

    public static boolean c(Context context) {
        String a11 = n8.a.a(context, "vkeyid_settings", "log_switch");
        return a11 != null && "1".equals(a11);
    }

    public static String d(Context context) {
        return n8.a.a(context, "vkeyid_settings", "dynamic_key");
    }

    public static void d(Context context, String str) {
        a(context, "agent_switch", str);
    }

    public static String e(Context context) {
        return n8.a.a(context, "vkeyid_settings", "apse_degrade");
    }

    public static void e(Context context, String str) {
        a(context, "dynamic_key", str);
    }

    public static String f(Context context) {
        String str;
        SharedPreferences.Editor edit;
        synchronized (h.class) {
            if (x9.a.c(f10167a)) {
                String a11 = n8.e.a(context, "alipay_vkey_random", "random", "");
                f10167a = a11;
                if (x9.a.c(a11)) {
                    String a12 = w9.b.a(UUID.randomUUID().toString());
                    f10167a = a12;
                    if (a12 != null && (edit = context.getSharedPreferences("alipay_vkey_random", 0).edit()) != null) {
                        edit.putString("random", a12);
                        edit.commit();
                    }
                }
            }
            str = f10167a;
        }
        return str;
    }

    public static void f(Context context, String str) {
        a(context, "webrtc_url", str);
    }

    public static void g(Context context, String str) {
        a(context, "apse_degrade", str);
    }

    public static long h(Context context, String str) {
        try {
            String a11 = n8.a.a(context, "vkeyid_settings", "vkey_valid" + str);
            if (x9.a.c(a11)) {
                return 0L;
            }
            return Long.parseLong(a11);
        } catch (Throwable unused) {
            return 0L;
        }
    }
}