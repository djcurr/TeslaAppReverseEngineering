package n8;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a {
    public static String a(Context context, String str, String str2) {
        String a11;
        synchronized (a.class) {
            String str3 = null;
            if (context != null) {
                try {
                    if (!x9.a.c(str) && !x9.a.c(str2)) {
                        try {
                            a11 = e.a(context, str, str2, "");
                        } catch (Throwable unused) {
                        }
                        if (x9.a.c(a11)) {
                            return null;
                        }
                        str3 = w9.c.e(w9.c.a(), a11);
                        return str3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return null;
        }
    }

    public static void b(Context context, String str, String str2, String str3) {
        synchronized (a.class) {
            if (x9.a.c(str) || x9.a.c(str2) || context == null) {
                return;
            }
            try {
                String b11 = w9.c.b(w9.c.a(), str3);
                HashMap hashMap = new HashMap();
                hashMap.put(str2, b11);
                e.b(context, str, hashMap);
            } catch (Throwable unused) {
            }
        }
    }
}