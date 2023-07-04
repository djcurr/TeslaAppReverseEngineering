package hz;

/* loaded from: classes5.dex */
public class a<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public F f29498a;

    /* renamed from: b  reason: collision with root package name */
    public S f29499b;

    public a(F f11, S s11) {
        this.f29498a = f11;
        this.f29499b = s11;
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return a(aVar.f29498a, this.f29498a) && a(aVar.f29499b, this.f29499b);
        }
        return false;
    }

    public int hashCode() {
        F f11 = this.f29498a;
        int hashCode = f11 == null ? 0 : f11.hashCode();
        S s11 = this.f29499b;
        return hashCode ^ (s11 != null ? s11.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f29498a) + " " + String.valueOf(this.f29499b) + "}";
    }
}