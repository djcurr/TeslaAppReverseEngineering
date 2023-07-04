package b4;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c {

    /* renamed from: x  reason: collision with root package name */
    private static final Interpolator f7385x = new a();

    /* renamed from: a  reason: collision with root package name */
    private int f7386a;

    /* renamed from: b  reason: collision with root package name */
    private int f7387b;

    /* renamed from: d  reason: collision with root package name */
    private float[] f7389d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f7390e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f7391f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f7392g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f7393h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f7394i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f7395j;

    /* renamed from: k  reason: collision with root package name */
    private int f7396k;

    /* renamed from: l  reason: collision with root package name */
    private VelocityTracker f7397l;

    /* renamed from: m  reason: collision with root package name */
    private float f7398m;

    /* renamed from: n  reason: collision with root package name */
    private float f7399n;

    /* renamed from: o  reason: collision with root package name */
    private int f7400o;

    /* renamed from: p  reason: collision with root package name */
    private final int f7401p;

    /* renamed from: q  reason: collision with root package name */
    private int f7402q;

    /* renamed from: r  reason: collision with root package name */
    private OverScroller f7403r;

    /* renamed from: s  reason: collision with root package name */
    private final AbstractC0147c f7404s;

    /* renamed from: t  reason: collision with root package name */
    private View f7405t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f7406u;

    /* renamed from: v  reason: collision with root package name */
    private final ViewGroup f7407v;

    /* renamed from: c  reason: collision with root package name */
    private int f7388c = -1;

    /* renamed from: w  reason: collision with root package name */
    private final Runnable f7408w = new b();

    /* loaded from: classes.dex */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12 = f11 - 1.0f;
            return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.K(0);
        }
    }

    /* renamed from: b4.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0147c {
        public abstract int a(View view, int i11, int i12);

        public abstract int b(View view, int i11, int i12);

        public int c(int i11) {
            return i11;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i11, int i12) {
        }

        public boolean g(int i11) {
            return false;
        }

        public void h(int i11, int i12) {
        }

        public void i(View view, int i11) {
        }

        public abstract void j(int i11);

        public abstract void k(View view, int i11, int i12, int i13, int i14);

        public abstract void l(View view, float f11, float f12);

        public abstract boolean m(View view, int i11);
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0147c abstractC0147c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0147c != null) {
            this.f7407v = viewGroup;
            this.f7404s = abstractC0147c;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i11 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f7401p = i11;
            this.f7400o = i11;
            this.f7387b = viewConfiguration.getScaledTouchSlop();
            this.f7398m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f7399n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f7403r = new OverScroller(context, f7385x);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    private boolean D(int i11) {
        if (C(i11)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i11 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void G() {
        this.f7397l.computeCurrentVelocity(1000, this.f7398m);
        p(g(this.f7397l.getXVelocity(this.f7388c), this.f7399n, this.f7398m), g(this.f7397l.getYVelocity(this.f7388c), this.f7399n, this.f7398m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [b4.c$c] */
    private void H(float f11, float f12, int i11) {
        boolean c11 = c(f11, f12, i11, 1);
        boolean z11 = c11;
        if (c(f12, f11, i11, 4)) {
            z11 = c11 | true;
        }
        boolean z12 = z11;
        if (c(f11, f12, i11, 2)) {
            z12 = (z11 ? 1 : 0) | true;
        }
        ?? r02 = z12;
        if (c(f12, f11, i11, 8)) {
            r02 = (z12 ? 1 : 0) | true;
        }
        if (r02 != 0) {
            int[] iArr = this.f7394i;
            iArr[i11] = iArr[i11] | r02;
            this.f7404s.f(r02, i11);
        }
    }

    private void I(float f11, float f12, int i11) {
        s(i11);
        float[] fArr = this.f7389d;
        this.f7391f[i11] = f11;
        fArr[i11] = f11;
        float[] fArr2 = this.f7390e;
        this.f7392g[i11] = f12;
        fArr2[i11] = f12;
        this.f7393h[i11] = y((int) f11, (int) f12);
        this.f7396k |= 1 << i11;
    }

    private void J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            int pointerId = motionEvent.getPointerId(i11);
            if (D(pointerId)) {
                float x11 = motionEvent.getX(i11);
                float y11 = motionEvent.getY(i11);
                this.f7391f[pointerId] = x11;
                this.f7392g[pointerId] = y11;
            }
        }
    }

    private boolean c(float f11, float f12, int i11, int i12) {
        float abs = Math.abs(f11);
        float abs2 = Math.abs(f12);
        if ((this.f7393h[i11] & i12) != i12 || (this.f7402q & i12) == 0 || (this.f7395j[i11] & i12) == i12 || (this.f7394i[i11] & i12) == i12) {
            return false;
        }
        int i13 = this.f7387b;
        if (abs > i13 || abs2 > i13) {
            if (abs >= abs2 * 0.5f || !this.f7404s.g(i12)) {
                return (this.f7394i[i11] & i12) == 0 && abs > ((float) this.f7387b);
            }
            int[] iArr = this.f7395j;
            iArr[i11] = iArr[i11] | i12;
            return false;
        }
        return false;
    }

    private boolean f(View view, float f11, float f12) {
        if (view == null) {
            return false;
        }
        boolean z11 = this.f7404s.d(view) > 0;
        boolean z12 = this.f7404s.e(view) > 0;
        if (!z11 || !z12) {
            return z11 ? Math.abs(f11) > ((float) this.f7387b) : z12 && Math.abs(f12) > ((float) this.f7387b);
        }
        int i11 = this.f7387b;
        return (f11 * f11) + (f12 * f12) > ((float) (i11 * i11));
    }

    private float g(float f11, float f12, float f13) {
        float abs = Math.abs(f11);
        return abs < f12 ? BitmapDescriptorFactory.HUE_RED : abs > f13 ? f11 > BitmapDescriptorFactory.HUE_RED ? f13 : -f13 : f11;
    }

    private int h(int i11, int i12, int i13) {
        int abs = Math.abs(i11);
        if (abs < i12) {
            return 0;
        }
        return abs > i13 ? i11 > 0 ? i13 : -i13 : i11;
    }

    private void i() {
        float[] fArr = this.f7389d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, (float) BitmapDescriptorFactory.HUE_RED);
        Arrays.fill(this.f7390e, (float) BitmapDescriptorFactory.HUE_RED);
        Arrays.fill(this.f7391f, (float) BitmapDescriptorFactory.HUE_RED);
        Arrays.fill(this.f7392g, (float) BitmapDescriptorFactory.HUE_RED);
        Arrays.fill(this.f7393h, 0);
        Arrays.fill(this.f7394i, 0);
        Arrays.fill(this.f7395j, 0);
        this.f7396k = 0;
    }

    private void j(int i11) {
        if (this.f7389d == null || !C(i11)) {
            return;
        }
        this.f7389d[i11] = 0.0f;
        this.f7390e[i11] = 0.0f;
        this.f7391f[i11] = 0.0f;
        this.f7392g[i11] = 0.0f;
        this.f7393h[i11] = 0;
        this.f7394i[i11] = 0;
        this.f7395j[i11] = 0;
        this.f7396k = (~(1 << i11)) & this.f7396k;
    }

    private int k(int i11, int i12, int i13) {
        int abs;
        if (i11 == 0) {
            return 0;
        }
        int width = this.f7407v.getWidth();
        float f11 = width / 2;
        float q11 = f11 + (q(Math.min(1.0f, Math.abs(i11) / width)) * f11);
        int abs2 = Math.abs(i12);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(q11 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i11) / i13) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    private int l(View view, int i11, int i12, int i13, int i14) {
        float f11;
        float f12;
        float f13;
        float f14;
        int h11 = h(i13, (int) this.f7399n, (int) this.f7398m);
        int h12 = h(i14, (int) this.f7399n, (int) this.f7398m);
        int abs = Math.abs(i11);
        int abs2 = Math.abs(i12);
        int abs3 = Math.abs(h11);
        int abs4 = Math.abs(h12);
        int i15 = abs3 + abs4;
        int i16 = abs + abs2;
        if (h11 != 0) {
            f11 = abs3;
            f12 = i15;
        } else {
            f11 = abs;
            f12 = i16;
        }
        float f15 = f11 / f12;
        if (h12 != 0) {
            f13 = abs4;
            f14 = i15;
        } else {
            f13 = abs2;
            f14 = i16;
        }
        return (int) ((k(i11, h11, this.f7404s.d(view)) * f15) + (k(i12, h12, this.f7404s.e(view)) * (f13 / f14)));
    }

    public static c n(ViewGroup viewGroup, float f11, AbstractC0147c abstractC0147c) {
        c o11 = o(viewGroup, abstractC0147c);
        o11.f7387b = (int) (o11.f7387b * (1.0f / f11));
        return o11;
    }

    public static c o(ViewGroup viewGroup, AbstractC0147c abstractC0147c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0147c);
    }

    private void p(float f11, float f12) {
        this.f7406u = true;
        this.f7404s.l(this.f7405t, f11, f12);
        this.f7406u = false;
        if (this.f7386a == 1) {
            K(0);
        }
    }

    private float q(float f11) {
        return (float) Math.sin((f11 - 0.5f) * 0.47123894f);
    }

    private void r(int i11, int i12, int i13, int i14) {
        int left = this.f7405t.getLeft();
        int top = this.f7405t.getTop();
        if (i13 != 0) {
            i11 = this.f7404s.a(this.f7405t, i11, i13);
            a0.g0(this.f7405t, i11 - left);
        }
        int i15 = i11;
        if (i14 != 0) {
            i12 = this.f7404s.b(this.f7405t, i12, i14);
            a0.h0(this.f7405t, i12 - top);
        }
        int i16 = i12;
        if (i13 == 0 && i14 == 0) {
            return;
        }
        this.f7404s.k(this.f7405t, i15, i16, i15 - left, i16 - top);
    }

    private void s(int i11) {
        float[] fArr = this.f7389d;
        if (fArr == null || fArr.length <= i11) {
            int i12 = i11 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f7390e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f7391f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f7392g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f7393h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f7394i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f7395j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f7389d = fArr2;
            this.f7390e = fArr3;
            this.f7391f = fArr4;
            this.f7392g = fArr5;
            this.f7393h = iArr;
            this.f7394i = iArr2;
            this.f7395j = iArr3;
        }
    }

    private boolean u(int i11, int i12, int i13, int i14) {
        int left = this.f7405t.getLeft();
        int top = this.f7405t.getTop();
        int i15 = i11 - left;
        int i16 = i12 - top;
        if (i15 == 0 && i16 == 0) {
            this.f7403r.abortAnimation();
            K(0);
            return false;
        }
        this.f7403r.startScroll(left, top, i15, i16, l(this.f7405t, i15, i16, i13, i14));
        K(2);
        return true;
    }

    private int y(int i11, int i12) {
        int i13 = i11 < this.f7407v.getLeft() + this.f7400o ? 1 : 0;
        if (i12 < this.f7407v.getTop() + this.f7400o) {
            i13 |= 4;
        }
        if (i11 > this.f7407v.getRight() - this.f7400o) {
            i13 |= 2;
        }
        return i12 > this.f7407v.getBottom() - this.f7400o ? i13 | 8 : i13;
    }

    public int A() {
        return this.f7386a;
    }

    public boolean B(int i11, int i12) {
        return E(this.f7405t, i11, i12);
    }

    public boolean C(int i11) {
        return ((1 << i11) & this.f7396k) != 0;
    }

    public boolean E(View view, int i11, int i12) {
        return view != null && i11 >= view.getLeft() && i11 < view.getRight() && i12 >= view.getTop() && i12 < view.getBottom();
    }

    public void F(MotionEvent motionEvent) {
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f7397l == null) {
            this.f7397l = VelocityTracker.obtain();
        }
        this.f7397l.addMovement(motionEvent);
        int i12 = 0;
        if (actionMasked == 0) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View t11 = t((int) x11, (int) y11);
            I(x11, y11, pointerId);
            R(t11, pointerId);
            int i13 = this.f7393h[pointerId];
            int i14 = this.f7402q;
            if ((i13 & i14) != 0) {
                this.f7404s.h(i13 & i14, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f7386a == 1) {
                G();
            }
            a();
        } else if (actionMasked == 2) {
            if (this.f7386a == 1) {
                if (D(this.f7388c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f7388c);
                    float x12 = motionEvent.getX(findPointerIndex);
                    float y12 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f7391f;
                    int i15 = this.f7388c;
                    int i16 = (int) (x12 - fArr[i15]);
                    int i17 = (int) (y12 - this.f7392g[i15]);
                    r(this.f7405t.getLeft() + i16, this.f7405t.getTop() + i17, i16, i17);
                    J(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i12 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i12);
                if (D(pointerId2)) {
                    float x13 = motionEvent.getX(i12);
                    float y13 = motionEvent.getY(i12);
                    float f11 = x13 - this.f7389d[pointerId2];
                    float f12 = y13 - this.f7390e[pointerId2];
                    H(f11, f12, pointerId2);
                    if (this.f7386a != 1) {
                        View t12 = t((int) x13, (int) y13);
                        if (f(t12, f11, f12) && R(t12, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i12++;
            }
            J(motionEvent);
        } else if (actionMasked == 3) {
            if (this.f7386a == 1) {
                p(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            a();
        } else if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x14 = motionEvent.getX(actionIndex);
            float y14 = motionEvent.getY(actionIndex);
            I(x14, y14, pointerId3);
            if (this.f7386a == 0) {
                R(t((int) x14, (int) y14), pointerId3);
                int i18 = this.f7393h[pointerId3];
                int i19 = this.f7402q;
                if ((i18 & i19) != 0) {
                    this.f7404s.h(i18 & i19, pointerId3);
                }
            } else if (B((int) x14, (int) y14)) {
                R(this.f7405t, pointerId3);
            }
        } else if (actionMasked != 6) {
        } else {
            int pointerId4 = motionEvent.getPointerId(actionIndex);
            if (this.f7386a == 1 && pointerId4 == this.f7388c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i12 >= pointerCount2) {
                        i11 = -1;
                        break;
                    }
                    int pointerId5 = motionEvent.getPointerId(i12);
                    if (pointerId5 != this.f7388c) {
                        View t13 = t((int) motionEvent.getX(i12), (int) motionEvent.getY(i12));
                        View view = this.f7405t;
                        if (t13 == view && R(view, pointerId5)) {
                            i11 = this.f7388c;
                            break;
                        }
                    }
                    i12++;
                }
                if (i11 == -1) {
                    G();
                }
            }
            j(pointerId4);
        }
    }

    void K(int i11) {
        this.f7407v.removeCallbacks(this.f7408w);
        if (this.f7386a != i11) {
            this.f7386a = i11;
            this.f7404s.j(i11);
            if (this.f7386a == 0) {
                this.f7405t = null;
            }
        }
    }

    public void L(int i11) {
        this.f7400o = i11;
    }

    public void M(int i11) {
        this.f7402q = i11;
    }

    public void N(float f11) {
        this.f7399n = f11;
    }

    public boolean O(int i11, int i12) {
        if (this.f7406u) {
            return u(i11, i12, (int) this.f7397l.getXVelocity(this.f7388c), (int) this.f7397l.getYVelocity(this.f7388c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean P(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.c.P(android.view.MotionEvent):boolean");
    }

    public boolean Q(View view, int i11, int i12) {
        this.f7405t = view;
        this.f7388c = -1;
        boolean u11 = u(i11, i12, 0, 0);
        if (!u11 && this.f7386a == 0 && this.f7405t != null) {
            this.f7405t = null;
        }
        return u11;
    }

    boolean R(View view, int i11) {
        if (view == this.f7405t && this.f7388c == i11) {
            return true;
        }
        if (view == null || !this.f7404s.m(view, i11)) {
            return false;
        }
        this.f7388c = i11;
        b(view, i11);
        return true;
    }

    public void a() {
        this.f7388c = -1;
        i();
        VelocityTracker velocityTracker = this.f7397l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7397l = null;
        }
    }

    public void b(View view, int i11) {
        if (view.getParent() == this.f7407v) {
            this.f7405t = view;
            this.f7388c = i11;
            this.f7404s.i(view, i11);
            K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f7407v + ")");
    }

    public boolean d(int i11) {
        int length = this.f7389d.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (e(i11, i12)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i11, int i12) {
        if (C(i12)) {
            boolean z11 = (i11 & 1) == 1;
            boolean z12 = (i11 & 2) == 2;
            float f11 = this.f7391f[i12] - this.f7389d[i12];
            float f12 = this.f7392g[i12] - this.f7390e[i12];
            if (!z11 || !z12) {
                return z11 ? Math.abs(f11) > ((float) this.f7387b) : z12 && Math.abs(f12) > ((float) this.f7387b);
            }
            int i13 = this.f7387b;
            return (f11 * f11) + (f12 * f12) > ((float) (i13 * i13));
        }
        return false;
    }

    public boolean m(boolean z11) {
        if (this.f7386a == 2) {
            boolean computeScrollOffset = this.f7403r.computeScrollOffset();
            int currX = this.f7403r.getCurrX();
            int currY = this.f7403r.getCurrY();
            int left = currX - this.f7405t.getLeft();
            int top = currY - this.f7405t.getTop();
            if (left != 0) {
                a0.g0(this.f7405t, left);
            }
            if (top != 0) {
                a0.h0(this.f7405t, top);
            }
            if (left != 0 || top != 0) {
                this.f7404s.k(this.f7405t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f7403r.getFinalX() && currY == this.f7403r.getFinalY()) {
                this.f7403r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z11) {
                    this.f7407v.post(this.f7408w);
                } else {
                    K(0);
                }
            }
        }
        return this.f7386a == 2;
    }

    public View t(int i11, int i12) {
        for (int childCount = this.f7407v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f7407v.getChildAt(this.f7404s.c(childCount));
            if (i11 >= childAt.getLeft() && i11 < childAt.getRight() && i12 >= childAt.getTop() && i12 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View v() {
        return this.f7405t;
    }

    public int w() {
        return this.f7401p;
    }

    public int x() {
        return this.f7400o;
    }

    public int z() {
        return this.f7387b;
    }
}