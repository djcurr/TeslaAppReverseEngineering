package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public final class b1 implements org.bouncycastle.crypto.e {

    /* renamed from: j  reason: collision with root package name */
    private static final byte[][] f36675j = {new byte[]{-87, 103, -77, -24, 4, -3, -93, 118, -102, -110, Byte.MIN_VALUE, 120, -28, -35, -47, 56, 13, -58, 53, -104, 24, -9, -20, 108, 67, 117, 55, 38, -6, 19, -108, 72, -14, -48, -117, 48, -124, 84, -33, 35, 25, 91, 61, 89, -13, -82, -94, -126, 99, 1, -125, 46, -39, 81, -101, 124, -90, -21, -91, -66, 22, 12, -29, 97, -64, -116, 58, -11, 115, 44, 37, 11, -69, 78, -119, 107, 83, 106, -76, -15, -31, -26, -67, 69, -30, -12, -74, 102, -52, -107, 3, 86, -44, 28, 30, -41, -5, -61, -114, -75, -23, -49, -65, -70, -22, 119, 57, -81, 51, -55, 98, 113, -127, 121, 9, -83, 36, -51, -7, -40, -27, -59, -71, 77, 68, 8, -122, -25, -95, 29, -86, -19, 6, 112, -78, -46, 65, 123, -96, 17, 49, -62, 39, -112, 32, -10, 96, -1, -106, 92, -79, -85, -98, -100, 82, 27, 95, -109, 10, -17, -111, -123, 73, -18, 45, 79, -113, 59, 71, -121, 109, 70, -42, 62, 105, 100, 42, -50, -53, 47, -4, -105, 5, 122, -84, Byte.MAX_VALUE, -43, 26, 75, 14, -89, 90, 40, 20, 63, 41, -120, 60, 76, 2, -72, -38, -80, 23, 85, 31, -118, 125, 87, -57, -115, 116, -73, -60, -97, 114, 126, 21, 34, 18, 88, 7, -103, 52, 110, 80, -34, 104, 101, PSSSigner.TRAILER_IMPLICIT, -37, -8, -56, -88, 43, 64, -36, -2, 50, -92, -54, Tnaf.POW_2_WIDTH, 33, -16, -45, 93, 15, 0, 111, -99, 54, 66, 74, 94, -63, -32}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, -42, 50, -40, -3, 55, 113, -15, -31, 48, 15, -8, 27, -121, -6, 6, 63, 94, -70, -82, 91, -118, 0, PSSSigner.TRAILER_IMPLICIT, -99, 109, -63, -79, 14, Byte.MIN_VALUE, 93, -46, -43, -96, -124, 7, 20, -75, -112, 44, -93, -78, 115, 76, 84, -110, 116, 54, 81, 56, -80, -67, 90, -4, 96, 98, -106, 108, 66, -9, Tnaf.POW_2_WIDTH, 124, 40, 39, -116, 19, -107, -100, -57, 36, 70, 59, 112, -54, -29, -123, -53, 17, -48, -109, -72, -90, -125, 32, -1, -97, 119, -61, -52, 3, 111, 8, -65, 64, -25, 43, -30, 121, 12, -86, -126, 65, 58, -22, -71, -28, -102, -92, -105, 126, -38, 122, 23, 102, -108, -95, 29, 61, -16, -34, -77, 11, 114, -89, 28, -17, -47, 83, 62, -113, 51, 38, 95, -20, 118, 42, 73, -127, -120, -18, 33, -60, 26, -21, -39, -59, 57, -103, -51, -83, 49, -117, 1, 24, 35, -35, 31, 78, 45, -7, 72, 79, -14, 101, -114, 120, 92, 88, 25, -115, -27, -104, 87, 103, Byte.MAX_VALUE, 5, 100, -81, 99, -74, -2, -11, -73, 60, -91, -50, -23, 104, 68, -32, 77, 67, 105, 41, 46, -84, 21, 89, -88, 10, -98, 110, 71, -33, 52, 53, 106, -49, -36, 34, -55, -64, -101, -119, -44, -19, -85, 18, -94, 13, 82, -69, 2, 47, -87, -41, 97, 30, -76, 80, 4, -10, -62, 22, 37, -122, 86, 85, 9, -66, -111}};

    /* renamed from: f  reason: collision with root package name */
    private int[] f36681f;

    /* renamed from: g  reason: collision with root package name */
    private int[] f36682g;

    /* renamed from: a  reason: collision with root package name */
    private boolean f36676a = false;

    /* renamed from: b  reason: collision with root package name */
    private int[] f36677b = new int[256];

    /* renamed from: c  reason: collision with root package name */
    private int[] f36678c = new int[256];

    /* renamed from: d  reason: collision with root package name */
    private int[] f36679d = new int[256];

    /* renamed from: e  reason: collision with root package name */
    private int[] f36680e = new int[256];

    /* renamed from: h  reason: collision with root package name */
    private int f36683h = 0;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f36684i = null;

    public b1() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        for (int i11 = 0; i11 < 256; i11++) {
            byte[][] bArr = f36675j;
            int i12 = bArr[0][i11] & 255;
            iArr[0] = i12;
            iArr2[0] = h(i12) & 255;
            iArr3[0] = i(i12) & 255;
            int i13 = bArr[1][i11] & 255;
            iArr[1] = i13;
            iArr2[1] = h(i13) & 255;
            iArr3[1] = i(i13) & 255;
            this.f36677b[i11] = iArr[1] | (iArr2[1] << 8) | (iArr3[1] << 16) | (iArr3[1] << 24);
            this.f36678c[i11] = iArr3[0] | (iArr3[0] << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            this.f36679d[i11] = (iArr3[1] << 24) | iArr2[1] | (iArr3[1] << 8) | (iArr[1] << 16);
            this.f36680e[i11] = iArr2[0] | (iArr[0] << 8) | (iArr3[0] << 16) | (iArr2[0] << 24);
        }
    }

    private void a(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >> 8);
        bArr[i12 + 2] = (byte) (i11 >> 16);
        bArr[i12 + 3] = (byte) (i11 >> 24);
    }

    private int b(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    private int c(int i11, int[] iArr) {
        int i12;
        int i13;
        int l11 = l(i11);
        int m11 = m(i11);
        int n11 = n(i11);
        int o11 = o(i11);
        int i14 = iArr[0];
        int i15 = iArr[1];
        int i16 = iArr[2];
        int i17 = iArr[3];
        int i18 = this.f36683h & 3;
        if (i18 != 0) {
            if (i18 == 1) {
                int[] iArr2 = this.f36677b;
                byte[][] bArr = f36675j;
                i12 = (iArr2[(bArr[0][l11] & 255) ^ l(i14)] ^ this.f36678c[(bArr[0][m11] & 255) ^ m(i14)]) ^ this.f36679d[(bArr[1][n11] & 255) ^ n(i14)];
                i13 = this.f36680e[(bArr[1][o11] & 255) ^ o(i14)];
                return i12 ^ i13;
            }
            if (i18 != 2) {
                if (i18 != 3) {
                    return 0;
                }
            }
            int[] iArr3 = this.f36677b;
            byte[][] bArr2 = f36675j;
            i12 = (iArr3[(bArr2[0][(bArr2[0][l11] & 255) ^ l(i15)] & 255) ^ l(i14)] ^ this.f36678c[(bArr2[0][(bArr2[1][m11] & 255) ^ m(i15)] & 255) ^ m(i14)]) ^ this.f36679d[(bArr2[1][(bArr2[0][n11] & 255) ^ n(i15)] & 255) ^ n(i14)];
            i13 = this.f36680e[(bArr2[1][(bArr2[1][o11] & 255) ^ o(i15)] & 255) ^ o(i14)];
            return i12 ^ i13;
        }
        byte[][] bArr3 = f36675j;
        l11 = (bArr3[1][l11] & 255) ^ l(i17);
        m11 = (bArr3[0][m11] & 255) ^ m(i17);
        n11 = (bArr3[0][n11] & 255) ^ n(i17);
        o11 = (bArr3[1][o11] & 255) ^ o(i17);
        byte[][] bArr4 = f36675j;
        l11 = (bArr4[1][l11] & 255) ^ l(i16);
        m11 = (bArr4[1][m11] & 255) ^ m(i16);
        n11 = (bArr4[0][n11] & 255) ^ n(i16);
        o11 = (bArr4[0][o11] & 255) ^ o(i16);
        int[] iArr32 = this.f36677b;
        byte[][] bArr22 = f36675j;
        i12 = (iArr32[(bArr22[0][(bArr22[0][l11] & 255) ^ l(i15)] & 255) ^ l(i14)] ^ this.f36678c[(bArr22[0][(bArr22[1][m11] & 255) ^ m(i15)] & 255) ^ m(i14)]) ^ this.f36679d[(bArr22[1][(bArr22[0][n11] & 255) ^ n(i15)] & 255) ^ n(i14)];
        i13 = this.f36680e[(bArr22[1][(bArr22[1][o11] & 255) ^ o(i15)] & 255) ^ o(i14)];
        return i12 ^ i13;
    }

    private int d(int i11) {
        int[] iArr = this.f36682g;
        return iArr[(((i11 >>> 24) & 255) * 2) + 513] ^ ((iArr[((i11 & 255) * 2) + 0] ^ iArr[(((i11 >>> 8) & 255) * 2) + 1]) ^ iArr[(((i11 >>> 16) & 255) * 2) + 512]);
    }

    private int e(int i11) {
        int[] iArr = this.f36682g;
        return iArr[(((i11 >>> 16) & 255) * 2) + 513] ^ ((iArr[(((i11 >>> 24) & 255) * 2) + 0] ^ iArr[((i11 & 255) * 2) + 1]) ^ iArr[(((i11 >>> 8) & 255) * 2) + 512]);
    }

    private int f(int i11) {
        return ((i11 & 1) != 0 ? CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 : 0) ^ (i11 >> 1);
    }

    private int g(int i11) {
        return ((i11 >> 2) ^ ((i11 & 2) != 0 ? CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 : 0)) ^ ((i11 & 1) != 0 ? 90 : 0);
    }

    private int h(int i11) {
        return i11 ^ g(i11);
    }

    private int i(int i11) {
        return g(i11) ^ (f(i11) ^ i11);
    }

    private int j(int i11, int i12) {
        for (int i13 = 0; i13 < 4; i13++) {
            i12 = k(i12);
        }
        int i14 = i11 ^ i12;
        for (int i15 = 0; i15 < 4; i15++) {
            i14 = k(i14);
        }
        return i14;
    }

    private int k(int i11) {
        int i12 = (i11 >>> 24) & 255;
        int i13 = ((i12 << 1) ^ ((i12 & 128) != 0 ? 333 : 0)) & 255;
        int i14 = ((i12 >>> 1) ^ ((i12 & 1) != 0 ? CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256 : 0)) ^ i13;
        return ((((i11 << 8) ^ (i14 << 24)) ^ (i13 << 16)) ^ (i14 << 8)) ^ i12;
    }

    private int l(int i11) {
        return i11 & 255;
    }

    private int m(int i11) {
        return (i11 >>> 8) & 255;
    }

    private int n(int i11) {
        return (i11 >>> 16) & 255;
    }

    private int o(int i11) {
        return (i11 >>> 24) & 255;
    }

    private void p(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int b11 = b(bArr, i11) ^ this.f36681f[4];
        int b12 = b(bArr, i11 + 4) ^ this.f36681f[5];
        int b13 = b(bArr, i11 + 8) ^ this.f36681f[6];
        int b14 = b(bArr, i11 + 12) ^ this.f36681f[7];
        int i13 = 39;
        for (int i14 = 0; i14 < 16; i14 += 2) {
            int d11 = d(b11);
            int e11 = e(b12);
            int[] iArr = this.f36681f;
            int i15 = i13 - 1;
            int i16 = b14 ^ (((e11 * 2) + d11) + iArr[i13]);
            int i17 = i15 - 1;
            b13 = ((b13 >>> 31) | (b13 << 1)) ^ ((d11 + e11) + iArr[i15]);
            b14 = (i16 << 31) | (i16 >>> 1);
            int d12 = d(b13);
            int e12 = e(b14);
            int[] iArr2 = this.f36681f;
            int i18 = i17 - 1;
            int i19 = b12 ^ (((e12 * 2) + d12) + iArr2[i17]);
            i13 = i18 - 1;
            b11 = ((b11 >>> 31) | (b11 << 1)) ^ ((d12 + e12) + iArr2[i18]);
            b12 = (i19 << 31) | (i19 >>> 1);
        }
        a(this.f36681f[0] ^ b13, bArr2, i12);
        a(b14 ^ this.f36681f[1], bArr2, i12 + 4);
        a(this.f36681f[2] ^ b11, bArr2, i12 + 8);
        a(this.f36681f[3] ^ b12, bArr2, i12 + 12);
    }

    private void q(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = 0;
        int b11 = b(bArr, i11) ^ this.f36681f[0];
        int b12 = b(bArr, i11 + 4) ^ this.f36681f[1];
        int b13 = b(bArr, i11 + 8) ^ this.f36681f[2];
        int b14 = b(bArr, i11 + 12) ^ this.f36681f[3];
        int i14 = 8;
        while (i13 < 16) {
            int d11 = d(b11);
            int e11 = e(b12);
            int[] iArr = this.f36681f;
            int i15 = i14 + 1;
            int i16 = b13 ^ ((d11 + e11) + iArr[i14]);
            b13 = (i16 >>> 1) | (i16 << 31);
            int i17 = (b14 >>> 31) | (b14 << 1);
            int i18 = i15 + 1;
            b14 = i17 ^ ((d11 + (e11 * 2)) + iArr[i15]);
            int d12 = d(b13);
            int e12 = e(b14);
            int[] iArr2 = this.f36681f;
            int i19 = i18 + 1;
            int i21 = b11 ^ ((d12 + e12) + iArr2[i18]);
            b11 = (i21 >>> 1) | (i21 << 31);
            i13 += 2;
            b12 = ((b12 << 1) | (b12 >>> 31)) ^ ((d12 + (e12 * 2)) + iArr2[i19]);
            i14 = i19 + 1;
        }
        a(this.f36681f[4] ^ b13, bArr2, i12);
        a(b14 ^ this.f36681f[5], bArr2, i12 + 4);
        a(this.f36681f[6] ^ b11, bArr2, i12 + 8);
        a(this.f36681f[7] ^ b12, bArr2, i12 + 12);
    }

    private void r(byte[] bArr) {
        int l11;
        int m11;
        int n11;
        int o11;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        this.f36681f = new int[40];
        int i15 = this.f36683h;
        if (i15 < 1) {
            throw new IllegalArgumentException("Key size less than 64 bits");
        }
        if (i15 > 4) {
            throw new IllegalArgumentException("Key size larger than 256 bits");
        }
        for (int i16 = 0; i16 < this.f36683h; i16++) {
            int i17 = i16 * 8;
            iArr[i16] = b(bArr, i17);
            iArr2[i16] = b(bArr, i17 + 4);
            iArr3[(this.f36683h - 1) - i16] = j(iArr[i16], iArr2[i16]);
        }
        for (int i18 = 0; i18 < 20; i18++) {
            int i19 = 33686018 * i18;
            int c11 = c(i19, iArr);
            int c12 = c(i19 + 16843009, iArr2);
            int i21 = (c12 >>> 24) | (c12 << 8);
            int i22 = c11 + i21;
            int[] iArr4 = this.f36681f;
            int i23 = i18 * 2;
            iArr4[i23] = i22;
            int i24 = i22 + i21;
            iArr4[i23 + 1] = (i24 << 9) | (i24 >>> 23);
        }
        int i25 = iArr3[0];
        int i26 = iArr3[1];
        int i27 = 2;
        int i28 = iArr3[2];
        int i29 = iArr3[3];
        this.f36682g = new int[1024];
        int i31 = 0;
        while (i31 < 256) {
            int i32 = this.f36683h & 3;
            if (i32 != 0) {
                if (i32 == 1) {
                    int[] iArr5 = this.f36682g;
                    int i33 = i31 * 2;
                    int[] iArr6 = this.f36677b;
                    byte[][] bArr2 = f36675j;
                    iArr5[i33] = iArr6[(bArr2[0][i31] & 255) ^ l(i25)];
                    this.f36682g[i33 + 1] = this.f36678c[(bArr2[0][i31] & 255) ^ m(i25)];
                    this.f36682g[i33 + 512] = this.f36679d[(bArr2[1][i31] & 255) ^ n(i25)];
                    this.f36682g[i33 + 513] = this.f36680e[(bArr2[1][i31] & 255) ^ o(i25)];
                } else if (i32 == i27) {
                    i14 = i31;
                    i13 = i14;
                    i12 = i13;
                    i11 = i12;
                    int[] iArr7 = this.f36682g;
                    int i34 = i31 * 2;
                    int[] iArr8 = this.f36677b;
                    byte[][] bArr3 = f36675j;
                    iArr7[i34] = iArr8[(bArr3[0][(bArr3[0][i13] & 255) ^ l(i26)] & 255) ^ l(i25)];
                    this.f36682g[i34 + 1] = this.f36678c[(bArr3[0][(bArr3[1][i12] & 255) ^ m(i26)] & 255) ^ m(i25)];
                    this.f36682g[i34 + 512] = this.f36679d[(bArr3[1][(bArr3[0][i11] & 255) ^ n(i26)] & 255) ^ n(i25)];
                    this.f36682g[i34 + 513] = this.f36680e[(bArr3[1][(bArr3[1][i14] & 255) ^ o(i26)] & 255) ^ o(i25)];
                } else if (i32 == 3) {
                    o11 = i31;
                    l11 = o11;
                    m11 = l11;
                    n11 = m11;
                }
                i31++;
                i27 = 2;
            } else {
                byte[][] bArr4 = f36675j;
                l11 = (bArr4[1][i31] & 255) ^ l(i29);
                m11 = (bArr4[0][i31] & 255) ^ m(i29);
                n11 = (bArr4[0][i31] & 255) ^ n(i29);
                o11 = (bArr4[1][i31] & 255) ^ o(i29);
            }
            byte[][] bArr5 = f36675j;
            i13 = (bArr5[1][l11] & 255) ^ l(i28);
            i12 = (bArr5[1][m11] & 255) ^ m(i28);
            i11 = (bArr5[0][n11] & 255) ^ n(i28);
            i14 = (bArr5[0][o11] & 255) ^ o(i28);
            int[] iArr72 = this.f36682g;
            int i342 = i31 * 2;
            int[] iArr82 = this.f36677b;
            byte[][] bArr32 = f36675j;
            iArr72[i342] = iArr82[(bArr32[0][(bArr32[0][i13] & 255) ^ l(i26)] & 255) ^ l(i25)];
            this.f36682g[i342 + 1] = this.f36678c[(bArr32[0][(bArr32[1][i12] & 255) ^ m(i26)] & 255) ^ m(i25)];
            this.f36682g[i342 + 512] = this.f36679d[(bArr32[1][(bArr32[0][i11] & 255) ^ n(i26)] & 255) ^ n(i25)];
            this.f36682g[i342 + 513] = this.f36680e[(bArr32[1][(bArr32[1][i14] & 255) ^ o(i26)] & 255) ^ o(i25)];
            i31++;
            i27 = 2;
        }
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "Twofish";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof u50.b1)) {
            throw new IllegalArgumentException("invalid parameter passed to Twofish init - " + iVar.getClass().getName());
        }
        this.f36676a = z11;
        byte[] a11 = ((u50.b1) iVar).a();
        this.f36684i = a11;
        this.f36683h = a11.length / 8;
        r(a11);
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.f36684i != null) {
            if (i11 + 16 <= bArr.length) {
                if (i12 + 16 <= bArr2.length) {
                    if (this.f36676a) {
                        q(bArr, i11, bArr2, i12);
                        return 16;
                    }
                    p(bArr, i11, bArr2, i12);
                    return 16;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("Twofish not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        byte[] bArr = this.f36684i;
        if (bArr != null) {
            r(bArr);
        }
    }
}