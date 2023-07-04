package e2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private final int f24532a;

    /* renamed from: b  reason: collision with root package name */
    private final Float[] f24533b;

    public d(int i11) {
        this.f24532a = i11;
        Float[] fArr = new Float[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i12] = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        }
        this.f24533b = fArr;
    }

    public final float a(int i11) {
        return this.f24533b[i11].floatValue();
    }

    public final float b() {
        return (float) Math.sqrt(d(this));
    }

    public final void c(int i11, float f11) {
        this.f24533b[i11] = Float.valueOf(f11);
    }

    public final float d(d a11) {
        s.g(a11, "a");
        int i11 = this.f24532a;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        for (int i12 = 0; i12 < i11; i12++) {
            f11 += a(i12) * a11.a(i12);
        }
        return f11;
    }
}