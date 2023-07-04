package u50;

/* loaded from: classes5.dex */
public final class q0 implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private final b1 f53274a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53275b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f53276c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f53277d;

    public q0(b1 b1Var, int i11, byte[] bArr, boolean z11) {
        this.f53274a = b1Var;
        this.f53275b = i11;
        this.f53276c = org.bouncycastle.util.a.h(bArr);
        this.f53277d = z11;
    }

    public b1 a() {
        return this.f53274a;
    }

    public int b() {
        return this.f53275b;
    }

    public byte[] c() {
        return org.bouncycastle.util.a.h(this.f53276c);
    }

    public boolean d() {
        return this.f53277d;
    }
}