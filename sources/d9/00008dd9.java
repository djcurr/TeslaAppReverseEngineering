package o8;

import android.content.Context;

/* loaded from: classes.dex */
public class h implements m8.a {
    @Override // m8.a
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean b11 = m9.d.b(context);
        q8.a.c("getOAID", "isSupported", Boolean.valueOf(b11));
        if (b11) {
            return m9.d.a(context);
        }
        return null;
    }
}