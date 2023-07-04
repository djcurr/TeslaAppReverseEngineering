package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class a<V extends View> extends c<V> {

    /* renamed from: d  reason: collision with root package name */
    private Runnable f14862d;

    /* renamed from: e  reason: collision with root package name */
    OverScroller f14863e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14864f;

    /* renamed from: g  reason: collision with root package name */
    private int f14865g;

    /* renamed from: h  reason: collision with root package name */
    private int f14866h;

    /* renamed from: i  reason: collision with root package name */
    private int f14867i;

    /* renamed from: j  reason: collision with root package name */
    private VelocityTracker f14868j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.appbar.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0268a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final CoordinatorLayout f14869a;

        /* renamed from: b  reason: collision with root package name */
        private final V f14870b;

        RunnableC0268a(CoordinatorLayout coordinatorLayout, V v11) {
            this.f14869a = coordinatorLayout;
            this.f14870b = v11;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f14870b == null || (overScroller = a.this.f14863e) == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                a aVar = a.this;
                aVar.P(this.f14869a, this.f14870b, aVar.f14863e.getCurrY());
                a0.o0(this.f14870b, this);
                return;
            }
            a.this.N(this.f14869a, this.f14870b);
        }
    }

    public a() {
        this.f14865g = -1;
        this.f14867i = -1;
    }

    private void I() {
        if (this.f14868j == null) {
            this.f14868j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f14865g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f14866h = r12
            goto L4c
        L2d:
            int r0 = r11.f14865g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f14866h
            int r7 = r1 - r0
            r11.f14866h = r0
            int r8 = r11.K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.O(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f14868j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f14868j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f14868j
            int r4 = r11.f14865g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.J(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.f14864f = r3
            r11.f14865g = r1
            android.view.VelocityTracker r13 = r11.f14868j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f14868j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f14868j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f14864f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    abstract boolean H(V v11);

    final boolean J(CoordinatorLayout coordinatorLayout, V v11, int i11, int i12, float f11) {
        Runnable runnable = this.f14862d;
        if (runnable != null) {
            v11.removeCallbacks(runnable);
            this.f14862d = null;
        }
        if (this.f14863e == null) {
            this.f14863e = new OverScroller(v11.getContext());
        }
        this.f14863e.fling(0, E(), 0, Math.round(f11), 0, 0, i11, i12);
        if (this.f14863e.computeScrollOffset()) {
            RunnableC0268a runnableC0268a = new RunnableC0268a(coordinatorLayout, v11);
            this.f14862d = runnableC0268a;
            a0.o0(v11, runnableC0268a);
            return true;
        }
        N(coordinatorLayout, v11);
        return false;
    }

    abstract int K(V v11);

    abstract int L(V v11);

    abstract int M();

    abstract void N(CoordinatorLayout coordinatorLayout, V v11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int O(CoordinatorLayout coordinatorLayout, V v11, int i11, int i12, int i13) {
        return Q(coordinatorLayout, v11, M() - i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int P(CoordinatorLayout coordinatorLayout, V v11, int i11) {
        return Q(coordinatorLayout, v11, i11, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    abstract int Q(CoordinatorLayout coordinatorLayout, V v11, int i11, int i12, int i13);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v11, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f14867i < 0) {
            this.f14867i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f14864f) {
            int i11 = this.f14865g;
            if (i11 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i11)) == -1) {
                return false;
            }
            int y11 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y11 - this.f14866h) > this.f14867i) {
                this.f14866h = y11;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f14865g = -1;
            int x11 = (int) motionEvent.getX();
            int y12 = (int) motionEvent.getY();
            boolean z11 = H(v11) && coordinatorLayout.B(v11, x11, y12);
            this.f14864f = z11;
            if (z11) {
                this.f14866h = y12;
                this.f14865g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f14863e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f14863e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f14868j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14865g = -1;
        this.f14867i = -1;
    }
}