package p50;

import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.v;
import q50.t;
import u50.b1;
import u50.f1;

/* loaded from: classes5.dex */
public class i implements v {

    /* renamed from: a  reason: collision with root package name */
    private final t f46263a;

    /* renamed from: b  reason: collision with root package name */
    private final int f46264b;

    public i(t tVar, int i11) {
        this.f46263a = tVar;
        this.f46264b = i11;
    }

    @Override // org.bouncycastle.crypto.v
    public int doFinal(byte[] bArr, int i11) {
        try {
            return this.f46263a.doFinal(bArr, i11);
        } catch (InvalidCipherTextException e11) {
            throw new IllegalStateException(e11.toString());
        }
    }

    @Override // org.bouncycastle.crypto.v
    public String getAlgorithmName() {
        return this.f46263a.getUnderlyingCipher().getAlgorithmName() + "-KGMAC";
    }

    @Override // org.bouncycastle.crypto.v
    public int getMacSize() {
        return this.f46264b / 8;
    }

    @Override // org.bouncycastle.crypto.v
    public void init(org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("KGMAC requires ParametersWithIV");
        }
        f1 f1Var = (f1) iVar;
        this.f46263a.init(true, new u50.a((b1) f1Var.b(), this.f46264b, f1Var.a()));
    }

    @Override // org.bouncycastle.crypto.v
    public void reset() {
        this.f46263a.e();
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte b11) {
        this.f46263a.d(b11);
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte[] bArr, int i11, int i12) {
        this.f46263a.processAADBytes(bArr, i11, i12);
    }
}