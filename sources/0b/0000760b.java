package io.grpc.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.VerifyException;
import io.grpc.internal.e2;
import io.grpc.t0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public class c0 extends io.grpc.t0 {
    private static final g A;
    private static String B;

    /* renamed from: s  reason: collision with root package name */
    private static final Logger f30716s = Logger.getLogger(c0.class.getName());

    /* renamed from: t  reason: collision with root package name */
    private static final Set<String> f30717t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));

    /* renamed from: u  reason: collision with root package name */
    private static final String f30718u;

    /* renamed from: v  reason: collision with root package name */
    private static final String f30719v;

    /* renamed from: w  reason: collision with root package name */
    private static final String f30720w;

    /* renamed from: x  reason: collision with root package name */
    static boolean f30721x;

    /* renamed from: y  reason: collision with root package name */
    static boolean f30722y;

    /* renamed from: z  reason: collision with root package name */
    protected static boolean f30723z;

    /* renamed from: a  reason: collision with root package name */
    final io.grpc.y0 f30724a;

    /* renamed from: b  reason: collision with root package name */
    private final Random f30725b = new Random();

    /* renamed from: c  reason: collision with root package name */
    protected volatile b f30726c = d.INSTANCE;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<f> f30727d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private final String f30728e;

    /* renamed from: f  reason: collision with root package name */
    private final String f30729f;

    /* renamed from: g  reason: collision with root package name */
    private final int f30730g;

    /* renamed from: h  reason: collision with root package name */
    private final e2.d<Executor> f30731h;

    /* renamed from: i  reason: collision with root package name */
    private final long f30732i;

    /* renamed from: j  reason: collision with root package name */
    private final io.grpc.h1 f30733j;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.common.base.y f30734k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f30735l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f30736m;

    /* renamed from: n  reason: collision with root package name */
    private Executor f30737n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f30738o;

    /* renamed from: p  reason: collision with root package name */
    private final t0.h f30739p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f30740q;

    /* renamed from: r  reason: collision with root package name */
    private t0.e f30741r;

    /* loaded from: classes5.dex */
    public interface b {
        List<InetAddress> resolveAddress(String str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private io.grpc.f1 f30742a;

        /* renamed from: b  reason: collision with root package name */
        private List<io.grpc.x> f30743b;

        /* renamed from: c  reason: collision with root package name */
        private t0.c f30744c;

        /* renamed from: d  reason: collision with root package name */
        public io.grpc.a f30745d;

        private c() {
        }
    }

    /* loaded from: classes5.dex */
    private enum d implements b {
        INSTANCE;

        @Override // io.grpc.internal.c0.b
        public List<InetAddress> resolveAddress(String str) {
            return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final t0.e f30746a;

        /* loaded from: classes5.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f30748a;

            a(boolean z11) {
                this.f30748a = z11;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f30748a) {
                    c0 c0Var = c0.this;
                    c0Var.f30735l = true;
                    if (c0Var.f30732i > 0) {
                        c0.this.f30734k.f().g();
                    }
                }
                c0.this.f30740q = false;
            }
        }

        e(t0.e eVar) {
            this.f30746a = (t0.e) com.google.common.base.u.p(eVar, "savedListener");
        }

        @Override // java.lang.Runnable
        public void run() {
            io.grpc.h1 h1Var;
            a aVar;
            Logger logger = c0.f30716s;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                c0.f30716s.finer("Attempting DNS resolution of " + c0.this.f30729f);
            }
            c cVar = null;
            boolean z11 = true;
            try {
                try {
                    io.grpc.x n11 = c0.this.n();
                    t0.g.a d11 = t0.g.d();
                    if (n11 != null) {
                        if (c0.f30716s.isLoggable(level)) {
                            c0.f30716s.finer("Using proxy address " + n11);
                        }
                        d11.b(Collections.singletonList(n11));
                    } else {
                        cVar = c0.this.o(false);
                        if (cVar.f30742a != null) {
                            this.f30746a.a(cVar.f30742a);
                            return;
                        }
                        if (cVar.f30743b != null) {
                            d11.b(cVar.f30743b);
                        }
                        if (cVar.f30744c != null) {
                            d11.d(cVar.f30744c);
                        }
                        io.grpc.a aVar2 = cVar.f30745d;
                        if (aVar2 != null) {
                            d11.c(aVar2);
                        }
                    }
                    this.f30746a.c(d11.a());
                    if (cVar == null || cVar.f30742a != null) {
                        z11 = false;
                    }
                    h1Var = c0.this.f30733j;
                    aVar = new a(z11);
                } catch (IOException e11) {
                    this.f30746a.a(io.grpc.f1.f30571o.r("Unable to resolve host " + c0.this.f30729f).q(e11));
                    if (0 == 0 || null.f30742a != null) {
                        z11 = false;
                    }
                    h1Var = c0.this.f30733j;
                    aVar = new a(z11);
                }
                h1Var.execute(aVar);
            } finally {
                if (0 == 0 || null.f30742a != null) {
                    z11 = false;
                }
                c0.this.f30733j.execute(new a(z11));
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface f {
        List<String> a(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface g {
        f a();

        Throwable b();
    }

    static {
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        f30718u = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        f30719v = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f30720w = property3;
        f30721x = Boolean.parseBoolean(property);
        f30722y = Boolean.parseBoolean(property2);
        f30723z = Boolean.parseBoolean(property3);
        A = v(c0.class.getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c0(String str, String str2, t0.b bVar, e2.d<Executor> dVar, com.google.common.base.y yVar, boolean z11) {
        com.google.common.base.u.p(bVar, "args");
        this.f30731h = dVar;
        URI create = URI.create("//" + ((String) com.google.common.base.u.p(str2, "name")));
        com.google.common.base.u.k(create.getHost() != null, "Invalid DNS name: %s", str2);
        this.f30728e = (String) com.google.common.base.u.q(create.getAuthority(), "nameUri (%s) doesn't have an authority", create);
        this.f30729f = create.getHost();
        if (create.getPort() == -1) {
            this.f30730g = bVar.a();
        } else {
            this.f30730g = create.getPort();
        }
        this.f30724a = (io.grpc.y0) com.google.common.base.u.p(bVar.c(), "proxyDetector");
        this.f30732i = s(z11);
        this.f30734k = (com.google.common.base.y) com.google.common.base.u.p(yVar, "stopwatch");
        this.f30733j = (io.grpc.h1) com.google.common.base.u.p(bVar.e(), "syncContext");
        Executor b11 = bVar.b();
        this.f30737n = b11;
        this.f30738o = b11 == null;
        this.f30739p = (t0.h) com.google.common.base.u.p(bVar.d(), "serviceConfigParser");
    }

    private List<io.grpc.x> A() {
        Exception e11 = null;
        try {
            try {
                List<InetAddress> resolveAddress = this.f30726c.resolveAddress(this.f30729f);
                ArrayList arrayList = new ArrayList(resolveAddress.size());
                for (InetAddress inetAddress : resolveAddress) {
                    arrayList.add(new io.grpc.x(new InetSocketAddress(inetAddress, this.f30730g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e12) {
                e11 = e12;
                com.google.common.base.b0.f(e11);
                throw new RuntimeException(e11);
            }
        } catch (Throwable th2) {
            if (e11 != null) {
                f30716s.log(Level.FINE, "Address resolution failure", (Throwable) e11);
            }
            throw th2;
        }
    }

    private t0.c B() {
        List<String> emptyList = Collections.emptyList();
        f u11 = u();
        if (u11 != null) {
            try {
                emptyList = u11.a("_grpc_config." + this.f30729f);
            } catch (Exception e11) {
                f30716s.log(Level.FINE, "ServiceConfig resolution failure", (Throwable) e11);
            }
        }
        if (!emptyList.isEmpty()) {
            t0.c x11 = x(emptyList, this.f30725b, r());
            if (x11 != null) {
                if (x11.d() != null) {
                    return t0.c.b(x11.d());
                }
                return this.f30739p.a((Map) x11.c());
            }
            return null;
        }
        f30716s.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.f30729f});
        return null;
    }

    protected static boolean C(boolean z11, boolean z12, String str) {
        if (z11) {
            if ("localhost".equalsIgnoreCase(str)) {
                return z12;
            }
            if (str.contains(":")) {
                return false;
            }
            boolean z13 = true;
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (charAt != '.') {
                    z13 &= charAt >= '0' && charAt <= '9';
                }
            }
            return true ^ z13;
        }
        return false;
    }

    private boolean m() {
        if (this.f30735l) {
            long j11 = this.f30732i;
            if (j11 != 0 && (j11 <= 0 || this.f30734k.d(TimeUnit.NANOSECONDS) <= this.f30732i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.grpc.x n() {
        io.grpc.x0 a11 = this.f30724a.a(InetSocketAddress.createUnresolved(this.f30729f, this.f30730g));
        if (a11 != null) {
            return new io.grpc.x(a11);
        }
        return null;
    }

    private static final List<String> p(Map<String, ?> map) {
        return a1.g(map, "clientLanguage");
    }

    private static final List<String> q(Map<String, ?> map) {
        return a1.g(map, "clientHostname");
    }

    private static String r() {
        if (B == null) {
            try {
                B = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e11) {
                throw new RuntimeException(e11);
            }
        }
        return B;
    }

    private static long s(boolean z11) {
        if (z11) {
            return 0L;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        long j11 = 30;
        if (property != null) {
            try {
                j11 = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f30716s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
            }
        }
        return j11 > 0 ? TimeUnit.SECONDS.toNanos(j11) : j11;
    }

    private static final Double t(Map<String, ?> map) {
        return a1.h(map, "percentage");
    }

    static g v(ClassLoader classLoader) {
        try {
            try {
                try {
                    g gVar = (g) Class.forName("io.grpc.internal.y0", true, classLoader).asSubclass(g.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (gVar.b() != null) {
                        f30716s.log(Level.FINE, "JndiResourceResolverFactory not available, skipping.", gVar.b());
                        return null;
                    }
                    return gVar;
                } catch (Exception e11) {
                    f30716s.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e11);
                    return null;
                }
            } catch (Exception e12) {
                f30716s.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e12);
                return null;
            }
        } catch (ClassCastException e13) {
            f30716s.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e13);
            return null;
        } catch (ClassNotFoundException e14) {
            f30716s.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e14);
            return null;
        }
    }

    static Map<String, ?> w(Map<String, ?> map, Random random, String str) {
        boolean z11;
        boolean z12;
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            com.google.common.base.d0.a(f30717t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List<String> p11 = p(map);
        if (p11 != null && !p11.isEmpty()) {
            Iterator<String> it2 = p11.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if ("java".equalsIgnoreCase(it2.next())) {
                        z12 = true;
                        break;
                    }
                } else {
                    z12 = false;
                    break;
                }
            }
            if (!z12) {
                return null;
            }
        }
        Double t11 = t(map);
        if (t11 != null) {
            int intValue = t11.intValue();
            com.google.common.base.d0.a(intValue >= 0 && intValue <= 100, "Bad percentage: %s", t11);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List<String> q11 = q(map);
        if (q11 != null && !q11.isEmpty()) {
            Iterator<String> it3 = q11.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (it3.next().equals(str)) {
                        z11 = true;
                        break;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                return null;
            }
        }
        Map<String, ?> j11 = a1.j(map, "serviceConfig");
        if (j11 != null) {
            return j11;
        }
        throw new VerifyException(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    static t0.c x(List<String> list, Random random, String str) {
        try {
            Map<String, ?> map = null;
            for (Map<String, ?> map2 : y(list)) {
                try {
                    map = w(map2, random, str);
                    if (map != null) {
                        break;
                    }
                } catch (RuntimeException e11) {
                    return t0.c.b(io.grpc.f1.f30564h.r("failed to pick service config choice").q(e11));
                }
            }
            if (map == null) {
                return null;
            }
            return t0.c.a(map);
        } catch (IOException | RuntimeException e12) {
            return t0.c.b(io.grpc.f1.f30564h.r("failed to parse TXT records").q(e12));
        }
    }

    static List<Map<String, ?>> y(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.startsWith("grpc_config=")) {
                f30716s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            } else {
                Object a11 = z0.a(str.substring(12));
                if (a11 instanceof List) {
                    arrayList.addAll(a1.a((List) a11));
                } else {
                    throw new ClassCastException("wrong type " + a11);
                }
            }
        }
        return arrayList;
    }

    private void z() {
        if (this.f30740q || this.f30736m || !m()) {
            return;
        }
        this.f30740q = true;
        this.f30737n.execute(new e(this.f30741r));
    }

    @Override // io.grpc.t0
    public String a() {
        return this.f30728e;
    }

    @Override // io.grpc.t0
    public void b() {
        com.google.common.base.u.v(this.f30741r != null, "not started");
        z();
    }

    @Override // io.grpc.t0
    public void c() {
        if (this.f30736m) {
            return;
        }
        this.f30736m = true;
        Executor executor = this.f30737n;
        if (executor == null || !this.f30738o) {
            return;
        }
        this.f30737n = (Executor) e2.f(this.f30731h, executor);
    }

    @Override // io.grpc.t0
    public void d(t0.e eVar) {
        com.google.common.base.u.v(this.f30741r == null, "already started");
        if (this.f30738o) {
            this.f30737n = (Executor) e2.d(this.f30731h);
        }
        this.f30741r = (t0.e) com.google.common.base.u.p(eVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        z();
    }

    protected c o(boolean z11) {
        c cVar = new c();
        try {
            cVar.f30743b = A();
        } catch (Exception e11) {
            if (!z11) {
                io.grpc.f1 f1Var = io.grpc.f1.f30571o;
                cVar.f30742a = f1Var.r("Unable to resolve host " + this.f30729f).q(e11);
                return cVar;
            }
        }
        if (f30723z) {
            cVar.f30744c = B();
        }
        return cVar;
    }

    protected f u() {
        g gVar;
        if (C(f30721x, f30722y, this.f30729f)) {
            f fVar = this.f30727d.get();
            return (fVar != null || (gVar = A) == null) ? fVar : gVar.a();
        }
        return null;
    }
}