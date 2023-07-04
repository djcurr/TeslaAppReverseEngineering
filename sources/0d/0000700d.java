package g5;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f27767a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f27768b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27769c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f27770d;

    public b(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f27767a = z11;
        this.f27768b = z12;
        this.f27769c = z13;
        this.f27770d = z14;
    }

    public boolean a() {
        return this.f27767a;
    }

    public boolean b() {
        return this.f27769c;
    }

    public boolean c() {
        return this.f27770d;
    }

    public boolean d() {
        return this.f27768b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f27767a == bVar.f27767a && this.f27768b == bVar.f27768b && this.f27769c == bVar.f27769c && this.f27770d == bVar.f27770d;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r02 = this.f27767a;
        int i11 = r02;
        if (this.f27768b) {
            i11 = r02 + 16;
        }
        int i12 = i11;
        if (this.f27769c) {
            i12 = i11 + 256;
        }
        return this.f27770d ? i12 + 4096 : i12;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f27767a), Boolean.valueOf(this.f27768b), Boolean.valueOf(this.f27769c), Boolean.valueOf(this.f27770d));
    }
}