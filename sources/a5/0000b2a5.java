package ss;

import android.content.Context;
import bu.d0;
import bu.g2;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.messagedecoding.RoutableMessageDecoder;
import com.teslamotors.plugins.ble.c;
import gu.r;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import lt.j2;
import lt.w2;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import ss.h;
import ts.c;
import uu.a;
import uu.f;
import vz.b0;
import vz.v;
import wz.r0;
import wz.s0;

/* loaded from: classes6.dex */
public final class h implements j, ss.i {

    /* renamed from: l */
    public static final a f50534l = new a(null);

    /* renamed from: m */
    private static final com.tesla.logging.g f50535m = com.tesla.logging.g.f21878b.a("BLE");

    /* renamed from: n */
    private static final boolean f50536n = false;

    /* renamed from: a */
    private final Context f50537a;

    /* renamed from: b */
    private final yu.m f50538b;

    /* renamed from: c */
    private final yu.e f50539c;

    /* renamed from: d */
    private final uu.f f50540d;

    /* renamed from: e */
    private final vu.a f50541e;

    /* renamed from: f */
    private final gu.p f50542f;

    /* renamed from: g */
    private final ot.m f50543g;

    /* renamed from: h */
    private final String f50544h;

    /* renamed from: i */
    private final vz.k f50545i;

    /* renamed from: j */
    private final ConcurrentHashMap<String, uu.h> f50546j;

    /* renamed from: k */
    private final ConcurrentHashMap<String, String> f50547k;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void b(uu.h hVar, String str, com.tesla.logging.d dVar) {
            if (hVar == null) {
                return;
            }
            us.c.c(hVar, str, h.f50535m, dVar);
        }

