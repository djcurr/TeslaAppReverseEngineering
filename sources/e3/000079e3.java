package io.sentry.react;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.swmansion.reanimated.BuildConfig;
import fg.a;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.l0;
import io.sentry.android.core.s0;
import io.sentry.android.core.y;
import io.sentry.b3;
import io.sentry.c;
import io.sentry.c2;
import io.sentry.f3;
import io.sentry.g3;
import io.sentry.h4;
import io.sentry.m0;
import io.sentry.protocol.m;
import io.sentry.protocol.n;
import io.sentry.protocol.p;
import io.sentry.protocol.w;
import io.sentry.react.RNSentryModule;
import io.sentry.t;
import io.sentry.u1;
import io.sentry.v1;
import io.sentry.z;
import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import mu.d;

@a(name = RNSentryModule.NAME)
/* loaded from: classes5.dex */
public class RNSentryModule extends ReactContextBaseJavaModule {
    private static final int FROZEN_FRAME_THRESHOLD = 700;
    public static final String NAME = "RNSentry";
    private static final int SLOW_FRAME_THRESHOLD = 16;
    private static boolean didFetchAppStart;
    private static final Logger logger = Logger.getLogger("react-native-sentry");
    private boolean androidXAvailable;
    private FrameMetricsAggregator frameMetricsAggregator;
    private PackageInfo packageInfo;

