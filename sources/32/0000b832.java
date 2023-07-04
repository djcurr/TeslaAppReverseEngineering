package uu;

import android.util.LruCache;
import bu.p0;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.messagedecoding.CommandMessageDecoder;
import h00.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import ot.m;
import uu.a;
import uu.f;
import vz.v;
import wz.b0;
import wz.e0;
import wz.r0;
import zu.d0;

/* loaded from: classes6.dex */
public final class i implements f {

    /* renamed from: j  reason: collision with root package name */
    public static final a f53709j = new a(null);

    /* renamed from: k  reason: collision with root package name */
    private static final com.tesla.logging.g f53710k = com.tesla.logging.g.f21878b.a("TeslaRequestManager");

    /* renamed from: l  reason: collision with root package name */
    private static final LruCache<String, String> f53711l = new LruCache<>(30);

    /* renamed from: b  reason: collision with root package name */
    private final vu.a f53712b;

    /* renamed from: c  reason: collision with root package name */
    private final m f53713c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentHashMap<String, ConcurrentLinkedDeque<h>> f53714d;

    /* renamed from: e  reason: collision with root package name */
    private final ConcurrentHashMap<String, ConcurrentLinkedDeque<h>> f53715e;

    /* renamed from: f  reason: collision with root package name */
    private final ConcurrentHashMap<String, ConcurrentLinkedDeque<h>> f53716f;

    /* renamed from: g  reason: collision with root package name */
    private final ConcurrentHashMap<String, h> f53717g;

    /* renamed from: h  reason: collision with root package name */
    private final ConcurrentHashMap<String, h> f53718h;

    /* renamed from: i  reason: collision with root package name */
    private final LruCache<String, Boolean> f53719i;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.tesla.logging.g b() {
            com.tesla.logging.g gVar = i.f53710k;
            String name = Thread.currentThread().getName();
            s.f(name, "currentThread().name");
            return gVar.n(name);
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53720a;

        static {
            int[] iArr = new int[yt.b.values().length];
            iArr[yt.b.DOMAIN_VEHICLE_SECURITY.ordinal()] = 1;
            iArr[yt.b.DOMAIN_INFOTAINMENT.ordinal()] = 2;
            iArr[yt.b.DOMAIN_AUTHD.ordinal()] = 3;
            iArr[yt.b.DOMAIN_BROADCAST.ordinal()] = 4;
            iArr[yt.b.DOMAIN_ENERGY_DEVICE.ordinal()] = 5;
            iArr[yt.b.DOMAIN_ENERGY_DEVICE_AUTH.ordinal()] = 6;
            f53720a = iArr;
        }
    }

