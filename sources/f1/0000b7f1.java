package ul;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f53590a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53591b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53592c;

    private q(Class<?> cls, int i11, int i12) {
        this.f53590a = (Class) z.c(cls, "Null dependency anInterface.");
        this.f53591b = i11;
        this.f53592c = i12;
    }

    public static q a(Class<?> cls) {
        return new q(cls, 0, 2);
    }

    private static String b(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i11);
            }
            return "provider";
        }
        return "direct";
    }

    @Deprecated
    public static q h(Class<?> cls) {
        return new q(cls, 0, 0);
    }

    public static q i(Class<?> cls) {
        return new q(cls, 0, 1);
    }

    public static q j(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q k(Class<?> cls) {
        return new q(cls, 1, 1);
    }

    public static q l(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public Class<?> c() {
        return this.f53590a;
    }

    public boolean d() {
        return this.f53592c == 2;
    }

    public boolean e() {
        return this.f53592c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.f53590a == qVar.f53590a && this.f53591b == qVar.f53591b && this.f53592c == qVar.f53592c;
        }
        return false;
    }

    public boolean f() {
        return this.f53591b == 1;
    }

    public boolean g() {
        return this.f53591b == 2;
    }

    public int hashCode() {
        return ((((this.f53590a.hashCode() ^ 1000003) * 1000003) ^ this.f53591b) * 1000003) ^ this.f53592c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f53590a);
        sb2.append(", type=");
        int i11 = this.f53591b;
        sb2.append(i11 == 1 ? "required" : i11 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(b(this.f53592c));
        sb2.append("}");
        return sb2.toString();
    }
}