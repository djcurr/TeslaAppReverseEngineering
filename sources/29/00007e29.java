package kn;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class k implements a.b {

    /* renamed from: t */
    private static final fn.a f34859t = fn.a.e();

    /* renamed from: w */
    private static final k f34860w = new k();

    /* renamed from: a */
    private final Map<String, Integer> f34861a;

    /* renamed from: d */
    private com.google.firebase.d f34864d;

    /* renamed from: e */
    private cn.c f34865e;

    /* renamed from: f */
    private tm.e f34866f;

    /* renamed from: g */
    private sm.b<nh.g> f34867g;

    /* renamed from: h */
    private b f34868h;

    /* renamed from: j */
    private Context f34870j;

    /* renamed from: k */
    private com.google.firebase.perf.config.a f34871k;

    /* renamed from: l */
    private d f34872l;

    /* renamed from: m */
    private com.google.firebase.perf.application.a f34873m;

    /* renamed from: n */
    private ApplicationInfo.b f34874n;

    /* renamed from: o */
    private String f34875o;

    /* renamed from: p */
    private String f34876p;

    /* renamed from: b */
    private final ConcurrentLinkedQueue<c> f34862b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    private final AtomicBoolean f34863c = new AtomicBoolean(false);

    /* renamed from: q */
    private boolean f34877q = false;

    /* renamed from: i */
    private ExecutorService f34869i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f34861a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    private PerfMetric D(PerfMetric.b bVar, com.google.firebase.perf.v1.b bVar2) {
        G();
        ApplicationInfo.b l11 = this.f34874n.l(bVar2);
        if (bVar.hasTraceMetric() || bVar.hasNetworkRequestMetric()) {
            l11 = l11.mo112clone().b(j());
        }
        return bVar.a(l11).build();
    }

    public void E() {
        Context j11 = this.f34864d.j();
        this.f34870j = j11;
        this.f34875o = j11.getPackageName();
        this.f34871k = com.google.firebase.perf.config.a.f();
        this.f34872l = new d(this.f34870j, new com.google.firebase.perf.util.f(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f34873m = com.google.firebase.perf.application.a.b();
        this.f34868h = new b(this.f34867g, this.f34871k.a());
        h();
    }

    private void F(PerfMetric.b bVar, com.google.firebase.perf.v1.b bVar2) {
        if (!u()) {
            if (s(bVar)) {
                f34859t.b("Transport is not initialized yet, %s will be queued for to be dispatched later", n(bVar));
                this.f34862b.add(new c(bVar, bVar2));
                return;
            }
            return;
        }
        PerfMetric D = D(bVar, bVar2);
        if (t(D)) {
            g(D);
            SessionManager.getInstance().updatePerfSessionIfExpired();
        }
    }

    private void G() {
        if (this.f34871k.I()) {
            if (!this.f34874n.a() || this.f34877q) {
                String str = null;
                try {
                    str = (String) Tasks.await(this.f34866f.getId(), 60000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e11) {
                    f34859t.d("Task to retrieve Installation Id is interrupted: %s", e11.getMessage());
                } catch (ExecutionException e12) {
                    f34859t.d("Unable to retrieve Installation Id: %s", e12.getMessage());
                } catch (TimeoutException e13) {
                    f34859t.d("Task to retrieve Installation Id is timed out: %s", e13.getMessage());
                }
                if (!TextUtils.isEmpty(str)) {
                    this.f34874n.k(str);
                } else {
                    f34859t.j("Firebase Installation Id is empty, contact Firebase Support for debugging.");
                }
            }
        }
    }

    private void H() {
        if (this.f34865e == null && u()) {
            this.f34865e = cn.c.c();
        }
    }

    public static /* synthetic */ void b(k kVar) {
        kVar.E();
    }

    public static /* synthetic */ void c(k kVar, c cVar) {
        kVar.v(cVar);
    }

    public static /* synthetic */ void d(k kVar) {
        kVar.z();
    }

    private void g(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            f34859t.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", n(perfMetric), i(perfMetric.getTraceMetric()));
        } else {
            f34859t.g("Logging %s", n(perfMetric));
        }
        this.f34868h.b(perfMetric);
    }

    private void h() {
        this.f34873m.k(new WeakReference<>(f34860w));
        ApplicationInfo.b newBuilder = ApplicationInfo.newBuilder();
        this.f34874n = newBuilder;
        newBuilder.m(this.f34864d.m().c()).c(AndroidApplicationInfo.newBuilder().k(this.f34875o).l(cn.a.f9283b).m(p(this.f34870j)));
        this.f34863c.set(true);
        while (!this.f34862b.isEmpty()) {
            final c poll = this.f34862b.poll();
            if (poll != null) {
                this.f34869i.execute(new Runnable() { // from class: kn.j
                    {
                        k.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        k.c(k.this, poll);
                    }
                });
            }
        }
    }

    private String i(TraceMetric traceMetric) {
        String name = traceMetric.getName();
        if (name.startsWith("_st_")) {
            return fn.b.c(this.f34876p, this.f34875o, name);
        }
        return fn.b.a(this.f34876p, this.f34875o, name);
    }

    private Map<String, String> j() {
        H();
        cn.c cVar = this.f34865e;
        if (cVar != null) {
            return cVar.b();
        }
        return Collections.emptyMap();
    }

    public static k k() {
        return f34860w;
    }

    private static String l(GaugeMetric gaugeMetric) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(gaugeMetric.hasGaugeMetadata()), Integer.valueOf(gaugeMetric.getCpuMetricReadingsCount()), Integer.valueOf(gaugeMetric.getAndroidMemoryReadingsCount()));
    }

    private static String m(NetworkRequestMetric networkRequestMetric) {
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", networkRequestMetric.getUrl(), networkRequestMetric.hasHttpResponseCode() ? String.valueOf(networkRequestMetric.getHttpResponseCode()) : "UNKNOWN", new DecimalFormat("#.####").format((networkRequestMetric.hasTimeToResponseCompletedUs() ? networkRequestMetric.getTimeToResponseCompletedUs() : 0L) / 1000.0d));
    }

    private static String n(com.google.firebase.perf.v1.d dVar) {
        if (dVar.hasTraceMetric()) {
            return o(dVar.getTraceMetric());
        }
        if (dVar.hasNetworkRequestMetric()) {
            return m(dVar.getNetworkRequestMetric());
        }
        return dVar.hasGaugeMetric() ? l(dVar.getGaugeMetric()) : "log";
    }

    private static String o(TraceMetric traceMetric) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", traceMetric.getName(), new DecimalFormat("#.####").format(traceMetric.getDurationUs() / 1000.0d));
    }

    private static String p(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private void q(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            this.f34873m.e(com.google.firebase.perf.util.b.TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        } else if (perfMetric.hasNetworkRequestMetric()) {
            this.f34873m.e(com.google.firebase.perf.util.b.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    private boolean s(com.google.firebase.perf.v1.d dVar) {
        int intValue = this.f34861a.get("KEY_AVAILABLE_TRACES_FOR_CACHING").intValue();
        int intValue2 = this.f34861a.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING").intValue();
        int intValue3 = this.f34861a.get("KEY_AVAILABLE_GAUGES_FOR_CACHING").intValue();
        if (dVar.hasTraceMetric() && intValue > 0) {
            this.f34861a.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            return true;
        } else if (dVar.hasNetworkRequestMetric() && intValue2 > 0) {
            this.f34861a.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            return true;
        } else if (dVar.hasGaugeMetric() && intValue3 > 0) {
            this.f34861a.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            return true;
        } else {
            f34859t.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", n(dVar), Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3));
            return false;
        }
    }

    private boolean t(PerfMetric perfMetric) {
        if (!this.f34871k.I()) {
            f34859t.g("Performance collection is not enabled, dropping %s", n(perfMetric));
            return false;
        } else if (!perfMetric.getApplicationInfo().hasAppInstanceId()) {
            f34859t.k("App Instance ID is null or empty, dropping %s", n(perfMetric));
            return false;
        } else if (!hn.e.b(perfMetric, this.f34870j)) {
            f34859t.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", n(perfMetric));
            return false;
        } else if (!this.f34872l.g(perfMetric)) {
            q(perfMetric);
            f34859t.g("Event dropped due to device sampling - %s", n(perfMetric));
            return false;
        } else if (this.f34872l.f(perfMetric)) {
            q(perfMetric);
            f34859t.g("Rate limited (per device) - %s", n(perfMetric));
            return false;
        } else {
            return true;
        }
    }

    public /* synthetic */ void v(c cVar) {
        F(cVar.f34827a, cVar.f34828b);
    }

    public /* synthetic */ void w(TraceMetric traceMetric, com.google.firebase.perf.v1.b bVar) {
        F(PerfMetric.newBuilder().d(traceMetric), bVar);
    }

    public /* synthetic */ void x(NetworkRequestMetric networkRequestMetric, com.google.firebase.perf.v1.b bVar) {
        F(PerfMetric.newBuilder().c(networkRequestMetric), bVar);
    }

    public /* synthetic */ void y(GaugeMetric gaugeMetric, com.google.firebase.perf.v1.b bVar) {
        F(PerfMetric.newBuilder().b(gaugeMetric), bVar);
    }

    public /* synthetic */ void z() {
        this.f34872l.a(this.f34877q);
    }

    public void A(final GaugeMetric gaugeMetric, final com.google.firebase.perf.v1.b bVar) {
        this.f34869i.execute(new Runnable() { // from class: kn.g
            @Override // java.lang.Runnable
            public final void run() {
                k.this.y(gaugeMetric, bVar);
            }
        });
    }

    public void B(final NetworkRequestMetric networkRequestMetric, final com.google.firebase.perf.v1.b bVar) {
        this.f34869i.execute(new Runnable() { // from class: kn.h
            @Override // java.lang.Runnable
            public final void run() {
                k.this.x(networkRequestMetric, bVar);
            }
        });
    }

    public void C(final TraceMetric traceMetric, final com.google.firebase.perf.v1.b bVar) {
        this.f34869i.execute(new Runnable() { // from class: kn.i
            @Override // java.lang.Runnable
            public final void run() {
                k.this.w(traceMetric, bVar);
            }
        });
    }

    @Override // com.google.firebase.perf.application.a.b
    public void onUpdateAppState(com.google.firebase.perf.v1.b bVar) {
        this.f34877q = bVar == com.google.firebase.perf.v1.b.FOREGROUND;
        if (u()) {
            this.f34869i.execute(new Runnable() { // from class: kn.f
                {
                    k.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    k.d(k.this);
                }
            });
        }
    }

    public void r(com.google.firebase.d dVar, tm.e eVar, sm.b<nh.g> bVar) {
        this.f34864d = dVar;
        this.f34876p = dVar.m().e();
        this.f34866f = eVar;
        this.f34867g = bVar;
        this.f34869i.execute(new Runnable() { // from class: kn.e
            {
                k.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                k.b(k.this);
            }
        });
    }

    public boolean u() {
        return this.f34863c.get();
    }
}