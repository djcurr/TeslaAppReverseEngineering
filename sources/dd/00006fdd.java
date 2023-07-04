package g30;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class s extends j1<double[]> {

    /* renamed from: a  reason: collision with root package name */
    private double[] f27634a;

    /* renamed from: b  reason: collision with root package name */
    private int f27635b;

    public s(double[] bufferWithData) {
        kotlin.jvm.internal.s.g(bufferWithData, "bufferWithData");
        this.f27634a = bufferWithData;
        this.f27635b = bufferWithData.length;
        b(10);
    }

    @Override // g30.j1
    public void b(int i11) {
        int d11;
        double[] dArr = this.f27634a;
        if (dArr.length < i11) {
            d11 = m00.l.d(i11, dArr.length * 2);
            double[] copyOf = Arrays.copyOf(dArr, d11);
            kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
            this.f27634a = copyOf;
        }
    }

    @Override // g30.j1
    public int d() {
        return this.f27635b;
    }

    public final void e(double d11) {
        j1.c(this, 0, 1, null);
        double[] dArr = this.f27634a;
        int d12 = d();
        this.f27635b = d12 + 1;
        dArr[d12] = d11;
    }

    @Override // g30.j1
    /* renamed from: f */
    public double[] a() {
        double[] copyOf = Arrays.copyOf(this.f27634a, d());
        kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}