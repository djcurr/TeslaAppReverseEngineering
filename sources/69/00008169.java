package l0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import l0.d0;

/* loaded from: classes.dex */
public final class g0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f36139a;

    /* renamed from: b  reason: collision with root package name */
    private final int f36140b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f36141c;

    public g0(int i11, int i12, a0 easing) {
        kotlin.jvm.internal.s.g(easing, "easing");
        this.f36139a = i11;
        this.f36140b = i12;
        this.f36141c = easing;
    }

    private final long f(long j11) {
        long n11;
        n11 = m00.l.n(j11 - this.f36140b, 0L, this.f36139a);
        return n11;
    }

    @Override // l0.d0
    public float b(float f11, float f12, float f13) {
        return d0.a.a(this, f11, f12, f13);
    }

    @Override // l0.d0
    public float c(long j11, float f11, float f12, float f13) {
        float l11;
        long f14 = f(j11 / 1000000);
        int i11 = this.f36139a;
        float f15 = i11 == 0 ? 1.0f : ((float) f14) / i11;
        a0 a0Var = this.f36141c;
        l11 = m00.l.l(f15, BitmapDescriptorFactory.HUE_RED, 1.0f);
        return f1.k(f11, f12, a0Var.a(l11));
    }

    @Override // l0.d0
    public float d(long j11, float f11, float f12, float f13) {
        long f14 = f(j11 / 1000000);
        int i11 = (f14 > 0L ? 1 : (f14 == 0L ? 0 : -1));
        if (i11 < 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (i11 == 0) {
            return f13;
        }
        return (c(f14 * 1000000, f11, f12, f13) - c((f14 - 1) * 1000000, f11, f12, f13)) * 1000.0f;
    }

    @Override // l0.d0
    public long e(float f11, float f12, float f13) {
        return (this.f36140b + this.f36139a) * 1000000;
    }

    @Override // l0.i
    /* renamed from: g */
    public <V extends p> l1<V> a(d1<Float, V> d1Var) {
        return d0.a.b(this, d1Var);
    }
}