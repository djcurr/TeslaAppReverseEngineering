package wu;

import android.content.Context;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.tesla.data.HttpMethodType;
import com.tesla.logging.TeslaLog;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;
import vz.m;
import vz.v;
import wz.r0;
import yu.a0;
import yu.f;
import yu.y;
import yu.z;

/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a */
    private final Context f56211a;

    /* renamed from: b */
    private final vz.k f56212b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class b extends u implements h00.a<z> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            k.this = r1;
        }

        @Override // h00.a
        /* renamed from: a */
        public final z invoke() {
            return z.p(k.this.f56211a);
        }
    }

    static {
        new a(null);
    }

    public k(Context context) {
        vz.k a11;
        s.g(context, "context");
        this.f56211a = context.getApplicationContext();
        a11 = m.a(new b());
        this.f56212b = a11;
    }

    public static /* synthetic */ void a(com.tesla.data.oapi.g gVar, com.tesla.data.oapi.k kVar) {
        o(gVar, kVar);
    }

    public static /* synthetic */ void b(com.tesla.data.oapi.g gVar, Throwable th2) {
        p(gVar, th2);
    }

    private final z e() {
        Object value = this.f56212b.getValue();
        s.f(value, "<get-client>(...)");
        return (z) value;
    }

    private final at.h g() {
        JSONObject r11 = e().r();
        if (r11 == null) {
            return null;
        }
        return new at.h(r11);
    }

    private final String h() {
        at.h g11 = g();
        if (g11 == null) {
            return null;
        }
        return g11.d();
    }

    public static final void o(com.tesla.data.oapi.g callback, com.tesla.data.oapi.k kVar) {
        s.g(callback, "$callback");
        if (kVar.i()) {
            callback.b(kVar.e());
        } else {
            callback.a(kVar.b());
        }
    }

    public static final void p(com.tesla.data.oapi.g callback, Throwable it2) {
        s.g(callback, "$callback");
        if (it2 instanceof TimeoutException) {
            callback.c();
            return;
        }
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        s.f(it2, "it");
        teslaLog.e("[ANDROID SHARE]", "Error sending destination", it2);
        g gVar = g.f56207a;
        String message = it2.getMessage();
        gVar.a("Exception throw sending destination " + message);
        callback.a(com.tesla.data.oapi.f.OWNERAPI_ERROR_UNKNOWN_ERROR);
    }

    public final boolean d() {
        at.h g11 = g();
        if (g11 == null) {
            return true;
        }
        return g11.a();
    }

    public final String f() {
        at.h g11 = g();
        if (g11 == null) {
            return null;
        }
        String b11 = g11.b();
        String g12 = g11.g();
        if (b11 != null) {
            if (g12 == null) {
                return b11;
            }
            String substring = g12.substring(g12.length() - 6);
            s.f(substring, "(this as java.lang.String).substring(startIndex)");
            if (!s.c(b11, substring)) {
                return b11;
            }
        }
        String f11 = g11.f();
        if (f11 != null) {
            Character valueOf = g12 != null ? Character.valueOf(g12.charAt(3)) : null;
            if (!s.c(f11, "model3") && (valueOf == null || valueOf.charValue() != '3')) {
                if (!s.c(f11, "models") && !s.c(f11, "models2") && !s.c(f11, "lychee") && (valueOf == null || valueOf.charValue() != 'S')) {
                    if (s.c(f11, "modelx") || s.c(f11, "tamarind") || (valueOf != null && valueOf.charValue() == 'X')) {
                        return this.f56211a.getString(d.f56201q);
                    }
                    return (s.c(f11, "modely") || (valueOf != null && valueOf.charValue() == 'Y')) ? this.f56211a.getString(d.f56202r) : b11;
                }
                return this.f56211a.getString(d.f56200p);
            }
            return this.f56211a.getString(d.f56199o);
        }
        return b11;
    }

    public final boolean i() {
        return e().a();
    }

    public final boolean j() {
        return e().t() != null;
    }

    public final boolean k() {
        at.h g11 = g();
        if (g11 == null) {
            return false;
        }
        return g11.e();
    }

    public final boolean l() {
        JSONObject r11 = e().r();
        return (r11 != null && s.c("VEHICLE", r11.optString("type"))) && g() != null;
    }

    public final void m() {
        try {
            at.h g11 = g();
            if (g11 == null) {
                return;
            }
            g11.h();
        } catch (JSONException unused) {
        }
    }

    public final boolean n(JSONObject data, final com.tesla.data.oapi.g callback, long j11) {
        Map f11;
        s.g(data, "data");
        s.g(callback, "callback");
        String h11 = h();
        if (h11 == null) {
            return false;
        }
        y.a aVar = y.f59842h;
        Context appContext = this.f56211a;
        s.f(appContext, "appContext");
        y a11 = aVar.a(appContext);
        g.f56207a.a("Sending destination to vehicle");
        f11 = r0.f(v.a("vehicle_id", h11));
        f.a.d(a11, HttpMethodType.POST, a0.f59768c.c() + "api/1/vehicles/{vehicle_id}/command/share", f11, data, null, null, null, false, false, DownloaderService.STATUS_HTTP_EXCEPTION, null).x(j11, TimeUnit.SECONDS).p(gy.b.c()).u(new ky.f() { // from class: wu.i
            @Override // ky.f
            public final void accept(Object obj) {
                k.a(com.tesla.data.oapi.g.this, (com.tesla.data.oapi.k) obj);
            }
        }, new ky.f() { // from class: wu.j
            @Override // ky.f
            public final void accept(Object obj) {
                k.b(callback, (Throwable) obj);
            }
        });
        return true;
    }

    public final void q(boolean z11) {
        try {
            at.h g11 = g();
            if (g11 == null) {
                return;
            }
            g11.i(z11);
        } catch (JSONException unused) {
        }
    }
}