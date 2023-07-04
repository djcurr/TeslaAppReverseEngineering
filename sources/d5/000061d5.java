package com.teslamotors.TeslaApp;

import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.facebook.react.l;
import com.facebook.react.m;
import com.facebook.react.z;
import com.swmansion.gesturehandler.react.c;
import com.tesla.TeslaV4.BuildConfig;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.a;
import com.tesla.logging.g;
import com.teslamotors.TeslaApp.MainActivity;
import com.wix.reactnativenotifications.core.notification.IPushNotification;
import expo.modules.ReactActivityDelegateWrapper;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import ku.e;
import lw.f;
import yf.d;
import zu.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/teslamotors/TeslaApp/MainActivity;", "Lcom/facebook/react/l;", "<init>", "()V", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class MainActivity extends l {

    /* renamed from: c */
    private static final g f22062c;

    /* renamed from: d */
    public static final /* synthetic */ int f22063d = 0;

    /* renamed from: b */
    private d f22064b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super((l) r1, str);
            MainActivity.this = r1;
        }

        @Override // com.facebook.react.m
        protected z createRootView() {
            return new c(MainActivity.this);
        }

        @Override // com.facebook.react.m
        protected Bundle getLaunchOptions() {
            yu.z p11 = yu.z.p(MainActivity.this);
            Bundle bundle = new Bundle();
            bundle.putString("gitHash", yu.b.e());
            bundle.putString("remoteNotificationDeviceType", p11.z());
            bundle.putString("appStartTimestamp", String.valueOf(System.currentTimeMillis()));
            bundle.putLong("binaryBuiltMillis", BuildConfig.BINARY_BUILD_TIMESTAMP);
            return bundle;
        }
    }

    static {
        new a(null);
        f22062c = g.f21878b.a("MainActivity");
    }

    public static /* synthetic */ void m() {
        o();
    }

    private final void n() {
        long j11 = 1024;
        long freeMemory = (Runtime.getRuntime().freeMemory() / j11) / j11;
        StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
        long availableBlocksLong = ((statFs.getAvailableBlocksLong() * statFs.getFreeBlocksLong()) / j11) / j11;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        teslaLog.d("MainApplication", "Free Disk Space : " + availableBlocksLong + " Mb");
        teslaLog.d("MainApplication", "Free Memory Java Heap : " + freeMemory + " Mb");
    }

    public static final void o() {
        com.tesla.logging.a.d(a.EnumC0395a.MOTION_SHAKE, null, 2, null);
    }

    @Override // com.facebook.react.l
    protected m k() {
        return new ReactActivityDelegateWrapper(this, new b(l()));
    }

    @Override // com.facebook.react.l
    protected String l() {
        return "TeslaV4";
    }

    @Override // com.facebook.react.l, androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        g gVar = f22062c;
        gVar.i("onCreate started");
        lu.d.a(tt.l.ANDROID_TIME_TO_INTERACTIVE);
        lu.d.a(tt.l.JS_STARTUP);
        jg.a.d().a(getApplicationContext(), false);
        super.onCreate(null);
        n();
        if (q.a()) {
            mu.c.f39463a.d(true, this);
        }
        this.f22064b = new d(new d.a() { // from class: fv.a
            @Override // yf.d.a
            public final void a() {
                MainActivity.m();
            }
        });
        gVar.i("onCreate ended");
    }

    @Override // com.facebook.react.l, androidx.fragment.app.h, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null && f.a(intent)) {
            Bundle c11 = f.c(intent);
            s.f(c11, "extractBundleFromIntent(intent)");
            IPushNotification j11 = com.wix.reactnativenotifications.core.notification.b.j(getApplicationContext(), c11);
            if (j11 == null) {
                return;
            }
            j11.c();
        }
    }

    @Override // com.facebook.react.l, androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        super.onPause();
        d dVar = this.f22064b;
        if (dVar == null) {
            s.x("shakeDetector");
            dVar = null;
        }
        dVar.f();
        av.m.n(this);
        e.f35884a.a().c(tt.l.WAKE_TO_FRESH_DATA);
    }

    @Override // com.facebook.react.l, androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        d dVar = this.f22064b;
        if (dVar == null) {
            s.x("shakeDetector");
            dVar = null;
        }
        Object systemService = getSystemService("sensor");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        dVar.e((SensorManager) systemService);
    }
}