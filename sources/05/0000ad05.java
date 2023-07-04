package q50;

import org.bouncycastle.crypto.a0;
import u50.f1;

/* loaded from: classes5.dex */
public class j extends a0 {

    /* renamed from: b  reason: collision with root package name */
    private final int f47620b;

    /* renamed from: c  reason: collision with root package name */
    private int f47621c;

    /* renamed from: d  reason: collision with root package name */
    private int f47622d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f47623e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f47624f;

    /* renamed from: g  reason: collision with root package name */
    private org.bouncycastle.crypto.e f47625g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f47626h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f47627i;

    /* renamed from: j  reason: collision with root package name */
    private byte[] f47628j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f47629k;

    /* renamed from: l  reason: collision with root package name */
    private int f47630l;

    public j(org.bouncycastle.crypto.e eVar) {
        this(eVar, eVar.getBlockSize() * 8);
    }

    public j(org.bouncycastle.crypto.e eVar, int i11) {
        super(eVar);
        this.f47627i = false;
        if (i11 < 0 || i11 > eVar.getBlockSize() * 8) {
            throw new IllegalArgumentException("Parameter bitBlockSize must be in range 0 < bitBlockSize <= " + (eVar.getBlockSize() * 8));
        }
        this.f47622d = eVar.getBlockSize();
        this.f47625g = eVar;
        this.f47620b = i11 / 8;
        this.f47629k = new byte[getBlockSize()];
    }

    private void e() {
        int i11 = this.f47621c;
        this.f47623e = new byte[i11];
        this.f47624f = new byte[i11];
    }

    private void f() {
        this.f47621c = this.f47622d * 2;
    }

    @Override // org.bouncycastle.crypto.a0
    protected byte a(byte b11) {
        if (this.f47630l == 0) {
            this.f47628j = c();
        }
        byte[] bArr = this.f47628j;
        int i11 = this.f47630l;
        byte b12 = (byte) (bArr[i11] ^ b11);
        byte[] bArr2 = this.f47629k;
        int i12 = i11 + 1;
        this.f47630l = i12;
        if (this.f47626h) {
            b11 = b12;
        }
        bArr2[i11] = b11;
        if (i12 == getBlockSize()) {
            this.f47630l = 0;
            d(this.f47629k);
        }
        return b12;
    }

    byte[] c() {
        byte[] b11 = q.b(this.f47623e, this.f47622d);
        byte[] bArr = new byte[b11.length];
        this.f47625g.processBlock(b11, 0, bArr, 0);
        return q.b(bArr, this.f47620b);
    }

    void d(byte[] bArr) {
        byte[] a11 = q.a(this.f47623e, this.f47621c - this.f47620b);
        System.arraycopy(a11, 0, this.f47623e, 0, a11.length);
        System.arraycopy(bArr, 0, this.f47623e, a11.length, this.f47621c - a11.length);
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f47625g.getAlgorithmName() + "/CFB" + (this.f47622d * 8);
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return this.f47620b;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        this.f47626h = z11;
        if (!(iVar instanceof f1)) {
            f();
            e();
            byte[] bArr = this.f47624f;
            System.arraycopy(bArr, 0, this.f47623e, 0, bArr.length);
            if (iVar != null) {
                eVar = this.f47625g;
                eVar.init(true, iVar);
            }
            this.f47627i = true;
        }
        f1 f1Var = (f1) iVar;
        byte[] a11 = f1Var.a();
        if (a11.length < this.f47622d) {
            throw new IllegalArgumentException("Parameter m must blockSize <= m");
        }
        this.f47621c = a11.length;
        e();
        byte[] h11 = org.bouncycastle.util.a.h(a11);
        this.f47624f = h11;
        System.arraycopy(h11, 0, this.f47623e, 0, h11.length);
        if (f1Var.b() != null) {
            eVar = this.f47625g;
            iVar = f1Var.b();
            eVar.init(true, iVar);
        }
        this.f47627i = true;
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        processBytes(bArr, i11, getBlockSize(), bArr2, i12);
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        this.f47630l = 0;
        org.bouncycastle.util.a.g(this.f47629k);
        org.bouncycastle.util.a.g(this.f47628j);
        if (this.f47627i) {
            byte[] bArr = this.f47624f;
            System.arraycopy(bArr, 0, this.f47623e, 0, bArr.length);
            this.f47625g.reset();
        }
    }
}