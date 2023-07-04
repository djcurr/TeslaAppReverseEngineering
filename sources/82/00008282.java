package l50;

import okhttp3.internal.http2.Settings;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public class g1 implements org.bouncycastle.crypto.b0, r70.h {

    /* renamed from: h */
    private static final byte[] f36745h = {62, 114, 91, 71, -54, -32, 0, 51, 4, -47, 84, -104, 9, -71, 109, -53, 123, 27, -7, 50, -81, -99, 106, -91, -72, 45, -4, 29, 8, 83, 3, -112, 77, 78, -124, -103, -28, -50, -39, -111, -35, -74, -123, 72, -117, 41, 110, -84, -51, -63, -8, 30, 115, 67, 105, -58, -75, -67, -3, 57, 99, 32, -44, 56, 118, 125, -78, -89, -49, -19, 87, -59, -13, 44, -69, 20, 33, 6, 85, -101, -29, -17, 94, 49, 79, Byte.MAX_VALUE, 90, -92, 13, -126, 81, 73, 95, -70, 88, 28, 74, 22, -43, 23, -88, -110, 36, 31, -116, -1, -40, -82, 46, 1, -45, -83, 59, 75, -38, 70, -21, -55, -34, -102, -113, -121, -41, 58, Byte.MIN_VALUE, 111, 47, -56, -79, -76, 55, -9, 10, 34, 19, 40, 124, -52, 60, -119, -57, -61, -106, 86, 7, -65, 126, -16, 11, 43, -105, 82, 53, 65, 121, 97, -90, 76, Tnaf.POW_2_WIDTH, -2, PSSSigner.TRAILER_IMPLICIT, 38, -107, -120, -118, -80, -93, -5, -64, 24, -108, -14, -31, -27, -23, 93, -48, -36, 17, 102, 100, 92, -20, 89, 66, 117, 18, -11, 116, -100, -86, 35, 14, -122, -85, -66, 42, 2, -25, 103, -26, 68, -94, 108, -62, -109, -97, -15, -10, -6, 54, -46, 80, 104, -98, 98, 113, 21, 61, -42, 64, -60, -30, 15, -114, -125, 119, 107, 37, 5, 63, 12, 48, -22, 112, -73, -95, -24, -87, 101, -115, 39, 26, -37, -127, -77, -96, -12, 69, 122, 25, -33, -18, 120, 52, 96};

    /* renamed from: i */
    private static final byte[] f36746i = {85, -62, 99, 113, 59, -56, 71, -122, -97, 60, -38, 91, 41, -86, -3, 119, -116, -59, -108, 12, -90, 26, 19, 0, -29, -88, 22, 114, 64, -7, -8, 66, 68, 38, 104, -106, -127, -39, 69, 62, Tnaf.POW_2_WIDTH, 118, -58, -89, -117, 57, 67, -31, 58, -75, 86, 42, -64, 109, -77, 5, 34, 102, -65, -36, 11, -6, 98, 72, -35, 32, 17, 6, 54, -55, -63, -49, -10, 39, 82, -69, 105, -11, -44, -121, Byte.MAX_VALUE, -124, 76, -46, -100, 87, -92, PSSSigner.TRAILER_IMPLICIT, 79, -102, -33, -2, -42, -115, 122, -21, 43, 83, -40, 92, -95, 20, 23, -5, 35, -43, 125, 48, 103, 115, 8, 9, -18, -73, 112, 63, 97, -78, 25, -114, 78, -27, 75, -109, -113, 93, -37, -87, -83, -15, -82, 46, -53, 13, -4, -12, 45, 70, 110, 29, -105, -24, -47, -23, 77, 55, -91, 117, 94, -125, -98, -85, -126, -99, -71, 28, -32, -51, 73, -119, 1, -74, -67, 88, 36, -94, 95, 56, 120, -103, 21, -112, 80, -72, -107, -28, -48, -111, -57, -50, -19, 15, -76, 111, -96, -52, -16, 2, 74, 121, -61, -34, -93, -17, -22, 81, -26, 107, 24, -20, 27, 44, Byte.MIN_VALUE, -9, 116, -25, -1, 33, 90, 106, 84, 30, 65, 49, -110, 53, -60, 51, 7, 10, -70, 126, 14, 52, -120, -79, -104, 124, -13, 61, 96, 108, 123, -54, -45, 31, 50, 101, 4, 40, 100, -66, -123, -101, 47, 89, -118, -41, -80, 37, -84, -81, 18, 3, -30, -14};

    /* renamed from: j */
    private static final short[] f36747j = {17623, 9916, 25195, 4958, 22409, 13794, 28981, 2479, 19832, 12051, 27588, 6897, 24102, 15437, 30874, 18348};

    /* renamed from: a */
    private final int[] f36748a;

    /* renamed from: b */
    private final int[] f36749b;

    /* renamed from: c */
    private final int[] f36750c;

    /* renamed from: d */
    private int f36751d;

    /* renamed from: e */
    private final byte[] f36752e;

    /* renamed from: f */
    private int f36753f;

    /* renamed from: g */
    private g1 f36754g;

    public g1() {
        this.f36748a = new int[16];
        this.f36749b = new int[2];
        this.f36750c = new int[4];
        this.f36752e = new byte[4];
    }

    public g1(g1 g1Var) {
        this.f36748a = new int[16];
        this.f36749b = new int[2];
        this.f36750c = new int[4];
        this.f36752e = new byte[4];
        a(g1Var);
    }

    private int b(int i11, int i12) {
        int i13 = i11 + i12;
        return (Integer.MAX_VALUE & i13) + (i13 >>> 31);
    }

    private void c() {
        int[] iArr = this.f36750c;
        int[] iArr2 = this.f36748a;
        iArr[0] = ((iArr2[15] & 2147450880) << 1) | (iArr2[14] & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        iArr[1] = ((iArr2[11] & Settings.DEFAULT_INITIAL_WINDOW_SIZE) << 16) | (iArr2[9] >>> 15);
        iArr[2] = ((iArr2[7] & Settings.DEFAULT_INITIAL_WINDOW_SIZE) << 16) | (iArr2[5] >>> 15);
        iArr[3] = (iArr2[0] >>> 15) | ((iArr2[2] & Settings.DEFAULT_INITIAL_WINDOW_SIZE) << 16);
    }

    private static int e(int i11) {
        return l(i11, 24) ^ (((l(i11, 2) ^ i11) ^ l(i11, 10)) ^ l(i11, 18));
    }

    private static int f(int i11) {
        return l(i11, 30) ^ (((l(i11, 8) ^ i11) ^ l(i11, 14)) ^ l(i11, 22));
    }

    private void g(int i11) {
        int[] iArr = this.f36748a;
        int b11 = b(b(b(b(b(b(iArr[0], k(iArr[0], 8)), k(this.f36748a[4], 20)), k(this.f36748a[10], 21)), k(this.f36748a[13], 17)), k(this.f36748a[15], 15)), i11);
        int[] iArr2 = this.f36748a;
        iArr2[0] = iArr2[1];
        iArr2[1] = iArr2[2];
        iArr2[2] = iArr2[3];
        iArr2[3] = iArr2[4];
        iArr2[4] = iArr2[5];
        iArr2[5] = iArr2[6];
        iArr2[6] = iArr2[7];
        iArr2[7] = iArr2[8];
        iArr2[8] = iArr2[9];
        iArr2[9] = iArr2[10];
        iArr2[10] = iArr2[11];
        iArr2[11] = iArr2[12];
        iArr2[12] = iArr2[13];
        iArr2[13] = iArr2[14];
        iArr2[14] = iArr2[15];
        iArr2[15] = b11;
    }

    private void h() {
        int[] iArr = this.f36748a;
        int b11 = b(b(b(b(b(iArr[0], k(iArr[0], 8)), k(this.f36748a[4], 20)), k(this.f36748a[10], 21)), k(this.f36748a[13], 17)), k(this.f36748a[15], 15));
        int[] iArr2 = this.f36748a;
        iArr2[0] = iArr2[1];
        iArr2[1] = iArr2[2];
        iArr2[2] = iArr2[3];
        iArr2[3] = iArr2[4];
        iArr2[4] = iArr2[5];
        iArr2[5] = iArr2[6];
        iArr2[6] = iArr2[7];
        iArr2[7] = iArr2[8];
        iArr2[8] = iArr2[9];
        iArr2[9] = iArr2[10];
        iArr2[10] = iArr2[11];
        iArr2[11] = iArr2[12];
        iArr2[12] = iArr2[13];
        iArr2[13] = iArr2[14];
        iArr2[14] = iArr2[15];
        iArr2[15] = b11;
    }

    private static int i(byte b11, short s11, byte b12) {
        return ((b11 & 255) << 23) | ((s11 & 65535) << 8) | (b12 & 255);
    }

    private static int j(byte b11, byte b12, byte b13, byte b14) {
        return ((b11 & 255) << 24) | ((b12 & 255) << 16) | ((b13 & 255) << 8) | (b14 & 255);
    }

    private static int k(int i11, int i12) {
        return ((i11 >>> (31 - i12)) | (i11 << i12)) & Integer.MAX_VALUE;
    }

    static int l(int i11, int i12) {
        return (i11 >>> (32 - i12)) | (i11 << i12);
    }

    public static void m(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) (i11 >> 24);
        bArr[i12 + 1] = (byte) (i11 >> 16);
        bArr[i12 + 2] = (byte) (i11 >> 8);
        bArr[i12 + 3] = (byte) i11;
    }

    private void o() {
        m(p(), this.f36752e, 0);
    }

    private void r(byte[] bArr, byte[] bArr2) {
        s(this.f36748a, bArr, bArr2);
        int[] iArr = this.f36749b;
        iArr[0] = 0;
        iArr[1] = 0;
        int i11 = 32;
        while (true) {
            c();
            if (i11 <= 0) {
                d();
                h();
                return;
            }
            g(d() >>> 1);
            i11--;
        }
    }

    @Override // r70.h
    public void a(r70.h hVar) {
        g1 g1Var = (g1) hVar;
        int[] iArr = g1Var.f36748a;
        int[] iArr2 = this.f36748a;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = g1Var.f36749b;
        int[] iArr4 = this.f36749b;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        int[] iArr5 = g1Var.f36750c;
        int[] iArr6 = this.f36750c;
        System.arraycopy(iArr5, 0, iArr6, 0, iArr6.length);
        byte[] bArr = g1Var.f36752e;
        byte[] bArr2 = this.f36752e;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f36751d = g1Var.f36751d;
        this.f36753f = g1Var.f36753f;
        this.f36754g = g1Var;
    }

    @Override // r70.h
    public r70.h copy() {
        return new g1(this);
    }

    int d() {
        int[] iArr = this.f36750c;
        int i11 = iArr[0];
        int[] iArr2 = this.f36749b;
        int i12 = (i11 ^ iArr2[0]) + iArr2[1];
        int i13 = iArr2[0] + iArr[1];
        int i14 = iArr[2] ^ iArr2[1];
        int e11 = e((i13 << 16) | (i14 >>> 16));
        int f11 = f((i14 << 16) | (i13 >>> 16));
        int[] iArr3 = this.f36749b;
        byte[] bArr = f36745h;
        byte b11 = bArr[e11 >>> 24];
        byte[] bArr2 = f36746i;
        iArr3[0] = j(b11, bArr2[(e11 >>> 16) & 255], bArr[(e11 >>> 8) & 255], bArr2[e11 & 255]);
        this.f36749b[1] = j(bArr[f11 >>> 24], bArr2[(f11 >>> 16) & 255], bArr[(f11 >>> 8) & 255], bArr2[f11 & 255]);
        return i12;
    }

    @Override // org.bouncycastle.crypto.b0
    public String getAlgorithmName() {
        return "Zuc-128";
    }

    @Override // org.bouncycastle.crypto.b0
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        byte[] bArr;
        if (iVar instanceof u50.f1) {
            u50.f1 f1Var = (u50.f1) iVar;
            bArr = f1Var.a();
            iVar = f1Var.b();
        } else {
            bArr = null;
        }
        byte[] a11 = iVar instanceof u50.b1 ? ((u50.b1) iVar).a() : null;
        this.f36751d = 0;
        this.f36753f = 0;
        r(a11, bArr);
        this.f36754g = (g1) copy();
    }

    protected int n() {
        return 2047;
    }

    public int p() {
        int i11 = this.f36753f;
        this.f36753f = i11 + 1;
        if (i11 < n()) {
            c();
            int d11 = d() ^ this.f36750c[3];
            h();
            return d11;
        }
        throw new IllegalStateException("Too much data processed by singleKey/IV");
    }

    @Override // org.bouncycastle.crypto.b0
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (this.f36754g == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i11 + i12 <= bArr.length) {
            if (i13 + i12 <= bArr2.length) {
                for (int i14 = 0; i14 < i12; i14++) {
                    bArr2[i14 + i13] = q(bArr[i14 + i11]);
                }
                return i12;
            }
            throw new OutputLengthException("output buffer too short");
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    public byte q(byte b11) {
        if (this.f36751d == 0) {
            o();
        }
        byte[] bArr = this.f36752e;
        int i11 = this.f36751d;
        byte b12 = (byte) (b11 ^ bArr[i11]);
        this.f36751d = (i11 + 1) % 4;
        return b12;
    }

    @Override // org.bouncycastle.crypto.b0
    public void reset() {
        g1 g1Var = this.f36754g;
        if (g1Var != null) {
            a(g1Var);
        }
    }

    protected void s(int[] iArr, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 16) {
            throw new IllegalArgumentException("A key of 16 bytes is needed");
        }
        if (bArr2 == null || bArr2.length != 16) {
            throw new IllegalArgumentException("An IV of 16 bytes is needed");
        }
        int[] iArr2 = this.f36748a;
        byte b11 = bArr[0];
        short[] sArr = f36747j;
        iArr2[0] = i(b11, sArr[0], bArr2[0]);
        this.f36748a[1] = i(bArr[1], sArr[1], bArr2[1]);
        this.f36748a[2] = i(bArr[2], sArr[2], bArr2[2]);
        this.f36748a[3] = i(bArr[3], sArr[3], bArr2[3]);
        this.f36748a[4] = i(bArr[4], sArr[4], bArr2[4]);
        this.f36748a[5] = i(bArr[5], sArr[5], bArr2[5]);
        this.f36748a[6] = i(bArr[6], sArr[6], bArr2[6]);
        this.f36748a[7] = i(bArr[7], sArr[7], bArr2[7]);
        this.f36748a[8] = i(bArr[8], sArr[8], bArr2[8]);
        this.f36748a[9] = i(bArr[9], sArr[9], bArr2[9]);
        this.f36748a[10] = i(bArr[10], sArr[10], bArr2[10]);
        this.f36748a[11] = i(bArr[11], sArr[11], bArr2[11]);
        this.f36748a[12] = i(bArr[12], sArr[12], bArr2[12]);
        this.f36748a[13] = i(bArr[13], sArr[13], bArr2[13]);
        this.f36748a[14] = i(bArr[14], sArr[14], bArr2[14]);
        this.f36748a[15] = i(bArr[15], sArr[15], bArr2[15]);
    }
}