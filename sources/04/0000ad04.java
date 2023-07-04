package q50;

import u50.f1;

/* loaded from: classes5.dex */
public class i implements org.bouncycastle.crypto.e {

    /* renamed from: a  reason: collision with root package name */
    private int f47613a;

    /* renamed from: b  reason: collision with root package name */
    private int f47614b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f47615c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f47616d;

    /* renamed from: e  reason: collision with root package name */
    private org.bouncycastle.crypto.e f47617e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f47618f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f47619g;

    public i(org.bouncycastle.crypto.e eVar) {
        this.f47614b = eVar.getBlockSize();
        this.f47617e = eVar;
    }

    private int a(byte[] bArr, int i11, byte[] bArr2, int i12) {
        byte[] b11 = q.b(this.f47615c, this.f47614b);
        byte[] c11 = q.c(bArr, this.f47614b, i11);
        byte[] bArr3 = new byte[c11.length];
        this.f47617e.processBlock(c11, 0, bArr3, 0);
        byte[] d11 = q.d(bArr3, b11);
        System.arraycopy(d11, 0, bArr2, i12, d11.length);
        if (bArr2.length > i12 + d11.length) {
            c(c11);
        }
        return d11.length;
    }

    private int b(byte[] bArr, int i11, byte[] bArr2, int i12) {
        byte[] d11 = q.d(q.c(bArr, this.f47614b, i11), q.b(this.f47615c, this.f47614b));
        int length = d11.length;
        byte[] bArr3 = new byte[length];
        this.f47617e.processBlock(d11, 0, bArr3, 0);
        System.arraycopy(bArr3, 0, bArr2, i12, length);
        if (bArr2.length > i12 + d11.length) {
            c(bArr3);
        }
        return length;
    }

    private void c(byte[] bArr) {
        byte[] a11 = q.a(this.f47615c, this.f47613a - this.f47614b);
        System.arraycopy(a11, 0, this.f47615c, 0, a11.length);
        System.arraycopy(bArr, 0, this.f47615c, a11.length, this.f47613a - a11.length);
    }

    private void d() {
        int i11 = this.f47613a;
        this.f47615c = new byte[i11];
        this.f47616d = new byte[i11];
    }

    private void e() {
        this.f47613a = this.f47614b;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f47617e.getAlgorithmName() + "/CBC";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return this.f47614b;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        this.f47619g = z11;
        if (!(iVar instanceof f1)) {
            e();
            d();
            byte[] bArr = this.f47616d;
            System.arraycopy(bArr, 0, this.f47615c, 0, bArr.length);
            if (iVar != null) {
                eVar = this.f47617e;
                eVar.init(z11, iVar);
            }
            this.f47618f = true;
        }
        f1 f1Var = (f1) iVar;
        byte[] a11 = f1Var.a();
        if (a11.length < this.f47614b) {
            throw new IllegalArgumentException("Parameter m must blockSize <= m");
        }
        this.f47613a = a11.length;
        d();
        byte[] h11 = org.bouncycastle.util.a.h(a11);
        this.f47616d = h11;
        System.arraycopy(h11, 0, this.f47615c, 0, h11.length);
        if (f1Var.b() != null) {
            eVar = this.f47617e;
            iVar = f1Var.b();
            eVar.init(z11, iVar);
        }
        this.f47618f = true;
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        return this.f47619g ? b(bArr, i11, bArr2, i12) : a(bArr, i11, bArr2, i12);
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        if (this.f47618f) {
            byte[] bArr = this.f47616d;
            System.arraycopy(bArr, 0, this.f47615c, 0, bArr.length);
            this.f47617e.reset();
        }
    }
}