package a8;

/* loaded from: classes.dex */
public class i<T> {

    /* renamed from: a  reason: collision with root package name */
    T f350a;

    /* renamed from: b  reason: collision with root package name */
    T f351b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void b(T t11, T t12) {
        this.f350a = t11;
        this.f351b = t12;
    }

    public boolean equals(Object obj) {
        if (obj instanceof v3.d) {
            v3.d dVar = (v3.d) obj;
            return a(dVar.f54019a, this.f350a) && a(dVar.f54020b, this.f351b);
        }
        return false;
    }

    public int hashCode() {
        T t11 = this.f350a;
        int hashCode = t11 == null ? 0 : t11.hashCode();
        T t12 = this.f351b;
        return hashCode ^ (t12 != null ? t12.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f350a + " " + this.f351b + "}";
    }
}