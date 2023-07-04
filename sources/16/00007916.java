package io.sentry.android.core;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.stripe.android.model.PaymentMethod;
import io.sentry.f3;
import io.sentry.g3;
import java.io.Closeable;

/* loaded from: classes5.dex */
public final class o0 implements io.sentry.m0, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f32112a;

    /* renamed from: b  reason: collision with root package name */
    private SentryAndroidOptions f32113b;

    /* renamed from: c  reason: collision with root package name */
    a f32114c;

    /* renamed from: d  reason: collision with root package name */
    private TelephonyManager f32115d;

    /* loaded from: classes5.dex */
    static final class a extends PhoneStateListener {

        /* renamed from: a  reason: collision with root package name */
        private final io.sentry.c0 f32116a;

        a(io.sentry.c0 c0Var) {
            this.f32116a = c0Var;
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i11, String str) {
            if (i11 == 1) {
                io.sentry.c cVar = new io.sentry.c();
                cVar.p("system");
                cVar.l("device.event");
                cVar.m("action", "CALL_STATE_RINGING");
                cVar.o("Device ringing");
                cVar.n(f3.INFO);
                this.f32116a.e(cVar);
            }
        }
    }

    public o0(Context context) {
        this.f32112a = (Context) rz.j.a(context, "Context is required");
    }

    @Override // io.sentry.m0
    public void a(io.sentry.c0 c0Var, g3 g3Var) {
        rz.j.a(c0Var, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) rz.j.a(g3Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) g3Var : null, "SentryAndroidOptions is required");
        this.f32113b = sentryAndroidOptions;
        io.sentry.d0 logger = sentryAndroidOptions.getLogger();
        f3 f3Var = f3.DEBUG;
        logger.c(f3Var, "enableSystemEventBreadcrumbs enabled: %s", Boolean.valueOf(this.f32113b.isEnableSystemEventBreadcrumbs()));
        if (this.f32113b.isEnableSystemEventBreadcrumbs() && kz.e.a(this.f32112a, "android.permission.READ_PHONE_STATE")) {
            TelephonyManager telephonyManager = (TelephonyManager) this.f32112a.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
            this.f32115d = telephonyManager;
            if (telephonyManager != null) {
                try {
                    a aVar = new a(c0Var);
                    this.f32114c = aVar;
                    this.f32115d.listen(aVar, 32);
                    g3Var.getLogger().c(f3Var, "PhoneStateBreadcrumbsIntegration installed.", new Object[0]);
                    return;
                } catch (Throwable th2) {
                    this.f32113b.getLogger().a(f3.INFO, th2, "TelephonyManager is not available or ready to use.", new Object[0]);
                    return;
                }
            }
            this.f32113b.getLogger().c(f3.INFO, "TelephonyManager is not available", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a aVar;
        TelephonyManager telephonyManager = this.f32115d;
        if (telephonyManager == null || (aVar = this.f32114c) == null) {
            return;
        }
        telephonyManager.listen(aVar, 0);
        this.f32114c = null;
        SentryAndroidOptions sentryAndroidOptions = this.f32113b;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(f3.DEBUG, "PhoneStateBreadcrumbsIntegration removed.", new Object[0]);
        }
    }
}