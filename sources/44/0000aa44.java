package p50;

import org.bouncycastle.crypto.v;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;
import u50.b1;
import u50.f1;
import u50.h1;

/* loaded from: classes5.dex */
public class f implements v {

    /* renamed from: a  reason: collision with root package name */
    private int f46238a = 8;

    /* renamed from: b  reason: collision with root package name */
    private int f46239b = 4;

    /* renamed from: f  reason: collision with root package name */
    private boolean f46243f = true;

    /* renamed from: g  reason: collision with root package name */
    private int[] f46244g = null;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f46245h = null;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f46246i = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};

    /* renamed from: e  reason: collision with root package name */
    private byte[] f46242e = new byte[8];

    /* renamed from: d  reason: collision with root package name */
    private byte[] f46241d = new byte[8];

    /* renamed from: c  reason: collision with root package name */
    private int f46240c = 0;

    private byte[] a(byte[] bArr, int i11, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length - i11];
        System.arraycopy(bArr, i11, bArr3, 0, bArr2.length);
        for (int i12 = 0; i12 != bArr2.length; i12++) {
            bArr3[i12] = (byte) (bArr3[i12] ^ bArr2[i12]);
        }
        return bArr3;
    }

    private int b(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] << 24) & (-16777216)) + ((bArr[i11 + 2] << Tnaf.POW_2_WIDTH) & 16711680) + ((bArr[i11 + 1] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) + (bArr[i11] & 255);
    }

    private int[] c(byte[] bArr) {
        if (bArr.length == 32) {
            int[] iArr = new int[8];
            for (int i11 = 0; i11 != 8; i11++) {
                iArr[i11] = b(bArr, i11 * 4);
            }
            return iArr;
        }
        throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
    }

    private void d(int[] iArr, byte[] bArr, int i11, byte[] bArr2, int i12) {
        int b11 = b(bArr, i11);
        int b12 = b(bArr, i11 + 4);
        for (int i13 = 0; i13 < 2; i13++) {
            int i14 = 0;
            while (i14 < 8) {
                i14++;
                int i15 = b11;
                b11 = b12 ^ e(b11, iArr[i14]);
                b12 = i15;
            }
        }
        f(b11, bArr2, i12);
        f(b12, bArr2, i12 + 4);
    }

    private int e(int i11, int i12) {
        int i13 = i12 + i11;
        byte[] bArr = this.f46246i;
        int i14 = (bArr[((i13 >> 0) & 15) + 0] << 0) + (bArr[((i13 >> 4) & 15) + 16] << 4) + (bArr[((i13 >> 8) & 15) + 32] << 8) + (bArr[((i13 >> 12) & 15) + 48] << 12) + (bArr[((i13 >> 16) & 15) + 64] << Tnaf.POW_2_WIDTH) + (bArr[((i13 >> 20) & 15) + 80] << 20) + (bArr[((i13 >> 24) & 15) + 96] << 24) + (bArr[((i13 >> 28) & 15) + 112] << 28);
        return (i14 << 11) | (i14 >>> 21);
    }

    private void f(int i11, byte[] bArr, int i12) {
        bArr[i12 + 3] = (byte) (i11 >>> 24);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12] = (byte) i11;
    }

    private void g(org.bouncycastle.crypto.i iVar) {
        if (iVar == null) {
            return;
        }
        org.bouncycastle.crypto.i iVar2 = null;
        if (iVar instanceof h1) {
            h1 h1Var = (h1) iVar;
            System.arraycopy(h1Var.b(), 0, this.f46246i, 0, h1Var.b().length);
            iVar2 = h1Var.a();
        } else if (iVar instanceof b1) {
            this.f46244g = c(((b1) iVar).a());
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("invalid parameter passed to GOST28147 init - " + iVar.getClass().getName());
        } else {
            f1 f1Var = (f1) iVar;
            byte[] a11 = f1Var.a();
            byte[] bArr = this.f46242e;
            System.arraycopy(a11, 0, bArr, 0, bArr.length);
            this.f46245h = f1Var.a();
            iVar2 = f1Var.b();
        }
        g(iVar2);
    }

    @Override // org.bouncycastle.crypto.v
    public int doFinal(byte[] bArr, int i11) {
        while (true) {
            int i12 = this.f46240c;
            if (i12 >= this.f46238a) {
                break;
            }
            this.f46241d[i12] = 0;
            this.f46240c = i12 + 1;
        }
        byte[] bArr2 = this.f46241d;
        byte[] bArr3 = new byte[bArr2.length];
        System.arraycopy(bArr2, 0, bArr3, 0, this.f46242e.length);
        if (this.f46243f) {
            this.f46243f = false;
        } else {
            bArr3 = a(this.f46241d, 0, this.f46242e);
        }
        d(this.f46244g, bArr3, 0, this.f46242e, 0);
        byte[] bArr4 = this.f46242e;
        int i13 = this.f46239b;
        System.arraycopy(bArr4, (bArr4.length / 2) - i13, bArr, i11, i13);
        reset();
        return this.f46239b;
    }

    @Override // org.bouncycastle.crypto.v
    public String getAlgorithmName() {
        return "GOST28147Mac";
    }

    @Override // org.bouncycastle.crypto.v
    public int getMacSize() {
        return this.f46239b;
    }

    @Override // org.bouncycastle.crypto.v
    public void init(org.bouncycastle.crypto.i iVar) {
        reset();
        this.f46241d = new byte[this.f46238a];
        this.f46245h = null;
        g(iVar);
    }

    @Override // org.bouncycastle.crypto.v
    public void reset() {
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f46241d;
            if (i11 >= bArr.length) {
                this.f46240c = 0;
                this.f46243f = true;
                return;
            }
            bArr[i11] = 0;
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte b11) {
        int i11 = this.f46240c;
        byte[] bArr = this.f46241d;
        if (i11 == bArr.length) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, this.f46242e.length);
            if (this.f46243f) {
                this.f46243f = false;
                byte[] bArr3 = this.f46245h;
                if (bArr3 != null) {
                    bArr2 = a(this.f46241d, 0, bArr3);
                }
            } else {
                bArr2 = a(this.f46241d, 0, this.f46242e);
            }
            d(this.f46244g, bArr2, 0, this.f46242e, 0);
            this.f46240c = 0;
        }
        byte[] bArr4 = this.f46241d;
        int i12 = this.f46240c;
        this.f46240c = i12 + 1;
        bArr4[i12] = b11;
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte[] bArr, int i11, int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i13 = this.f46238a;
        int i14 = this.f46240c;
        int i15 = i13 - i14;
        if (i12 > i15) {
            System.arraycopy(bArr, i11, this.f46241d, i14, i15);
            byte[] bArr2 = this.f46241d;
            byte[] bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, 0, this.f46242e.length);
            if (this.f46243f) {
                this.f46243f = false;
                byte[] bArr4 = this.f46245h;
                if (bArr4 != null) {
                    bArr3 = a(this.f46241d, 0, bArr4);
                }
            } else {
                bArr3 = a(this.f46241d, 0, this.f46242e);
            }
            d(this.f46244g, bArr3, 0, this.f46242e, 0);
            this.f46240c = 0;
            while (true) {
                i12 -= i15;
                i11 += i15;
                if (i12 <= this.f46238a) {
                    break;
                }
                d(this.f46244g, a(bArr, i11, this.f46242e), 0, this.f46242e, 0);
                i15 = this.f46238a;
            }
        }
        System.arraycopy(bArr, i11, this.f46241d, this.f46240c, i12);
        this.f46240c += i12;
    }
}