package xr;

import android.view.MotionEvent;
import com.swmansion.gesturehandler.GestureHandler;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class j extends GestureHandler<j> {
    @Override // com.swmansion.gesturehandler.GestureHandler
    protected void d0(MotionEvent event) {
        s.g(event, "event");
        if (M() == 0) {
            n();
        }
    }
}