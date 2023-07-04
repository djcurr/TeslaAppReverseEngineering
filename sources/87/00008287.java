package l50;

import u50.k1;

/* loaded from: classes5.dex */
public class i0 implements org.bouncycastle.crypto.e {

    /* renamed from: a  reason: collision with root package name */
    private int f36776a = 12;

    /* renamed from: b  reason: collision with root package name */
    private long[] f36777b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36778c;

    private long a(byte[] bArr, int i11) {
        long j11 = 0;
        for (int i12 = 7; i12 >= 0; i12--) {
            j11 = (j11 << 8) + (bArr[i12 + i11] & 255);
        }
        return j11;
    }

    private int b(byte[] bArr, int i11, byte[] bArr2, int i12) {
        long a11 = a(bArr, i11);
        long a12 = a(bArr, i11 + 8);
        for (int i13 = this.f36776a; i13 >= 1; i13--) {
            int i14 = i13 * 2;
            a12 = e(a12 - this.f36777b[i14 + 1], a11) ^ a11;
            a11 = e(a11 - this.f36777b[i14], a12) ^ a12;
        }
        g(a11 - this.f36777b[0], bArr2, i12);
        g(a12 - this.f36777b[1], bArr2, i12 + 8);
        return 16;
    }

    private int c(byte[] bArr, int i11, byte[] bArr2, int i12) {
        long a11 = a(bArr, i11) + this.f36777b[0];
        long a12 = a(bArr, i11 + 8) + this.f36777b[1];
        for (int i13 = 1; i13 <= this.f36776a; i13++) {
            int i14 = i13 * 2;
            a11 = d(a11 ^ a12, a12) + this.f36777b[i14];
            a12 = d(a12 ^ a11, a11) + this.f36777b[i14 + 1];
        }
        g(a11, bArr2, i12);
        g(a12, bArr2, i12 + 8);
        return 16;
    }

    private long d(long j11, long j12) {
        long j13 = j12 & 63;
        return (j11 >>> ((int) (64 - j13))) | (j11 << ((int) j13));
    }

    private long e(long j11, long j12) {
        long j13 = j12 & 63;
        return (j11 << ((int) (64 - j13))) | (j11 >>> ((int) j13));
    }

    private void f(byte[] bArr) {
        long[] jArr;
        int length = (bArr.length + 7) / 8;
        long[] jArr2 = new long[length];
        for (int i11 = 0; i11 != bArr.length; i11++) {
            int i12 = i11 / 8;
            jArr2[i12] = jArr2[i12] + ((bArr[i11] & 255) << ((i11 % 8) * 8));
        }
        long[] jArr3 = new long[(this.f36776a + 1) * 2];
        this.f36777b = jArr3;
        jArr3[0] = -5196783011329398165L;
        int i13 = 1;
        while (true) {
            jArr = this.f36777b;
            if (i13 >= jArr.length) {
                break;
            }
            jArr[i13] = jArr[i13 - 1] - 7046029254386353131L;
            i13++;
        }
        int length2 = length > jArr.length ? length * 3 : jArr.length * 3;
        long j11 = 0;
        long j12 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length2; i16++) {
            long[] jArr4 = this.f36777b;
            j11 = d(jArr4[i14] + j11 + j12, 3L);
            jArr4[i14] = j11;
            j12 = d(jArr2[i15] + j11 + j12, j12 + j11);
            jArr2[i15] = j12;
            i14 = (i14 + 1) % this.f36777b.length;
            i15 = (i15 + 1) % length;
        }
    }

    private void g(long j11, byte[] bArr, int i11) {
        for (int i12 = 0; i12 < 8; i12++) {
            bArr[i12 + i11] = (byte) j11;
            j11 >>>= 8;
        }
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "RC5-64";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof k1)) {
            throw new IllegalArgumentException("invalid parameter passed to RC564 init - " + iVar.getClass().getName());
        }
        k1 k1Var = (k1) iVar;
        this.f36778c = z11;
        this.f36776a = k1Var.b();
        f(k1Var.a());
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        return this.f36778c ? c(bArr, i11, bArr2, i12) : b(bArr, i11, bArr2, i12);
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}