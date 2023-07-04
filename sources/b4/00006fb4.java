package g30;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class g extends j1<boolean[]> {

    /* renamed from: a  reason: collision with root package name */
    private boolean[] f27576a;

    /* renamed from: b  reason: collision with root package name */
    private int f27577b;

    public g(boolean[] bufferWithData) {
        kotlin.jvm.internal.s.g(bufferWithData, "bufferWithData");
        this.f27576a = bufferWithData;
        this.f27577b = bufferWithData.length;
        b(10);
    }

    @Override // g30.j1
    public void b(int i11) {
        int d11;
        boolean[] zArr = this.f27576a;
        if (zArr.length < i11) {
            d11 = m00.l.d(i11, zArr.length * 2);
            boolean[] copyOf = Arrays.copyOf(zArr, d11);
            kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
            this.f27576a = copyOf;
        }
    }

    @Override // g30.j1
    public int d() {
        return this.f27577b;
    }

    public final void e(boolean z11) {
        j1.c(this, 0, 1, null);
        boolean[] zArr = this.f27576a;
        int d11 = d();
        this.f27577b = d11 + 1;
        zArr[d11] = z11;
    }

    @Override // g30.j1
    /* renamed from: f */
    public boolean[] a() {
        boolean[] copyOf = Arrays.copyOf(this.f27576a, d());
        kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}