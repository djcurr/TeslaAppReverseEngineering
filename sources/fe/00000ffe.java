package cc;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final int f9058a;

    /* renamed from: b  reason: collision with root package name */
    private final b f9059b;

    public g(int i11, b bVar) {
        this.f9058a = i11;
        this.f9059b = bVar;
    }

    public String a() {
        return this.f9059b.f(this.f9058a);
    }

    public String b() {
        return this.f9059b.v(this.f9058a);
    }

    public int c() {
        return this.f9058a;
    }

    public String toString() {
        String a11 = a();
        if (a11 == null) {
            a11 = this.f9059b.r(c()) + " (unable to formulate description)";
        }
        return "[" + this.f9059b.n() + "] " + b() + " - " + a11;
    }
}