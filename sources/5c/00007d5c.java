package k5;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f34388a;

    /* renamed from: b  reason: collision with root package name */
    public final int f34389b;

    public g(String str, int i11) {
        this.f34388a = str;
        this.f34389b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f34389b != gVar.f34389b) {
                return false;
            }
            return this.f34388a.equals(gVar.f34388a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f34388a.hashCode() * 31) + this.f34389b;
    }
}