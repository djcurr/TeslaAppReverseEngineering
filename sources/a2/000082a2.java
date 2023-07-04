package l50;

/* loaded from: classes5.dex */
public class v implements org.bouncycastle.crypto.c0 {

    /* renamed from: a  reason: collision with root package name */
    private u f36927a = new u();

    /* renamed from: b  reason: collision with root package name */
    private p50.f f36928b = new p50.f();

    @Override // org.bouncycastle.crypto.c0
    public String getAlgorithmName() {
        return "GOST28147Wrap";
    }

    @Override // org.bouncycastle.crypto.c0
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof u50.g1) {
            iVar = ((u50.g1) iVar).a();
        }
        u50.i1 i1Var = (u50.i1) iVar;
        this.f36927a.init(z11, i1Var.a());
        this.f36928b.init(new u50.f1(i1Var.a(), i1Var.b()));
    }

    @Override // org.bouncycastle.crypto.c0
    public byte[] unwrap(byte[] bArr, int i11, int i12) {
        int macSize = i12 - this.f36928b.getMacSize();
        byte[] bArr2 = new byte[macSize];
        this.f36927a.processBlock(bArr, i11, bArr2, 0);
        this.f36927a.processBlock(bArr, i11 + 8, bArr2, 8);
        this.f36927a.processBlock(bArr, i11 + 16, bArr2, 16);
        this.f36927a.processBlock(bArr, i11 + 24, bArr2, 24);
        byte[] bArr3 = new byte[this.f36928b.getMacSize()];
        this.f36928b.update(bArr2, 0, macSize);
        this.f36928b.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[this.f36928b.getMacSize()];
        System.arraycopy(bArr, (i11 + i12) - 4, bArr4, 0, this.f36928b.getMacSize());
        if (org.bouncycastle.util.a.u(bArr3, bArr4)) {
            return bArr2;
        }
        throw new IllegalStateException("mac mismatch");
    }

    @Override // org.bouncycastle.crypto.c0
    public byte[] wrap(byte[] bArr, int i11, int i12) {
        this.f36928b.update(bArr, i11, i12);
        byte[] bArr2 = new byte[this.f36928b.getMacSize() + i12];
        this.f36927a.processBlock(bArr, i11, bArr2, 0);
        this.f36927a.processBlock(bArr, i11 + 8, bArr2, 8);
        this.f36927a.processBlock(bArr, i11 + 16, bArr2, 16);
        this.f36927a.processBlock(bArr, i11 + 24, bArr2, 24);
        this.f36928b.doFinal(bArr2, i12);
        return bArr2;
    }
}