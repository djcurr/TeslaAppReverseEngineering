package cg;

import android.view.View;
import com.facebook.react.uimanager.p;
import com.facebook.yoga.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class a {
    public static float a(int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            return Float.POSITIVE_INFINITY;
        }
        return size;
    }

    public static float b(int i11) {
        return View.MeasureSpec.getMode(i11) == 1073741824 ? View.MeasureSpec.getSize(i11) : BitmapDescriptorFactory.HUE_RED;
    }

    public static n c(float f11, float f12) {
        if (f11 == f12) {
            return n.EXACTLY;
        }
        if (Float.isInfinite(f12)) {
            return n.UNDEFINED;
        }
        return n.AT_MOST;
    }

    public static float d(float f11, float f12) {
        if (f11 == f12) {
            return p.c(f12);
        }
        if (Float.isInfinite(f12)) {
            return Float.POSITIVE_INFINITY;
        }
        return p.c(f12);
    }
}