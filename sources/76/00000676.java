package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: t  reason: collision with root package name */
    private static final int f4611t = ViewConfiguration.getTapTimeout();

    /* renamed from: c  reason: collision with root package name */
    final View f4614c;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f4615d;

    /* renamed from: g  reason: collision with root package name */
    private int f4618g;

    /* renamed from: h  reason: collision with root package name */
    private int f4619h;

    /* renamed from: l  reason: collision with root package name */
    private boolean f4623l;

    /* renamed from: m  reason: collision with root package name */
    boolean f4624m;

    /* renamed from: n  reason: collision with root package name */
    boolean f4625n;

    /* renamed from: o  reason: collision with root package name */
    boolean f4626o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f4627p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f4628q;

    /* renamed from: a  reason: collision with root package name */
    final C0077a f4612a = new C0077a();

    /* renamed from: b  reason: collision with root package name */
    private final Interpolator f4613b = new AccelerateInterpolator();

    /* renamed from: e  reason: collision with root package name */
    private float[] f4616e = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: f  reason: collision with root package name */
    private float[] f4617f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i  reason: collision with root package name */
    private float[] f4620i = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: j  reason: collision with root package name */
    private float[] f4621j = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: k  reason: collision with root package name */
    private float[] f4622k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0077a {

        /* renamed from: a  reason: collision with root package name */
        private int f4629a;

        /* renamed from: b  reason: collision with root package name */
        private int f4630b;

        /* renamed from: c  reason: collision with root package name */
        private float f4631c;

        /* renamed from: d  reason: collision with root package name */
        private float f4632d;

        /* renamed from: j  reason: collision with root package name */
        private float f4638j;

        /* renamed from: k  reason: collision with root package name */
        private int f4639k;

        /* renamed from: e  reason: collision with root package name */
        private long f4633e = Long.MIN_VALUE;

        /* renamed from: i  reason: collision with root package name */
        private long f4637i = -1;

        /* renamed from: f  reason: collision with root package name */
        private long f4634f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f4635g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f4636h = 0;

        C0077a() {
        }

        private float e(long j11) {
            long j12 = this.f4633e;
            if (j11 < j12) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            long j13 = this.f4637i;
            if (j13 >= 0 && j11 >= j13) {
                float f11 = this.f4638j;
                return (1.0f - f11) + (f11 * a.e(((float) (j11 - j13)) / this.f4639k, BitmapDescriptorFactory.HUE_RED, 1.0f));
            }
            return a.e(((float) (j11 - j12)) / this.f4629a, BitmapDescriptorFactory.HUE_RED, 1.0f) * 0.5f;
        }

        private float g(float f11) {
            return ((-4.0f) * f11 * f11) + (f11 * 4.0f);
        }

        public void a() {
            if (this.f4634f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g11 = g(e(currentAnimationTimeMillis));
                this.f4634f = currentAnimationTimeMillis;
                float f11 = ((float) (currentAnimationTimeMillis - this.f4634f)) * g11;
                this.f4635g = (int) (this.f4631c * f11);
                this.f4636h = (int) (f11 * this.f4632d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f4635g;
        }

        public int c() {
            return this.f4636h;
        }

        public int d() {
            float f11 = this.f4631c;
            return (int) (f11 / Math.abs(f11));
        }

        public int f() {
            float f11 = this.f4632d;
            return (int) (f11 / Math.abs(f11));
        }

        public boolean h() {
            return this.f4637i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f4637i + ((long) this.f4639k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f4639k = a.f((int) (currentAnimationTimeMillis - this.f4633e), 0, this.f4630b);
            this.f4638j = e(currentAnimationTimeMillis);
            this.f4637i = currentAnimationTimeMillis;
        }

        public void j(int i11) {
            this.f4630b = i11;
        }

        public void k(int i11) {
            this.f4629a = i11;
        }

        public void l(float f11, float f12) {
            this.f4631c = f11;
            this.f4632d = f12;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f4633e = currentAnimationTimeMillis;
            this.f4637i = -1L;
            this.f4634f = currentAnimationTimeMillis;
            this.f4638j = 0.5f;
            this.f4635g = 0;
            this.f4636h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f4626o) {
                if (aVar.f4624m) {
                    aVar.f4624m = false;
                    aVar.f4612a.m();
                }
                C0077a c0077a = a.this.f4612a;
                if (!c0077a.h() && a.this.u()) {
                    a aVar2 = a.this;
                    if (aVar2.f4625n) {
                        aVar2.f4625n = false;
                        aVar2.c();
                    }
                    c0077a.a();
                    a.this.j(c0077a.b(), c0077a.c());
                    a0.o0(a.this.f4614c, this);
                    return;
                }
                a.this.f4626o = false;
            }
        }
    }

    public a(View view) {
        this.f4614c = view;
        float f11 = Resources.getSystem().getDisplayMetrics().density;
        float f12 = (int) ((1575.0f * f11) + 0.5f);
        o(f12, f12);
        float f13 = (int) ((f11 * 315.0f) + 0.5f);
        p(f13, f13);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f4611t);
        r(500);
        q(500);
    }

    private float d(int i11, float f11, float f12, float f13) {
        float h11 = h(this.f4616e[i11], f12, this.f4617f[i11], f11);
        int i12 = (h11 > BitmapDescriptorFactory.HUE_RED ? 1 : (h11 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i12 == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f14 = this.f4620i[i11];
        float f15 = this.f4621j[i11];
        float f16 = this.f4622k[i11];
        float f17 = f14 * f13;
        if (i12 > 0) {
            return e(h11 * f17, f15, f16);
        }
        return -e((-h11) * f17, f15, f16);
    }

    static float e(float f11, float f12, float f13) {
        return f11 > f13 ? f13 : f11 < f12 ? f12 : f11;
    }

    static int f(int i11, int i12, int i13) {
        return i11 > i13 ? i13 : i11 < i12 ? i12 : i11;
    }

    private float g(float f11, float f12) {
        if (f12 == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i11 = this.f4618g;
        if (i11 == 0 || i11 == 1) {
            if (f11 < f12) {
                if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                    return 1.0f - (f11 / f12);
                }
                if (this.f4626o && i11 == 1) {
                    return 1.0f;
                }
            }
        } else if (i11 == 2 && f11 < BitmapDescriptorFactory.HUE_RED) {
            return f11 / (-f12);
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    private float h(float f11, float f12, float f13, float f14) {
        float interpolation;
        float e11 = e(f11 * f12, BitmapDescriptorFactory.HUE_RED, f13);
        float g11 = g(f12 - f14, e11) - g(f14, e11);
        if (g11 < BitmapDescriptorFactory.HUE_RED) {
            interpolation = -this.f4613b.getInterpolation(-g11);
        } else if (g11 <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        } else {
            interpolation = this.f4613b.getInterpolation(g11);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f4624m) {
            this.f4626o = false;
        } else {
            this.f4612a.i();
        }
    }

    private void v() {
        int i11;
        if (this.f4615d == null) {
            this.f4615d = new b();
        }
        this.f4626o = true;
        this.f4624m = true;
        if (!this.f4623l && (i11 = this.f4619h) > 0) {
            a0.p0(this.f4614c, this.f4615d, i11);
        } else {
            this.f4615d.run();
        }
        this.f4623l = true;
    }

    public abstract boolean a(int i11);

    public abstract boolean b(int i11);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        this.f4614c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i11, int i12);

    public a k(int i11) {
        this.f4619h = i11;
        return this;
    }

    public a l(int i11) {
        this.f4618g = i11;
        return this;
    }

    public a m(boolean z11) {
        if (this.f4627p && !z11) {
            i();
        }
        this.f4627p = z11;
        return this;
    }

    public a n(float f11, float f12) {
        float[] fArr = this.f4617f;
        fArr[0] = f11;
        fArr[1] = f12;
        return this;
    }

    public a o(float f11, float f12) {
        float[] fArr = this.f4622k;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f4627p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f4625n = r2
            r5.f4623l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f4614c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f4614c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f4612a
            r7.l(r0, r6)
            boolean r6 = r5.f4626o
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f4628q
            if (r6 == 0) goto L61
            boolean r6 = r5.f4626o
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f11, float f12) {
        float[] fArr = this.f4621j;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    public a q(int i11) {
        this.f4612a.j(i11);
        return this;
    }

    public a r(int i11) {
        this.f4612a.k(i11);
        return this;
    }

    public a s(float f11, float f12) {
        float[] fArr = this.f4616e;
        fArr[0] = f11;
        fArr[1] = f12;
        return this;
    }

    public a t(float f11, float f12) {
        float[] fArr = this.f4620i;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    boolean u() {
        C0077a c0077a = this.f4612a;
        int f11 = c0077a.f();
        int d11 = c0077a.d();
        return (f11 != 0 && b(f11)) || (d11 != 0 && a(d11));
    }
}