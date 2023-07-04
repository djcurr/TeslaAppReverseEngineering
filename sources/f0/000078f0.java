package io.sentry.android.core;

import io.sentry.g3;

/* loaded from: classes5.dex */
public final class SentryAndroidOptions extends g3 {
    private boolean attachScreenshot;
    private boolean anrEnabled = true;
    private long anrTimeoutIntervalMillis = 5000;
    private boolean anrReportInDebug = false;
    private boolean enableActivityLifecycleBreadcrumbs = true;
    private boolean enableAppLifecycleBreadcrumbs = true;
    private boolean enableSystemEventBreadcrumbs = true;
    private boolean enableAppComponentBreadcrumbs = true;
    private boolean enableUserInteractionBreadcrumbs = true;
    private boolean enableAutoActivityLifecycleTracing = true;
    private boolean enableActivityLifecycleTracingAutoFinish = true;
    private int profilingTracesIntervalMillis = 10;
    private boolean enableUserInteractionTracing = false;
    private g0 debugImagesLoader = m0.a();
    private boolean collectAdditionalContext = true;

    public SentryAndroidOptions() {
        setSentryClientName("sentry.java.android/6.1.4");
        setSdkVersion(createSdkVersion());
        setAttachServerName(false);
        setEnableScopeSync(true);
    }

    private io.sentry.protocol.m createSdkVersion() {
        io.sentry.protocol.m l11 = io.sentry.protocol.m.l(getSdkVersion(), "sentry.java.android", "6.1.4");
        l11.d("maven:io.sentry:sentry-android-core", "6.1.4");
        return l11;
    }

    public void enableAllAutoBreadcrumbs(boolean z11) {
        this.enableActivityLifecycleBreadcrumbs = z11;
        this.enableAppComponentBreadcrumbs = z11;
        this.enableSystemEventBreadcrumbs = z11;
        this.enableAppLifecycleBreadcrumbs = z11;
        this.enableUserInteractionBreadcrumbs = z11;
    }

    public long getAnrTimeoutIntervalMillis() {
        return this.anrTimeoutIntervalMillis;
    }

    public g0 getDebugImagesLoader() {
        return this.debugImagesLoader;
    }

    public int getProfilingTracesIntervalMillis() {
        return this.profilingTracesIntervalMillis;
    }

    public boolean isAnrEnabled() {
        return this.anrEnabled;
    }

    public boolean isAnrReportInDebug() {
        return this.anrReportInDebug;
    }

    public boolean isAttachScreenshot() {
        return this.attachScreenshot;
    }

    public boolean isCollectAdditionalContext() {
        return this.collectAdditionalContext;
    }

    public boolean isEnableActivityLifecycleBreadcrumbs() {
        return this.enableActivityLifecycleBreadcrumbs;
    }

    public boolean isEnableActivityLifecycleTracingAutoFinish() {
        return this.enableActivityLifecycleTracingAutoFinish;
    }

    public boolean isEnableAppComponentBreadcrumbs() {
        return this.enableAppComponentBreadcrumbs;
    }

    public boolean isEnableAppLifecycleBreadcrumbs() {
        return this.enableAppLifecycleBreadcrumbs;
    }

    public boolean isEnableAutoActivityLifecycleTracing() {
        return this.enableAutoActivityLifecycleTracing;
    }

    public boolean isEnableSystemEventBreadcrumbs() {
        return this.enableSystemEventBreadcrumbs;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public void setAnrEnabled(boolean z11) {
        this.anrEnabled = z11;
    }

    public void setAnrReportInDebug(boolean z11) {
        this.anrReportInDebug = z11;
    }

    public void setAnrTimeoutIntervalMillis(long j11) {
        this.anrTimeoutIntervalMillis = j11;
    }

    public void setAttachScreenshot(boolean z11) {
        this.attachScreenshot = z11;
    }

    public void setCollectAdditionalContext(boolean z11) {
        this.collectAdditionalContext = z11;
    }

    public void setDebugImagesLoader(g0 g0Var) {
        if (g0Var == null) {
            g0Var = m0.a();
        }
        this.debugImagesLoader = g0Var;
    }

    public void setEnableActivityLifecycleBreadcrumbs(boolean z11) {
        this.enableActivityLifecycleBreadcrumbs = z11;
    }

    public void setEnableActivityLifecycleTracingAutoFinish(boolean z11) {
        this.enableActivityLifecycleTracingAutoFinish = z11;
    }

    public void setEnableAppComponentBreadcrumbs(boolean z11) {
        this.enableAppComponentBreadcrumbs = z11;
    }

    public void setEnableAppLifecycleBreadcrumbs(boolean z11) {
        this.enableAppLifecycleBreadcrumbs = z11;
    }

    public void setEnableAutoActivityLifecycleTracing(boolean z11) {
        this.enableAutoActivityLifecycleTracing = z11;
    }

    public void setEnableSystemEventBreadcrumbs(boolean z11) {
        this.enableSystemEventBreadcrumbs = z11;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z11) {
        this.enableUserInteractionBreadcrumbs = z11;
    }

    public void setEnableUserInteractionTracing(boolean z11) {
        this.enableUserInteractionTracing = z11;
    }

    public void setProfilingTracesIntervalMillis(int i11) {
        this.profilingTracesIntervalMillis = i11;
    }
}