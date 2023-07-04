package ts;

import android.content.Context;
import android.util.Base64;
import bu.c4;
import bu.d4;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.command.VehicleConnectivityStateManager;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.a;
import com.tesla.messagedecoding.CommandMessageDecoder;
import com.tesla.messagedecoding.RoutableMessageDecoder;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import wz.r0;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f52423a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final com.tesla.logging.g f52424b = com.tesla.logging.g.f21878b.a("DecodedMessageEvaluator");

    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f52431a;

        static {
            int[] iArr = new int[c4.values().length];
            iArr[c4.WHITELISTOPERATION_INFORMATION_NONE.ordinal()] = 1;
            f52431a = iArr;
        }
    }

    private c() {
    }

    private static final void c(String str, RoutableMessageDecoder.Result result) {
        Map f11;
        if (str == null) {
            com.tesla.logging.g gVar = f52424b;
            String str2 = "Vehicle id is null for result: `" + result + "`";
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(vz.v.a(h11, str2));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(str2));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a(str2, new Object[0]);
        }
    }

    private static final void d(CommandMessageDecoder.Result result) {
        Map f11;
        com.tesla.logging.g gVar = f52424b;
        String str = "evaluated result: `" + result + "`";
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

    public final a a(Context context, CommandMessageDecoder.Result decodeResult, vu.a sessionManager, uu.f requestManager, yu.e getVehicleData, String str, uu.h hVar, ot.m transport, h0 tokenManager) {
        Map f11;
        Map f12;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(decodeResult, "decodeResult");
        kotlin.jvm.internal.s.g(sessionManager, "sessionManager");
        kotlin.jvm.internal.s.g(requestManager, "requestManager");
        kotlin.jvm.internal.s.g(getVehicleData, "getVehicleData");
        kotlin.jvm.internal.s.g(transport, "transport");
        kotlin.jvm.internal.s.g(tokenManager, "tokenManager");
        ot.f fVar = null;
        if (!(kotlin.jvm.internal.s.c(decodeResult, CommandMessageDecoder.Result.e.f21909a) ? true : kotlin.jvm.internal.s.c(decodeResult, CommandMessageDecoder.Result.a.f21894a))) {
            if (decodeResult instanceof CommandMessageDecoder.Result.b.f) {
                f52424b.d("exception was thrown while decoding command message", ((CommandMessageDecoder.Result.b.f) decodeResult).a());
                fVar = ot.f.RESULT_INTERNAL_ERROR;
            } else if (decodeResult instanceof CommandMessageDecoder.Result.b.h) {
                d(decodeResult);
            } else if (decodeResult instanceof CommandMessageDecoder.Result.b.j) {
                d(decodeResult);
            } else if (decodeResult instanceof CommandMessageDecoder.Result.b.k) {
                d(decodeResult);
            } else if (decodeResult instanceof CommandMessageDecoder.Result.b.i) {
                d(decodeResult);
            } else if (kotlin.jvm.internal.s.c(decodeResult, CommandMessageDecoder.Result.b.a.f21895a)) {
                d(decodeResult);
                fVar = ot.f.RESULT_APPLICATION_ERROR;
            } else if (kotlin.jvm.internal.s.c(decodeResult, CommandMessageDecoder.Result.b.C0396b.f21896a)) {
                d(decodeResult);
                fVar = ot.f.RESULT_HERMES_INTERNAL_ERROR;
            } else if (kotlin.jvm.internal.s.c(decodeResult, CommandMessageDecoder.Result.b.c.f21897a)) {
                d(decodeResult);
                fVar = ot.f.RESULT_INVALID_MESSAGE_ERROR;
            } else if (kotlin.jvm.internal.s.c(decodeResult, CommandMessageDecoder.Result.b.g.f21901a)) {
                d(decodeResult);
                fVar = ot.f.RESULT_TOO_MANY_REQUESTS;
            } else if (decodeResult instanceof CommandMessageDecoder.Result.f) {
                JSONObject a11 = ((CommandMessageDecoder.Result.f) decodeResult).a();
                if (a11 != null) {
                    String jSONObject = a11.toString();
                    kotlin.jvm.internal.s.f(jSONObject, "iceConfig.toString()");
                    f52424b.i("sending ice config over JsBridge");
                    com.tesla.logging.a.b(a.EnumC0395a.CAR_API_ICE_CONFIG, zu.u.f60790a.b(a11));
                    yu.b.x(context, jSONObject);
                }
                fVar = ot.f.RESULT_SUCCESS;
            } else if (kotlin.jvm.internal.s.c(decodeResult, CommandMessageDecoder.Result.b.e.f21899a)) {
                com.tesla.logging.g gVar = f52424b;
                gVar.i("Vehicle token invalid!");
                if (str == null) {
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    String h11 = gVar.h();
                    ht.a aVar = ht.a.f29422a;
                    f12 = r0.f(vz.v.a(h11, "Vehicle id null, can't reset vehicle token"));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : f12.entrySet()) {
                        ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception("Vehicle id null, can't reset vehicle token"));
                    TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
                    n80.a.a("Vehicle id null, can't reset vehicle token", new Object[0]);
                } else {
                    tokenManager.a(str);
                }
                fVar = ot.f.RESULT_TOKEN_ERROR;
            } else if (kotlin.jvm.internal.s.c(decodeResult, CommandMessageDecoder.Result.b.d.f21898a)) {
                f52424b.i("User token invalid!");
                tokenManager.b();
                fVar = ot.f.RESULT_TOKEN_ERROR;
            } else if (kotlin.jvm.internal.s.c(decodeResult, CommandMessageDecoder.Result.b.l.f21906a)) {
                com.tesla.logging.g gVar2 = f52424b;
                gVar2.i("Vehicle not connected");
                if (str == null) {
                    TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                    String h12 = gVar2.h();
                    ht.a aVar2 = ht.a.f29422a;
                    f11 = r0.f(vz.v.a(h12, "Vehicle id is null for vehicle not connected evaluation"));
                    FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry2 : f11.entrySet()) {
                        ht.a.f29422a.a((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    firebaseCrashlytics2.recordException(new Exception("Vehicle id is null for vehicle not connected evaluation"));
                    TeslaLog.setTag$default(teslaLog2, h12, false, 2, null);
                    n80.a.a("Vehicle id is null for vehicle not connected evaluation", new Object[0]);
                } else {
                    VehicleConnectivityStateManager.f21488a.p(str, VehicleConnectivityStateManager.c.OFFLINE);
                }
                fVar = ot.f.RESULT_VEHICLE_NOT_CONNECTED;
            } else if (!kotlin.jvm.internal.s.c(decodeResult, CommandMessageDecoder.Result.c.f21907a)) {
                if (decodeResult instanceof CommandMessageDecoder.Result.d) {
                    return b(((CommandMessageDecoder.Result.d) decodeResult).a(), sessionManager, getVehicleData, requestManager, str, hVar, transport);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return new a(fVar, "", null, null, null, null, 60, null);
    }

    public final a b(RoutableMessageDecoder.Result decodeResult, vu.a sessionManager, yu.e getVehicleData, uu.f requestManager, String str, uu.h hVar, ot.m transport) {
        ot.f fVar;
        String str2;
        vz.b0 b0Var;
        pt.a aVar;
        d4 e11;
        String str3;
        Map f11;
        vz.b0 b0Var2;
        Map f12;
        Map f13;
        String str4;
        vz.b0 b0Var3;
        kotlin.jvm.internal.s.g(decodeResult, "decodeResult");
        kotlin.jvm.internal.s.g(sessionManager, "sessionManager");
        kotlin.jvm.internal.s.g(getVehicleData, "getVehicleData");
        kotlin.jvm.internal.s.g(requestManager, "requestManager");
        kotlin.jvm.internal.s.g(transport, "transport");
        String str5 = null;
        String str6 = "";
        if (decodeResult instanceof RoutableMessageDecoder.Result.a.f) {
            f52424b.i("incorrect epoch information, replacing session info");
            if (str == null) {
                String i11 = ((RoutableMessageDecoder.Result.a.f) decodeResult).a().i();
                kotlin.jvm.internal.s.e(i11);
                str4 = ((uu.i) requestManager).p(i11);
            } else {
                str4 = str;
            }
            if (str4 == null) {
                b0Var3 = null;
            } else {
                sessionManager.d(((RoutableMessageDecoder.Result.a.f) decodeResult).a(), str4, hVar == null ? null : hVar.C());
                b0Var3 = vz.b0.f54756a;
            }
            if (b0Var3 == null) {
                c(str, decodeResult);
            }
            fVar = ot.f.RESULT_SESSION_INFO_RECOVERED;
        } else {
            boolean z11 = false;
            if (decodeResult instanceof RoutableMessageDecoder.Result.a.g) {
                yt.b a11 = ((RoutableMessageDecoder.Result.a.g) decodeResult).a();
                if (hVar == null) {
                    com.tesla.logging.g gVar = f52424b;
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    String h11 = gVar.h();
                    ht.a aVar2 = ht.a.f29422a;
                    f13 = r0.f(vz.v.a(h11, "request is null"));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : f13.entrySet()) {
                        ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception("request is null"));
                    TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
                    n80.a.a("request is null", new Object[0]);
                    throw new RuntimeException("request is null");
                }
                c(str, decodeResult);
                if (str != null) {
                    f52424b.i("clearing session info " + a11 + " " + str);
                    sessionManager.c(a11, str);
                }
                fVar = ot.f.RESULT_INCORRECT_SESSION_INFO_ERROR;
            } else if (decodeResult instanceof RoutableMessageDecoder.Result.a.i) {
                f52424b.i("not on whitelist");
                fVar = ot.f.RESULT_NOT_IN_WHITELIST;
            } else if (decodeResult instanceof RoutableMessageDecoder.Result.a.l) {
                Exception a12 = ((RoutableMessageDecoder.Result.a.l) decodeResult).a();
                if (a12 == null) {
                    b0Var2 = null;
                } else {
                    f52424b.d("exception was thrown while processing routable message", a12);
                    b0Var2 = vz.b0.f54756a;
                }
                if (b0Var2 == null) {
                    com.tesla.logging.g gVar2 = f52424b;
                    TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                    String h12 = gVar2.h();
                    ht.a aVar3 = ht.a.f29422a;
                    f12 = r0.f(vz.v.a(h12, "exception was thrown while processing routable message"));
                    FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry2 : f12.entrySet()) {
                        ht.a.f29422a.a((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    firebaseCrashlytics2.recordException(new Exception("exception was thrown while processing routable message"));
                    TeslaLog.setTag$default(teslaLog2, h12, false, 2, null);
                    n80.a.a("exception was thrown while processing routable message", new Object[0]);
                }
                fVar = ot.f.RESULT_INTERNAL_ERROR;
            } else if (decodeResult instanceof RoutableMessageDecoder.Result.a.m) {
                String a13 = ((RoutableMessageDecoder.Result.a.m) decodeResult).a();
                com.tesla.logging.g gVar3 = f52424b;
                TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                String h13 = gVar3.h();
                ht.a aVar4 = ht.a.f29422a;
                f11 = r0.f(vz.v.a(h13, a13));
                FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry3 : f11.entrySet()) {
                    ht.a.f29422a.a((String) entry3.getKey(), (String) entry3.getValue());
                }
                firebaseCrashlytics3.recordException(new Exception(a13));
                TeslaLog.setTag$default(teslaLog3, h13, false, 2, null);
                n80.a.a(a13, new Object[0]);
                fVar = ot.f.RESULT_INTERNAL_ERROR;
            } else {
                if (decodeResult instanceof RoutableMessageDecoder.Result.a.c) {
                    String a14 = ((RoutableMessageDecoder.Result.a.c) decodeResult).a();
                    f52424b.i("car server error result reason => " + a14);
                    str3 = a14;
                    fVar = ot.f.RESULT_CAR_SERVER_ERROR;
                    aVar = null;
                } else if (decodeResult instanceof RoutableMessageDecoder.Result.a.h) {
                    String a15 = ((RoutableMessageDecoder.Result.a.h) decodeResult).a();
                    f52424b.i(a15);
                    str3 = null;
                    str5 = a15;
                    fVar = ot.f.RESULT_NOMINAL_ERROR;
                    aVar = null;
                } else if (decodeResult instanceof RoutableMessageDecoder.Result.a.e) {
                    pt.a a16 = ((RoutableMessageDecoder.Result.a.e) decodeResult).a();
                    f52424b.i(decodeResult.toString());
                    str3 = null;
                    aVar = a16;
                    fVar = ot.f.RESULT_NOMINAL_ERROR;
                } else if (kotlin.jvm.internal.s.c(decodeResult, RoutableMessageDecoder.Result.a.p.f21930a)) {
                    fVar = ot.f.RESULT_VEHICLE_WAIT_ERROR;
                } else if (decodeResult instanceof RoutableMessageDecoder.Result.a.b) {
                    fVar = ot.f.RESULT_VEHICLE_BUSY_ERROR;
                } else if (decodeResult instanceof RoutableMessageDecoder.Result.a.o) {
                    fVar = ot.f.RESULT_VEHICLE_TIMEOUT;
                } else if (decodeResult instanceof RoutableMessageDecoder.Result.a.q) {
                    fVar = ot.f.RESULT_WHITELIST_FULL;
                } else if (decodeResult instanceof RoutableMessageDecoder.Result.a.d) {
                    fVar = ot.f.RESULT_INSUFFICIENT_PRIVILEGES;
                } else if (kotlin.jvm.internal.s.c(decodeResult, RoutableMessageDecoder.Result.a.n.f21928a)) {
                    fVar = ot.f.RESULT_VEHICLE_INTERNAL_ERROR;
                } else if (decodeResult instanceof RoutableMessageDecoder.Result.a.j) {
                    fVar = ot.f.RESULT_MOBILE_ACCESS_DISABLED;
                } else if (kotlin.jvm.internal.s.c(decodeResult, RoutableMessageDecoder.Result.a.C0397a.f21915a)) {
                    fVar = ot.f.RESULT_BAD_PARAMETER;
                } else if (kotlin.jvm.internal.s.c(decodeResult, RoutableMessageDecoder.Result.a.k.f21925a)) {
                    fVar = ot.f.RESULT_MOBILE_ACCESS_DISABLED;
                } else if (!(decodeResult instanceof RoutableMessageDecoder.Result.b)) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    RoutableMessageDecoder.Result.b bVar = (RoutableMessageDecoder.Result.b) decodeResult;
                    if (bVar instanceof RoutableMessageDecoder.Result.b.f) {
                        f52424b.i("sending PII key response over JsBridge");
                        a.EnumC0395a enumC0395a = a.EnumC0395a.CAR_API_PII_KEY_RESPONSE;
                        WritableNativeMap writableNativeMap = new WritableNativeMap();
                        writableNativeMap.putString("vehicleId", str);
                        writableNativeMap.putString("protoMessage", ((RoutableMessageDecoder.Result.b.f) decodeResult).a());
                        vz.b0 b0Var4 = vz.b0.f54756a;
                        com.tesla.logging.a.b(enumC0395a, writableNativeMap);
                        fVar = ot.f.RESULT_SUCCESS;
                    } else if (bVar instanceof RoutableMessageDecoder.Result.b.g) {
                        f52424b.i("sending ping over JsBridge");
                        a.EnumC0395a enumC0395a2 = a.EnumC0395a.CAR_API_VEHICLE_PING;
                        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                        writableNativeMap2.putString("vehicleId", str);
                        writableNativeMap2.putString("protoMessage", ((RoutableMessageDecoder.Result.b.g) decodeResult).a());
                        vz.b0 b0Var5 = vz.b0.f54756a;
                        com.tesla.logging.a.b(enumC0395a2, writableNativeMap2);
                        fVar = ot.f.RESULT_SUCCESS;
                    } else if (bVar instanceof RoutableMessageDecoder.Result.b.h) {
                        f52424b.i("Sending pseudonym response over JsBridge");
                        WritableNativeMap writableNativeMap3 = new WritableNativeMap();
                        kotlin.jvm.internal.s.e(str);
                        String d11 = getVehicleData.d(str);
                        kotlin.jvm.internal.s.e(d11);
                        writableNativeMap3.putString("vin", d11);
                        writableNativeMap3.putString("pseudonym", ((RoutableMessageDecoder.Result.b.h) decodeResult).a().c());
                        com.tesla.logging.a.b(a.EnumC0395a.PSEUDONYM_SYNC, writableNativeMap3);
                        fVar = ot.f.RESULT_SUCCESS;
                    } else {
                        if (bVar instanceof RoutableMessageDecoder.Result.b.a) {
                            if (uu.c.e(hVar) && (e11 = ((RoutableMessageDecoder.Result.b.a) decodeResult).a().e()) != null) {
                                if (b.f52431a[e11.e().ordinal()] == 1) {
                                    fVar = ot.f.RESULT_SUCCESS;
                                } else {
                                    str6 = zu.j.c(e11.encode(), 0, 1, null);
                                    fVar = ot.f.RESULT_WHITELIST_OPERATION_FAILURE;
                                }
                            }
                            fVar = null;
                            aVar = null;
                        } else if (bVar instanceof RoutableMessageDecoder.Result.b.C0398b) {
                            if (!uu.c.e(hVar)) {
                                if (hVar != null && hVar.U()) {
                                    z11 = true;
                                }
                                if (!z11) {
                                    fVar = ot.f.RESULT_SUCCESS;
                                }
                            }
                            fVar = null;
                            aVar = null;
                        } else if (bVar instanceof RoutableMessageDecoder.Result.b.i) {
                            if (str == null) {
                                String i12 = ((RoutableMessageDecoder.Result.b.i) decodeResult).a().i();
                                str2 = i12 == null ? null : ((uu.i) requestManager).p(i12);
                            } else {
                                str2 = str;
                            }
                            if (str2 == null) {
                                b0Var = null;
                            } else {
                                sessionManager.d(((RoutableMessageDecoder.Result.b.i) decodeResult).a(), str2, hVar == null ? null : hVar.C());
                                b0Var = vz.b0.f54756a;
                            }
                            if (b0Var == null) {
                                c(str, decodeResult);
                            }
                            vu.c a17 = ((RoutableMessageDecoder.Result.b.i) decodeResult).a();
                            str6 = Base64.encodeToString(new xt.h(a17.d(), zu.j.g(a17.h()), zu.j.g(a17.f()), a17.c(), null, null, 48, null).encode(), 2);
                            kotlin.jvm.internal.s.f(str6, "encodeToString(\n        …4.NO_WRAP\n              )");
                            vz.b0 b0Var6 = vz.b0.f54756a;
                            fVar = ot.f.RESULT_SUCCESS;
                        } else if (bVar instanceof RoutableMessageDecoder.Result.b.j) {
                            f52424b.i("sending streamMessage over JsBridge");
                            ju.c a18 = ((RoutableMessageDecoder.Result.b.j) decodeResult).a();
                            com.tesla.logging.a.b(a.EnumC0395a.CAR_API_STREAM_MESSAGE, zu.u.f60790a.b(a18.a()));
                            if (a18.b()) {
                                fVar = ot.f.RESULT_SUCCESS;
                            }
                            fVar = null;
                            aVar = null;
                        } else if (bVar instanceof RoutableMessageDecoder.Result.b.k) {
                            f52424b.i("sending vehicle data over JsBridge");
                            a.EnumC0395a enumC0395a3 = a.EnumC0395a.PROTO_VEHICLE_DATA;
                            WritableNativeMap writableNativeMap4 = new WritableNativeMap();
                            writableNativeMap4.putString("vehicleId", str);
                            writableNativeMap4.putString("protoMessage", ((RoutableMessageDecoder.Result.b.k) decodeResult).a());
                            writableNativeMap4.putInt("transport", transport.getValue());
                            vz.b0 b0Var7 = vz.b0.f54756a;
                            com.tesla.logging.a.b(enumC0395a3, writableNativeMap4);
                            c(str, decodeResult);
                            if (str != null) {
                                VehicleConnectivityStateManager.f21488a.p(str, VehicleConnectivityStateManager.c.ONLINE);
                            }
                            fVar = ot.f.RESULT_SUCCESS;
                        } else if (bVar instanceof RoutableMessageDecoder.Result.b.e) {
                            str6 = ((RoutableMessageDecoder.Result.b.e) decodeResult).a();
                            fVar = ot.f.RESULT_SUCCESS;
                        } else if (bVar instanceof RoutableMessageDecoder.Result.b.l) {
                            f52424b.i("sending vehicle data subscription over JsBridge");
                            a.EnumC0395a enumC0395a4 = a.EnumC0395a.CAR_API_VEHICLE_DATA_SUBSCRIPTION;
                            WritableNativeMap writableNativeMap5 = new WritableNativeMap();
                            writableNativeMap5.putString("vehicleId", str);
                            writableNativeMap5.putString("protoMessage", ((RoutableMessageDecoder.Result.b.l) decodeResult).a());
                            vz.b0 b0Var8 = vz.b0.f54756a;
                            com.tesla.logging.a.b(enumC0395a4, writableNativeMap5);
                            fVar = ot.f.RESULT_SUCCESS;
                        } else if (bVar instanceof RoutableMessageDecoder.Result.b.m) {
                            str6 = ((RoutableMessageDecoder.Result.b.m) decodeResult).a().encodeByteString().a();
                            fVar = ot.f.RESULT_SUCCESS;
                        } else if (bVar instanceof RoutableMessageDecoder.Result.b.c) {
                            str6 = ((RoutableMessageDecoder.Result.b.c) decodeResult).a().encodeByteString().a();
                            fVar = ot.f.RESULT_SUCCESS;
                        } else if (bVar instanceof RoutableMessageDecoder.Result.b.d) {
                            str6 = ((RoutableMessageDecoder.Result.b.d) decodeResult).a().encodeByteString().a();
                            fVar = ot.f.RESULT_SUCCESS;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        str3 = aVar;
                    }
                }
                return new a(fVar, str6, str5, aVar, str3, decodeResult.getTelemetryData());
            }
        }
        aVar = null;
        str3 = aVar;
        return new a(fVar, str6, str5, aVar, str3, decodeResult.getTelemetryData());
    }

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final ot.f f52425a;

        /* renamed from: b  reason: collision with root package name */
        private final String f52426b;

        /* renamed from: c  reason: collision with root package name */
        private final String f52427c;

        /* renamed from: d  reason: collision with root package name */
        private final pt.a f52428d;

        /* renamed from: e  reason: collision with root package name */
        private final String f52429e;

        /* renamed from: f  reason: collision with root package name */
        private final Map<String, String> f52430f;

        public a(ot.f fVar, String response, String str, pt.a aVar, String str2, Map<String, String> telemetryData) {
            kotlin.jvm.internal.s.g(response, "response");
            kotlin.jvm.internal.s.g(telemetryData, "telemetryData");
            this.f52425a = fVar;
            this.f52426b = response;
            this.f52427c = str;
            this.f52428d = aVar;
            this.f52429e = str2;
            this.f52430f = telemetryData;
        }

        public final ot.f a() {
            return this.f52425a;
        }

        public final String b() {
            return this.f52426b;
        }

        public final String c() {
            return this.f52427c;
        }

        public final pt.a d() {
            return this.f52428d;
        }

        public final String e() {
            return this.f52429e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f52425a == aVar.f52425a && kotlin.jvm.internal.s.c(this.f52426b, aVar.f52426b) && kotlin.jvm.internal.s.c(this.f52427c, aVar.f52427c) && this.f52428d == aVar.f52428d && kotlin.jvm.internal.s.c(this.f52429e, aVar.f52429e) && kotlin.jvm.internal.s.c(this.f52430f, aVar.f52430f);
            }
            return false;
        }

        public final Map<String, String> f() {
            return this.f52430f;
        }

        public final ot.f g() {
            return this.f52425a;
        }

        public int hashCode() {
            ot.f fVar = this.f52425a;
            int hashCode = (((fVar == null ? 0 : fVar.hashCode()) * 31) + this.f52426b.hashCode()) * 31;
            String str = this.f52427c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            pt.a aVar = this.f52428d;
            int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str2 = this.f52429e;
            return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f52430f.hashCode();
        }

        public String toString() {
            ot.f fVar = this.f52425a;
            String str = this.f52426b;
            String str2 = this.f52427c;
            pt.a aVar = this.f52428d;
            String str3 = this.f52429e;
            Map<String, String> map = this.f52430f;
            return "MessageEvaluationResult(commandResult=" + fVar + ", response=" + str + ", nominalErrorReason=" + str2 + ", genericNominalError=" + aVar + ", carServerErrorResultReason=" + str3 + ", telemetryData=" + map + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ a(ot.f r10, java.lang.String r11, java.lang.String r12, pt.a r13, java.lang.String r14, java.util.Map r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
            /*
                r9 = this;
                r0 = r16 & 4
                r1 = 0
                if (r0 == 0) goto L7
                r5 = r1
                goto L8
            L7:
                r5 = r12
            L8:
                r0 = r16 & 8
                if (r0 == 0) goto Le
                r6 = r1
                goto Lf
            Le:
                r6 = r13
            Lf:
                r0 = r16 & 16
                if (r0 == 0) goto L15
                r7 = r1
                goto L16
            L15:
                r7 = r14
            L16:
                r0 = r16 & 32
                if (r0 == 0) goto L20
                java.util.Map r0 = wz.p0.i()
                r8 = r0
                goto L21
            L20:
                r8 = r15
            L21:
                r2 = r9
                r3 = r10
                r4 = r11
                r2.<init>(r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ts.c.a.<init>(ot.f, java.lang.String, java.lang.String, pt.a, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}