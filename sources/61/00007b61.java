package j9;

import android.content.Context;

/* loaded from: classes.dex */
public class a {
    public static String a(Context context) {
        b c11 = c.c(context);
        return (c11 == null || f9.f.b(c11.g())) ? "ffffffffffffffffffffffff" : c11.g();
    }

    @Deprecated
    public static String b(Context context) {
        return a(context);
    }
}