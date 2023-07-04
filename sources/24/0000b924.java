package v3;

/* loaded from: classes.dex */
public class d<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f54019a;

    /* renamed from: b  reason: collision with root package name */
    public final S f54020b;

    public d(F f11, S s11) {
        this.f54019a = f11;
        this.f54020b = s11;
    }

    public static <A, B> d<A, B> a(A a11, B b11) {
        return new d<>(a11, b11);
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return c.a(dVar.f54019a, this.f54019a) && c.a(dVar.f54020b, this.f54020b);
        }
        return false;
    }

    public int hashCode() {
        F f11 = this.f54019a;
        int hashCode = f11 == null ? 0 : f11.hashCode();
        S s11 = this.f54020b;
        return hashCode ^ (s11 != null ? s11.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f54019a + " " + this.f54020b + "}";
    }
}