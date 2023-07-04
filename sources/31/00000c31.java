package b70;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private int f7535a;

    /* renamed from: b  reason: collision with root package name */
    private int f7536b;

    /* renamed from: c  reason: collision with root package name */
    private int f7537c;

    /* renamed from: d  reason: collision with root package name */
    private short[][][] f7538d;

    /* renamed from: e  reason: collision with root package name */
    private short[][][] f7539e;

    /* renamed from: f  reason: collision with root package name */
    private short[][] f7540f;

    /* renamed from: g  reason: collision with root package name */
    private short[] f7541g;

    public a(byte b11, byte b12, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i11 = b11 & 255;
        this.f7535a = i11;
        int i12 = b12 & 255;
        this.f7536b = i12;
        this.f7537c = i12 - i11;
        this.f7538d = sArr;
        this.f7539e = sArr2;
        this.f7540f = sArr3;
        this.f7541g = sArr4;
    }

    public short[][][] a() {
        return this.f7538d;
    }

    public short[][][] b() {
        return this.f7539e;
    }

    public short[] c() {
        return this.f7541g;
    }

    public short[][] d() {
        return this.f7540f;
    }

    public int e() {
        return this.f7537c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7535a == aVar.f() && this.f7536b == aVar.g() && this.f7537c == aVar.e() && c70.a.k(this.f7538d, aVar.a()) && c70.a.k(this.f7539e, aVar.b()) && c70.a.j(this.f7540f, aVar.d()) && c70.a.i(this.f7541g, aVar.c());
    }

    public int f() {
        return this.f7535a;
    }

    public int g() {
        return this.f7536b;
    }

    public int hashCode() {
        return (((((((((((this.f7535a * 37) + this.f7536b) * 37) + this.f7537c) * 37) + org.bouncycastle.util.a.N(this.f7538d)) * 37) + org.bouncycastle.util.a.N(this.f7539e)) * 37) + org.bouncycastle.util.a.M(this.f7540f)) * 37) + org.bouncycastle.util.a.L(this.f7541g);
    }
}