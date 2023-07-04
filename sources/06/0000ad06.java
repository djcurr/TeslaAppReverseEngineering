package q50;

import org.bouncycastle.crypto.a0;
import u50.f1;

/* loaded from: classes5.dex */
public class k extends a0 {

    /* renamed from: b  reason: collision with root package name */
    private final int f47631b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f47632c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f47633d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f47634e;

    /* renamed from: f  reason: collision with root package name */
    private final int f47635f;

    /* renamed from: g  reason: collision with root package name */
    private final org.bouncycastle.crypto.e f47636g;

    /* renamed from: h  reason: collision with root package name */
    private int f47637h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f47638i;

    public k(org.bouncycastle.crypto.e eVar) {
        this(eVar, eVar.getBlockSize() * 8);
    }

    public k(org.bouncycastle.crypto.e eVar, int i11) {
        super(eVar);
        this.f47637h = 0;
        if (i11 < 0 || i11 > eVar.getBlockSize() * 8) {
            throw new IllegalArgumentException("Parameter bitBlockSize must be in range 0 < bitBlockSize <= " + (eVar.getBlockSize() * 8));
        }
        this.f47636g = eVar;
        int blockSize = eVar.getBlockSize();
        this.f47635f = blockSize;
        this.f47631b = i11 / 8;
        this.f47632c = new byte[blockSize];
    }

    private byte[] c() {
        byte[] bArr = this.f47632c;
        byte[] bArr2 = new byte[bArr.length];
        this.f47636g.processBlock(bArr, 0, bArr2, 0);
        return q.b(bArr2, this.f47631b);
    }

    private void d() {
        byte[] bArr = this.f47632c;
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + 1);
    }

    private void e() {
        int i11 = this.f47635f;
        this.f47633d = new byte[i11 / 2];
        this.f47632c = new byte[i11];
        this.f47634e = new byte[this.f47631b];
    }

    @Override // org.bouncycastle.crypto.a0
    protected byte a(byte b11) {
        if (this.f47637h == 0) {
            this.f47634e = c();
        }
        byte[] bArr = this.f47634e;
        int i11 = this.f47637h;
        byte b12 = (byte) (b11 ^ bArr[i11]);
        int i12 = i11 + 1;
        this.f47637h = i12;
        if (i12 == this.f47631b) {
            this.f47637h = 0;
            d();
        }
        return b12;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f47636g.getAlgorithmName() + "/GCTR";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return this.f47631b;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        if (!(iVar instanceof f1)) {
            e();
            if (iVar != null) {
                eVar = this.f47636g;
                eVar.init(true, iVar);
            }
            this.f47638i = true;
        }
        f1 f1Var = (f1) iVar;
        e();
        byte[] h11 = org.bouncycastle.util.a.h(f1Var.a());
        this.f47633d = h11;
        if (h11.length != this.f47635f / 2) {
            throw new IllegalArgumentException("Parameter IV length must be == blockSize/2");
        }
        System.arraycopy(h11, 0, this.f47632c, 0, h11.length);
        for (int length = this.f47633d.length; length < this.f47635f; length++) {
            this.f47632c[length] = 0;
        }
        if (f1Var.b() != null) {
            eVar = this.f47636g;
            iVar = f1Var.b();
            eVar.init(true, iVar);
        }
        this.f47638i = true;
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        processBytes(bArr, i11, this.f47631b, bArr2, i12);
        return this.f47631b;
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        if (this.f47638i) {
            byte[] bArr = this.f47633d;
            System.arraycopy(bArr, 0, this.f47632c, 0, bArr.length);
            for (int length = this.f47633d.length; length < this.f47635f; length++) {
                this.f47632c[length] = 0;
            }
            this.f47637h = 0;
            this.f47636g.reset();
        }
    }
}