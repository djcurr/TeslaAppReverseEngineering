package k0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import l0.e0;

/* loaded from: classes.dex */
public final class y implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final q f34199a;

    public y(x2.d density) {
        kotlin.jvm.internal.s.g(density, "density");
        this.f34199a = new q(z.a(), density);
    }

    private final float f(float f11) {
        return this.f34199a.b(f11) * Math.signum(f11);
    }

    @Override // l0.e0
    public float a() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // l0.e0
    public float b(long j11, float f11, float f12) {
        return this.f34199a.d(f12).b(j11 / 1000000);
    }

    @Override // l0.e0
    public long c(float f11, float f12) {
        return this.f34199a.c(f12) * 1000000;
    }

    @Override // l0.e0
    public float d(float f11, float f12) {
        return f11 + f(f12);
    }

    @Override // l0.e0
    public float e(long j11, float f11, float f12) {
        return f11 + this.f34199a.d(f12).a(j11 / 1000000);
    }
}