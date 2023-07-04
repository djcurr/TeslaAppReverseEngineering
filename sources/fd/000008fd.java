package androidx.transition;

import android.animation.TypeEvaluator;

/* loaded from: classes.dex */
class g implements TypeEvaluator<float[]> {

    /* renamed from: a  reason: collision with root package name */
    private float[] f6139a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(float[] fArr) {
        this.f6139a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a */
    public float[] evaluate(float f11, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f6139a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i11 = 0; i11 < fArr3.length; i11++) {
            float f12 = fArr[i11];
            fArr3[i11] = f12 + ((fArr2[i11] - f12) * f11);
        }
        return fArr3;
    }
}