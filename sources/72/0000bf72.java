package xh;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.b;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import th.c;
import zh.a;

/* loaded from: classes3.dex */
public class p {

    /* renamed from: a */
    private final Context f57421a;

    /* renamed from: b */
    private final qh.d f57422b;

    /* renamed from: c */
    private final yh.d f57423c;

    /* renamed from: d */
    private final v f57424d;

    /* renamed from: e */
    private final Executor f57425e;

    /* renamed from: f */
    private final zh.a f57426f;

    /* renamed from: g */
    private final ai.a f57427g;

    /* renamed from: h */
    private final ai.a f57428h;

    /* renamed from: i */
    private final yh.c f57429i;

    public p(Context context, qh.d dVar, yh.d dVar2, v vVar, Executor executor, zh.a aVar, ai.a aVar2, ai.a aVar3, yh.c cVar) {
        this.f57421a = context;
        this.f57422b = dVar;
        this.f57423c = dVar2;
        this.f57424d = vVar;
        this.f57425e = executor;
        this.f57426f = aVar;
        this.f57427g = aVar2;
        this.f57428h = aVar3;
        this.f57429i = cVar;
    }

    public static /* synthetic */ void a(p pVar, ph.o oVar, int i11, Runnable runnable) {
        pVar.t(oVar, i11, runnable);
    }

    public static /* synthetic */ Boolean b(p pVar, ph.o oVar) {
        return pVar.l(oVar);
    }

    public static /* synthetic */ Object c(p pVar, Map map) {
        return pVar.q(map);
    }

    public static /* synthetic */ Iterable d(p pVar, ph.o oVar) {
        return pVar.m(oVar);
    }

    public static /* synthetic */ Object e(p pVar, Iterable iterable, ph.o oVar, long j11) {
        return pVar.n(iterable, oVar, j11);
    }

    public static /* synthetic */ Object f(p pVar, ph.o oVar, long j11) {
        return pVar.r(oVar, j11);
    }

    public static /* synthetic */ Object g(p pVar, Iterable iterable) {
        return pVar.o(iterable);
    }

    public static /* synthetic */ Object h(p pVar, ph.o oVar, int i11) {
        return pVar.s(oVar, i11);
    }

    public static /* synthetic */ Object i(p pVar) {
        return pVar.p();
    }

    public /* synthetic */ Boolean l(ph.o oVar) {
        return Boolean.valueOf(this.f57423c.W(oVar));
    }

    public /* synthetic */ Iterable m(ph.o oVar) {
        return this.f57423c.g0(oVar);
    }

    public /* synthetic */ Object n(Iterable iterable, ph.o oVar, long j11) {
        this.f57423c.l0(iterable);
        this.f57423c.h0(oVar, this.f57427g.a() + j11);
        return null;
    }

    public /* synthetic */ Object o(Iterable iterable) {
        this.f57423c.r(iterable);
        return null;
    }

    public /* synthetic */ Object p() {
        this.f57429i.a();
        return null;
    }

