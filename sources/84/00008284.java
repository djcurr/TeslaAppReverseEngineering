package l50;

import u50.k1;

/* loaded from: classes5.dex */
public class h0 implements org.bouncycastle.crypto.e {

    /* renamed from: a  reason: collision with root package name */
    private int f36768a = 12;

    /* renamed from: b  reason: collision with root package name */
    private int[] f36769b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36770c;

    private int a(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    private int b(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int a11 = a(bArr, i11);
        int a12 = a(bArr, i11 + 4);
        for (int i13 = this.f36768a; i13 >= 1; i13--) {
            int i14 = i13 * 2;
            a12 = e(a12 - this.f36769b[i14 + 1], a11) ^ a11;
            a11 = e(a11 - this.f36769b[i14], a12) ^ a12;
        }
        g(a11 - this.f36769b[0], bArr2, i12);
        g(a12 - this.f36769b[1], bArr2, i12 + 4);
        return 8;
    }

    private int c(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int a11 = a(bArr, i11) + this.f36769b[0];
        int a12 = a(bArr, i11 + 4) + this.f36769b[1];
        for (int i13 = 1; i13 <= this.f36768a; i13++) {
            int i14 = i13 * 2;
            a11 = d(a11 ^ a12, a12) + this.f36769b[i14];
            a12 = d(a12 ^ a11, a11) + this.f36769b[i14 + 1];
        }
        g(a11, bArr2, i12);
        g(a12, bArr2, i12 + 4);
        return 8;
    }

    private int d(int i11, int i12) {
        int i13 = i12 & 31;
        return (i11 >>> (32 - i13)) | (i11 << i13);
    }

    private int e(int i11, int i12) {
        int i13 = i12 & 31;
        return (i11 << (32 - i13)) | (i11 >>> i13);
    }

    private void f(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length];
        for (int i11 = 0; i11 != bArr.length; i11++) {
            int i12 = i11 / 4;
            iArr2[i12] = iArr2[i12] + ((bArr[i11] & 255) << ((i11 % 4) * 8));
        }
        int[] iArr3 = new int[(this.f36768a + 1) * 2];
        this.f36769b = iArr3;
        iArr3[0] = -1209970333;
        int i13 = 1;
        while (true) {
            iArr = this.f36769b;
            if (i13 >= iArr.length) {
                break;
            }
            iArr[i13] = iArr[i13 - 1] - 1640531527;
            i13++;
        }
        int length2 = length > iArr.length ? length * 3 : iArr.length * 3;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < length2; i18++) {
            int[] iArr4 = this.f36769b;
            i15 = d(iArr4[i14] + i15 + i16, 3);
            iArr4[i14] = i15;
            i16 = d(iArr2[i17] + i15 + i16, i16 + i15);
            iArr2[i17] = i16;
            i14 = (i14 + 1) % this.f36769b.length;
            i17 = (i17 + 1) % length;
        }
    }

    private void g(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >> 8);
        bArr[i12 + 2] = (byte) (i11 >> 16);
        bArr[i12 + 3] = (byte) (i11 >> 24);
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "RC5-32";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof k1) {
            k1 k1Var = (k1) iVar;
            this.f36768a = k1Var.b();
            f(k1Var.a());
        } else if (!(iVar instanceof u50.b1)) {
            throw new IllegalArgumentException("invalid parameter passed to RC532 init - " + iVar.getClass().getName());
        } else {
            f(((u50.b1) iVar).a());
        }
        this.f36770c = z11;
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        return this.f36770c ? c(bArr, i11, bArr2, i12) : b(bArr, i11, bArr2, i12);
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}