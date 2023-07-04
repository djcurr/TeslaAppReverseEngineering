package com.tesla.logging;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.p;
import vz.v;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21868a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final g f21869b = g.f21878b.a("JsBridge");

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentLinkedDeque<p<EnumC0395a, Object>> f21870c = new ConcurrentLinkedDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private static AtomicBoolean f21871d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private static b f21872e;

    private a() {
    }

    private final void a(EnumC0395a enumC0395a) {
        if (f21871d.get()) {
            return;
        }
        ConcurrentLinkedDeque<p<EnumC0395a, Object>> concurrentLinkedDeque = f21870c;
        synchronized (concurrentLinkedDeque) {
            if (enumC0395a.getReplace()) {
                Iterator<p<EnumC0395a, Object>> it2 = concurrentLinkedDeque.iterator();
                s.f(it2, "pendingMessages.iterator()");
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (it2.next().c() == enumC0395a) {
                        it2.remove();
                        break;
                    }
                }
            }
            b0 b0Var = b0.f54756a;
        }
    }

    public static final void b(EnumC0395a event, Object obj) {
        s.g(event, "event");
        b bVar = f21872e;
        if (bVar == null) {
            f21868a.a(event);
            ConcurrentLinkedDeque<p<EnumC0395a, Object>> concurrentLinkedDeque = f21870c;
            synchronized (concurrentLinkedDeque) {
                concurrentLinkedDeque.add(v.a(event, obj));
            }
            return;
        }
        if (!f21871d.get()) {
            a aVar = f21868a;
            aVar.a(event);
            aVar.e();
        }
        f21868a.c(bVar, event, obj);
    }

    private final void c(b bVar, EnumC0395a enumC0395a, Object obj) {
        String eventName = enumC0395a.getEventName();
        if (enumC0395a.getLogSelf()) {
            g gVar = f21869b;
            gVar.b("Sending `" + eventName + "` to JS", false);
        }
        bVar.a(eventName, obj);
    }

    public static /* synthetic */ void d(EnumC0395a enumC0395a, Object obj, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        b(enumC0395a, obj);
    }

    private final void e() {
        f21871d.set(true);
        ConcurrentLinkedDeque<p<EnumC0395a, Object>> concurrentLinkedDeque = f21870c;
        synchronized (concurrentLinkedDeque) {
            if (concurrentLinkedDeque.isEmpty()) {
                return;
            }
            g gVar = f21869b;
            int size = concurrentLinkedDeque.size();
            gVar.i("Sending " + size + " pending messages to JS");
            Iterator<T> it2 = concurrentLinkedDeque.iterator();
            while (it2.hasNext()) {
                p pVar = (p) it2.next();
                EnumC0395a enumC0395a = (EnumC0395a) pVar.a();
                Object b11 = pVar.b();
                b bVar = f21872e;
                if (bVar != null) {
                    f21868a.c(bVar, enumC0395a, b11);
                }
            }
            f21870c.clear();
            b0 b0Var = b0.f54756a;
        }
    }

    public static final void f(b forwardingClient) {
        s.g(forwardingClient, "forwardingClient");
        f21872e = forwardingClient;
    }

    /* renamed from: com.tesla.logging.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public enum EnumC0395a {
        BLE_SYSTEM_STATUS("ble:status", false, false, 6, null),
        BLE_VEHICLE_STATUS("ble:vehicle_status", false, false, 6, null),
        BLE_PRODUCT_SWITCH("ble:productSwitch", false, false, 6, null),
        BLE_VEHICLE_EVENT("ble:vehicle_event", false, false, 6, null),
        LOG("log", false, false, 2, null),
        AUTH_FAILURE("auth_failure", true, false, 4, null),
        GODOT_MESSAGE("onGodotMessage", false, false, 6, null),
        VEHICLE_CONNECTIVITY_STATE("vehicleOnlineState", true, false, 4, null),
        HERMES_STATUS("hermes:status", false, false, 6, null),
        PSEUDONYM_SYNC("pseudonymSync", false, false, 6, null),
        PROTO_VEHICLE_DATA("protoVehicleData", false, false, 6, null),
        CAR_API_STREAM_MESSAGE("carApiStreamMessage", false, false, 6, null),
        CAR_API_ICE_CONFIG("carApiIceConfig", false, false, 6, null),
        CAR_API_VEHICLE_DATA_SUBSCRIPTION("carApiVehicleDataSubscriptionResponse", false, false, 6, null),
        CAR_API_PII_KEY_RESPONSE("carApiVehicleDataPiiKeyResponse", false, false, 6, null),
        CAR_API_VEHICLE_PING("carApiVehiclePing", false, false, 6, null),
        MOTION_SHAKE("shakeDetected", true, false, 4, null);
        
        private final String eventName;
        private final boolean logSelf;
        private final boolean replace;

        EnumC0395a(String str, boolean z11, boolean z12) {
            this.eventName = str;
            this.replace = z11;
            this.logSelf = z12;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final boolean getLogSelf() {
            return this.logSelf;
        }

        public final boolean getReplace() {
            return this.replace;
        }

        /* synthetic */ EnumC0395a(String str, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? true : z12);
        }
    }
}