package ci;

import ak.k0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: d  reason: collision with root package name */
    public static final l f9244d = new l(1.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f9245a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9246b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9247c;

    public l(float f11) {
        this(f11, 1.0f);
    }

    public long a(long j11) {
        return j11 * this.f9247c;
    }

    public l b(float f11) {
        return new l(f11, this.f9246b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f9245a == lVar.f9245a && this.f9246b == lVar.f9246b;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f9245a)) * 31) + Float.floatToRawIntBits(this.f9246b);
    }

    public String toString() {
        return k0.D("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f9245a), Float.valueOf(this.f9246b));
    }

    public l(float f11, float f12) {
        ak.a.a(f11 > BitmapDescriptorFactory.HUE_RED);
        ak.a.a(f12 > BitmapDescriptorFactory.HUE_RED);
        this.f9245a = f11;
        this.f9246b = f12;
        this.f9247c = Math.round(f11 * 1000.0f);
    }
}