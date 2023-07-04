package l0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    private float f36275a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36277c;

    /* renamed from: d  reason: collision with root package name */
    private double f36278d;

    /* renamed from: e  reason: collision with root package name */
    private double f36279e;

    /* renamed from: f  reason: collision with root package name */
    private double f36280f;

    /* renamed from: b  reason: collision with root package name */
    private double f36276b = Math.sqrt(50.0d);

    /* renamed from: g  reason: collision with root package name */
    private float f36281g = 1.0f;

    public t0(float f11) {
        this.f36275a = f11;
    }

    private final void c() {
        if (this.f36277c) {
            return;
        }
        if (!(this.f36275a == u0.b())) {
            float f11 = this.f36281g;
            double d11 = f11 * f11;
            if (f11 > 1.0f) {
                double d12 = this.f36276b;
                double d13 = d11 - 1;
                this.f36278d = ((-f11) * d12) + (d12 * Math.sqrt(d13));
                double d14 = this.f36276b;
                this.f36279e = ((-this.f36281g) * d14) - (d14 * Math.sqrt(d13));
            } else if (f11 >= BitmapDescriptorFactory.HUE_RED && f11 < 1.0f) {
                this.f36280f = this.f36276b * Math.sqrt(1 - d11);
            }
            this.f36277c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    public final float a() {
        return this.f36281g;
    }

    public final float b() {
        double d11 = this.f36276b;
        return (float) (d11 * d11);
    }

    public final void d(float f11) {
        if (f11 >= BitmapDescriptorFactory.HUE_RED) {
            this.f36281g = f11;
            this.f36277c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void e(float f11) {
        this.f36275a = f11;
    }

    public final void f(float f11) {
        if (b() > BitmapDescriptorFactory.HUE_RED) {
            this.f36276b = Math.sqrt(f11);
            this.f36277c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final long g(float f11, float f12, long j11) {
        float f13;
        double cos;
        double d11;
        c();
        float f14 = f11 - this.f36275a;
        double d12 = j11 / 1000.0d;
        float f15 = this.f36281g;
        if (f15 > 1.0f) {
            double d13 = f14;
            double d14 = this.f36279e;
            double d15 = f12;
            double d16 = this.f36278d;
            double d17 = d13 - (((d14 * d13) - d15) / (d14 - d16));
            double d18 = ((d13 * d14) - d15) / (d14 - d16);
            d11 = (Math.exp(d14 * d12) * d17) + (Math.exp(this.f36278d * d12) * d18);
            double d19 = this.f36279e;
            double exp = d17 * d19 * Math.exp(d19 * d12);
            double d21 = this.f36278d;
            cos = exp + (d18 * d21 * Math.exp(d21 * d12));
        } else {
            if (f15 == 1.0f) {
                double d22 = this.f36276b;
                double d23 = f14;
                double d24 = f12 + (d22 * d23);
                double d25 = d23 + (d24 * d12);
                double exp2 = Math.exp((-d22) * d12) * d25;
                double exp3 = d25 * Math.exp((-this.f36276b) * d12);
                double d26 = this.f36276b;
                cos = (exp3 * (-d26)) + (d24 * Math.exp((-d26) * d12));
                d11 = exp2;
            } else {
                double d27 = this.f36276b;
                double d28 = f14;
                double d29 = (1 / this.f36280f) * ((f15 * d27 * d28) + f12);
                double exp4 = Math.exp((-f15) * d27 * d12) * ((Math.cos(this.f36280f * d12) * d28) + (Math.sin(this.f36280f * d12) * d29));
                double d31 = this.f36276b;
                double d32 = (-d31) * exp4 * this.f36281g;
                double exp5 = Math.exp((-f13) * d31 * d12);
                double d33 = this.f36280f;
                double sin = (-d33) * d28 * Math.sin(d33 * d12);
                double d34 = this.f36280f;
                cos = d32 + (exp5 * (sin + (d29 * d34 * Math.cos(d34 * d12))));
                d11 = exp4;
            }
        }
        return u0.a((float) (d11 + this.f36275a), (float) cos);
    }
}