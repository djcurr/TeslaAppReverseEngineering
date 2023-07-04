package q50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import u50.f1;

/* loaded from: classes5.dex */
public class h implements a {

    /* renamed from: a  reason: collision with root package name */
    private y f47601a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f47602b;

    /* renamed from: c  reason: collision with root package name */
    private int f47603c;

    /* renamed from: d  reason: collision with root package name */
    private org.bouncycastle.crypto.v f47604d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f47605e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f47606f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f47607g;

    /* renamed from: h  reason: collision with root package name */
    private int f47608h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f47609i;

    /* renamed from: j  reason: collision with root package name */
    private int f47610j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f47611k;

    /* renamed from: l  reason: collision with root package name */
    private byte[] f47612l;

    public h(org.bouncycastle.crypto.e eVar) {
        this.f47603c = eVar.getBlockSize();
        p50.c cVar = new p50.c(eVar);
        this.f47604d = cVar;
        this.f47607g = new byte[this.f47603c];
        this.f47606f = new byte[cVar.getMacSize()];
        this.f47605e = new byte[this.f47604d.getMacSize()];
        this.f47601a = new y(eVar);
    }

    private void a() {
        byte[] bArr = new byte[this.f47603c];
        int i11 = 0;
        this.f47604d.doFinal(bArr, 0);
        while (true) {
            byte[] bArr2 = this.f47607g;
            if (i11 >= bArr2.length) {
                return;
            }
            bArr2[i11] = (byte) ((this.f47605e[i11] ^ this.f47606f[i11]) ^ bArr[i11]);
            i11++;
        }
    }

    private void b() {
        if (this.f47611k) {
            return;
        }
        this.f47611k = true;
        this.f47604d.doFinal(this.f47606f, 0);
        int i11 = this.f47603c;
        byte[] bArr = new byte[i11];
        bArr[i11 - 1] = 2;
        this.f47604d.update(bArr, 0, i11);
    }

    private int c(byte b11, byte[] bArr, int i11) {
        int processBlock;
        byte[] bArr2 = this.f47609i;
        int i12 = this.f47610j;
        int i13 = i12 + 1;
        this.f47610j = i13;
        bArr2[i12] = b11;
        if (i13 == bArr2.length) {
            int length = bArr.length;
            int i14 = this.f47603c;
            if (length >= i11 + i14) {
                if (this.f47602b) {
                    processBlock = this.f47601a.processBlock(bArr2, 0, bArr, i11);
                    this.f47604d.update(bArr, i11, this.f47603c);
                } else {
                    this.f47604d.update(bArr2, 0, i14);
                    processBlock = this.f47601a.processBlock(this.f47609i, 0, bArr, i11);
                }
                this.f47610j = 0;
                if (!this.f47602b) {
                    byte[] bArr3 = this.f47609i;
                    System.arraycopy(bArr3, this.f47603c, bArr3, 0, this.f47608h);
                    this.f47610j = this.f47608h;
                }
                return processBlock;
            }
            throw new OutputLengthException("Output buffer is too short");
        }
        return 0;
    }

    private void e(boolean z11) {
        this.f47601a.reset();
        this.f47604d.reset();
        this.f47610j = 0;
        org.bouncycastle.util.a.y(this.f47609i, (byte) 0);
        if (z11) {
            org.bouncycastle.util.a.y(this.f47607g, (byte) 0);
        }
        int i11 = this.f47603c;
        byte[] bArr = new byte[i11];
        bArr[i11 - 1] = 1;
        this.f47604d.update(bArr, 0, i11);
        this.f47611k = false;
        byte[] bArr2 = this.f47612l;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }

