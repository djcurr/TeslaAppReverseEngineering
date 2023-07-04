package uu;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import h00.l;
import h00.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import lt.j2;
import lt.m1;
import ot.m;
import vz.b0;
import vz.v;
import wz.e0;
import wz.r0;

/* loaded from: classes6.dex */
public final class h implements d {
    private static final com.tesla.logging.g G;
    private p<? super h, ? super ot.f, b0> A;
    private Long B;
    private boolean C;
    private Integer D;
    private final ConcurrentLinkedQueue<String> E;
    private final ConcurrentLinkedDeque<ot.f> F;

    /* renamed from: a */
    private final ot.c f53683a;

    /* renamed from: b */
    private final d f53684b;

    /* renamed from: c */
    private e f53685c;

    /* renamed from: d */
    private final okio.i f53686d;

    /* renamed from: e */
    private final String f53687e;

    /* renamed from: f */
    private final AtomicBoolean f53688f;

    /* renamed from: g */
    private String f53689g;

    /* renamed from: h */
    private String f53690h;

    /* renamed from: i */
    private Boolean f53691i;

    /* renamed from: j */
    private final ConcurrentLinkedDeque<e> f53692j;

    /* renamed from: k */
    private Long f53693k;

    /* renamed from: l */
    private Long f53694l;

    /* renamed from: m */
    private iy.b f53695m;

    /* renamed from: n */
    private ot.h f53696n;

    /* renamed from: o */
    private Integer f53697o;

    /* renamed from: p */
    private String f53698p;

    /* renamed from: q */
    private final AtomicInteger f53699q;

    /* renamed from: r */
    private final AtomicInteger f53700r;

    /* renamed from: s */
    private final AtomicInteger f53701s;

    /* renamed from: t */
    private ot.f f53702t;

    /* renamed from: u */
    private boolean f53703u;

    /* renamed from: v */
    private final AtomicInteger f53704v;

    /* renamed from: w */
    private boolean f53705w;

    /* renamed from: x */
    private Integer f53706x;

    /* renamed from: y */
    private boolean f53707y;

