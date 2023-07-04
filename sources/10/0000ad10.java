package q50;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import u50.f1;

/* loaded from: classes5.dex */
public class r implements q50.a {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.crypto.e f47703a;

    /* renamed from: b  reason: collision with root package name */
    private int f47704b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f47705c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f47706d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f47707e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f47708f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f47709g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f47710h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f47711i;

    /* renamed from: j  reason: collision with root package name */
    private byte[] f47712j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f47713k;

    /* renamed from: l  reason: collision with root package name */
    private a f47714l;

    /* renamed from: m  reason: collision with root package name */
    private a f47715m;

    /* renamed from: n  reason: collision with root package name */
    private int f47716n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class a extends ByteArrayOutputStream {
        public a(r rVar) {
        }

        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public r(org.bouncycastle.crypto.e eVar) {
        this(eVar, 4);
    }

    public r(org.bouncycastle.crypto.e eVar, int i11) {
        this.f47714l = new a(this);
        this.f47715m = new a(this);
        this.f47716n = 4;
        this.f47703a = eVar;
        this.f47704b = eVar.getBlockSize();
        this.f47709g = new byte[eVar.getBlockSize()];
        this.f47706d = new byte[eVar.getBlockSize()];
        this.f47707e = new byte[eVar.getBlockSize()];
        this.f47708f = new byte[eVar.getBlockSize()];
        this.f47710h = new byte[eVar.getBlockSize()];
        this.f47711i = new byte[eVar.getBlockSize()];
        this.f47712j = new byte[eVar.getBlockSize()];
        this.f47713k = new byte[eVar.getBlockSize()];
        h(i11);
    }

    private void a(byte[] bArr, int i11, int i12) {
        while (i12 > 0) {
            for (int i13 = 0; i13 < this.f47703a.getBlockSize(); i13++) {
                byte[] bArr2 = this.f47708f;
                bArr2[i13] = (byte) (bArr2[i13] ^ bArr[i11 + i13]);
            }
            org.bouncycastle.crypto.e eVar = this.f47703a;
            byte[] bArr3 = this.f47708f;
            eVar.processBlock(bArr3, 0, bArr3, 0);
            i12 -= this.f47703a.getBlockSize();
            i11 += this.f47703a.getBlockSize();
        }
    }

    private void b(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14 = 0;
        while (true) {
            byte[] bArr3 = this.f47713k;
            if (i14 >= bArr3.length) {
                break;
            }
            byte[] bArr4 = this.f47712j;
            bArr4[i14] = (byte) (bArr4[i14] + bArr3[i14]);
            i14++;
        }
        this.f47703a.processBlock(this.f47712j, 0, this.f47711i, 0);
        for (int i15 = 0; i15 < this.f47703a.getBlockSize(); i15++) {
            bArr2[i13 + i15] = (byte) (this.f47711i[i15] ^ bArr[i11 + i15]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047 A[LOOP:0: B:24:0x0040->B:26:0x0047, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte c(boolean r4, int r5) {
        /*
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "0"
            if (r4 == 0) goto Lf
            java.lang.String r4 = "1"
            r0.append(r4)
            goto L12
        Lf:
            r0.append(r1)
        L12:
            r4 = 8
            if (r5 == r4) goto L33
            r4 = 16
            if (r5 == r4) goto L30
            r4 = 32
            if (r5 == r4) goto L2d
            r4 = 48
            if (r5 == r4) goto L2a
            r4 = 64
            if (r5 == r4) goto L27
            goto L38
        L27:
            java.lang.String r4 = "110"
            goto L35
        L2a:
            java.lang.String r4 = "101"
            goto L35
        L2d:
            java.lang.String r4 = "100"
            goto L35
        L30:
            java.lang.String r4 = "011"
            goto L35
        L33:
            java.lang.String r4 = "010"
        L35:
            r0.append(r4)
        L38:
            int r4 = r3.f47716n
            int r4 = r4 + (-1)
            java.lang.String r4 = java.lang.Integer.toBinaryString(r4)
        L40:
            int r5 = r4.length()
            r2 = 4
            if (r5 >= r2) goto L56
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>(r4)
            r4 = 0
            java.lang.StringBuffer r4 = r5.insert(r4, r1)
            java.lang.String r4 = r4.toString()
            goto L40
        L56:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5 = 2
            int r4 = java.lang.Integer.parseInt(r4, r5)
            byte r4 = (byte) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q50.r.c(boolean, int):byte");
    }

    private void d(int i11, byte[] bArr, int i12) {
        bArr[i12 + 3] = (byte) (i11 >> 24);
        bArr[i12 + 2] = (byte) (i11 >> 16);
        bArr[i12 + 1] = (byte) (i11 >> 8);
        bArr[i12] = (byte) i11;
    }

    private void e(byte[] bArr, int i11, int i12, int i13) {
        if (i12 - i11 < this.f47703a.getBlockSize()) {
            throw new IllegalArgumentException("authText buffer too short");
        }
        if (i12 % this.f47703a.getBlockSize() != 0) {
            throw new IllegalArgumentException("padding not supported");
        }
        byte[] bArr2 = this.f47709g;
        System.arraycopy(bArr2, 0, this.f47710h, 0, (bArr2.length - this.f47716n) - 1);
        d(i13, this.f47711i, 0);
        System.arraycopy(this.f47711i, 0, this.f47710h, (this.f47709g.length - this.f47716n) - 1, 4);
        byte[] bArr3 = this.f47710h;
        bArr3[bArr3.length - 1] = c(true, this.f47704b);
        this.f47703a.processBlock(this.f47710h, 0, this.f47708f, 0);
        d(i12, this.f47711i, 0);
        if (i12 <= this.f47703a.getBlockSize() - this.f47716n) {
            for (int i14 = 0; i14 < i12; i14++) {
                byte[] bArr4 = this.f47711i;
                int i15 = this.f47716n + i14;
                bArr4[i15] = (byte) (bArr4[i15] ^ bArr[i11 + i14]);
            }
            for (int i16 = 0; i16 < this.f47703a.getBlockSize(); i16++) {
                byte[] bArr5 = this.f47708f;
                bArr5[i16] = (byte) (bArr5[i16] ^ this.f47711i[i16]);
            }
            org.bouncycastle.crypto.e eVar = this.f47703a;
            byte[] bArr6 = this.f47708f;
            eVar.processBlock(bArr6, 0, bArr6, 0);
            return;
        }
        for (int i17 = 0; i17 < this.f47703a.getBlockSize(); i17++) {
            byte[] bArr7 = this.f47708f;
            bArr7[i17] = (byte) (bArr7[i17] ^ this.f47711i[i17]);
        }
        org.bouncycastle.crypto.e eVar2 = this.f47703a;
        byte[] bArr8 = this.f47708f;
        eVar2.processBlock(bArr8, 0, bArr8, 0);
        while (i12 != 0) {
            for (int i18 = 0; i18 < this.f47703a.getBlockSize(); i18++) {
                byte[] bArr9 = this.f47708f;
                bArr9[i18] = (byte) (bArr9[i18] ^ bArr[i18 + i11]);
            }
            org.bouncycastle.crypto.e eVar3 = this.f47703a;
            byte[] bArr10 = this.f47708f;
            eVar3.processBlock(bArr10, 0, bArr10, 0);
            i11 += this.f47703a.getBlockSize();
            i12 -= this.f47703a.getBlockSize();
        }
    }

    private void h(int i11) {
        if (i11 != 4 && i11 != 6 && i11 != 8) {
            throw new IllegalArgumentException("Nb = 4 is recommended by DSTU7624 but can be changed to only 6 or 8 in this implementation");
        }
        this.f47716n = i11;
    }

    @Override // q50.b
    public int doFinal(byte[] bArr, int i11) {
        int f11 = f(this.f47715m.a(), 0, this.f47715m.size(), bArr, i11);
        g();
        return f11;
    }

    public int f(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14;
        if (bArr.length - i11 < i12) {
            throw new DataLengthException("input buffer too short");
        }
        if (bArr2.length - i13 < i12) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.f47714l.size() > 0) {
            if (this.f47705c) {
                e(this.f47714l.a(), 0, this.f47714l.size(), this.f47715m.size());
            } else {
                e(this.f47714l.a(), 0, this.f47714l.size(), this.f47715m.size() - this.f47704b);
            }
        }
        if (!this.f47705c) {
            if ((i12 - this.f47704b) % this.f47703a.getBlockSize() == 0) {
                this.f47703a.processBlock(this.f47709g, 0, this.f47712j, 0);
                int blockSize = i12 / this.f47703a.getBlockSize();
                for (int i15 = 0; i15 < blockSize; i15++) {
                    b(bArr, i11, i12, bArr2, i13);
                    i11 += this.f47703a.getBlockSize();
                    i13 += this.f47703a.getBlockSize();
                }
                if (i12 > i11) {
                    int i16 = 0;
                    while (true) {
                        byte[] bArr3 = this.f47713k;
                        if (i16 >= bArr3.length) {
                            break;
                        }
                        byte[] bArr4 = this.f47712j;
                        bArr4[i16] = (byte) (bArr4[i16] + bArr3[i16]);
                        i16++;
                    }
                    this.f47703a.processBlock(this.f47712j, 0, this.f47711i, 0);
                    int i17 = 0;
                    while (true) {
                        i14 = this.f47704b;
                        if (i17 >= i14) {
                            break;
                        }
                        bArr2[i13 + i17] = (byte) (this.f47711i[i17] ^ bArr[i11 + i17]);
                        i17++;
                    }
                    i13 += i14;
                }
                int i18 = 0;
                while (true) {
                    byte[] bArr5 = this.f47713k;
                    if (i18 >= bArr5.length) {
                        break;
                    }
                    byte[] bArr6 = this.f47712j;
                    bArr6[i18] = (byte) (bArr6[i18] + bArr5[i18]);
                    i18++;
                }
                this.f47703a.processBlock(this.f47712j, 0, this.f47711i, 0);
                int i19 = this.f47704b;
                System.arraycopy(bArr2, i13 - i19, this.f47711i, 0, i19);
                a(bArr2, 0, i13 - this.f47704b);
                System.arraycopy(this.f47708f, 0, this.f47707e, 0, this.f47704b);
                int i21 = this.f47704b;
                byte[] bArr7 = new byte[i21];
                System.arraycopy(this.f47711i, 0, bArr7, 0, i21);
                if (org.bouncycastle.util.a.u(this.f47707e, bArr7)) {
                    g();
                    return i12 - this.f47704b;
                }
                throw new InvalidCipherTextException("mac check failed");
            }
            throw new DataLengthException("partial blocks not supported");
        } else if (i12 % this.f47703a.getBlockSize() != 0) {
            throw new DataLengthException("partial blocks not supported");
        } else {
            a(bArr, i11, i12);
            this.f47703a.processBlock(this.f47709g, 0, this.f47712j, 0);
            int i22 = i12;
            while (i22 > 0) {
                b(bArr, i11, i12, bArr2, i13);
                i22 -= this.f47703a.getBlockSize();
                i11 += this.f47703a.getBlockSize();
                i13 += this.f47703a.getBlockSize();
            }
            int i23 = 0;
            while (true) {
                byte[] bArr8 = this.f47713k;
                if (i23 >= bArr8.length) {
                    break;
                }
                byte[] bArr9 = this.f47712j;
                bArr9[i23] = (byte) (bArr9[i23] + bArr8[i23]);
                i23++;
            }
            this.f47703a.processBlock(this.f47712j, 0, this.f47711i, 0);
            int i24 = 0;
            while (true) {
                int i25 = this.f47704b;
                if (i24 >= i25) {
                    System.arraycopy(this.f47708f, 0, this.f47707e, 0, i25);
                    g();
                    return i12 + this.f47704b;
                }
                bArr2[i13 + i24] = (byte) (this.f47711i[i24] ^ this.f47708f[i24]);
                i24++;
            }
        }
    }

    public void g() {
        org.bouncycastle.util.a.y(this.f47710h, (byte) 0);
        org.bouncycastle.util.a.y(this.f47711i, (byte) 0);
        org.bouncycastle.util.a.y(this.f47713k, (byte) 0);
        org.bouncycastle.util.a.y(this.f47708f, (byte) 0);
        this.f47713k[0] = 1;
        this.f47715m.reset();
        this.f47714l.reset();
        byte[] bArr = this.f47706d;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    @Override // q50.b
    public String getAlgorithmName() {
        return this.f47703a.getAlgorithmName() + "/KCCM";
    }

    @Override // q50.b
    public byte[] getMac() {
        return org.bouncycastle.util.a.h(this.f47707e);
    }

    @Override // q50.b
    public int getOutputSize(int i11) {
        return i11 + this.f47704b;
    }

    @Override // q50.a
    public org.bouncycastle.crypto.e getUnderlyingCipher() {
        return this.f47703a;
    }

    @Override // q50.b
    public int getUpdateOutputSize(int i11) {
        return i11;
    }

    @Override // q50.b
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.i b11;
        if (iVar instanceof u50.a) {
            u50.a aVar = (u50.a) iVar;
            if (aVar.c() > 512 || aVar.c() < 64 || aVar.c() % 8 != 0) {
                throw new IllegalArgumentException("Invalid mac size specified");
            }
            this.f47709g = aVar.d();
            this.f47704b = aVar.c() / 8;
            this.f47706d = aVar.a();
            b11 = aVar.b();
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("Invalid parameters specified");
        } else {
            f1 f1Var = (f1) iVar;
            this.f47709g = f1Var.a();
            this.f47704b = this.f47703a.getBlockSize();
            this.f47706d = null;
            b11 = f1Var.b();
        }
        this.f47707e = new byte[this.f47704b];
        this.f47705c = z11;
        this.f47703a.init(true, b11);
        this.f47713k[0] = 1;
        byte[] bArr = this.f47706d;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    @Override // q50.b
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        this.f47714l.write(bArr, i11, i12);
    }

    @Override // q50.b
    public int processByte(byte b11, byte[] bArr, int i11) {
        this.f47715m.write(b11);
        return 0;
    }

    @Override // q50.b
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (bArr.length >= i11 + i12) {
            this.f47715m.write(bArr, i11, i12);
            return 0;
        }
        throw new DataLengthException("input buffer too short");
    }
}