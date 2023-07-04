package g30;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class s0 extends j1<long[]> {

    /* renamed from: a  reason: collision with root package name */
    private long[] f27636a;

    /* renamed from: b  reason: collision with root package name */
    private int f27637b;

    public s0(long[] bufferWithData) {
        kotlin.jvm.internal.s.g(bufferWithData, "bufferWithData");
        this.f27636a = bufferWithData;
        this.f27637b = bufferWithData.length;
        b(10);
    }

    @Override // g30.j1
    public void b(int i11) {
        int d11;
        long[] jArr = this.f27636a;
        if (jArr.length < i11) {
            d11 = m00.l.d(i11, jArr.length * 2);
            long[] copyOf = Arrays.copyOf(jArr, d11);
            kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
            this.f27636a = copyOf;
        }
    }

    @Override // g30.j1
    public int d() {
        return this.f27637b;
    }

    public final void e(long j11) {
        j1.c(this, 0, 1, null);
        long[] jArr = this.f27636a;
        int d11 = d();
        this.f27637b = d11 + 1;
        jArr[d11] = j11;
    }

    @Override // g30.j1
    /* renamed from: f */
    public long[] a() {
        long[] copyOf = Arrays.copyOf(this.f27636a, d());
        kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}