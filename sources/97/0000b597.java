package ts;

import android.content.Context;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.squareup.wire.ProtoAdapter;
import com.tesla.command.VehicleConnectivityStateManager;
import com.tesla.features.FeaturesConfig;
import com.tesla.features.Signaling;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.a;
import com.tesla.messagedecoding.CommandMessageDecoder;
import gu.a;
import gu.k;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lt.d2;
import lt.j2;
import lt.w2;
import mt.v;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import ts.c;
import ts.e0;
import uu.a;
import uu.f;
import wz.r0;
import wz.x0;

/* loaded from: classes6.dex */
public final class e0 implements ss.j, ss.i {
    public static final a A = new a(null);
    private static final com.tesla.logging.g B = com.tesla.logging.g.f21878b.a("Hermes");

    /* renamed from: a */
    private final yu.m f52437a;

    /* renamed from: b */
    private final yu.e f52438b;

    /* renamed from: c */
    private final es.c f52439c;

    /* renamed from: d */
    private final ys.e f52440d;

    /* renamed from: e */
    private final ys.i f52441e;

    /* renamed from: f */
    private final uu.f f52442f;

    /* renamed from: g */
    private final vu.a f52443g;

    /* renamed from: h */
    private final yu.z f52444h;

    /* renamed from: i */
    private final Context f52445i;

    /* renamed from: j */
    private final it.d f52446j;

    /* renamed from: k */
    private final zu.c f52447k;

    /* renamed from: l */
    private final gu.p f52448l;

    /* renamed from: m */
    private final cz.e<vz.b0> f52449m;

    /* renamed from: n */
    private final cz.e<c> f52450n;

    /* renamed from: o */
    private final cz.e<vz.b0> f52451o;

    /* renamed from: p */
    private final ot.m f52452p;

    /* renamed from: q */
    private WebSocket f52453q;

    /* renamed from: r */
    private String f52454r;

    /* renamed from: s */
    private e f52455s;

    /* renamed from: t */
    private final cz.e<e> f52456t;

    /* renamed from: u */
    private cz.e<uu.h> f52457u;

    /* renamed from: v */
    private iy.b f52458v;

    /* renamed from: w */
    private cz.e<okio.i> f52459w;

    /* renamed from: x */
    private iy.b f52460x;

    /* renamed from: y */
    private final zu.p f52461y;

    /* renamed from: z */
    private final m f52462z;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss.j a(Context context, yu.z teslaClient, vu.a sessionManager, uu.f requestManager, yu.m remoteLog, yu.e getVehicleData, es.c analyticsService, ys.e getToken, ys.i getVehicleToken, it.d featuresConfigRepository, zu.c appState, gu.p routableMessageBuilder) {
            kotlin.jvm.internal.s.g(context, "context");
            kotlin.jvm.internal.s.g(teslaClient, "teslaClient");
            kotlin.jvm.internal.s.g(sessionManager, "sessionManager");
            kotlin.jvm.internal.s.g(requestManager, "requestManager");
            kotlin.jvm.internal.s.g(remoteLog, "remoteLog");
            kotlin.jvm.internal.s.g(getVehicleData, "getVehicleData");
            kotlin.jvm.internal.s.g(analyticsService, "analyticsService");
            kotlin.jvm.internal.s.g(getToken, "getToken");
            kotlin.jvm.internal.s.g(getVehicleToken, "getVehicleToken");
            kotlin.jvm.internal.s.g(featuresConfigRepository, "featuresConfigRepository");
            kotlin.jvm.internal.s.g(appState, "appState");
            kotlin.jvm.internal.s.g(routableMessageBuilder, "routableMessageBuilder");
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.s.f(applicationContext, "applicationContext");
            return new e0(remoteLog, getVehicleData, analyticsService, getToken, getVehicleToken, requestManager, sessionManager, teslaClient, applicationContext, featuresConfigRepository, appState, routableMessageBuilder, null);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* renamed from: a */
        private final gu.k f52463a;

        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: b */
            private final gu.k f52464b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(gu.k params) {
                super(params, null);
                kotlin.jvm.internal.s.g(params, "params");
                this.f52464b = params;
            }

            @Override // ts.e0.b
            public gu.k a() {
                return this.f52464b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.s.c(a(), ((a) obj).a());
            }

            public int hashCode() {
                return a().hashCode();
            }

            public String toString() {
                gu.k a11 = a();
                return "EmailLookupFailure(params=" + a11 + ")";
            }
        }

        /* renamed from: ts.e0$b$b */
        /* loaded from: classes6.dex */
        public static final class C1159b extends b {

            /* renamed from: b */
            private final gu.k f52465b;

            /* renamed from: c */
            private final gu.a f52466c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1159b(gu.k params, gu.a message) {
                super(params, null);
                kotlin.jvm.internal.s.g(params, "params");
                kotlin.jvm.internal.s.g(message, "message");
                this.f52465b = params;
                this.f52466c = message;
            }

            @Override // ts.e0.b
            public gu.k a() {
                return this.f52465b;
            }

            public final gu.a b() {
                return this.f52466c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C1159b) {
                    C1159b c1159b = (C1159b) obj;
                    return kotlin.jvm.internal.s.c(a(), c1159b.a()) && kotlin.jvm.internal.s.c(this.f52466c, c1159b.f52466c);
                }
                return false;
            }

            public int hashCode() {
                return (a().hashCode() * 31) + this.f52466c.hashCode();
            }

