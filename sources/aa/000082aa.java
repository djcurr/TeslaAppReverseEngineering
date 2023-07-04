package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes5.dex */
public class z implements org.bouncycastle.crypto.b0 {

    /* renamed from: d  reason: collision with root package name */
    private byte[] f36977d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f36978e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f36979f;

    /* renamed from: a  reason: collision with root package name */
    private int[] f36974a = new int[512];

    /* renamed from: b  reason: collision with root package name */
    private int[] f36975b = new int[512];

    /* renamed from: c  reason: collision with root package name */
    private int f36976c = 0;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f36980g = new byte[4];

    /* renamed from: h  reason: collision with root package name */
    private int f36981h = 0;

    private static int a(int i11, int i12) {
        return k(i11 - i12);
    }

    private static int b(int i11) {
        return (i11 >>> 3) ^ (m(i11, 7) ^ m(i11, 18));
    }

    private static int c(int i11) {
        return (i11 >>> 10) ^ (m(i11, 17) ^ m(i11, 19));
    }

    private int d(int i11, int i12, int i13) {
        return (m(i11, 10) ^ m(i13, 23)) + m(i12, 8);
    }

    private int e(int i11, int i12, int i13) {
        return (l(i11, 10) ^ l(i13, 23)) + l(i12, 8);
    }

    private byte f() {
        if (this.f36981h == 0) {
            int n11 = n();
            byte[] bArr = this.f36980g;
            bArr[0] = (byte) (n11 & 255);
            int i11 = n11 >> 8;
            bArr[1] = (byte) (i11 & 255);
            int i12 = i11 >> 8;
            bArr[2] = (byte) (i12 & 255);
            bArr[3] = (byte) ((i12 >> 8) & 255);
        }
        byte[] bArr2 = this.f36980g;
        int i13 = this.f36981h;
        byte b11 = bArr2[i13];
        this.f36981h = 3 & (i13 + 1);
        return b11;
    }

    private int g(int i11) {
        int[] iArr = this.f36975b;
        return iArr[i11 & 255] + iArr[((i11 >> 16) & 255) + 256];
    }

    private int h(int i11) {
        int[] iArr = this.f36974a;
        return iArr[i11 & 255] + iArr[((i11 >> 16) & 255) + 256];
    }

    private void i() {
        if (this.f36977d.length != 16) {
            throw new IllegalArgumentException("The key must be 128 bits long");
        }
        this.f36981h = 0;
        this.f36976c = 0;
        int[] iArr = new int[1280];
        for (int i11 = 0; i11 < 16; i11++) {
            int i12 = i11 >> 2;
            iArr[i12] = ((this.f36977d[i11] & 255) << ((i11 & 3) * 8)) | iArr[i12];
        }
        System.arraycopy(iArr, 0, iArr, 4, 4);
        int i13 = 0;
        while (true) {
            byte[] bArr = this.f36978e;
            if (i13 >= bArr.length || i13 >= 16) {
                break;
            }
            int i14 = (i13 >> 2) + 8;
            iArr[i14] = ((bArr[i13] & 255) << ((i13 & 3) * 8)) | iArr[i14];
            i13++;
        }
        System.arraycopy(iArr, 8, iArr, 12, 4);
        for (int i15 = 16; i15 < 1280; i15++) {
            iArr[i15] = c(iArr[i15 - 2]) + iArr[i15 - 7] + b(iArr[i15 - 15]) + iArr[i15 - 16] + i15;
        }
        System.arraycopy(iArr, 256, this.f36974a, 0, 512);
        System.arraycopy(iArr, 768, this.f36975b, 0, 512);
        for (int i16 = 0; i16 < 512; i16++) {
            this.f36974a[i16] = n();
        }
        for (int i17 = 0; i17 < 512; i17++) {
            this.f36975b[i17] = n();
        }
        this.f36976c = 0;
    }

    private static int j(int i11) {
        return i11 & 1023;
    }

    private static int k(int i11) {
        return i11 & 511;
    }

    private static int l(int i11, int i12) {
        return (i11 >>> (-i12)) | (i11 << i12);
    }

    private static int m(int i11, int i12) {
        return (i11 << (-i12)) | (i11 >>> i12);
    }

    private int n() {
        int h11;
        int i11;
        int k11 = k(this.f36976c);
        if (this.f36976c < 512) {
            int[] iArr = this.f36974a;
            iArr[k11] = iArr[k11] + d(iArr[a(k11, 3)], this.f36974a[a(k11, 10)], this.f36974a[a(k11, 511)]);
            h11 = g(this.f36974a[a(k11, 12)]);
            i11 = this.f36974a[k11];
        } else {
            int[] iArr2 = this.f36975b;
            iArr2[k11] = iArr2[k11] + e(iArr2[a(k11, 3)], this.f36975b[a(k11, 10)], this.f36975b[a(k11, 511)]);
            h11 = h(this.f36975b[a(k11, 12)]);
            i11 = this.f36975b[k11];
        }
        int i12 = i11 ^ h11;
        this.f36976c = j(this.f36976c + 1);
        return i12;
    }

    @Override // org.bouncycastle.crypto.b0
    public String getAlgorithmName() {
        return "HC-128";
    }

    @Override // org.bouncycastle.crypto.b0
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.i iVar2;
        if (iVar instanceof u50.f1) {
            u50.f1 f1Var = (u50.f1) iVar;
            this.f36978e = f1Var.a();
            iVar2 = f1Var.b();
        } else {
            this.f36978e = new byte[0];
            iVar2 = iVar;
        }
        if (iVar2 instanceof u50.b1) {
            this.f36977d = ((u50.b1) iVar2).a();
            i();
            this.f36979f = true;
            return;
        }
        throw new IllegalArgumentException("Invalid parameter passed to HC128 init - " + iVar.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.b0
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (!this.f36979f) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i11 + i12 <= bArr.length) {
            if (i13 + i12 <= bArr2.length) {
                for (int i14 = 0; i14 < i12; i14++) {
                    bArr2[i13 + i14] = (byte) (bArr[i11 + i14] ^ f());
                }
                return i12;
            }
            throw new OutputLengthException("output buffer too short");
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    @Override // org.bouncycastle.crypto.b0
    public void reset() {
        i();
    }
}