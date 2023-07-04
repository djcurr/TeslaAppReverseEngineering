package i50;

/* loaded from: classes5.dex */
public class z extends l {
    public z() {
        this(256);
    }

    public z(int i11) {
        super(l(i11));
    }

    public z(z zVar) {
        super(zVar);
    }

    private static int l(int i11) {
        if (i11 == 224 || i11 == 256 || i11 == 384 || i11 == 512) {
            return i11;
        }
        throw new IllegalArgumentException("'bitLength' " + i11 + " not supported for SHA-3");
    }

    @Override // i50.l, org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        f(2, 2);
        return super.doFinal(bArr, i11);
    }

    @Override // i50.l, org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "SHA3-" + this.f30069e;
    }
}