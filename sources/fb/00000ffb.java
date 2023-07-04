package cc;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final int f9049a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9050b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9051c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9052d;

    /* renamed from: e  reason: collision with root package name */
    private final String f9053e;

    /* renamed from: f  reason: collision with root package name */
    private final a f9054f;

    public d(int i11, int i12, int i13, int i14, String str, a aVar) {
        this.f9049a = i11;
        this.f9050b = i12;
        this.f9051c = i13;
        this.f9052d = i14;
        this.f9053e = str;
        this.f9054f = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f9052d == dVar.f9052d && this.f9051c == dVar.f9051c && this.f9049a == dVar.f9049a && this.f9050b == dVar.f9050b) {
            a aVar = this.f9054f;
            if (aVar == null ? dVar.f9054f == null : aVar.equals(dVar.f9054f)) {
                String str = this.f9053e;
                String str2 = dVar.f9053e;
                return str == null ? str2 == null : str.equals(str2);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i11 = ((((((this.f9049a * 31) + this.f9050b) * 31) + this.f9051c) * 31) + this.f9052d) * 31;
        String str = this.f9053e;
        int hashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
        a aVar = this.f9054f;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("x: ");
        sb2.append(this.f9049a);
        sb2.append(" y: ");
        sb2.append(this.f9050b);
        sb2.append(" width: ");
        sb2.append(this.f9051c);
        sb2.append(" height: ");
        sb2.append(this.f9052d);
        if (this.f9053e != null) {
            sb2.append(" name: ");
            sb2.append(this.f9053e);
        }
        if (this.f9054f != null) {
            sb2.append(" age: ");
            sb2.append(this.f9054f.c());
        }
        return sb2.toString();
    }
}