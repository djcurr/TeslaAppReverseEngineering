package com.swmansion.gesturehandler;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import xr.h;

/* loaded from: classes6.dex */
public final class d extends GestureHandler<d> {

    /* renamed from: k0  reason: collision with root package name */
    public static final a f21130k0 = new a(null);
    private float L;
    private float M;
    private final float N;
    private float O;
    private float P = Float.MAX_VALUE;
    private float Q = Float.MIN_VALUE;
    private float R = Float.MIN_VALUE;
    private float S = Float.MAX_VALUE;
    private float T = Float.MAX_VALUE;
    private float U = Float.MIN_VALUE;
    private float V = Float.MIN_VALUE;
    private float W = Float.MAX_VALUE;
    private float X = Float.MAX_VALUE;
    private float Y = Float.MAX_VALUE;
    private float Z = Float.MAX_VALUE;

    /* renamed from: a0  reason: collision with root package name */
    private int f21131a0 = 1;

    /* renamed from: b0  reason: collision with root package name */
    private int f21132b0 = 10;

    /* renamed from: c0  reason: collision with root package name */
    private float f21133c0;

    /* renamed from: d0  reason: collision with root package name */
    private float f21134d0;

    /* renamed from: e0  reason: collision with root package name */
    private float f21135e0;

    /* renamed from: f0  reason: collision with root package name */
    private float f21136f0;

    /* renamed from: g0  reason: collision with root package name */
    private float f21137g0;

    /* renamed from: h0  reason: collision with root package name */
    private float f21138h0;

