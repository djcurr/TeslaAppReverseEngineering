package u50;

/* loaded from: classes5.dex */
public class x0 implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f53309a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f53310b;

    /* renamed from: c  reason: collision with root package name */
    private int f53311c;

    public x0(byte[] bArr, byte[] bArr2, int i11) {
        this.f53309a = org.bouncycastle.util.a.h(bArr);
        this.f53310b = org.bouncycastle.util.a.h(bArr2);
        this.f53311c = i11;
    }

    public byte[] a() {
        return org.bouncycastle.util.a.h(this.f53309a);
    }

    public byte[] b() {
        return org.bouncycastle.util.a.h(this.f53310b);
    }

    public int c() {
        return this.f53311c;
    }
}