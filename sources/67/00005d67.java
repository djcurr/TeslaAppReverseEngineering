package com.swmansion.gesturehandler;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class c extends GestureHandler<c> {
    public static final a N = new a(null);
    private boolean L;
    private boolean M;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(View view, MotionEvent motionEvent) {
            return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
        }
    }

    /* loaded from: classes6.dex */
    public interface b {
        boolean a();

        void b();
    }

    public c() {
        v0(true);
    }

    private final void H0() {
        View R = R();
        if (R instanceof b) {
            ((b) R).b();
        }
    }

    private final boolean I0() {
        View R = R();
        if (R instanceof b) {
            return ((b) R).a();
        }
        return true;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public boolean A0(GestureHandler<?> handler) {
        s.g(handler, "handler");
        if ((handler instanceof c) && handler.M() == 4 && ((c) handler).M) {
            return false;
        }
        boolean z11 = !this.M;
        return !(M() == 4 && handler.M() == 4 && z11) && M() == 4 && z11;
    }

    public final c J0(boolean z11) {
        this.M = z11;
        return this;
    }

    public final c K0(boolean z11) {
        this.L = z11;
        return this;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    protected void c0() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        obtain.setAction(3);
        View R = R();
        s.e(R);
        R.onTouchEvent(obtain);
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    protected void d0(MotionEvent event) {
        s.g(event, "event");
        View R = R();
        s.e(R);
        if (event.getActionMasked() == 1) {
            R.onTouchEvent(event);
            if ((M() == 0 || M() == 2) && R.isPressed()) {
                i();
            }
            z();
            H0();
        } else if (M() != 0 && M() != 2) {
            if (M() == 4) {
                R.onTouchEvent(event);
            }
        } else if (this.L) {
            N.b(R, event);
            R.onTouchEvent(event);
            i();
        } else if (N.b(R, event)) {
            R.onTouchEvent(event);
            i();
        } else if (M() != 2) {
            if (I0()) {
                n();
            } else {
                o();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void i0() {
        super.i0();
        this.L = false;
        this.M = false;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public boolean z0(GestureHandler<?> handler) {
        s.g(handler, "handler");
        return !this.M;
    }
}