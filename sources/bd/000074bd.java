package i50;

/* loaded from: classes5.dex */
public class g extends e {

    /* renamed from: m  reason: collision with root package name */
    private static final byte[] f30022m = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public g() {
        super(f30022m);
    }

    public g(g gVar) {
        super(f30022m);
        a(gVar);
    }

    @Override // r70.h
    public r70.h copy() {
        return new g(this);
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "GOST3411-2012-512";
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return 64;
    }
}