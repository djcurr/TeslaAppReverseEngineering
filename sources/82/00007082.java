package gn;

import com.google.firebase.perf.util.h;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kn.k;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: e  reason: collision with root package name */
    private static final fn.a f28034e = fn.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final c f28035a;

    /* renamed from: b  reason: collision with root package name */
    private final h f28036b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f28037c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private boolean f28038d;

    public b(String str, String str2, k kVar, h hVar) {
        this.f28038d = false;
        this.f28036b = hVar;
        c k11 = c.c(kVar).v(str).k(str2);
        this.f28035a = k11;
        k11.m();
        if (com.google.firebase.perf.config.a.f().I()) {
            return;
        }
        f28034e.g("HttpMetric feature is disabled. URL %s", str);
        this.f28038d = true;
    }

    public void a(int i11) {
        this.f28035a.l(i11);
    }

    public void b(long j11) {
        this.f28035a.o(j11);
    }

    public void c(String str) {
        this.f28035a.q(str);
    }

    public void d(long j11) {
        this.f28035a.r(j11);
    }

    public void e() {
        this.f28036b.e();
        this.f28035a.p(this.f28036b.d());
    }

    public void f() {
        if (this.f28038d) {
            return;
        }
        this.f28035a.t(this.f28036b.b()).j(this.f28037c).b();
    }
}