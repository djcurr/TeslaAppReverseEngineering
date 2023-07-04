package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* loaded from: classes.dex */
public final class e {
    public static void a(int i11, int i12, int i13, Rect rect, Rect rect2, int i14) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i11, i12, i13, rect, rect2, i14);
        } else {
            Gravity.apply(i11, i12, i13, rect, rect2);
        }
    }

    public static int b(int i11, int i12) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i11, i12) : i11 & (-8388609);
    }
}