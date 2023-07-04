package xr;

import android.view.MotionEvent;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final a f57677a;

    /* renamed from: b  reason: collision with root package name */
    private long f57678b;

    /* renamed from: c  reason: collision with root package name */
    private long f57679c;

    /* renamed from: d  reason: collision with root package name */
    private double f57680d;

    /* renamed from: e  reason: collision with root package name */
    private double f57681e;

    /* renamed from: f  reason: collision with root package name */
    private float f57682f;

    /* renamed from: g  reason: collision with root package name */
    private float f57683g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f57684h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f57685i = new int[2];

    /* loaded from: classes6.dex */
    public interface a {
        void a(m mVar);

        boolean b(m mVar);

        boolean c(m mVar);
    }

    public m(a aVar) {
        this.f57677a = aVar;
    }

    private final void a() {
        if (this.f57684h) {
            this.f57684h = false;
            a aVar = this.f57677a;
            if (aVar == null) {
                return;
            }
            aVar.a(this);
        }
    }

    private final void g(MotionEvent motionEvent) {
        this.f57679c = this.f57678b;
        this.f57678b = motionEvent.getEventTime();
        int findPointerIndex = motionEvent.findPointerIndex(this.f57685i[0]);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.f57685i[1]);
        float x11 = motionEvent.getX(findPointerIndex);
        float y11 = motionEvent.getY(findPointerIndex);
        float x12 = motionEvent.getX(findPointerIndex2);
        float y12 = motionEvent.getY(findPointerIndex2);
        this.f57682f = (x11 + x12) * 0.5f;
        this.f57683g = (y11 + y12) * 0.5f;
        double d11 = -Math.atan2(y12 - y11, x12 - x11);
        double d12 = Double.isNaN(this.f57680d) ? 0.0d : this.f57680d - d11;
        this.f57681e = d12;
        this.f57680d = d11;
        if (d12 > 3.141592653589793d) {
            this.f57681e = d12 - 3.141592653589793d;
        } else if (d12 < -3.141592653589793d) {
            this.f57681e = d12 + 3.141592653589793d;
        }
        double d13 = this.f57681e;
        if (d13 > 1.5707963267948966d) {
            this.f57681e = d13 - 3.141592653589793d;
        } else if (d13 < -1.5707963267948966d) {
            this.f57681e = d13 + 3.141592653589793d;
        }
    }

    public final float b() {
        return this.f57682f;
    }

    public final float c() {
        return this.f57683g;
    }

    public final double d() {
        return this.f57681e;
    }

    public final long e() {
        return this.f57678b - this.f57679c;
    }

    public final boolean f(MotionEvent event) {
        s.g(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f57684h = false;
            this.f57685i[0] = event.getPointerId(event.getActionIndex());
            this.f57685i[1] = -1;
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked != 5) {
                if (actionMasked == 6 && this.f57684h) {
                    int pointerId = event.getPointerId(event.getActionIndex());
                    int[] iArr = this.f57685i;
                    if (pointerId == iArr[0] || pointerId == iArr[1]) {
                        a();
                    }
                }
            } else if (!this.f57684h) {
                this.f57685i[1] = event.getPointerId(event.getActionIndex());
                this.f57684h = true;
                this.f57679c = event.getEventTime();
                this.f57680d = Double.NaN;
                g(event);
                a aVar = this.f57677a;
                if (aVar != null) {
                    aVar.b(this);
                }
            }
        } else if (this.f57684h) {
            g(event);
            a aVar2 = this.f57677a;
            if (aVar2 != null) {
                aVar2.c(this);
            }
        }
        return true;
    }
}