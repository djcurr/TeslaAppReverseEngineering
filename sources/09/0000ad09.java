package q50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import u50.b1;
import u50.f1;

/* loaded from: classes5.dex */
public class n implements a {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.crypto.e f47652a;

    /* renamed from: b  reason: collision with root package name */
    private r50.c f47653b;

    /* renamed from: c  reason: collision with root package name */
    private r50.b f47654c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f47655d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f47656e;

    /* renamed from: f  reason: collision with root package name */
    private int f47657f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f47658g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f47659h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f47660i;

    /* renamed from: j  reason: collision with root package name */
    private byte[] f47661j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f47662k;

    /* renamed from: l  reason: collision with root package name */
    private byte[] f47663l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f47664m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f47665n;

    /* renamed from: o  reason: collision with root package name */
    private byte[] f47666o;

    /* renamed from: p  reason: collision with root package name */
    private byte[] f47667p;

    /* renamed from: q  reason: collision with root package name */
    private byte[] f47668q;

    /* renamed from: r  reason: collision with root package name */
    private int f47669r;

    /* renamed from: s  reason: collision with root package name */
    private int f47670s;

    /* renamed from: t  reason: collision with root package name */
    private long f47671t;

    /* renamed from: u  reason: collision with root package name */
    private byte[] f47672u;

    /* renamed from: v  reason: collision with root package name */
    private int f47673v;

    /* renamed from: w  reason: collision with root package name */
    private long f47674w;

    /* renamed from: x  reason: collision with root package name */
    private long f47675x;

    public n(org.bouncycastle.crypto.e eVar) {
        this(eVar, null);
    }

