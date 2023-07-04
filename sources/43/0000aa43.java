package p50;

import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.v;
import u50.b1;
import u50.f1;

/* loaded from: classes5.dex */
public class e implements v {

    /* renamed from: a  reason: collision with root package name */
    private final q50.n f46236a;

    /* renamed from: b  reason: collision with root package name */
    private final int f46237b = 128;

    public e(q50.n nVar) {
        this.f46236a = nVar;
    }

    @Override // org.bouncycastle.crypto.v
    public int doFinal(byte[] bArr, int i11) {
        try {
            return this.f46236a.doFinal(bArr, i11);
        } catch (InvalidCipherTextException e11) {
            throw new IllegalStateException(e11.toString());
        }
    }

    @Override // org.bouncycastle.crypto.v
    public String getAlgorithmName() {
        return this.f46236a.getUnderlyingCipher().getAlgorithmName() + "-GMAC";
    }

    @Override // org.bouncycastle.crypto.v
    public int getMacSize() {
        return this.f46237b / 8;
    }

    @Override // org.bouncycastle.crypto.v
    public void init(org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("GMAC requires ParametersWithIV");
        }
        f1 f1Var = (f1) iVar;
        this.f46236a.init(true, new u50.a((b1) f1Var.b(), this.f46237b, f1Var.a()));
    }

    @Override // org.bouncycastle.crypto.v
    public void reset() {
        this.f46236a.k();
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte b11) {
        this.f46236a.h(b11);
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte[] bArr, int i11, int i12) {
        this.f46236a.processAADBytes(bArr, i11, i12);
    }
}