    public RNSentryModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.packageInfo = null;
        this.frameMetricsAggregator = null;
        this.androidXAvailable = true;
        this.packageInfo = getPackageInfo(reactApplicationContext);
    }

    private void addPackages(b3 b3Var, m mVar) {
        m J = b3Var.J();
        if (J == null || !J.f().equals("sentry.javascript.react-native") || mVar == null) {
            return;
        }
        List<p> g11 = mVar.g();
        if (g11 != null) {
            for (p pVar : g11) {
                J.d(pVar.a(), pVar.b());
            }
        }
        List<String> e11 = mVar.e();
        if (e11 != null) {
            for (String str : e11) {
                J.c(str);
            }
        }
        b3Var.X(J);
    }

    public static /* synthetic */ void b(ReadableMap readableMap, String str, u1 u1Var) {
        lambda$setContext$6(readableMap, str, u1Var);
    }

    public static /* synthetic */ void c(u1 u1Var) {
        u1Var.c();
    }

    private boolean checkAndroidXAvailability() {
        return true;
    }

    public static /* synthetic */ void d(String str, String str2, u1 u1Var) {
        u1Var.v(str, str2);
    }

    public static /* synthetic */ void e(ReadableMap readableMap, ReadableMap readableMap2, u1 u1Var) {
        lambda$setUser$2(readableMap, readableMap2, u1Var);
    }

    public static /* synthetic */ void f(ReadableMap readableMap, u1 u1Var) {
        lambda$addBreadcrumb$3(readableMap, u1Var);
    }

    private static PackageInfo getPackageInfo(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            logger.warning("Error getting package info.");
            return null;
        }
    }

    public static /* synthetic */ void h(String str, String str2, u1 u1Var) {
        u1Var.w(str, str2);
    }

    private boolean isFrameMetricsAggregatorAvailable() {
        return this.androidXAvailable && this.frameMetricsAggregator != null;
    }

    public static /* synthetic */ void lambda$addBreadcrumb$3(ReadableMap readableMap, u1 u1Var) {
        c cVar = new c();
        if (readableMap.hasKey("message")) {
            cVar.o(readableMap.getString("message"));
        }
        if (readableMap.hasKey("type")) {
            cVar.p(readableMap.getString("type"));
        }
        if (readableMap.hasKey("category")) {
            cVar.l(readableMap.getString("category"));
        }
        if (readableMap.hasKey("level")) {
            String string = readableMap.getString("level");
            string.hashCode();
            char c11 = 65535;
            switch (string.hashCode()) {
                case 3237038:
                    if (string.equals("info")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 95458899:
                    if (string.equals(BuildConfig.BUILD_TYPE)) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 96784904:
                    if (string.equals("error")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 97203460:
                    if (string.equals("fatal")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 1124446108:
                    if (string.equals("warning")) {
                        c11 = 4;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    cVar.n(f3.INFO);
                    break;
                case 1:
                    cVar.n(f3.DEBUG);
                    break;
                case 2:
                    cVar.n(f3.ERROR);
                    break;
                case 3:
                    cVar.n(f3.FATAL);
                    break;
                case 4:
                    cVar.n(f3.WARNING);
                    break;
                default:
                    cVar.n(f3.ERROR);
                    break;
            }
        }
        if (readableMap.hasKey(MessageExtension.FIELD_DATA)) {
            ReadableMap map = readableMap.getMap(MessageExtension.FIELD_DATA);
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                cVar.m(nextKey, map.getString(nextKey));
            }
        }
        u1Var.a(cVar);
    }

    public /* synthetic */ b3 lambda$initNativeSdk$0(SentryAndroidOptions sentryAndroidOptions, b3 b3Var, t tVar) {
        try {
            n nVar = b3Var.n0().get(0);
            if (nVar != null) {
                if (nVar.i().contains("JavascriptException")) {
                    return null;
                }
            }
        } catch (Throwable unused) {
        }
        setEventOriginTag(b3Var);
        addPackages(b3Var, sentryAndroidOptions.getSdkVersion());
        return b3Var;
    }

    public /* synthetic */ void lambda$initNativeSdk$1(ReadableMap readableMap, final SentryAndroidOptions sentryAndroidOptions) {
        if (readableMap.hasKey(BuildConfig.BUILD_TYPE) && readableMap.getBoolean(BuildConfig.BUILD_TYPE)) {
            sentryAndroidOptions.setDebug(true);
            logger.setLevel(Level.INFO);
        }
        if (readableMap.hasKey("dsn") && readableMap.getString("dsn") != null) {
            String string = readableMap.getString("dsn");
            logger.info(String.format("Starting with DSN: '%s'", string));
            sentryAndroidOptions.setDsn(string);
        } else {
            sentryAndroidOptions.setDsn("");
        }
        if (readableMap.hasKey("maxBreadcrumbs")) {
            sentryAndroidOptions.setMaxBreadcrumbs(readableMap.getInt("maxBreadcrumbs"));
        }
        if (readableMap.hasKey("maxCacheItems")) {
            sentryAndroidOptions.setMaxCacheItems(readableMap.getInt("maxCacheItems"));
        }
        if (readableMap.hasKey("environment") && readableMap.getString("environment") != null) {
            sentryAndroidOptions.setEnvironment(readableMap.getString("environment"));
        }
        if (readableMap.hasKey("release") && readableMap.getString("release") != null) {
            sentryAndroidOptions.setRelease(readableMap.getString("release"));
        }
        if (readableMap.hasKey("dist") && readableMap.getString("dist") != null) {
            sentryAndroidOptions.setDist(readableMap.getString("dist"));
        }
        if (readableMap.hasKey("enableAutoSessionTracking")) {
            sentryAndroidOptions.setEnableAutoSessionTracking(readableMap.getBoolean("enableAutoSessionTracking"));
        }
        if (readableMap.hasKey("sessionTrackingIntervalMillis")) {
            sentryAndroidOptions.setSessionTrackingIntervalMillis(readableMap.getInt("sessionTrackingIntervalMillis"));
        }
        if (readableMap.hasKey("shutdownTimeout")) {
            sentryAndroidOptions.setShutdownTimeoutMillis(readableMap.getInt("shutdownTimeout"));
        }
        if (readableMap.hasKey("enableNdkScopeSync")) {
            sentryAndroidOptions.setEnableScopeSync(readableMap.getBoolean("enableNdkScopeSync"));
        }
        if (readableMap.hasKey("attachStacktrace")) {
            sentryAndroidOptions.setAttachStacktrace(readableMap.getBoolean("attachStacktrace"));
        }
        if (readableMap.hasKey("attachThreads")) {
            sentryAndroidOptions.setAttachThreads(readableMap.getBoolean("attachThreads"));
        }
        if (readableMap.hasKey("sendDefaultPii")) {
            sentryAndroidOptions.setSendDefaultPii(readableMap.getBoolean("sendDefaultPii"));
        }
        if (readableMap.hasKey("enableAutoPerformanceTracking") && readableMap.getBoolean("enableAutoPerformanceTracking")) {
            boolean checkAndroidXAvailability = checkAndroidXAvailability();
            this.androidXAvailable = checkAndroidXAvailability;
            if (checkAndroidXAvailability) {
                this.frameMetricsAggregator = new FrameMetricsAggregator();
                Activity currentActivity = getCurrentActivity();
                FrameMetricsAggregator frameMetricsAggregator = this.frameMetricsAggregator;
                if (frameMetricsAggregator != null && currentActivity != null) {
                    try {
                        frameMetricsAggregator.a(currentActivity);
                    } catch (Throwable unused) {
                        logger.warning("Error adding Activity to frameMetricsAggregator.");
                    }
                }
            } else {
                logger.warning("androidx.core' isn't available as a dependency.");
            }
        } else {
            disableNativeFramesTracking();
        }
        sentryAndroidOptions.setBeforeSend(new g3.b() { // from class: pz.h
            @Override // io.sentry.g3.b
            public final b3 a(b3 b3Var, t tVar) {
                b3 lambda$initNativeSdk$0;
                lambda$initNativeSdk$0 = RNSentryModule.this.lambda$initNativeSdk$0(sentryAndroidOptions, b3Var, tVar);
                return lambda$initNativeSdk$0;
            }
        });
        if (readableMap.hasKey("enableNativeCrashHandling") && !readableMap.getBoolean("enableNativeCrashHandling")) {
            List<m0> integrations = sentryAndroidOptions.getIntegrations();
            for (m0 m0Var : integrations) {
                if ((m0Var instanceof h4) || (m0Var instanceof io.sentry.android.core.t) || (m0Var instanceof l0)) {
                    integrations.remove(m0Var);
                }
            }
        }
        sentryAndroidOptions.setTracesSampler(new d());
        logger.info(String.format("Native Integrations '%s'", sentryAndroidOptions.getIntegrations().toString()));
    }

    public static /* synthetic */ void lambda$setContext$6(ReadableMap readableMap, String str, u1 u1Var) {
        u1Var.u(str, readableMap.toHashMap());
    }

    public static /* synthetic */ void lambda$setUser$2(ReadableMap readableMap, ReadableMap readableMap2, u1 u1Var) {
        if (readableMap == null && readableMap2 == null) {
            u1Var.y(null);
            return;
        }
        w wVar = new w();
        if (readableMap != null) {
            if (readableMap.hasKey("email")) {
                wVar.k(readableMap.getString("email"));
            }
            if (readableMap.hasKey("id")) {
                wVar.l(readableMap.getString("id"));
            }
            if (readableMap.hasKey("username")) {
                wVar.p(readableMap.getString("username"));
            }
            if (readableMap.hasKey("ip_address")) {
                wVar.m(readableMap.getString("ip_address"));
            }
        }
        if (readableMap2 != null) {
            HashMap hashMap = new HashMap();
            ReadableMapKeySetIterator keySetIterator = readableMap2.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                hashMap.put(nextKey, readableMap2.getString(nextKey));
            }
            wVar.n(hashMap);
        }
        u1Var.y(wVar);
    }

    private void setEventEnvironmentTag(b3 b3Var, String str, String str2) {
        b3Var.Z("event.origin", str);
        b3Var.Z("event.environment", str2);
    }

    private void setEventOriginTag(b3 b3Var) {
        m J = b3Var.J();
        if (J != null) {
            String f11 = J.f();
            f11.hashCode();
            if (f11.equals("sentry.native")) {
                setEventEnvironmentTag(b3Var, "android", "native");
            } else if (f11.equals("sentry.java.android")) {
                setEventEnvironmentTag(b3Var, "android", "java");
            }
        }
    }

    @ReactMethod
    public void addBreadcrumb(final ReadableMap readableMap) {
        c2.f(new v1() { // from class: pz.a
            @Override // io.sentry.v1
            public final void a(u1 u1Var) {
                RNSentryModule.f(ReadableMap.this, u1Var);
            }
        });
    }

    @ReactMethod
    public void captureEnvelope(String str, Promise promise) {
        try {
            String outboxPath = z.a().getOptions().getOutboxPath();
            if (outboxPath == null) {
                logger.severe("Error retrieving outboxPath. Envelope will not be sent. Is the Android SDK initialized?");
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(outboxPath, UUID.randomUUID().toString()));
                fileOutputStream.write(str.getBytes(Charset.forName("UTF-8")));
                fileOutputStream.close();
            }
        } catch (Throwable unused) {
            logger.severe("Error reading envelope");
        }
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public void clearBreadcrumbs() {
        c2.f(new v1() { // from class: pz.f
            @Override // io.sentry.v1
            public final void a(u1 u1Var) {
                RNSentryModule.c(u1Var);
            }
        });
    }

    @ReactMethod
    public void closeNativeSdk(Promise promise) {
        c2.e();
        disableNativeFramesTracking();
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public void crash() {
        throw new RuntimeException("TEST - Sentry Client Crash (only works in release mode)");
    }

    @ReactMethod
    public void disableNativeFramesTracking() {
        if (isFrameMetricsAggregatorAvailable()) {
            this.frameMetricsAggregator.e();
            this.frameMetricsAggregator = null;
        }
    }

    @ReactMethod
    public void enablePerformance() {
        boolean checkAndroidXAvailability = checkAndroidXAvailability();
        this.androidXAvailable = checkAndroidXAvailability;
        if (checkAndroidXAvailability) {
            this.frameMetricsAggregator = new FrameMetricsAggregator();
            Activity currentActivity = getCurrentActivity();
            FrameMetricsAggregator frameMetricsAggregator = this.frameMetricsAggregator;
            if (frameMetricsAggregator == null || currentActivity == null) {
                return;
            }
            try {
                frameMetricsAggregator.a(currentActivity);
                return;
            } catch (Throwable unused) {
                logger.warning("Error adding Activity to frameMetricsAggregator.");
                return;
            }
        }
        logger.warning("androidx.core' isn't available as a dependency.");
    }

    @ReactMethod
    public void fetchNativeAppStart(Promise promise) {
        y c11 = y.c();
        Date b11 = c11.b();
        Boolean d11 = c11.d();
        if (b11 == null) {
            logger.warning("App start won't be sent due to missing appStartTime.");
            promise.resolve(null);
        } else if (d11 == null) {
            logger.warning("App start won't be sent due to missing isColdStart.");
            promise.resolve(null);
        } else {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("appStartTime", b11.getTime());
            createMap.putBoolean("isColdStart", d11.booleanValue());
            createMap.putBoolean("didFetchAppStart", didFetchAppStart);
            promise.resolve(createMap);
        }
        didFetchAppStart = true;
    }

    @ReactMethod
    public void fetchNativeFrames(Promise promise) {
        int i11;
        int i12;
        SparseIntArray sparseIntArray;
        if (!isFrameMetricsAggregatorAvailable()) {
            promise.resolve(null);
            return;
        }
        try {
            SparseIntArray[] b11 = this.frameMetricsAggregator.b();
            int i13 = 0;
            if (b11 == null || (sparseIntArray = b11[0]) == null) {
                i11 = 0;
                i12 = 0;
            } else {
                int i14 = 0;
                i11 = 0;
                i12 = 0;
                while (i13 < sparseIntArray.size()) {
                    int keyAt = sparseIntArray.keyAt(i13);
                    int valueAt = sparseIntArray.valueAt(i13);
                    i14 += valueAt;
                    if (keyAt > FROZEN_FRAME_THRESHOLD) {
                        i12 += valueAt;
                    } else if (keyAt > 16) {
                        i11 += valueAt;
                    }
                    i13++;
                }
                i13 = i14;
            }
            if (i13 == 0 && i11 == 0 && i12 == 0) {
                promise.resolve(null);
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("totalFrames", i13);
            createMap.putInt("slowFrames", i11);
            createMap.putInt("frozenFrames", i12);
            promise.resolve(createMap);
        } catch (Throwable unused) {
            logger.warning("Error fetching native frames.");
            promise.resolve(null);
        }
    }

    @ReactMethod
    public void fetchNativeRelease(Promise promise) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("id", this.packageInfo.packageName);
        createMap.putString("version", this.packageInfo.versionName);
        createMap.putString("build", String.valueOf(this.packageInfo.versionCode));
        promise.resolve(createMap);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.TRUE;
        hashMap.put("nativeClientAvailable", bool);
        hashMap.put("nativeTransport", bool);
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getStringBytesLength(String str, Promise promise) {
        try {
            promise.resolve(Integer.valueOf(str.getBytes("UTF-8").length));
        } catch (UnsupportedEncodingException e11) {
            promise.reject(e11);
        }
    }

    @ReactMethod
    public void initNativeSdk(final ReadableMap readableMap, Promise promise) {
        s0.f(getReactApplicationContext(), new c2.a() { // from class: pz.g
            @Override // io.sentry.c2.a
            public final void a(g3 g3Var) {
                RNSentryModule.this.lambda$initNativeSdk$1(readableMap, (SentryAndroidOptions) g3Var);
            }
        });
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public void setContext(final String str, final ReadableMap readableMap) {
        if (str == null || readableMap == null) {
            return;
        }
        c2.f(new v1() { // from class: pz.c
            @Override // io.sentry.v1
            public final void a(u1 u1Var) {
                RNSentryModule.b(ReadableMap.this, str, u1Var);
            }
        });
    }

    @ReactMethod
    public void setExtra(final String str, final String str2) {
        c2.f(new v1() { // from class: pz.d
            @Override // io.sentry.v1
            public final void a(u1 u1Var) {
                RNSentryModule.d(str, str2, u1Var);
            }
        });
    }

    @ReactMethod
    public void setTag(final String str, final String str2) {
        c2.f(new v1() { // from class: pz.e
            @Override // io.sentry.v1
            public final void a(u1 u1Var) {
                RNSentryModule.h(str, str2, u1Var);
            }
        });
    }

    @ReactMethod
    public void setUser(final ReadableMap readableMap, final ReadableMap readableMap2) {
        c2.f(new v1() { // from class: pz.b
            @Override // io.sentry.v1
            public final void a(u1 u1Var) {
                RNSentryModule.e(ReadableMap.this, readableMap2, u1Var);
            }
        });
    }
}