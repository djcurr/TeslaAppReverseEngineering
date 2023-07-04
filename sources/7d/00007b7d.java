package je;

import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public class e {
    public static void a(Drawable drawable, Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static int b(int i11) {
        int i12 = i11 >>> 24;
        if (i12 == 255) {
            return -1;
        }
        return i12 == 0 ? -2 : -3;
    }

    public static int c(int i11, int i12) {
        if (i12 == 255) {
            return i11;
        }
        if (i12 == 0) {
            return i11 & 16777215;
        }
        return (i11 & 16777215) | ((((i11 >>> 24) * (i12 + (i12 >> 7))) >> 8) << 24);
    }

    public static void d(Drawable drawable, Drawable.Callback callback, s sVar) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof r) {
                ((r) drawable).k(sVar);
            }
        }
    }

    public static void e(Drawable drawable, d dVar) {
        if (drawable == null || dVar == null) {
            return;
        }
        dVar.a(drawable);
    }
}