package a70;

/* loaded from: classes5.dex */
public final class a extends u50.b {

    /* renamed from: b  reason: collision with root package name */
    private int f315b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f316c;

    public a(int i11, byte[] bArr) {
        super(true);
        if (bArr.length != c.b(i11)) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.f315b = i11;
        this.f316c = org.bouncycastle.util.a.h(bArr);
    }

    public byte[] b() {
        return org.bouncycastle.util.a.h(this.f316c);
    }

    public int c() {
        return this.f315b;
    }
}