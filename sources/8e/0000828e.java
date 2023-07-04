package l50;

/* loaded from: classes5.dex */
public class l extends t0 {
    @Override // l50.t0
    protected void a() {
        int[] iArr = this.f36907c;
        int i11 = iArr[12] + 1;
        iArr[12] = i11;
        if (i11 == 0) {
            throw new IllegalStateException("attempt to increase counter past 2^32.");
        }
    }

    @Override // l50.t0
    protected void b(byte[] bArr) {
        m.j(this.f36905a, this.f36907c, this.f36908d);
        r70.i.j(this.f36908d, bArr, 0);
    }

    @Override // l50.t0
    protected int c() {
        return 12;
    }

    @Override // l50.t0
    protected void f() {
        this.f36907c[12] = 0;
    }

    @Override // l50.t0, org.bouncycastle.crypto.b0
    public String getAlgorithmName() {
        return "ChaCha7539";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l50.t0
    public void i(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 256 bit key");
            }
            e(bArr.length, this.f36907c, 0);
            r70.i.n(bArr, 0, this.f36907c, 4, 8);
        }
        r70.i.n(bArr2, 0, this.f36907c, 13, 3);
    }
}