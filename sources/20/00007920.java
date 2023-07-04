package io.sentry.android.core;

import android.content.Context;
import android.os.SystemClock;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.c2;
import io.sentry.f3;
import io.sentry.g3;
import io.sentry.l1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Date f32144a = io.sentry.g.b();

    /* renamed from: b  reason: collision with root package name */
    private static final long f32145b = SystemClock.uptimeMillis();

    private static void c(g3 g3Var, boolean z11, boolean z12) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (io.sentry.m0 m0Var : g3Var.getIntegrations()) {
            if (z11 && (m0Var instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(m0Var);
            }
            if (z12 && (m0Var instanceof SentryTimberIntegration)) {
                arrayList.add(m0Var);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i11 = 0; i11 < arrayList2.size() - 1; i11++) {
                g3Var.getIntegrations().remove((io.sentry.m0) arrayList2.get(i11));
            }
        }
        if (arrayList.size() > 1) {
            for (int i12 = 0; i12 < arrayList.size() - 1; i12++) {
                g3Var.getIntegrations().remove((io.sentry.m0) arrayList.get(i12));
            }
        }
    }

    public static void d(Context context, io.sentry.d0 d0Var) {
        e(context, d0Var, new c2.a() { // from class: io.sentry.android.core.r0
            @Override // io.sentry.c2.a
            public final void a(g3 g3Var) {
                s0.g((SentryAndroidOptions) g3Var);
            }
        });
    }

    public static synchronized void e(final Context context, final io.sentry.d0 d0Var, final c2.a<SentryAndroidOptions> aVar) {
        synchronized (s0.class) {
            y.c().g(f32145b, f32144a);
            try {
                try {
                    c2.j(l1.a(SentryAndroidOptions.class), new c2.a() { // from class: io.sentry.android.core.q0
                        @Override // io.sentry.c2.a
                        public final void a(g3 g3Var) {
                            s0.h(context, d0Var, aVar, (SentryAndroidOptions) g3Var);
                        }
                    }, true);
                } catch (IllegalAccessException e11) {
                    d0Var.b(f3.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
                } catch (NoSuchMethodException e12) {
                    d0Var.b(f3.FATAL, "Fatal error during SentryAndroid.init(...)", e12);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e12);
                }
            } catch (InstantiationException e13) {
                d0Var.b(f3.FATAL, "Fatal error during SentryAndroid.init(...)", e13);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e13);
            } catch (InvocationTargetException e14) {
                d0Var.b(f3.FATAL, "Fatal error during SentryAndroid.init(...)", e14);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e14);
            }
        }
    }

    public static void f(Context context, c2.a<SentryAndroidOptions> aVar) {
        e(context, new k(), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(SentryAndroidOptions sentryAndroidOptions) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Context context, io.sentry.d0 d0Var, c2.a aVar, SentryAndroidOptions sentryAndroidOptions) {
        i0 i0Var = new i0();
        boolean b11 = i0Var.b("io.sentry.android.fragment.FragmentLifecycleIntegration", sentryAndroidOptions);
        boolean b12 = i0Var.b("io.sentry.android.timber.SentryTimberIntegration", sentryAndroidOptions);
        n.g(sentryAndroidOptions, context, d0Var, b11, b12);
        aVar.a(sentryAndroidOptions);
        c(sentryAndroidOptions, b11, b12);
    }
}