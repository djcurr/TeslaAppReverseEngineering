package nf;

/* loaded from: classes3.dex */
public class i implements j {

    /* renamed from: d  reason: collision with root package name */
    public static final j f41655d = d(Integer.MAX_VALUE, true, true);

    /* renamed from: a  reason: collision with root package name */
    int f41656a;

    /* renamed from: b  reason: collision with root package name */
    boolean f41657b;

    /* renamed from: c  reason: collision with root package name */
    boolean f41658c;

    private i(int i11, boolean z11, boolean z12) {
        this.f41656a = i11;
        this.f41657b = z11;
        this.f41658c = z12;
    }

    public static j d(int i11, boolean z11, boolean z12) {
        return new i(i11, z11, z12);
    }

    @Override // nf.j
    public boolean a() {
        return this.f41658c;
    }

    @Override // nf.j
    public boolean b() {
        return this.f41657b;
    }

    @Override // nf.j
    public int c() {
        return this.f41656a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.f41656a == iVar.f41656a && this.f41657b == iVar.f41657b && this.f41658c == iVar.f41658c;
        }
        return false;
    }

    public int hashCode() {
        return (this.f41656a ^ (this.f41657b ? 4194304 : 0)) ^ (this.f41658c ? 8388608 : 0);
    }
}