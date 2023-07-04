package io.sentry.android.core;

import android.content.Context;
import android.os.Bundle;
import io.sentry.f3;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes5.dex */
final class k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, SentryAndroidOptions sentryAndroidOptions) {
        rz.j.a(context, "The application context is required.");
        rz.j.a(sentryAndroidOptions, "The options object is required.");
        try {
            Bundle b11 = b(context);
            io.sentry.d0 logger = sentryAndroidOptions.getLogger();
            if (b11 != null) {
                sentryAndroidOptions.setDebug(d(b11, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String name = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String h11 = h(b11, logger, "io.sentry.debug.level", name.toLowerCase(locale));
                    if (h11 != null) {
                        sentryAndroidOptions.setDiagnosticLevel(f3.valueOf(h11.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(d(b11, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(d(b11, logger, "io.sentry.auto-session-tracking.enable", d(b11, logger, "io.sentry.session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking())));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    Double e11 = e(b11, logger, "io.sentry.sample-rate");
                    if (e11.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setSampleRate(e11);
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(d(b11, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(g(b11, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                String h12 = h(b11, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                if (h12 == null) {
                    sentryAndroidOptions.getLogger().c(f3.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                } else if (h12.isEmpty()) {
                    sentryAndroidOptions.getLogger().c(f3.DEBUG, "DSN is empty, disabling sentry-android", new Object[0]);
                }
                sentryAndroidOptions.setDsn(h12);
                sentryAndroidOptions.setEnableNdk(d(b11, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(d(b11, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                sentryAndroidOptions.setRelease(h(b11, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setEnvironment(h(b11, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(g(b11, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(d(b11, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(d(b11, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(d(b11, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(d(b11, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(d(b11, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(d(b11, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(d(b11, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(d(b11, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setSendClientReports(d(b11, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                sentryAndroidOptions.setCollectAdditionalContext(d(b11, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    Double e12 = e(b11, logger, "io.sentry.traces.sample-rate");
                    if (e12.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(e12);
                    }
                }
                sentryAndroidOptions.setTraceSampling(d(b11, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(d(b11, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(d(b11, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                sentryAndroidOptions.setProfilingEnabled(d(b11, logger, "io.sentry.traces.profiling.enable", sentryAndroidOptions.isProfilingEnabled()));
                sentryAndroidOptions.setEnableUserInteractionTracing(d(b11, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                long g11 = g(b11, logger, "io.sentry.traces.idle-timeout", -1L);
                if (g11 != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(g11));
                }
                List<String> f11 = f(b11, logger, "io.sentry.traces.tracing-origins");
                if (f11 != null) {
                    for (String str : f11) {
                        sentryAndroidOptions.addTracingOrigin(str);
                    }
                }
                sentryAndroidOptions.setProguardUuid(h(b11, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                io.sentry.protocol.m sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new io.sentry.protocol.m("", "");
                }
                sdkVersion.i(i(b11, logger, "io.sentry.sdk.name", sdkVersion.f()));
                sdkVersion.k(i(b11, logger, "io.sentry.sdk.version", sdkVersion.h()));
                sentryAndroidOptions.setSdkVersion(sdkVersion);
            }
            sentryAndroidOptions.getLogger().c(f3.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().b(f3.ERROR, "Failed to read configuration from android manifest metadata.", th2);
        }
    }

    private static Bundle b(Context context) {
        return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Context context, io.sentry.d0 d0Var) {
        rz.j.a(context, "The application context is required.");
        try {
            Bundle b11 = b(context);
            r0 = b11 != null ? d(b11, d0Var, "io.sentry.auto-init", true) : true;
            d0Var.c(f3.INFO, "Retrieving auto-init from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th2) {
            d0Var.b(f3.ERROR, "Failed to read auto-init from android manifest metadata.", th2);
        }
        return r0;
    }

    private static boolean d(Bundle bundle, io.sentry.d0 d0Var, String str, boolean z11) {
        boolean z12 = bundle.getBoolean(str, z11);
        d0Var.c(f3.DEBUG, "%s read: %s", str, Boolean.valueOf(z12));
        return z12;
    }

    private static Double e(Bundle bundle, io.sentry.d0 d0Var, String str) {
        Double valueOf = Double.valueOf(Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue());
        d0Var.c(f3.DEBUG, "%s read: %s", str, valueOf);
        return valueOf;
    }

    private static List<String> f(Bundle bundle, io.sentry.d0 d0Var, String str) {
        String string = bundle.getString(str);
        d0Var.c(f3.DEBUG, "%s read: %s", str, string);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    private static long g(Bundle bundle, io.sentry.d0 d0Var, String str, long j11) {
        long j12 = bundle.getInt(str, (int) j11);
        d0Var.c(f3.DEBUG, "%s read: %s", str, Long.valueOf(j12));
        return j12;
    }

    private static String h(Bundle bundle, io.sentry.d0 d0Var, String str, String str2) {
        String string = bundle.getString(str, str2);
        d0Var.c(f3.DEBUG, "%s read: %s", str, string);
        return string;
    }

    private static String i(Bundle bundle, io.sentry.d0 d0Var, String str, String str2) {
        String string = bundle.getString(str, str2);
        d0Var.c(f3.DEBUG, "%s read: %s", str, string);
        return string;
    }
}