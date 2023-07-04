package xr;

import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f57674a = new h();

    private h() {
    }

    public final float a(MotionEvent event, boolean z11) {
        s.g(event, "event");
        float rawX = event.getRawX() - event.getX();
        int actionIndex = event.getActionMasked() == 6 ? event.getActionIndex() : -1;
        if (z11) {
            float f11 = BitmapDescriptorFactory.HUE_RED;
            int pointerCount = event.getPointerCount();
            int i11 = 0;
            if (pointerCount > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i11 + 1;
                    if (i11 != actionIndex) {
                        f11 += event.getX(i11) + rawX;
                        i12++;
                    }
                    if (i13 >= pointerCount) {
                        break;
                    }
                    i11 = i13;
                }
                i11 = i12;
            }
            return f11 / i11;
        }
        int pointerCount2 = event.getPointerCount() - 1;
        if (pointerCount2 == actionIndex) {
            pointerCount2--;
        }
        return event.getX(pointerCount2) + rawX;
    }

    public final float b(MotionEvent event, boolean z11) {
        s.g(event, "event");
        float rawY = event.getRawY() - event.getY();
        int actionIndex = event.getActionMasked() == 6 ? event.getActionIndex() : -1;
        if (z11) {
            float f11 = BitmapDescriptorFactory.HUE_RED;
            int pointerCount = event.getPointerCount();
            int i11 = 0;
            if (pointerCount > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i11 + 1;
                    if (i11 != actionIndex) {
                        f11 += event.getY(i11) + rawY;
                        i12++;
                    }
                    if (i13 >= pointerCount) {
                        break;
                    }
                    i11 = i13;
                }
                i11 = i12;
            }
            return f11 / i11;
        }
        int pointerCount2 = event.getPointerCount() - 1;
        if (pointerCount2 == actionIndex) {
            pointerCount2--;
        }
        return event.getY(pointerCount2) + rawY;
    }
}