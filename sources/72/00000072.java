package a70;

/* loaded from: classes5.dex */
public final class b extends u50.b {

    /* renamed from: b  reason: collision with root package name */
    private int f317b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f318c;

    public b(int i11, byte[] bArr) {
        super(false);
        if (bArr.length != c.c(i11)) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.f317b = i11;
        this.f318c = org.bouncycastle.util.a.h(bArr);
    }

    public byte[] b() {
        return org.bouncycastle.util.a.h(this.f318c);
    }

    public int c() {
        return this.f317b;
    }
}