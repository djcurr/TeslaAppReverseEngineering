package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class g {
    public static synchronized String a(Context context, String str) {
        synchronized (g.class) {
            String a11 = n8.e.a(context, "openapi_file_pri", "openApi" + str, "");
            if (x9.a.c(a11)) {
                return "";
            }
            String e11 = w9.c.e(w9.c.a(), a11);
            return x9.a.c(e11) ? "" : e11;
        }
    }

    public static synchronized void a() {
        synchronized (g.class) {
        }
    }

    public static synchronized void a(Context context) {
        synchronized (g.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("openapi_file_pri", 0).edit();
            if (edit != null) {
                edit.clear();
                edit.commit();
            }
        }
    }

    public static synchronized void a(Context context, String str, String str2) {
        synchronized (g.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("openapi_file_pri", 0).edit();
                if (edit != null) {
                    edit.putString("openApi" + str, w9.c.b(w9.c.a(), str2));
                    edit.commit();
                }
            } catch (Throwable unused) {
            }
        }
    }
}