    /* renamed from: z */
    private final List<l<h, b0>> f53708z;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        G = com.tesla.logging.g.f21878b.a("TeslaCommandRequest");
    }

    public h(ot.c request, d listener, e requestId, okio.i iVar, String str) {
        s.g(request, "request");
        s.g(listener, "listener");
        s.g(requestId, "requestId");
        this.f53683a = request;
        this.f53684b = listener;
        this.f53685c = requestId;
        this.f53686d = iVar;
        this.f53687e = str;
        this.f53688f = new AtomicBoolean(false);
        this.f53692j = new ConcurrentLinkedDeque<>();
        this.f53695m = iy.b.e();
        this.f53696n = ot.h.INITIAL_STATE;
        this.f53699q = new AtomicInteger(0);
        this.f53700r = new AtomicInteger(0);
        this.f53701s = new AtomicInteger(0);
        this.f53704v = new AtomicInteger(0);
        this.f53708z = new ArrayList();
        this.E = new ConcurrentLinkedQueue<>();
        this.F = new ConcurrentLinkedDeque<>();
    }

    public static /* synthetic */ void b(h hVar, m mVar) {
        o0(hVar, mVar);
    }

    private final int e0() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static /* synthetic */ h g(h hVar, ot.c cVar, d dVar, e eVar, okio.i iVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar = hVar.f53683a;
        }
        if ((i11 & 2) != 0) {
            dVar = hVar.f53684b;
        }
        d dVar2 = dVar;
        if ((i11 & 4) != 0) {
            eVar = hVar.f53685c;
        }
        e eVar2 = eVar;
        if ((i11 & 8) != 0) {
            iVar = hVar.f53686d;
        }
        okio.i iVar2 = iVar;
        if ((i11 & 16) != 0) {
            str = hVar.f53687e;
        }
        return hVar.f(cVar, dVar2, eVar2, iVar2, str);
    }

    public static /* synthetic */ void n0(h hVar, int i11, m mVar, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        hVar.m0(i11, mVar, z11);
    }

    public static final void o0(h this$0, m transport) {
        s.g(this$0, "this$0");
        s.g(transport, "$transport");
        if (this$0.s()) {
            return;
        }
        this$0.f53707y = true;
        this$0.f53697o = null;
        this$0.f53706x = null;
        this$0.p0(transport);
    }

    private final void p0(m mVar) {
        if (this.f53703u) {
            return;
        }
        this.f53707y = true;
        List<l<h, b0>> list = this.f53708z;
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            ((l) it2.next()).invoke(this);
        }
        list.clear();
        a(new ot.e(n(), C(), null, ot.f.RESULT_TIMEOUT, mVar, 0, null, null, null, null, 996, null));
    }

    public final ot.c A() {
        return this.f53683a;
    }

    public final okio.i B() {
        return this.f53685c.b();
    }

    public final String C() {
        return this.f53685c.d();
    }

    public final Collection<e> D() {
        List z02;
        z02 = e0.z0(this.f53692j, this.f53685c);
        return z02;
    }

    public final int E() {
        return this.f53701s.get();
    }

    public final Collection<ot.f> F() {
        return this.F;
    }

    public final Integer G() {
        return this.D;
    }

    public final boolean H() {
        return this.f53693k != null;
    }

    public final String I() {
        return this.f53689g;
    }

    public final String J() {
        return this.f53698p;
    }

    public final Integer K() {
        return this.f53706x;
    }

    public final boolean L() {
        return this.f53705w;
    }

    public final AtomicInteger M() {
        return this.f53700r;
    }

    public final int N() {
        if (H()) {
            return this.f53700r.get() + 1;
        }
        return 0;
    }

    public final AtomicBoolean O() {
        return this.f53688f;
    }

    public final String P() {
        return this.f53683a.j();
    }

    public final String Q() {
        ot.b c11 = this.f53683a.c();
        String r11 = c11 == null ? null : com.tesla.data.oapi.c.r(c11);
        return r11 == null ? this.f53687e : r11;
    }

    public final int R() {
        return this.f53701s.incrementAndGet();
    }

    public final void S(ot.f fVar) {
        if (fVar != null) {
            this.F.addLast(fVar);
        }
        this.f53692j.add(this.f53685c);
        this.f53700r.incrementAndGet();
        if (fVar != ot.f.RESULT_VEHICLE_NOT_CONNECTED) {
            this.f53699q.incrementAndGet();
        }
        this.f53685c = new e();
    }

    public final Boolean T() {
        return this.f53691i;
    }

    public final boolean U() {
        j2 c11;
        ot.b c12 = this.f53683a.c();
        m1 m1Var = null;
        if (c12 != null && (c11 = c12.c()) != null) {
            m1Var = c11.Q();
        }
        return m1Var != null;
    }

    public final boolean V() {
        ot.b c11 = this.f53683a.c();
        if (c11 == null) {
            return false;
        }
        return com.tesla.data.oapi.c.p(c11);
    }

    public final boolean W() {
        if (this.f53686d == null) {
            ot.b c11 = this.f53683a.c();
            if (!(c11 == null ? false : com.tesla.data.oapi.c.u(c11))) {
                return false;
            }
        }
        return true;
    }

    public final boolean X() {
        return i().i() != null;
    }

    public final boolean Y() {
        ot.b c11 = this.f53683a.c();
        if (c11 == null) {
            return false;
        }
        return com.tesla.data.oapi.c.q(c11);
    }

    public final boolean Z() {
        j2 c11;
        ot.b c12 = this.f53683a.c();
        if (c12 == null || (c11 = c12.c()) == null) {
            return false;
        }
        return (c11.c0() == null && c11.k() == null) ? false : true;
    }

    @Override // uu.d
    public void a(ot.e eVar) {
        boolean w11;
        Map f11;
        ot.e response = eVar;
        s.g(response, "response");
        if (this.f53703u) {
            return;
        }
        if (eVar.h() == ot.f.RESULT_TIMEOUT && (!this.f53708z.isEmpty())) {
            com.tesla.logging.g gVar = G;
            String str = "request " + eVar.f() + " finishing with timeout with waiting timeout listeners";
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(v.a(h11, str));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(str));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a(str, new Object[0]);
        }
        h(eVar.h());
        d dVar = this.f53684b;
        w11 = kotlin.text.v.w(eVar.c());
        if (w11) {
            response = ot.e.b(eVar, n(), null, null, null, null, 0, null, null, null, null, 1022, null);
        }
        dVar.a(response);
    }

    public final boolean a0() {
        j2 c11;
        ot.b c12 = this.f53683a.c();
        if (c12 == null || (c11 = c12.c()) == null) {
            return false;
        }
        return (c11.u0() == null && c11.v() == null) ? false : true;
    }

    public final void b0() {
        if (this.B == null) {
            this.B = Long.valueOf(System.currentTimeMillis());
        }
    }

    public final void c(String breadcrumb) {
        s.g(breadcrumb, "breadcrumb");
        this.E.add(breadcrumb);
    }

    public final void c0() {
        this.f53694l = Long.valueOf(System.currentTimeMillis());
    }

    public final void d(p<? super h, ? super ot.f, b0> listener) {
        s.g(listener, "listener");
        if (this.f53703u) {
            ot.f fVar = this.f53702t;
            if (fVar == null) {
                fVar = ot.f.RESULT_INTERNAL_ERROR;
            }
            listener.invoke(this, fVar);
            return;
        }
        this.A = listener;
    }

    public final void d0() {
        if (this.f53693k != null) {
            return;
        }
        this.f53693k = Long.valueOf(System.currentTimeMillis());
        this.D = Integer.valueOf(r());
    }

    public final void e(l<? super h, b0> listener) {
        s.g(listener, "listener");
        if (this.f53707y) {
            listener.invoke(this);
        } else {
            this.f53708z.add(listener);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (s.c(h.class, obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.tesla.requestmanager.TeslaCommandRequest");
            return s.c(C(), ((h) obj).C());
        }
        return false;
    }

    public final h f(ot.c request, d listener, e requestId, okio.i iVar, String str) {
        s.g(request, "request");
        s.g(listener, "listener");
        s.g(requestId, "requestId");
        return new h(request, listener, requestId, iVar, str);
    }

    public final void f0(ot.h state) {
        s.g(state, "state");
        synchronized (this.f53696n) {
            com.tesla.logging.g gVar = G;
            String m11 = m();
            ot.h t11 = t();
            gVar.i(m11 + " hermes state change: " + t11 + " -> " + state);
            this.f53696n = state;
            b0 b0Var = b0.f54756a;
        }
    }

    public final void g0(m transport) {
        s.g(transport, "transport");
        p0(transport);
    }

    public final void h(ot.f result) {
        Map f11;
        s.g(result, "result");
        if (this.f53703u) {
            com.tesla.logging.g gVar = G;
            String str = "finish called on finished request " + m();
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(v.a(h11, str));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(str));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a(str, new Object[0]);
            return;
        }
        this.f53702t = result;
        this.f53703u = true;
        this.f53695m.dispose();
        this.f53708z.clear();
        p<? super h, ? super ot.f, b0> pVar = this.A;
        if (pVar != null) {
            pVar.invoke(this, result);
        }
        this.A = null;
    }

    public final void h0(boolean z11) {
        this.C = z11;
    }

    public int hashCode() {
        return C().hashCode();
    }

    public final ot.b i() {
        ot.b c11 = this.f53683a.c();
        s.e(c11);
        return c11;
    }

    public final void i0(String str) {
        this.f53690h = str;
    }

    public final Integer j() {
        ot.b c11 = this.f53683a.c();
        if (c11 == null) {
            return null;
        }
        return com.tesla.data.oapi.c.b(c11);
    }

    public final void j0(Boolean bool) {
        this.f53691i = bool;
    }

    public final boolean k() {
        return this.C;
    }

    public final void k0(String str) {
        this.f53689g = str;
    }

    public final Collection<String> l() {
        return this.E;
    }

    public final void l0(String str) {
        this.f53698p = str;
    }

    public final String m() {
        return c.b(this.f53683a);
    }

    public final void m0(int i11, final m transport, boolean z11) {
        s.g(transport, "transport");
        if (z11) {
            this.f53705w = false;
            this.f53695m.dispose();
        } else if (this.f53705w) {
            return;
        }
        this.f53706x = Integer.valueOf(i11);
        this.f53697o = Integer.valueOf(e0());
        this.f53705w = true;
        this.f53695m = hy.b.j(i11, TimeUnit.SECONDS).g(new ky.a() { // from class: uu.g
            @Override // ky.a
            public final void run() {
                h.b(h.this, transport);
            }
        });
    }

    public final String n() {
        return this.f53683a.e();
    }

    public final String o() {
        return this.f53690h;
    }

    public final yt.b p() {
        return c.c(this.f53683a);
    }

    public final Long q() {
        Long l11 = this.f53693k;
        if (l11 == null) {
            return null;
        }
        long longValue = l11.longValue();
        Long l12 = this.f53694l;
        return Long.valueOf((l12 == null ? System.currentTimeMillis() : l12.longValue()) - longValue);
    }

    public final int r() {
        int d11;
        Integer valueOf;
        Integer num = this.f53697o;
        if (num == null) {
            return 0;
        }
        int intValue = num.intValue();
        Integer K = K();
        if (K == null) {
            valueOf = null;
        } else {
            d11 = m00.l.d((intValue + K.intValue()) - e0(), 0);
            valueOf = Integer.valueOf(d11);
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    public final boolean s() {
        return this.f53703u;
    }

    public final ot.h t() {
        return this.f53696n;
    }

    public String toString() {
        ot.c cVar = this.f53683a;
        d dVar = this.f53684b;
        e eVar = this.f53685c;
        okio.i iVar = this.f53686d;
        String str = this.f53687e;
        return "TeslaCommandRequest(request=" + cVar + ", listener=" + dVar + ", requestId=" + eVar + ", remotePublicKey=" + iVar + ", dependentCommandVin=" + str + ")";
    }

    public final Integer u() {
        ot.b c11 = this.f53683a.c();
        if (c11 == null) {
            return null;
        }
        return com.tesla.data.oapi.c.m(c11);
    }

    public final AtomicInteger v() {
        return this.f53704v;
    }

    public final AtomicInteger w() {
        return this.f53699q;
    }

    public final Long x() {
        return this.B;
    }

    public final Long y() {
        return this.f53694l;
    }

    public final okio.i z() {
        return this.f53686d;
    }

    public /* synthetic */ h(ot.c cVar, d dVar, e eVar, okio.i iVar, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, dVar, (i11 & 4) != 0 ? new e() : eVar, (i11 & 8) != 0 ? null : iVar, (i11 & 16) != 0 ? null : str);
    }
}