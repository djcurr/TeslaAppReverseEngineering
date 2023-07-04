package cc;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f9039a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9040b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9041c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9042d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9043e;

    /* renamed from: f  reason: collision with root package name */
    private final int f9044f;

    public a(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f9039a = i11;
        this.f9040b = i12;
        this.f9041c = i13;
        this.f9042d = i14;
        this.f9043e = i15;
        this.f9044f = i16;
    }

    private static void a(StringBuilder sb2, int i11, String str) {
        if (i11 == 0) {
            return;
        }
        if (sb2.length() != 0) {
            sb2.append(' ');
        }
        sb2.append(i11);
        sb2.append(' ');
        sb2.append(str);
        if (i11 != 1) {
            sb2.append('s');
        }
    }

    public static a b(String str) {
        if (str.length() == 19 && !str.startsWith("9999:99:99")) {
            try {
                return new a(Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(5, 7)), Integer.parseInt(str.substring(8, 10)), Integer.parseInt(str.substring(11, 13)), Integer.parseInt(str.substring(14, 16)), Integer.parseInt(str.substring(17, 19)));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public String c() {
        StringBuilder sb2 = new StringBuilder();
        a(sb2, this.f9039a, "year");
        a(sb2, this.f9040b, "month");
        a(sb2, this.f9041c, "day");
        a(sb2, this.f9042d, "hour");
        a(sb2, this.f9043e, "minute");
        a(sb2, this.f9044f, "second");
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9041c == aVar.f9041c && this.f9042d == aVar.f9042d && this.f9043e == aVar.f9043e && this.f9040b == aVar.f9040b && this.f9044f == aVar.f9044f && this.f9039a == aVar.f9039a;
    }

    public int hashCode() {
        return (((((((((this.f9039a * 31) + this.f9040b) * 31) + this.f9041c) * 31) + this.f9042d) * 31) + this.f9043e) * 31) + this.f9044f;
    }

    public String toString() {
        return String.format("%04d:%02d:%02d %02d:%02d:%02d", Integer.valueOf(this.f9039a), Integer.valueOf(this.f9040b), Integer.valueOf(this.f9041c), Integer.valueOf(this.f9042d), Integer.valueOf(this.f9043e), Integer.valueOf(this.f9044f));
    }
}