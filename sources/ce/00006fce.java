package g30;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class n extends j1<char[]> {

    /* renamed from: a  reason: collision with root package name */
    private char[] f27616a;

    /* renamed from: b  reason: collision with root package name */
    private int f27617b;

    public n(char[] bufferWithData) {
        kotlin.jvm.internal.s.g(bufferWithData, "bufferWithData");
        this.f27616a = bufferWithData;
        this.f27617b = bufferWithData.length;
        b(10);
    }

    @Override // g30.j1
    public void b(int i11) {
        int d11;
        char[] cArr = this.f27616a;
        if (cArr.length < i11) {
            d11 = m00.l.d(i11, cArr.length * 2);
            char[] copyOf = Arrays.copyOf(cArr, d11);
            kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
            this.f27616a = copyOf;
        }
    }

    @Override // g30.j1
    public int d() {
        return this.f27617b;
    }

    public final void e(char c11) {
        j1.c(this, 0, 1, null);
        char[] cArr = this.f27616a;
        int d11 = d();
        this.f27617b = d11 + 1;
        cArr[d11] = c11;
    }

    @Override // g30.j1
    /* renamed from: f */
    public char[] a() {
        char[] copyOf = Arrays.copyOf(this.f27616a, d());
        kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}