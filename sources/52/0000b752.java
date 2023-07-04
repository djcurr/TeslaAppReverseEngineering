package u50;

/* loaded from: classes5.dex */
public class k1 implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f53237a;

    /* renamed from: b  reason: collision with root package name */
    private int f53238b;

    public k1(byte[] bArr, int i11) {
        if (bArr.length > 255) {
            throw new IllegalArgumentException("RC5 key length can be no greater than 255");
        }
        byte[] bArr2 = new byte[bArr.length];
        this.f53237a = bArr2;
        this.f53238b = i11;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public byte[] a() {
        return this.f53237a;
    }

    public int b() {
        return this.f53238b;
    }
}