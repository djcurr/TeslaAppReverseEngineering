package u50;

/* loaded from: classes5.dex */
public final class k0 extends b {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f53236b;

    public k0(byte[] bArr) {
        this(c(bArr), 0);
    }

    public k0(byte[] bArr, int i11) {
        super(false);
        byte[] bArr2 = new byte[57];
        this.f53236b = bArr2;
        System.arraycopy(bArr, i11, bArr2, 0, 57);
    }

    private static byte[] c(byte[] bArr) {
        if (bArr.length == 57) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 57");
    }

    public void b(byte[] bArr, int i11) {
        System.arraycopy(this.f53236b, 0, bArr, i11, 57);
    }

    public byte[] getEncoded() {
        return org.bouncycastle.util.a.h(this.f53236b);
    }
}