    private boolean f(byte[] bArr, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < this.f47608h; i13++) {
            i12 |= this.f47607g[i13] ^ bArr[i11 + i13];
        }
        return i12 == 0;
    }

    public void d() {
        e(true);
    }

    @Override // q50.b
    public int doFinal(byte[] bArr, int i11) {
        b();
        int i12 = this.f47610j;
        byte[] bArr2 = this.f47609i;
        byte[] bArr3 = new byte[bArr2.length];
        this.f47610j = 0;
        if (this.f47602b) {
            int i13 = i11 + i12;
            if (bArr.length >= this.f47608h + i13) {
                this.f47601a.processBlock(bArr2, 0, bArr3, 0);
                System.arraycopy(bArr3, 0, bArr, i11, i12);
                this.f47604d.update(bArr3, 0, i12);
                a();
                System.arraycopy(this.f47607g, 0, bArr, i13, this.f47608h);
                e(false);
                return i12 + this.f47608h;
            }
            throw new OutputLengthException("Output buffer too short");
        }
        int i14 = this.f47608h;
        if (i12 >= i14) {
            if (bArr.length >= (i11 + i12) - i14) {
                if (i12 > i14) {
                    this.f47604d.update(bArr2, 0, i12 - i14);
                    this.f47601a.processBlock(this.f47609i, 0, bArr3, 0);
                    System.arraycopy(bArr3, 0, bArr, i11, i12 - this.f47608h);
                }
                a();
                if (f(this.f47609i, i12 - this.f47608h)) {
                    e(false);
                    return i12 - this.f47608h;
                }
                throw new InvalidCipherTextException("mac check in EAX failed");
            }
            throw new OutputLengthException("Output buffer too short");
        }
        throw new InvalidCipherTextException("data too short");
    }

    @Override // q50.b
    public String getAlgorithmName() {
        return this.f47601a.b().getAlgorithmName() + "/EAX";
    }

    @Override // q50.b
    public byte[] getMac() {
        int i11 = this.f47608h;
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f47607g, 0, bArr, 0, i11);
        return bArr;
    }

    @Override // q50.b
    public int getOutputSize(int i11) {
        int i12 = i11 + this.f47610j;
        if (this.f47602b) {
            return i12 + this.f47608h;
        }
        int i13 = this.f47608h;
        if (i12 < i13) {
            return 0;
        }
        return i12 - i13;
    }

    @Override // q50.a
    public org.bouncycastle.crypto.e getUnderlyingCipher() {
        return this.f47601a.b();
    }

    @Override // q50.b
    public int getUpdateOutputSize(int i11) {
        int i12 = i11 + this.f47610j;
        if (!this.f47602b) {
            int i13 = this.f47608h;
            if (i12 < i13) {
                return 0;
            }
            i12 -= i13;
        }
        return i12 - (i12 % this.f47603c);
    }

    @Override // q50.b
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        byte[] a11;
        org.bouncycastle.crypto.i b11;
        this.f47602b = z11;
        if (iVar instanceof u50.a) {
            u50.a aVar = (u50.a) iVar;
            a11 = aVar.d();
            this.f47612l = aVar.a();
            this.f47608h = aVar.c() / 8;
            b11 = aVar.b();
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("invalid parameters passed to EAX");
        } else {
            f1 f1Var = (f1) iVar;
            a11 = f1Var.a();
            this.f47612l = null;
            this.f47608h = this.f47604d.getMacSize() / 2;
            b11 = f1Var.b();
        }
        this.f47609i = new byte[z11 ? this.f47603c : this.f47603c + this.f47608h];
        byte[] bArr = new byte[this.f47603c];
        this.f47604d.init(b11);
        int i11 = this.f47603c;
        bArr[i11 - 1] = 0;
        this.f47604d.update(bArr, 0, i11);
        this.f47604d.update(a11, 0, a11.length);
        this.f47604d.doFinal(this.f47605e, 0);
        this.f47601a.init(true, new f1(null, this.f47605e));
        d();
    }

    @Override // q50.b
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        if (this.f47611k) {
            throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
        }
        this.f47604d.update(bArr, i11, i12);
    }

    @Override // q50.b
    public int processByte(byte b11, byte[] bArr, int i11) {
        b();
        return c(b11, bArr, i11);
    }

    @Override // q50.b
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        b();
        if (bArr.length >= i11 + i12) {
            int i14 = 0;
            for (int i15 = 0; i15 != i12; i15++) {
                i14 += c(bArr[i11 + i15], bArr2, i13 + i14);
            }
            return i14;
        }
        throw new DataLengthException("Input buffer too short");
    }
}