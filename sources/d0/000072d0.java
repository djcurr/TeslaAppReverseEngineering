package h8;

import android.view.Choreographer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class e extends a implements Choreographer.FrameCallback {

    /* renamed from: j  reason: collision with root package name */
    private v7.d f28984j;

    /* renamed from: c  reason: collision with root package name */
    private float f28977c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private boolean f28978d = false;

    /* renamed from: e  reason: collision with root package name */
    private long f28979e = 0;

    /* renamed from: f  reason: collision with root package name */
    private float f28980f = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: g  reason: collision with root package name */
    private int f28981g = 0;

    /* renamed from: h  reason: collision with root package name */
    private float f28982h = -2.14748365E9f;

    /* renamed from: i  reason: collision with root package name */
    private float f28983i = 2.14748365E9f;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f28985k = false;

    private void B() {
        if (this.f28984j == null) {
            return;
        }
        float f11 = this.f28980f;
        if (f11 < this.f28982h || f11 > this.f28983i) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f28982h), Float.valueOf(this.f28983i), Float.valueOf(this.f28980f)));
        }
    }

    private float j() {
        v7.d dVar = this.f28984j;
        if (dVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / dVar.i()) / Math.abs(this.f28977c);
    }

    private boolean n() {
        return m() < BitmapDescriptorFactory.HUE_RED;
    }

    public void A(float f11) {
        this.f28977c = f11;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        a();
        r();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j11) {
        q();
        if (this.f28984j == null || !isRunning()) {
            return;
        }
        v7.c.a("LottieValueAnimator#doFrame");
        long j12 = this.f28979e;
        float j13 = ((float) (j12 != 0 ? j11 - j12 : 0L)) / j();
        float f11 = this.f28980f;
        if (n()) {
            j13 = -j13;
        }
        float f12 = f11 + j13;
        this.f28980f = f12;
        boolean z11 = !g.e(f12, l(), k());
        this.f28980f = g.c(this.f28980f, l(), k());
        this.f28979e = j11;
        e();
        if (z11) {
            if (getRepeatCount() != -1 && this.f28981g >= getRepeatCount()) {
                this.f28980f = this.f28977c < BitmapDescriptorFactory.HUE_RED ? l() : k();
                r();
                b(n());
            } else {
                c();
                this.f28981g++;
                if (getRepeatMode() == 2) {
                    this.f28978d = !this.f28978d;
                    u();
                } else {
                    this.f28980f = n() ? k() : l();
                }
                this.f28979e = j11;
            }
        }
        B();
        v7.c.b("LottieValueAnimator#doFrame");
    }

    public void f() {
        this.f28984j = null;
        this.f28982h = -2.14748365E9f;
        this.f28983i = 2.14748365E9f;
    }

    public void g() {
        r();
        b(n());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float l11;
        float k11;
        float l12;
        if (this.f28984j == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (n()) {
            l11 = k() - this.f28980f;
            k11 = k();
            l12 = l();
        } else {
            l11 = this.f28980f - l();
            k11 = k();
            l12 = l();
        }
        return l11 / (k11 - l12);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(h());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        v7.d dVar = this.f28984j;
        if (dVar == null) {
            return 0L;
        }
        return dVar.d();
    }

    public float h() {
        v7.d dVar = this.f28984j;
        return dVar == null ? BitmapDescriptorFactory.HUE_RED : (this.f28980f - dVar.p()) / (this.f28984j.f() - this.f28984j.p());
    }

    public float i() {
        return this.f28980f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f28985k;
    }

    public float k() {
        v7.d dVar = this.f28984j;
        if (dVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f11 = this.f28983i;
        return f11 == 2.14748365E9f ? dVar.f() : f11;
    }

    public float l() {
        v7.d dVar = this.f28984j;
        if (dVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f11 = this.f28982h;
        return f11 == -2.14748365E9f ? dVar.p() : f11;
    }

    public float m() {
        return this.f28977c;
    }

    public void o() {
        r();
    }

    public void p() {
        this.f28985k = true;
        d(n());
        w((int) (n() ? k() : l()));
        this.f28979e = 0L;
        this.f28981g = 0;
        q();
    }

    protected void q() {
        if (isRunning()) {
            s(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void r() {
        s(true);
    }

    protected void s(boolean z11) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z11) {
            this.f28985k = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i11) {
        super.setRepeatMode(i11);
        if (i11 == 2 || !this.f28978d) {
            return;
        }
        this.f28978d = false;
        u();
    }

    public void t() {
        this.f28985k = true;
        q();
        this.f28979e = 0L;
        if (n() && i() == l()) {
            this.f28980f = k();
        } else if (n() || i() != k()) {
        } else {
            this.f28980f = l();
        }
    }

    public void u() {
        A(-m());
    }

    public void v(v7.d dVar) {
        boolean z11 = this.f28984j == null;
        this.f28984j = dVar;
        if (z11) {
            y((int) Math.max(this.f28982h, dVar.p()), (int) Math.min(this.f28983i, dVar.f()));
        } else {
            y((int) dVar.p(), (int) dVar.f());
        }
        float f11 = this.f28980f;
        this.f28980f = BitmapDescriptorFactory.HUE_RED;
        w((int) f11);
        e();
    }

    public void w(float f11) {
        if (this.f28980f == f11) {
            return;
        }
        this.f28980f = g.c(f11, l(), k());
        this.f28979e = 0L;
        e();
    }

    public void x(float f11) {
        y(this.f28982h, f11);
    }

    public void y(float f11, float f12) {
        if (f11 <= f12) {
            v7.d dVar = this.f28984j;
            float p11 = dVar == null ? -3.4028235E38f : dVar.p();
            v7.d dVar2 = this.f28984j;
            float f13 = dVar2 == null ? Float.MAX_VALUE : dVar2.f();
            float c11 = g.c(f11, p11, f13);
            float c12 = g.c(f12, p11, f13);
            if (c11 == this.f28982h && c12 == this.f28983i) {
                return;
            }
            this.f28982h = c11;
            this.f28983i = c12;
            w((int) g.c(this.f28980f, c11, c12));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f11), Float.valueOf(f12)));
    }

    public void z(int i11) {
        y(i11, (int) this.f28983i);
    }
}