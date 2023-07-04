package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class h {
    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginEnd();
        }
        return marginLayoutParams.rightMargin;
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginStart();
        }
        return marginLayoutParams.leftMargin;
    }

    public static void c(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginEnd(i11);
        } else {
            marginLayoutParams.rightMargin = i11;
        }
    }

    public static void d(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(i11);
        } else {
            marginLayoutParams.leftMargin = i11;
        }
    }
}