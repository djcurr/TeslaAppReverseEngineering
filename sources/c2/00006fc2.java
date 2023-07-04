package g30;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class j extends j1<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f27602a;

    /* renamed from: b  reason: collision with root package name */
    private int f27603b;

    public j(byte[] bufferWithData) {
        kotlin.jvm.internal.s.g(bufferWithData, "bufferWithData");
        this.f27602a = bufferWithData;
        this.f27603b = bufferWithData.length;
        b(10);
    }

    @Override // g30.j1
    public void b(int i11) {
        int d11;
        byte[] bArr = this.f27602a;
        if (bArr.length < i11) {
            d11 = m00.l.d(i11, bArr.length * 2);
            byte[] copyOf = Arrays.copyOf(bArr, d11);
            kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
            this.f27602a = copyOf;
        }
    }

    @Override // g30.j1
    public int d() {
        return this.f27603b;
    }

    public final void e(byte b11) {
        j1.c(this, 0, 1, null);
        byte[] bArr = this.f27602a;
        int d11 = d();
        this.f27603b = d11 + 1;
        bArr[d11] = b11;
    }

    @Override // g30.j1
    /* renamed from: f */
    public byte[] a() {
        byte[] copyOf = Arrays.copyOf(this.f27602a, d());
        kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}