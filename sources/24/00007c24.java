package js;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.a;
import java.util.Map;
import js.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import okhttp3.Authenticator;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import vz.v;
import wz.r0;

/* loaded from: classes6.dex */
public final class j implements Authenticator {

    /* renamed from: b  reason: collision with root package name */
    private static final com.tesla.logging.g f33958b;

    /* renamed from: a  reason: collision with root package name */
    private final b f33959a;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        f33958b = com.tesla.logging.g.f21878b.a("TeslaAuthenticator");
    }

    public j(b repository) {
        s.g(repository, "repository");
        this.f33959a = repository;
    }

    private static final Request a(String str, HttpUrl httpUrl, Request.Builder builder, String str2) {
        com.tesla.logging.g gVar = f33958b;
        gVar.i("token expired, fetched new token, re-authing <" + str + " - " + httpUrl + ">");
        return c.f33945a.c(builder, str2);
    }

    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, Response response) {
        Map f11;
        Map f12;
        Request a11;
        Map f13;
        s.g(response, "response");
        Request request = response.request();
        HttpUrl url = request.url();
        String header = request.header("X-TXID");
        c cVar = c.f33945a;
        String b11 = cVar.b(request);
        if (b11 == null) {
            return null;
        }
        com.tesla.logging.g gVar = f33958b;
        gVar.i("queued request for re-auth <" + header + " - " + url + ">");
        synchronized (this) {
            String a12 = this.f33959a.a();
            Request.Builder newBuilder = request.newBuilder();
            if (a12 == null) {
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String h11 = gVar.h();
                ht.a aVar = ht.a.f29422a;
                f13 = r0.f(v.a(h11, "null auth token"));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : f13.entrySet()) {
                    ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception("null auth token"));
                TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
                n80.a.a("null auth token", new Object[0]);
                com.tesla.logging.a.d(a.EnumC0395a.AUTH_FAILURE, null, 2, null);
                return null;
            } else if (!s.c(a12, b11)) {
                gVar.i("token was already fetched, re-authing <" + header + " - " + url + ">");
                return cVar.c(newBuilder, a12);
            } else if (request.header("TeslaAuthenticator:Retry") == null) {
                newBuilder.header("TeslaAuthenticator:Retry", "");
                k a13 = new d(this.f33959a).a();
                if (a13 instanceof k.d) {
                    gVar.i("successfully refreshed token, resetting header... <" + header + " - " + url + ">");
                    a11 = a(header, url, newBuilder, ((k.d) a13).a());
                } else if (a13 instanceof k.b) {
                    String str = "successfully get new refresh token locally... <" + header + " - " + url + ">";
                    TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                    String h12 = gVar.h();
                    ht.a aVar2 = ht.a.f29422a;
                    f12 = r0.f(v.a(h12, str));
                    FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry2 : f12.entrySet()) {
                        ht.a.f29422a.a((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    firebaseCrashlytics2.recordException(new Exception(str));
                    TeslaLog.setTag$default(teslaLog2, h12, false, 2, null);
                    n80.a.a(str, new Object[0]);
                    a11 = a(header, url, newBuilder, ((k.b) a13).a());
                } else if (a13 instanceof k.c) {
                    int b12 = ((k.c) a13).b();
                    if (b12 == com.tesla.data.oapi.j.UNAUTHORIZED.getCode()) {
                        com.tesla.logging.a.d(a.EnumC0395a.AUTH_FAILURE, null, 2, null);
                    } else {
                        String str2 = "remote failure of refresh token, code: " + b12 + " <" + header + " - " + url + ">";
                        TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                        String h13 = gVar.h();
                        ht.a aVar3 = ht.a.f29422a;
                        f11 = r0.f(v.a(h13, str2));
                        FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                        for (Map.Entry entry3 : f11.entrySet()) {
                            ht.a.f29422a.a((String) entry3.getKey(), (String) entry3.getValue());
                        }
                        firebaseCrashlytics3.recordException(new Exception(str2));
                        TeslaLog.setTag$default(teslaLog3, h13, false, 2, null);
                        n80.a.a(str2, new Object[0]);
                    }
                    return null;
                } else if (a13 instanceof k.a) {
                    gVar.i("local failure of refresh token, nothing more to be done.");
                    return null;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return a11;
            } else {
                return null;
            }
        }
    }
}