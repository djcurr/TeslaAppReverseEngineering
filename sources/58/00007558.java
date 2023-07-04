package ih;

/* loaded from: classes3.dex */
class a {

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f30398a = new StringBuilder(1024);

    public a a(char c11) {
        this.f30398a.append(c11);
        return this;
    }

    public a b(CharSequence charSequence) {
        this.f30398a.append(charSequence);
        return this;
    }

    public a c() {
        if (g() > 0) {
            StringBuilder sb2 = this.f30398a;
            sb2.setLength(sb2.length() - 1);
        }
        return this;
    }

    public a d() {
        this.f30398a.setLength(0);
        return this;
    }

    public String e() {
        return this.f30398a.toString();
    }

    public String f() {
        String e11 = e();
        d();
        return e11;
    }

    public int g() {
        return this.f30398a.length();
    }
}