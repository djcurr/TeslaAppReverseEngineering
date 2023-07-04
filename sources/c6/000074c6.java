package i50;

import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public class n implements org.bouncycastle.crypto.r, r70.h {

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f30086g = {41, 46, 67, -55, -94, -40, 124, 1, 61, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, PSSSigner.TRAILER_IMPLICIT, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, Tnaf.POW_2_WIDTH, -119, 11, 34, 95, 33, Byte.MIN_VALUE, Byte.MAX_VALUE, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, 51, -97, 17, -125, 20};

    /* renamed from: a  reason: collision with root package name */
    private byte[] f30087a;

    /* renamed from: b  reason: collision with root package name */
    private int f30088b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f30089c;

    /* renamed from: d  reason: collision with root package name */
    private int f30090d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f30091e;

    /* renamed from: f  reason: collision with root package name */
    private int f30092f;

    public n() {
        this.f30087a = new byte[48];
        this.f30089c = new byte[16];
        this.f30091e = new byte[16];
        reset();
    }

    public n(n nVar) {
        this.f30087a = new byte[48];
        this.f30089c = new byte[16];
        this.f30091e = new byte[16];
        b(nVar);
    }

    private void b(n nVar) {
        byte[] bArr = nVar.f30087a;
        System.arraycopy(bArr, 0, this.f30087a, 0, bArr.length);
        this.f30088b = nVar.f30088b;
        byte[] bArr2 = nVar.f30089c;
        System.arraycopy(bArr2, 0, this.f30089c, 0, bArr2.length);
        this.f30090d = nVar.f30090d;
        byte[] bArr3 = nVar.f30091e;
        System.arraycopy(bArr3, 0, this.f30091e, 0, bArr3.length);
        this.f30092f = nVar.f30092f;
    }

    @Override // r70.h
    public void a(r70.h hVar) {
        b((n) hVar);
    }

    protected void c(byte[] bArr) {
        for (int i11 = 0; i11 < 16; i11++) {
            byte[] bArr2 = this.f30087a;
            bArr2[i11 + 16] = bArr[i11];
            bArr2[i11 + 32] = (byte) (bArr[i11] ^ bArr2[i11]);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 18; i13++) {
            for (int i14 = 0; i14 < 48; i14++) {
                byte[] bArr3 = this.f30087a;
                byte b11 = (byte) (f30086g[i12] ^ bArr3[i14]);
                bArr3[i14] = b11;
                i12 = b11 & 255;
            }
            i12 = (i12 + i13) % 256;
        }
    }

    @Override // r70.h
    public r70.h copy() {
        return new n(this);
    }

    protected void d(byte[] bArr) {
        byte b11 = this.f30091e[15];
        for (int i11 = 0; i11 < 16; i11++) {
            byte[] bArr2 = this.f30091e;
            bArr2[i11] = (byte) (f30086g[(b11 ^ bArr[i11]) & 255] ^ bArr2[i11]);
            b11 = bArr2[i11];
        }
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        int length = this.f30089c.length;
        int i12 = this.f30090d;
        byte b11 = (byte) (length - i12);
        while (true) {
            byte[] bArr2 = this.f30089c;
            if (i12 >= bArr2.length) {
                d(bArr2);
                c(this.f30089c);
                c(this.f30091e);
                System.arraycopy(this.f30087a, this.f30088b, bArr, i11, 16);
                reset();
                return 16;
            }
            bArr2[i12] = b11;
            i12++;
        }
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "MD2";
    }

    @Override // org.bouncycastle.crypto.r
    public int getByteLength() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.p
    public void reset() {
        this.f30088b = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f30087a;
            if (i11 == bArr.length) {
                break;
            }
            bArr[i11] = 0;
            i11++;
        }
        this.f30090d = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr2 = this.f30089c;
            if (i12 == bArr2.length) {
                break;
            }
            bArr2[i12] = 0;
            i12++;
        }
        this.f30092f = 0;
        int i13 = 0;
        while (true) {
            byte[] bArr3 = this.f30091e;
            if (i13 == bArr3.length) {
                return;
            }
            bArr3[i13] = 0;
            i13++;
        }
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte b11) {
        byte[] bArr = this.f30089c;
        int i11 = this.f30090d;
        int i12 = i11 + 1;
        this.f30090d = i12;
        bArr[i11] = b11;
        if (i12 == 16) {
            d(bArr);
            c(this.f30089c);
            this.f30090d = 0;
        }
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte[] bArr, int i11, int i12) {
        while (this.f30090d != 0 && i12 > 0) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
        while (i12 > 16) {
            System.arraycopy(bArr, i11, this.f30089c, 0, 16);
            d(this.f30089c);
            c(this.f30089c);
            i12 -= 16;
            i11 += 16;
        }
        while (i12 > 0) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
    }
}