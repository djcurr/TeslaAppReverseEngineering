package x3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
class a implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f57023a;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f57024b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i11 = ((int) (length / 0.002f)) + 1;
        this.f57023a = new float[i11];
        this.f57024b = new float[i11];
        float[] fArr = new float[2];
        for (int i12 = 0; i12 < i11; i12++) {
            pathMeasure.getPosTan((i12 * length) / (i11 - 1), fArr, null);
            this.f57023a[i12] = fArr[0];
            this.f57024b[i12] = fArr[1];
        }
    }

    private static Path a(float f11, float f12, float f13, float f14) {
        Path path = new Path();
        path.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        path.cubicTo(f11, f12, f13, f14, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f11 >= 1.0f) {
            return 1.0f;
        }
        int i11 = 0;
        int length = this.f57023a.length - 1;
        while (length - i11 > 1) {
            int i12 = (i11 + length) / 2;
            if (f11 < this.f57023a[i12]) {
                length = i12;
            } else {
                i11 = i12;
            }
        }
        float[] fArr = this.f57023a;
        float f12 = fArr[length] - fArr[i11];
        if (f12 == BitmapDescriptorFactory.HUE_RED) {
            return this.f57024b[i11];
        }
        float[] fArr2 = this.f57024b;
        float f13 = fArr2[i11];
        return f13 + (((f11 - fArr[i11]) / f12) * (fArr2[length] - f13));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(float f11, float f12, float f13, float f14) {
        this(a(f11, f12, f13, f14));
    }
}