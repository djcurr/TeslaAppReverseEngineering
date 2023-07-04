package f4;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f4.b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    double f25802a;

    /* renamed from: b  reason: collision with root package name */
    double f25803b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f25804c;

    /* renamed from: d  reason: collision with root package name */
    private double f25805d;

    /* renamed from: e  reason: collision with root package name */
    private double f25806e;

    /* renamed from: f  reason: collision with root package name */
    private double f25807f;

    /* renamed from: g  reason: collision with root package name */
    private double f25808g;

    /* renamed from: h  reason: collision with root package name */
    private double f25809h;

    /* renamed from: i  reason: collision with root package name */
    private double f25810i;

    /* renamed from: j  reason: collision with root package name */
    private final b.o f25811j;

    public e() {
        this.f25802a = Math.sqrt(1500.0d);
        this.f25803b = 0.5d;
        this.f25804c = false;
        this.f25810i = Double.MAX_VALUE;
        this.f25811j = new b.o();
    }

    private void b() {
        if (this.f25804c) {
            return;
        }
        if (this.f25810i != Double.MAX_VALUE) {
            double d11 = this.f25803b;
            if (d11 > 1.0d) {
                double d12 = this.f25802a;
                this.f25807f = ((-d11) * d12) + (d12 * Math.sqrt((d11 * d11) - 1.0d));
                double d13 = this.f25803b;
                double d14 = this.f25802a;
                this.f25808g = ((-d13) * d14) - (d14 * Math.sqrt((d13 * d13) - 1.0d));
            } else if (d11 >= 0.0d && d11 < 1.0d) {
                this.f25809h = this.f25802a * Math.sqrt(1.0d - (d11 * d11));
            }
            this.f25804c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    public float a() {
        return (float) this.f25810i;
    }

    public boolean c(float f11, float f12) {
        return ((double) Math.abs(f12)) < this.f25806e && ((double) Math.abs(f11 - a())) < this.f25805d;
    }

    public e d(float f11) {
        if (f11 >= BitmapDescriptorFactory.HUE_RED) {
            this.f25803b = f11;
            this.f25804c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public e e(float f11) {
        this.f25810i = f11;
        return this;
    }

    public e f(float f11) {
        if (f11 > BitmapDescriptorFactory.HUE_RED) {
            this.f25802a = Math.sqrt(f11);
            this.f25804c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(double d11) {
        double abs = Math.abs(d11);
        this.f25805d = abs;
        this.f25806e = abs * 62.5d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b.o h(double d11, double d12, long j11) {
        double cos;
        double d13;
        b();
        double d14 = j11 / 1000.0d;
        double d15 = d11 - this.f25810i;
        double d16 = this.f25803b;
        if (d16 > 1.0d) {
            double d17 = this.f25808g;
            double d18 = this.f25807f;
            double d19 = d15 - (((d17 * d15) - d12) / (d17 - d18));
            double d21 = ((d15 * d17) - d12) / (d17 - d18);
            d13 = (Math.pow(2.718281828459045d, d17 * d14) * d19) + (Math.pow(2.718281828459045d, this.f25807f * d14) * d21);
            double d22 = this.f25808g;
            double pow = d19 * d22 * Math.pow(2.718281828459045d, d22 * d14);
            double d23 = this.f25807f;
            cos = pow + (d21 * d23 * Math.pow(2.718281828459045d, d23 * d14));
        } else if (d16 == 1.0d) {
            double d24 = this.f25802a;
            double d25 = d12 + (d24 * d15);
            double d26 = d15 + (d25 * d14);
            d13 = Math.pow(2.718281828459045d, (-d24) * d14) * d26;
            double pow2 = d26 * Math.pow(2.718281828459045d, (-this.f25802a) * d14);
            double d27 = this.f25802a;
            cos = (d25 * Math.pow(2.718281828459045d, (-d27) * d14)) + (pow2 * (-d27));
        } else {
            double d28 = 1.0d / this.f25809h;
            double d29 = this.f25802a;
            double d31 = d28 * ((d16 * d29 * d15) + d12);
            double pow3 = Math.pow(2.718281828459045d, (-d16) * d29 * d14) * ((Math.cos(this.f25809h * d14) * d15) + (Math.sin(this.f25809h * d14) * d31));
            double d32 = this.f25802a;
            double d33 = this.f25803b;
            double pow4 = Math.pow(2.718281828459045d, (-d33) * d32 * d14);
            double d34 = this.f25809h;
            double sin = (-d34) * d15 * Math.sin(d34 * d14);
            double d35 = this.f25809h;
            cos = ((-d32) * pow3 * d33) + (pow4 * (sin + (d31 * d35 * Math.cos(d35 * d14))));
            d13 = pow3;
        }
        b.o oVar = this.f25811j;
        oVar.f25797a = (float) (d13 + this.f25810i);
        oVar.f25798b = (float) cos;
        return oVar;
    }

    public e(float f11) {
        this.f25802a = Math.sqrt(1500.0d);
        this.f25803b = 0.5d;
        this.f25804c = false;
        this.f25810i = Double.MAX_VALUE;
        this.f25811j = new b.o();
        this.f25810i = f11;
    }
}