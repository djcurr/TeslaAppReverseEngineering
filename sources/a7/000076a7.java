package io.grpc.internal;

/* loaded from: classes5.dex */
public final class n2 {

    /* renamed from: i  reason: collision with root package name */
    private static final b f31086i = new b(k2.f31033a);

    /* renamed from: a  reason: collision with root package name */
    private final k2 f31087a;

    /* renamed from: b  reason: collision with root package name */
    private long f31088b;

    /* renamed from: c  reason: collision with root package name */
    private long f31089c;

    /* renamed from: d  reason: collision with root package name */
    private long f31090d;

    /* renamed from: e  reason: collision with root package name */
    private long f31091e;

    /* renamed from: f  reason: collision with root package name */
    private c f31092f;

    /* renamed from: g  reason: collision with root package name */
    private long f31093g;

    /* renamed from: h  reason: collision with root package name */
    private final d1 f31094h;

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final k2 f31095a;

        public b(k2 k2Var) {
            this.f31095a = k2Var;
        }

        public n2 a() {
            return new n2(this.f31095a);
        }
    }

    /* loaded from: classes5.dex */
    public interface c {
    }

    public static b a() {
        return f31086i;
    }

    public void b() {
        this.f31091e++;
    }

    public void c() {
        this.f31088b++;
        this.f31087a.a();
    }

    public void d() {
        this.f31094h.a(1L);
        this.f31087a.a();
    }

    public void e(int i11) {
        if (i11 == 0) {
            return;
        }
        this.f31093g += i11;
        this.f31087a.a();
    }

    public void f(boolean z11) {
        if (z11) {
            this.f31089c++;
        } else {
            this.f31090d++;
        }
    }

    public void g(c cVar) {
        this.f31092f = (c) com.google.common.base.u.o(cVar);
    }

    public n2() {
        this.f31094h = e1.a();
        this.f31087a = k2.f31033a;
    }

    private n2(k2 k2Var) {
        this.f31094h = e1.a();
        this.f31087a = k2Var;
    }
}