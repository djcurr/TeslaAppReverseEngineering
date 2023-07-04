package nu;

import android.content.Context;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.stripe.android.core.networking.AnalyticsFields;
import com.tesla.TeslaV4.BuildConfig;
import com.tesla.data.oapi.k;
import com.tesla.logging.TeslaLog;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import okhttp3.Headers;
import org.json.JSONObject;
import vz.v;
import wz.r0;
import yu.f;
import yu.y;

/* loaded from: classes6.dex */
public final class i implements ow.a {

    /* renamed from: b */
    private static final com.tesla.logging.g f41881b;

    /* renamed from: a */
    private final d f41882a;

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
        f41881b = com.tesla.logging.g.f21878b.a("TeslaNotificationDependencies");
    }

    public i(d parameters) {
        s.g(parameters, "parameters");
        this.f41882a = parameters;
    }

    public static /* synthetic */ void f(k kVar) {
        h(kVar);
    }

    public static /* synthetic */ void g(Throwable th2) {
        i(th2);
    }

    public static final void h(k kVar) {
        com.tesla.logging.g gVar = f41881b;
        JSONObject e11 = kVar.e();
        Headers d11 = kVar.d();
        String str = d11 == null ? null : d11.get("x-txid");
        gVar.i("sendNotificationConfirmation: " + e11 + " message id : " + str);
    }

    public static final void i(Throwable th2) {
        Map f11;
        com.tesla.logging.g gVar = f41881b;
        String str = "sendNotificationConfirmation: " + th2.getMessage() + " ";
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String h11 = gVar.h();
        ht.a aVar = ht.a.f29422a;
        f11 = r0.f(v.a(h11, str));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : f11.entrySet()) {
            ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(str));
        TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
        n80.a.a(str, new Object[0]);
    }

    @Override // ow.a
    public String a() {
        return BuildConfig.JPUSH_APPKEY;
    }

    @Override // ow.a
    public String b(Context context) {
        s.g(context, "context");
        return yu.b.n(context);
    }

    @Override // ow.a
    public void c(mw.e notification, Context context, com.wix.reactnativenotifications.core.notification.a type) {
        s.g(notification, "notification");
        s.g(context, "context");
        s.g(type, "type");
        JSONObject c11 = notification.c();
        if (c11 == null) {
            return;
        }
        Context appContext = context.getApplicationContext();
        c11.put("time_received", System.currentTimeMillis() / 1000);
        c11.put(AnalyticsFields.DEVICE_TYPE, this.f41882a.b());
        c11.put("device_token", this.f41882a.a());
        c11.put("delivery_type", type.getParam());
        y.a aVar = y.f59842h;
        s.f(appContext, "appContext");
        f.a.e(aVar.a(appContext), "POST", "api/1/notification_confirmations", null, c11, null, null, null, false, false, DownloaderService.STATUS_HTTP_EXCEPTION, null).w(bz.a.c()).u(new ky.f() { // from class: nu.g
            @Override // ky.f
            public final void accept(Object obj) {
                i.f((k) obj);
            }
        }, new ky.f() { // from class: nu.h
            @Override // ky.f
            public final void accept(Object obj) {
                i.g((Throwable) obj);
            }
        });
    }

    @Override // ow.a
    public int d() {
        return this.f41882a.getIcon();
    }

    @Override // ow.a
    public void e(Context context, String str) {
        s.g(context, "context");
        yu.b.D(context, str);
    }
}