package zu;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a */
    private final long f60782a;

    /* renamed from: b */
    private final Handler f60783b;

    /* renamed from: c */
    private final h00.a<vz.b0> f60784c;

    /* renamed from: d */
    private int f60785d;

    public p(long j11, Handler handler, h00.a<vz.b0> action) {
        kotlin.jvm.internal.s.g(handler, "handler");
        kotlin.jvm.internal.s.g(action, "action");
        this.f60782a = j11;
        this.f60783b = handler;
        this.f60784c = action;
    }

    public static /* synthetic */ void a(h00.a aVar) {
        m(aVar);
    }

    public static /* synthetic */ void b(h00.a aVar) {
        k(aVar);
    }

    public static /* synthetic */ void c(h00.a aVar) {
        g(aVar);
    }

    public static /* synthetic */ void d(h00.a aVar) {
        h(aVar);
    }

    public static /* synthetic */ void e(h00.a aVar) {
        j(aVar);
    }

    public static final void g(h00.a tmp0) {
        kotlin.jvm.internal.s.g(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static final void h(h00.a tmp0) {
        kotlin.jvm.internal.s.g(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static final void j(h00.a tmp0) {
        kotlin.jvm.internal.s.g(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static final void k(h00.a tmp0) {
        kotlin.jvm.internal.s.g(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static final void m(h00.a tmp0) {
        kotlin.jvm.internal.s.g(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final void f() {
        long j11;
        int i11 = this.f60785d + 1;
        this.f60785d = i11;
        j11 = m00.l.j((((long) Math.pow(2.0d, i11)) * 1000) + k00.c.f34202a.e(0, 1001), this.f60782a);
        Handler handler = this.f60783b;
        final h00.a<vz.b0> aVar = this.f60784c;
        handler.removeCallbacks(new Runnable() { // from class: zu.m
            @Override // java.lang.Runnable
            public final void run() {
                p.c(aVar);
            }
        });
        Handler handler2 = this.f60783b;
        final h00.a<vz.b0> aVar2 = this.f60784c;
        handler2.postDelayed(new Runnable() { // from class: zu.n
            @Override // java.lang.Runnable
            public final void run() {
                p.d(aVar2);
            }
        }, j11);
    }

    public final void i() {
        this.f60785d = 0;
        Handler handler = this.f60783b;
        final h00.a<vz.b0> aVar = this.f60784c;
        handler.removeCallbacks(new Runnable() { // from class: zu.o
            @Override // java.lang.Runnable
            public final void run() {
                p.e(aVar);
            }
        });
        Handler handler2 = this.f60783b;
        final h00.a<vz.b0> aVar2 = this.f60784c;
        handler2.postDelayed(new Runnable() { // from class: zu.l
            @Override // java.lang.Runnable
            public final void run() {
                p.b(aVar2);
            }
        }, 0L);
    }

    public final void l() {
        this.f60785d = 0;
        Handler handler = this.f60783b;
        final h00.a<vz.b0> aVar = this.f60784c;
        handler.removeCallbacks(new Runnable() { // from class: zu.k
            @Override // java.lang.Runnable
            public final void run() {
                p.a(aVar);
            }
        });
    }

    public /* synthetic */ p(long j11, Handler handler, h00.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 300000L : j11, (i11 & 2) != 0 ? new Handler(Looper.getMainLooper()) : handler, aVar);
    }
}