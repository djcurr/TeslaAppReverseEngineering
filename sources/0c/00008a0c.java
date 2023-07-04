package n8;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d {
    public static synchronized void a(Context context, String str, String str2, String str3) {
        synchronized (d.class) {
            if (!x9.a.c(str)) {
                if (!x9.a.c(str2) && context != null) {
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
    }
}