            public String toString() {
                gu.k a11 = a();
                gu.a aVar = this.f52466c;
                return "Success(params=" + a11 + ", message=" + aVar + ")";
            }
        }

        /* loaded from: classes6.dex */
        public static final class c extends b {

            /* renamed from: b */
            private final gu.k f52467b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(gu.k params) {
                super(params, null);
                kotlin.jvm.internal.s.g(params, "params");
                this.f52467b = params;
            }

            @Override // ts.e0.b
            public gu.k a() {
                return this.f52467b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && kotlin.jvm.internal.s.c(a(), ((c) obj).a());
            }

            public int hashCode() {
                return a().hashCode();
            }

            public String toString() {
                gu.k a11 = a();
                return "VehicleTokenFailure(params=" + a11 + ")";
            }
        }

        private b(gu.k kVar) {
            this.f52463a = kVar;
        }

        public /* synthetic */ b(gu.k kVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(kVar);
        }

        public gu.k a() {
            return this.f52463a;
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class c {

        /* renamed from: a */
        private final String f52468a;

        /* loaded from: classes6.dex */
        public static final class a extends c {

            /* renamed from: b */
            private final String f52469b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String identifier) {
                super(identifier, null);
                kotlin.jvm.internal.s.g(identifier, "identifier");
                this.f52469b = identifier;
            }

            @Override // ts.e0.c
            public String a() {
                return this.f52469b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.s.c(a(), ((a) obj).a());
            }

            public int hashCode() {
                return a().hashCode();
            }

            public String toString() {
                String a11 = a();
                return "ended(" + a11 + ")";
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends c {

            /* renamed from: b */
            private final String f52470b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String identifier) {
                super(identifier, null);
                kotlin.jvm.internal.s.g(identifier, "identifier");
                this.f52470b = identifier;
            }

            @Override // ts.e0.c
            public String a() {
                return this.f52470b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && kotlin.jvm.internal.s.c(a(), ((b) obj).a());
            }

            public int hashCode() {
                return a().hashCode();
            }

            public String toString() {
                String a11 = a();
                return "started(" + a11 + ")";
            }
        }

        private c(String str) {
            this.f52468a = str;
        }

        public /* synthetic */ c(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public String a() {
            return this.f52468a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class d {

        /* renamed from: a */
        private final qt.d f52471a;

        /* renamed from: b */
        private final CommandMessageDecoder.Result f52472b;

        public d(qt.d message, CommandMessageDecoder.Result result) {
            kotlin.jvm.internal.s.g(message, "message");
            this.f52471a = message;
            this.f52472b = result;
        }

        public final qt.d a() {
            return this.f52471a;
        }

        public final CommandMessageDecoder.Result b() {
            return this.f52472b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return kotlin.jvm.internal.s.c(this.f52471a, dVar.f52471a) && kotlin.jvm.internal.s.c(this.f52472b, dVar.f52472b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f52471a.hashCode() * 31;
            CommandMessageDecoder.Result result = this.f52472b;
            return hashCode + (result == null ? 0 : result.hashCode());
        }

        public String toString() {
            qt.d dVar = this.f52471a;
            CommandMessageDecoder.Result result = this.f52472b;
            return "SocketMessageResult(message=" + dVar + ", decodedMessageResult=" + result + ")";
        }
    }

    /* loaded from: classes6.dex */
    public enum e {
        OPENING,
        OPENED,
        CLOSING,
        CLOSED;

        public final boolean isOpeningOrOpened() {
            return this == OPENING || this == OPENED;
        }
    }

    /* loaded from: classes6.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.l<uu.h, vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f() {
            super(1);
            e0.this = r1;
        }

        public final void a(uu.h it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            ts.b.f52420a.c(e0.this.f52445i, e0.this.f52437a, it2, e0.this.f52454r, e0.this.f52438b, e0.this.a(), ot.f.RESULT_TIMEOUT, (r35 & 128) != 0 ? null : null, (r35 & 256) != 0 ? null : null, (r35 & 512) != 0 ? null : null, (r35 & 1024) != 0 ? null : null, (r35 & 2048) != 0 ? null : e0.B, (r35 & 4096) != 0 ? null : null, (r35 & PKIFailureInfo.certRevoked) != 0 ? null : "session info timeout", (r35 & 16384) != 0 ? false : false);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(uu.h hVar) {
            a(hVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class g extends WebSocketListener {

        /* renamed from: a */
        final /* synthetic */ String f52474a;

        /* renamed from: b */
        final /* synthetic */ e0 f52475b;

        g(String str, e0 e0Var) {
            this.f52474a = str;
            this.f52475b = e0Var;
        }

        public final boolean a() {
            return kotlin.jvm.internal.s.c(this.f52474a, this.f52475b.f52454r);
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int i11, String reason) {
            kotlin.jvm.internal.s.g(webSocket, "webSocket");
            kotlin.jvm.internal.s.g(reason, "reason");
            super.onClosed(webSocket, i11, reason);
            if (a()) {
                e0 e0Var = this.f52475b;
                synchronized (this) {
                    com.tesla.logging.g gVar = e0.B;
                    gVar.i("onClosed called: " + i11 + " " + reason);
                    e0Var.u0(e.CLOSED);
                    vz.b0 b0Var = vz.b0.f54756a;
                }
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, int i11, String reason) {
            kotlin.jvm.internal.s.g(webSocket, "webSocket");
            kotlin.jvm.internal.s.g(reason, "reason");
            super.onClosing(webSocket, i11, reason);
            if (a()) {
                e0 e0Var = this.f52475b;
                synchronized (this) {
                    com.tesla.logging.g gVar = e0.B;
                    gVar.i("onClosing called: " + i11 + " " + reason);
                    e0Var.u0(e.CLOSING);
                    vz.b0 b0Var = vz.b0.f54756a;
                }
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable t11, Response response) {
            kotlin.jvm.internal.s.g(webSocket, "webSocket");
            kotlin.jvm.internal.s.g(t11, "t");
            super.onFailure(webSocket, t11, response);
            if (a()) {
                e0 e0Var = this.f52475b;
                synchronized (this) {
                    com.tesla.logging.g gVar = e0.B;
                    String response2 = response == null ? null : response.toString();
                    gVar.d("onFailure called: " + response2, t11);
                    e0Var.u0(e.CLOSED);
                    e0Var.f52461y.f();
                    vz.b0 b0Var = vz.b0.f54756a;
                }
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, okio.i bytes) {
            kotlin.jvm.internal.s.g(webSocket, "webSocket");
            kotlin.jvm.internal.s.g(bytes, "bytes");
            super.onMessage(webSocket, bytes);
            if (a()) {
                this.f52475b.f52459w.b(bytes);
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            kotlin.jvm.internal.s.g(webSocket, "webSocket");
            kotlin.jvm.internal.s.g(response, "response");
            super.onOpen(webSocket, response);
            if (a()) {
                e0 e0Var = this.f52475b;
                synchronized (this) {
                    com.tesla.logging.g gVar = e0.B;
                    gVar.i("onOpen called: " + response);
                    e0Var.f52451o.b(vz.b0.f54756a);
                    e0Var.u0(e.OPENED);
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h() {
            super(0);
            e0.this = r1;
        }

        public static final vz.b0 b(e0 this$0) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            this$0.b0();
            return vz.b0.f54756a;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo11invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            final e0 e0Var = e0.this;
            hy.b.e(new Callable() { // from class: ts.f0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    vz.b0 b11;
                    b11 = e0.h.b(e0Var);
                    return b11;
                }
            }).i(bz.a.c()).f();
        }
    }

    /* loaded from: classes6.dex */
    static final class i extends kotlin.jvm.internal.u implements h00.l<uu.h, vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i() {
            super(1);
            e0.this = r1;
        }

        public final void a(uu.h it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            ts.b.f52420a.c(e0.this.f52445i, e0.this.f52437a, it2, e0.this.f52454r, e0.this.f52438b, e0.this.a(), ot.f.RESULT_TIMEOUT, (r35 & 128) != 0 ? null : null, (r35 & 256) != 0 ? null : null, (r35 & 512) != 0 ? null : null, (r35 & 1024) != 0 ? null : null, (r35 & 2048) != 0 ? null : e0.B, (r35 & 4096) != 0 ? null : null, (r35 & PKIFailureInfo.certRevoked) != 0 ? null : "timeout from send", (r35 & 16384) != 0 ? false : false);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(uu.h hVar) {
            a(hVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class j extends kotlin.jvm.internal.u implements h00.p<uu.h, ot.f, vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j() {
            super(2);
            e0.this = r1;
        }

        public final void a(uu.h finishedRequest, ot.f noName_1) {
            kotlin.jvm.internal.s.g(finishedRequest, "finishedRequest");
            kotlin.jvm.internal.s.g(noName_1, "$noName_1");
            e0.this.b1(finishedRequest);
            g0.f52488a.f(finishedRequest);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(uu.h hVar, ot.f fVar) {
            a(hVar, fVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class k extends dz.a<Long> {

        /* renamed from: b */
        final /* synthetic */ uu.h f52479b;

        /* renamed from: c */
        final /* synthetic */ e0 f52480c;

        /* renamed from: d */
        final /* synthetic */ gu.k f52481d;

        /* renamed from: e */
        final /* synthetic */ qt.d f52482e;

        k(uu.h hVar, e0 e0Var, gu.k kVar, qt.d dVar) {
            this.f52479b = hVar;
            this.f52480c = e0Var;
            this.f52481d = kVar;
            this.f52482e = dVar;
        }

        @Override // b80.b
        public /* bridge */ /* synthetic */ void b(Object obj) {
            h(((Number) obj).longValue());
        }

        public void h(long j11) {
            if (this.f52479b.s()) {
                this.f52480c.m0(this.f52479b, "not resending, it's finished.", com.tesla.logging.d.DEBUG);
                dispose();
                return;
            }
            e0 e0Var = this.f52480c;
            uu.h hVar = this.f52479b;
            int R = hVar.R();
            e0.n0(e0Var, hVar, "<- resending, resent count: " + R, null, 2, null);
            e0.A0(this.f52480c, this.f52479b, this.f52481d, this.f52482e);
        }

        @Override // b80.b
        public void onComplete() {
            this.f52480c.m0(this.f52479b, "onComplete called for repeating request", com.tesla.logging.d.DEBUG);
        }

        @Override // b80.b
        public void onError(Throwable th2) {
            e0.B.d("error in repeating request", th2);
        }
    }

    /* loaded from: classes6.dex */
    public static final class l extends kotlin.jvm.internal.u implements h00.l<uu.a, CharSequence> {

        /* renamed from: a */
        public static final l f52483a = new l();

        l() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence mo12invoke(uu.a it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            if (it2 instanceof a.C1205a) {
                return ((a.C1205a) it2).a().m();
            }
            if (it2 instanceof a.b) {
                return "session info request";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* loaded from: classes6.dex */
    public static final class m implements h0 {
        m() {
            e0.this = r1;
        }

        @Override // ts.h0
        public void a(String vehicleId) {
            kotlin.jvm.internal.s.g(vehicleId, "vehicleId");
            e0.B.i("Deleting vehicle token");
            e0 e0Var = e0.this;
            synchronized (this) {
                ys.i iVar = e0Var.f52441e;
                String i02 = e0Var.i0();
                kotlin.jvm.internal.s.e(i02);
                iVar.e(i02, vehicleId);
                vz.b0 b0Var = vz.b0.f54756a;
            }
        }

        @Override // ts.h0
        public void b() {
            e0.B.i("Deleting user token and reconnecting to web socket");
            e0 e0Var = e0.this;
            synchronized (this) {
                ys.e eVar = e0Var.f52440d;
                String i02 = e0Var.i0();
                kotlin.jvm.internal.s.e(i02);
                eVar.e(i02);
                e0.B.i("User token invalid, killing and restarting hermes!");
                e0Var.l0();
                e0Var.f52461y.i();
                vz.b0 b0Var = vz.b0.f54756a;
            }
        }
    }

    private e0(yu.m mVar, yu.e eVar, es.c cVar, ys.e eVar2, ys.i iVar, uu.f fVar, vu.a aVar, yu.z zVar, Context context, it.d dVar, zu.c cVar2, gu.p pVar) {
        this.f52437a = mVar;
        this.f52438b = eVar;
        this.f52439c = cVar;
        this.f52440d = eVar2;
        this.f52441e = iVar;
        this.f52442f = fVar;
        this.f52443g = aVar;
        this.f52444h = zVar;
        this.f52445i = context;
        this.f52446j = dVar;
        this.f52447k = cVar2;
        this.f52448l = pVar;
        this.f52449m = cz.c.W().U();
        this.f52450n = cz.a.W().U();
        this.f52451o = cz.b.W().U();
        this.f52452p = ot.m.TRANSPORT_HERMES;
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.f(uuid, "randomUUID().toString()");
        this.f52454r = uuid;
        this.f52455s = e.CLOSED;
        this.f52456t = cz.f.V().U();
        this.f52457u = cz.f.V().U();
        this.f52458v = iy.b.e();
        this.f52459w = cz.f.V().U();
        this.f52460x = iy.b.e();
        this.f52461y = new zu.p(0L, null, new h(), 3, null);
        this.f52462z = new m();
        D0();
        X0();
        R0();
        M0();
    }

    public /* synthetic */ e0(yu.m mVar, yu.e eVar, es.c cVar, ys.e eVar2, ys.i iVar, uu.f fVar, vu.a aVar, yu.z zVar, Context context, it.d dVar, zu.c cVar2, gu.p pVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, eVar, cVar, eVar2, iVar, fVar, aVar, zVar, context, dVar, cVar2, pVar);
    }

    public static final boolean A0(e0 e0Var, uu.h hVar, gu.k kVar, qt.d dVar) {
        List<jt.f> l11;
        if (e0Var.f52453q == null) {
            n0(e0Var, hVar, "socket is null, adding request back to request manager, not sending.", null, 2, null);
            hVar.c("send_over_hermes_failure_socket_is_null");
            kVar.c().f0(ot.h.WEBSOCKET_CONNECTING);
            X(e0Var, hVar, 0L, 2, null);
            return false;
        }
        hVar.f0(ot.h.READY);
        n0(e0Var, hVar, "<- sending", null, 2, null);
        WebSocket webSocket = e0Var.f52453q;
        kotlin.jvm.internal.s.e(webSocket);
        boolean w02 = e0Var.w0(webSocket, dVar);
        hVar.c("send_over_hermes_sent_message_sent:" + w02);
        es.c cVar = e0Var.f52439c;
        jt.d dVar2 = jt.d.SEND_FILLED_REQUEST;
        jt.f[] fVarArr = new jt.f[3];
        fVarArr[0] = w02 ? fs.a.g() : fs.a.b();
        os.b bVar = os.b.f43973a;
        fVarArr[1] = bVar.e(e0Var.a());
        fVarArr[2] = bVar.b(kVar.c().A());
        l11 = wz.w.l(fVarArr);
        cVar.a(dVar2, l11);
        return w02;
    }

    private final void B0(final yt.b bVar) {
        String l02;
        com.tesla.logging.g gVar = B;
        com.tesla.logging.g n11 = gVar.n("sendPendingRequests(" + bVar + ")");
        e eVar = this.f52455s;
        if (eVar != e.OPENED) {
            if (eVar != e.OPENING) {
                n11.a("calling initialize()");
                this.f52449m.b(vz.b0.f54756a);
            }
            n11.a("socket isn't open, doing nothing more.");
            return;
        }
        List<uu.a> a11 = this.f52442f.a(bVar);
        if (a11.isEmpty()) {
            n11.a("no actionable requests " + bVar);
        } else {
            l02 = wz.e0.l0(a11, null, null, null, 0, null, l.f52483a, 31, null);
            n11.a("actionable requests " + bVar + " => " + l02);
        }
        for (uu.a aVar : a11) {
            if (aVar instanceof a.C1205a) {
                x0(((a.C1205a) aVar).a());
            } else if (aVar instanceof a.b) {
                a.b bVar2 = (a.b) aVar;
                final String f11 = bVar2.f();
                uu.h Z = Z(f11, bVar, bVar2, new uu.d() { // from class: ts.v
                    {
                        e0.this = this;
                    }

                    @Override // uu.d
                    public final void a(ot.e eVar2) {
                        e0.C0(e0.this, bVar, f11, eVar2);
                    }
                });
                this.f52442f.f(Z);
                this.f52443g.f(true, f11, bVar, a());
                x0(Z);
            }
        }
    }

    public static final void C0(e0 this$0, yt.b domain, String vehicleId, ot.e response) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(domain, "$domain");
        kotlin.jvm.internal.s.g(vehicleId, "$vehicleId");
        kotlin.jvm.internal.s.g(response, "response");
        if (us.a.b(response.h())) {
            this$0.B0(domain);
            return;
        }
        com.tesla.logging.g gVar = B;
        String e11 = ps.a.e(domain);
        gVar.i("failed to fetch session info for domain " + e11);
        for (uu.h hVar : this$0.f52442f.g(domain, vehicleId)) {
            this$0.r0("session info response failure", hVar, ot.f.RESULT_DEPENDENT_SESSION_INFO_FAILURE);
        }
    }

    private final void D0() {
        Map f11;
        if (!this.f52457u.R() && !this.f52457u.T() && !this.f52458v.isDisposed()) {
            if (this.f52457u.S()) {
                return;
            }
        } else {
            com.tesla.logging.g gVar = B;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(vz.v.a(h11, "requests stream or observer in error state, setup requests stream again."));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception("requests stream or observer in error state, setup requests stream again."));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a("requests stream or observer in error state, setup requests stream again.", new Object[0]);
            this.f52457u.onComplete();
            this.f52457u = cz.f.V().U();
        }
        this.f52458v.dispose();
        B.a("Setting up requests stream...");
        this.f52458v = this.f52457u.U().M(bz.a.c()).m(new ky.a() { // from class: ts.w
            @Override // ky.a
            public final void run() {
                e0.E0();
            }
        }).o(new ky.f() { // from class: ts.g
            @Override // ky.f
            public final void accept(Object obj) {
                e0.F0((Throwable) obj);
            }
        }).A(new ky.h() { // from class: ts.l
            {
                e0.this = this;
            }

            @Override // ky.h
            public final Object apply(Object obj) {
                gu.k G0;
                G0 = e0.G0(e0.this, (uu.h) obj);
                return G0;
            }
        }).t(new ky.h() { // from class: ts.k
            {
                e0.this = this;
            }

            @Override // ky.h
            public final Object apply(Object obj) {
                hy.j H0;
                H0 = e0.H0(e0.this, (gu.k) obj);
                return H0;
            }
        }).J(new ky.f() { // from class: ts.y
            {
                e0.this = this;
            }

            @Override // ky.f
            public final void accept(Object obj) {
                e0.K0(e0.this, (e0.b) obj);
            }
        }, new ky.f() { // from class: ts.c0
            {
                e0.this = this;
            }

            @Override // ky.f
            public final void accept(Object obj) {
                e0.L0(e0.this, (Throwable) obj);
            }
        });
    }

    public static final void E0() {
        B.i("Disposed of command requests stream");
    }

    public static final void F0(Throwable th2) {
        B.d("Error in command requests stream", th2);
    }

    public static final gu.k G0(e0 this$0, uu.h request) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        String P = request.P();
        request.c("entered_request_flow");
        vu.c e11 = this$0.f52443g.e(com.tesla.data.oapi.d.a(request.i()), P);
        request.c("building_params_start");
        k.a aVar = gu.k.f28105h;
        String str = this$0.f52454r;
        yu.e eVar = this$0.f52438b;
        Context context = this$0.f52445i;
        int r11 = request.r();
        kotlin.jvm.internal.s.f(request, "request");
        gu.k a11 = aVar.a(str, request, context, r11, eVar, e11);
        request.c("building_params_done");
        this$0.m0(request, "<- params built", com.tesla.logging.d.DEBUG);
        return a11;
    }

    public static final hy.j H0(final e0 this$0, final gu.k params) {
        Map f11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        final uu.h c11 = params.c();
        if (this$0.i0() == null) {
            com.tesla.logging.g gVar = B;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(vz.v.a(h11, "Email is null"));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception("Email is null"));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a("Email is null", new Object[0]);
            c11.c("email_null");
            kotlin.jvm.internal.s.f(params, "params");
            return hy.i.z(new b.a(params));
        }
        c11.f0(ot.h.FETCHING_VEHICLE_TOKEN);
        c11.c("vehicle_token_fetch_start");
        ys.i iVar = this$0.f52441e;
        String str = this$0.f52454r;
        String i02 = this$0.i0();
        kotlin.jvm.internal.s.e(i02);
        return iVar.f(i02, str, params.d()).k(new ky.h() { // from class: ts.p
            @Override // ky.h
            public final Object apply(Object obj) {
                hy.q I0;
                I0 = e0.I0(c11, params, this$0, (zu.c0) obj);
                return I0;
            }
        }).z();
    }

    public static final hy.q I0(final uu.h request, final gu.k params, final e0 this$0, zu.c0 c0Var) {
        vz.b0 b0Var;
        Map f11;
        kotlin.jvm.internal.s.g(request, "$request");
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (c0Var.c()) {
            request.c("vehicle_token_fetch_failure");
            Throwable a11 = c0Var.a();
            if (a11 == null) {
                b0Var = null;
            } else {
                B.d("Hermes vehicle token failure", a11);
                b0Var = vz.b0.f54756a;
            }
            if (b0Var == null) {
                com.tesla.logging.g gVar = B;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String h11 = gVar.h();
                ht.a aVar = ht.a.f29422a;
                f11 = r0.f(vz.v.a(h11, "Hermes vehicle token failure"));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : f11.entrySet()) {
                    ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception("Hermes vehicle token failure"));
                TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
                n80.a.a("Hermes vehicle token failure", new Object[0]);
            }
            kotlin.jvm.internal.s.f(params, "params");
            return hy.m.n(new b.c(params));
        }
        request.c("vehicle_token_fetch_done");
        request.c("message_build_start");
        gu.j jVar = gu.j.f28104a;
        kotlin.jvm.internal.s.f(params, "params");
        String cVar = ((com.auth0.android.jwt.c) c0Var.b()).toString();
        kotlin.jvm.internal.s.f(cVar, "result.getOrThrow().toString()");
        return jVar.d(params, cVar, this$0.f52448l).o(new ky.h() { // from class: ts.j
            @Override // ky.h
            public final Object apply(Object obj) {
                e0.b.C1159b J0;
                J0 = e0.J0(params, request, this$0, (gu.a) obj);
                return J0;
            }
        });
    }

    public static final b.C1159b J0(gu.k params, uu.h request, e0 this$0, gu.a it2) {
        kotlin.jvm.internal.s.g(request, "$request");
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.f(params, "params");
        kotlin.jvm.internal.s.f(it2, "it");
        b.C1159b c1159b = new b.C1159b(params, it2);
        request.c("message_build_done");
        this$0.m0(params.c(), "<- message built", com.tesla.logging.d.DEBUG);
        return c1159b;
    }

    public static final void K0(e0 this$0, b bVar) {
        Map f11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        gu.k a11 = bVar.a();
        uu.h c11 = a11.c();
        if (c11.s()) {
            n0(this$0, c11, "request is finished, not sending over hermes.", null, 2, null);
        } else if (bVar instanceof b.a) {
            com.tesla.logging.g gVar = B;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(vz.v.a(h11, "email lookup failed"));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception("email lookup failed"));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a("email lookup failed", new Object[0]);
            s0(this$0, "email lookup failed", c11, null, 4, null);
        } else if (bVar instanceof b.c) {
            B.i("Vehicle token failure");
            this$0.V(c11, 0L);
        } else if (bVar instanceof b.C1159b) {
            gu.a b11 = ((b.C1159b) bVar).b();
            if (b11 instanceof a.C0535a) {
                n0(this$0, c11, "error occurred building proto message", null, 2, null);
                B.d("error occurred building proto message", ((a.C0535a) b11).a());
                s0(this$0, "error occurred building proto message", c11, null, 4, null);
            } else if (b11 instanceof a.b) {
                if (this$0.f52455s != e.OPENED) {
                    c11.c("socket_state_not_open");
                    e eVar = this$0.f52455s;
                    n0(this$0, c11, "socket in state " + eVar + ", adding request back to request manager, not sending over hermes.", null, 2, null);
                    a11.c().f0(ot.h.WEBSOCKET_CONNECTING);
                    X(this$0, c11, 0L, 2, null);
                } else {
                    c11.c("send_over_hermes_start");
                    this$0.y0(c11, ((a.b) b11).a(), a11);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            zu.b.a(vz.b0.f54756a);
        }
    }

    public static final void L0(e0 this$0, Throwable th2) {
        vz.b0 b0Var;
        uu.h c11;
        uu.h i11;
        Map f11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (th2 instanceof gu.r) {
            gu.r rVar = (gu.r) th2;
            gu.k a11 = rVar.a();
            String b11 = rVar.b();
            Throwable c12 = rVar.c();
            String str = "error in request processing msg: " + b11;
            if (c12 == null) {
                b0Var = null;
            } else {
                B.d(str, c12);
                b0Var = vz.b0.f54756a;
            }
            if (b0Var == null) {
                com.tesla.logging.g gVar = B;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String h11 = gVar.h();
                ht.a aVar = ht.a.f29422a;
                f11 = r0.f(vz.v.a(h11, str));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : f11.entrySet()) {
                    ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(str));
                TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
                n80.a.a(str, new Object[0]);
            }
            if (a11 == null || (c11 = a11.c()) == null || (i11 = this$0.f52442f.i(c11.n())) == null) {
                return;
            }
            s0(this$0, str, i11, null, 4, null);
            return;
        }
        B.f("error in request processing", th2);
    }

    private final void M0() {
        hy.i.e(this.f52451o, this.f52447k.h().k().s(new ky.i() { // from class: ts.s
            @Override // ky.i
            public final boolean test(Object obj) {
                boolean N0;
                N0 = e0.N0((Boolean) obj);
                return N0;
            }
        }), this.f52450n.D(new LinkedHashSet(), new ky.c() { // from class: ts.x
            @Override // ky.c
            public final Object a(Object obj, Object obj2) {
                Set O0;
                O0 = e0.O0((Set) obj, (e0.c) obj2);
                return O0;
            }
        }), new ky.g() { // from class: ts.i
            @Override // ky.g
            public final Object a(Object obj, Object obj2, Object obj3) {
                Set P0;
                P0 = e0.P0((vz.b0) obj, (Boolean) obj2, (Set) obj3);
                return P0;
            }
        }).i(5L, TimeUnit.SECONDS).M(bz.a.c()).I(new ky.f() { // from class: ts.e
            {
                e0.this = this;
            }

            @Override // ky.f
            public final void accept(Object obj) {
                e0.Q0(e0.this, (Set) obj);
            }
        });
    }

    public static final boolean N0(Boolean it2) {
        kotlin.jvm.internal.s.f(it2, "it");
        return it2.booleanValue();
    }

    public static final Set O0(Set set, c incoming) {
        if (incoming instanceof c.b) {
            kotlin.jvm.internal.s.f(incoming, "incoming");
            set.add(incoming);
        } else if (incoming instanceof c.a) {
            set.remove(new c.b(incoming.a()));
        }
        return set;
    }

    public static final Set P0(vz.b0 b0Var, Boolean bool, Set set) {
        return set;
    }

    public static final void Q0(e0 this$0, Set set) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        synchronized (this$0) {
            boolean e11 = this$0.f52447k.e();
            if (e11 && set.isEmpty()) {
                B.a("app is backgrounded && no more requests, killing hermes!");
                this$0.l0();
            } else if (e11) {
                B.a("app is backgrounded but still has on-going requests to process");
            }
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    private final void R0() {
        B.a("setting up hermes called.");
        this.f52449m.H(vz.b0.f54756a).q(new ky.f() { // from class: ts.h
            @Override // ky.f
            public final void accept(Object obj) {
                e0.S0((vz.b0) obj);
            }
        }).M(bz.a.c()).N(new ky.h() { // from class: ts.n
            {
                e0.this = this;
            }

            @Override // ky.h
            public final Object apply(Object obj) {
                hy.j T0;
                T0 = e0.T0(e0.this, (vz.b0) obj);
                return T0;
            }
        }).A(new ky.h() { // from class: ts.m
            {
                e0.this = this;
            }

            @Override // ky.h
            public final Object apply(Object obj) {
                FeaturesConfig V0;
                V0 = e0.V0(e0.this, (Boolean) obj);
                return V0;
            }
        }).M(bz.a.c()).B(bz.a.c()).I(new ky.f() { // from class: ts.a0
            {
                e0.this = this;
            }

            @Override // ky.f
            public final void accept(Object obj) {
                e0.W0(e0.this, (FeaturesConfig) obj);
            }
        });
    }

    public static final void S0(vz.b0 b0Var) {
        B.a("initialize hermes request event fired!");
    }

    public static final hy.j T0(e0 this$0, vz.b0 b0Var) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        return this$0.f52447k.h().H(Boolean.FALSE).s(new ky.i() { // from class: ts.t
            @Override // ky.i
            public final boolean test(Object obj) {
                boolean U0;
                U0 = e0.U0((Boolean) obj);
                return U0;
            }
        }).M(bz.a.c());
    }

    public static final boolean U0(Boolean bool) {
        return !bool.booleanValue();
    }

    private final void V(final uu.h hVar, long j11) {
        hVar.c("addRequestToManager delay:" + j11);
        n0(this, hVar, "addRequestToManager called with " + j11 + " millis delay", null, 2, null);
        if (j11 <= 0) {
            W(this, hVar);
        } else {
            hy.b.j(j11, TimeUnit.MILLISECONDS).g(new ky.a() { // from class: ts.d
                {
                    e0.this = this;
                }

                @Override // ky.a
                public final void run() {
                    e0.Y(e0.this, hVar);
                }
            });
        }
    }

    public static final FeaturesConfig V0(e0 this$0, Boolean bool) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        FeaturesConfig a11 = this$0.f52446j.a();
        return a11 == null ? new FeaturesConfig(null, 1, null) : a11;
    }

    private static final void W(e0 e0Var, uu.h hVar) {
        synchronized (e0Var) {
            n0(e0Var, hVar, "adding to request manager and triggering send pending requests", null, 2, null);
            e0Var.f52442f.k(hVar);
            e0Var.B0(hVar.p());
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    public static final void W0(e0 this$0, FeaturesConfig featuresConfig) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (featuresConfig.getSignaling().getEnabled()) {
            if (this$0.f52455s.isOpeningOrOpened()) {
                return;
            }
            this$0.f52461y.i();
            return;
        }
        this$0.l0();
    }

    static /* synthetic */ void X(e0 e0Var, uu.h hVar, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 250;
        }
        e0Var.V(hVar, j11);
    }

    private final void X0() {
        Map f11;
        if (!this.f52459w.R() && !this.f52459w.T() && !this.f52460x.isDisposed()) {
            if (this.f52459w.S()) {
                return;
            }
        } else {
            com.tesla.logging.g gVar = B;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(vz.v.a(h11, "socket messages stream or observer in error state, setup requests stream again."));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception("socket messages stream or observer in error state, setup requests stream again."));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a("socket messages stream or observer in error state, setup requests stream again.", new Object[0]);
            this.f52459w.onComplete();
            this.f52459w = cz.f.V().U();
        }
        this.f52460x.dispose();
        B.a("Setting up socket messages stream...");
        this.f52460x = this.f52459w.U().M(bz.a.c()).A(new ky.h() { // from class: ts.r
            @Override // ky.h
            public final Object apply(Object obj) {
                e0.d Y0;
                Y0 = e0.Y0((okio.i) obj);
                return Y0;
            }
        }).B(bz.a.c()).J(new ky.f() { // from class: ts.z
            {
                e0.this = this;
            }

            @Override // ky.f
            public final void accept(Object obj) {
                e0.Z0(e0.this, (e0.d) obj);
            }
        }, new ky.f() { // from class: ts.f
            @Override // ky.f
            public final void accept(Object obj) {
                e0.a1((Throwable) obj);
            }
        });
    }

    public static final void Y(e0 this$0, uu.h request) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(request, "$request");
        W(this$0, request);
    }

    public static final d Y0(okio.i protoMessageBytes) {
        ProtoAdapter<qt.d> protoAdapter = qt.d.f48459d;
        kotlin.jvm.internal.s.f(protoMessageBytes, "protoMessageBytes");
        qt.d decode = protoAdapter.decode(protoMessageBytes);
        qt.c b11 = decode.b();
        return new d(decode, b11 == null ? null : CommandMessageDecoder.f21892a.a(b11));
    }

    private final uu.h Z(final String str, final yt.b bVar, a.b bVar2, final uu.d dVar) {
        try {
            ot.c a11 = gu.q.f28127a.a(str, bVar, ot.d.SOURCE_APP_NATIVE, bVar2.c());
            uu.h hVar = new uu.h(a11, new uu.d() { // from class: ts.u
                {
                    e0.this = this;
                }

                @Override // uu.d
                public final void a(ot.e eVar) {
                    e0.a0(e0.this, str, bVar, dVar, eVar);
                }
            }, null, bVar2.d(), bVar2.b(), 4, null);
            String a12 = bVar2.a();
            if (a12 != null) {
                hVar.i0(a12);
            }
            hVar.e(new f());
            return hVar;
        } catch (Exception e11) {
            B.d("Failed to build session info request", e11);
            throw e11;
        }
    }

    public static final void Z0(e0 this$0, d dVar) {
        qt.c b11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        qt.d a11 = dVar.a();
        CommandMessageDecoder.Result b12 = dVar.b();
        if (b12 == null || (b11 = a11.b()) == null) {
            return;
        }
        this$0.o0(b11, b12);
    }

    public static final void a0(e0 this$0, String vehicleId, yt.b domain, uu.d listener, ot.e response) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(vehicleId, "$vehicleId");
        kotlin.jvm.internal.s.g(domain, "$domain");
        kotlin.jvm.internal.s.g(listener, "$listener");
        kotlin.jvm.internal.s.g(response, "response");
        this$0.f52443g.f(false, vehicleId, domain, this$0.a());
        listener.a(response);
    }

    public static final void a1(Throwable th2) {
        B.d("error in socket message processing", th2);
    }

    public final void b0() {
        Map f11;
        synchronized (this) {
            com.tesla.logging.g gVar = B;
            gVar.i("connecting to hermes called...");
            try {
            } catch (Exception e11) {
                B.f("exception thrown connecting to hermes", e11);
                f0(this, e11);
                vz.b0 b0Var = vz.b0.f54756a;
            }
            if (this.f52455s.isOpeningOrOpened()) {
                e eVar = this.f52455s;
                gVar.i("socket state is already " + eVar + ", doing nothing more.");
            } else if (!zu.y.f60801a.b(this.f52445i)) {
                gVar.i("no network connectivity, doing nothing more.");
                u0(e.CLOSED);
                g0(this, null, 2, null);
            } else if (i0() == null) {
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String h11 = gVar.h();
                ht.a aVar = ht.a.f29422a;
                f11 = r0.f(vz.v.a(h11, "email is null, doing nothing more, why are we connecting?"));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : f11.entrySet()) {
                    ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception("email is null, doing nothing more, why are we connecting?"));
                TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
                n80.a.a("email is null, doing nothing more, why are we connecting?", new Object[0]);
            } else {
                u0(e.OPENING);
                gVar.i("fetching token required for hermes connection...");
                String uuid = UUID.randomUUID().toString();
                kotlin.jvm.internal.s.f(uuid, "randomUUID().toString()");
                this.f52454r = uuid;
                ys.e eVar2 = this.f52440d;
                String i02 = i0();
                kotlin.jvm.internal.s.e(i02);
                eVar2.f(i02, this.f52454r).o(new ky.h() { // from class: ts.q
                    @Override // ky.h
                    public final Object apply(Object obj) {
                        String c02;
                        c02 = e0.c0((zu.c0) obj);
                        return c02;
                    }
                }).u(new ky.f() { // from class: ts.b0
                    {
                        e0.this = this;
                    }

                    @Override // ky.f
                    public final void accept(Object obj) {
                        e0.d0(e0.this, (String) obj);
                    }
                }, new ky.f() { // from class: ts.d0
                    {
                        e0.this = this;
                    }

                    @Override // ky.f
                    public final void accept(Object obj) {
                        e0.e0(e0.this, (Throwable) obj);
                    }
                });
            }
        }
    }

    public final void b1(uu.h hVar) {
        this.f52450n.b(new c.a(k0(hVar)));
    }

    public static final String c0(zu.c0 c0Var) {
        return ((com.auth0.android.jwt.c) c0Var.b()).toString();
    }

    private final void c1(uu.h hVar) {
        this.f52450n.b(new c.b(k0(hVar)));
    }

    public static final void d0(e0 this$0, String token) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        Request.Builder url = new Request.Builder().url(yu.a0.f59768c.a());
        String p11 = yu.b.p(this$0.f52445i);
        kotlin.jvm.internal.s.f(p11, "getTeslaUserAgent(context)");
        Request.Builder header = url.header("X-Tesla-User-Agent", p11);
        String l11 = yu.b.l(this$0.f52445i);
        if (l11 != null) {
            header.header("X-Tesla-App-Key", l11);
        }
        kotlin.jvm.internal.s.f(token, "token");
        Request build = header.header("X-Jwt", token).header("X-Connection-Id", this$0.f52454r).build();
        B.i("hermes user token fetched! creating new web socket instance.");
        this$0.f52453q = rs.a.f49663a.a().newWebSocket(build, this$0.h0(this$0.f52454r));
    }

    public static final void e0(e0 this$0, Throwable th2) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        B.d("error fetching hermes user token", th2);
        f0(this$0, th2);
    }

    private static final void f0(e0 e0Var, Throwable th2) {
        com.tesla.logging.g gVar = B;
        gVar.i("failed to setup web socket, notifying backoff mechanism of failure.");
        e0Var.u0(e.CLOSED);
        if (th2 instanceof js.l) {
            gVar.i("stop backoff because we receive UnauthorizedTokenRefreshException");
            e0Var.f52461y.l();
            return;
        }
        e0Var.f52461y.f();
    }

    static /* synthetic */ void g0(e0 e0Var, Throwable th2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        f0(e0Var, th2);
    }

    private final WebSocketListener h0(String str) {
        return new g(str, this);
    }

    public final String i0() {
        return this.f52444h.h();
    }

    private final Signaling j0() {
        FeaturesConfig a11 = this.f52446j.a();
        if (a11 == null) {
            a11 = new FeaturesConfig(null, 1, null);
        }
        return a11.getSignaling();
    }

    private final String k0(uu.h hVar) {
        String m11 = hVar.m();
        String n11 = hVar.n();
        return m11 + "." + n11;
    }

    public final void l0() {
        synchronized (this) {
            e eVar = this.f52455s;
            e eVar2 = e.CLOSED;
            if (eVar == eVar2 && this.f52453q == null) {
                B.a("hermes already dead.");
                vz.b0 b0Var = vz.b0.f54756a;
            }
            com.tesla.logging.g gVar = B;
            gVar.a("closing socket and nulling it out.");
            String uuid = UUID.randomUUID().toString();
            kotlin.jvm.internal.s.f(uuid, "randomUUID().toString()");
            this.f52454r = uuid;
            WebSocket webSocket = this.f52453q;
            if (webSocket != null) {
                webSocket.close(1000, null);
            }
            this.f52453q = null;
            u0(eVar2);
            gVar.a("stopping hermes reconnect");
            this.f52461y.l();
            vz.b0 b0Var2 = vz.b0.f54756a;
        }
    }

    public final void m0(uu.h hVar, String str, com.tesla.logging.d dVar) {
        us.c.c(hVar, str, B, dVar);
    }

    static /* synthetic */ void n0(e0 e0Var, uu.h hVar, String str, com.tesla.logging.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = com.tesla.logging.d.INFO;
        }
        e0Var.m0(hVar, str, dVar);
    }

    private final void o0(qt.c cVar, CommandMessageDecoder.Result result) {
        okio.i d11;
        synchronized (this) {
            f.b c11 = this.f52442f.c(cVar, result, B);
            String a11 = c11.a();
            uu.h b11 = c11.b();
            if (b11 != null) {
                b11.c("decode=" + result);
            }
            String str = null;
            String P = b11 == null ? null : b11.P();
            qt.g c12 = us.b.c(cVar);
            String d12 = c12 == null ? null : ps.a.d(c12);
            n0(this, b11, "-> " + d12, null, 2, null);
            WebSocket webSocket = this.f52453q;
            if (webSocket == null) {
                n0(this, b11, "can't send ack message, socket is null", null, 2, null);
            } else {
                kotlin.jvm.internal.s.e(webSocket);
                w0(webSocket, us.b.a(cVar));
            }
            if (a11 != null && b11 != null) {
                g0 g0Var = g0.f52488a;
                if (kotlin.jvm.internal.s.c(g0Var.g(b11), Boolean.TRUE) && g0Var.b(a11, result)) {
                    if (b11.U() || b11.Z() || b11.a0()) {
                        ts.c.f52423a.a(this.f52445i, result, this.f52443g, this.f52442f, this.f52438b, P, b11, ot.m.TRANSPORT_HERMES, this.f52462z);
                    }
                    n0(this, b11, "received response, but we already processed a response from earlier, doing nothing more.", null, 2, null);
                    return;
                }
            }
            if (b11 != null && b11.s()) {
                b11.c("request finished.");
                m0(b11, "-> listener notified already, doing nothing more.", com.tesla.logging.d.DEBUG);
                return;
            }
            if (b11 != null) {
                b11.c("evaluation_start");
            }
            c.a a12 = ts.c.f52423a.a(this.f52445i, result, this.f52443g, this.f52442f, this.f52438b, P, b11, ot.m.TRANSPORT_HERMES, this.f52462z);
            ot.f a13 = a12.a();
            String b12 = a12.b();
            String c13 = a12.c();
            pt.a d13 = a12.d();
            String e11 = a12.e();
            Map<String, String> f11 = a12.f();
            if (b11 != null) {
                b11.c("command_result=" + a13);
            }
            if (d13 != null && b11 != null) {
                b11.c("generic_nominal_error=" + d13);
            }
            if (e11 != null && b11 != null) {
                b11.c("car_server_error_result_reason=" + e11);
            }
            for (Map.Entry<String, String> entry : f11.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (b11 != null) {
                    b11.c(key + "=" + value);
                }
            }
            if (b11 != null) {
                b11.c("evaluation_done");
            }
            String a14 = a13 == null ? null : ps.a.a(a13);
            n0(this, b11, "-> decoded: " + result + " and evaluated to command result " + a14, null, 2, null);
            if (b11 == null) {
                m0(b11, "-> no request found, doing nothing more.", com.tesla.logging.d.DEBUG);
                String F = cVar.i().F();
                if (!this.f52442f.b(F)) {
                    if (F.length() > 0) {
                        ts.b bVar = ts.b.f52420a;
                        bVar.b("no_request_associated_with_request_txid: " + F);
                    } else {
                        try {
                            yt.a k11 = yt.f.f59754k.decode(cVar.h()).k();
                            if (k11 != null && (d11 = k11.d()) != null) {
                                str = zu.j.h(d11);
                            }
                            if (str != null && !this.f52442f.b(str)) {
                                ts.b bVar2 = ts.b.f52420a;
                                bVar2.b("no_request_associated_with_request_uuid: " + str);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } else if (a13 == null) {
                m0(b11, "-> command result was " + a13 + " doing nothing more.", com.tesla.logging.d.DEBUG);
            } else {
                b11.c0();
                if (a11 != null) {
                    g0 g0Var2 = g0.f52488a;
                    g0Var2.c(a11, result);
                    g0Var2.f(b11);
                }
                Long q11 = b11.q();
                if (q11 != null) {
                    long longValue = q11.longValue();
                    n0(this, b11, "-> " + longValue + " milliseconds.", null, 2, null);
                }
                int i11 = b11.M().get();
                int i12 = b11.w().get();
                xs.a a15 = us.a.a(a13, b11);
                m0(b11, "nominal retries: " + i12 + ", total retries: " + i11 + "  " + a13 + ". retry policy => " + a15, com.tesla.logging.d.DEBUG);
                if (a15.b()) {
                    if (a13 == ot.f.RESULT_VEHICLE_INTERNAL_ERROR) {
                        p0(cVar, this, b11, a13, e11, d13, f11, true);
                    }
                    String C = b11.C();
                    b11.S(a13);
                    int i13 = b11.M().get();
                    n0(this, b11, "incremented retry count to " + i13 + ", old request id: " + C, null, 2, null);
                    V(b11, (long) (a15.a() * 1000));
                } else {
                    q0(cVar, this, b11, a13, e11, d13, f11, false, 128, null);
                    t0(b11, a13, b12, c13, d13);
                }
                vz.b0 b0Var = vz.b0.f54756a;
            }
        }
    }

    private static final void p0(qt.c cVar, e0 e0Var, uu.h hVar, ot.f fVar, String str, pt.a aVar, Map<String, String> map, boolean z11) {
        String a11 = cVar.h().a();
        if (!(us.b.b(cVar) == qt.a.COMMAND_TYPE_SIGNED_COMMAND_RESPONSE)) {
            a11 = null;
        }
        ts.b bVar = ts.b.f52420a;
        ot.m a12 = e0Var.a();
        Context context = e0Var.f52445i;
        yu.m mVar = e0Var.f52437a;
        String str2 = e0Var.f52454r;
        yu.e eVar = e0Var.f52438b;
        int l11 = cVar.l();
        bVar.c(context, mVar, hVar, str2, eVar, a12, fVar, Integer.valueOf(l11), a11, str, aVar, B, map, "response evaluated", z11);
    }

    static /* synthetic */ void q0(qt.c cVar, e0 e0Var, uu.h hVar, ot.f fVar, String str, pt.a aVar, Map map, boolean z11, int i11, Object obj) {
        p0(cVar, e0Var, hVar, fVar, str, aVar, map, (i11 & 128) != 0 ? false : z11);
    }

    private final void r0(String str, uu.h hVar, ot.f fVar) {
        this.f52442f.e(hVar.n());
        if (hVar.s()) {
            return;
        }
        String a11 = ps.a.a(fVar);
        n0(this, hVar, "finishing response as failure, reason: " + str + ", command result: " + a11, null, 2, null);
        ts.b.f52420a.c(this.f52445i, this.f52437a, hVar, this.f52454r, this.f52438b, a(), fVar, (r35 & 128) != 0 ? null : null, (r35 & 256) != 0 ? null : null, (r35 & 512) != 0 ? null : null, (r35 & 1024) != 0 ? null : null, (r35 & 2048) != 0 ? null : B, (r35 & 4096) != 0 ? null : null, (r35 & PKIFailureInfo.certRevoked) != 0 ? null : str, (r35 & 16384) != 0 ? false : false);
        hVar.a(new ot.e(hVar.n(), hVar.C(), str, fVar, ot.m.TRANSPORT_HERMES, 0, null, null, null, null, 992, null));
    }

    static /* synthetic */ void s0(e0 e0Var, String str, uu.h hVar, ot.f fVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            fVar = ot.f.RESULT_INTERNAL_ERROR;
        }
        e0Var.r0(str, hVar, fVar);
    }

    private final void t0(uu.h hVar, ot.f fVar, String str, String str2, pt.a aVar) {
        Set i11;
        String C = hVar.C();
        uu.h j11 = this.f52442f.j(C, hVar.n());
        i11 = x0.i(ot.f.RESULT_SUCCESS, ot.f.RESULT_NOMINAL_ERROR);
        if (!i11.contains(fVar)) {
            ts.b bVar = ts.b.f52420a;
            String C2 = hVar.C();
            boolean z11 = j11 == null;
            bVar.b("removed id: " + C2 + ", removed request is null? " + z11);
        }
        if (hVar.s()) {
            n0(this, hVar, "request is already finished, not notifying listener", null, 2, null);
            return;
        }
        String a11 = ps.a.a(fVar);
        n0(this, hVar, "notifying listener command result: " + a11, null, 2, null);
        hVar.a(new ot.e(hVar.n(), C, str, fVar, ot.m.TRANSPORT_HERMES, 0, hVar.t(), aVar, str2, null, 544, null));
    }

    public final void u0(e eVar) {
        synchronized (this) {
            com.tesla.logging.g gVar = B;
            e eVar2 = this.f52455s;
            gVar.i("WebSocket state: " + eVar2 + " -> " + eVar);
            if (this.f52455s == eVar) {
                return;
            }
            this.f52456t.b(eVar);
            this.f52455s = eVar;
            e eVar3 = e.OPENED;
            if (eVar == eVar3) {
                B0(yt.b.DOMAIN_VEHICLE_SECURITY);
                B0(yt.b.DOMAIN_INFOTAINMENT);
                B0(yt.b.DOMAIN_AUTHD);
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putBoolean("hermes_connected", eVar == eVar3);
            writableNativeMap.putString("hermes_connection_id", this.f52454r);
            com.tesla.logging.a.b(a.EnumC0395a.HERMES_STATUS, writableNativeMap);
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    private final boolean v0(uu.h hVar) {
        mt.v o11;
        List<Integer> w11;
        Integer num;
        w2 a11 = this.f52438b.a(hVar.P());
        if (!j0().getEnabled()) {
            r0("feature config not enabled", hVar, ot.f.RESULT_CONFIG_HERMES_DISABLED);
        } else if (a11 == null) {
            s0(this, "could not find vehicle associated with request", hVar, null, 4, null);
        } else {
            Integer f11 = et.a.f(a11);
            if ((f11 == null ? -1 : f11.intValue()) < 23) {
                Integer f12 = et.a.f(a11);
                r0("vehicle car api version `" + f12 + "` does not meet min car api version `23`", hVar, ot.f.RESULT_SIGNED_COMMANDS_NOT_SUPPORTED);
            } else {
                if (!hVar.L()) {
                    m0(hVar, "starting timeout", com.tesla.logging.d.DEBUG);
                    uu.h.n0(hVar, 25, ot.m.TRANSPORT_HERMES, false, 4, null);
                }
                g0 g0Var = g0.f52488a;
                if (g0Var.g(hVar) == null && (o11 = a11.o()) != null && (w11 = o11.w()) != null && (num = (Integer) wz.u.d0(w11)) != null) {
                    boolean z11 = (num.intValue() & (1 << v.g.MOBILE_APP_FEATURE_RESPONSE_CACHE.getValue())) > 0;
                    com.tesla.logging.g gVar = B;
                    gVar.i("vehicle " + a11 + ". has response caching feature? " + z11);
                    g0Var.d(hVar, z11);
                }
                Boolean g11 = g0Var.g(hVar);
                if (g11 == null) {
                    return true;
                }
                hVar.O().set(g11.booleanValue());
                return true;
            }
        }
        return false;
    }

    private final boolean w0(WebSocket webSocket, qt.d dVar) {
        return webSocket.send(dVar.encodeByteString());
    }

    private final void x0(uu.h hVar) {
        hVar.d(new j());
        if (v0(hVar)) {
            VehicleConnectivityStateManager.f21488a.s(hVar.A());
            hVar.b0();
            c1(hVar);
            m0(hVar, "<- building request", com.tesla.logging.d.DEBUG);
            this.f52457u.b(hVar);
        }
    }

    private final void y0(final uu.h hVar, qt.d dVar, gu.k kVar) {
        okio.i n11;
        hVar.C();
        if (A0(this, hVar, kVar, dVar)) {
            hVar.d0();
            qt.c b11 = dVar.b();
            hVar.k0((b11 == null || (n11 = b11.n()) == null) ? null : n11.F());
            vu.c e11 = kVar.e();
            hVar.l0(e11 != null ? e11.i() : null);
            g0 g0Var = g0.f52488a;
            if (kotlin.jvm.internal.s.c(g0Var.g(hVar), Boolean.TRUE)) {
                k kVar2 = new k(hVar, this, kVar, dVar);
                g0Var.e(hVar, kVar2);
                hy.e.o(1L, 7L, 3L, 3L, TimeUnit.SECONDS).j(new ky.a() { // from class: ts.o
                    {
                        e0.this = this;
                    }

                    @Override // ky.a
                    public final void run() {
                        e0.z0(e0.this, hVar);
                    }
                }).y(kVar2);
                return;
            }
            return;
        }
        n0(this, hVar, "-> failed to send message over socket.", null, 2, null);
        hVar.c("send_over_hermes_failure_to_send_over_socket");
        X(this, hVar, 0L, 2, null);
    }

    public static final void z0(e0 this$0, uu.h request) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(request, "$request");
        n0(this$0, request, "re-send flow terminated!", null, 2, null);
    }

    @Override // ss.i
    public ot.m a() {
        return this.f52452p;
    }

    @Override // ss.j
    public void b(ot.c request, uu.d listener) {
        Map f11;
        d2 c02;
        kotlin.jvm.internal.s.g(request, "request");
        kotlin.jvm.internal.s.g(listener, "listener");
        uu.h hVar = new uu.h(request, listener, null, null, null, 28, null);
        j2 c11 = hVar.i().c();
        if ((c11 == null ? null : c11.k()) != null) {
            hVar = uu.h.g(hVar, ot.c.b(hVar.A(), null, null, null, null, null, false, false, new ot.b(new j2(null, null, new lt.n(this.f52454r, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5, -1, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 383, null), null, null, null, null, 30, null);
        }
        uu.h hVar2 = hVar;
        j2 c12 = hVar2.i().c();
        if (c12 != null && (c02 = c12.c0()) != null) {
            hVar2 = uu.h.g(hVar2, ot.c.b(hVar2.A(), null, null, null, null, null, false, false, new ot.b(new j2(null, null, null, d2.b(c02, this.f52454r, null, null, 6, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 383, null), null, null, null, null, 30, null);
        }
        hVar2.b0();
        hVar2.e(new i());
        ot.b c13 = request.c();
        if ((c13 != null && com.tesla.data.oapi.d.b(c13)) && !request.f()) {
            com.tesla.logging.g gVar = B;
            String str = "Calendar sync request with `letSleep=false`, source=" + request.h();
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(vz.v.a(h11, str));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(str));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a(str, new Object[0]);
        }
        try {
            if (v0(hVar2)) {
                VehicleConnectivityStateManager.f21488a.s(hVar2.A());
                V(hVar2, 0L);
            }
        } catch (Exception e11) {
            B.d("error", e11);
            s0(this, "exception thrown: " + e11.getMessage(), hVar2, null, 4, null);
        }
    }

    @Override // ss.j
    public void c(ot.c request) {
        kotlin.jvm.internal.s.g(request, "request");
        uu.h e11 = this.f52442f.e(gu.c.d(request));
        if (e11 == null) {
            com.tesla.logging.g gVar = B;
            String b11 = uu.c.b(request);
            gVar.a("failed to cancel " + b11 + ", no request found");
        } else if (e11.s()) {
            m0(e11, "failed to cancel, request already finished", com.tesla.logging.d.DEBUG);
        } else {
            m0(e11, "canceling request as result timeout.", com.tesla.logging.d.DEBUG);
            e11.g0(a());
        }
    }
}