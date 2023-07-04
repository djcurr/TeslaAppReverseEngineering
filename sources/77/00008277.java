package l50;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public class d implements org.bouncycastle.crypto.e {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[][] f36702b = {org.bouncycastle.util.encoders.b.b("517cc1b727220a94fe13abe8fa9a6ee0"), org.bouncycastle.util.encoders.b.b("6db14acc9e21c820ff28b1d5ef5de2b0"), org.bouncycastle.util.encoders.b.b("db92371d2126e9700324977504e8c90e")};

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f36703c = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, Tnaf.POW_2_WIDTH, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f36704d = {-30, 78, 84, -4, -108, -62, 74, -52, 98, 13, 106, 70, 60, 77, -117, -47, 94, -6, 100, -53, -76, -105, -66, 43, PSSSigner.TRAILER_IMPLICIT, 119, 46, 3, -45, 25, 89, -63, 29, 6, 65, 107, 85, -16, -103, 105, -22, -100, 24, -82, 99, -33, -25, -69, 0, 115, 102, -5, -106, 76, -123, -28, 58, 9, 69, -86, 15, -18, Tnaf.POW_2_WIDTH, -21, 45, Byte.MAX_VALUE, -12, 41, -84, -49, -83, -111, -115, 120, -56, -107, -7, 47, -50, -51, 8, 122, -120, 56, 92, -125, 42, 40, 71, -37, -72, -57, -109, -92, 18, 83, -1, -121, 14, 49, 54, 33, 88, 72, 1, -114, 55, 116, 50, -54, -23, -79, -73, -85, 12, -41, -60, 86, 66, 38, 7, -104, 96, -39, -74, -71, 17, 64, -20, 32, -116, -67, -96, -55, -124, 4, 73, 35, -15, 79, 80, 31, 19, -36, -40, -64, -98, 87, -29, -61, 123, 101, 59, 2, -113, 62, -24, 37, -110, -27, 21, -35, -3, 23, -87, -65, -44, -102, 126, -59, 57, 103, -2, 118, -99, 67, -89, -31, -48, -11, 104, -14, 27, 52, 112, 5, -93, -118, -43, 121, -122, -88, 48, -58, 81, 75, 30, -90, 39, -10, 53, -46, 110, 36, 22, -126, 95, -38, -26, 117, -94, -17, 44, -78, 28, -97, 93, 111, Byte.MIN_VALUE, 10, 114, 68, -101, 108, -112, 11, 91, 51, 125, 90, 82, -13, 97, -95, -9, -80, -42, 63, 124, 109, -19, 20, -32, -91, 61, 34, -77, -8, -119, -34, 113, 26, -81, -70, -75, -127};

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f36705e = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, Tnaf.POW_2_WIDTH, 89, 39, Byte.MIN_VALUE, -20, 95, 96, 81, Byte.MAX_VALUE, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f36706f = {48, 104, -103, 27, -121, -71, 33, 120, 80, 57, -37, -31, 114, 9, 98, 60, 62, 126, 94, -114, -15, -96, -52, -93, 42, 29, -5, -74, -42, 32, -60, -115, -127, 101, -11, -119, -53, -99, 119, -58, 87, 67, 86, 23, -44, 64, 26, 77, -64, 99, 108, -29, -73, -56, 100, 106, 83, -86, 56, -104, 12, -12, -101, -19, Byte.MAX_VALUE, 34, 118, -81, -35, 58, 11, 88, 103, -120, 6, -61, 53, 13, 1, -117, -116, -62, -26, 95, 2, 36, 117, -109, 102, 30, -27, -30, 84, -40, Tnaf.POW_2_WIDTH, -50, 122, -24, 8, 44, 18, -105, 50, -85, -76, 39, 10, 35, -33, -17, -54, -39, -72, -6, -36, 49, 107, -47, -83, 25, 73, -67, 81, -106, -18, -28, -88, 65, -38, -1, -51, 85, -122, 54, -66, 97, 82, -8, -69, 14, -126, 72, 105, -102, -32, 71, -98, 92, 4, 75, 52, 21, 121, 38, -89, -34, 41, -82, -110, -41, -124, -23, -46, -70, 93, -13, -59, -80, -65, -92, 59, 113, 68, 70, 43, -4, -21, 111, -43, -10, 20, -2, 124, 112, 90, 125, -3, 47, 24, -125, 22, -91, -111, 31, 5, -107, 116, -87, -63, 91, 74, -123, 109, 19, 7, 79, 78, 69, -78, 15, -55, 28, -90, PSSSigner.TRAILER_IMPLICIT, -20, 115, -112, 123, -49, 89, -113, -95, -7, 45, -14, -79, 0, -108, 55, -97, -48, 46, -100, 110, 40, 63, Byte.MIN_VALUE, -16, 61, -45, 37, -118, -75, -25, 66, -77, -57, -22, -9, 76, 17, 51, 3, -94, -84, 96};

    /* renamed from: a  reason: collision with root package name */
    private byte[][] f36707a;

    protected static void a(byte[] bArr) {
        byte b11 = bArr[0];
        byte b12 = bArr[1];
        byte b13 = bArr[2];
        byte b14 = bArr[3];
        byte b15 = bArr[4];
        byte b16 = bArr[5];
        byte b17 = bArr[6];
        byte b18 = bArr[7];
        byte b19 = bArr[8];
        byte b21 = bArr[9];
        byte b22 = bArr[10];
        byte b23 = bArr[11];
        byte b24 = bArr[12];
        byte b25 = bArr[13];
        byte b26 = bArr[14];
        byte b27 = bArr[15];
        bArr[0] = (byte) ((((((b14 ^ b15) ^ b17) ^ b19) ^ b21) ^ b25) ^ b26);
        bArr[1] = (byte) ((((((b13 ^ b16) ^ b18) ^ b19) ^ b21) ^ b24) ^ b27);
        bArr[2] = (byte) ((((((b12 ^ b15) ^ b17) ^ b22) ^ b23) ^ b24) ^ b27);
        bArr[3] = (byte) ((((((b11 ^ b16) ^ b18) ^ b22) ^ b23) ^ b25) ^ b26);
        int i11 = b11 ^ b13;
        bArr[4] = (byte) (((((i11 ^ b16) ^ b19) ^ b23) ^ b26) ^ b27);
        int i12 = b12 ^ b14;
        bArr[5] = (byte) (((((i12 ^ b15) ^ b21) ^ b22) ^ b26) ^ b27);
        bArr[6] = (byte) (((((i11 ^ b18) ^ b21) ^ b22) ^ b24) ^ b25);
        bArr[7] = (byte) (((((i12 ^ b17) ^ b19) ^ b23) ^ b24) ^ b25);
        int i13 = b11 ^ b12;
        bArr[8] = (byte) (((((i13 ^ b15) ^ b18) ^ b22) ^ b25) ^ b27);
        bArr[9] = (byte) (((((i13 ^ b16) ^ b17) ^ b23) ^ b24) ^ b26);
        int i14 = b13 ^ b14;
        bArr[10] = (byte) (((((i14 ^ b16) ^ b17) ^ b19) ^ b25) ^ b27);
        bArr[11] = (byte) (((((i14 ^ b15) ^ b18) ^ b21) ^ b24) ^ b26);
        int i15 = b12 ^ b13;
        bArr[12] = (byte) (((((i15 ^ b17) ^ b18) ^ b21) ^ b23) ^ b24);
        int i16 = b11 ^ b14;
        bArr[13] = (byte) (((((i16 ^ b17) ^ b18) ^ b19) ^ b22) ^ b25);
        bArr[14] = (byte) (((((i16 ^ b15) ^ b16) ^ b21) ^ b23) ^ b26);
        bArr[15] = (byte) (((((i15 ^ b15) ^ b16) ^ b19) ^ b22) ^ b27);
    }

    protected static void b(byte[] bArr, byte[] bArr2) {
        m(bArr, bArr2);
        i(bArr);
        a(bArr);
    }

    protected static void c(byte[] bArr, byte[] bArr2) {
        m(bArr, bArr2);
        h(bArr);
        a(bArr);
    }

    protected static byte d(byte b11) {
        return f36703c[b11 & 255];
    }

    protected static byte e(byte b11) {
        return f36704d[b11 & 255];
    }

    protected static byte f(byte b11) {
        return f36705e[b11 & 255];
    }

    protected static byte g(byte b11) {
        return f36706f[b11 & 255];
    }

    protected static void h(byte[] bArr) {
        bArr[0] = d(bArr[0]);
        bArr[1] = e(bArr[1]);
        bArr[2] = f(bArr[2]);
        bArr[3] = g(bArr[3]);
        bArr[4] = d(bArr[4]);
        bArr[5] = e(bArr[5]);
        bArr[6] = f(bArr[6]);
        bArr[7] = g(bArr[7]);
        bArr[8] = d(bArr[8]);
        bArr[9] = e(bArr[9]);
        bArr[10] = f(bArr[10]);
        bArr[11] = g(bArr[11]);
        bArr[12] = d(bArr[12]);
        bArr[13] = e(bArr[13]);
        bArr[14] = f(bArr[14]);
        bArr[15] = g(bArr[15]);
    }

    protected static void i(byte[] bArr) {
        bArr[0] = f(bArr[0]);
        bArr[1] = g(bArr[1]);
        bArr[2] = d(bArr[2]);
        bArr[3] = e(bArr[3]);
        bArr[4] = f(bArr[4]);
        bArr[5] = g(bArr[5]);
        bArr[6] = d(bArr[6]);
        bArr[7] = e(bArr[7]);
        bArr[8] = f(bArr[8]);
        bArr[9] = g(bArr[9]);
        bArr[10] = d(bArr[10]);
        bArr[11] = e(bArr[11]);
        bArr[12] = f(bArr[12]);
        bArr[13] = g(bArr[13]);
        bArr[14] = d(bArr[14]);
        bArr[15] = e(bArr[15]);
    }

    protected static byte[][] j(boolean z11, byte[] bArr) {
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i11 = (length >>> 3) - 2;
        byte[][] bArr2 = f36702b;
        byte[] bArr3 = bArr2[i11];
        byte[] bArr4 = bArr2[(i11 + 1) % 3];
        byte[] bArr5 = bArr2[(i11 + 2) % 3];
        byte[] bArr6 = new byte[16];
        byte[] bArr7 = new byte[16];
        System.arraycopy(bArr, 0, bArr6, 0, 16);
        System.arraycopy(bArr, 16, bArr7, 0, length - 16);
        byte[] bArr8 = new byte[16];
        byte[] bArr9 = new byte[16];
        byte[] bArr10 = new byte[16];
        byte[] bArr11 = new byte[16];
        System.arraycopy(bArr6, 0, bArr8, 0, 16);
        System.arraycopy(bArr8, 0, bArr9, 0, 16);
        c(bArr9, bArr3);
        m(bArr9, bArr7);
        System.arraycopy(bArr9, 0, bArr10, 0, 16);
        b(bArr10, bArr4);
        m(bArr10, bArr8);
        System.arraycopy(bArr10, 0, bArr11, 0, 16);
        c(bArr11, bArr5);
        m(bArr11, bArr9);
        int i12 = (i11 * 2) + 12;
        byte[][] bArr12 = (byte[][]) Array.newInstance(byte.class, i12 + 1, 16);
        k(bArr12[0], bArr8, bArr9, 19);
        k(bArr12[1], bArr9, bArr10, 19);
        k(bArr12[2], bArr10, bArr11, 19);
        k(bArr12[3], bArr11, bArr8, 19);
        k(bArr12[4], bArr8, bArr9, 31);
        k(bArr12[5], bArr9, bArr10, 31);
        k(bArr12[6], bArr10, bArr11, 31);
        k(bArr12[7], bArr11, bArr8, 31);
        k(bArr12[8], bArr8, bArr9, 67);
        k(bArr12[9], bArr9, bArr10, 67);
        k(bArr12[10], bArr10, bArr11, 67);
        k(bArr12[11], bArr11, bArr8, 67);
        k(bArr12[12], bArr8, bArr9, 97);
        if (i12 > 12) {
            k(bArr12[13], bArr9, bArr10, 97);
            k(bArr12[14], bArr10, bArr11, 97);
            if (i12 > 14) {
                k(bArr12[15], bArr11, bArr8, 97);
                k(bArr12[16], bArr8, bArr9, 109);
            }
        }
        if (!z11) {
            l(bArr12);
            for (int i13 = 1; i13 < i12; i13++) {
                a(bArr12[i13]);
            }
        }
        return bArr12;
    }

    protected static void k(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11) {
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        int i14 = 8 - i13;
        int i15 = bArr3[15 - i12] & 255;
        int i16 = 0;
        while (i16 < 16) {
            int i17 = bArr3[(i16 - i12) & 15] & 255;
            bArr[i16] = (byte) (((i15 << i14) | (i17 >>> i13)) ^ (bArr2[i16] & 255));
            i16++;
            i15 = i17;
        }
    }

    protected static void l(byte[][] bArr) {
        int length = bArr.length;
        int i11 = length / 2;
        int i12 = length - 1;
        for (int i13 = 0; i13 < i11; i13++) {
            byte[] bArr2 = bArr[i13];
            int i14 = i12 - i13;
            bArr[i13] = bArr[i14];
            bArr[i14] = bArr2;
        }
    }

    protected static void m(byte[] bArr, byte[] bArr2) {
        for (int i11 = 0; i11 < 16; i11++) {
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
        }
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "ARIA";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof u50.b1) {
            this.f36707a = j(z11, ((u50.b1) iVar).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to ARIA init - " + iVar.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.f36707a != null) {
            if (i11 <= bArr.length - 16) {
                if (i12 <= bArr2.length - 16) {
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(bArr, i11, bArr3, 0, 16);
                    int length = this.f36707a.length - 3;
                    int i13 = 0;
                    while (i13 < length) {
                        int i14 = i13 + 1;
                        c(bArr3, this.f36707a[i13]);
                        b(bArr3, this.f36707a[i14]);
                        i13 = i14 + 1;
                    }
                    int i15 = i13 + 1;
                    c(bArr3, this.f36707a[i13]);
                    m(bArr3, this.f36707a[i15]);
                    i(bArr3);
                    m(bArr3, this.f36707a[i15 + 1]);
                    System.arraycopy(bArr3, 0, bArr2, i12, 16);
                    return 16;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("ARIA engine not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}