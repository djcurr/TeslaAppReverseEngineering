package i50;

import java.lang.reflect.Array;
import org.spongycastle.crypto.tls.CipherSuite;
import u50.b1;
import u50.h1;

/* loaded from: classes5.dex */
public class d implements org.bouncycastle.crypto.r, r70.h {

    /* renamed from: s  reason: collision with root package name */
    private static final byte[] f29964s = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};

    /* renamed from: a  reason: collision with root package name */
    private byte[] f29965a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f29966b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f29967c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f29968d;

    /* renamed from: e  reason: collision with root package name */
    private byte[][] f29969e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f29970f;

    /* renamed from: g  reason: collision with root package name */
    private int f29971g;

    /* renamed from: h  reason: collision with root package name */
    private long f29972h;

    /* renamed from: i  reason: collision with root package name */
    private org.bouncycastle.crypto.e f29973i;

    /* renamed from: j  reason: collision with root package name */
    private byte[] f29974j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f29975k;

    /* renamed from: l  reason: collision with root package name */
    byte[] f29976l;

    /* renamed from: m  reason: collision with root package name */
    short[] f29977m;

    /* renamed from: n  reason: collision with root package name */
    short[] f29978n;

    /* renamed from: o  reason: collision with root package name */
    byte[] f29979o;

    /* renamed from: p  reason: collision with root package name */
    byte[] f29980p;

    /* renamed from: q  reason: collision with root package name */
    byte[] f29981q;

    /* renamed from: r  reason: collision with root package name */
    byte[] f29982r;

    public d() {
        this.f29965a = new byte[32];
        this.f29966b = new byte[32];
        this.f29967c = new byte[32];
        this.f29968d = new byte[32];
        this.f29969e = (byte[][]) Array.newInstance(byte.class, 4, 32);
        this.f29970f = new byte[32];
        this.f29973i = new l50.u();
        this.f29975k = new byte[32];
        this.f29976l = new byte[8];
        this.f29977m = new short[16];
        this.f29978n = new short[16];
        this.f29979o = new byte[32];
        this.f29980p = new byte[32];
        this.f29981q = new byte[32];
        this.f29982r = new byte[32];
        byte[] f11 = l50.u.f("D-A");
        this.f29974j = f11;
        this.f29973i.init(true, new h1(null, f11));
        reset();
    }

    public d(d dVar) {
        this.f29965a = new byte[32];
        this.f29966b = new byte[32];
        this.f29967c = new byte[32];
        this.f29968d = new byte[32];
        this.f29969e = (byte[][]) Array.newInstance(byte.class, 4, 32);
        this.f29970f = new byte[32];
        this.f29973i = new l50.u();
        this.f29975k = new byte[32];
        this.f29976l = new byte[8];
        this.f29977m = new short[16];
        this.f29978n = new short[16];
        this.f29979o = new byte[32];
        this.f29980p = new byte[32];
        this.f29981q = new byte[32];
        this.f29982r = new byte[32];
        a(dVar);
    }

    public d(byte[] bArr) {
        this.f29965a = new byte[32];
        this.f29966b = new byte[32];
        this.f29967c = new byte[32];
        this.f29968d = new byte[32];
        this.f29969e = (byte[][]) Array.newInstance(byte.class, 4, 32);
        this.f29970f = new byte[32];
        this.f29973i = new l50.u();
        this.f29975k = new byte[32];
        this.f29976l = new byte[8];
        this.f29977m = new short[16];
        this.f29978n = new short[16];
        this.f29979o = new byte[32];
        this.f29980p = new byte[32];
        this.f29981q = new byte[32];
        this.f29982r = new byte[32];
        byte[] h11 = org.bouncycastle.util.a.h(bArr);
        this.f29974j = h11;
        this.f29973i.init(true, new h1(null, h11));
        reset();
    }

    private byte[] b(byte[] bArr) {
        for (int i11 = 0; i11 < 8; i11++) {
            this.f29976l[i11] = (byte) (bArr[i11] ^ bArr[i11 + 8]);
        }
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(this.f29976l, 0, bArr, 24, 8);
        return bArr;
    }

    private void c(byte[] bArr, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        this.f29973i.init(true, new b1(bArr));
        this.f29973i.processBlock(bArr3, i12, bArr2, i11);
    }

    private byte[] d(byte[] bArr) {
        for (int i11 = 0; i11 < 8; i11++) {
            byte[] bArr2 = this.f29975k;
            int i12 = i11 * 4;
            bArr2[i12] = bArr[i11];
            bArr2[i12 + 1] = bArr[i11 + 8];
            bArr2[i12 + 2] = bArr[i11 + 16];
            bArr2[i12 + 3] = bArr[i11 + 24];
        }
        return this.f29975k;
    }

    private void e(byte[] bArr, short[] sArr) {
        for (int i11 = 0; i11 < bArr.length / 2; i11++) {
            int i12 = i11 * 2;
            sArr[i11] = (short) ((bArr[i12] & 255) | ((bArr[i12 + 1] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB));
        }
    }

    private void f(short[] sArr, byte[] bArr) {
        for (int i11 = 0; i11 < bArr.length / 2; i11++) {
            int i12 = i11 * 2;
            bArr[i12 + 1] = (byte) (sArr[i11] >> 8);
            bArr[i12] = (byte) sArr[i11];
        }
    }

    private void g() {
        r70.i.v(this.f29972h * 8, this.f29966b, 0);
        while (this.f29971g != 0) {
            update((byte) 0);
        }
        i(this.f29966b, 0);
        i(this.f29968d, 0);
    }

    private void h(byte[] bArr) {
        e(bArr, this.f29977m);
        short[] sArr = this.f29978n;
        short[] sArr2 = this.f29977m;
        sArr[15] = (short) (((((sArr2[0] ^ sArr2[1]) ^ sArr2[2]) ^ sArr2[3]) ^ sArr2[12]) ^ sArr2[15]);
        System.arraycopy(sArr2, 1, sArr, 0, 15);
        f(this.f29978n, bArr);
    }

    private void j(byte[] bArr) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr2 = this.f29968d;
            if (i11 == bArr2.length) {
                return;
            }
            int i13 = (bArr2[i11] & 255) + (bArr[i11] & 255) + i12;
            bArr2[i11] = (byte) i13;
            i12 = i13 >>> 8;
            i11++;
        }
    }

    @Override // r70.h
    public void a(r70.h hVar) {
        d dVar = (d) hVar;
        byte[] bArr = dVar.f29974j;
        this.f29974j = bArr;
        this.f29973i.init(true, new h1(null, bArr));
        reset();
        byte[] bArr2 = dVar.f29965a;
        System.arraycopy(bArr2, 0, this.f29965a, 0, bArr2.length);
        byte[] bArr3 = dVar.f29966b;
        System.arraycopy(bArr3, 0, this.f29966b, 0, bArr3.length);
        byte[] bArr4 = dVar.f29967c;
        System.arraycopy(bArr4, 0, this.f29967c, 0, bArr4.length);
        byte[] bArr5 = dVar.f29968d;
        System.arraycopy(bArr5, 0, this.f29968d, 0, bArr5.length);
        byte[][] bArr6 = dVar.f29969e;
        System.arraycopy(bArr6[1], 0, this.f29969e[1], 0, bArr6[1].length);
        byte[][] bArr7 = dVar.f29969e;
        System.arraycopy(bArr7[2], 0, this.f29969e[2], 0, bArr7[2].length);
        byte[][] bArr8 = dVar.f29969e;
        System.arraycopy(bArr8[3], 0, this.f29969e[3], 0, bArr8[3].length);
        byte[] bArr9 = dVar.f29970f;
        System.arraycopy(bArr9, 0, this.f29970f, 0, bArr9.length);
        this.f29971g = dVar.f29971g;
        this.f29972h = dVar.f29972h;
    }

    @Override // r70.h
    public r70.h copy() {
        return new d(this);
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        g();
        byte[] bArr2 = this.f29965a;
        System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "GOST3411";
    }

    @Override // org.bouncycastle.crypto.r
    public int getByteLength() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return 32;
    }

    protected void i(byte[] bArr, int i11) {
        System.arraycopy(bArr, i11, this.f29967c, 0, 32);
        System.arraycopy(this.f29965a, 0, this.f29980p, 0, 32);
        System.arraycopy(this.f29967c, 0, this.f29981q, 0, 32);
        for (int i12 = 0; i12 < 32; i12++) {
            this.f29982r[i12] = (byte) (this.f29980p[i12] ^ this.f29981q[i12]);
        }
        c(d(this.f29982r), this.f29979o, 0, this.f29965a, 0);
        for (int i13 = 1; i13 < 4; i13++) {
            byte[] b11 = b(this.f29980p);
            for (int i14 = 0; i14 < 32; i14++) {
                this.f29980p[i14] = (byte) (b11[i14] ^ this.f29969e[i13][i14]);
            }
            this.f29981q = b(b(this.f29981q));
            for (int i15 = 0; i15 < 32; i15++) {
                this.f29982r[i15] = (byte) (this.f29980p[i15] ^ this.f29981q[i15]);
            }
            int i16 = i13 * 8;
            c(d(this.f29982r), this.f29979o, i16, this.f29965a, i16);
        }
        for (int i17 = 0; i17 < 12; i17++) {
            h(this.f29979o);
        }
        for (int i18 = 0; i18 < 32; i18++) {
            byte[] bArr2 = this.f29979o;
            bArr2[i18] = (byte) (bArr2[i18] ^ this.f29967c[i18]);
        }
        h(this.f29979o);
        for (int i19 = 0; i19 < 32; i19++) {
            byte[] bArr3 = this.f29979o;
            bArr3[i19] = (byte) (this.f29965a[i19] ^ bArr3[i19]);
        }
        for (int i21 = 0; i21 < 61; i21++) {
            h(this.f29979o);
        }
        byte[] bArr4 = this.f29979o;
        byte[] bArr5 = this.f29965a;
        System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
    }

    @Override // org.bouncycastle.crypto.p
    public void reset() {
        this.f29972h = 0L;
        this.f29971g = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f29965a;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = 0;
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr2 = this.f29966b;
            if (i12 >= bArr2.length) {
                break;
            }
            bArr2[i12] = 0;
            i12++;
        }
        int i13 = 0;
        while (true) {
            byte[] bArr3 = this.f29967c;
            if (i13 >= bArr3.length) {
                break;
            }
            bArr3[i13] = 0;
            i13++;
        }
        int i14 = 0;
        while (true) {
            byte[][] bArr4 = this.f29969e;
            if (i14 >= bArr4[1].length) {
                break;
            }
            bArr4[1][i14] = 0;
            i14++;
        }
        int i15 = 0;
        while (true) {
            byte[][] bArr5 = this.f29969e;
            if (i15 >= bArr5[3].length) {
                break;
            }
            bArr5[3][i15] = 0;
            i15++;
        }
        int i16 = 0;
        while (true) {
            byte[] bArr6 = this.f29968d;
            if (i16 >= bArr6.length) {
                break;
            }
            bArr6[i16] = 0;
            i16++;
        }
        int i17 = 0;
        while (true) {
            byte[] bArr7 = this.f29970f;
            if (i17 >= bArr7.length) {
                byte[] bArr8 = f29964s;
                System.arraycopy(bArr8, 0, this.f29969e[2], 0, bArr8.length);
                return;
            }
            bArr7[i17] = 0;
            i17++;
        }
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte b11) {
        byte[] bArr = this.f29970f;
        int i11 = this.f29971g;
        int i12 = i11 + 1;
        this.f29971g = i12;
        bArr[i11] = b11;
        if (i12 == bArr.length) {
            j(bArr);
            i(this.f29970f, 0);
            this.f29971g = 0;
        }
        this.f29972h++;
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte[] bArr, int i11, int i12) {
        while (this.f29971g != 0 && i12 > 0) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
        while (true) {
            byte[] bArr2 = this.f29970f;
            if (i12 <= bArr2.length) {
                break;
            }
            System.arraycopy(bArr, i11, bArr2, 0, bArr2.length);
            j(this.f29970f);
            i(this.f29970f, 0);
            byte[] bArr3 = this.f29970f;
            i11 += bArr3.length;
            i12 -= bArr3.length;
            this.f29972h += bArr3.length;
        }
        while (i12 > 0) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
    }
}