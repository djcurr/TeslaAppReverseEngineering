package u50;

/* loaded from: classes5.dex */
public final class t1 extends b {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f53294b;

    public t1(byte[] bArr) {
        this(c(bArr), 0);
    }

    public t1(byte[] bArr, int i11) {
        super(false);
        byte[] bArr2 = new byte[32];
        this.f53294b = bArr2;
        System.arraycopy(bArr, i11, bArr2, 0, 32);
    }

    private static byte[] c(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 32");
    }

    public void b(byte[] bArr, int i11) {
        System.arraycopy(this.f53294b, 0, bArr, i11, 32);
    }

    public byte[] getEncoded() {
        return org.bouncycastle.util.a.h(this.f53294b);
    }
}