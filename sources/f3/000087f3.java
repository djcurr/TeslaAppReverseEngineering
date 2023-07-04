package mu;

import android.content.Context;
import com.tesla.TeslaV4.BuildConfig;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.s0;
import io.sentry.c2;
import io.sentry.f3;
import io.sentry.g3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.s;
import zu.q;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a */
    public static final c f39463a = new c();

    /* renamed from: b */
    private static final AtomicBoolean f39464b = new AtomicBoolean();

    /* renamed from: c */
    private static final String f39465c;

    static {
        f39465c = q.a() ? BuildConfig.SENTRY_ANDROID_ENDPOINT_CN : BuildConfig.SENTRY_ANDROID_ENDPOINT;
    }

    private c() {
    }

    public static /* synthetic */ void a(SentryAndroidOptions sentryAndroidOptions) {
        c(sentryAndroidOptions);
    }

    public static final void c(SentryAndroidOptions options) {
        s.g(options, "options");
        options.setDsn(f39465c);
        options.setDebug(false);
        options.setDiagnosticLevel(f3.INFO);
        options.setMaxBreadcrumbs(q.c() ? 50 : 1);
        options.setEnvironment(BuildConfig.APP_URL_SCHEME);
        options.setTracesSampleRate(Double.valueOf(1.0d));
        options.setSampleRate(Double.valueOf(1.0d));
        options.setEnableAutoActivityLifecycleTracing(false);
    }

    public final void b(Context context) {
        s.g(context, "context");
        if (f39464b.get()) {
            s0.e(context, a.f39459a, new c2.a() { // from class: mu.b
                @Override // io.sentry.c2.a
                public final void a(g3 g3Var) {
                    c.a((SentryAndroidOptions) g3Var);
                }
            });
        }
    }

    public final void d(boolean z11, Context context) {
        s.g(context, "context");
        AtomicBoolean atomicBoolean = f39464b;
        if (atomicBoolean.get() == z11) {
            return;
        }
        atomicBoolean.set(z11);
        if (atomicBoolean.get()) {
            b(context);
        } else {
            c2.e();
        }
    }
}