    /* loaded from: classes6.dex */
    static final class c extends u implements l<h, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f53721a = new c();

        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence invoke(h hVar) {
            return uu.c.b(hVar.A());
        }
    }

    public i(vu.a sessionManager, m transport) {
        s.g(sessionManager, "sessionManager");
        s.g(transport, "transport");
        this.f53712b = sessionManager;
        this.f53713c = transport;
        this.f53714d = new ConcurrentHashMap<>();
        this.f53715e = new ConcurrentHashMap<>();
        this.f53716f = new ConcurrentHashMap<>();
        this.f53717g = new ConcurrentHashMap<>();
        this.f53718h = new ConcurrentHashMap<>();
        this.f53719i = new LruCache<>(25);
    }

    private static final f.b m(i iVar, String str) {
        h h11 = iVar.h(str);
        iVar.r("request_txid", str, h11);
        return new f.b(str, h11);
    }

    private final ConcurrentHashMap<String, ConcurrentLinkedDeque<h>> n(yt.b bVar) {
        switch (b.f53720a[bVar.ordinal()]) {
            case 1:
                return this.f53714d;
            case 2:
                return this.f53715e;
            case 3:
                return this.f53716f;
            case 4:
            case 5:
            case 6:
                throw new IllegalArgumentException(bVar + " not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final ConcurrentLinkedDeque<h> o(yt.b bVar, String str) {
        ConcurrentLinkedDeque<h> putIfAbsent;
        ConcurrentLinkedDeque<h> putIfAbsent2;
        ConcurrentLinkedDeque<h> putIfAbsent3;
        switch (b.f53720a[bVar.ordinal()]) {
            case 1:
                ConcurrentHashMap<String, ConcurrentLinkedDeque<h>> concurrentHashMap = this.f53714d;
                ConcurrentLinkedDeque<h> concurrentLinkedDeque = concurrentHashMap.get(str);
                if (concurrentLinkedDeque == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentLinkedDeque = new ConcurrentLinkedDeque<>()))) != null) {
                    concurrentLinkedDeque = putIfAbsent;
                }
                s.f(concurrentLinkedDeque, "{\n        vehicleIdToVCS…ntLinkedDeque() }\n      }");
                return concurrentLinkedDeque;
            case 2:
                ConcurrentHashMap<String, ConcurrentLinkedDeque<h>> concurrentHashMap2 = this.f53715e;
                ConcurrentLinkedDeque<h> concurrentLinkedDeque2 = concurrentHashMap2.get(str);
                if (concurrentLinkedDeque2 == null && (putIfAbsent2 = concurrentHashMap2.putIfAbsent(str, (concurrentLinkedDeque2 = new ConcurrentLinkedDeque<>()))) != null) {
                    concurrentLinkedDeque2 = putIfAbsent2;
                }
                s.f(concurrentLinkedDeque2, "{\n        vehicleIdToCar…ntLinkedDeque() }\n      }");
                return concurrentLinkedDeque2;
            case 3:
                ConcurrentHashMap<String, ConcurrentLinkedDeque<h>> concurrentHashMap3 = this.f53716f;
                ConcurrentLinkedDeque<h> concurrentLinkedDeque3 = concurrentHashMap3.get(str);
                if (concurrentLinkedDeque3 == null && (putIfAbsent3 = concurrentHashMap3.putIfAbsent(str, (concurrentLinkedDeque3 = new ConcurrentLinkedDeque<>()))) != null) {
                    concurrentLinkedDeque3 = putIfAbsent3;
                }
                s.f(concurrentLinkedDeque3, "{\n        vehicleIdToAut…ntLinkedDeque() }\n      }");
                return concurrentLinkedDeque3;
            case 4:
            case 5:
            case 6:
                throw new IllegalArgumentException(bVar + " not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final boolean q(String str) {
        h hVar = this.f53718h.get(str);
        if (hVar == null) {
            return true;
        }
        return (com.tesla.data.oapi.d.c(hVar.i()) || hVar.U()) ? false : true;
    }

    private final void r(String str, String str2, h hVar) {
        Map f11;
        if (hVar != null || b(str2)) {
            return;
        }
        if (str2.length() > 0) {
            com.tesla.logging.g gVar = f53710k;
            String str3 = str + " " + str2 + " not associated with any request";
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(v.a(h11, str3));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(str3));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a(str3, new Object[0]);
        }
    }

    private final void s(h hVar) {
        hVar.h0(true);
        hVar.f0(ot.h.FETCHING_SESSION_INFO);
    }

    private final void t(String str) {
        if (this.f53717g.remove(str) != null) {
            synchronized (this.f53719i) {
                this.f53719i.put(str, Boolean.TRUE);
            }
        }
    }

    @Override // uu.f
    public List<uu.a> a(yt.b domain) {
        String l02;
        s.g(domain, "domain");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ConcurrentLinkedDeque<h>> entry : n(domain).entrySet()) {
            String key = entry.getKey();
            Iterator<h> it2 = entry.getValue().iterator();
            s.f(it2, "requests.iterator()");
            while (true) {
                if (it2.hasNext()) {
                    h request = it2.next();
                    if (request.Y() && !this.f53712b.b(domain, key)) {
                        if (this.f53712b.a(key, domain, this.f53713c)) {
                            f53709j.b().a("not sending requests while fetching session info");
                        } else {
                            ot.c A = request.A();
                            arrayList.add(new a.b(domain, key, A.h(), A.f(), request.m(), uu.c.d(A), request.Q()));
                            s.f(request, "request");
                            s(request);
                            while (it2.hasNext()) {
                                h next = it2.next();
                                s.f(next, "requestsIterator.next()");
                                s(next);
                            }
                            f53709j.b().a("session info required before we can continue");
                        }
                    } else {
                        it2.remove();
                        s.f(request, "request");
                        arrayList.add(new a.C1205a(request));
                    }
                }
            }
        }
        com.tesla.logging.g b11 = f53709j.b();
        ConcurrentHashMap<String, ConcurrentLinkedDeque<h>> n11 = n(domain);
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<String, ConcurrentLinkedDeque<h>> entry2 : n11.entrySet()) {
            b0.z(arrayList2, entry2.getValue());
        }
        l02 = e0.l0(arrayList2, null, null, null, 0, null, c.f53721a, 31, null);
        b11.a("internal requests remaining " + domain + ": " + l02);
        return arrayList;
    }

    @Override // uu.f
    public boolean b(String requestId) {
        boolean c11;
        s.g(requestId, "requestId");
        synchronized (this.f53719i) {
            c11 = s.c(this.f53719i.get(requestId), Boolean.TRUE);
        }
        return c11;
    }

    @Override // uu.f
    public f.b c(qt.c commandMessage, CommandMessageDecoder.Result decodeResult, com.tesla.logging.g logger) {
        okio.i e11;
        s.g(commandMessage, "commandMessage");
        s.g(decodeResult, "decodeResult");
        s.g(logger, "logger");
        qt.a a11 = qt.a.Companion.a(commandMessage.c());
        qt.g a12 = qt.g.Companion.a(commandMessage.l());
        String F = commandMessage.i().F();
        yt.b bVar = null;
        if (s.c(commandMessage.h(), okio.i.f42656d)) {
            if (a12 == qt.g.STATUS_CODE_APPLICATION_OK) {
                logger.a("empty payload && APPLICATION_OK, returning null request");
                return new f.b(null, null);
            }
            return m(this, F);
        }
        if (a11 == qt.a.COMMAND_TYPE_SIGNED_COMMAND_RESPONSE && a12 == qt.g.STATUS_CODE_APPLICATION_OK) {
            try {
                yt.f decode = yt.f.f59754k.decode(commandMessage.h());
                f.b d11 = d(decode, logger);
                if (d11.c() == null) {
                    yt.a d12 = decode.d();
                    if (d12 != null) {
                        bVar = d12.c();
                    }
                    if (bVar == yt.b.DOMAIN_VEHICLE_SECURITY && (e11 = decode.e()) != null && p0.R.decode(e11).J() != null) {
                        return m(this, F);
                    }
                }
                return d11;
            } catch (Exception e12) {
                logger.d("Error processing signed command response", e12);
            }
        }
        return m(this, F);
    }

    @Override // uu.f
    public f.b d(yt.f routable, com.tesla.logging.g logger) {
        s.g(routable, "routable");
        s.g(logger, "logger");
        String a11 = d0.a(routable, logger);
        h h11 = h(a11);
        r("request_uuid", a11, h11);
        return new f.b(a11, h11);
    }

    @Override // uu.f
    public h e(String commandId) {
        String C;
        s.g(commandId, "commandId");
        if (q(commandId)) {
            h remove = this.f53718h.remove(commandId);
            if (remove != null && (C = remove.C()) != null) {
                t(C);
            }
            return remove;
        }
        return null;
    }

    @Override // uu.f
    public void f(h request) {
        s.g(request, "request");
        com.tesla.logging.g b11 = f53709j.b();
        String C = request.C();
        String m11 = request.m();
        b11.i("associating request " + C + " with " + m11);
        this.f53718h.put(request.n(), request);
        this.f53717g.put(request.C(), request);
        LruCache<String, String> lruCache = f53711l;
        synchronized (lruCache) {
            lruCache.put(request.C(), request.P());
        }
    }

    @Override // uu.f
    public h h(String requestId) {
        s.g(requestId, "requestId");
        return this.f53717g.get(requestId);
    }

    @Override // uu.f
    public h i(String commandId) {
        s.g(commandId, "commandId");
        return this.f53718h.get(commandId);
    }

    @Override // uu.f
    public h j(String requestId, String commandId) {
        s.g(requestId, "requestId");
        s.g(commandId, "commandId");
        if (q(commandId)) {
            h remove = this.f53718h.remove(commandId);
            t(requestId);
            return remove;
        }
        return null;
    }

    @Override // uu.f
    public void k(h request) {
        Object obj;
        Map f11;
        s.g(request, "request");
        ConcurrentLinkedDeque<h> o11 = o(com.tesla.data.oapi.d.a(request.i()), request.P());
        Iterator<T> it2 = o11.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (s.c(((h) obj).C(), request.C())) {
                break;
            }
        }
        if (obj != null) {
            com.tesla.logging.g b11 = f53709j.b();
            String str = "request `" + uu.c.b(request.A()) + "` already exists in manager, ignoring...";
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = b11.h();
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
        f(request);
        if (request.X()) {
            o11.addFirst(request);
        } else {
            o11.addLast(request);
        }
    }

    public final String p(String requestId) {
        String str;
        s.g(requestId, "requestId");
        LruCache<String, String> lruCache = f53711l;
        synchronized (lruCache) {
            str = lruCache.get(requestId);
        }
        return str;
    }

    @Override // uu.f
    /* renamed from: u */
    public ConcurrentLinkedDeque<h> g(yt.b domain, String vehicleId) {
        s.g(domain, "domain");
        s.g(vehicleId, "vehicleId");
        ConcurrentLinkedDeque<h> remove = n(domain).remove(vehicleId);
        return remove == null ? new ConcurrentLinkedDeque<>() : remove;
    }
}