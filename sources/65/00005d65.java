package com.swmansion.gesturehandler;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class b extends GestureHandler<b> {
    private long L;
    private final float M;
    private float N;
    private float O;
    private float P;
    private long Q;
    private long R;
    private Handler S;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public b(Context context) {
        s.g(context, "context");
        this.L = 500L;
        v0(true);
        float f11 = context.getResources().getDisplayMetrics().density * 10.0f;
        this.M = f11;
        this.N = f11;
    }

    public static /* synthetic */ void H0(b bVar) {
        J0(bVar);
    }

    public static final void J0(b this$0) {
        s.g(this$0, "this$0");
        this$0.i();
    }

    public final int I0() {
        return (int) (this.R - this.Q);
    }

    public final b K0(float f11) {
        this.N = f11 * f11;
        return this;
    }

    public final void L0(long j11) {
        this.L = j11;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    protected void d0(MotionEvent event) {
        s.g(event, "event");
        if (M() == 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.R = uptimeMillis;
            this.Q = uptimeMillis;
            n();
            this.O = event.getRawX();
            this.P = event.getRawY();
            Handler handler = new Handler();
            this.S = handler;
            long j11 = this.L;
            if (j11 > 0) {
                s.e(handler);
                handler.postDelayed(new Runnable() { // from class: xr.i
                    {
                        com.swmansion.gesturehandler.b.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.swmansion.gesturehandler.b.H0(com.swmansion.gesturehandler.b.this);
                    }
                }, this.L);
            } else if (j11 == 0) {
                i();
            }
        }
        if (event.getActionMasked() == 1) {
            Handler handler2 = this.S;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                this.S = null;
            }
            if (M() == 4) {
                z();
                return;
            } else {
                B();
                return;
            }
        }
        float rawX = event.getRawX() - this.O;
        float rawY = event.getRawY() - this.P;
        if ((rawX * rawX) + (rawY * rawY) > this.N) {
            if (M() == 4) {
                o();
            } else {
                B();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    protected void f0(int i11, int i12) {
        Handler handler = this.S;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.S = null;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void i0() {
        super.i0();
        this.L = 500L;
        this.N = this.M;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void t(MotionEvent event) {
        s.g(event, "event");
        this.R = SystemClock.uptimeMillis();
        super.t(event);
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void u(int i11, int i12) {
        this.R = SystemClock.uptimeMillis();
        super.u(i11, i12);
    }
}