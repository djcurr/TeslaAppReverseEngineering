package y8;

import android.content.Context;
import k8.b;
import k8.c;

/* loaded from: classes.dex */
public class a {
    public static boolean a() {
        if (b.f34482a) {
            return b.f34483b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String b(Context context) {
        if (b.f34482a) {
            return c.b.f34490a.a(context.getApplicationContext(), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static void c(Context context) {
        b.f34483b = c.b.f34490a.b(context.getApplicationContext());
        b.f34482a = true;
    }
}