package u50;

/* loaded from: classes5.dex */
public class i1 implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f53227a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.crypto.i f53228b;

    public i1(org.bouncycastle.crypto.i iVar, byte[] bArr) {
        this(iVar, bArr, 0, bArr.length);
    }

    public i1(org.bouncycastle.crypto.i iVar, byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        this.f53227a = bArr2;
        this.f53228b = iVar;
        System.arraycopy(bArr, i11, bArr2, 0, i12);
    }

    public org.bouncycastle.crypto.i a() {
        return this.f53228b;
    }

    public byte[] b() {
        return this.f53227a;
    }
}