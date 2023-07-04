package com.tesla.messagedecoding;

import androidx.annotation.Keep;
import bu.i0;
import bu.p0;
import bu.z3;
import ch.qos.logback.core.joran.action.Action;
import com.tesla.logging.g;
import java.util.LinkedHashMap;
import java.util.Map;
import ju.a;
import ju.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import lt.g0;
import lt.l1;
import lt.q1;
import lt.y;
import okio.i;
import vz.k;
import vz.m;
import xt.h;
import yt.b;
import yt.c;
import yt.d;
import yt.e;
import yt.f;
import zu.d0;
import zu.j;

/* loaded from: classes6.dex */
public final class RoutableMessageDecoder {

    /* renamed from: a  reason: collision with root package name */
    public static final RoutableMessageDecoder f21913a = new RoutableMessageDecoder();

    /* renamed from: b  reason: collision with root package name */
    private static final g f21914b = g.f21878b.a("RoutableMessageDecoder");

    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R)\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r8F@\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", "", "", Action.KEY_ATTRIBUTE, "value", "Lvz/b0;", "addTelemetry", "", "_telemetryData$delegate", "Lvz/k;", "get_telemetryData", "()Ljava/util/Map;", "_telemetryData", "", "getTelemetryData", "telemetryData", "<init>", "()V", "a", "b", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "messagedecoding_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static abstract class Result {
        private final k _telemetryData$delegate;

        /* loaded from: classes6.dex */
        public static abstract class a extends Result {

            /* renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$a$a  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C0397a extends a {

                /* renamed from: a  reason: collision with root package name */
                public static final C0397a f21915a = new C0397a();

                private C0397a() {
                    super(null);
                }

                public String toString() {
                    return "error: bad parameter";
                }
            }

            /* loaded from: classes6.dex */
            public static final class b extends a {

                /* renamed from: a  reason: collision with root package name */
                public static final b f21916a = new b();

                private b() {
                    super(null);
                }

                public String toString() {
                    return "error: busy";
                }
            }

            /* loaded from: classes6.dex */
            public static final class c extends a {

                /* renamed from: a  reason: collision with root package name */
                private final String f21917a;

                public c(String str) {
                    super(null);
                    this.f21917a = str;
                }

                public final String a() {
                    return this.f21917a;
                }

                public String toString() {
                    String str = this.f21917a;
                    return "car server error result reason => " + str;
                }
            }

            /* loaded from: classes6.dex */
            public static final class d extends a {

                /* renamed from: a  reason: collision with root package name */
                public static final d f21918a = new d();

                private d() {
                    super(null);
                }

                public String toString() {
                    return "error: insufficient privileges";
                }
            }

            /* loaded from: classes6.dex */
            public static final class e extends a {

                /* renamed from: a  reason: collision with root package name */
                private final pt.a f21919a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(pt.a error) {
                    super(null);
                    s.g(error, "error");
                    this.f21919a = error;
                }

                public final pt.a a() {
                    return this.f21919a;
                }

                public String toString() {
                    pt.a aVar = this.f21919a;
                    return "error: nominal => " + aVar;
                }
            }

            /* loaded from: classes6.dex */
            public static final class f extends a {

                /* renamed from: a  reason: collision with root package name */
                private final vu.c f21920a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(vu.c sessionInfo) {
                    super(null);
                    s.g(sessionInfo, "sessionInfo");
                    this.f21920a = sessionInfo;
                }

                public final vu.c a() {
                    return this.f21920a;
                }

                public String toString() {
                    return "error: incorrect epoch info, successful recovery";
                }
            }

            /* loaded from: classes6.dex */
            public static final class g extends a {

                /* renamed from: a  reason: collision with root package name */
                private final yt.b f21921a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(yt.b domain) {
                    super(null);
                    s.g(domain, "domain");
                    this.f21921a = domain;
                }

                public final yt.b a() {
                    return this.f21921a;
                }

                public String toString() {
                    return "error: incorrect epoch info failure";
                }
            }

            /* loaded from: classes6.dex */
            public static final class h extends a {

                /* renamed from: a  reason: collision with root package name */
                private final String f21922a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public h(String reason) {
                    super(null);
                    s.g(reason, "reason");
                    this.f21922a = reason;
                }

                public final String a() {
                    return this.f21922a;
                }

                public String toString() {
                    String str = this.f21922a;
                    return "error: nominal => " + str;
                }
            }

            /* loaded from: classes6.dex */
            public static final class i extends a {

                /* renamed from: a  reason: collision with root package name */
                public static final i f21923a = new i();

                private i() {
                    super(null);
                }

                public String toString() {
                    return "error: not on whitelist";
                }
            }

            /* loaded from: classes6.dex */
            public static final class j extends a {

                /* renamed from: a  reason: collision with root package name */
                public static final j f21924a = new j();

                private j() {
                    super(null);
                }

                public String toString() {
                    return "error: remote access disabled";
                }
            }

            /* loaded from: classes6.dex */
            public static final class k extends a {

                /* renamed from: a  reason: collision with root package name */
                public static final k f21925a = new k();

                private k() {
                    super(null);
                }

                public String toString() {
                    return "error: remote service access disabled";
                }
            }

            /* loaded from: classes6.dex */
            public static final class l extends a {

                /* renamed from: a  reason: collision with root package name */
                private final Exception f21926a;

                public l() {
                    this(null, 1, null);
                }

                public l(Exception exc) {
                    super(null);
                    this.f21926a = exc;
                }

                public final Exception a() {
                    return this.f21926a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof l) && s.c(this.f21926a, ((l) obj).f21926a);
                }

                public int hashCode() {
                    Exception exc = this.f21926a;
                    if (exc == null) {
                        return 0;
                    }
                    return exc.hashCode();
                }

                public String toString() {
                    Exception exc = this.f21926a;
                    String message = exc == null ? null : exc.getMessage();
                    return "error: exception => " + message;
                }

                public /* synthetic */ l(Exception exc, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? null : exc);
                }
            }

            /* loaded from: classes6.dex */
            public static final class m extends a {

                /* renamed from: a  reason: collision with root package name */
                private final String f21927a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public m(String message) {
                    super(null);
                    s.g(message, "message");
                    this.f21927a = message;
                }

                public final String a() {
                    return this.f21927a;
                }

                public String toString() {
                    String str = this.f21927a;
                    return "error: unhandled => " + str;
                }
            }

            /* loaded from: classes6.dex */
            public static final class n extends a {

                /* renamed from: a  reason: collision with root package name */
                public static final n f21928a = new n();

                private n() {
                    super(null);
                }

                public String toString() {
                    return "error: internal error";
                }
            }

            /* loaded from: classes6.dex */
            public static final class o extends a {

                /* renamed from: a  reason: collision with root package name */
                public static final o f21929a = new o();

                private o() {
                    super(null);
                }

                public String toString() {
                    return "error: vehicle timeout";
                }
            }

            /* loaded from: classes6.dex */
            public static final class p extends a {

                /* renamed from: a  reason: collision with root package name */
                public static final p f21930a = new p();

                private p() {
                    super(null);
                }

                public String toString() {
                    return "error: wait";
                }
            }

            /* loaded from: classes6.dex */
            public static final class q extends a {

                /* renamed from: a  reason: collision with root package name */
                public static final q f21931a = new q();

                private q() {
                    super(null);
                }

                public String toString() {
                    return "error: whitelist full";
                }
            }

            private a() {
                super(null);
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        public static abstract class b extends Result {

            /* loaded from: classes6.dex */
            public static final class a extends b {

                /* renamed from: a  reason: collision with root package name */
                private final i0 f21932a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(i0 status) {
                    super(null);
                    s.g(status, "status");
                    this.f21932a = status;
                }

                public final i0 a() {
                    return this.f21932a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && s.c(this.f21932a, ((a) obj).f21932a);
                }

                public int hashCode() {
                    return this.f21932a.hashCode();
                }

                public String toString() {
                    i0 i0Var = this.f21932a;
                    return "CommandStatus(status=" + i0Var + ")";
                }
            }

            /* renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$b  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C0398b extends b {

                /* renamed from: a  reason: collision with root package name */
                public static final C0398b f21933a = new C0398b();

                private C0398b() {
                    super(null);
                }

                public String toString() {
                    return "EmptyResponse";
                }
            }

            /* loaded from: classes6.dex */
            public static final class c extends b {

                /* renamed from: a  reason: collision with root package name */
                private final y f21934a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(y getChargeOnSolarFeatureResponse) {
                    super(null);
                    s.g(getChargeOnSolarFeatureResponse, "getChargeOnSolarFeatureResponse");
                    this.f21934a = getChargeOnSolarFeatureResponse;
                }

                public final y a() {
                    return this.f21934a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && s.c(this.f21934a, ((c) obj).f21934a);
                }

                public int hashCode() {
                    return this.f21934a.hashCode();
                }

                public String toString() {
                    y yVar = this.f21934a;
                    return "GetChargeOnSolarFeatureResponse(getChargeOnSolarFeatureResponse=" + yVar + ")";
                }
            }

            /* loaded from: classes6.dex */
            public static final class d extends b {

                /* renamed from: a  reason: collision with root package name */
                private final g0 f21935a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(g0 getManagedChargingSitesResponse) {
                    super(null);
                    s.g(getManagedChargingSitesResponse, "getManagedChargingSitesResponse");
                    this.f21935a = getManagedChargingSitesResponse;
                }

                public final g0 a() {
                    return this.f21935a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && s.c(this.f21935a, ((d) obj).f21935a);
                }

                public int hashCode() {
                    return this.f21935a.hashCode();
                }

                public String toString() {
                    g0 g0Var = this.f21935a;
                    return "GetManagedChargingSitesResponse(getManagedChargingSitesResponse=" + g0Var + ")";
                }
            }

            /* loaded from: classes6.dex */
            public static final class e extends b {

                /* renamed from: a  reason: collision with root package name */
                private final String f21936a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(String protoMessageBase64) {
                    super(null);
                    s.g(protoMessageBase64, "protoMessageBase64");
                    this.f21936a = protoMessageBase64;
                }

                public final String a() {
                    return this.f21936a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && s.c(this.f21936a, ((e) obj).f21936a);
                }

                public int hashCode() {
                    return this.f21936a.hashCode();
                }

                public String toString() {
                    String str = this.f21936a;
                    return "NavigationRoute(protoMessageBase64=" + str + ")";
                }
            }

            /* loaded from: classes6.dex */
            public static final class f extends b {

                /* renamed from: a  reason: collision with root package name */
                private final String f21937a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(String protoMessageBase64) {
                    super(null);
                    s.g(protoMessageBase64, "protoMessageBase64");
                    this.f21937a = protoMessageBase64;
                }

                public final String a() {
                    return this.f21937a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof f) && s.c(this.f21937a, ((f) obj).f21937a);
                }

                public int hashCode() {
                    return this.f21937a.hashCode();
                }

                public String toString() {
                    String str = this.f21937a;
                    return "PiiKeyResponse(protoMessageBase64=" + str + ")";
                }
            }

            /* loaded from: classes6.dex */
            public static final class g extends b {

                /* renamed from: a  reason: collision with root package name */
                private final String f21938a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(String protoMessageBase64) {
                    super(null);
                    s.g(protoMessageBase64, "protoMessageBase64");
                    this.f21938a = protoMessageBase64;
                }

                public final String a() {
                    return this.f21938a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof g) && s.c(this.f21938a, ((g) obj).f21938a);
                }

                public int hashCode() {
                    return this.f21938a.hashCode();
                }

                public String toString() {
                    String str = this.f21938a;
                    return "Ping(protoMessageBase64=" + str + ")";
                }
            }

            /* loaded from: classes6.dex */
            public static final class h extends b {

                /* renamed from: a  reason: collision with root package name */
                private final q1 f21939a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public h(q1 pseudonymSyncResponse) {
                    super(null);
                    s.g(pseudonymSyncResponse, "pseudonymSyncResponse");
                    this.f21939a = pseudonymSyncResponse;
                }

                public final q1 a() {
                    return this.f21939a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof h) && s.c(this.f21939a, ((h) obj).f21939a);
                }

                public int hashCode() {
                    return this.f21939a.hashCode();
                }

                public String toString() {
                    q1 q1Var = this.f21939a;
                    return "PseudonymSyncResponse(pseudonymSyncResponse=" + q1Var + ")";
                }
            }

            /* loaded from: classes6.dex */
            public static final class i extends b {

                /* renamed from: a  reason: collision with root package name */
                private final vu.c f21940a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i(vu.c sessionInfo) {
                    super(null);
                    s.g(sessionInfo, "sessionInfo");
                    this.f21940a = sessionInfo;
                }

                public final vu.c a() {
                    return this.f21940a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof i) && s.c(this.f21940a, ((i) obj).f21940a);
                }

                public int hashCode() {
                    return this.f21940a.hashCode();
                }

                public String toString() {
                    vu.c cVar = this.f21940a;
                    return "SessionInfo(sessionInfo=" + cVar + ")";
                }
            }

            /* loaded from: classes6.dex */
            public static final class j extends b {

                /* renamed from: a  reason: collision with root package name */
                private final ju.c f21941a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public j(ju.c streamMessageInfo) {
                    super(null);
                    s.g(streamMessageInfo, "streamMessageInfo");
                    this.f21941a = streamMessageInfo;
                }

                public final ju.c a() {
                    return this.f21941a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof j) && s.c(this.f21941a, ((j) obj).f21941a);
                }

                public int hashCode() {
                    return this.f21941a.hashCode();
                }

                public String toString() {
                    ju.c cVar = this.f21941a;
                    return "StreamMessageInfo(streamMessageInfo=" + cVar + ")";
                }
            }

            /* loaded from: classes6.dex */
            public static final class k extends b {

                /* renamed from: a  reason: collision with root package name */
                private final String f21942a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public k(String protoMessageBase64) {
                    super(null);
                    s.g(protoMessageBase64, "protoMessageBase64");
                    this.f21942a = protoMessageBase64;
                }

                public final String a() {
                    return this.f21942a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof k) && s.c(this.f21942a, ((k) obj).f21942a);
                }

                public int hashCode() {
                    return this.f21942a.hashCode();
                }

                public String toString() {
                    String str = this.f21942a;
                    return "VehicleData(protoMessageBase64=" + str + ")";
                }
            }

            /* loaded from: classes6.dex */
            public static final class l extends b {

                /* renamed from: a  reason: collision with root package name */
                private final String f21943a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public l(String protoMessageBase64) {
                    super(null);
                    s.g(protoMessageBase64, "protoMessageBase64");
                    this.f21943a = protoMessageBase64;
                }

                public final String a() {
                    return this.f21943a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof l) && s.c(this.f21943a, ((l) obj).f21943a);
                }

                public int hashCode() {
                    return this.f21943a.hashCode();
                }

                public String toString() {
                    String str = this.f21943a;
                    return "VehicleDataSubscription(protoMessageBase64=" + str + ")";
                }
            }

            /* loaded from: classes6.dex */
            public static final class m extends b {

                /* renamed from: a  reason: collision with root package name */
                private final z3 f21944a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public m(z3 whitelistInfo) {
                    super(null);
                    s.g(whitelistInfo, "whitelistInfo");
                    this.f21944a = whitelistInfo;
                }

                public final z3 a() {
                    return this.f21944a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof m) && s.c(this.f21944a, ((m) obj).f21944a);
                }

                public int hashCode() {
                    return this.f21944a.hashCode();
                }

                public String toString() {
                    z3 z3Var = this.f21944a;
                    return "WhitelistInfo(whitelistInfo=" + z3Var + ")";
                }
            }

            private b() {
                super(null);
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        static final class c extends u implements h00.a<Map<String, String>> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f21945a = new c();

            c() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Map<String, String> mo11invoke() {
                return new LinkedHashMap();
            }
        }

        private Result() {
            k b11;
            b11 = m.b(kotlin.b.NONE, c.f21945a);
            this._telemetryData$delegate = b11;
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<String, String> get_telemetryData() {
            return (Map) this._telemetryData$delegate.mo16getValue();
        }

        public final void addTelemetry(String key, String value) {
            s.g(key, "key");
            s.g(value, "value");
            get_telemetryData().put(key, value);
        }

        public final Map<String, String> getTelemetryData() {
            return get_telemetryData();
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21946a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f21947b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f21948c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f21949d;

        static {
            int[] iArr = new int[e.values().length];
            iArr[e.OPERATIONSTATUS_OK.ordinal()] = 1;
            iArr[e.OPERATIONSTATUS_WAIT.ordinal()] = 2;
            iArr[e.OPERATIONSTATUS_ERROR.ordinal()] = 3;
            f21946a = iArr;
            int[] iArr2 = new int[b.values().length];
            iArr2[b.DOMAIN_VEHICLE_SECURITY.ordinal()] = 1;
            iArr2[b.DOMAIN_INFOTAINMENT.ordinal()] = 2;
            f21947b = iArr2;
            int[] iArr3 = new int[l1.values().length];
            iArr3[l1.OPERATIONSTATUS_OK.ordinal()] = 1;
            iArr3[l1.OPERATIONSTATUS_ERROR.ordinal()] = 2;
            f21948c = iArr3;
            int[] iArr4 = new int[c.values().length];
            iArr4[c.MESSAGEFAULT_ERROR_INCORRECT_EPOCH.ordinal()] = 1;
            iArr4[c.MESSAGEFAULT_ERROR_INVALID_TOKEN_OR_COUNTER.ordinal()] = 2;
            iArr4[c.MESSAGEFAULT_ERROR_TIME_EXPIRED.ordinal()] = 3;
            iArr4[c.MESSAGEFAULT_ERROR_TIME_TO_LIVE_TOO_LONG.ordinal()] = 4;
            iArr4[c.MESSAGEFAULT_ERROR_INVALID_SIGNATURE.ordinal()] = 5;
            iArr4[c.MESSAGEFAULT_ERROR_UNKNOWN_KEY_ID.ordinal()] = 6;
            iArr4[c.MESSAGEFAULT_ERROR_NOT_PROVISIONED_WITH_IDENTITY.ordinal()] = 7;
            iArr4[c.MESSAGEFAULT_ERROR_KEYCHAIN_IS_FULL.ordinal()] = 8;
            iArr4[c.MESSAGEFAULT_ERROR_BUSY.ordinal()] = 9;
            iArr4[c.MESSAGEFAULT_ERROR_TIMEOUT.ordinal()] = 10;
            iArr4[c.MESSAGEFAULT_ERROR_COMMAND_REQUIRES_ACCOUNT_CREDENTIALS.ordinal()] = 11;
            iArr4[c.MESSAGEFAULT_ERROR_INSUFFICIENT_PRIVILEGES.ordinal()] = 12;
            iArr4[c.MESSAGEFAULT_ERROR_INTERNAL.ordinal()] = 13;
            iArr4[c.MESSAGEFAULT_ERROR_REMOTE_ACCESS_DISABLED.ordinal()] = 14;
            iArr4[c.MESSAGEFAULT_ERROR_BAD_PARAMETER.ordinal()] = 15;
            iArr4[c.MESSAGEFAULT_ERROR_NONE.ordinal()] = 16;
            iArr4[c.MESSAGEFAULT_ERROR_REMOTE_SERVICE_ACCESS_DISABLED.ordinal()] = 17;
            iArr4[c.MESSAGEFAULT_ERROR_INACTIVE_KEY.ordinal()] = 18;
            iArr4[c.MESSAGEFAULT_ERROR_INVALID_DOMAINS.ordinal()] = 19;
            iArr4[c.MESSAGEFAULT_ERROR_INVALID_COMMAND.ordinal()] = 20;
            iArr4[c.MESSAGEFAULT_ERROR_DECODING.ordinal()] = 21;
            iArr4[c.MESSAGEFAULT_ERROR_WRONG_PERSONALIZATION.ordinal()] = 22;
            iArr4[c.MESSAGEFAULT_ERROR_IV_INCORRECT_LENGTH.ordinal()] = 23;
            iArr4[c.MESSAGEFAULT_ERROR_COULD_NOT_HASH_METADATA.ordinal()] = 24;
            f21949d = iArr4;
        }
    }

    private RoutableMessageDecoder() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ce, code lost:
        if (r7 == false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[Catch: Exception -> 0x01a2, TryCatch #1 {Exception -> 0x01a2, blocks: (B:2:0x0000, B:4:0x0006, B:11:0x0032, B:15:0x0041, B:28:0x0079, B:35:0x008c, B:37:0x0094, B:38:0x0097, B:40:0x009f, B:41:0x00a7, B:43:0x00af, B:44:0x00b5, B:46:0x00bd, B:53:0x00d2, B:54:0x00d8, B:50:0x00c8, B:31:0x0081, B:34:0x0088, B:56:0x00de, B:57:0x00e3, B:58:0x00e4, B:60:0x00ea, B:62:0x00f0, B:64:0x00f6, B:66:0x00fc, B:68:0x0102, B:70:0x0108, B:72:0x010e, B:74:0x0114, B:76:0x011a, B:78:0x0120, B:80:0x0123, B:82:0x0129, B:84:0x012f, B:86:0x0135, B:88:0x0143, B:90:0x0151, B:92:0x015f, B:94:0x016d, B:96:0x017b, B:98:0x018e, B:22:0x0069, B:18:0x0060, B:101:0x019c, B:14:0x0039, B:8:0x0014), top: B:108:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[Catch: Exception -> 0x01a2, TryCatch #1 {Exception -> 0x01a2, blocks: (B:2:0x0000, B:4:0x0006, B:11:0x0032, B:15:0x0041, B:28:0x0079, B:35:0x008c, B:37:0x0094, B:38:0x0097, B:40:0x009f, B:41:0x00a7, B:43:0x00af, B:44:0x00b5, B:46:0x00bd, B:53:0x00d2, B:54:0x00d8, B:50:0x00c8, B:31:0x0081, B:34:0x0088, B:56:0x00de, B:57:0x00e3, B:58:0x00e4, B:60:0x00ea, B:62:0x00f0, B:64:0x00f6, B:66:0x00fc, B:68:0x0102, B:70:0x0108, B:72:0x010e, B:74:0x0114, B:76:0x011a, B:78:0x0120, B:80:0x0123, B:82:0x0129, B:84:0x012f, B:86:0x0135, B:88:0x0143, B:90:0x0151, B:92:0x015f, B:94:0x016d, B:96:0x017b, B:98:0x018e, B:22:0x0069, B:18:0x0060, B:101:0x019c, B:14:0x0039, B:8:0x0014), top: B:108:0x0000, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.tesla.messagedecoding.RoutableMessageDecoder.Result b(yt.f r7) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.messagedecoding.RoutableMessageDecoder.b(yt.f):com.tesla.messagedecoding.RoutableMessageDecoder$Result");
    }

    private final Result c(f fVar, b bVar) {
        try {
            i g11 = fVar.g();
            if (g11 == null) {
                return new Result.a.m("routable message didn't contain a payload to decode!");
            }
            return d(bVar, fVar, h.f57714f.decode(g11));
        } catch (Exception e11) {
            return new Result.a.l(e11);
        }
    }

    private static final Result.a d(b bVar, f fVar, h hVar) {
        if (hVar == null) {
            return new Result.a.g(bVar);
        }
        a.AbstractC0622a a11 = ju.a.f33983a.a(hVar, bVar, d0.a(fVar, f21914b));
        if (a11 instanceof a.AbstractC0622a.b) {
            return new Result.a.f(((a.AbstractC0622a.b) a11).a());
        }
        if (a11 instanceof a.AbstractC0622a.C0623a) {
            return Result.a.i.f21923a;
        }
        if (a11 instanceof a.AbstractC0622a.c) {
            return new Result.a.l(((a.AbstractC0622a.c) a11).a());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Result e(f fVar, d dVar, b bVar) {
        Result.a.m mVar;
        Result result;
        c d11 = dVar == null ? null : dVar.d();
        switch (d11 == null ? -1 : a.f21949d[d11.ordinal()]) {
            case -1:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                Result c11 = c(fVar, bVar);
                if (c11 instanceof Result.a.f) {
                    result = (Result.a) c11;
                    break;
                } else {
                    String name = d11 != null ? d11.name() : null;
                    mVar = new Result.a.m("unsupported routable message status message fault " + name);
                    result = mVar;
                    break;
                }
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                result = c(fVar, bVar);
                break;
            case 6:
            case 7:
                result = Result.a.i.f21923a;
                break;
            case 8:
                result = Result.a.q.f21931a;
                break;
            case 9:
                result = Result.a.b.f21916a;
                break;
            case 10:
                result = Result.a.o.f21929a;
                break;
            case 11:
            case 12:
                result = Result.a.d.f21918a;
                break;
            case 13:
                result = Result.a.n.f21928a;
                break;
            case 14:
                result = Result.a.j.f21924a;
                break;
            case 15:
                result = Result.a.C0397a.f21915a;
                break;
            case 16:
                String name2 = d11.name();
                mVar = new Result.a.m("unsupported routable message status message fault " + name2);
                result = mVar;
                break;
            case 17:
                result = Result.a.k.f21925a;
                break;
        }
        if (d11 != null) {
            result.addTelemetry("signed_command_fault", String.valueOf(d11.getValue()));
        }
        return result;
    }

    private final Result f(f fVar) {
        i e11 = fVar.e();
        if (e11 != null) {
            try {
                p0 decode = p0.R.decode(e11);
                g gVar = f21914b;
                gVar.a("decoded: " + decode);
                z3 J = decode.J();
                if (J == null) {
                    h l11 = decode.l();
                    if (l11 == null) {
                        pt.b q11 = decode.q();
                        if (q11 == null) {
                            i0 k11 = decode.k();
                            if (k11 != null) {
                                return new Result.b.a(k11);
                            }
                        } else {
                            return new Result.a.e(q11.c());
                        }
                    } else {
                        return f21913a.g(ju.a.f33983a.a(l11, b.DOMAIN_VEHICLE_SECURITY, d0.a(fVar, gVar)));
                    }
                } else {
                    return new Result.b.m(J);
                }
            } catch (Exception e12) {
                return new Result.a.l(e12);
            }
        }
        i g11 = fVar.g();
        if (g11 == null) {
            return Result.b.C0398b.f21933a;
        }
        try {
            return f21913a.g(ju.a.f33983a.a(h.f57714f.decode(g11), b.DOMAIN_VEHICLE_SECURITY, d0.a(fVar, f21914b)));
        } catch (Exception e13) {
            return new Result.a.l(e13);
        }
    }

    private final Result g(a.AbstractC0622a abstractC0622a) {
        if (abstractC0622a instanceof a.AbstractC0622a.b) {
            return new Result.b.i(((a.AbstractC0622a.b) abstractC0622a).a());
        }
        if (s.c(abstractC0622a, a.AbstractC0622a.C0623a.f33984a)) {
            return Result.a.i.f21923a;
        }
        if (abstractC0622a instanceof a.AbstractC0622a.c) {
            return new Result.a.l(((a.AbstractC0622a.c) abstractC0622a).a());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Result h(b.a aVar) {
        if (aVar instanceof b.a.C0624a) {
            return new Result.b.j(((b.a.C0624a) aVar).a());
        }
        if (aVar instanceof b.a.C0625b) {
            return new Result.a.l(((b.a.C0625b) aVar).a());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Result a(f routableMessage) {
        s.g(routableMessage, "routableMessage");
        g gVar = f21914b;
        String e11 = j.e(routableMessage.encode(), 0, 1, null);
        gVar.a("decoded: " + routableMessage + " => `" + e11 + "`");
        d j11 = routableMessage.j();
        yt.a d11 = routableMessage.d();
        yt.b c11 = d11 == null ? null : d11.c();
        if (c11 == null) {
            return new Result.a.m("destination null, can't parse!");
        }
        e c12 = j11 != null ? j11.c() : null;
        if (c12 == null) {
            c12 = e.OPERATIONSTATUS_OK;
        }
        int i11 = a.f21946a[c12.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return e(routableMessage, j11, c11);
                }
                throw new NoWhenBranchMatchedException();
            }
            return Result.a.p.f21930a;
        }
        int i12 = a.f21947b[c11.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                return new Result.a.m("cannot decode messages for domain " + c11);
            }
            return b(routableMessage);
        }
        return f(routableMessage);
    }
}