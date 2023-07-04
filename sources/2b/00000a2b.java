package at;

import android.content.Context;

/* loaded from: classes6.dex */
public class k {
    public static void a(Context context) {
        if ("5".equals(ct.i.i().g("SCHEMA_ID"))) {
            String g11 = ct.i.i().g("_SSO_REFRESH_TOKEN");
            String g12 = ct.i.i().g("_SSO_ID_TOKEN");
            if (g11 == null || g12 == null) {
                return;
            }
            yu.b.w(context, g11);
            yu.b.v(context, g12);
        }
    }
}