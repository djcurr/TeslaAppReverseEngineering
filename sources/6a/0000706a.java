package gi;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f27979a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27980b;

    /* renamed from: c  reason: collision with root package name */
    public final int f27981c;

    static {
        new a(0, 0, 0);
    }

    public a(int i11, int i12, int i13) {
        this.f27979a = i11;
        this.f27980b = i12;
        this.f27981c = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f27979a == aVar.f27979a && this.f27980b == aVar.f27980b && this.f27981c == aVar.f27981c;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f27979a) * 31) + this.f27980b) * 31) + this.f27981c;
    }
}