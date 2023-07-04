package com.swmansion.gesturehandler;

import android.os.Handler;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import xr.h;

/* loaded from: classes6.dex */
public final class g extends GestureHandler<g> {
    private float T;
    private float U;
    private float V;
    private float W;
    private float X;
    private float Y;
    private Handler Z;

    /* renamed from: a0 */
    private int f21142a0;
    private float L = Float.MIN_VALUE;
    private float M = Float.MIN_VALUE;
    private float N = Float.MIN_VALUE;
    private long O = 500;
    private long P = 200;
    private int Q = 1;
    private int R = 1;
    private int S = 1;

    /* renamed from: b0 */
    private final Runnable f21143b0 = new Runnable() { // from class: xr.n
        {
            com.swmansion.gesturehandler.g.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.swmansion.gesturehandler.g.H0(com.swmansion.gesturehandler.g.this);
        }
    };

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

    public g() {
        v0(true);
    }

    public static /* synthetic */ void H0(g gVar) {
        J0(gVar);
    }

    private final void I0() {
        Handler handler = this.Z;
        if (handler == null) {
            this.Z = new Handler();
        } else {
            s.e(handler);
            handler.removeCallbacksAndMessages(null);
        }
        int i11 = this.f21142a0 + 1;
        this.f21142a0 = i11;
        if (i11 == this.Q && this.S >= this.R) {
            i();
            return;
        }
        Handler handler2 = this.Z;
        s.e(handler2);
        handler2.postDelayed(this.f21143b0, this.P);
    }

    public static final void J0(g this$0) {
        s.g(this$0, "this$0");
        this$0.B();
    }

    private final boolean R0() {
        float f11 = (this.X - this.T) + this.V;
        if ((this.L == Float.MIN_VALUE) || Math.abs(f11) <= this.L) {
            float f12 = (this.Y - this.U) + this.W;
            if ((this.M == Float.MIN_VALUE) || Math.abs(f12) <= this.M) {
                float f13 = (f12 * f12) + (f11 * f11);
                float f14 = this.N;
                return !((f14 > Float.MIN_VALUE ? 1 : (f14 == Float.MIN_VALUE ? 0 : -1)) == 0) && f13 > f14;
            }
            return true;
        }
        return true;
    }

    private final void S0() {
        Handler handler = this.Z;
        if (handler == null) {
            this.Z = new Handler();
        } else {
            s.e(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.Z;
        s.e(handler2);
        handler2.postDelayed(this.f21143b0, this.O);
    }

    public final g K0(long j11) {
        this.P = j11;
        return this;
    }

    public final g L0(float f11) {
        this.N = f11 * f11;
        return this;
    }

    public final g M0(long j11) {
        this.O = j11;
        return this;
    }

    public final g N0(float f11) {
        this.L = f11;
        return this;
    }

    public final g O0(float f11) {
        this.M = f11;
        return this;
    }

    public final g P0(int i11) {
        this.R = i11;
        return this;
    }

    public final g Q0(int i11) {
        this.Q = i11;
        return this;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    protected void c0() {
        Handler handler = this.Z;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    protected void d0(MotionEvent event) {
        s.g(event, "event");
        int M = M();
        int actionMasked = event.getActionMasked();
        if (M == 0) {
            this.V = BitmapDescriptorFactory.HUE_RED;
            this.W = BitmapDescriptorFactory.HUE_RED;
            this.T = event.getRawX();
            this.U = event.getRawY();
        }
        if (actionMasked != 5 && actionMasked != 6) {
            h hVar = h.f57674a;
            this.X = hVar.a(event, true);
            this.Y = hVar.b(event, true);
        } else {
            this.V += this.X - this.T;
            this.W += this.Y - this.U;
            h hVar2 = h.f57674a;
            this.X = hVar2.a(event, true);
            float b11 = hVar2.b(event, true);
            this.Y = b11;
            this.T = this.X;
            this.U = b11;
        }
        if (this.S < event.getPointerCount()) {
            this.S = event.getPointerCount();
        }
        if (R0()) {
            B();
        } else if (M == 0) {
            if (actionMasked == 0) {
                n();
            }
            S0();
        } else if (M == 2) {
            if (actionMasked == 0) {
                S0();
            } else if (actionMasked != 1) {
            } else {
                I0();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    protected void e0() {
        this.f21142a0 = 0;
        this.S = 0;
        Handler handler = this.Z;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void i0() {
        super.i0();
        this.L = Float.MIN_VALUE;
        this.M = Float.MIN_VALUE;
        this.N = Float.MIN_VALUE;
        this.O = 500L;
        this.P = 200L;
        this.Q = 1;
        this.R = 1;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void j(boolean z11) {
        super.j(z11);
        z();
    }
}