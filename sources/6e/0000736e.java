package hk;

import android.graphics.Canvas;
import android.os.Build;

/* loaded from: classes3.dex */
public class a {
    public static int a(Canvas canvas, float f11, float f12, float f13, float f14, int i11) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f11, f12, f13, f14, i11);
        }
        return canvas.saveLayerAlpha(f11, f12, f13, f14, i11, 31);
    }
}