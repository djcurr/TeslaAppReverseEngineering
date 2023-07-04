package i50;

/* loaded from: classes5.dex */
public final class f extends e {

    /* renamed from: m  reason: collision with root package name */
    private static final byte[] f30001m = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    public f() {
        super(f30001m);
    }

    public f(f fVar) {
        super(f30001m);
        a(fVar);
    }

    @Override // r70.h
    public r70.h copy() {
        return new f(this);
    }

    @Override // i50.e, org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        byte[] bArr2 = new byte[64];
        super.doFinal(bArr2, 0);
        System.arraycopy(bArr2, 32, bArr, i11, 32);
        return 32;
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "GOST3411-2012-256";
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return 32;
    }
}