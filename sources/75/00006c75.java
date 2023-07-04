package ezvcard.util;

/* loaded from: classes5.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f25451a = new StringBuilder();

    public c a(char c11) {
        this.f25451a.append(c11);
        return this;
    }

    public c b() {
        this.f25451a.setLength(0);
        return this;
    }

    public String c() {
        return this.f25451a.toString();
    }

    public String d() {
        String c11 = c();
        b();
        return c11;
    }
}