package q50;

import org.bouncycastle.crypto.a0;
import u50.f1;

/* loaded from: classes5.dex */
public class l extends a0 {

    /* renamed from: b  reason: collision with root package name */
    private int f47639b;

    /* renamed from: c  reason: collision with root package name */
    private int f47640c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f47641d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f47642e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f47643f;

    /* renamed from: g  reason: collision with root package name */
    private org.bouncycastle.crypto.e f47644g;

    /* renamed from: h  reason: collision with root package name */
    private int f47645h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f47646i;

    public l(org.bouncycastle.crypto.e eVar) {
        super(eVar);
        this.f47646i = false;
        int blockSize = eVar.getBlockSize();
        this.f47640c = blockSize;
        this.f47644g = eVar;
        this.f47643f = new byte[blockSize];
    }

    private void c() {
        byte[] a11 = q.a(this.f47641d, this.f47639b - this.f47640c);
        System.arraycopy(a11, 0, this.f47641d, 0, a11.length);
        System.arraycopy(this.f47643f, 0, this.f47641d, a11.length, this.f47639b - a11.length);
    }

    private void d() {
        this.f47644g.processBlock(q.b(this.f47641d, this.f47640c), 0, this.f47643f, 0);
    }

    private void e() {
        int i11 = this.f47639b;
        this.f47641d = new byte[i11];
        this.f47642e = new byte[i11];
    }

    private void f() {
        this.f47639b = this.f47640c * 2;
    }

    @Override // org.bouncycastle.crypto.a0
    protected byte a(byte b11) {
        if (this.f47645h == 0) {
            d();
        }
        byte[] bArr = this.f47643f;
        int i11 = this.f47645h;
        byte b12 = (byte) (b11 ^ bArr[i11]);
        int i12 = i11 + 1;
        this.f47645h = i12;
        if (i12 == getBlockSize()) {
            this.f47645h = 0;
            c();
        }
        return b12;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f47644g.getAlgorithmName() + "/OFB";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return this.f47640c;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        if (!(iVar instanceof f1)) {
            f();
            e();
            byte[] bArr = this.f47642e;
            System.arraycopy(bArr, 0, this.f47641d, 0, bArr.length);
            if (iVar != null) {
                eVar = this.f47644g;
                eVar.init(true, iVar);
            }
            this.f47646i = true;
        }
        f1 f1Var = (f1) iVar;
        byte[] a11 = f1Var.a();
        if (a11.length < this.f47640c) {
            throw new IllegalArgumentException("Parameter m must blockSize <= m");
        }
        this.f47639b = a11.length;
        e();
        byte[] h11 = org.bouncycastle.util.a.h(a11);
        this.f47642e = h11;
        System.arraycopy(h11, 0, this.f47641d, 0, h11.length);
        if (f1Var.b() != null) {
            eVar = this.f47644g;
            iVar = f1Var.b();
            eVar.init(true, iVar);
        }
        this.f47646i = true;
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        processBytes(bArr, i11, this.f47640c, bArr2, i12);
        return this.f47640c;
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        if (this.f47646i) {
            byte[] bArr = this.f47642e;
            System.arraycopy(bArr, 0, this.f47641d, 0, bArr.length);
            org.bouncycastle.util.a.g(this.f47643f);
            this.f47645h = 0;
            this.f47644g.reset();
        }
    }
}