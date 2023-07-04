package gk;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* loaded from: classes3.dex */
public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f28003a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f28004b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f28005c = new Matrix();

    public Matrix a(float f11, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f28003a);
        matrix2.getValues(this.f28004b);
        for (int i11 = 0; i11 < 9; i11++) {
            float[] fArr = this.f28004b;
            float f12 = fArr[i11];
            float[] fArr2 = this.f28003a;
            fArr[i11] = fArr2[i11] + ((f12 - fArr2[i11]) * f11);
        }
        this.f28005c.setValues(this.f28004b);
        return this.f28005c;
    }
}