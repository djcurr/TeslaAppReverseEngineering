package t;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
class l2 implements z.a1 {

    /* renamed from: a  reason: collision with root package name */
    private float f51097a;

    /* renamed from: b  reason: collision with root package name */
    private final float f51098b;

    /* renamed from: c  reason: collision with root package name */
    private final float f51099c;

    /* renamed from: d  reason: collision with root package name */
    private float f51100d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l2(float f11, float f12) {
        this.f51098b = f11;
        this.f51099c = f12;
    }

    private float e(float f11) {
        float f12 = this.f51098b;
        float f13 = this.f51099c;
        if (f12 == f13) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f11 == f12) {
            return 1.0f;
        }
        if (f11 == f13) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f14 = 1.0f / f13;
        return ((1.0f / f11) - f14) / ((1.0f / f12) - f14);
    }

    @Override // z.a1
    public float a() {
        return this.f51098b;
    }

    @Override // z.a1
    public float b() {
        return this.f51100d;
    }

    @Override // z.a1
    public float c() {
        return this.f51099c;
    }

    @Override // z.a1
    public float d() {
        return this.f51097a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(float f11) {
        if (f11 <= this.f51098b && f11 >= this.f51099c) {
            this.f51097a = f11;
            this.f51100d = e(f11);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f11 + " is not within valid range [" + this.f51099c + " , " + this.f51098b + "]");
    }
}