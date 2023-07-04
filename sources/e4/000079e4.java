package io.sentry;

import com.swmansion.reanimated.BuildConfig;
import io.sentry.g3;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private String f32579a;

    /* renamed from: b  reason: collision with root package name */
    private String f32580b;

    /* renamed from: c  reason: collision with root package name */
    private String f32581c;

    /* renamed from: d  reason: collision with root package name */
    private String f32582d;

    /* renamed from: e  reason: collision with root package name */
    private String f32583e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f32584f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f32585g;

    /* renamed from: h  reason: collision with root package name */
    private Boolean f32586h;

    /* renamed from: i  reason: collision with root package name */
    private Double f32587i;

    /* renamed from: k  reason: collision with root package name */
    private g3.c f32589k;

    /* renamed from: p  reason: collision with root package name */
    private String f32594p;

    /* renamed from: q  reason: collision with root package name */
    private Long f32595q;

    /* renamed from: s  reason: collision with root package name */
    private Boolean f32597s;

    /* renamed from: t  reason: collision with root package name */
    private Boolean f32598t;

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, String> f32588j = new ConcurrentHashMap();

    /* renamed from: l  reason: collision with root package name */
    private final List<String> f32590l = new CopyOnWriteArrayList();

    /* renamed from: m  reason: collision with root package name */
    private final List<String> f32591m = new CopyOnWriteArrayList();

    /* renamed from: n  reason: collision with root package name */
    private final List<String> f32592n = new CopyOnWriteArrayList();

    /* renamed from: o  reason: collision with root package name */
    private final List<String> f32593o = new CopyOnWriteArrayList();

    /* renamed from: r  reason: collision with root package name */
    private final Set<Class<? extends Throwable>> f32596r = new CopyOnWriteArraySet();

    /* JADX WARN: Multi-variable type inference failed */
    public static s f(nz.f fVar, d0 d0Var) {
        s sVar = new s();
        sVar.C(fVar.getProperty("dsn"));
        sVar.F(fVar.getProperty("environment"));
        sVar.L(fVar.getProperty("release"));
        sVar.B(fVar.getProperty("dist"));
        sVar.N(fVar.getProperty("servername"));
        sVar.E(fVar.d("uncaught.handler.enabled"));
        sVar.I(fVar.d("uncaught.handler.print-stacktrace"));
        sVar.P(fVar.b("traces-sample-rate"));
        sVar.A(fVar.d(BuildConfig.BUILD_TYPE));
        sVar.D(fVar.d("enable-deduplication"));
        sVar.M(fVar.d("send-client-reports"));
        String property = fVar.getProperty("max-request-body-size");
        if (property != null) {
            sVar.H(g3.d.valueOf(property.toUpperCase(Locale.ROOT)));
        }
        for (Map.Entry<String, String> entry : fVar.getMap("tags").entrySet()) {
            sVar.O(entry.getKey(), entry.getValue());
        }
        String property2 = fVar.getProperty("proxy.host");
        String property3 = fVar.getProperty("proxy.user");
        String property4 = fVar.getProperty("proxy.pass");
        String c11 = fVar.c("proxy.port", "80");
        if (property2 != null) {
            sVar.K(new g3.c(property2, c11, property3, property4));
        }
        for (String str : fVar.getList("in-app-includes")) {
            sVar.d(str);
        }
        for (String str2 : fVar.getList("in-app-excludes")) {
            sVar.c(str2);
        }
        for (String str3 : fVar.getList("tracing-origins")) {
            sVar.e(str3);
        }
        for (String str4 : fVar.getList("context-tags")) {
            sVar.a(str4);
        }
        sVar.J(fVar.getProperty("proguard-uuid"));
        sVar.G(fVar.a("idle-timeout"));
        for (String str5 : fVar.getList("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str5);
                if (Throwable.class.isAssignableFrom(cls)) {
                    sVar.b(cls);
                } else {
                    d0Var.c(f3.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str5, str5);
                }
            } catch (ClassNotFoundException unused) {
                d0Var.c(f3.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str5, str5);
            }
        }
        return sVar;
    }

    public void A(Boolean bool) {
        this.f32585g = bool;
    }

    public void B(String str) {
        this.f32582d = str;
    }

    public void C(String str) {
        this.f32579a = str;
    }

    public void D(Boolean bool) {
        this.f32586h = bool;
    }

    public void E(Boolean bool) {
        this.f32584f = bool;
    }

    public void F(String str) {
        this.f32580b = str;
    }

    public void G(Long l11) {
        this.f32595q = l11;
    }

    public void H(g3.d dVar) {
    }

    public void I(Boolean bool) {
        this.f32597s = bool;
    }

    public void J(String str) {
        this.f32594p = str;
    }

    public void K(g3.c cVar) {
        this.f32589k = cVar;
    }

    public void L(String str) {
        this.f32581c = str;
    }

    public void M(Boolean bool) {
        this.f32598t = bool;
    }

    public void N(String str) {
        this.f32583e = str;
    }

    public void O(String str, String str2) {
        this.f32588j.put(str, str2);
    }

    public void P(Double d11) {
        this.f32587i = d11;
    }

    public void a(String str) {
        this.f32593o.add(str);
    }

    public void b(Class<? extends Throwable> cls) {
        this.f32596r.add(cls);
    }

    public void c(String str) {
        this.f32590l.add(str);
    }

    public void d(String str) {
        this.f32591m.add(str);
    }

    public void e(String str) {
        this.f32592n.add(str);
    }

    public List<String> g() {
        return this.f32593o;
    }

    public Boolean h() {
        return this.f32585g;
    }

    public String i() {
        return this.f32582d;
    }

    public String j() {
        return this.f32579a;
    }

    public Boolean k() {
        return this.f32586h;
    }

    public Boolean l() {
        return this.f32584f;
    }

    public String m() {
        return this.f32580b;
    }

    public Long n() {
        return this.f32595q;
    }

    public Set<Class<? extends Throwable>> o() {
        return this.f32596r;
    }

    public List<String> p() {
        return this.f32590l;
    }

    public List<String> q() {
        return this.f32591m;
    }

    public Boolean r() {
        return this.f32597s;
    }

    public String s() {
        return this.f32594p;
    }

    public g3.c t() {
        return this.f32589k;
    }

    public String u() {
        return this.f32581c;
    }

    public Boolean v() {
        return this.f32598t;
    }

    public String w() {
        return this.f32583e;
    }

    public Map<String, String> x() {
        return this.f32588j;
    }

    public Double y() {
        return this.f32587i;
    }

    public List<String> z() {
        return this.f32592n;
    }
}