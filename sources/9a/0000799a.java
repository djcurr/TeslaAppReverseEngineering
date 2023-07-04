package io.sentry;

import io.sentry.u1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class o3 implements j0 {

    /* renamed from: b  reason: collision with root package name */
    private final t3 f32346b;

    /* renamed from: d  reason: collision with root package name */
    private final c0 f32348d;

    /* renamed from: e  reason: collision with root package name */
    private String f32349e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f32350f;

    /* renamed from: h  reason: collision with root package name */
    private final f4 f32352h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f32353i;

    /* renamed from: j  reason: collision with root package name */
    private final Long f32354j;

    /* renamed from: k  reason: collision with root package name */
    private TimerTask f32355k;

    /* renamed from: l  reason: collision with root package name */
    private Timer f32356l;

    /* renamed from: p  reason: collision with root package name */
    private c4 f32360p;

    /* renamed from: a  reason: collision with root package name */
    private final io.sentry.protocol.o f32345a = new io.sentry.protocol.o();

    /* renamed from: c  reason: collision with root package name */
    private final List<t3> f32347c = new CopyOnWriteArrayList();

    /* renamed from: g  reason: collision with root package name */
    private b f32351g = b.f32362c;

    /* renamed from: m  reason: collision with root package name */
    private final Object f32357m = new Object();

    /* renamed from: n  reason: collision with root package name */
    private final c f32358n = new c(null);

    /* renamed from: o  reason: collision with root package name */
    private final AtomicBoolean f32359o = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            x3 status = o3.this.getStatus();
            o3 o3Var = o3.this;
            if (status == null) {
                status = x3.OK;
            }
            o3Var.e(status);
            o3.this.f32359o.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        static final b f32362c = d();

        /* renamed from: a  reason: collision with root package name */
        private final boolean f32363a;

        /* renamed from: b  reason: collision with root package name */
        private final x3 f32364b;

        private b(boolean z11, x3 x3Var) {
            this.f32363a = z11;
            this.f32364b = x3Var;
        }

        static b c(x3 x3Var) {
            return new b(true, x3Var);
        }

        private static b d() {
            return new b(false, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class c implements Comparator<t3> {
        private c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(t3 t3Var, t3 t3Var2) {
            Double n11 = t3Var.n();
            Double n12 = t3Var2.n();
            if (n11 == null) {
                return -1;
            }
            if (n12 == null) {
                return 1;
            }
            return n11.compareTo(n12);
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o3(e4 e4Var, c0 c0Var, Date date, boolean z11, Long l11, boolean z12, f4 f4Var) {
        this.f32356l = null;
        rz.j.a(e4Var, "context is required");
        rz.j.a(c0Var, "hub is required");
        this.f32346b = new t3(e4Var, this, c0Var, date);
        this.f32349e = e4Var.m();
        this.f32348d = c0Var;
        this.f32350f = z11;
        this.f32354j = l11;
        this.f32353i = z12;
        this.f32352h = f4Var;
        if (l11 != null) {
            this.f32356l = new Timer(true);
            g();
        }
    }

    private void n() {
        synchronized (this.f32357m) {
            TimerTask timerTask = this.f32355k;
            if (timerTask != null) {
                timerTask.cancel();
                this.f32359o.set(false);
                this.f32355k = null;
            }
        }
    }

    private i0 o(w3 w3Var, String str, String str2, Date date) {
        if (this.f32346b.a()) {
            return h1.i();
        }
        rz.j.a(w3Var, "parentSpanId is required");
        rz.j.a(str, "operation is required");
        n();
        t3 t3Var = new t3(this.f32346b.v(), w3Var, this, str, this.f32348d, date, new v3() { // from class: io.sentry.n3
            @Override // io.sentry.v3
            public final void a(t3 t3Var2) {
                o3.this.w(t3Var2);
            }
        });
        t3Var.x(str2);
        this.f32347c.add(t3Var);
        return t3Var;
    }

    private i0 p(String str, String str2, Date date) {
        if (this.f32346b.a()) {
            return h1.i();
        }
        if (this.f32347c.size() < this.f32348d.getOptions().getMaxSpans()) {
            return this.f32346b.c(str, str2, date);
        }
        this.f32348d.getOptions().getLogger().c(f3.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return h1.i();
    }

    private boolean u() {
        ArrayList<t3> arrayList = new ArrayList(this.f32347c);
        if (arrayList.isEmpty()) {
            return true;
        }
        for (t3 t3Var : arrayList) {
            if (!t3Var.a()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(t3 t3Var) {
        b bVar = this.f32351g;
        if (this.f32354j == null) {
            if (bVar.f32363a) {
                e(bVar.f32364b);
            }
        } else if (!this.f32350f || u()) {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(u1 u1Var, j0 j0Var) {
        if (j0Var == this) {
            u1Var.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(final u1 u1Var) {
        u1Var.B(new u1.b() { // from class: io.sentry.k3
            @Override // io.sentry.u1.b
            public final void a(j0 j0Var) {
                o3.this.x(u1Var, j0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(AtomicReference atomicReference, u1 u1Var) {
        atomicReference.set(u1Var.t());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0 A(w3 w3Var, String str, String str2, Date date) {
        return o(w3Var, str, str2, date);
    }

    @Override // io.sentry.i0
    public boolean a() {
        return this.f32346b.a();
    }

    @Override // io.sentry.j0
    public io.sentry.protocol.o b() {
        return this.f32345a;
    }

    @Override // io.sentry.i0
    public i0 c(String str, String str2, Date date) {
        return p(str, str2, date);
    }

    @Override // io.sentry.i0
    public c4 d() {
        c4 c4Var;
        if (this.f32348d.getOptions().isTraceSampling()) {
            synchronized (this) {
                if (this.f32360p == null) {
                    final AtomicReference atomicReference = new AtomicReference();
                    this.f32348d.i(new v1() { // from class: io.sentry.m3
                        @Override // io.sentry.v1
                        public final void a(u1 u1Var) {
                            o3.z(atomicReference, u1Var);
                        }
                    });
                    this.f32360p = new c4(this, (io.sentry.protocol.w) atomicReference.get(), this.f32348d.getOptions());
                }
                c4Var = this.f32360p;
            }
            return c4Var;
        }
        return null;
    }

    @Override // io.sentry.i0
    public void e(x3 x3Var) {
        t3 t3Var;
        Double u11;
        this.f32351g = b.c(x3Var);
        if (this.f32346b.a()) {
            return;
        }
        if (!this.f32350f || u()) {
            Boolean v11 = v();
            if (v11 == null) {
                v11 = Boolean.FALSE;
            }
            q1 b11 = (this.f32348d.getOptions().isProfilingEnabled() && v11.booleanValue()) ? this.f32348d.getOptions().getTransactionProfiler().b(this) : null;
            Long valueOf = Long.valueOf(System.nanoTime());
            Double o11 = this.f32346b.o(valueOf);
            if (o11 == null) {
                o11 = Double.valueOf(g.a(g.b()));
                valueOf = null;
            }
            for (t3 t3Var2 : this.f32347c) {
                if (!t3Var2.a()) {
                    t3Var2.y(null);
                    t3Var2.i(x3.DEADLINE_EXCEEDED, o11, valueOf);
                }
            }
            if (!this.f32347c.isEmpty() && this.f32353i && (u11 = (t3Var = (t3) Collections.max(this.f32347c, this.f32358n)).u()) != null && o11.doubleValue() > u11.doubleValue()) {
                valueOf = t3Var.m();
                o11 = u11;
            }
            this.f32346b.i(this.f32351g.f32364b, o11, valueOf);
            this.f32348d.i(new v1() { // from class: io.sentry.l3
                @Override // io.sentry.v1
                public final void a(u1 u1Var) {
                    o3.this.y(u1Var);
                }
            });
            io.sentry.protocol.v vVar = new io.sentry.protocol.v(this);
            f4 f4Var = this.f32352h;
            if (f4Var != null) {
                f4Var.a(this);
            }
            if (this.f32356l != null) {
                synchronized (this.f32357m) {
                    this.f32356l.cancel();
                    this.f32356l = null;
                }
            }
            if (!this.f32347c.isEmpty() || this.f32354j == null) {
                this.f32348d.r(vVar, this.f32360p, null, b11);
            }
        }
    }

    @Override // io.sentry.j0
    public t3 f() {
        ArrayList arrayList = new ArrayList(this.f32347c);
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((t3) arrayList.get(size)).a()) {
                return (t3) arrayList.get(size);
            }
        }
        return null;
    }

    @Override // io.sentry.i0
    public void finish() {
        e(getStatus());
    }

    @Override // io.sentry.j0
    public void g() {
        synchronized (this.f32357m) {
            n();
            if (this.f32356l != null) {
                this.f32359o.set(true);
                a aVar = new a();
                this.f32355k = aVar;
                this.f32356l.schedule(aVar, this.f32354j.longValue());
            }
        }
    }

    @Override // io.sentry.j0
    public String getName() {
        return this.f32349e;
    }

    @Override // io.sentry.i0
    public x3 getStatus() {
        return this.f32346b.getStatus();
    }

    @Override // io.sentry.i0
    public u3 h() {
        return this.f32346b.h();
    }

    public List<t3> q() {
        return this.f32347c;
    }

    public Map<String, Object> r() {
        return this.f32346b.j();
    }

    public Double s() {
        return this.f32346b.n();
    }

    public Date t() {
        return this.f32346b.s();
    }

    public Boolean v() {
        return this.f32346b.w();
    }
}