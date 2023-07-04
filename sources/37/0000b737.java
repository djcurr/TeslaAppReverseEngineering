package u50;

/* loaded from: classes5.dex */
public class b1 implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f53192a;

    public b1(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public b1(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        this.f53192a = bArr2;
        System.arraycopy(bArr, i11, bArr2, 0, i12);
    }

    public byte[] a() {
        return this.f53192a;
    }
}