package pr;

/* loaded from: classes2.dex */
public final class l<W> implements e {

    /* renamed from: b  reason: collision with root package name */
    private final W f46877b;

    /* renamed from: c  reason: collision with root package name */
    private final String f46878c;

    /* renamed from: d  reason: collision with root package name */
    private final String f46879d;

    public l(W wrapped, String name) {
        boolean w11;
        kotlin.jvm.internal.s.g(wrapped, "wrapped");
        kotlin.jvm.internal.s.g(name, "name");
        this.f46877b = wrapped;
        this.f46878c = name;
        w11 = kotlin.text.v.w(name);
        if (!w11) {
            this.f46879d = e.f46856a.a(wrapped, name);
            return;
        }
        throw new IllegalArgumentException("name must not be blank.".toString());
    }

    @Override // pr.e
    public String a() {
        return this.f46879d;
    }

    public final W b() {
        return this.f46877b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return kotlin.jvm.internal.s.c(this.f46877b, lVar.f46877b) && kotlin.jvm.internal.s.c(this.f46878c, lVar.f46878c);
        }
        return false;
    }

    public int hashCode() {
        return (this.f46877b.hashCode() * 31) + this.f46878c.hashCode();
    }

    public String toString() {
        return super.toString() + ": " + a();
    }
}