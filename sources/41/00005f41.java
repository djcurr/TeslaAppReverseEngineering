package com.tesla.TeslaV4;

import android.app.Application;
import android.app.PendingIntent;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.AudioPlaybackConfiguration;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.work.b;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.o;
import com.facebook.react.r;
import com.facebook.react.v;
import com.facebook.soloader.SoLoader;
import com.tesla.TeslaV4.MainApplication;
import com.tesla.command.VehicleConnectivityStateManager;
import com.tesla.godot.TMGodotReactPackage;
import com.teslamotors.plugins.ble.card.OemWalletProvider;
import com.teslamotors.tesla.R;
import expo.modules.ApplicationLifecycleDispatcher;
import expo.modules.ReactNativeHostWrapper;
import io.realm.a0;
import it.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import nu.i;
import nu.j;
import okhttp3.Interceptor;
import org.godotengine.godot.GodotLib;
import tt.l;
import vz.m;
import wz.w;
import yu.k;
import yu.y;
import yu.z;
import zu.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0001\rB\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/tesla/TeslaV4/MainApplication;", "Landroid/app/Application;", "Lo5/c;", "Lcom/facebook/react/o;", "Lcom/tesla/logging/b;", "Lat/b;", "Lzu/c;", "Lyu/k;", "Landroidx/work/b$c;", "Lyu/a;", "<init>", "()V", "Companion", "b", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class MainApplication extends Application implements o5.c, o, com.tesla.logging.b, at.b, zu.c, k, b.c, yu.a {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final vz.k<com.tesla.logging.g> f21383c;

    /* renamed from: a */
    private final vz.k f21384a;

    /* renamed from: b */
    private final ReactNativeHostWrapper f21385b;

    /* loaded from: classes6.dex */
    static final class a extends u implements h00.a<com.tesla.logging.g> {

        /* renamed from: a */
        public static final a f21386a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final com.tesla.logging.g invoke() {
            return com.tesla.logging.g.f21878b.a("MainApplication");
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.tesla.logging.g c() {
            return (com.tesla.logging.g) MainApplication.f21383c.getValue();
        }

        public final void d(Context context, r rVar) {
        }
    }

    /* loaded from: classes6.dex */
    static final class c extends u implements h00.a<AppStateLifecycleObserver> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(0);
            MainApplication.this = r1;
        }

        @Override // h00.a
        /* renamed from: a */
        public final AppStateLifecycleObserver invoke() {
            return new AppStateLifecycleObserver(MainApplication.this);
        }
    }

    /* loaded from: classes6.dex */
    public static final class d implements ct.d {
        d() {
        }

        @Override // ct.d
        public void a(Context context, String title, String text, PendingIntent intent, int i11) {
            s.g(context, "context");
            s.g(title, "title");
            s.g(text, "text");
            s.g(intent, "intent");
            j.n(context, title, text, intent, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class e implements nu.d {
        e() {
            MainApplication.this = r1;
        }

        @Override // nu.d
        public String a() {
            Context applicationContext = MainApplication.this.getApplicationContext();
            s.f(applicationContext, "applicationContext");
            return ow.b.a(applicationContext);
        }

        @Override // nu.d
        public String b() {
            String z11 = z.p(MainApplication.this.getApplicationContext()).z();
            s.f(z11, "getInstance(applicationC…oteNotificationDeviceType");
            return z11;
        }

        @Override // nu.d
        public int getIcon() {
            return (!q.a() || Build.VERSION.SDK_INT < 29) ? R.drawable.ic_notification : R.mipmap.ic_launcher;
        }
    }

    /* loaded from: classes6.dex */
    public static final class f implements dt.a {
        f() {
        }

        @Override // dt.a
        public dt.b a(Context context, Bundle bundle, PendingIntent intent) {
            s.g(context, "context");
            s.g(bundle, "bundle");
            s.g(intent, "intent");
            dt.b g11 = new j(bundle, context).g(intent);
            s.f(g11, "TeslaNotificationFactory…).getNotification(intent)");
            return g11;
        }
    }

    /* loaded from: classes6.dex */
    public static final class g extends com.facebook.react.u {
        g(MainApplication mainApplication) {
            super(mainApplication);
        }

        @Override // com.facebook.react.u
        protected String getJSMainModuleName() {
            return "index";
        }

        @Override // com.facebook.react.u
        protected List<v> getPackages() {
            ArrayList<v> a11 = new com.facebook.react.g(this).a();
            s.f(a11, "PackageList(this).packages");
            a11.add(new fr.a());
            a11.add(new vq.a());
            a11.add(new ds.a());
            a11.add(new gv.e());
            a11.add(new TMGodotReactPackage());
            a11.addAll(cs.a.Companion.a().b());
            return a11;
        }

        @Override // com.facebook.react.u
        public boolean getUseDeveloperSupport() {
            return false;
        }
    }

    /* loaded from: classes6.dex */
    public static final class h extends AudioManager.AudioPlaybackCallback {
        h() {
        }

        @Override // android.media.AudioManager.AudioPlaybackCallback
        public void onPlaybackConfigChanged(List<AudioPlaybackConfiguration> list) {
            GodotLib.focusout();
        }
    }

    static {
        vz.k<com.tesla.logging.g> a11;
        a11 = m.a(a.f21386a);
        f21383c = a11;
    }

    public MainApplication() {
        vz.k a11;
        a11 = m.a(new c());
        this.f21384a = a11;
        this.f21385b = new ReactNativeHostWrapper(this, new g(this));
    }

    public static /* synthetic */ void j(Long l11) {
        v(l11);
    }

    public static /* synthetic */ void k(Throwable th2) {
        q(th2);
    }

    private final AppStateLifecycleObserver m() {
        return (AppStateLifecycleObserver) this.f21384a.getValue();
    }

    private final void n() {
        bt.a.a(new gs.a(this, new d()));
        ow.b.c(new i(new e()));
        com.wix.reactnativenotifications.core.notification.b.l(new f());
    }

    private final boolean o(String str) {
        return false;
    }

    private final boolean p() {
        return s.c(com.tesla.logging.f.a(this), getPackageName());
    }

    public static final void q(Throwable th2) {
        Companion.c().d("Rx unhandled error", th2);
    }

    private final void r() {
        AudioManager audioManager = (AudioManager) androidx.core.content.b.getSystemService(this, AudioManager.class);
        if (Build.VERSION.SDK_INT < 26 || audioManager == null) {
            return;
        }
        audioManager.registerAudioPlaybackCallback(new h(), null);
    }

    private final void s() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            Object systemService = getSystemService("usagestats");
            String str = null;
            UsageStatsManager usageStatsManager = systemService instanceof UsageStatsManager ? (UsageStatsManager) systemService : null;
            if (usageStatsManager == null) {
                return;
            }
            int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
            if (appStandbyBucket != 10) {
                if (appStandbyBucket == 20) {
                    str = "WORKING_SET";
                } else if (appStandbyBucket == 30) {
                    str = "FREQUENT";
                } else if (appStandbyBucket == 40) {
                    str = "RARE";
                } else if (i11 >= 30 && usageStatsManager.getAppStandbyBucket() == 45) {
                    str = "RESTRICTED";
                }
            }
            if (str == null) {
                return;
            }
            com.tesla.logging.g c11 = Companion.c();
            c11.i("App Standby Bucket: " + str);
        }
    }

    private final void t() {
        if (Build.VERSION.SDK_INT < 28 || p()) {
            return;
        }
        WebView.setDataDirectorySuffix(com.tesla.logging.f.a(this));
    }

    private final void u() {
        if (p()) {
            return;
        }
        hy.e.m(0L, 15L, TimeUnit.MINUTES).w(new ky.f() { // from class: zr.b
            @Override // ky.f
            public final void accept(Object obj) {
                MainApplication.j((Long) obj);
            }
        });
    }

    public static final void v(Long l11) {
        Companion.c().a("Heartbeat.");
    }

    @Override // com.tesla.logging.b
    public void a(String eventName, Object obj) {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        s.g(eventName, "eventName");
        if (o(eventName)) {
            return;
        }
        try {
            ReactContext A = this.f21385b.getReactInstanceManager().A();
            if (A != null && (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) A.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) != null) {
                rCTDeviceEventEmitter.emit(eventName, obj);
            }
        } catch (Exception e11) {
            com.tesla.logging.g c11 = Companion.c();
            c11.d("Error emitting event " + eventName, e11);
        }
    }

    @Override // at.b
    public List<Interceptor> b() {
        List<Interceptor> i11;
        i11 = w.i();
        return i11;
    }

    @Override // com.facebook.react.o
    public com.facebook.react.u c() {
        return this.f21385b;
    }

    @Override // yu.a
    public void d(String vehicleId, boolean z11) {
        s.g(vehicleId, "vehicleId");
        VehicleConnectivityStateManager vehicleConnectivityStateManager = VehicleConnectivityStateManager.f21488a;
        vehicleConnectivityStateManager.p(vehicleId, z11 ? VehicleConnectivityStateManager.c.OFFLINE : VehicleConnectivityStateManager.c.ONLINE);
        if (z11) {
            return;
        }
        vehicleConnectivityStateManager.q(vehicleId);
    }

    @Override // zu.c
    public boolean e() {
        return m().e();
    }

    @Override // o5.c
    public String f() {
        return "com.teslamotors.tesla.provider";
    }

    @Override // androidx.work.b.c
    public androidx.work.b g() {
        androidx.work.b a11 = new b.C0115b().b(4).a();
        s.f(a11, "Builder()\n      .setMini….Log.INFO)\n      .build()");
        return a11;
    }

    @Override // zu.c
    public hy.i<Boolean> h() {
        return m().h();
    }

    @Override // yu.k
    public void i() {
        Companion.c().i("products fetched, triggering features config refresh.");
        e.a aVar = it.e.f32754a;
        Context applicationContext = getApplicationContext();
        s.f(applicationContext, "applicationContext");
        e.b.a(aVar.a(applicationContext), false, 1, null).s();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        s.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        ApplicationLifecycleDispatcher.onConfigurationChanged(this, newConfig);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        com.tesla.logging.e.b(this);
        s();
        u();
        if (!p()) {
            zu.h.f60771a.b(new hs.a(this));
        }
        if (q.a()) {
            if (!zu.i.f60774a.a()) {
                if (!p()) {
                    mu.c cVar = mu.c.f39463a;
                    cVar.b(this);
                    cVar.d(zu.h.f60771a.a(), this);
                }
                t();
            } else {
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }
        l lVar = l.ANDROID_APPLICATION_ON_CREATE;
        lu.d.a(lVar);
        ProcessLifecycleOwner.h().getLifecycle().a(m());
        j.b(this);
        SoLoader.l(this, false);
        OemWalletProvider.Companion.c(this);
        b bVar = Companion;
        r reactInstanceManager = c().getReactInstanceManager();
        s.f(reactInstanceManager, "getReactNativeHost().reactInstanceManager");
        bVar.d(this, reactInstanceManager);
        ApplicationLifecycleDispatcher.onApplicationCreate(this);
        zu.d.a();
        if (!p()) {
            a0.h1(this);
        }
        cs.a.Companion.a().c(this);
        az.a.z(new ky.f() { // from class: zr.c
            @Override // ky.f
            public final void accept(Object obj) {
                MainApplication.k((Throwable) obj);
            }
        });
        n();
        ev.b bVar2 = ev.b.f25256a;
        is.a aVar = new is.a(this);
        ct.i i11 = ct.i.i();
        s.f(i11, "getDB()");
        bVar2.e(aVar, new cv.h(i11, yu.j.a(this), com.tesla.data.oapi.h.f21733b.a(this), y.f59842h.a(this)));
        as.a.f6719a.a(this);
        registerActivityLifecycleCallbacks(org.wonday.orientation.a.a());
        r();
        lu.d.b(lVar);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        Companion.c().a("Low Memory Warning - Java Heap");
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        super.onTrimMemory(i11);
        String str = i11 != 5 ? i11 != 10 ? i11 != 15 ? i11 != 20 ? i11 != 40 ? i11 != 60 ? i11 != 80 ? "UNKNOWN" : "COMPLETE" : "MODERATE" : "BACKGROUND" : "UI_HIDDEN" : "RUNNING_CRITICAL" : "RUNNING_LOW" : "RUNNING_MODERATE";
        com.tesla.logging.g c11 = Companion.c();
        c11.i("onTrimMemory: " + str);
    }
}