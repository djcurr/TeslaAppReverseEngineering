package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.a2;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.f3;
import io.sentry.x1;
import io.sentry.z1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public final class n {
    public static /* synthetic */ String a(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.getOutboxPath();
    }

    public static /* synthetic */ String b(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.getCacheDirPath();
    }

    private static String c(Context context, io.sentry.d0 d0Var) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getAssets().open("sentry-debug-meta.properties"));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                String property = properties.getProperty("io.sentry.ProguardUuids");
                d0Var.c(f3.DEBUG, "Proguard UUID found: %s", property);
                bufferedInputStream.close();
                return property;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            d0Var.c(f3.INFO, "sentry-debug-meta.properties file was not found.", new Object[0]);
            return null;
        } catch (IOException e11) {
            d0Var.b(f3.ERROR, "Error getting Proguard UUIDs.", e11);
            return null;
        } catch (RuntimeException e12) {
            d0Var.b(f3.ERROR, "sentry-debug-meta.properties file is malformed.", e12);
            return null;
        }
    }

    private static String d(PackageInfo packageInfo, String str) {
        return packageInfo.packageName + "@" + packageInfo.versionName + Marker.ANY_NON_NULL_MARKER + str;
    }

    static void e(SentryAndroidOptions sentryAndroidOptions, Context context, io.sentry.d0 d0Var, a0 a0Var, i0 i0Var, boolean z11, boolean z12) {
        rz.j.a(context, "The context is required.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        rz.j.a(sentryAndroidOptions, "The options object is required.");
        rz.j.a(d0Var, "The ILogger object is required.");
        sentryAndroidOptions.setLogger(d0Var);
        k0.a(context, sentryAndroidOptions);
        h(context, sentryAndroidOptions);
        c cVar = new c(i0Var, sentryAndroidOptions.getLogger());
        i(context, sentryAndroidOptions, a0Var, i0Var, cVar, z11, z12);
        m(sentryAndroidOptions, context);
        sentryAndroidOptions.addEventProcessor(new d0(context, a0Var, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new n0(sentryAndroidOptions, cVar));
        sentryAndroidOptions.setTransportGate(new r(context, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.setTransactionProfiler(new q(context, sentryAndroidOptions, a0Var));
    }

    static void f(SentryAndroidOptions sentryAndroidOptions, Context context, io.sentry.d0 d0Var, a0 a0Var, boolean z11, boolean z12) {
        e(sentryAndroidOptions, context, d0Var, a0Var, new i0(), z11, z12);
    }

    public static void g(SentryAndroidOptions sentryAndroidOptions, Context context, io.sentry.d0 d0Var, boolean z11, boolean z12) {
        f(sentryAndroidOptions, context, d0Var, new a0(d0Var), z11, z12);
    }

    private static void h(Context context, SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setCacheDirPath(new File(context.getCacheDir(), "sentry").getAbsolutePath());
    }

    private static void i(Context context, final SentryAndroidOptions sentryAndroidOptions, a0 a0Var, i0 i0Var, c cVar, boolean z11, boolean z12) {
        sentryAndroidOptions.addIntegration(new x1(new z1(new x1.b() { // from class: io.sentry.android.core.m
            @Override // io.sentry.x1.b
            public final String a() {
                return n.b(SentryAndroidOptions.this);
            }
        })));
        sentryAndroidOptions.addIntegration(new l0(j(a0Var) ? i0Var.c("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger()) : null));
        sentryAndroidOptions.addIntegration(f0.g());
        sentryAndroidOptions.addIntegration(new x1(new a2(new x1.b() { // from class: io.sentry.android.core.l
            @Override // io.sentry.x1.b
            public final String a() {
                return n.a(SentryAndroidOptions.this);
            }
        })));
        sentryAndroidOptions.addIntegration(new t(context));
        sentryAndroidOptions.addIntegration(new x());
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new j(application, a0Var, cVar));
            sentryAndroidOptions.addIntegration(new v0(application, i0Var));
            if (z11) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
            sentryAndroidOptions.addEventProcessor(new p0(application, sentryAndroidOptions, a0Var));
        } else {
            sentryAndroidOptions.getLogger().c(f3.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z12) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new u(context));
        sentryAndroidOptions.addIntegration(new t0(context));
        sentryAndroidOptions.addIntegration(new u0(context));
        sentryAndroidOptions.addIntegration(new o0(context));
    }

    private static boolean j(a0 a0Var) {
        return a0Var.d() >= 16;
    }

    private static void m(SentryAndroidOptions sentryAndroidOptions, Context context) {
        PackageInfo b11 = b0.b(context, sentryAndroidOptions.getLogger());
        if (b11 != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(d(b11, b0.c(b11)));
            }
            String str = b11.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(h0.a(context));
            } catch (RuntimeException e11) {
                sentryAndroidOptions.getLogger().b(f3.ERROR, "Could not generate distinct Id.", e11);
            }
        }
        if (sentryAndroidOptions.getProguardUuid() == null) {
            sentryAndroidOptions.setProguardUuid(c(context, sentryAndroidOptions.getLogger()));
        }
    }
}