    public n(org.bouncycastle.crypto.e eVar, r50.c cVar) {
        if (eVar.getBlockSize() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        cVar = cVar == null ? new r50.e() : cVar;
        this.f47652a = eVar;
        this.f47653b = cVar;
    }

    private void a() {
        if (this.f47656e) {
            return;
        }
        if (!this.f47655d) {
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
        throw new IllegalStateException("GCM cipher cannot be reused for encryption");
    }

    private void b(byte[] bArr, byte[] bArr2, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 16) {
            e(bArr, bArr2, i12, Math.min(i11 - i12, 16));
        }
    }

    private void c(byte[] bArr, byte[] bArr2) {
        r50.d.p(bArr, bArr2);
        this.f47653b.multiplyH(bArr);
    }

    private void d(byte[] bArr, byte[] bArr2, int i11) {
        r50.d.q(bArr, bArr2, i11);
        this.f47653b.multiplyH(bArr);
    }

    private void e(byte[] bArr, byte[] bArr2, int i11, int i12) {
        r50.d.r(bArr, bArr2, i11, i12);
        this.f47653b.multiplyH(bArr);
    }

    private void f(byte[] bArr) {
        int i11 = this.f47669r;
        if (i11 == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.f47669r = i11 - 1;
        byte[] bArr2 = this.f47668q;
        int i12 = (bArr2[15] & 255) + 1;
        bArr2[15] = (byte) i12;
        int i13 = (i12 >>> 8) + (bArr2[14] & 255);
        bArr2[14] = (byte) i13;
        int i14 = (i13 >>> 8) + (bArr2[13] & 255);
        bArr2[13] = (byte) i14;
        bArr2[12] = (byte) ((i14 >>> 8) + (bArr2[12] & 255));
        this.f47652a.processBlock(bArr2, 0, bArr, 0);
    }

    private void g() {
        if (this.f47674w > 0) {
            System.arraycopy(this.f47666o, 0, this.f47667p, 0, 16);
            this.f47675x = this.f47674w;
        }
        int i11 = this.f47673v;
        if (i11 > 0) {
            e(this.f47667p, this.f47672u, 0, i11);
            this.f47675x += this.f47673v;
        }
        if (this.f47675x > 0) {
            System.arraycopy(this.f47667p, 0, this.f47665n, 0, 16);
        }
    }

    private void i(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (bArr2.length - i12 < 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.f47671t == 0) {
            g();
        }
        byte[] bArr3 = new byte[16];
        f(bArr3);
        if (this.f47655d) {
            r50.d.q(bArr3, bArr, i11);
            c(this.f47665n, bArr3);
            System.arraycopy(bArr3, 0, bArr2, i12, 16);
        } else {
            d(this.f47665n, bArr, i11);
            r50.d.o(bArr3, 0, bArr, i11, bArr2, i12);
        }
        this.f47671t += 16;
    }

    private void j(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        byte[] bArr3 = new byte[16];
        f(bArr3);
        if (this.f47655d) {
            r50.d.n(bArr, i11, bArr3, 0, i12);
            e(this.f47665n, bArr, i11, i12);
        } else {
            e(this.f47665n, bArr, i11, i12);
            r50.d.n(bArr, i11, bArr3, 0, i12);
        }
        System.arraycopy(bArr, i11, bArr2, i13, i12);
        this.f47671t += i12;
    }

    private void l(boolean z11) {
        this.f47652a.reset();
        this.f47665n = new byte[16];
        this.f47666o = new byte[16];
        this.f47667p = new byte[16];
        this.f47672u = new byte[16];
        this.f47673v = 0;
        this.f47674w = 0L;
        this.f47675x = 0L;
        this.f47668q = org.bouncycastle.util.a.h(this.f47662k);
        this.f47669r = -2;
        this.f47670s = 0;
        this.f47671t = 0L;
        byte[] bArr = this.f47663l;
        if (bArr != null) {
            org.bouncycastle.util.a.y(bArr, (byte) 0);
        }
        if (z11) {
            this.f47664m = null;
        }
        if (this.f47655d) {
            this.f47656e = false;
            return;
        }
        byte[] bArr2 = this.f47660i;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }

    @Override // q50.b
    public int doFinal(byte[] bArr, int i11) {
        a();
        if (this.f47671t == 0) {
            g();
        }
        int i12 = this.f47670s;
        if (!this.f47655d) {
            int i13 = this.f47657f;
            if (i12 < i13) {
                throw new InvalidCipherTextException("data too short");
            }
            i12 -= i13;
            if (bArr.length - i11 < i12) {
                throw new OutputLengthException("Output buffer too short");
            }
        } else if (bArr.length - i11 < this.f47657f + i12) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (i12 > 0) {
            j(this.f47663l, 0, i12, bArr, i11);
        }
        long j11 = this.f47674w;
        int i14 = this.f47673v;
        long j12 = j11 + i14;
        this.f47674w = j12;
        if (j12 > this.f47675x) {
            if (i14 > 0) {
                e(this.f47666o, this.f47672u, 0, i14);
            }
            if (this.f47675x > 0) {
                r50.d.p(this.f47666o, this.f47667p);
            }
            long j13 = ((this.f47671t * 8) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.f47654c == null) {
                r50.a aVar = new r50.a();
                this.f47654c = aVar;
                aVar.init(this.f47661j);
            }
            this.f47654c.exponentiateX(j13, bArr2);
            r50.d.i(this.f47666o, bArr2);
            r50.d.p(this.f47665n, this.f47666o);
        }
        byte[] bArr3 = new byte[16];
        r70.i.s(this.f47674w * 8, bArr3, 0);
        r70.i.s(this.f47671t * 8, bArr3, 8);
        c(this.f47665n, bArr3);
        byte[] bArr4 = new byte[16];
        this.f47652a.processBlock(this.f47662k, 0, bArr4, 0);
        r50.d.p(bArr4, this.f47665n);
        int i15 = this.f47657f;
        byte[] bArr5 = new byte[i15];
        this.f47664m = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, i15);
        if (this.f47655d) {
            System.arraycopy(this.f47664m, 0, bArr, i11 + this.f47670s, this.f47657f);
            i12 += this.f47657f;
        } else {
            int i16 = this.f47657f;
            byte[] bArr6 = new byte[i16];
            System.arraycopy(this.f47663l, i12, bArr6, 0, i16);
            if (!org.bouncycastle.util.a.u(this.f47664m, bArr6)) {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        l(false);
        return i12;
    }

    @Override // q50.b
    public String getAlgorithmName() {
        return this.f47652a.getAlgorithmName() + "/GCM";
    }

    @Override // q50.b
    public byte[] getMac() {
        byte[] bArr = this.f47664m;
        return bArr == null ? new byte[this.f47657f] : org.bouncycastle.util.a.h(bArr);
    }

    @Override // q50.b
    public int getOutputSize(int i11) {
        int i12 = i11 + this.f47670s;
        if (this.f47655d) {
            return i12 + this.f47657f;
        }
        int i13 = this.f47657f;
        if (i12 < i13) {
            return 0;
        }
        return i12 - i13;
    }

    @Override // q50.a
    public org.bouncycastle.crypto.e getUnderlyingCipher() {
        return this.f47652a;
    }

    @Override // q50.b
    public int getUpdateOutputSize(int i11) {
        int i12 = i11 + this.f47670s;
        if (!this.f47655d) {
            int i13 = this.f47657f;
            if (i12 < i13) {
                return 0;
            }
            i12 -= i13;
        }
        return i12 - (i12 % 16);
    }

    public void h(byte b11) {
        a();
        byte[] bArr = this.f47672u;
        int i11 = this.f47673v;
        bArr[i11] = b11;
        int i12 = i11 + 1;
        this.f47673v = i12;
        if (i12 == 16) {
            c(this.f47666o, bArr);
            this.f47673v = 0;
            this.f47674w += 16;
        }
    }

    @Override // q50.b
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        byte[] a11;
        b1 b1Var;
        byte[] bArr;
        this.f47655d = z11;
        this.f47664m = null;
        this.f47656e = true;
        if (iVar instanceof u50.a) {
            u50.a aVar = (u50.a) iVar;
            a11 = aVar.d();
            this.f47660i = aVar.a();
            int c11 = aVar.c();
            if (c11 < 32 || c11 > 128 || c11 % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + c11);
            }
            this.f47657f = c11 / 8;
            b1Var = aVar.b();
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("invalid parameters passed to GCM");
        } else {
            f1 f1Var = (f1) iVar;
            a11 = f1Var.a();
            this.f47660i = null;
            this.f47657f = 16;
            b1Var = (b1) f1Var.b();
        }
        this.f47663l = new byte[z11 ? 16 : this.f47657f + 16];
        if (a11 == null || a11.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z11 && (bArr = this.f47659h) != null && org.bouncycastle.util.a.c(bArr, a11)) {
            if (b1Var == null) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
            byte[] bArr2 = this.f47658g;
            if (bArr2 != null && org.bouncycastle.util.a.c(bArr2, b1Var.a())) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.f47659h = a11;
        if (b1Var != null) {
            this.f47658g = b1Var.a();
        }
        if (b1Var != null) {
            this.f47652a.init(true, b1Var);
            byte[] bArr3 = new byte[16];
            this.f47661j = bArr3;
            this.f47652a.processBlock(bArr3, 0, bArr3, 0);
            this.f47653b.init(this.f47661j);
            this.f47654c = null;
        } else if (this.f47661j == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr4 = new byte[16];
        this.f47662k = bArr4;
        byte[] bArr5 = this.f47659h;
        if (bArr5.length == 12) {
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            this.f47662k[15] = 1;
        } else {
            b(bArr4, bArr5, bArr5.length);
            byte[] bArr6 = new byte[16];
            r70.i.s(this.f47659h.length * 8, bArr6, 8);
            c(this.f47662k, bArr6);
        }
        this.f47665n = new byte[16];
        this.f47666o = new byte[16];
        this.f47667p = new byte[16];
        this.f47672u = new byte[16];
        this.f47673v = 0;
        this.f47674w = 0L;
        this.f47675x = 0L;
        this.f47668q = org.bouncycastle.util.a.h(this.f47662k);
        this.f47669r = -2;
        this.f47670s = 0;
        this.f47671t = 0L;
        byte[] bArr7 = this.f47660i;
        if (bArr7 != null) {
            processAADBytes(bArr7, 0, bArr7.length);
        }
    }

    public void k() {
        l(true);
    }

    @Override // q50.b
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        a();
        for (int i13 = 0; i13 < i12; i13++) {
            byte[] bArr2 = this.f47672u;
            int i14 = this.f47673v;
            bArr2[i14] = bArr[i11 + i13];
            int i15 = i14 + 1;
            this.f47673v = i15;
            if (i15 == 16) {
                c(this.f47666o, bArr2);
                this.f47673v = 0;
                this.f47674w += 16;
            }
        }
    }

    @Override // q50.b
    public int processByte(byte b11, byte[] bArr, int i11) {
        a();
        byte[] bArr2 = this.f47663l;
        int i12 = this.f47670s;
        bArr2[i12] = b11;
        int i13 = i12 + 1;
        this.f47670s = i13;
        if (i13 == bArr2.length) {
            i(bArr2, 0, bArr, i11);
            if (this.f47655d) {
                this.f47670s = 0;
            } else {
                byte[] bArr3 = this.f47663l;
                System.arraycopy(bArr3, 16, bArr3, 0, this.f47657f);
                this.f47670s = this.f47657f;
            }
            return 16;
        }
        return 0;
    }

    @Override // q50.b
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14;
        a();
        if (bArr.length - i11 >= i12) {
            if (this.f47655d) {
                if (this.f47670s != 0) {
                    while (i12 > 0) {
                        i12--;
                        byte[] bArr3 = this.f47663l;
                        int i15 = this.f47670s;
                        int i16 = i11 + 1;
                        bArr3[i15] = bArr[i11];
                        int i17 = i15 + 1;
                        this.f47670s = i17;
                        if (i17 == 16) {
                            i(bArr3, 0, bArr2, i13);
                            this.f47670s = 0;
                            i14 = 16;
                            i11 = i16;
                            break;
                        }
                        i11 = i16;
                    }
                }
                i14 = 0;
                while (i12 >= 16) {
                    i(bArr, i11, bArr2, i13 + i14);
                    i11 += 16;
                    i12 -= 16;
                    i14 += 16;
                }
                if (i12 > 0) {
                    System.arraycopy(bArr, i11, this.f47663l, 0, i12);
                    this.f47670s = i12;
                }
            } else {
                i14 = 0;
                for (int i18 = 0; i18 < i12; i18++) {
                    byte[] bArr4 = this.f47663l;
                    int i19 = this.f47670s;
                    bArr4[i19] = bArr[i11 + i18];
                    int i21 = i19 + 1;
                    this.f47670s = i21;
                    if (i21 == bArr4.length) {
                        i(bArr4, 0, bArr2, i13 + i14);
                        byte[] bArr5 = this.f47663l;
                        System.arraycopy(bArr5, 16, bArr5, 0, this.f47657f);
                        this.f47670s = this.f47657f;
                        i14 += 16;
                    }
                }
            }
            return i14;
        }
        throw new DataLengthException("Input buffer too short");
    }
}