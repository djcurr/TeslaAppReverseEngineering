package wg;

import android.view.MotionEvent;
import android.view.VelocityTracker;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private VelocityTracker f55875a;

    /* renamed from: b  reason: collision with root package name */
    private float f55876b;

    /* renamed from: c  reason: collision with root package name */
    private float f55877c;

    public void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f55875a == null) {
            this.f55875a = VelocityTracker.obtain();
        }
        this.f55875a.addMovement(motionEvent);
        if (action == 1 || action == 3) {
            this.f55875a.computeCurrentVelocity(1);
            this.f55876b = this.f55875a.getXVelocity();
            this.f55877c = this.f55875a.getYVelocity();
            VelocityTracker velocityTracker = this.f55875a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f55875a = null;
            }
        }
    }

    public float b() {
        return this.f55876b;
    }

    public float c() {
        return this.f55877c;
    }
}