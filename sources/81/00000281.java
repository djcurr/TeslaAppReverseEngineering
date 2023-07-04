package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public abstract class f0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final float f1762a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1763b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1764c;

    /* renamed from: d  reason: collision with root package name */
    final View f1765d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f1766e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f1767f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1768g;

    /* renamed from: h  reason: collision with root package name */
    private int f1769h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f1770i = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = f0.this.f1765d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0.this.e();
        }
    }

    public f0(View view) {
        this.f1765d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1762a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1763b = tapTimeout;
        this.f1764c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f1767f;
        if (runnable != null) {
            this.f1765d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1766e;
        if (runnable2 != null) {
            this.f1765d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        d0 d0Var;
        View view = this.f1765d;
        m.e b11 = b();
        if (b11 == null || !b11.b() || (d0Var = (d0) b11.o()) == null || !d0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(d0Var, obtainNoHistory);
        boolean e11 = d0Var.e(obtainNoHistory, this.f1769h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e11 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1765d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1769h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1762a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1769h = r6
            java.lang.Runnable r6 = r5.f1766e
            if (r6 != 0) goto L52
            androidx.appcompat.widget.f0$a r6 = new androidx.appcompat.widget.f0$a
            r6.<init>()
            r5.f1766e = r6
        L52:
            java.lang.Runnable r6 = r5.f1766e
            int r1 = r5.f1763b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1767f
            if (r6 != 0) goto L65
            androidx.appcompat.widget.f0$b r6 = new androidx.appcompat.widget.f0$b
            r6.<init>()
            r5.f1767f = r6
        L65:
            java.lang.Runnable r6 = r5.f1767f
            int r1 = r5.f1764c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f0.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f11, float f12, float f13) {
        float f14 = -f13;
        return f11 >= f14 && f12 >= f14 && f11 < ((float) (view.getRight() - view.getLeft())) + f13 && f12 < ((float) (view.getBottom() - view.getTop())) + f13;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1770i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1770i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract m.e b();

    protected abstract boolean c();

    protected boolean d() {
        m.e b11 = b();
        if (b11 == null || !b11.b()) {
            return true;
        }
        b11.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f1765d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1768g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        boolean z12 = this.f1768g;
        if (z12) {
            z11 = f(motionEvent) || !d();
        } else {
            z11 = g(motionEvent) && c();
            if (z11) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                this.f1765d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1768g = z11;
        return z11 || z12;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1768g = false;
        this.f1769h = -1;
        Runnable runnable = this.f1766e;
        if (runnable != null) {
            this.f1765d.removeCallbacks(runnable);
        }
    }
}