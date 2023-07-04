package com.alipay.apmobilesecuritysdk.f;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;
import n8.e;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public static String a(Context context, String str, String str2) {
        String a11;
        if (context == null || x9.a.c(str)) {
            return null;
        }
        if (!x9.a.c(str2)) {
            try {
                a11 = e.a(context, str, str2, "");
                if (x9.a.c(a11)) {
                    return null;
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return w9.c.e(w9.c.a(), a11);
    }

    public static String a(String str, String str2) {
        synchronized (a.class) {
            if (x9.a.c(str) || x9.a.c(str2)) {
                return null;
            }
            String a11 = n8.b.a(str);
            if (x9.a.c(a11)) {
                return null;
            }
            String string = new JSONObject(a11).getString(str2);
            if (x9.a.c(string)) {
                return null;
            }
            return w9.c.e(w9.c.a(), string);
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (!x9.a.c(str) && !x9.a.c(str2) && context != null) {
            try {
                String b11 = w9.c.b(w9.c.a(), str3);
                HashMap hashMap = new HashMap();
                hashMap.put(str2, b11);
                e.b(context, str, hashMap);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str, String str2, String str3) {
        synchronized (a.class) {
            if (x9.a.c(str) || x9.a.c(str2)) {
                return;
            }
            try {
                String a11 = n8.b.a(str);
                JSONObject jSONObject = new JSONObject();
                if (x9.a.f(a11)) {
                    try {
                        jSONObject = new JSONObject(a11);
                    } catch (Exception unused) {
                        jSONObject = new JSONObject();
                    }
                }
                jSONObject.put(str2, w9.c.b(w9.c.a(), str3));
                jSONObject.toString();
                try {
                    System.clearProperty(str);
                } catch (Throwable unused2) {
                }
                if (n8.c.b()) {
                    String str4 = ".SystemConfig" + File.separator + str;
                    if (n8.c.b()) {
                        File file = new File(Environment.getExternalStorageDirectory(), str4);
                        if (file.exists() && file.isFile()) {
                            file.delete();
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        }
    }
}