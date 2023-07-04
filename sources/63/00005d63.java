package com.swmansion.gesturehandler;

import android.os.Handler;
import android.view.MotionEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class a extends GestureHandler<a> {
    private float P;
    private float Q;
    private Handler R;
    private int S;
    private int L = 1;
    private int M = 1;
    private final long N = 800;
    private final long O = 160;
    private final Runnable T = new Runnable() { // from class: xr.b
        {
            com.swmansion.gesturehandler.a.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.swmansion.gesturehandler.a.H0(com.swmansion.gesturehandler.a.this);
        }
    };

    /* renamed from: com.swmansion.gesturehandler.a$a */
    /* loaded from: classes6.dex */
    public static final class C0385a {
        private C0385a() {
        }

        public /* synthetic */ C0385a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0385a(null);
    }

    public static /* synthetic */ void H0(a aVar) {
        J0(aVar);
    }

    private final void I0(MotionEvent motionEvent) {
        if (N0(motionEvent)) {
            return;
        }
        B();
    }

    public static final void J0(a this$0) {
        s.g(this$0, "this$0");
        this$0.B();
    }

    private final void M0(MotionEvent motionEvent) {
        this.P = motionEvent.getRawX();
        this.Q = motionEvent.getRawY();
        n();
        this.S = 1;
        Handler handler = this.R;
        if (handler == null) {
            this.R = new Handler();
        } else {
            s.e(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.R;
        s.e(handler2);
        handler2.postDelayed(this.T, this.N);
    }

    private final boolean N0(MotionEvent motionEvent) {
        if (this.S != this.L || (((this.M & 1) == 0 || motionEvent.getRawX() - this.P <= ((float) this.O)) && (((this.M & 2) == 0 || this.P - motionEvent.getRawX() <= ((float) this.O)) && (((this.M & 4) == 0 || this.Q - motionEvent.getRawY() <= ((float) this.O)) && ((this.M & 8) == 0 || motionEvent.getRawY() - this.Q <= ((float) this.O)))))) {
            return false;
        }
        Handler handler = this.R;
        s.e(handler);
        handler.removeCallbacksAndMessages(null);
        i();
        return true;
    }

    public final void K0(int i11) {
        this.M = i11;
    }

    public final void L0(int i11) {
        this.L = i11;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    protected void c0() {
        Handler handler = this.R;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    protected void d0(MotionEvent event) {
        s.g(event, "event");
        int M = M();
        if (M == 0) {
            M0(event);
        }
        if (M == 2) {
            N0(event);
            if (event.getPointerCount() > this.S) {
                this.S = event.getPointerCount();
            }
            if (event.getActionMasked() == 1) {
                I0(event);
            }
        }
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    protected void e0() {
        Handler handler = this.R;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void i0() {
        super.i0();
        this.L = 1;
        this.M = 1;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void j(boolean z11) {
        super.j(z11);
        z();
    }
}