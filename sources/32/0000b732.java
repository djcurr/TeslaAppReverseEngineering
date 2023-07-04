package u50;

/* loaded from: classes5.dex */
public class a implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f53183a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f53184b;

    /* renamed from: c  reason: collision with root package name */
    private b1 f53185c;

    /* renamed from: d  reason: collision with root package name */
    private int f53186d;

    public a(b1 b1Var, int i11, byte[] bArr) {
        this(b1Var, i11, bArr, null);
    }

    public a(b1 b1Var, int i11, byte[] bArr, byte[] bArr2) {
        this.f53185c = b1Var;
        this.f53184b = org.bouncycastle.util.a.h(bArr);
        this.f53186d = i11;
        this.f53183a = org.bouncycastle.util.a.h(bArr2);
    }

    public byte[] a() {
        return org.bouncycastle.util.a.h(this.f53183a);
    }

    public b1 b() {
        return this.f53185c;
    }

    public int c() {
        return this.f53186d;
    }

    public byte[] d() {
        return org.bouncycastle.util.a.h(this.f53184b);
    }
}