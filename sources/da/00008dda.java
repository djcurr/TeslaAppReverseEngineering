package o8;

import android.content.Context;

/* loaded from: classes.dex */
public class i implements m8.a {
    @Override // m8.a
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean b11 = b9.a.b();
        q8.a.c("getOAID", "isSupported", Boolean.valueOf(b11));
        if (b11) {
            return b9.a.c(context);
        }
        return null;
    }
}