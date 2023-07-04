package p50;

/* loaded from: classes5.dex */
public class m extends n {
    public m() {
    }

    public m(int i11, int i12) {
        super(i11, i12);
    }

    @Override // p50.n
    public long b() {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }

    @Override // p50.n, org.bouncycastle.crypto.v
    public int doFinal(byte[] bArr, int i11) {
        int i12;
        long j11 = this.f46304i >>> ((7 - this.f46305j) << 3);
        this.f46304i = j11;
        long j12 = j11 >>> 8;
        this.f46304i = j12;
        this.f46304i = j12 | ((((this.f46306k << 3) + i12) & 255) << 56);
        c();
        this.f46302g ^= 238;
        a(this.f46297b);
        long j13 = this.f46300e;
        long j14 = this.f46301f;
        long j15 = ((j13 ^ j14) ^ this.f46302g) ^ this.f46303h;
        this.f46301f = j14 ^ 221;
        a(this.f46297b);
        reset();
        r70.i.v(j15, bArr, i11);
        r70.i.v(((this.f46300e ^ this.f46301f) ^ this.f46302g) ^ this.f46303h, bArr, i11 + 8);
        return 16;
    }

    @Override // p50.n, org.bouncycastle.crypto.v
    public String getAlgorithmName() {
        return "SipHash128-" + this.f46296a + "-" + this.f46297b;
    }

    @Override // p50.n, org.bouncycastle.crypto.v
    public int getMacSize() {
        return 16;
    }

    @Override // p50.n, org.bouncycastle.crypto.v
    public void reset() {
        super.reset();
        this.f46301f ^= 238;
    }
}