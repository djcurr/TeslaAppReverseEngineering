package l0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class u implements a0 {

    /* renamed from: a  reason: collision with root package name */
    private final float f36282a;

    /* renamed from: b  reason: collision with root package name */
    private final float f36283b;

    /* renamed from: c  reason: collision with root package name */
    private final float f36284c;

    /* renamed from: d  reason: collision with root package name */
    private final float f36285d;

    public u(float f11, float f12, float f13, float f14) {
        this.f36282a = f11;
        this.f36283b = f12;
        this.f36284c = f13;
        this.f36285d = f14;
    }

    private final float b(float f11, float f12, float f13) {
        float f14 = 3;
        float f15 = 1 - f13;
        return (f11 * f14 * f15 * f15 * f13) + (f14 * f12 * f15 * f13 * f13) + (f13 * f13 * f13);
    }

    @Override // l0.a0
    public float a(float f11) {
        float f12 = BitmapDescriptorFactory.HUE_RED;
        if (f11 > BitmapDescriptorFactory.HUE_RED) {
            float f13 = 1.0f;
            if (f11 < 1.0f) {
                while (true) {
                    float f14 = (f12 + f13) / 2;
                    float b11 = b(this.f36282a, this.f36284c, f14);
                    if (Math.abs(f11 - b11) < 0.001f) {
                        return b(this.f36283b, this.f36285d, f14);
                    }
                    if (b11 < f11) {
                        f12 = f14;
                    } else {
                        f13 = f14;
                    }
                }
            }
        }
        return f11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f36282a == uVar.f36282a) {
                if (this.f36283b == uVar.f36283b) {
                    if (this.f36284c == uVar.f36284c) {
                        if (this.f36285d == uVar.f36285d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f36282a) * 31) + Float.hashCode(this.f36283b)) * 31) + Float.hashCode(this.f36284c)) * 31) + Float.hashCode(this.f36285d);
    }
}