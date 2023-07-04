package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes5.dex */
public class j0 implements org.bouncycastle.crypto.e {

    /* renamed from: a  reason: collision with root package name */
    private int[] f36795a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f36796b;

    private int a(byte[] bArr, int i11) {
        int i12 = 0;
        for (int i13 = 3; i13 >= 0; i13--) {
            i12 = (i12 << 8) + (bArr[i13 + i11] & 255);
        }
        return i12;
    }

    private int b(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int a11 = a(bArr, i11);
        int a12 = a(bArr, i11 + 4);
        int a13 = a(bArr, i11 + 8);
        int a14 = a(bArr, i11 + 12);
        int[] iArr = this.f36795a;
        int i13 = a13 - iArr[43];
        int i14 = a11 - iArr[42];
        int i15 = 20;
        while (i15 >= 1) {
            int d11 = d(((i14 * 2) + 1) * i14, 5);
            int d12 = d(((i13 * 2) + 1) * i13, 5);
            int i16 = i15 * 2;
            i15--;
            int i17 = i14;
            i14 = e(a14 - this.f36795a[i16], d12) ^ d11;
            a14 = i13;
            i13 = e(a12 - this.f36795a[i16 + 1], d11) ^ d12;
            a12 = i17;
        }
        int[] iArr2 = this.f36795a;
        g(i14, bArr2, i12);
        g(a12 - iArr2[0], bArr2, i12 + 4);
        g(i13, bArr2, i12 + 8);
        g(a14 - iArr2[1], bArr2, i12 + 12);
        return 16;
    }

    private int c(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int a11 = a(bArr, i11);
        int a12 = a(bArr, i11 + 4);
        int a13 = a(bArr, i11 + 8);
        int a14 = a(bArr, i11 + 12);
        int[] iArr = this.f36795a;
        int i13 = a12 + iArr[0];
        int i14 = a14 + iArr[1];
        int i15 = 1;
        while (i15 <= 20) {
            int d11 = d(((i13 * 2) + 1) * i13, 5);
            int d12 = d(((i14 * 2) + 1) * i14, 5);
            int i16 = i15 * 2;
            int d13 = d(a13 ^ d12, d11) + this.f36795a[i16 + 1];
            i15++;
            a13 = i14;
            i14 = d(a11 ^ d11, d12) + this.f36795a[i16];
            a11 = i13;
            i13 = d13;
        }
        int[] iArr2 = this.f36795a;
        int i17 = a13 + iArr2[43];
        g(a11 + iArr2[42], bArr2, i12);
        g(i13, bArr2, i12 + 4);
        g(i17, bArr2, i12 + 8);
        g(i14, bArr2, i12 + 12);
        return 16;
    }

    private int d(int i11, int i12) {
        return (i11 >>> (-i12)) | (i11 << i12);
    }

    private int e(int i11, int i12) {
        return (i11 << (-i12)) | (i11 >>> i12);
    }

    private void f(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int length2 = ((bArr.length + 4) - 1) / 4;
        int[] iArr2 = new int[length2];
        for (int length3 = bArr.length - 1; length3 >= 0; length3--) {
            int i11 = length3 / 4;
            iArr2[i11] = (iArr2[i11] << 8) + (bArr[length3] & 255);
        }
        int[] iArr3 = new int[44];
        this.f36795a = iArr3;
        iArr3[0] = -1209970333;
        int i12 = 1;
        while (true) {
            iArr = this.f36795a;
            if (i12 >= iArr.length) {
                break;
            }
            iArr[i12] = iArr[i12 - 1] - 1640531527;
            i12++;
        }
        int length4 = length2 > iArr.length ? length2 * 3 : iArr.length * 3;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < length4; i17++) {
            int[] iArr4 = this.f36795a;
            i14 = d(iArr4[i13] + i14 + i15, 3);
            iArr4[i13] = i14;
            i15 = d(iArr2[i16] + i14 + i15, i15 + i14);
            iArr2[i16] = i15;
            i13 = (i13 + 1) % this.f36795a.length;
            i16 = (i16 + 1) % length2;
        }
    }

    private void g(int i11, byte[] bArr, int i12) {
        for (int i13 = 0; i13 < 4; i13++) {
            bArr[i13 + i12] = (byte) i11;
            i11 >>>= 8;
        }
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "RC6";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof u50.b1) {
            this.f36796b = z11;
            f(((u50.b1) iVar).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to RC6 init - " + iVar.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int blockSize = getBlockSize();
        if (this.f36795a != null) {
            if (i11 + blockSize <= bArr.length) {
                if (blockSize + i12 <= bArr2.length) {
                    return this.f36796b ? c(bArr, i11, bArr2, i12) : b(bArr, i11, bArr2, i12);
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("RC6 engine not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}