    public /* synthetic */ Object q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f57429i.j(((Integer) entry.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public /* synthetic */ Object r(ph.o oVar, long j11) {
        this.f57423c.h0(oVar, this.f57427g.a() + j11);
        return null;
    }

    public /* synthetic */ Object s(ph.o oVar, int i11) {
        this.f57424d.a(oVar, i11 + 1);
        return null;
    }

    public /* synthetic */ void t(final ph.o oVar, final int i11, Runnable runnable) {
        try {
            try {
                zh.a aVar = this.f57426f;
                final yh.d dVar = this.f57423c;
                Objects.requireNonNull(dVar);
                aVar.g(new a.InterfaceC1382a() { // from class: xh.f
                    @Override // zh.a.InterfaceC1382a
                    public final Object execute() {
                        return Integer.valueOf(dVar.e());
                    }
                });
                if (!k()) {
                    this.f57426f.g(new a.InterfaceC1382a() { // from class: xh.m
                        {
                            p.this = this;
                        }

                        @Override // zh.a.InterfaceC1382a
                        public final Object execute() {
                            return p.h(p.this, oVar, i11);
                        }
                    });
                } else {
                    u(oVar, i11);
                }
            } catch (SynchronizationException unused) {
                this.f57424d.a(oVar, i11 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public ph.i j(qh.k kVar) {
        zh.a aVar = this.f57426f;
        final yh.c cVar = this.f57429i;
        Objects.requireNonNull(cVar);
        return kVar.b(ph.i.a().i(this.f57427g.a()).k(this.f57428h.a()).j("GDT_CLIENT_METRICS").h(new ph.h(nh.b.b("proto"), ((th.a) aVar.g(new a.InterfaceC1382a() { // from class: xh.o
            @Override // zh.a.InterfaceC1382a
            public final Object execute() {
                return yh.c.this.l();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f57421a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    void u(final ph.o oVar, int i11) {
        com.google.android.datatransport.runtime.backends.b a11;
        qh.k kVar = this.f57422b.get(oVar.b());
        long j11 = 0;
        while (true) {
            final long j12 = j11;
            while (((Boolean) this.f57426f.g(new a.InterfaceC1382a() { // from class: xh.k
                {
                    p.this = this;
                }

                @Override // zh.a.InterfaceC1382a
                public final Object execute() {
                    return p.b(p.this, oVar);
                }
            })).booleanValue()) {
                final Iterable<yh.k> iterable = (Iterable) this.f57426f.g(new a.InterfaceC1382a() { // from class: xh.l
                    {
                        p.this = this;
                    }

                    @Override // zh.a.InterfaceC1382a
                    public final Object execute() {
                        return p.d(p.this, oVar);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return;
                }
                if (kVar == null) {
                    uh.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                    a11 = com.google.android.datatransport.runtime.backends.b.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (yh.k kVar2 : iterable) {
                        arrayList.add(kVar2.b());
                    }
                    if (oVar.e()) {
                        arrayList.add(j(kVar));
                    }
                    a11 = kVar.a(qh.e.a().b(arrayList).c(oVar.c()).a());
                }
                if (a11.c() == b.a.TRANSIENT_ERROR) {
                    this.f57426f.g(new a.InterfaceC1382a() { // from class: xh.i
                        {
                            p.this = this;
                        }

                        @Override // zh.a.InterfaceC1382a
                        public final Object execute() {
                            return p.e(p.this, iterable, oVar, j12);
                        }
                    });
                    this.f57424d.b(oVar, i11 + 1, true);
                    return;
                }
                this.f57426f.g(new a.InterfaceC1382a() { // from class: xh.h
                    {
                        p.this = this;
                    }

                    @Override // zh.a.InterfaceC1382a
                    public final Object execute() {
                        return p.g(p.this, iterable);
                    }
                });
                if (a11.c() == b.a.OK) {
                    j11 = Math.max(j12, a11.b());
                    if (oVar.e()) {
                        this.f57426f.g(new a.InterfaceC1382a() { // from class: xh.g
                            {
                                p.this = this;
                            }

                            @Override // zh.a.InterfaceC1382a
                            public final Object execute() {
                                return p.i(p.this);
                            }
                        });
                    }
                } else if (a11.c() == b.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    for (yh.k kVar3 : iterable) {
                        String j13 = kVar3.b().j();
                        if (!hashMap.containsKey(j13)) {
                            hashMap.put(j13, 1);
                        } else {
                            hashMap.put(j13, Integer.valueOf(((Integer) hashMap.get(j13)).intValue() + 1));
                        }
                    }
                    this.f57426f.g(new a.InterfaceC1382a() { // from class: xh.j
                        {
                            p.this = this;
                        }

                        @Override // zh.a.InterfaceC1382a
                        public final Object execute() {
                            return p.c(p.this, hashMap);
                        }
                    });
                }
            }
            this.f57426f.g(new a.InterfaceC1382a() { // from class: xh.n
                {
                    p.this = this;
                }

                @Override // zh.a.InterfaceC1382a
                public final Object execute() {
                    return p.f(p.this, oVar, j12);
                }
            });
            return;
        }
    }

    public void v(final ph.o oVar, final int i11, final Runnable runnable) {
        this.f57425e.execute(new Runnable() { // from class: xh.e
            {
                p.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                p.a(p.this, oVar, i11, runnable);
            }
        });
    }
}