package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes5.dex */
public class f1 implements org.bouncycastle.crypto.e {

    /* renamed from: a  reason: collision with root package name */
    private int[] f36724a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    private int[] f36725b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    private int[] f36726c = new int[32];

    /* renamed from: d  reason: collision with root package name */
    private boolean f36727d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f36728e;

    private int a(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        int i14 = (bArr[i11] << 24) | ((bArr[i12] & 255) << 16);
        return (bArr[i13 + 1] & 255) | i14 | ((bArr[i13] & 255) << 8);
    }

    private int b(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int a11 = a(bArr, i11);
        int a12 = a(bArr, i11 + 4);
        for (int i13 = 31; i13 >= 0; i13--) {
            a12 -= (((a11 << 4) ^ (a11 >>> 5)) + a11) ^ this.f36726c[i13];
            a11 -= (((a12 << 4) ^ (a12 >>> 5)) + a12) ^ this.f36725b[i13];
        }
        e(a11, bArr2, i12);
        e(a12, bArr2, i12 + 4);
        return 8;
    }

    private int c(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int a11 = a(bArr, i11);
        int a12 = a(bArr, i11 + 4);
        for (int i13 = 0; i13 < 32; i13++) {
            a11 += (((a12 << 4) ^ (a12 >>> 5)) + a12) ^ this.f36725b[i13];
            a12 += (((a11 << 4) ^ (a11 >>> 5)) + a11) ^ this.f36726c[i13];
        }
        e(a11, bArr2, i12);
        e(a12, bArr2, i12 + 4);
        return 8;
    }

    private void d(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < 4) {
            this.f36724a[i11] = a(bArr, i12);
            i11++;
            i12 += 4;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 32; i14++) {
            int[] iArr = this.f36725b;
            int[] iArr2 = this.f36724a;
            iArr[i14] = iArr2[i13 & 3] + i13;
            i13 -= 1640531527;
            this.f36726c[i14] = iArr2[(i13 >>> 11) & 3] + i13;
        }
    }

    private void e(int i11, byte[] bArr, int i12) {
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i11 >>> 24);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i11 >>> 16);
        bArr[i14] = (byte) (i11 >>> 8);
        bArr[i14 + 1] = (byte) i11;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "XTEA";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof u50.b1) {
            this.f36728e = z11;
            this.f36727d = true;
            d(((u50.b1) iVar).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to TEA init - " + iVar.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (!this.f36727d) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i11 + 8 <= bArr.length) {
            if (i12 + 8 <= bArr2.length) {
                return this.f36728e ? c(bArr, i11, bArr2, i12) : b(bArr, i11, bArr2, i12);
            }
            throw new OutputLengthException("output buffer too short");
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}