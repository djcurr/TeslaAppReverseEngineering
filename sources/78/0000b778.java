package u50;

/* loaded from: classes5.dex */
public final class w1 extends b {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f53306b;

    public w1(byte[] bArr) {
        this(c(bArr), 0);
    }

    public w1(byte[] bArr, int i11) {
        super(false);
        byte[] bArr2 = new byte[56];
        this.f53306b = bArr2;
        System.arraycopy(bArr, i11, bArr2, 0, 56);
    }

    private static byte[] c(byte[] bArr) {
        if (bArr.length == 56) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 56");
    }

    public void b(byte[] bArr, int i11) {
        System.arraycopy(this.f53306b, 0, bArr, i11, 56);
    }

    public byte[] getEncoded() {
        return org.bouncycastle.util.a.h(this.f53306b);
    }
}