        static /* synthetic */ void c(a aVar, uu.h hVar, String str, com.tesla.logging.d dVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                dVar = com.tesla.logging.d.INFO;
            }
            aVar.b(hVar, str, dVar);
        }

        public final j d(Context context, yu.m remoteLog, yu.e getVehicleData, uu.f requestManager, vu.a sessionManager, gu.p routableMessageBuilder) {
            s.g(context, "context");
            s.g(remoteLog, "remoteLog");
            s.g(getVehicleData, "getVehicleData");
            s.g(requestManager, "requestManager");
            s.g(sessionManager, "sessionManager");
            s.g(routableMessageBuilder, "routableMessageBuilder");
            Context applicationContext = context.getApplicationContext();
            s.f(applicationContext, "context.applicationContext");
            return new h(applicationContext, remoteLog, getVehicleData, requestManager, sessionManager, routableMessageBuilder, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: a */
        private final String f50548a;

        /* renamed from: b */
        private final int f50549b;

        /* renamed from: c */
        private final int f50550c;

        public b(String str, int i11, int i12) {
            this.f50548a = str;
            this.f50549b = i11;
            this.f50550c = i12;
        }

        public final String a() {
            return this.f50548a;
        }

        public final int b() {
            return this.f50549b;
        }

        public final int c() {
            return this.f50550c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return s.c(this.f50548a, bVar.f50548a) && this.f50549b == bVar.f50549b && this.f50550c == bVar.f50550c;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f50548a;
            return ((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.f50549b)) * 31) + Integer.hashCode(this.f50550c);
        }

        public String toString() {
            String str = this.f50548a;
            int i11 = this.f50549b;
            int i12 = this.f50550c;
            return "RequestVehicleData(vin=" + str + ", keyVersion=" + i11 + ", apiVersion=" + i12 + ")";
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class c {

        /* loaded from: classes6.dex */
        public static final class a extends c {

            /* renamed from: a */
            private final uu.h f50551a;

            public a(uu.h hVar) {
                super(null);
                this.f50551a = hVar;
            }

            public final uu.h a() {
                return this.f50551a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && s.c(this.f50551a, ((a) obj).f50551a);
            }

            public int hashCode() {
                uu.h hVar = this.f50551a;
                if (hVar == null) {
                    return 0;
                }
                return hVar.hashCode();
            }

            public String toString() {
                uu.h hVar = this.f50551a;
                return "Error(request=" + hVar + ")";
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends c {

            /* renamed from: a */
            private final uu.h f50552a;

            /* renamed from: b */
            private final RoutableMessageDecoder.Result f50553b;

            /* renamed from: c */
            private final c.a f50554c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(uu.h hVar, RoutableMessageDecoder.Result decode, c.a evaluation) {
                super(null);
                s.g(decode, "decode");
                s.g(evaluation, "evaluation");
                this.f50552a = hVar;
                this.f50553b = decode;
                this.f50554c = evaluation;
            }

            public final uu.h a() {
                return this.f50552a;
            }

            public final RoutableMessageDecoder.Result b() {
                return this.f50553b;
            }

            public final c.a c() {
                return this.f50554c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    return s.c(this.f50552a, bVar.f50552a) && s.c(this.f50553b, bVar.f50553b) && s.c(this.f50554c, bVar.f50554c);
                }
                return false;
            }

            public int hashCode() {
                uu.h hVar = this.f50552a;
                return ((((hVar == null ? 0 : hVar.hashCode()) * 31) + this.f50553b.hashCode()) * 31) + this.f50554c.hashCode();
            }

            public String toString() {
                uu.h hVar = this.f50552a;
                RoutableMessageDecoder.Result result = this.f50553b;
                c.a aVar = this.f50554c;
                return "RoutableEvaluation(request=" + hVar + ", decode=" + result + ", evaluation=" + aVar + ")";
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50555a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f50556b;

        static {
            int[] iArr = new int[com.tesla.data.oapi.b.values().length];
            iArr[com.tesla.data.oapi.b.REAR_TRUNK.ordinal()] = 1;
            iArr[com.tesla.data.oapi.b.FRONT_TRUNK.ordinal()] = 2;
            iArr[com.tesla.data.oapi.b.FRONT_DRIVER_DOOR.ordinal()] = 3;
            iArr[com.tesla.data.oapi.b.FRONT_PASSENGER_DOOR.ordinal()] = 4;
            iArr[com.tesla.data.oapi.b.REAR_DRIVER_DOOR.ordinal()] = 5;
            iArr[com.tesla.data.oapi.b.REAR_PASSENGER_DOOR.ordinal()] = 6;
            iArr[com.tesla.data.oapi.b.CHARGE_PORT.ordinal()] = 7;
            f50555a = iArr;
            int[] iArr2 = new int[g2.values().length];
            iArr2[g2.RKE_ACTION_UNLOCK.ordinal()] = 1;
            iArr2[g2.RKE_ACTION_LOCK.ordinal()] = 2;
            iArr2[g2.RKE_ACTION_OPEN_TRUNK.ordinal()] = 3;
            iArr2[g2.RKE_ACTION_OPEN_FRUNK.ordinal()] = 4;
            iArr2[g2.RKE_ACTION_OPEN_CHARGE_PORT.ordinal()] = 5;
            iArr2[g2.RKE_ACTION_CLOSE_CHARGE_PORT.ordinal()] = 6;
            iArr2[g2.RKE_ACTION_AUTO_SECURE_VEHICLE.ordinal()] = 7;
            f50556b = iArr2;
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends u implements h00.a<com.teslamotors.plugins.ble.b> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(0);
            h.this = r1;
        }

        @Override // h00.a
        /* renamed from: a */
        public final com.teslamotors.plugins.ble.b mo11invoke() {
            return com.teslamotors.plugins.ble.b.I(h.this.f50537a, "from BLE command center");
        }
    }

    /* loaded from: classes6.dex */
    static final class f extends u implements h00.p<uu.h, ot.f, b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f() {
            super(2);
            h.this = r1;
        }

        public final void a(uu.h finishedRequest, ot.f result) {
            s.g(finishedRequest, "finishedRequest");
            s.g(result, "result");
            ts.b.f52420a.c(h.this.f50537a, h.this.f50538b, finishedRequest, h.this.f50544h, h.this.f50539c, h.this.a(), result, (r35 & 128) != 0 ? null : null, (r35 & 256) != 0 ? null : null, (r35 & 512) != 0 ? null : null, (r35 & 1024) != 0 ? null : null, (r35 & 2048) != 0 ? null : h.f50535m, (r35 & 4096) != 0 ? null : null, (r35 & PKIFailureInfo.certRevoked) != 0 ? null : null, (r35 & 16384) != 0 ? false : false);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(uu.h hVar, ot.f fVar) {
            a(hVar, fVar);
            return b0.f54756a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class g extends u implements h00.l<Object, b0> {

        /* renamed from: a */
        final /* synthetic */ uu.h f50559a;

        /* renamed from: b */
        final /* synthetic */ h f50560b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(uu.h hVar, h hVar2) {
            super(1);
            this.f50559a = hVar;
            this.f50560b = hVar2;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(Object obj) {
            invoke2(obj);
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(Object obj) {
            a aVar = h.f50534l;
            a.c(aVar, this.f50559a, "resolving promise called", null, 2, null);
            WritableMap writableMap = obj instanceof WritableMap ? (WritableMap) obj : null;
            if (writableMap == null) {
                return;
            }
            uu.h hVar = this.f50559a;
            h hVar2 = this.f50560b;
            String valueOf = String.valueOf(((WritableMap) obj).getInt("id"));
            h.H(hVar, hVar2, valueOf);
            Object obj2 = hVar2.f50547k.get(valueOf);
            a.c(aVar, hVar, valueOf + " resolving promise for command=" + obj2, null, 2, null);
            if (writableMap.getBoolean("success")) {
                hVar2.w(valueOf);
            } else {
                h.v(hVar2, hVar, ot.f.RESULT_LEGACY_BLE_COMMAND_FAILURE, null, null, 12, null);
            }
        }
    }

    /* renamed from: ss.h$h */
    /* loaded from: classes6.dex */
    public static final class C1123h extends u implements h00.a<b0> {

        /* renamed from: b */
        final /* synthetic */ uu.h f50562b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1123h(uu.h hVar) {
            super(0);
            h.this = r1;
            this.f50562b = hVar;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo11invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            h.v(h.this, this.f50562b, ot.f.RESULT_LEGACY_BLE_COMMAND_FAILURE, null, null, 12, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class i extends u implements h00.p<uu.h, ot.f, b0> {

        /* renamed from: b */
        final /* synthetic */ uu.h f50564b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(uu.h hVar) {
            super(2);
            h.this = r1;
            this.f50564b = hVar;
        }

        public final void a(uu.h noName_0, ot.f result) {
            s.g(noName_0, "$noName_0");
            s.g(result, "result");
            ts.b bVar = ts.b.f52420a;
            ot.m a11 = h.this.a();
            bVar.c(h.this.f50537a, h.this.f50538b, this.f50564b, h.this.f50544h, h.this.f50539c, a11, result, (r35 & 128) != 0 ? null : null, (r35 & 256) != 0 ? null : null, (r35 & 512) != 0 ? null : null, (r35 & 1024) != 0 ? null : null, (r35 & 2048) != 0 ? null : h.f50535m, (r35 & 4096) != 0 ? null : null, (r35 & PKIFailureInfo.certRevoked) != 0 ? null : null, (r35 & 16384) != 0 ? false : false);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(uu.h hVar, ot.f fVar) {
            a(hVar, fVar);
            return b0.f54756a;
        }
    }

    private h(Context context, yu.m mVar, yu.e eVar, uu.f fVar, vu.a aVar, gu.p pVar) {
        vz.k a11;
        this.f50537a = context;
        this.f50538b = mVar;
        this.f50539c = eVar;
        this.f50540d = fVar;
        this.f50541e = aVar;
        this.f50542f = pVar;
        this.f50543g = ot.m.TRANSPORT_BLUETOOTH;
        String uuid = UUID.randomUUID().toString();
        s.f(uuid, "randomUUID().toString()");
        this.f50544h = uuid;
        a11 = vz.m.a(new e());
        this.f50545i = a11;
        this.f50546j = new ConcurrentHashMap<>();
        this.f50547k = new ConcurrentHashMap<>();
        y();
    }

    public /* synthetic */ h(Context context, yu.m mVar, yu.e eVar, uu.f fVar, vu.a aVar, gu.p pVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, mVar, eVar, fVar, aVar, pVar);
    }

    public static final void A(uu.h hVar, h this$0) {
        s.g(this$0, "this$0");
        if (hVar.X()) {
            a.c(f50534l, hVar, "sending internally...", null, 2, null);
            this$0.f50540d.f(hVar);
            this$0.D(hVar);
            return;
        }
        a.c(f50534l, hVar, "adding to request manager and triggering send pending requests", null, 2, null);
        this$0.f50540d.k(hVar);
        this$0.I(hVar.p());
    }

    public static final c B(h this$0, com.teslamotors.plugins.ble.c cVar) {
        s.g(this$0, "this$0");
        if (cVar instanceof c.b) {
            try {
                yt.f decode = yt.f.f59754k.decode(((c.b) cVar).a());
                f.b d11 = this$0.f50540d.d(decode, f50535m);
                d11.a();
                uu.h b11 = d11.b();
                RoutableMessageDecoder.Result a11 = RoutableMessageDecoder.f21913a.a(decode);
                if (b11 != null) {
                    b11.c("decode=" + a11);
                }
                if (b11 != null) {
                    b11.c("evaluation_start");
                }
                ts.c cVar2 = ts.c.f52423a;
                vu.a aVar = this$0.f50541e;
                uu.f fVar = this$0.f50540d;
                c.a b12 = cVar2.b(a11, aVar, this$0.f50539c, fVar, b11 == null ? null : b11.P(), b11, ot.m.TRANSPORT_BLUETOOTH);
                a aVar2 = f50534l;
                a.c(aVar2, b11, "-> " + a11 + " " + b12, null, 2, null);
                return new c.b(b11, a11, b12);
            } catch (Exception e11) {
                f50535m.d("Error processing received data from BLE", e11);
                return new c.a(null);
            }
        } else if (cVar instanceof c.a) {
            return new c.a(this$0.f50540d.h(((c.a) cVar).a()));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final void C(Throwable th2) {
        f50535m.d("error observing ble data", th2);
    }

    private final void D(final uu.h hVar) {
        int i11;
        if (hVar.V()) {
            i11 = 25;
        } else {
            j2 c11 = hVar.i().c();
            if ((c11 == null ? null : c11.v()) != null) {
                i11 = 5;
            } else {
                i11 = hVar.X() ? 6 : 2;
            }
        }
        hVar.m0(i11, ot.m.TRANSPORT_BLUETOOTH, true);
        try {
            hVar.c("entered_request_flow");
            vu.c e11 = this.f50541e.e(com.tesla.data.oapi.d.a(hVar.i()), hVar.P());
            hVar.c("building_params_start");
            gu.k a11 = gu.k.f28105h.a(this.f50544h, hVar, this.f50537a, 5, this.f50539c, e11);
            hVar.c("building_params_done");
            String n11 = hVar.n();
            final String C = a11.c().C();
            this.f50547k.put(C, n11);
            this.f50546j.put(n11, hVar);
            hVar.c("message_build_start");
            this.f50542f.a(a11).w(bz.a.c()).u(new ky.f() { // from class: ss.d
                @Override // ky.f
                public final void accept(Object obj) {
                    h.E(hVar, this, C, (yt.f) obj);
                }
            }, new ky.f() { // from class: ss.c
                {
                    h.this = this;
                }

                @Override // ky.f
                public final void accept(Object obj) {
                    h.F(h.this, hVar, (Throwable) obj);
                }
            });
        } catch (Exception e12) {
            f50535m.d("Failed to build request", e12);
            v(this, hVar, ot.f.RESULT_MESSAGE_BUILD_FAILURE, null, null, 12, null);
        }
    }

    public static final void E(uu.h request, h this$0, String requestId, yt.f fVar) {
        s.g(request, "$request");
        s.g(this$0, "this$0");
        s.g(requestId, "$requestId");
        a aVar = f50534l;
        a.c(aVar, request, "<- sending", null, 2, null);
        int t02 = this$0.s().t0(requestId, fVar.encode());
        request.c("sent data to bleModule. id=" + t02);
        a.c(aVar, request, "sent. BLE command id=" + t02, null, 2, null);
    }

    public static final void F(h this$0, uu.h request, Throwable th2) {
        s.g(this$0, "this$0");
        s.g(request, "$request");
        if (th2 instanceof r) {
            r rVar = (r) th2;
            ot.f e11 = rVar.e();
            if (e11 == null) {
                e11 = ot.f.RESULT_MESSAGE_BUILD_FAILURE;
            }
            this$0.u(request, e11, rVar.f(), rVar.d());
            return;
        }
        v(this$0, request, ot.f.RESULT_MESSAGE_BUILD_FAILURE, null, null, 12, null);
    }

    private final void G(uu.h hVar) {
        d0 d11;
        Map f11;
        Map f12;
        qs.b bVar = new qs.b(new g(hVar, this), new C1123h(hVar));
        ot.b c11 = hVar.A().c();
        List<com.tesla.data.oapi.e> l11 = (c11 == null || (d11 = c11.d()) == null) ? null : com.tesla.data.oapi.c.l(d11);
        if (l11 != null && (l11.isEmpty() ^ true)) {
            if (com.tesla.data.oapi.c.s(l11)) {
                s().v(bVar);
                return;
            } else if (com.tesla.data.oapi.c.t(l11)) {
                s().y(bVar);
                return;
            } else {
                com.tesla.data.oapi.e eVar = (com.tesla.data.oapi.e) wz.u.b0(l11);
                switch (d.f50555a[eVar.a().ordinal()]) {
                    case 1:
                        s().B(bVar);
                        return;
                    case 2:
                        s().w(bVar);
                        return;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ot.g b11 = eVar.b();
                        if (b11 == null) {
                            com.tesla.logging.g gVar = f50535m;
                            TeslaLog teslaLog = TeslaLog.INSTANCE;
                            String h11 = gVar.h();
                            ht.a aVar = ht.a.f29422a;
                            f11 = r0.f(v.a(h11, "Failed to get door even though doors list was non-empty"));
                            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                            for (Map.Entry entry : f11.entrySet()) {
                                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
                            }
                            firebaseCrashlytics.recordException(new Exception("Failed to get door even though doors list was non-empty"));
                            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
                            n80.a.a("Failed to get door even though doors list was non-empty", new Object[0]);
                            v(this, hVar, ot.f.RESULT_UNSUPPORTED_COMMAND, null, null, 12, null);
                            return;
                        } else if (eVar.e()) {
                            s().A(bVar, b11);
                            return;
                        } else if (eVar.d()) {
                            s().u(bVar, b11);
                            return;
                        } else {
                            return;
                        }
                    case 7:
                        if (eVar.e()) {
                            s().z(bVar);
                            return;
                        } else if (eVar.d()) {
                            s().t(bVar);
                            return;
                        } else {
                            com.tesla.logging.g gVar2 = f50535m;
                            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                            String h12 = gVar2.h();
                            ht.a aVar2 = ht.a.f29422a;
                            f12 = r0.f(v.a(h12, "Charge port closure has invalid move type"));
                            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                            for (Map.Entry entry2 : f12.entrySet()) {
                                ht.a.f29422a.a((String) entry2.getKey(), (String) entry2.getValue());
                            }
                            firebaseCrashlytics2.recordException(new Exception("Charge port closure has invalid move type"));
                            TeslaLog.setTag$default(teslaLog2, h12, false, 2, null);
                            n80.a.a("Charge port closure has invalid move type", new Object[0]);
                            v(this, hVar, ot.f.RESULT_UNSUPPORTED_COMMAND, null, null, 12, null);
                            return;
                        }
                    default:
                        return;
                }
            }
        }
        g2 g11 = c11 != null ? c11.g() : null;
        switch (g11 == null ? -1 : d.f50556b[g11.ordinal()]) {
            case 1:
                s().C(bVar);
                return;
            case 2:
                s().x(bVar);
                return;
            case 3:
                s().B(bVar);
                return;
            case 4:
                s().w(bVar);
                return;
            case 5:
                s().z(bVar);
                return;
            case 6:
                s().t(bVar);
                return;
            case 7:
                s().v(bVar);
                return;
            default:
                v(this, hVar, ot.f.RESULT_UNSUPPORTED_COMMAND, null, null, 12, null);
                return;
        }
    }

    public static final void H(uu.h hVar, h hVar2, String str) {
        String n11 = hVar.n();
        hVar2.f50547k.put(str, n11);
        hVar2.f50546j.put(n11, hVar);
    }

    private final void I(final yt.b bVar) {
        for (uu.a aVar : this.f50540d.a(bVar)) {
            if (aVar instanceof a.C1205a) {
                D(((a.C1205a) aVar).a());
            } else if (aVar instanceof a.b) {
                a.b bVar2 = (a.b) aVar;
                final String f11 = bVar2.f();
                uu.h hVar = new uu.h(gu.q.b(gu.q.f28127a, f11, bVar, bVar2.e(), false, 8, null), new uu.d() { // from class: ss.g
                    {
                        h.this = this;
                    }

                    @Override // uu.d
                    public final void a(ot.e eVar) {
                        h.J(h.this, f11, bVar, eVar);
                    }
                }, null, bVar2.d(), bVar2.b(), 4, null);
                hVar.d(new i(hVar));
                this.f50540d.f(hVar);
                this.f50541e.f(true, f11, bVar, a());
                D(hVar);
            }
        }
    }

    public static final void J(h this$0, String vehicleId, yt.b domain, ot.e response) {
        s.g(this$0, "this$0");
        s.g(vehicleId, "$vehicleId");
        s.g(domain, "$domain");
        s.g(response, "response");
        this$0.f50541e.f(false, vehicleId, domain, this$0.a());
        if (us.d.a(response)) {
            this$0.I(domain);
            return;
        }
        for (uu.h hVar : this$0.f50540d.g(domain, vehicleId)) {
            v(this$0, hVar, ot.f.RESULT_DEPENDENT_SESSION_INFO_FAILURE, null, null, 12, null);
        }
    }

    private final com.teslamotors.plugins.ble.b s() {
        Object mo16getValue = this.f50545i.mo16getValue();
        s.f(mo16getValue, "<get-bleModuleHelper>(...)");
        return (com.teslamotors.plugins.ble.b) mo16getValue;
    }

    private final b t(uu.h hVar) {
        int intValue;
        w2 a11 = this.f50539c.a(hVar.P());
        String p11 = a11 == null ? null : et.a.p(a11);
        if (p11 == null) {
            p11 = hVar.Q();
        }
        Integer j11 = a11 == null ? null : et.a.j(a11);
        int intValue2 = (j11 == null && (j11 = hVar.u()) == null) ? 0 : j11.intValue();
        Integer f11 = a11 != null ? et.a.f(a11) : null;
        if (f11 == null) {
            Integer j12 = hVar.j();
            intValue = j12 == null ? 48 : j12.intValue();
        } else {
            intValue = f11.intValue();
        }
        return new b(p11, intValue2, intValue);
    }

    private final void u(uu.h hVar, ot.f fVar, com.tesla.data.oapi.j jVar, JSONObject jSONObject) {
        Map l11;
        String jSONObject2;
        a aVar = f50534l;
        String m11 = hVar.m();
        a.c(aVar, hVar, "failed to send " + m11, null, 2, null);
        String n11 = hVar.n();
        String uuid = UUID.randomUUID().toString();
        s.f(uuid, "randomUUID().toString()");
        ot.m a11 = a();
        if (jVar == null) {
            jSONObject2 = null;
        } else {
            l11 = s0.l(v.a("statusCode", Integer.valueOf(jVar.getCode())), v.a("error", jSONObject));
            jSONObject2 = new JSONObject(l11).toString();
        }
        hVar.a(new ot.e(n11, uuid, null, fVar, a11, 0, null, null, jSONObject2, null, 740, null));
    }

    static /* synthetic */ void v(h hVar, uu.h hVar2, ot.f fVar, com.tesla.data.oapi.j jVar, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            jVar = null;
        }
        if ((i11 & 8) != 0) {
            jSONObject = null;
        }
        hVar.u(hVar2, fVar, jVar, jSONObject);
    }

    public final void w(String str) {
        uu.h remove;
        String remove2 = this.f50547k.remove(str);
        if (remove2 != null && (remove = this.f50546j.remove(remove2)) != null) {
            remove.a(new ot.e(remove2, str, null, ot.f.RESULT_SUCCESS, a(), 0, null, null, null, null, 996, null));
        }
        s().G();
    }

    private final void x(uu.h hVar, ot.f fVar, String str, String str2, pt.a aVar) {
        String C = hVar.C();
        this.f50540d.j(C, hVar.n());
        if (hVar.s()) {
            a.c(f50534l, hVar, "request is already finished, not notifying listener", null, 2, null);
            return;
        }
        a aVar2 = f50534l;
        String a11 = ps.a.a(fVar);
        a.c(aVar2, hVar, "notifying listener command result: " + a11, null, 2, null);
        hVar.a(new ot.e(hVar.n(), C, str, fVar, a(), 0, null, aVar, str2, null, 608, null));
    }

    private final void y() {
        gv.h.a().A(new ky.h() { // from class: ss.f
            {
                h.this = this;
            }

            @Override // ky.h
            public final Object apply(Object obj) {
                h.c B;
                B = h.B(h.this, (com.teslamotors.plugins.ble.c) obj);
                return B;
            }
        }).M(bz.a.c()).o(new ky.f() { // from class: ss.e
            @Override // ky.f
            public final void accept(Object obj) {
                h.C((Throwable) obj);
            }
        }).I(new ky.f() { // from class: ss.b
            {
                h.this = this;
            }

            @Override // ky.f
            public final void accept(Object obj) {
                h.z(h.this, (h.c) obj);
            }
        });
    }

    public static final void z(final h this$0, c cVar) {
        s.g(this$0, "this$0");
        if (cVar instanceof c.a) {
            uu.h a11 = ((c.a) cVar).a();
            if (a11 == null) {
                return;
            }
            v(this$0, a11, ot.f.RESULT_MESSAGE_EVALUATION_FAILURE, null, null, 12, null);
        } else if (cVar instanceof c.b) {
            c.b bVar = (c.b) cVar;
            final uu.h a12 = bVar.a();
            bVar.b();
            c.a c11 = bVar.c();
            ot.f a13 = c11.a();
            String b11 = c11.b();
            String c12 = c11.c();
            pt.a d11 = c11.d();
            String e11 = c11.e();
            c11.f();
            if (a12 != null) {
                ot.f g11 = c11.g();
                a12.c("command_result=" + g11);
            }
            if (d11 != null && a12 != null) {
                a12.c("generic_nominal_error=" + d11);
            }
            if (e11 != null && a12 != null) {
                a12.c("car_server_error_result_reason=" + e11);
            }
            if (a12 != null) {
                a12.c("evaluation_done");
            }
            if (a12 == null) {
                f50534l.b(a12, "-> no request found, doing nothing more.", com.tesla.logging.d.ERROR);
            } else if (a13 == null) {
                a aVar = f50534l;
                aVar.b(a12, "-> command result was " + a13 + " doing nothing more.", com.tesla.logging.d.DEBUG);
            } else {
                a12.c0();
                xs.a a14 = us.a.a(a13, a12);
                if (a14.b()) {
                    a12.S(a13);
                    hy.b.j(a14.a(), TimeUnit.SECONDS).i(bz.a.c()).g(new ky.a() { // from class: ss.a
                        @Override // ky.a
                        public final void run() {
                            h.A(a12, this$0);
                        }
                    });
                    return;
                }
                this$0.x(a12, a13, b11, c12, d11);
            }
        }
    }

    @Override // ss.i
    public ot.m a() {
        return this.f50543g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0049, code lost:
        if (((r1 == null || com.tesla.data.oapi.c.u(r1)) ? false : true) != false) goto L49;
     */
    @Override // ss.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(ot.c r17, uu.d r18) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.h.b(ot.c, uu.d):void");
    }

    @Override // ss.j
    public void c(ot.c request) {
        s.g(request, "request");
        uu.h e11 = this.f50540d.e(gu.c.d(request));
        if (e11 == null) {
            us.c.b(request, "failed to cancel, no request found.", f50535m, com.tesla.logging.d.DEBUG);
        } else if (e11.s()) {
            f50534l.b(e11, "failed to cancel, request already finished.", com.tesla.logging.d.ERROR);
        } else {
            f50534l.b(e11, "canceling request as result timeout.", com.tesla.logging.d.ERROR);
            e11.g0(a());
        }
    }
}