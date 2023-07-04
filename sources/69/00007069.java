package gh;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private String f27975a;

    /* renamed from: b  reason: collision with root package name */
    private String f27976b;

    /* renamed from: c  reason: collision with root package name */
    private c f27977c;

    /* renamed from: d  reason: collision with root package name */
    private String f27978d;

    public d() {
        this(null, null);
    }

    public String a() {
        return this.f27975a;
    }

    public String b() {
        return this.f27976b;
    }

    public c c() {
        return this.f27977c;
    }

    public String d() {
        return this.f27978d;
    }

    public void e(String str) {
        this.f27975a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            String str = this.f27975a;
            if (str == null) {
                if (dVar.f27975a != null) {
                    return false;
                }
            } else if (!str.equals(dVar.f27975a)) {
                return false;
            }
            String str2 = this.f27976b;
            if (str2 == null) {
                if (dVar.f27976b != null) {
                    return false;
                }
            } else if (!str2.equals(dVar.f27976b)) {
                return false;
            }
            c cVar = this.f27977c;
            if (cVar == null) {
                if (dVar.f27977c != null) {
                    return false;
                }
            } else if (!cVar.equals(dVar.f27977c)) {
                return false;
            }
            String str3 = this.f27978d;
            if (str3 == null) {
                if (dVar.f27978d != null) {
                    return false;
                }
            } else if (!str3.equals(dVar.f27978d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void f(String str) {
        this.f27976b = str;
    }

    public void g(String str) {
        this.f27978d = str;
    }

    public int hashCode() {
        String str = this.f27975a;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f27976b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        c cVar = this.f27977c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str3 = this.f27978d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "VObjectProperty [group=" + this.f27975a + ", name=" + this.f27976b + ", parameters=" + this.f27977c + ", value=" + this.f27978d + "]";
    }

    public d(String str, String str2) {
        this(null, str, str2);
    }

    public d(String str, String str2, String str3) {
        this(str, str2, new c(), str3);
    }

    public d(String str, String str2, c cVar, String str3) {
        this.f27975a = str;
        this.f27976b = str2;
        this.f27977c = cVar;
        this.f27978d = str3;
    }
}