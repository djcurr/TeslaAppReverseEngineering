package com.lwansbrough.RCTCamera;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class b {
    /* JADX INFO: Access modifiers changed from: protected */
    public static Camera.Area a(MotionEvent motionEvent, int i11, int i12) {
        int findPointerIndex = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
        float x11 = motionEvent.getX(findPointerIndex);
        float y11 = motionEvent.getY(findPointerIndex);
        RectF rectF = new RectF(x11 - 100.0f, y11 - 100.0f, x11 + 100.0f, y11 + 100.0f);
        float f11 = i11;
        float f12 = i12;
        if (rectF.intersect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f11, f12))) {
            RectF rectF2 = new RectF(((rectF.left / f11) * 2000.0f) - 1000.0f, ((rectF.top / f12) * 2000.0f) - 1000.0f, ((rectF.right / f11) * 2000.0f) - 1000.0f, ((rectF.bottom / f12) * 2000.0f) - 1000.0f);
            Rect rect = new Rect();
            rectF2.round(rect);
            return new Camera.Area(rect, 1000);
        }
        throw new RuntimeException("MotionEvent rect does not intersect with SurfaceTexture rect; unable to compute focus area");
    }
}