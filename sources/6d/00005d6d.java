package com.swmansion.gesturehandler;

import android.view.MotionEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import xr.m;

/* loaded from: classes6.dex */
public final class f extends GestureHandler<f> {
    private m L;
    private double M;
    private double N;
    private final m.a O;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements m.a {
        b() {
        }

        @Override // xr.m.a
        public void a(m detector) {
            s.g(detector, "detector");
            f.this.z();
        }

        @Override // xr.m.a
        public boolean b(m detector) {
            s.g(detector, "detector");
            return true;
        }

        @Override // xr.m.a
        public boolean c(m detector) {
            s.g(detector, "detector");
            double L0 = f.this.L0();
            f fVar = f.this;
            fVar.M = fVar.L0() + detector.d();
            long e11 = detector.e();
            if (e11 > 0) {
                f fVar2 = f.this;
                fVar2.N = (fVar2.L0() - L0) / e11;
            }
            if (Math.abs(f.this.L0()) < 0.08726646259971647d || f.this.M() != 2) {
                return true;
            }
            f.this.i();
            return true;
        }
    }

    static {
        new a(null);
    }

    public f() {
        v0(false);
        this.O = new b();
    }

    public final float J0() {
        m mVar = this.L;
        if (mVar == null) {
            return Float.NaN;
        }
        return mVar.b();
    }

    public final float K0() {
        m mVar = this.L;
        if (mVar == null) {
            return Float.NaN;
        }
        return mVar.c();
    }

    public final double L0() {
        return this.M;
    }

    public final double M0() {
        return this.N;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    protected void d0(MotionEvent event) {
        s.g(event, "event");
        if (M() == 0) {
            j0();
            this.L = new m(this.O);
            n();
        }
        m mVar = this.L;
        if (mVar != null) {
            mVar.f(event);
        }
        if (event.getActionMasked() == 1) {
            if (M() == 4) {
                z();
            } else {
                B();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    protected void e0() {
        this.L = null;
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
        this.N = 0.0d;
        this.M = 0.0d;
    }
}