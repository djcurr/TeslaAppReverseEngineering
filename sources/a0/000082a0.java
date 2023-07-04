package l50;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public class u implements org.bouncycastle.crypto.e {

    /* renamed from: d  reason: collision with root package name */
    private static byte[] f36914d = {4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, 11, 8, 12};

    /* renamed from: e  reason: collision with root package name */
    private static byte[] f36915e = {4, 2, 15, 5, 9, 1, 0, 8, 14, 3, 11, 12, 13, 7, 10, 6, 12, 9, 15, 14, 8, 1, 3, 10, 2, 7, 4, 13, 6, 0, 11, 5, 13, 8, 14, 12, 7, 3, 9, 10, 1, 5, 2, 4, 6, 15, 0, 11, 14, 9, 11, 2, 5, 15, 7, 1, 0, 13, 12, 6, 10, 4, 3, 8, 3, 14, 5, 9, 6, 8, 0, 13, 10, 11, 7, 12, 2, 1, 15, 4, 8, 15, 6, 11, 1, 9, 12, 5, 13, 3, 7, 10, 0, 14, 2, 4, 9, 11, 12, 0, 3, 6, 7, 5, 4, 8, 14, 15, 1, 10, 2, 13, 12, 6, 5, 2, 11, 0, 9, 13, 3, 14, 7, 10, 15, 4, 1, 8};

    /* renamed from: f  reason: collision with root package name */
    private static byte[] f36916f = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};

    /* renamed from: g  reason: collision with root package name */
    private static byte[] f36917g = {8, 4, 11, 1, 3, 5, 0, 9, 2, 14, 10, 12, 13, 6, 7, 15, 0, 1, 2, 10, 4, 13, 5, 12, 9, 7, 3, 15, 11, 8, 6, 14, 14, 12, 0, 10, 9, 2, 13, 11, 7, 5, 8, 15, 3, 6, 1, 4, 7, 5, 0, 13, 11, 6, 1, 2, 3, 10, 12, 15, 4, 14, 9, 8, 2, 7, 12, 15, 9, 5, 10, 11, 1, 4, 0, 13, 6, 8, 14, 3, 8, 3, 2, 6, 4, 13, 14, 11, 12, 1, 7, 15, 10, 0, 9, 5, 5, 2, 10, 11, 9, 1, 12, 3, 7, 4, 13, 0, 6, 15, 8, 14, 0, 4, 11, 14, 8, 3, 7, 1, 10, 2, 9, 6, 15, 13, 5, 12};

    /* renamed from: h  reason: collision with root package name */
    private static byte[] f36918h = {1, 11, 12, 2, 9, 13, 0, 15, 4, 5, 8, 14, 10, 7, 6, 3, 0, 1, 7, 13, 11, 4, 5, 2, 8, 14, 15, 12, 9, 10, 6, 3, 8, 2, 5, 0, 4, 9, 15, 10, 3, 7, 12, 13, 6, 14, 1, 11, 3, 6, 0, 1, 5, 13, 10, 8, 11, 2, 9, 7, 14, 15, 12, 4, 8, 13, 11, 0, 4, 5, 1, 2, 9, 3, 12, 14, 6, 15, 10, 7, 12, 9, 11, 1, 8, 14, 2, 4, 7, 3, 6, 5, 10, 0, 15, 13, 10, 9, 6, 8, 13, 14, 2, 0, 15, 3, 5, 11, 4, 1, 12, 7, 7, 4, 0, 5, 10, 2, 15, 14, 12, 6, 1, 11, 13, 9, 3, 8};

    /* renamed from: i  reason: collision with root package name */
    private static byte[] f36919i = {15, 12, 2, 10, 6, 4, 5, 0, 7, 9, 14, 13, 1, 11, 8, 3, 11, 6, 3, 4, 12, 15, 14, 2, 7, 13, 8, 0, 5, 10, 9, 1, 1, 12, 11, 0, 15, 14, 6, 5, 10, 13, 4, 8, 9, 3, 7, 2, 1, 5, 14, 12, 10, 7, 0, 13, 6, 2, 11, 4, 9, 3, 15, 8, 0, 12, 8, 9, 13, 2, 10, 11, 7, 3, 6, 5, 4, 14, 15, 1, 8, 0, 15, 3, 2, 5, 14, 11, 1, 10, 4, 7, 12, 9, 13, 6, 3, 0, 6, 15, 1, 14, 9, 2, 13, 8, 12, 4, 11, 10, 5, 7, 1, 10, 6, 8, 15, 11, 0, 4, 12, 3, 5, 9, 7, 13, 2, 14};

    /* renamed from: j  reason: collision with root package name */
    private static byte[] f36920j = {12, 4, 6, 2, 10, 5, 11, 9, 14, 8, 13, 7, 0, 3, 15, 1, 6, 8, 2, 3, 9, 10, 5, 12, 1, 14, 4, 7, 11, 13, 0, 15, 11, 3, 5, 8, 2, 15, 10, 13, 14, 1, 7, 4, 12, 9, 6, 0, 12, 8, 2, 1, 13, 4, 15, 6, 7, 0, 10, 5, 3, 14, 9, 11, 7, 15, 5, 10, 8, 1, 6, 13, 0, 9, 3, 14, 11, 4, 2, 12, 5, 13, 15, 6, 9, 2, 12, 10, 11, 7, 8, 1, 4, 3, 14, 0, 8, 14, 2, 5, 6, 9, 1, 12, 15, 4, 11, 0, 13, 10, 3, 7, 1, 7, 14, 13, 0, 5, 8, 3, 4, 15, 10, 6, 9, 12, 11, 2};

    /* renamed from: k  reason: collision with root package name */
    private static byte[] f36921k = {4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, 11, 8, 12};

    /* renamed from: l  reason: collision with root package name */
    private static byte[] f36922l = {10, 4, 5, 6, 8, 1, 3, 7, 13, 12, 14, 0, 9, 2, 11, 15, 5, 15, 4, 0, 2, 13, 11, 9, 1, 7, 6, 3, 12, 14, 10, 8, 7, 15, 12, 14, 9, 4, 1, 0, 3, 11, 5, 2, 6, 10, 8, 13, 4, 10, 7, 12, 0, 15, 2, 8, 14, 1, 6, 5, 13, 11, 9, 3, 7, 6, 4, 11, 9, 12, 2, 10, 1, 8, 0, 14, 15, 13, 3, 5, 7, 6, 2, 4, 13, 9, 15, 0, 10, 1, 5, 11, 8, 14, 12, 3, 13, 14, 4, 1, 7, 0, 5, 10, 3, 12, 8, 15, 6, 2, 9, 11, 1, 3, 10, 9, 5, 11, 4, 15, 8, 6, 7, 14, 13, 0, 2, 12};

    /* renamed from: m  reason: collision with root package name */
    private static Hashtable f36923m = new Hashtable();

    /* renamed from: b  reason: collision with root package name */
    private boolean f36925b;

    /* renamed from: a  reason: collision with root package name */
    private int[] f36924a = null;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f36926c = f36914d;

    static {
        c("Default", f36914d);
        c("E-TEST", f36915e);
        c("E-A", f36916f);
        c("E-B", f36917g);
        c("E-C", f36918h);
        c("E-D", f36919i);
        c("Param-Z", f36920j);
        c("D-TEST", f36921k);
        c("D-A", f36922l);
    }

    private void a(int[] iArr, byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13;
        int i14;
        int d11 = d(bArr, i11);
        int d12 = d(bArr, i11 + 4);
        int i15 = 7;
        if (this.f36925b) {
            for (int i16 = 0; i16 < 3; i16++) {
                int i17 = 0;
                while (i17 < 8) {
                    i17++;
                    int i18 = d11;
                    d11 = d12 ^ b(d11, iArr[i17]);
                    d12 = i18;
                }
            }
            i13 = d12;
            i14 = d11;
            while (i15 > 0) {
                int b11 = i13 ^ b(i14, iArr[i15]);
                i15--;
                i13 = i14;
                i14 = b11;
            }
        } else {
            int i19 = 0;
            while (i19 < 8) {
                i19++;
                int i21 = d11;
                d11 = d12 ^ b(d11, iArr[i19]);
                d12 = i21;
            }
            i13 = d12;
            i14 = d11;
            for (int i22 = 0; i22 < 3; i22++) {
                int i23 = 7;
                while (i23 >= 0 && (i22 != 2 || i23 != 0)) {
                    int b12 = i13 ^ b(i14, iArr[i23]);
                    i23--;
                    i13 = i14;
                    i14 = b12;
                }
            }
        }
        h(i14, bArr2, i12);
        h(b(i14, iArr[0]) ^ i13, bArr2, i12 + 4);
    }

    private int b(int i11, int i12) {
        int i13 = i12 + i11;
        byte[] bArr = this.f36926c;
        int i14 = (bArr[((i13 >> 0) & 15) + 0] << 0) + (bArr[((i13 >> 4) & 15) + 16] << 4) + (bArr[((i13 >> 8) & 15) + 32] << 8) + (bArr[((i13 >> 12) & 15) + 48] << 12) + (bArr[((i13 >> 16) & 15) + 64] << Tnaf.POW_2_WIDTH) + (bArr[((i13 >> 20) & 15) + 80] << 20) + (bArr[((i13 >> 24) & 15) + 96] << 24) + (bArr[((i13 >> 28) & 15) + 112] << 28);
        return (i14 << 11) | (i14 >>> 21);
    }

    private static void c(String str, byte[] bArr) {
        f36923m.put(r70.m.k(str), bArr);
    }

    private int d(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] << 24) & (-16777216)) + ((bArr[i11 + 2] << Tnaf.POW_2_WIDTH) & 16711680) + ((bArr[i11 + 1] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) + (bArr[i11] & 255);
    }

    private int[] e(boolean z11, byte[] bArr) {
        this.f36925b = z11;
        if (bArr.length == 32) {
            int[] iArr = new int[8];
            for (int i11 = 0; i11 != 8; i11++) {
                iArr[i11] = d(bArr, i11 * 4);
            }
            return iArr;
        }
        throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
    }

    public static byte[] f(String str) {
        byte[] bArr = (byte[]) f36923m.get(r70.m.k(str));
        if (bArr != null) {
            return org.bouncycastle.util.a.h(bArr);
        }
        throw new IllegalArgumentException("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
    }

    public static String g(byte[] bArr) {
        Enumeration keys = f36923m.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            if (org.bouncycastle.util.a.c((byte[]) f36923m.get(str), bArr)) {
                return str;
            }
        }
        throw new IllegalArgumentException("SBOX provided did not map to a known one");
    }

    private void h(int i11, byte[] bArr, int i12) {
        bArr[i12 + 3] = (byte) (i11 >>> 24);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12] = (byte) i11;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "GOST28147";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof u50.h1) {
            u50.h1 h1Var = (u50.h1) iVar;
            byte[] b11 = h1Var.b();
            if (b11.length != f36914d.length) {
                throw new IllegalArgumentException("invalid S-box passed to GOST28147 init");
            }
            this.f36926c = org.bouncycastle.util.a.h(b11);
            if (h1Var.a() != null) {
                this.f36924a = e(z11, ((u50.b1) h1Var.a()).a());
            }
        } else if (iVar instanceof u50.b1) {
            this.f36924a = e(z11, ((u50.b1) iVar).a());
        } else if (iVar == null) {
        } else {
            throw new IllegalArgumentException("invalid parameter passed to GOST28147 init - " + iVar.getClass().getName());
        }
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int[] iArr = this.f36924a;
        if (iArr != null) {
            if (i11 + 8 <= bArr.length) {
                if (i12 + 8 <= bArr2.length) {
                    a(iArr, bArr, i11, bArr2, i12);
                    return 8;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("GOST28147 engine not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}