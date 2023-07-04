package xr;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.swmansion.gesturehandler.GestureHandler;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class l extends GestureHandler<l> {
    private double L;
    private double M;
    private ScaleGestureDetector N;
    private float O;
    private float P;
    private final ScaleGestureDetector.OnScaleGestureListener Q = new a();

    /* loaded from: classes6.dex */
    public static final class a implements ScaleGestureDetector.OnScaleGestureListener {
        a() {
            l.this.v0(false);
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            s.g(detector, "detector");
            double O0 = l.this.O0();
            l lVar = l.this;
            lVar.L = lVar.O0() * detector.getScaleFactor();
            long timeDelta = detector.getTimeDelta();
            if (timeDelta > 0) {
                l lVar2 = l.this;
                lVar2.M = (lVar2.O0() - O0) / timeDelta;
            }
            if (Math.abs(l.this.O - detector.getCurrentSpan()) < l.this.P || l.this.M() != 2) {
                return true;
            }
            l.this.i();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            s.g(detector, "detector");
            l.this.O = detector.getCurrentSpan();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector detector) {
            s.g(detector, "detector");
        }
    }

    public final float M0() {
        ScaleGestureDetector scaleGestureDetector = this.N;
        if (scaleGestureDetector == null) {
            return Float.NaN;
        }
        return scaleGestureDetector.getFocusX();
    }

    public final float N0() {
        ScaleGestureDetector scaleGestureDetector = this.N;
        if (scaleGestureDetector == null) {
            return Float.NaN;
        }
        return scaleGestureDetector.getFocusY();
    }

    public final double O0() {
        return this.L;
    }

    public final double P0() {
        return this.M;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    protected void d0(MotionEvent event) {
        s.g(event, "event");
        if (M() == 0) {
            View R = R();
            s.e(R);
            Context context = R.getContext();
            j0();
            this.N = new ScaleGestureDetector(context, this.Q);
            this.P = ViewConfiguration.get(context).getScaledTouchSlop();
            n();
        }
        ScaleGestureDetector scaleGestureDetector = this.N;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(event);
        }
        int pointerCount = event.getPointerCount();
        if (event.getActionMasked() == 6) {
            pointerCount--;
        }
        if (M() == 4 && pointerCount < 2) {
            z();
        } else if (event.getActionMasked() == 1) {
            B();
        }
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    protected void e0() {
        this.N = null;
        j0();
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void j(boolean z11) {
        if (M() != 4) {
            j0();
        }
        super.j(z11);
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void j0() {
        this.M = 0.0d;
        this.L = 1.0d;
    }
}