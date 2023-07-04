package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes5.dex */
public class y0 implements org.bouncycastle.crypto.e {

    /* renamed from: a  reason: collision with root package name */
    private int f36968a;

    /* renamed from: b  reason: collision with root package name */
    private int f36969b;

    /* renamed from: c  reason: collision with root package name */
    private int f36970c;

    /* renamed from: d  reason: collision with root package name */
    private int f36971d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f36972e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f36973f;

    private int a(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        int i14 = (bArr[i11] << 24) | ((bArr[i12] & 255) << 16);
        return (bArr[i13 + 1] & 255) | i14 | ((bArr[i13] & 255) << 8);
    }

    private int b(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int a11 = a(bArr, i11);
        int a12 = a(bArr, i11 + 4);
        int i13 = -957401312;
        for (int i14 = 0; i14 != 32; i14++) {
            a12 -= (((a11 << 4) + this.f36970c) ^ (a11 + i13)) ^ ((a11 >>> 5) + this.f36971d);
            a11 -= (((a12 << 4) + this.f36968a) ^ (a12 + i13)) ^ ((a12 >>> 5) + this.f36969b);
            i13 += 1640531527;
        }
        e(a11, bArr2, i12);
        e(a12, bArr2, i12 + 4);
        return 8;
    }

    private int c(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int a11 = a(bArr, i11);
        int a12 = a(bArr, i11 + 4);
        int i13 = a11;
        int i14 = 0;
        for (int i15 = 0; i15 != 32; i15++) {
            i14 -= 1640531527;
            i13 += (((a12 << 4) + this.f36968a) ^ (a12 + i14)) ^ ((a12 >>> 5) + this.f36969b);
            a12 += (((i13 << 4) + this.f36970c) ^ (i13 + i14)) ^ ((i13 >>> 5) + this.f36971d);
        }
        e(i13, bArr2, i12);
        e(a12, bArr2, i12 + 4);
        return 8;
    }

    private void d(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        this.f36968a = a(bArr, 0);
        this.f36969b = a(bArr, 4);
        this.f36970c = a(bArr, 8);
        this.f36971d = a(bArr, 12);
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
        return "TEA";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof u50.b1) {
            this.f36973f = z11;
            this.f36972e = true;
            d(((u50.b1) iVar).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to TEA init - " + iVar.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (!this.f36972e) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i11 + 8 <= bArr.length) {
            if (i12 + 8 <= bArr2.length) {
                return this.f36973f ? c(bArr, i11, bArr2, i12) : b(bArr, i11, bArr2, i12);
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