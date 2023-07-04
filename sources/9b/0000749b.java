package i4;

import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f29836a;

    /* renamed from: b  reason: collision with root package name */
    private final float f29837b;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(float[] fArr) {
        this.f29836a = fArr;
        this.f29837b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        if (f11 >= 1.0f) {
            return 1.0f;
        }
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float[] fArr = this.f29836a;
        int min = Math.min((int) ((fArr.length - 1) * f11), fArr.length - 2);
        float f12 = this.f29837b;
        float f13 = (f11 - (min * f12)) / f12;
        float[] fArr2 = this.f29836a;
        return fArr2[min] + (f13 * (fArr2[min + 1] - fArr2[min]));
    }
}