    /* renamed from: i0  reason: collision with root package name */
    private VelocityTracker f21139i0;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f21140j0;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(VelocityTracker velocityTracker, MotionEvent motionEvent) {
            float rawX = motionEvent.getRawX() - motionEvent.getX();
            float rawY = motionEvent.getRawY() - motionEvent.getY();
            motionEvent.offsetLocation(rawX, rawY);
            s.e(velocityTracker);
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
        }
    }

    public d(Context context) {
        this.O = Float.MIN_VALUE;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        float f11 = scaledTouchSlop * scaledTouchSlop;
        this.N = f11;
        this.O = f11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x008a, code lost:
        if ((com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED <= r1 && r1 <= r0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ad, code lost:
        if ((com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED <= r3 && r3 <= r0) != false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean a1() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.d.a1():boolean");
    }

    private final boolean b1() {
        float f11 = (this.f21137g0 - this.f21133c0) + this.f21135e0;
        float f12 = this.R;
        if ((f12 == Float.MIN_VALUE) || f11 >= f12) {
            float f13 = this.S;
            if ((f13 == Float.MAX_VALUE) || f11 <= f13) {
                float f14 = (this.f21138h0 - this.f21134d0) + this.f21136f0;
                float f15 = this.V;
                if ((f15 == Float.MIN_VALUE) || f14 >= f15) {
                    float f16 = this.W;
                    return !((f16 > Float.MAX_VALUE ? 1 : (f16 == Float.MAX_VALUE ? 0 : -1)) == 0) && f14 > f16;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final float H0() {
        return (this.f21137g0 - this.f21133c0) + this.f21135e0;
    }

    public final float I0() {
        return (this.f21138h0 - this.f21134d0) + this.f21136f0;
    }

    public final float J0() {
        return this.L;
    }

    public final float K0() {
        return this.M;
    }

    public final d L0(float f11) {
        this.Q = f11;
        return this;
    }

    public final d M0(float f11) {
        this.P = f11;
        return this;
    }

    public final d N0(float f11) {
        this.U = f11;
        return this;
    }

    public final d O0(float f11) {
        this.T = f11;
        return this;
    }

    public final d P0(boolean z11) {
        this.f21140j0 = z11;
        return this;
    }

    public final d Q0(float f11) {
        this.S = f11;
        return this;
    }

    public final d R0(float f11) {
        this.R = f11;
        return this;
    }

    public final d S0(float f11) {
        this.W = f11;
        return this;
    }

    public final d T0(float f11) {
        this.V = f11;
        return this;
    }

    public final d U0(int i11) {
        this.f21132b0 = i11;
        return this;
    }

    public final d V0(float f11) {
        this.O = f11 * f11;
        return this;
    }

    public final d W0(int i11) {
        this.f21131a0 = i11;
        return this;
    }

    public final d X0(float f11) {
        this.Z = f11 * f11;
        return this;
    }

    public final d Y0(float f11) {
        this.X = f11;
        return this;
    }

    public final d Z0(float f11) {
        this.Y = f11;
        return this;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    protected void d0(MotionEvent event) {
        s.g(event, "event");
        int M = M();
        int actionMasked = event.getActionMasked();
        if (actionMasked != 5 && actionMasked != 6) {
            h hVar = h.f57674a;
            this.f21137g0 = hVar.a(event, this.f21140j0);
            this.f21138h0 = hVar.b(event, this.f21140j0);
        } else {
            this.f21135e0 += this.f21137g0 - this.f21133c0;
            this.f21136f0 += this.f21138h0 - this.f21134d0;
            h hVar2 = h.f57674a;
            this.f21137g0 = hVar2.a(event, this.f21140j0);
            float b11 = hVar2.b(event, this.f21140j0);
            this.f21138h0 = b11;
            this.f21133c0 = this.f21137g0;
            this.f21134d0 = b11;
        }
        if (M == 0 && event.getPointerCount() >= this.f21131a0) {
            j0();
            this.f21135e0 = BitmapDescriptorFactory.HUE_RED;
            this.f21136f0 = BitmapDescriptorFactory.HUE_RED;
            this.L = BitmapDescriptorFactory.HUE_RED;
            this.M = BitmapDescriptorFactory.HUE_RED;
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f21139i0 = obtain;
            f21130k0.b(obtain, event);
            n();
        } else {
            VelocityTracker velocityTracker = this.f21139i0;
            if (velocityTracker != null) {
                f21130k0.b(velocityTracker, event);
                VelocityTracker velocityTracker2 = this.f21139i0;
                s.e(velocityTracker2);
                velocityTracker2.computeCurrentVelocity(1000);
                VelocityTracker velocityTracker3 = this.f21139i0;
                s.e(velocityTracker3);
                this.L = velocityTracker3.getXVelocity();
                VelocityTracker velocityTracker4 = this.f21139i0;
                s.e(velocityTracker4);
                this.M = velocityTracker4.getYVelocity();
            }
        }
        if (actionMasked == 1) {
            if (M == 4) {
                z();
            } else {
                B();
            }
        } else if (actionMasked == 5 && event.getPointerCount() > this.f21132b0) {
            if (M == 4) {
                o();
            } else {
                B();
            }
        } else if (actionMasked == 6 && M == 4 && event.getPointerCount() < this.f21131a0) {
            B();
        } else if (M == 2) {
            if (b1()) {
                B();
            } else if (a1()) {
                i();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    protected void e0() {
        VelocityTracker velocityTracker = this.f21139i0;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.recycle();
        this.f21139i0 = null;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void i0() {
        super.i0();
        this.P = Float.MAX_VALUE;
        this.Q = Float.MIN_VALUE;
        this.R = Float.MIN_VALUE;
        this.S = Float.MAX_VALUE;
        this.T = Float.MAX_VALUE;
        this.U = Float.MIN_VALUE;
        this.V = Float.MIN_VALUE;
        this.W = Float.MAX_VALUE;
        this.X = Float.MAX_VALUE;
        this.Y = Float.MAX_VALUE;
        this.Z = Float.MAX_VALUE;
        this.O = this.N;
        this.f21131a0 = 1;
        this.f21132b0 = 10;
        this.f21140j0 = false;
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
        this.f21133c0 = this.f21137g0;
        this.f21134d0 = this.f21138h0;
    }
}