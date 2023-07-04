package gn;

import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfSession;
import in.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kn.k;

/* loaded from: classes2.dex */
public final class c extends com.google.firebase.perf.application.b implements jn.b {

    /* renamed from: i  reason: collision with root package name */
    private static final fn.a f28039i = fn.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final List<jn.a> f28040a;

    /* renamed from: b  reason: collision with root package name */
    private final GaugeManager f28041b;

    /* renamed from: c  reason: collision with root package name */
    private final k f28042c;

    /* renamed from: d  reason: collision with root package name */
    private final NetworkRequestMetric.b f28043d;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference<jn.b> f28044e;

    /* renamed from: f  reason: collision with root package name */
    private String f28045f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f28046g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f28047h;

    private c(k kVar) {
        this(kVar, com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public static c c(k kVar) {
        return new c(kVar);
    }

    private boolean g() {
        return this.f28043d.f();
    }

    private boolean h() {
        return this.f28043d.h();
    }

    private static boolean i(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // jn.b
    public void a(jn.a aVar) {
        if (aVar == null) {
            f28039i.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (!g() || h()) {
        } else {
            this.f28040a.add(aVar);
        }
    }

    public NetworkRequestMetric b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f28044e);
        unregisterForAppState();
        PerfSession[] b11 = jn.a.b(d());
        if (b11 != null) {
            this.f28043d.b(Arrays.asList(b11));
        }
        NetworkRequestMetric build = this.f28043d.build();
        if (!d.c(this.f28045f)) {
            f28039i.a("Dropping network request from a 'User-Agent' that is not allowed");
            return build;
        } else if (!this.f28046g) {
            this.f28042c.B(build, getAppState());
            this.f28046g = true;
            return build;
        } else {
            if (this.f28047h) {
                f28039i.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return build;
        }
    }

    List<jn.a> d() {
        List<jn.a> unmodifiableList;
        synchronized (this.f28040a) {
            ArrayList arrayList = new ArrayList();
            for (jn.a aVar : this.f28040a) {
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    public long e() {
        return this.f28043d.e();
    }

    public boolean f() {
        return this.f28043d.g();
    }

    public c j(Map<String, String> map) {
        this.f28043d.c().i(map);
        return this;
    }

    public c k(String str) {
        if (str != null) {
            NetworkRequestMetric.d dVar = NetworkRequestMetric.d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c11 = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c11 = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c11 = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c11 = '\b';
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    dVar = NetworkRequestMetric.d.OPTIONS;
                    break;
                case 1:
                    dVar = NetworkRequestMetric.d.GET;
                    break;
                case 2:
                    dVar = NetworkRequestMetric.d.PUT;
                    break;
                case 3:
                    dVar = NetworkRequestMetric.d.HEAD;
                    break;
                case 4:
                    dVar = NetworkRequestMetric.d.POST;
                    break;
                case 5:
                    dVar = NetworkRequestMetric.d.PATCH;
                    break;
                case 6:
                    dVar = NetworkRequestMetric.d.TRACE;
                    break;
                case 7:
                    dVar = NetworkRequestMetric.d.CONNECT;
                    break;
                case '\b':
                    dVar = NetworkRequestMetric.d.DELETE;
                    break;
            }
            this.f28043d.k(dVar);
        }
        return this;
    }

    public c l(int i11) {
        this.f28043d.l(i11);
        return this;
    }

    public void m() {
        this.f28047h = true;
    }

    public c n() {
        this.f28043d.m(NetworkRequestMetric.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    public c o(long j11) {
        this.f28043d.n(j11);
        return this;
    }

    public c p(long j11) {
        jn.a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f28044e);
        this.f28043d.j(j11);
        a(perfSession);
        if (perfSession.f()) {
            this.f28041b.collectGaugeMetricOnce(perfSession.d());
        }
        return this;
    }

    public c q(String str) {
        if (str == null) {
            this.f28043d.d();
            return this;
        }
        if (i(str)) {
            this.f28043d.o(str);
        } else {
            fn.a aVar = f28039i;
            aVar.j("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    public c r(long j11) {
        this.f28043d.p(j11);
        return this;
    }

    public c s(long j11) {
        this.f28043d.q(j11);
        return this;
    }

    public c t(long j11) {
        this.f28043d.r(j11);
        if (SessionManager.getInstance().perfSession().f()) {
            this.f28041b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }

    public c u(long j11) {
        this.f28043d.s(j11);
        return this;
    }

    public c v(String str) {
        if (str != null) {
            this.f28043d.t(com.google.firebase.perf.util.k.e(com.google.firebase.perf.util.k.d(str), 2000));
        }
        return this;
    }

    public c w(String str) {
        this.f28045f = str;
        return this;
    }

    public c(k kVar, com.google.firebase.perf.application.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f28043d = NetworkRequestMetric.newBuilder();
        this.f28044e = new WeakReference<>(this);
        this.f28042c = kVar;
        this.f28041b = gaugeManager;
        this.f28040a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}