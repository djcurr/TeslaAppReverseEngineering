package g30;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class i0 extends j1<int[]> {

    /* renamed from: a  reason: collision with root package name */
    private int[] f27599a;

    /* renamed from: b  reason: collision with root package name */
    private int f27600b;

    public i0(int[] bufferWithData) {
        kotlin.jvm.internal.s.g(bufferWithData, "bufferWithData");
        this.f27599a = bufferWithData;
        this.f27600b = bufferWithData.length;
        b(10);
    }

    @Override // g30.j1
    public void b(int i11) {
        int d11;
        int[] iArr = this.f27599a;
        if (iArr.length < i11) {
            d11 = m00.l.d(i11, iArr.length * 2);
            int[] copyOf = Arrays.copyOf(iArr, d11);
            kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
            this.f27599a = copyOf;
        }
    }

    @Override // g30.j1
    public int d() {
        return this.f27600b;
    }

    public final void e(int i11) {
        j1.c(this, 0, 1, null);
        int[] iArr = this.f27599a;
        int d11 = d();
        this.f27600b = d11 + 1;
        iArr[d11] = i11;
    }

    @Override // g30.j1
    /* renamed from: f */
    public int[] a() {
        int[] copyOf = Arrays.copyOf(this.f27599a, d());
        kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}