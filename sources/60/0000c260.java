package ye;

import android.os.Build;

/* loaded from: classes3.dex */
public class e {
    public static b a() {
        return Build.VERSION.SDK_INT >= 24 ? f.i() : com.facebook.hermes.intl.g.i();
    }

    public static b b(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return f.j(str);
        }
        return com.facebook.hermes.intl.g.j(str);
    }
}