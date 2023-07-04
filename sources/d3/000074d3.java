package i50;

import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes5.dex */
public class y extends m {
    public y() {
    }

    public y(y yVar) {
        super(yVar);
    }

    @Override // r70.h
    public void a(r70.h hVar) {
        super.i((y) hVar);
    }

    @Override // r70.h
    public r70.h copy() {
        return new y(this);
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
        reset();
        return 48;
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA384;
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return 48;
    }

    @Override // i50.m, org.bouncycastle.crypto.p
    public void reset() {
        super.reset();
        this.f30076e = -3766243637369397544L;
        this.f30077f = 7105036623409894663L;
        this.f30078g = -7973340178411365097L;
        this.f30079h = 1526699215303891257L;
        this.f30080i = 7436329637833083697L;
        this.f30081j = -8163818279084223215L;
        this.f30082k = -2662702644619276377L;
        this.f30083l = 5167115440072839076L;
    }
}