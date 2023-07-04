package fn;

import java.util.Locale;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f26689c;

    /* renamed from: a  reason: collision with root package name */
    private final c f26690a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f26691b;

    public a(c cVar) {
        this.f26691b = false;
        this.f26690a = cVar == null ? c.c() : cVar;
    }

    public static a e() {
        if (f26689c == null) {
            synchronized (a.class) {
                if (f26689c == null) {
                    f26689c = new a();
                }
            }
        }
        return f26689c;
    }

    public void a(String str) {
        if (this.f26691b) {
            this.f26690a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.f26691b) {
            this.f26690a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.f26691b) {
            this.f26690a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.f26691b) {
            this.f26690a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.f26691b) {
            this.f26690a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f26691b) {
            this.f26690a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.f26691b;
    }

    public void i(boolean z11) {
        this.f26691b = z11;
    }

    public void j(String str) {
        if (this.f26691b) {
            this.f26690a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.f26691b) {
            this.f26690a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private a() {
        this(null);
    }
}