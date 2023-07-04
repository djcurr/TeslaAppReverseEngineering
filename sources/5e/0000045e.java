package androidx.compose.ui.platform;

import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class c1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final h00.p<T, Matrix, vz.b0> f2859a;

    /* renamed from: b  reason: collision with root package name */
    private Matrix f2860b;

    /* renamed from: c  reason: collision with root package name */
    private Matrix f2861c;

    /* renamed from: d  reason: collision with root package name */
    private float[] f2862d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f2863e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2864f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2865g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2866h;

    /* JADX WARN: Multi-variable type inference failed */
    public c1(h00.p<? super T, ? super Matrix, vz.b0> getMatrix) {
        kotlin.jvm.internal.s.g(getMatrix, "getMatrix");
        this.f2859a = getMatrix;
        this.f2864f = true;
        this.f2865g = true;
        this.f2866h = true;
    }

    public final float[] a(T t11) {
        float[] fArr = this.f2863e;
        if (fArr == null) {
            fArr = t1.k0.b(null, 1, null);
            this.f2863e = fArr;
        }
        if (this.f2865g) {
            this.f2866h = a1.a(b(t11), fArr);
            this.f2865g = false;
        }
        if (this.f2866h) {
            return fArr;
        }
        return null;
    }

    public final float[] b(T t11) {
        float[] fArr = this.f2862d;
        if (fArr == null) {
            fArr = t1.k0.b(null, 1, null);
            this.f2862d = fArr;
        }
        if (this.f2864f) {
            Matrix matrix = this.f2860b;
            if (matrix == null) {
                matrix = new Matrix();
                this.f2860b = matrix;
            }
            this.f2859a.invoke(t11, matrix);
            Matrix matrix2 = this.f2861c;
            if (matrix2 == null || !kotlin.jvm.internal.s.c(matrix, matrix2)) {
                t1.g.b(fArr, matrix);
                this.f2860b = matrix2;
                this.f2861c = matrix;
            }
            this.f2864f = false;
            return fArr;
        }
        return fArr;
    }

    public final void c() {
        this.f2864f = true;
        this.f2865g = true;
    }
}