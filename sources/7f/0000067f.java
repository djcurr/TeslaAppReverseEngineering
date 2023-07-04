package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class h {

    /* loaded from: classes.dex */
    private static class a {
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return BitmapDescriptorFactory.HUE_RED;
            }
        }

        public static float c(EdgeEffect edgeEffect, float f11, float f12) {
            try {
                return edgeEffect.onPullDistance(f11, f12);
            } catch (Throwable unused) {
                edgeEffect.onPull(f11, f12);
                return BitmapDescriptorFactory.HUE_RED;
            }
        }
    }

    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        if (r3.a.c()) {
            return a.a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static float b(EdgeEffect edgeEffect) {
        return r3.a.c() ? a.b(edgeEffect) : BitmapDescriptorFactory.HUE_RED;
    }

    public static void c(EdgeEffect edgeEffect, float f11, float f12) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f11, f12);
        } else {
            edgeEffect.onPull(f11);
        }
    }

    public static float d(EdgeEffect edgeEffect, float f11, float f12) {
        if (r3.a.c()) {
            return a.c(edgeEffect, f11, f12);
        }
        c(edgeEffect, f11, f12);
        return f11;
    }
}