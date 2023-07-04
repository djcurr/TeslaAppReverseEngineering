package t2;

import android.os.Build;

/* loaded from: classes.dex */
public final class d {
    public static final h a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return new c();
        }
        return new b();
    }
}