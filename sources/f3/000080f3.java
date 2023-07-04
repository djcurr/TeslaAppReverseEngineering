package ku;

import ch.qos.logback.classic.spi.CallerData;
import com.google.firebase.perf.metrics.Trace;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kn.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import tt.l;
import vz.b0;
import wz.e0;
import wz.s0;

/* loaded from: classes6.dex */
public final class g implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final a f35886f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    private static final com.tesla.logging.g f35887g = com.tesla.logging.g.f21878b.a("MonitoringService");

    /* renamed from: h  reason: collision with root package name */
    private static e f35888h;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<l, Trace> f35889b;

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<String, gn.b> f35890c;

    /* renamed from: d  reason: collision with root package name */
    private final ReentrantLock f35891d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Map<l, i>> f35892e;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            if (g.f35888h == null) {
                synchronized (this) {
                    if (g.f35888h == null) {
                        a aVar = g.f35886f;
                        g.f35888h = new g(null);
                    }
                    b0 b0Var = b0.f54756a;
                }
            }
            e eVar = g.f35888h;
            s.e(eVar);
            return eVar;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements i {

        /* renamed from: a  reason: collision with root package name */
        private final Trace f35893a;

        /* renamed from: b  reason: collision with root package name */
        private final String f35894b;

        public b(Trace firebaseTrace, String trace) {
            s.g(firebaseTrace, "firebaseTrace");
            s.g(trace, "trace");
            this.f35893a = firebaseTrace;
            this.f35894b = trace;
        }

        @Override // ku.i
        public void a(List<ku.a> attributes) {
            List<ku.a> H0;
            s.g(attributes, "attributes");
            H0 = e0.H0(attributes, 5);
            for (ku.a aVar : H0) {
                ku.b.a(this.f35893a, aVar);
            }
            this.f35893a.stop();
            com.tesla.logging.g gVar = g.f35887g;
            String str = this.f35894b;
            gVar.i("Token trace `" + str + "` ended");
        }
    }

    private g() {
        this.f35889b = new ConcurrentHashMap<>();
        this.f35890c = new ConcurrentHashMap<>();
        this.f35891d = new ReentrantLock();
        this.f35892e = new LinkedHashMap();
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final String p(String str) {
        String X0;
        X0 = w.X0(str, CallerData.NA, null, 2, null);
        return X0;
    }

    @Override // ku.e
    public void a(l trace, String forVIN, List<ku.a> attributes) {
        s.g(trace, "trace");
        s.g(forVIN, "forVIN");
        s.g(attributes, "attributes");
        Map<l, i> map = this.f35892e.get(forVIN);
        boolean z11 = false;
        if (map != null && map.containsKey(trace)) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        ReentrantLock reentrantLock = this.f35891d;
        reentrantLock.lock();
        try {
            i f11 = f(trace, attributes);
            Map<l, i> map2 = this.f35892e.get(forVIN);
            if (map2 == null) {
                map2 = new LinkedHashMap<>();
            }
            map2.put(trace, f11);
            this.f35892e.put(forVIN, map2);
            f35887g.i("Started, `" + trace);
            b0 b0Var = b0.f54756a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ku.e
    public f b(String url, tt.e method, long j11) {
        s.g(url, "url");
        s.g(method, "method");
        String a11 = c.a(method);
        String p11 = p(url);
        gn.b bVar = new gn.b(p11, a11, k.k(), new com.google.firebase.perf.util.h());
        bVar.b(j11);
        bVar.e();
        com.tesla.logging.g gVar = f35887g;
        gVar.i("Network trace started for " + p11 + " " + a11);
        return new h(bVar, p11, a11);
    }

    @Override // ku.e
    public void c(l matching) {
        LinkedHashMap linkedHashMap;
        boolean z11;
        s.g(matching, "matching");
        ReentrantLock reentrantLock = this.f35891d;
        reentrantLock.lock();
        try {
            for (String str : this.f35892e.keySet()) {
                Map<l, i> map = this.f35892e.get(str);
                Map<l, i> map2 = null;
                if (map == null) {
                    linkedHashMap = null;
                } else {
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<l, i> entry : map.entrySet()) {
                        if (entry.getKey() == matching) {
                            f35887g.i("Cancelled, `" + matching + "`");
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                Map<String, Map<l, i>> map3 = this.f35892e;
                if (linkedHashMap != null) {
                    map2 = s0.y(linkedHashMap);
                }
                if (map2 == null) {
                    map2 = new LinkedHashMap<>();
                }
                map3.put(str, map2);
            }
            b0 b0Var = b0.f54756a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ku.e
    public void e(l trace, List<ku.a> attributes, List<tt.i> metrics) {
        List<ku.a> H0;
        s.g(trace, "trace");
        s.g(attributes, "attributes");
        s.g(metrics, "metrics");
        Trace remove = this.f35889b.remove(trace);
        if (remove == null) {
            com.tesla.logging.g gVar = f35887g;
            gVar.i("No firebase trace `" + trace + "` found for trace");
            return;
        }
        H0 = e0.H0(attributes, 5);
        for (ku.a aVar : H0) {
            ku.b.a(remove, aVar);
        }
        for (tt.i iVar : metrics) {
            remove.incrementMetric(iVar.c().name(), iVar.d());
        }
        remove.stop();
        com.tesla.logging.g gVar2 = f35887g;
        gVar2.i("Trace `" + trace + "` ended");
    }

    @Override // ku.e
    public i f(l trace, List<ku.a> attributes) {
        List<ku.a> H0;
        s.g(trace, "trace");
        s.g(attributes, "attributes");
        Trace c11 = Trace.c(ku.b.b(trace.name()));
        s.f(c11, "create(trace.name.toFirebaseFormat())");
        H0 = e0.H0(attributes, 5);
        for (ku.a aVar : H0) {
            c11.putAttribute(aVar.a(), aVar.b());
        }
        c11.start();
        com.tesla.logging.g gVar = f35887g;
        gVar.i("Token trace `" + trace + "` started");
        return new b(c11, trace.toString());
    }

    @Override // ku.e
    public void g(l trace, String forVIN, List<ku.a> attributes) {
        LinkedHashMap linkedHashMap;
        boolean z11;
        s.g(trace, "trace");
        s.g(forVIN, "forVIN");
        s.g(attributes, "attributes");
        ReentrantLock reentrantLock = this.f35891d;
        reentrantLock.lock();
        try {
            Map<l, i> map = this.f35892e.get(forVIN);
            Map<l, i> map2 = null;
            if (map == null) {
                linkedHashMap = null;
            } else {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry<l, i> entry : map.entrySet()) {
                    if (entry.getKey() == trace) {
                        entry.getValue().a(attributes);
                        f35887g.i("Stopped, `" + trace);
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            Map<String, Map<l, i>> map3 = this.f35892e;
            if (linkedHashMap != null) {
                map2 = s0.y(linkedHashMap);
            }
            if (map2 == null) {
                map2 = new LinkedHashMap<>();
            }
            map3.put(forVIN, map2);
            b0 b0Var = b0.f54756a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ku.e
    public void h(l trace) {
        s.g(trace, "trace");
        if (this.f35889b.remove(trace) != null) {
            com.tesla.logging.g gVar = f35887g;
            gVar.i("Trace `" + trace + "` cancelled");
        }
    }

    @Override // ku.e
    public void i(tt.g trace) {
        s.g(trace, "trace");
        String p11 = p(trace.e());
        gn.b bVar = new gn.b(p11, c.a(trace.c()), k.k(), new com.google.firebase.perf.util.h());
        bVar.b(trace.d());
        bVar.e();
        this.f35890c.put(p11, bVar);
        com.tesla.logging.g gVar = f35887g;
        gVar.i("HTTP trace `" + p11 + "` started");
    }

    @Override // ku.e
    public void j(l trace, List<ku.a> attributes) {
        List<ku.a> H0;
        s.g(trace, "trace");
        s.g(attributes, "attributes");
        h(trace);
        Trace c11 = Trace.c(ku.b.b(trace.name()));
        s.f(c11, "create(trace.name.toFirebaseFormat())");
        H0 = e0.H0(attributes, 5);
        for (ku.a aVar : H0) {
            c11.putAttribute(aVar.a(), aVar.b());
        }
        c11.start();
        this.f35889b.put(trace, c11);
        com.tesla.logging.g gVar = f35887g;
        gVar.i("Trace `" + trace + "` started");
    }

    @Override // ku.e
    public void k(tt.f trace) {
        s.g(trace, "trace");
        String p11 = p(trace.f());
        gn.b remove = this.f35890c.remove(p11);
        if (remove == null) {
            com.tesla.logging.g gVar = f35887g;
            gVar.i("No HTTP metric found for trace `" + p11 + "`");
            return;
        }
        remove.a(trace.c());
        remove.d(trace.e());
        remove.c(trace.d());
        remove.f();
        com.tesla.logging.g gVar2 = f35887g;
        gVar2.i("HTTP trace `" + trace + "` ended");
    }

    @Override // ku.e
    public void l(tt.h metric, long j11) {
        s.g(metric, "metric");
        String a11 = lu.b.a(metric);
        for (Map.Entry<l, Trace> entry : this.f35889b.entrySet()) {
            entry.getValue().incrementMetric(a11, j11);
        }
        com.tesla.logging.g gVar = f35887g;
        gVar.a("Incremented all traces with " + a11);
    }
}