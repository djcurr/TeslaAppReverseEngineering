package hq;

import ch.qos.logback.core.CoreConstants;
import hq.j;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: h  reason: collision with root package name */
    public static final g f29386h = new g(0);

    /* renamed from: a  reason: collision with root package name */
    private boolean f29387a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f29388b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f29389c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f29390d;

    /* renamed from: e  reason: collision with root package name */
    private j.g f29391e;

    /* renamed from: f  reason: collision with root package name */
    private j.g f29392f;

    /* renamed from: g  reason: collision with root package name */
    private j.h f29393g;

    static {
        new g(-1);
        new g(2);
    }

    public g(int i11) {
        j.g gVar;
        boolean z11 = (i11 & 1) == 0;
        this.f29387a = z11;
        boolean z12 = (i11 & 4) == 0;
        this.f29389c = z12;
        boolean z13 = (i11 & 2) == 0;
        this.f29388b = z13;
        this.f29390d = (i11 & 16) > 0;
        if ((i11 & 8) > 0) {
            gVar = j.f29400c;
        } else {
            gVar = j.f29398a;
        }
        if (z12) {
            this.f29392f = j.f29399b;
        } else {
            this.f29392f = gVar;
        }
        if (z11) {
            this.f29391e = j.f29399b;
        } else {
            this.f29391e = gVar;
        }
        if (z13) {
            this.f29393g = j.f29402e;
        } else {
            this.f29393g = j.f29401d;
        }
    }

    public void a(Appendable appendable) {
        appendable.append(CoreConstants.COMMA_CHAR);
    }

    public void b(Appendable appendable) {
    }

    public void c(Appendable appendable) {
        appendable.append('[');
    }

    public void d(Appendable appendable) {
        appendable.append(']');
    }

    public void e(Appendable appendable) {
    }

    public void f(String str, Appendable appendable) {
        this.f29393g.a(str, appendable);
    }

    public boolean g() {
        return this.f29390d;
    }

    public boolean h(String str) {
        return this.f29391e.a(str);
    }

    public boolean i(String str) {
        return this.f29392f.a(str);
    }

    public void j(Appendable appendable) {
    }

    public void k(Appendable appendable) {
        appendable.append(CoreConstants.COLON_CHAR);
    }

    public void l(Appendable appendable) {
    }

    public void m(Appendable appendable) {
        appendable.append(CoreConstants.COMMA_CHAR);
    }

    public void n(Appendable appendable) {
        appendable.append(CoreConstants.CURLY_LEFT);
    }

    public void o(Appendable appendable) {
        appendable.append(CoreConstants.CURLY_RIGHT);
    }

    public void p(Appendable appendable, String str) {
        if (!i(str)) {
            appendable.append(str);
            return;
        }
        appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        i.a(str, appendable, this);
        appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
    }
}