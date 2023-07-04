package i50;

/* loaded from: classes5.dex */
public class c0 extends l implements org.bouncycastle.crypto.d0 {
    public c0() {
        this(128);
    }

    public c0(int i11) {
        super(l(i11));
    }

    public c0(c0 c0Var) {
        super(c0Var);
    }

    private static int l(int i11) {
        if (i11 == 128 || i11 == 256) {
            return i11;
        }
        throw new IllegalArgumentException("'bitLength' " + i11 + " not supported for SHAKE");
    }

    @Override // i50.l, org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        return doFinal(bArr, i11, getDigestSize());
    }

    @Override // org.bouncycastle.crypto.d0
    public int doFinal(byte[] bArr, int i11, int i12) {
        int m11 = m(bArr, i11, i12);
        reset();
        return m11;
    }

    @Override // i50.l, org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "SHAKE" + this.f30069e;
    }

    @Override // i50.l, org.bouncycastle.crypto.p
    public int getDigestSize() {
        return this.f30069e / 4;
    }

    public int m(byte[] bArr, int i11, int i12) {
        if (!this.f30070f) {
            f(15, 4);
        }
        k(bArr, i11, i12 * 8);
        return i12;
    }
}