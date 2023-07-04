package com.tesla.command;

import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.h0;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import com.facebook.react.bridge.WritableNativeMap;
import com.tesla.domain.model.EnergySite;
import com.tesla.domain.model.Product;
import com.tesla.domain.model.Vehicle;
import com.tesla.logging.a;
import h00.l;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.p;
import wz.w;
import ys.m;
import yu.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\n"}, d2 = {"Lcom/tesla/command/VehicleConnectivityStateManager;", "Landroidx/lifecycle/u;", "Lvz/b0;", "onAppForegrounded", "onAppBackgrounded", "<init>", "()V", "a", "b", cg.c.f9084i, "command_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class VehicleConnectivityStateManager implements u {

    /* renamed from: b  reason: collision with root package name */
    private static m f21489b;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f21497j;

    /* renamed from: m  reason: collision with root package name */
    private static a f21500m;

    /* renamed from: a  reason: collision with root package name */
    public static final VehicleConnectivityStateManager f21488a = new VehicleConnectivityStateManager();

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentHashMap<String, Long> f21490c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentHashMap<String, c> f21491d = new ConcurrentHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap<String, Long> f21492e = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentHashMap<String, Long> f21493f = new ConcurrentHashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private static final ConcurrentHashMap<String, Long> f21494g = new ConcurrentHashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private static final ConcurrentHashMap<String, ConcurrentLinkedQueue<p<String, b>>> f21495h = new ConcurrentHashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private static final ConcurrentLinkedQueue<b> f21496i = new ConcurrentLinkedQueue<>();

    /* renamed from: k  reason: collision with root package name */
    private static final ConcurrentHashMap<String, String> f21498k = new ConcurrentHashMap<>();

    /* renamed from: l  reason: collision with root package name */
    private static final ConcurrentHashMap<String, String> f21499l = new ConcurrentHashMap<>();

    /* renamed from: n  reason: collision with root package name */
    private static final com.tesla.logging.g f21501n = com.tesla.logging.g.f21878b.a("VehicleConnectivityStateManager");

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f21502a;

        /* renamed from: b  reason: collision with root package name */
        private Date f21503b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f21504c;

        public a(String vehicleId, Date startedListeningAt, boolean z11) {
            s.g(vehicleId, "vehicleId");
            s.g(startedListeningAt, "startedListeningAt");
            this.f21502a = vehicleId;
            this.f21503b = startedListeningAt;
            this.f21504c = z11;
        }

        public final boolean a() {
            return this.f21504c;
        }

        public final Date b() {
            return this.f21503b;
        }

        public final String c() {
            return this.f21502a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return s.c(this.f21502a, aVar.f21502a) && s.c(this.f21503b, aVar.f21503b) && this.f21504c == aVar.f21504c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f21502a.hashCode() * 31) + this.f21503b.hashCode()) * 31;
            boolean z11 = this.f21504c;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode + i11;
        }

        public String toString() {
            String str = this.f21502a;
            Date date = this.f21503b;
            boolean z11 = this.f21504c;
            return "AnalyticsState(vehicleId=" + str + ", startedListeningAt=" + date + ", hasBeenSeenOnline=" + z11 + ")";
        }
    }

    /* loaded from: classes6.dex */
    public interface b {
        boolean a(String str, c cVar);
    }

    /* loaded from: classes6.dex */
    public enum c {
        UNKNOWN,
        ONLINE,
        OFFLINE
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21505a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.ONLINE.ordinal()] = 1;
            iArr[c.OFFLINE.ordinal()] = 2;
            iArr[c.UNKNOWN.ordinal()] = 3;
            f21505a = iArr;
        }
    }

    /* loaded from: classes6.dex */
    public static final class e implements d.a {
        e() {
        }

        @Override // yu.d.a
        public void a(Product product) {
            s.g(product, "product");
            boolean z11 = product instanceof Vehicle;
            if (z11) {
                com.tesla.logging.g gVar = VehicleConnectivityStateManager.f21501n;
                Vehicle vehicle = (Vehicle) product;
                String id2 = vehicle.getId();
                String displayName = vehicle.getDisplayName();
                gVar.i("vehicle selected: " + id2 + " " + displayName);
            } else if (product instanceof EnergySite) {
                com.tesla.logging.g gVar2 = VehicleConnectivityStateManager.f21501n;
                String id3 = ((EnergySite) product).getId();
                gVar2.i("energy site selected: " + id3);
                return;
            }
            Vehicle vehicle2 = z11 ? (Vehicle) product : null;
            if (vehicle2 == null) {
                return;
            }
            VehicleConnectivityStateManager.f21488a.o(vehicle2);
            String vin = vehicle2.getVin();
            String id4 = vehicle2.getId();
            VehicleConnectivityStateManager.f21498k.put(vin, id4);
            VehicleConnectivityStateManager.f21499l.put(id4, vin);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.a<b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f21506a = new f();

        f() {
            super(0);
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VehicleConnectivityStateManager.f21501n.a("successfully sent WAKE request.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class g extends kotlin.jvm.internal.u implements l<Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f21507a = new g();

        g() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(Integer num) {
            invoke(num.intValue());
            return b0.f54756a;
        }

        public final void invoke(int i11) {
            String str = "failed to send WAKE request. " + i11;
            VehicleConnectivityStateManager.f21501n.d(str, new Throwable(str));
        }
    }

    private VehicleConnectivityStateManager() {
    }

    private final void n(c cVar, String str) {
        List<jt.f> l11;
        a aVar = f21500m;
        if (aVar == null || aVar.a() || cVar != c.ONLINE) {
            return;
        }
        f21500m = new a(aVar.c(), aVar.b(), true);
        double time = (new Date().getTime() - aVar.b().getTime()) / 1000.0d;
        com.tesla.logging.g gVar = f21501n;
        gVar.i("refreshed data on: " + str + " in " + time);
        es.c a11 = es.b.a();
        jt.d dVar = jt.d.VEHICLE_ONLINE_IN_SESSION;
        l11 = w.l(new jt.f(jt.g.DURATION_S, null, null, new jt.b(time, null, 2, null), null, null, 54, null), new jt.f(jt.g.REFRESHED_DATA, new jt.a(true, null, 2, null), null, null, null, null, 60, null));
        a11.a(dVar, l11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(Vehicle vehicle) {
        List<jt.f> l11;
        a aVar = f21500m;
        if (aVar != null) {
            if (s.c(vehicle.getId(), aVar.c())) {
                return;
            }
            com.tesla.logging.g gVar = f21501n;
            gVar.i("Changing vehicle to: " + vehicle + ".id");
            if (!aVar.a()) {
                double time = (new Date().getTime() - aVar.b().getTime()) / 1000.0d;
                String c11 = aVar.c();
                gVar.m("Never saw: " + c11 + ", in: " + time + " seconds.");
                es.c a11 = es.b.a();
                jt.d dVar = jt.d.VEHICLE_ONLINE_IN_SESSION;
                l11 = w.l(new jt.f(jt.g.DURATION_S, null, null, new jt.b(time, null, 2, null), null, null, 54, null), new jt.f(jt.g.REFRESHED_DATA, new jt.a(true, null, 2, null), null, null, null, null, 60, null));
                a11.a(dVar, l11);
            }
            f21500m = new a(vehicle.getId(), new Date(), false);
            return;
        }
        com.tesla.logging.g gVar2 = f21501n;
        String id2 = vehicle.getId();
        gVar2.i("Started listening for product: " + id2);
        f21500m = new a(vehicle.getId(), new Date(), false);
    }

    private final void r(String str) {
        ConcurrentHashMap<String, Long> concurrentHashMap = f21490c;
        Long l11 = concurrentHashMap.get(str);
        if (l11 == null) {
            com.tesla.logging.g gVar = f21501n;
            gVar.i("Vehicle " + str + " has never been woke");
            l11 = 0L;
            Long putIfAbsent = concurrentHashMap.putIfAbsent(str, l11);
            if (putIfAbsent != null) {
                l11 = putIfAbsent;
            }
        }
        Long lastVehicleWakeTimeMillis = l11;
        long currentTimeMillis = System.currentTimeMillis();
        s.f(lastVehicleWakeTimeMillis, "lastVehicleWakeTimeMillis");
        long longValue = currentTimeMillis - lastVehicleWakeTimeMillis.longValue();
        if (longValue >= 60000) {
            concurrentHashMap.put(str, Long.valueOf(System.currentTimeMillis()));
            m mVar = f21489b;
            if (mVar == null) {
                s.x("wakeVehicleUseCase");
                mVar = null;
            }
            mVar.c(str, f.f21506a, g.f21507a);
            return;
        }
        com.tesla.logging.g gVar2 = f21501n;
        gVar2.i("Not waking vehicle, last wake was " + longValue + "ms ago");
    }

    public final c f(String vehicleId) {
        c putIfAbsent;
        s.g(vehicleId, "vehicleId");
        ConcurrentHashMap<String, c> concurrentHashMap = f21491d;
        c cVar = concurrentHashMap.get(vehicleId);
        if (cVar == null && (putIfAbsent = concurrentHashMap.putIfAbsent(vehicleId, (cVar = c.UNKNOWN))) != null) {
            cVar = putIfAbsent;
        }
        s.f(cVar, "states.getOrPut(vehicleId) { State.UNKNOWN }");
        return cVar;
    }

    public final Long h(String vehicleId) {
        s.g(vehicleId, "vehicleId");
        return f21492e.get(vehicleId);
    }

    public final Long i(String vehicleId) {
        s.g(vehicleId, "vehicleId");
        return f21490c.get(vehicleId);
    }

    public final Long j(String vehicleId) {
        s.g(vehicleId, "vehicleId");
        return f21493f.get(vehicleId);
    }

    public final Long k(String vehicleId) {
        s.g(vehicleId, "vehicleId");
        return f21494g.get(vehicleId);
    }

    public final void l(yu.d getSelectedProduct, m wakeVehicle) {
        s.g(getSelectedProduct, "getSelectedProduct");
        s.g(wakeVehicle, "wakeVehicle");
        if (!f21497j) {
            f21497j = true;
            f21489b = wakeVehicle;
            ProcessLifecycleOwner.h().getLifecycle().a(this);
            getSelectedProduct.b(new e());
            return;
        }
        throw new IllegalStateException("Cannot initialize manager as it is already initialized!");
    }

    public final void m(b listener) {
        s.g(listener, "listener");
        f21496i.add(listener);
    }

    @h0(p.b.ON_STOP)
    public final void onAppBackgrounded() {
        List<jt.f> l11;
        a aVar = f21500m;
        if (aVar == null || aVar.a()) {
            return;
        }
        double time = (new Date().getTime() - aVar.b().getTime()) / 1000.0d;
        com.tesla.logging.g gVar = f21501n;
        String c11 = aVar.c();
        gVar.i("Entered the background, never saw " + c11 + " in session.");
        es.c a11 = es.b.a();
        jt.d dVar = jt.d.VEHICLE_ONLINE_IN_SESSION;
        l11 = w.l(new jt.f(jt.g.DURATION_S, null, null, new jt.b(time, null, 2, null), null, null, 54, null), new jt.f(jt.g.REFRESHED_DATA, new jt.a(false, null, 2, null), null, null, null, null, 60, null));
        a11.a(dVar, l11);
    }

    @h0(p.b.ON_START)
    public final void onAppForegrounded() {
        a aVar = f21500m;
        if (aVar == null) {
            return;
        }
        f21501n.i("Resetting connectivity analytics for foreground.");
        f21500m = new a(aVar.c(), new Date(), false);
    }

    public final void p(String vehicleId, c state) {
        String str;
        Iterator<vz.p<String, b>> it2;
        s.g(vehicleId, "vehicleId");
        s.g(state, "state");
        long currentTimeMillis = System.currentTimeMillis();
        f21493f.put(vehicleId, Long.valueOf(currentTimeMillis));
        if (state == c.ONLINE) {
            f21492e.put(vehicleId, Long.valueOf(currentTimeMillis));
        }
        ConcurrentHashMap<String, c> concurrentHashMap = f21491d;
        if (concurrentHashMap.get(vehicleId) == state) {
            com.tesla.logging.g gVar = f21501n;
            gVar.a(vehicleId + " state is already " + state + ", doing nothing else.");
            return;
        }
        com.tesla.logging.g gVar2 = f21501n;
        gVar2.i("setting " + vehicleId + " online state to " + state);
        concurrentHashMap.put(vehicleId, state);
        ConcurrentLinkedQueue<vz.p<String, b>> concurrentLinkedQueue = f21495h.get(vehicleId);
        if (concurrentLinkedQueue != null && (it2 = concurrentLinkedQueue.iterator()) != null) {
            while (it2.hasNext()) {
                vz.p<String, b> next = it2.next();
                String a11 = next.a();
                com.tesla.logging.g gVar3 = f21501n;
                gVar3.i("notifying listener for command id " + a11);
                if (next.b().a(vehicleId, state)) {
                    gVar3.i("removing listener for command id " + a11);
                    it2.remove();
                }
            }
        }
        Iterator<b> it3 = f21496i.iterator();
        s.f(it3, "allVehiclesListeners.iterator()");
        while (it3.hasNext()) {
            if (it3.next().a(vehicleId, state)) {
                com.tesla.logging.g gVar4 = f21501n;
                gVar4.i("removing all vehicles listener on vehicle " + vehicleId + " " + state);
                it3.remove();
            }
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("vehicleId", vehicleId);
        int i11 = d.f21505a[state.ordinal()];
        if (i11 == 1) {
            str = "online";
        } else if (i11 == 2) {
            str = "offline";
        } else if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "unknown";
        }
        writableNativeMap.putString("state", str);
        com.tesla.logging.a.b(a.EnumC0395a.VEHICLE_CONNECTIVITY_STATE, writableNativeMap);
        n(state, vehicleId);
    }

    public final void q(String vehicleId) {
        s.g(vehicleId, "vehicleId");
        f21494g.put(vehicleId, Long.valueOf(System.currentTimeMillis()));
    }

    public final void s(ot.c request) {
        s.g(request, "request");
        if (request.f()) {
            com.tesla.logging.g gVar = f21501n;
            String b11 = uu.c.b(request);
            gVar.i("Not waking vehicle for " + b11 + " because letSleep property is set");
            return;
        }
        r(request.j());
    }
}