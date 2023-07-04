package o8;

import android.content.Context;

/* loaded from: classes.dex */
public class f implements m8.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f42320a = false;

    @Override // m8.a
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f42320a) {
            y8.a.c(context);
            this.f42320a = true;
        }
        boolean a11 = y8.a.a();
        q8.a.c("getOAID", "isSupported", Boolean.valueOf(a11));
        if (a11) {
            return y8.a.b(context);
        }
        return null;
    }
}