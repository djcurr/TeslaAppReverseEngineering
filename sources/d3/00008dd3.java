package o8;

import android.content.Context;

/* loaded from: classes.dex */
public class d implements m8.a {
    @Override // m8.a
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean a11 = z8.b.a();
        q8.a.c("getOAID", "isSupported", Boolean.valueOf(a11));
        if (a11) {
            return z8.b.b(context);
        }
        return null;
    }
}