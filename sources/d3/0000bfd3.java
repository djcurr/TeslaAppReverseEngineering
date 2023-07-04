package xr;

import android.view.MotionEvent;
import com.swmansion.gesturehandler.GestureHandler;

/* loaded from: classes6.dex */
public interface k {
    <T extends GestureHandler<T>> void a(T t11, int i11, int i12);

    <T extends GestureHandler<T>> void b(T t11);

    <T extends GestureHandler<T>> void c(T t11, MotionEvent motionEvent);
}