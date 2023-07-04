package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public class w implements org.bouncycastle.crypto.e {

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f36935g = {-4, -18, -35, 17, -49, 110, 49, 22, -5, -60, -6, -38, 35, -59, 4, 77, -23, 119, -16, -37, -109, 46, -103, -70, 23, 54, -15, -69, 20, -51, 95, -63, -7, 24, 101, 90, -30, 92, -17, 33, -127, 28, 60, 66, -117, 1, -114, 79, 5, -124, 2, -82, -29, 106, -113, -96, 6, 11, -19, -104, Byte.MAX_VALUE, -44, -45, 31, -21, 52, 44, 81, -22, -56, 72, -85, -14, 42, 104, -94, -3, 58, -50, -52, -75, 112, 14, 86, 8, 12, 118, 18, -65, 114, 19, 71, -100, -73, 93, -121, 21, -95, -106, 41, Tnaf.POW_2_WIDTH, 123, -102, -57, -13, -111, 120, 111, -99, -98, -78, -79, 50, 117, 25, 61, -1, 53, -118, 126, 109, 84, -58, Byte.MIN_VALUE, -61, -67, 13, 87, -33, -11, 36, -87, 62, -88, 67, -55, -41, 121, -42, -10, 124, 34, -71, 3, -32, 15, -20, -34, 122, -108, -80, PSSSigner.TRAILER_IMPLICIT, -36, -24, 40, 80, 78, 51, 10, 74, -89, -105, 96, 115, 30, 0, 98, 68, 26, -72, 56, -126, 100, -97, 38, 65, -83, 69, 70, -110, 39, 94, 85, 47, -116, -93, -91, 125, 105, -43, -107, 59, 7, 88, -77, 64, -122, -84, 29, -9, 48, 55, 107, -28, -120, -39, -25, -119, -31, 27, -125, 73, 76, 63, -8, -2, -115, 83, -86, -112, -54, -40, -123, 97, 32, 113, 103, -92, 45, 43, 9, 91, -53, -101, 37, -48, -66, -27, 108, 82, 89, -90, 116, -46, -26, -12, -76, -64, -47, 102, -81, -62, 57, 75, 99, -74};

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f36936h = {-91, 45, 50, -113, 14, 48, 56, -64, 84, -26, -98, 57, 85, 126, 82, -111, 100, 3, 87, 90, 28, 96, 7, 24, 33, 114, -88, -47, 41, -58, -92, 63, -32, 39, -115, 12, -126, -22, -82, -76, -102, 99, 73, -27, 66, -28, 21, -73, -56, 6, 112, -99, 65, 117, 25, -55, -86, -4, 77, -65, 42, 115, -124, -43, -61, -81, 43, -122, -89, -79, -78, 91, 70, -45, -97, -3, -44, 15, -100, 47, -101, 67, -17, -39, 121, -74, 83, Byte.MAX_VALUE, -63, -16, 35, -25, 37, 94, -75, 30, -94, -33, -90, -2, -84, 34, -7, -30, 74, PSSSigner.TRAILER_IMPLICIT, 53, -54, -18, 120, 5, 107, 81, -31, 89, -93, -14, 113, 86, 17, 106, -119, -108, 101, -116, -69, 119, 60, 123, 40, -85, -46, 49, -34, -60, 95, -52, -49, 118, 44, -72, -40, 46, 54, -37, 105, -77, 20, -107, -66, 98, -95, 59, 22, 102, -23, 92, 108, 109, -83, 55, 97, 75, -71, -29, -70, -15, -96, -123, -125, -38, 71, -59, -80, 51, -6, -106, 111, 110, -62, -10, 80, -1, 93, -87, -114, 23, 27, -105, 125, -20, 88, -9, 31, -5, 124, 9, 13, 122, 103, 69, -121, -36, -24, 79, 29, 78, 4, -21, -8, -13, 62, 61, -67, -118, -120, -35, -51, 11, 19, -104, 2, -109, Byte.MIN_VALUE, -112, -48, 36, 52, -53, -19, -12, -50, -103, Tnaf.POW_2_WIDTH, 68, 64, -110, 58, 1, 38, 18, 26, 72, 104, -11, -127, -117, -57, -42, 32, 10, 8, 0, 76, -41, 116};

    /* renamed from: e  reason: collision with root package name */
    private boolean f36941e;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f36937a = {-108, 32, -123, Tnaf.POW_2_WIDTH, -62, -64, 1, -5, 1, -64, -62, Tnaf.POW_2_WIDTH, -123, 32, -108, 1};

    /* renamed from: b  reason: collision with root package name */
    private int f36938b = 32;

    /* renamed from: c  reason: collision with root package name */
    private int f36939c = 32 / 2;

    /* renamed from: d  reason: collision with root package name */
    private byte[][] f36940d = null;

    /* renamed from: f  reason: collision with root package name */
    private byte[][] f36942f = k();

    private void a(byte[] bArr, int i11) {
        org.bouncycastle.util.a.g(bArr);
        bArr[15] = (byte) i11;
        d(bArr);
    }

    private void b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] e11 = e(bArr, bArr2);
        h(e11, bArr3);
        System.arraycopy(bArr2, 0, bArr3, 0, this.f36939c);
        System.arraycopy(e11, 0, bArr2, 0, this.f36939c);
    }

    private void c(byte[] bArr, int i11, byte[] bArr2, int i12) {
        byte[][] bArr3;
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, i11, bArr4, 0, 16);
        int i13 = 9;
        if (this.f36941e) {
            for (int i14 = 0; i14 < 9; i14++) {
                bArr4 = org.bouncycastle.util.a.v(e(this.f36940d[i14], bArr4), 16);
            }
            h(bArr4, this.f36940d[9]);
        } else {
            while (true) {
                bArr3 = this.f36940d;
                if (i13 <= 0) {
                    break;
                }
                bArr4 = org.bouncycastle.util.a.v(i(bArr3[i13], bArr4), 16);
                i13--;
            }
            h(bArr4, bArr3[0]);
        }
        System.arraycopy(bArr4, 0, bArr2, i12, 16);
    }

    private void d(byte[] bArr) {
        for (int i11 = 0; i11 < 16; i11++) {
            f(bArr);
        }
    }

    private byte[] e(byte[] bArr, byte[] bArr2) {
        byte[] v11 = org.bouncycastle.util.a.v(bArr, bArr.length);
        h(v11, bArr2);
        g(v11);
        d(v11);
        return v11;
    }

    private void f(byte[] bArr) {
        byte p11 = p(bArr);
        System.arraycopy(bArr, 0, bArr, 1, 15);
        bArr[0] = p11;
    }

    private void g(byte[] bArr) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr[i11] = f36935g[q(bArr[i11])];
        }
    }

    private void h(byte[] bArr, byte[] bArr2) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
        }
    }

    private byte[] i(byte[] bArr, byte[] bArr2) {
        byte[] v11 = org.bouncycastle.util.a.v(bArr, bArr.length);
        h(v11, bArr2);
        l(v11);
        n(v11);
        return v11;
    }

    private void j(byte[] bArr) {
        int i11;
        if (bArr.length != this.f36938b) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        this.f36940d = new byte[10];
        for (int i12 = 0; i12 < 10; i12++) {
            this.f36940d[i12] = new byte[this.f36939c];
        }
        int i13 = this.f36939c;
        byte[] bArr2 = new byte[i13];
        byte[] bArr3 = new byte[i13];
        int i14 = 0;
        while (true) {
            i11 = this.f36939c;
            if (i14 >= i11) {
                break;
            }
            byte[][] bArr4 = this.f36940d;
            byte[] bArr5 = bArr4[0];
            byte b11 = bArr[i14];
            bArr2[i14] = b11;
            bArr5[i14] = b11;
            byte[] bArr6 = bArr4[1];
            byte b12 = bArr[i11 + i14];
            bArr3[i14] = b12;
            bArr6[i14] = b12;
            i14++;
        }
        byte[] bArr7 = new byte[i11];
        for (int i15 = 1; i15 < 5; i15++) {
            for (int i16 = 1; i16 <= 8; i16++) {
                a(bArr7, ((i15 - 1) * 8) + i16);
                b(bArr7, bArr2, bArr3);
            }
            int i17 = i15 * 2;
            System.arraycopy(bArr2, 0, this.f36940d[i17], 0, this.f36939c);
            System.arraycopy(bArr3, 0, this.f36940d[i17 + 1], 0, this.f36939c);
        }
    }

    private static byte[][] k() {
        byte[][] bArr = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr[i11] = new byte[256];
            for (int i12 = 0; i12 < 256; i12++) {
                bArr[i11][i12] = o((byte) i11, (byte) i12);
            }
        }
        return bArr;
    }

    private void l(byte[] bArr) {
        for (int i11 = 0; i11 < 16; i11++) {
            m(bArr);
        }
    }

    private void m(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 1, bArr2, 0, 15);
        bArr2[15] = bArr[0];
        byte p11 = p(bArr2);
        System.arraycopy(bArr, 1, bArr, 0, 15);
        bArr[15] = p11;
    }

    private void n(byte[] bArr) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr[i11] = f36936h[q(bArr[i11])];
        }
    }

    private static byte o(byte b11, byte b12) {
        byte b13 = 0;
        for (byte b14 = 0; b14 < 8 && b11 != 0 && b12 != 0; b14 = (byte) (b14 + 1)) {
            if ((b12 & 1) != 0) {
                b13 = (byte) (b13 ^ b11);
            }
            byte b15 = (byte) (b11 & 128);
            b11 = (byte) (b11 << 1);
            if (b15 != 0) {
                b11 = (byte) (b11 ^ 195);
            }
            b12 = (byte) (b12 >> 1);
        }
        return b13;
    }

    private byte p(byte[] bArr) {
        byte b11 = bArr[15];
        for (int i11 = 14; i11 >= 0; i11--) {
            b11 = (byte) (b11 ^ this.f36942f[q(bArr[i11])][q(this.f36937a[i11])]);
        }
        return b11;
    }

    private int q(byte b11) {
        return b11 & 255;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "GOST3412_2015";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof u50.b1) {
            this.f36941e = z11;
            j(((u50.b1) iVar).a());
        } else if (iVar == null) {
        } else {
            throw new IllegalArgumentException("invalid parameter passed to GOST3412_2015 init - " + iVar.getClass().getName());
        }
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.f36940d != null) {
            if (i11 + 16 <= bArr.length) {
                if (i12 + 16 <= bArr2.length) {
                    c(bArr, i11, bArr2, i12);
                    return 16;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("GOST3412_2015 engine not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}