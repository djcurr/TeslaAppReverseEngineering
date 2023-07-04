package vu;

import com.tesla.logging.g;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import ot.m;

/* loaded from: classes6.dex */
public final class b implements vu.a {

    /* renamed from: e  reason: collision with root package name */
    private static final g f54619e;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<String, vu.c> f54620b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<String, vu.c> f54621c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentHashMap<m, C1232b> f54622d;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vu.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1232b {

        /* renamed from: a  reason: collision with root package name */
        private final ConcurrentSkipListSet<String> f54623a = new ConcurrentSkipListSet<>();

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentSkipListSet<String> f54624b = new ConcurrentSkipListSet<>();

        public final ConcurrentSkipListSet<String> a() {
            return this.f54624b;
        }

        public final ConcurrentSkipListSet<String> b() {
            return this.f54623a;
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f54625a;

        static {
            int[] iArr = new int[yt.b.values().length];
            iArr[yt.b.DOMAIN_VEHICLE_SECURITY.ordinal()] = 1;
            iArr[yt.b.DOMAIN_INFOTAINMENT.ordinal()] = 2;
            iArr[yt.b.DOMAIN_AUTHD.ordinal()] = 3;
            iArr[yt.b.DOMAIN_BROADCAST.ordinal()] = 4;
            iArr[yt.b.DOMAIN_ENERGY_DEVICE.ordinal()] = 5;
            iArr[yt.b.DOMAIN_ENERGY_DEVICE_AUTH.ordinal()] = 6;
            f54625a = iArr;
        }
    }

    static {
        new a(null);
        f54619e = g.f21878b.a("TeslaSessionManager");
    }

    public b() {
        ConcurrentHashMap<m, C1232b> concurrentHashMap = new ConcurrentHashMap<>();
        this.f54622d = concurrentHashMap;
        concurrentHashMap.put(m.TRANSPORT_BLUETOOTH, new C1232b());
        concurrentHashMap.put(m.TRANSPORT_HERMES, new C1232b());
    }

    private final Set<String> g(yt.b bVar, m mVar) {
        C1232b c1232b = this.f54622d.get(mVar);
        if (c1232b == null) {
            return new LinkedHashSet();
        }
        switch (c.f54625a[bVar.ordinal()]) {
            case 1:
                return c1232b.b();
            case 2:
                return c1232b.a();
            case 3:
            case 4:
            case 5:
            case 6:
                return new LinkedHashSet();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final Map<String, vu.c> h(yt.b bVar) {
        switch (c.f54625a[bVar.ordinal()]) {
            case 1:
                return this.f54620b;
            case 2:
                return this.f54621c;
            case 3:
            case 4:
            case 5:
            case 6:
                return new LinkedHashMap();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final vu.c i(vu.c cVar, vu.c cVar2) {
        int g11;
        synchronized (this) {
            g gVar = f54619e;
            gVar.a("merging session information. older " + cVar + " with newer " + cVar2);
            if (cVar == null) {
                return cVar2;
            }
            if (s.c(cVar.f(), cVar2.f())) {
                if (cVar2.c() >= cVar.c()) {
                    g11 = ((int) (System.currentTimeMillis() / 1000)) - cVar2.c();
                } else {
                    g11 = cVar.g();
                }
                return vu.c.b(cVar2, null, Math.max(cVar.d(), cVar2.d()), 0, null, g11, null, null, 109, null);
            }
            return cVar2;
        }
    }

    @Override // vu.a
    public boolean a(String vehicleId, yt.b domain, m transport) {
        s.g(vehicleId, "vehicleId");
        s.g(domain, "domain");
        s.g(transport, "transport");
        return g(domain, transport).contains(vehicleId);
    }

    @Override // vu.a
    public boolean b(yt.b domain, String vehicleId) {
        s.g(domain, "domain");
        s.g(vehicleId, "vehicleId");
        return h(domain).containsKey(vehicleId);
    }

    @Override // vu.a
    public void c(yt.b domain, String vehicleId) {
        s.g(domain, "domain");
        s.g(vehicleId, "vehicleId");
        g gVar = f54619e;
        gVar.a("clearing session info " + domain + " " + vehicleId);
        h(domain).remove(vehicleId);
    }

    @Override // vu.a
    public void d(vu.c sessionInfo, String vehicleId, String str) {
        s.g(sessionInfo, "sessionInfo");
        s.g(vehicleId, "vehicleId");
        sessionInfo.l(str);
        vu.c i11 = i(e(sessionInfo.e(), vehicleId), sessionInfo);
        int i12 = c.f54625a[sessionInfo.e().ordinal()];
        if (i12 == 1) {
            this.f54620b.put(vehicleId, i11);
        } else if (i12 == 2) {
            this.f54621c.put(vehicleId, i11);
        } else {
            throw new IllegalArgumentException("Unsupported domain");
        }
    }

    @Override // vu.a
    public vu.c e(yt.b domain, String vehicleId) {
        s.g(domain, "domain");
        s.g(vehicleId, "vehicleId");
        return h(domain).get(vehicleId);
    }

    @Override // vu.a
    public void f(boolean z11, String vehicleId, yt.b domain, m transport) {
        s.g(vehicleId, "vehicleId");
        s.g(domain, "domain");
        s.g(transport, "transport");
        Set<String> g11 = g(domain, transport);
        if (z11) {
            g gVar = f54619e;
            gVar.a("started fetching session info " + domain + " " + transport + " " + vehicleId);
            g11.add(vehicleId);
            return;
        }
        g gVar2 = f54619e;
        gVar2.a("stopped fetching session info " + domain + " " + transport + " " + vehicleId);
        g11.remove(vehicleId);
    }
}