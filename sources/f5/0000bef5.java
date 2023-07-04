package x3;

import android.graphics.Path;
import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public final class b {
    public static Interpolator a(float f11, float f12, float f13, float f14) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f11, f12, f13, f14);
        }
        return new a(f11, f12, f13, f14);
    }

    public static Interpolator b(Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(path);
        }
        return new a(path);
    }
}