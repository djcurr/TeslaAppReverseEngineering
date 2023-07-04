package i50;

import androidx.recyclerview.widget.l;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;

/* loaded from: classes5.dex */
public final class h0 implements org.bouncycastle.crypto.r, r70.h {

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f30038j = {24, 35, 198, 232, 135, 184, 1, 79, 54, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256, 210, 245, 121, 111, 145, 82, 96, 188, 155, 142, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, 12, 123, 53, 29, 224, 215, 194, 46, 75, 254, 87, 21, 119, 55, 229, 159, 240, 74, 218, 88, 201, 41, 10, CipherSuite.TLS_PSK_WITH_NULL_SHA384, 160, 107, 133, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, 93, 16, 244, 203, 62, 5, 103, 228, 39, 65, 139, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, 125, 149, 216, 251, 238, 124, 102, 221, 23, 71, 158, 202, 45, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 7, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 90, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE, 51, 99, 2, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 113, 200, 25, 73, 217, 242, 227, 91, 136, 154, 38, 50, 176, 233, 15, 213, 128, 190, 205, 52, 72, 255, 122, 144, 95, 32, 104, 26, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, 84, 147, 34, 100, 241, 115, 18, 64, 8, 195, 236, 219, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, 141, 61, 151, 0, 207, 43, 118, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 214, 27, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 106, 80, 69, 243, 48, 239, 63, 85, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, 234, 101, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, 47, 192, 222, 28, 253, 77, 146, 117, 6, 138, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, 230, 14, 31, 98, 212, 168, 150, 249, 197, 37, 89, 132, 114, 57, 76, 94, 120, 56, 140, 209, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, 226, 97, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 33, 156, 30, 67, 199, 252, 4, 81, 153, 109, 13, l.f.DEFAULT_SWIPE_ANIMATION_DURATION, 223, 126, 36, 59, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 206, 17, 143, 78, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, 235, 60, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 148, 247, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, 19, 44, Primes.SMALL_FACTOR_LIMIT, 231, 110, 196, 3, 86, 68, 127, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, 42, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, 193, 83, 220, 11, 157, 108, 49, 116, 246, 70, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 137, 20, 225, 22, 58, 105, 9, 112, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, 208, 237, 204, 66, 152, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, 40, 92, 248, 134};

    /* renamed from: k  reason: collision with root package name */
    private static final long[] f30039k = new long[256];

    /* renamed from: l  reason: collision with root package name */
    private static final long[] f30040l = new long[256];

    /* renamed from: m  reason: collision with root package name */
    private static final long[] f30041m = new long[256];

    /* renamed from: n  reason: collision with root package name */
    private static final long[] f30042n = new long[256];

    /* renamed from: o  reason: collision with root package name */
    private static final long[] f30043o = new long[256];

    /* renamed from: p  reason: collision with root package name */
    private static final long[] f30044p = new long[256];

    /* renamed from: q  reason: collision with root package name */
    private static final long[] f30045q = new long[256];

    /* renamed from: r  reason: collision with root package name */
    private static final long[] f30046r = new long[256];

    /* renamed from: s  reason: collision with root package name */
    private static final short[] f30047s;

    /* renamed from: a  reason: collision with root package name */
    private final long[] f30048a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f30049b;

    /* renamed from: c  reason: collision with root package name */
    private int f30050c;

    /* renamed from: d  reason: collision with root package name */
    private short[] f30051d;

    /* renamed from: e  reason: collision with root package name */
    private long[] f30052e;

    /* renamed from: f  reason: collision with root package name */
    private long[] f30053f;

    /* renamed from: g  reason: collision with root package name */
    private long[] f30054g;

    /* renamed from: h  reason: collision with root package name */
    private long[] f30055h;

    /* renamed from: i  reason: collision with root package name */
    private long[] f30056i;

    static {
        short[] sArr = new short[32];
        f30047s = sArr;
        sArr[31] = 8;
    }

    public h0() {
        this.f30048a = new long[11];
        this.f30049b = new byte[64];
        this.f30050c = 0;
        this.f30051d = new short[32];
        this.f30052e = new long[8];
        this.f30053f = new long[8];
        this.f30054g = new long[8];
        this.f30055h = new long[8];
        this.f30056i = new long[8];
        for (int i11 = 0; i11 < 256; i11++) {
            int i12 = f30038j[i11];
            int g11 = g(i12 << 1);
            int g12 = g(g11 << 1);
            int i13 = g12 ^ i12;
            int g13 = g(g12 << 1);
            int i14 = g13 ^ i12;
            f30039k[i11] = h(i12, i12, g12, i12, g13, i13, g11, i14);
            f30040l[i11] = h(i14, i12, i12, g12, i12, g13, i13, g11);
            f30041m[i11] = h(g11, i14, i12, i12, g12, i12, g13, i13);
            f30042n[i11] = h(i13, g11, i14, i12, i12, g12, i12, g13);
            f30043o[i11] = h(g13, i13, g11, i14, i12, i12, g12, i12);
            f30044p[i11] = h(i12, g13, i13, g11, i14, i12, i12, g12);
            f30045q[i11] = h(g12, i12, g13, i13, g11, i14, i12, i12);
            f30046r[i11] = h(i12, g12, i12, g13, i13, g11, i14, i12);
        }
        this.f30048a[0] = 0;
        for (int i15 = 1; i15 <= 10; i15++) {
            int i16 = (i15 - 1) * 8;
            this.f30048a[i15] = (((((((f30039k[i16] & (-72057594037927936L)) ^ (f30040l[i16 + 1] & 71776119061217280L)) ^ (f30041m[i16 + 2] & 280375465082880L)) ^ (f30042n[i16 + 3] & 1095216660480L)) ^ (f30043o[i16 + 4] & 4278190080L)) ^ (f30044p[i16 + 5] & 16711680)) ^ (f30045q[i16 + 6] & 65280)) ^ (f30046r[i16 + 7] & 255);
        }
    }

