package uk;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f53537a;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f53538b;

    /* renamed from: c  reason: collision with root package name */
    static final String f53539c;

    static {
        f53537a = Build.VERSION.SDK_INT >= 21;
        f53538b = new int[]{16842910, 16842919};
        f53539c = b.class.getSimpleName();
    }

    private b() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 22 && i11 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f53538b, 0)) != 0) {
                Log.w(f53539c, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean b(int[] iArr) {
        boolean z11 = false;
        boolean z12 = false;
        for (int i11 : iArr) {
            if (i11 == 16842910) {
                z11 = true;
            } else if (i11 == 16842908 || i11 == 16842919 || i11 == 16843623) {
                z12 = true;
            }
        }
        return z11 && z12;
    }
}