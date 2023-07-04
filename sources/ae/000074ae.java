package i50;

import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes5.dex */
public class a0 extends m {
    public a0() {
    }

    public a0(a0 a0Var) {
        super(a0Var);
    }

    @Override // r70.h
    public void a(r70.h hVar) {
        i((a0) hVar);
    }

    @Override // r70.h
    public r70.h copy() {
        return new a0(this);
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        j();
        r70.i.s(this.f30076e, bArr, i11);
        r70.i.s(this.f30077f, bArr, i11 + 8);
        r70.i.s(this.f30078g, bArr, i11 + 16);
        r70.i.s(this.f30079h, bArr, i11 + 24);
        r70.i.s(this.f30080i, bArr, i11 + 32);
        r70.i.s(this.f30081j, bArr, i11 + 40);
        r70.i.s(this.f30082k, bArr, i11 + 48);
        r70.i.s(this.f30083l, bArr, i11 + 56);
        reset();
        return 64;
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA512;
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return 64;
    }

    @Override // i50.m, org.bouncycastle.crypto.p
    public void reset() {
        super.reset();
        this.f30076e = 7640891576956012808L;
        this.f30077f = -4942790177534073029L;
        this.f30078g = 4354685564936845355L;
        this.f30079h = -6534734903238641935L;
        this.f30080i = 5840696475078001361L;
        this.f30081j = -7276294671716946913L;
        this.f30082k = 2270897969802886507L;
        this.f30083l = 6620516959819538809L;
    }
}