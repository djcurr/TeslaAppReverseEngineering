package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Keep
/* loaded from: classes2.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, mn.g> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final Executor executor;
    private com.google.firebase.remoteconfig.a firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private sm.b<com.google.firebase.remoteconfig.c> firebaseRemoteConfigProvider;
    private static final fn.a logger = fn.a.e();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    private RemoteConfigManager() {
        this(new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null);
    }

    public static /* synthetic */ void a(RemoteConfigManager remoteConfigManager, Boolean bool) {
        remoteConfigManager.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(bool);
    }

    public static /* synthetic */ void b(RemoteConfigManager remoteConfigManager, Exception exc) {
        remoteConfigManager.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private mn.g getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(str)) {
            mn.g gVar = this.allRcConfigMap.get(str);
            if (gVar.f() == 2) {
                logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", gVar.asString(), str);
                return gVar;
            }
            return null;
        }
        return null;
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j11) {
        return j11 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j11) {
        return j11 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.h());
    }

    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.g().addOnSuccessListener(this.executor, new OnSuccessListener() { // from class: com.google.firebase.perf.config.x
            {
                RemoteConfigManager.this = this;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RemoteConfigManager.a(RemoteConfigManager.this, (Boolean) obj);
            }
        }).addOnFailureListener(this.executor, new OnFailureListener() { // from class: com.google.firebase.perf.config.w
            {
                RemoteConfigManager.this = this;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                RemoteConfigManager.b(RemoteConfigManager.this, exc);
            }
        });
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                syncConfigValues(this.firebaseRemoteConfig.h());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public com.google.firebase.perf.util.e<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return com.google.firebase.perf.util.e.a();
        }
        mn.g remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return com.google.firebase.perf.util.e.e(Boolean.valueOf(remoteConfigValue.asBoolean()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return com.google.firebase.perf.util.e.a();
    }

    @VisibleForTesting
    protected long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public com.google.firebase.perf.util.e<Float> getFloat(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config float value is null.");
            return com.google.firebase.perf.util.e.a();
        }
        mn.g remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return com.google.firebase.perf.util.e.e(Float.valueOf(Double.valueOf(remoteConfigValue.asDouble()).floatValue()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return com.google.firebase.perf.util.e.a();
    }

    public com.google.firebase.perf.util.e<Long> getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return com.google.firebase.perf.util.e.a();
        }
        mn.g remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return com.google.firebase.perf.util.e.e(Long.valueOf(remoteConfigValue.a()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return com.google.firebase.perf.util.e.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getRemoteConfigValueOrDefault(String str, T t11) {
        Object obj;
        mn.g remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue == null) {
            return t11;
        }
        try {
            if (t11 instanceof Boolean) {
                obj = Boolean.valueOf(remoteConfigValue.asBoolean());
            } else if (t11 instanceof Float) {
                obj = Float.valueOf(Double.valueOf(remoteConfigValue.asDouble()).floatValue());
            } else {
                if (!(t11 instanceof Long) && !(t11 instanceof Integer)) {
                    if (t11 instanceof String) {
                        obj = remoteConfigValue.asString();
                    } else {
                        T t12 = (T) remoteConfigValue.asString();
                        try {
                            logger.b("No matching type found for the defaultValue: '%s', using String.", t11);
                            return t12;
                        } catch (IllegalArgumentException unused) {
                            t11 = t12;
                            if (remoteConfigValue.asString().isEmpty()) {
                                return t11;
                            }
                            logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                            return t11;
                        }
                    }
                }
                obj = Long.valueOf(remoteConfigValue.a());
            }
            return obj;
        } catch (IllegalArgumentException unused2) {
        }
    }

    public com.google.firebase.perf.util.e<String> getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return com.google.firebase.perf.util.e.a();
        }
        mn.g remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return com.google.firebase.perf.util.e.e(remoteConfigValue.asString());
        }
        return com.google.firebase.perf.util.e.a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        sm.b<com.google.firebase.remoteconfig.c> bVar;
        com.google.firebase.remoteconfig.c cVar;
        if (this.firebaseRemoteConfig == null && (bVar = this.firebaseRemoteConfigProvider) != null && (cVar = bVar.get()) != null) {
            this.firebaseRemoteConfig = cVar.c(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        com.google.firebase.remoteconfig.a aVar = this.firebaseRemoteConfig;
        return aVar == null || aVar.i().a() == 1;
    }

    public void setFirebaseRemoteConfigProvider(sm.b<com.google.firebase.remoteconfig.c> bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    @VisibleForTesting
    protected void syncConfigValues(Map<String, mn.g> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
    }

    RemoteConfigManager(Executor executor, com.google.firebase.remoteconfig.a aVar) {
        this(executor, aVar, new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS) + MIN_APP_START_CONFIG_FETCH_DELAY_MS);
    }

    @VisibleForTesting
    RemoteConfigManager(Executor executor, com.google.firebase.remoteconfig.a aVar, long j11) {
        ConcurrentHashMap<String, mn.g> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.executor = executor;
        this.firebaseRemoteConfig = aVar;
        if (aVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(aVar.h());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = TimeUnit.MICROSECONDS.toMillis(FirebasePerfProvider.getAppStartTime().d());
        this.appStartConfigFetchDelayInMs = j11;
    }
}