package g30;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class r1 extends j1<short[]> {

    /* renamed from: a  reason: collision with root package name */
    private short[] f27632a;

    /* renamed from: b  reason: collision with root package name */
    private int f27633b;

    public r1(short[] bufferWithData) {
        kotlin.jvm.internal.s.g(bufferWithData, "bufferWithData");
        this.f27632a = bufferWithData;
        this.f27633b = bufferWithData.length;
        b(10);
    }

    @Override // g30.j1
    public void b(int i11) {
        int d11;
        short[] sArr = this.f27632a;
        if (sArr.length < i11) {
            d11 = m00.l.d(i11, sArr.length * 2);
            short[] copyOf = Arrays.copyOf(sArr, d11);
            kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
            this.f27632a = copyOf;
        }
    }

    @Override // g30.j1
    public int d() {
        return this.f27633b;
    }

    public final void e(short s11) {
        j1.c(this, 0, 1, null);
        short[] sArr = this.f27632a;
        int d11 = d();
        this.f27633b = d11 + 1;
        sArr[d11] = s11;
    }

    @Override // g30.j1
    /* renamed from: f */
    public short[] a() {
        short[] copyOf = Arrays.copyOf(this.f27632a, d());
        kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}