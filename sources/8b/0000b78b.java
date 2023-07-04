package u70;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f53359a;

    /* renamed from: b  reason: collision with root package name */
    private String f53360b;

    private int a(String str) {
        if (str == null) {
            return 1;
        }
        return str.hashCode();
    }

    private boolean d(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public String b() {
        return this.f53359a;
    }

    public String c() {
        return this.f53360b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return aVar == this || (d(this.f53359a, aVar.f53359a) && d(this.f53360b, aVar.f53360b));
        }
        return false;
    }

    public int hashCode() {
        return a(this.f53359a) + (a(this.f53360b) * 31);
    }
}