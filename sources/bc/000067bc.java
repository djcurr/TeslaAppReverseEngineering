package eb;

import android.os.Build;

/* loaded from: classes.dex */
public final class a {
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public final boolean b() {
        return Build.VERSION.SDK_INT >= 29;
    }
}