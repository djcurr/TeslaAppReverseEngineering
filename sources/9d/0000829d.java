package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public class s0 implements org.bouncycastle.crypto.e {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f36892c = {-42, -112, -23, -2, -52, -31, 61, -73, 22, -74, 20, -62, 40, -5, 44, 5, 43, 103, -102, 118, 42, -66, 4, -61, -86, 68, 19, 38, 73, -122, 6, -103, -100, 66, 80, -12, -111, -17, -104, 122, 51, 84, 11, 67, -19, -49, -84, 98, -28, -77, 28, -87, -55, 8, -24, -107, Byte.MIN_VALUE, -33, -108, -6, 117, -113, 63, -90, 71, 7, -89, -4, -13, 115, 23, -70, -125, 89, 60, 25, -26, -123, 79, -88, 104, 107, -127, -78, 113, 100, -38, -117, -8, -21, 15, 75, 112, 86, -99, 53, 30, 36, 14, 94, 99, 88, -47, -94, 37, 34, 124, 59, 1, 33, 120, -121, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, -96, -60, -56, -98, -22, -65, -118, -46, 64, -57, 56, -75, -93, -9, -14, -50, -7, 97, 21, -95, -32, -82, 93, -92, -101, 52, 26, 85, -83, -109, 50, 48, -11, -116, -79, -29, 29, -10, -30, 46, -126, 102, -54, 96, -64, 41, 35, -85, 13, 83, 78, 111, -43, -37, 55, 69, -34, -3, -114, 47, 3, -1, 106, 114, 109, 108, 91, 81, -115, 27, -81, -110, -69, -35, PSSSigner.TRAILER_IMPLICIT, Byte.MAX_VALUE, 17, -39, 92, 65, 31, Tnaf.POW_2_WIDTH, 90, -40, 10, -63, 49, -120, -91, -51, 123, -67, 45, 116, -48, 18, -72, -27, -76, -80, -119, 105, -105, 74, 12, -106, 119, 126, 101, -71, -15, 9, -59, 110, -58, -124, 24, -16, 125, -20, 58, -36, 77, 32, 121, -18, 95, 62, -41, -53, 57, 72};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f36893d = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f36894e = {-1548633402, 1453994832, 1736282519, -1301273892};

    /* renamed from: a  reason: collision with root package name */
    private final int[] f36895a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    private int[] f36896b;

    private int a(int[] iArr, int i11) {
        return g((iArr[3] ^ (iArr[1] ^ iArr[2])) ^ i11) ^ iArr[0];
    }

    private int b(int[] iArr, int i11) {
        return g((iArr[0] ^ (iArr[2] ^ iArr[3])) ^ i11) ^ iArr[1];
    }

    private int c(int[] iArr, int i11) {
        return g((iArr[1] ^ (iArr[3] ^ iArr[0])) ^ i11) ^ iArr[2];
    }

    private int d(int[] iArr, int i11) {
        return g((iArr[2] ^ (iArr[0] ^ iArr[1])) ^ i11) ^ iArr[3];
    }

    private int e(int i11) {
        return j(i11, 24) ^ (((j(i11, 2) ^ i11) ^ j(i11, 10)) ^ j(i11, 18));
    }

    private int f(int i11) {
        return j(i11, 23) ^ (j(i11, 13) ^ i11);
    }

    private int g(int i11) {
        return e(k(i11));
    }

    private int h(int i11) {
        return f(k(i11));
    }

    private int[] i(boolean z11, byte[] bArr) {
        int[] iArr = new int[32];
        int[] iArr2 = {r70.i.a(bArr, 0), r70.i.a(bArr, 4), r70.i.a(bArr, 8), r70.i.a(bArr, 12)};
        int i11 = iArr2[0];
        int[] iArr3 = f36894e;
        int[] iArr4 = {i11 ^ iArr3[0], iArr2[1] ^ iArr3[1], iArr2[2] ^ iArr3[2], iArr2[3] ^ iArr3[3]};
        if (z11) {
            int i12 = iArr4[0];
            int i13 = (iArr4[1] ^ iArr4[2]) ^ iArr4[3];
            int[] iArr5 = f36893d;
            iArr[0] = i12 ^ h(i13 ^ iArr5[0]);
            iArr[1] = iArr4[1] ^ h(((iArr4[2] ^ iArr4[3]) ^ iArr[0]) ^ iArr5[1]);
            iArr[2] = iArr4[2] ^ h(((iArr4[3] ^ iArr[0]) ^ iArr[1]) ^ iArr5[2]);
            iArr[3] = iArr4[3] ^ h(((iArr[0] ^ iArr[1]) ^ iArr[2]) ^ iArr5[3]);
            for (int i14 = 4; i14 < 32; i14++) {
                iArr[i14] = iArr[i14 - 4] ^ h(((iArr[i14 - 3] ^ iArr[i14 - 2]) ^ iArr[i14 - 1]) ^ f36893d[i14]);
            }
        } else {
            int i15 = iArr4[0];
            int i16 = (iArr4[1] ^ iArr4[2]) ^ iArr4[3];
            int[] iArr6 = f36893d;
            iArr[31] = i15 ^ h(i16 ^ iArr6[0]);
            iArr[30] = iArr4[1] ^ h(((iArr4[2] ^ iArr4[3]) ^ iArr[31]) ^ iArr6[1]);
            iArr[29] = iArr4[2] ^ h(((iArr4[3] ^ iArr[31]) ^ iArr[30]) ^ iArr6[2]);
            iArr[28] = iArr4[3] ^ h(((iArr[31] ^ iArr[30]) ^ iArr[29]) ^ iArr6[3]);
            for (int i17 = 27; i17 >= 0; i17--) {
                iArr[i17] = iArr[i17 + 4] ^ h(((iArr[i17 + 3] ^ iArr[i17 + 2]) ^ iArr[i17 + 1]) ^ f36893d[31 - i17]);
            }
        }
        return iArr;
    }

    private int j(int i11, int i12) {
        return (i11 >>> (-i12)) | (i11 << i12);
    }

    private int k(int i11) {
        byte[] bArr = f36892c;
        return (bArr[i11 & 255] & 255) | ((bArr[(i11 >> 24) & 255] & 255) << 24) | ((bArr[(i11 >> 16) & 255] & 255) << 16) | ((bArr[(i11 >> 8) & 255] & 255) << 8);
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "SM4";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof u50.b1)) {
            throw new IllegalArgumentException("invalid parameter passed to SM4 init - " + iVar.getClass().getName());
        }
        byte[] a11 = ((u50.b1) iVar).a();
        if (a11.length != 16) {
            throw new IllegalArgumentException("SM4 requires a 128 bit key");
        }
        this.f36896b = i(z11, a11);
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.f36896b != null) {
            if (i11 + 16 <= bArr.length) {
                if (i12 + 16 <= bArr2.length) {
                    this.f36895a[0] = r70.i.a(bArr, i11);
                    this.f36895a[1] = r70.i.a(bArr, i11 + 4);
                    this.f36895a[2] = r70.i.a(bArr, i11 + 8);
                    this.f36895a[3] = r70.i.a(bArr, i11 + 12);
                    for (int i13 = 0; i13 < 32; i13 += 4) {
                        int[] iArr = this.f36895a;
                        iArr[0] = a(iArr, this.f36896b[i13]);
                        int[] iArr2 = this.f36895a;
                        iArr2[1] = b(iArr2, this.f36896b[i13 + 1]);
                        int[] iArr3 = this.f36895a;
                        iArr3[2] = c(iArr3, this.f36896b[i13 + 2]);
                        int[] iArr4 = this.f36895a;
                        iArr4[3] = d(iArr4, this.f36896b[i13 + 3]);
                    }
                    r70.i.f(this.f36895a[3], bArr2, i12);
                    r70.i.f(this.f36895a[2], bArr2, i12 + 4);
                    r70.i.f(this.f36895a[1], bArr2, i12 + 8);
                    r70.i.f(this.f36895a[0], bArr2, i12 + 12);
                    return 16;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("SM4 not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}