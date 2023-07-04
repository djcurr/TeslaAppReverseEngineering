package u50;

/* loaded from: classes5.dex */
public class f1 implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f53206a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.crypto.i f53207b;

    public f1(org.bouncycastle.crypto.i iVar, byte[] bArr) {
        this(iVar, bArr, 0, bArr.length);
    }

    public f1(org.bouncycastle.crypto.i iVar, byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        this.f53206a = bArr2;
        this.f53207b = iVar;
        System.arraycopy(bArr, i11, bArr2, 0, i12);
    }

    public byte[] a() {
        return this.f53206a;
    }

    public org.bouncycastle.crypto.i b() {
        return this.f53207b;
    }
}