    public h0(h0 h0Var) {
        this.f30048a = new long[11];
        this.f30049b = new byte[64];
        this.f30050c = 0;
        this.f30051d = new short[32];
        this.f30052e = new long[8];
        this.f30053f = new long[8];
        this.f30054g = new long[8];
        this.f30055h = new long[8];
        this.f30056i = new long[8];
        a(h0Var);
    }

    private long b(byte[] bArr, int i11) {
        return (bArr[i11 + 7] & 255) | ((bArr[i11 + 0] & 255) << 56) | ((bArr[i11 + 1] & 255) << 48) | ((bArr[i11 + 2] & 255) << 40) | ((bArr[i11 + 3] & 255) << 32) | ((bArr[i11 + 4] & 255) << 24) | ((bArr[i11 + 5] & 255) << 16) | ((bArr[i11 + 6] & 255) << 8);
    }

    private void c(long j11, byte[] bArr, int i11) {
        for (int i12 = 0; i12 < 8; i12++) {
            bArr[i11 + i12] = (byte) ((j11 >> (56 - (i12 * 8))) & 255);
        }
    }

    private byte[] d() {
        byte[] bArr = new byte[32];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i11] = (byte) (this.f30051d[i11] & 255);
        }
        return bArr;
    }

    private void e() {
        byte[] d11 = d();
        byte[] bArr = this.f30049b;
        int i11 = this.f30050c;
        int i12 = i11 + 1;
        this.f30050c = i12;
        bArr[i11] = (byte) (bArr[i11] | 128);
        if (i12 == bArr.length) {
            j(bArr, 0);
        }
        if (this.f30050c > 32) {
            while (this.f30050c != 0) {
                update((byte) 0);
            }
        }
        while (this.f30050c <= 32) {
            update((byte) 0);
        }
        System.arraycopy(d11, 0, this.f30049b, 32, d11.length);
        j(this.f30049b, 0);
    }

    private void f() {
        int i11 = 0;
        for (int length = this.f30051d.length - 1; length >= 0; length--) {
            short[] sArr = this.f30051d;
            int i12 = (sArr[length] & 255) + f30047s[length] + i11;
            i11 = i12 >>> 8;
            sArr[length] = (short) (i12 & 255);
        }
    }

    private int g(int i11) {
        return ((long) i11) >= 256 ? i11 ^ 285 : i11;
    }

    private long h(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        return (((((((i12 << 48) ^ (i11 << 56)) ^ (i13 << 40)) ^ (i14 << 32)) ^ (i15 << 24)) ^ (i16 << 16)) ^ (i17 << 8)) ^ i18;
    }

    private void j(byte[] bArr, int i11) {
        for (int i12 = 0; i12 < this.f30056i.length; i12++) {
            this.f30055h[i12] = b(this.f30049b, i12 * 8);
        }
        i();
        this.f30050c = 0;
        org.bouncycastle.util.a.y(this.f30049b, (byte) 0);
    }

    @Override // r70.h
    public void a(r70.h hVar) {
        h0 h0Var = (h0) hVar;
        long[] jArr = h0Var.f30048a;
        long[] jArr2 = this.f30048a;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = h0Var.f30049b;
        byte[] bArr2 = this.f30049b;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f30050c = h0Var.f30050c;
        short[] sArr = h0Var.f30051d;
        short[] sArr2 = this.f30051d;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = h0Var.f30052e;
        long[] jArr4 = this.f30052e;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = h0Var.f30053f;
        long[] jArr6 = this.f30053f;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = h0Var.f30054g;
        long[] jArr8 = this.f30054g;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = h0Var.f30055h;
        long[] jArr10 = this.f30055h;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = h0Var.f30056i;
        long[] jArr12 = this.f30056i;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    @Override // r70.h
    public r70.h copy() {
        return new h0(this);
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        e();
        for (int i12 = 0; i12 < 8; i12++) {
            c(this.f30052e[i12], bArr, (i12 * 8) + i11);
        }
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "Whirlpool";
    }

    @Override // org.bouncycastle.crypto.r
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return 64;
    }

    protected void i() {
        long[] jArr;
        for (int i11 = 0; i11 < 8; i11++) {
            long[] jArr2 = this.f30056i;
            long j11 = this.f30055h[i11];
            long[] jArr3 = this.f30053f;
            long j12 = this.f30052e[i11];
            jArr3[i11] = j12;
            jArr2[i11] = j11 ^ j12;
        }
        int i12 = 1;
        while (i12 <= 10) {
            int i13 = 0;
            while (i13 < 8) {
                long[] jArr4 = this.f30054g;
                jArr4[i13] = 0;
                long j13 = jArr4[i13];
                long[] jArr5 = f30039k;
                long[] jArr6 = this.f30053f;
                jArr4[i13] = jArr5[((int) (jArr6[(i13 + 0) & 7] >>> 56)) & 255] ^ j13;
                jArr4[i13] = jArr4[i13] ^ f30040l[((int) (jArr6[(i13 - 1) & 7] >>> 48)) & 255];
                jArr4[i13] = jArr4[i13] ^ f30041m[((int) (jArr6[(i13 - 2) & 7] >>> 40)) & 255];
                jArr4[i13] = jArr4[i13] ^ f30042n[((int) (jArr6[(i13 - 3) & 7] >>> 32)) & 255];
                jArr4[i13] = jArr4[i13] ^ f30043o[((int) (jArr6[(i13 - 4) & 7] >>> 24)) & 255];
                jArr4[i13] = jArr4[i13] ^ f30044p[((int) (jArr6[(i13 - 5) & 7] >>> 16)) & 255];
                jArr4[i13] = jArr4[i13] ^ f30045q[((int) (jArr6[(i13 - 6) & 7] >>> 8)) & 255];
                jArr4[i13] = jArr4[i13] ^ f30046r[((int) jArr6[(i13 - 7) & 7]) & 255];
                i13++;
                i12 = i12;
            }
            int i14 = i12;
            long[] jArr7 = this.f30054g;
            long[] jArr8 = this.f30053f;
            System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
            long[] jArr9 = this.f30053f;
            jArr9[0] = jArr9[0] ^ this.f30048a[i14];
            int i15 = 0;
            while (true) {
                jArr = this.f30054g;
                if (i15 < 8) {
                    jArr[i15] = this.f30053f[i15];
                    long j14 = jArr[i15];
                    long[] jArr10 = f30039k;
                    long[] jArr11 = this.f30056i;
                    jArr[i15] = j14 ^ jArr10[((int) (jArr11[(i15 + 0) & 7] >>> 56)) & 255];
                    jArr[i15] = jArr[i15] ^ f30040l[((int) (jArr11[(i15 - 1) & 7] >>> 48)) & 255];
                    jArr[i15] = jArr[i15] ^ f30041m[((int) (jArr11[(i15 - 2) & 7] >>> 40)) & 255];
                    jArr[i15] = jArr[i15] ^ f30042n[((int) (jArr11[(i15 - 3) & 7] >>> 32)) & 255];
                    jArr[i15] = jArr[i15] ^ f30043o[((int) (jArr11[(i15 - 4) & 7] >>> 24)) & 255];
                    jArr[i15] = jArr[i15] ^ f30044p[((int) (jArr11[(i15 - 5) & 7] >>> 16)) & 255];
                    jArr[i15] = jArr[i15] ^ f30045q[((int) (jArr11[(i15 - 6) & 7] >>> 8)) & 255];
                    jArr[i15] = jArr[i15] ^ f30046r[((int) jArr11[(i15 - 7) & 7]) & 255];
                    i15++;
                }
            }
            long[] jArr12 = this.f30056i;
            System.arraycopy(jArr, 0, jArr12, 0, jArr12.length);
            i12 = i14 + 1;
        }
        for (int i16 = 0; i16 < 8; i16++) {
            long[] jArr13 = this.f30052e;
            jArr13[i16] = jArr13[i16] ^ (this.f30056i[i16] ^ this.f30055h[i16]);
        }
    }

    @Override // org.bouncycastle.crypto.p
    public void reset() {
        this.f30050c = 0;
        org.bouncycastle.util.a.D(this.f30051d, (short) 0);
        org.bouncycastle.util.a.y(this.f30049b, (byte) 0);
        org.bouncycastle.util.a.C(this.f30052e, 0L);
        org.bouncycastle.util.a.C(this.f30053f, 0L);
        org.bouncycastle.util.a.C(this.f30054g, 0L);
        org.bouncycastle.util.a.C(this.f30055h, 0L);
        org.bouncycastle.util.a.C(this.f30056i, 0L);
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte b11) {
        byte[] bArr = this.f30049b;
        int i11 = this.f30050c;
        bArr[i11] = b11;
        int i12 = i11 + 1;
        this.f30050c = i12;
        if (i12 == bArr.length) {
            j(bArr, 0);
        }
        f();
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte[] bArr, int i11, int i12) {
        while (i12 > 0) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
    }
}