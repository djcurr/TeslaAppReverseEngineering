package f4;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f4.b;

/* loaded from: classes.dex */
public final class d extends b<d> {

    /* renamed from: s  reason: collision with root package name */
    private e f25799s;

    /* renamed from: t  reason: collision with root package name */
    private float f25800t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f25801u;

    public <K> d(K k11, c<K> cVar) {
        super(k11, cVar);
        this.f25799s = null;
        this.f25800t = Float.MAX_VALUE;
        this.f25801u = false;
    }

    private void o() {
        e eVar = this.f25799s;
        if (eVar != null) {
            double a11 = eVar.a();
            if (a11 <= this.f25791g) {
                if (a11 < this.f25792h) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
                return;
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    @Override // f4.b
    public void i() {
        o();
        this.f25799s.g(d());
        super.i();
    }

    @Override // f4.b
    boolean k(long j11) {
        if (this.f25801u) {
            float f11 = this.f25800t;
            if (f11 != Float.MAX_VALUE) {
                this.f25799s.e(f11);
                this.f25800t = Float.MAX_VALUE;
            }
            this.f25786b = this.f25799s.a();
            this.f25785a = BitmapDescriptorFactory.HUE_RED;
            this.f25801u = false;
            return true;
        }
        if (this.f25800t != Float.MAX_VALUE) {
            this.f25799s.a();
            long j12 = j11 / 2;
            b.o h11 = this.f25799s.h(this.f25786b, this.f25785a, j12);
            this.f25799s.e(this.f25800t);
            this.f25800t = Float.MAX_VALUE;
            b.o h12 = this.f25799s.h(h11.f25797a, h11.f25798b, j12);
            this.f25786b = h12.f25797a;
            this.f25785a = h12.f25798b;
        } else {
            b.o h13 = this.f25799s.h(this.f25786b, this.f25785a, j11);
            this.f25786b = h13.f25797a;
            this.f25785a = h13.f25798b;
        }
        float max = Math.max(this.f25786b, this.f25792h);
        this.f25786b = max;
        float min = Math.min(max, this.f25791g);
        this.f25786b = min;
        if (n(min, this.f25785a)) {
            this.f25786b = this.f25799s.a();
            this.f25785a = BitmapDescriptorFactory.HUE_RED;
            return true;
        }
        return false;
    }

    public void l(float f11) {
        if (e()) {
            this.f25800t = f11;
            return;
        }
        if (this.f25799s == null) {
            this.f25799s = new e(f11);
        }
        this.f25799s.e(f11);
        i();
    }

    public boolean m() {
        return this.f25799s.f25803b > 0.0d;
    }

    boolean n(float f11, float f12) {
        return this.f25799s.c(f11, f12);
    }

    public d p(e eVar) {
        this.f25799s = eVar;
        return this;
    }

    public void q() {
        if (m()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f25790f) {
                    this.f25801u = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }
}