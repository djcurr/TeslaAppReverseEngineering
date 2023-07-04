package g30;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class y extends j1<float[]> {

    /* renamed from: a  reason: collision with root package name */
    private float[] f27688a;

    /* renamed from: b  reason: collision with root package name */
    private int f27689b;

    public y(float[] bufferWithData) {
        kotlin.jvm.internal.s.g(bufferWithData, "bufferWithData");
        this.f27688a = bufferWithData;
        this.f27689b = bufferWithData.length;
        b(10);
    }

    @Override // g30.j1
    public void b(int i11) {
        int d11;
        float[] fArr = this.f27688a;
        if (fArr.length < i11) {
            d11 = m00.l.d(i11, fArr.length * 2);
            float[] copyOf = Arrays.copyOf(fArr, d11);
            kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
            this.f27688a = copyOf;
        }
    }

    @Override // g30.j1
    public int d() {
        return this.f27689b;
    }

    public final void e(float f11) {
        j1.c(this, 0, 1, null);
        float[] fArr = this.f27688a;
        int d11 = d();
        this.f27689b = d11 + 1;
        fArr[d11] = f11;
    }

    @Override // g30.j1
    /* renamed from: f */
    public float[] a() {
        float[] copyOf = Arrays.copyOf(this.f27688a, d());
        kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}