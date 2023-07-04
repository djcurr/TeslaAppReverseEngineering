package com.stripe.android.financialconnections.di;

import android.app.Application;
import android.content.pm.PackageManager;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.repository.FinancialConnectionsApiRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import java.util.Locale;
import javax.inject.Provider;
import kotlin.jvm.internal.s;
import r3.g;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetModule {
    public static final FinancialConnectionsSheetModule INSTANCE = new FinancialConnectionsSheetModule();

    private FinancialConnectionsSheetModule() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.stripe.android.financialconnections.di.FinancialConnectionsSheetModule.provideAnalyticsRequestFactory$lambda-1(java.lang.String):java.lang.String
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
        	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
        	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
        	... 1 more
        */
    public static /* synthetic */ java.lang.String a(java.lang.String r0) {
        /*
            java.lang.String r0 = m129provideAnalyticsRequestFactory$lambda1(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.financialconnections.di.FinancialConnectionsSheetModule.a(java.lang.String):java.lang.String");
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
        	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
        	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    /* renamed from: provideAnalyticsRequestFactory$lambda-1 */
    private static final java.lang.String m129provideAnalyticsRequestFactory$lambda1(java.lang.String r1) {
        /*
            java.lang.String r0 = "$publishableKey"
            kotlin.jvm.internal.s.g(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.financialconnections.di.FinancialConnectionsSheetModule.m129provideAnalyticsRequestFactory$lambda1(java.lang.String):java.lang.String");
    }

    public final AnalyticsRequestFactory provideAnalyticsRequestFactory$financial_connections_release(Application application, final String publishableKey) {
        s.g(application, "application");
        s.g(publishableKey, "publishableKey");
        PackageManager packageManager = application.getPackageManager();
        String packageName = application.getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        return new AnalyticsRequestFactory(packageManager, application.getPackageManager().getPackageInfo(application.getPackageName(), 0), packageName, new Provider() { // from class: com.stripe.android.financialconnections.di.a
            @Override // javax.inject.Provider
            public final Object get() {
                return FinancialConnectionsSheetModule.a(publishableKey);
            }
        }, null, 16, null);
    }

    public final FinancialConnectionsRepository provideConnectionsRepository(FinancialConnectionsApiRepository repository) {
        s.g(repository, "repository");
        return repository;
    }

    public final FinancialConnectionsEventReporter provideEventReporter(DefaultFinancialConnectionsEventReporter defaultFinancialConnectionsEventReporter) {
        s.g(defaultFinancialConnectionsEventReporter, "defaultFinancialConnectionsEventReporter");
        return defaultFinancialConnectionsEventReporter;
    }

    public final Locale provideLocale() {
        g d11 = g.d();
        if (d11.e()) {
            d11 = null;
        }
        if (d11 == null) {
            return null;
        }
        return d11.c(0);
    }

    public final StripeNetworkClient provideStripeNetworkClient(@IOContext zz.g context, Logger logger) {
        s.g(context, "context");
        s.g(logger, "logger");
        return new DefaultStripeNetworkClient(context, null, null, 0, logger, 14, null);
    }

    public final AnalyticsRequestExecutor providesAnalyticsRequestExecutor$financial_connections_release(DefaultAnalyticsRequestExecutor executor) {
        s.g(executor, "executor");
        return executor;
    }

    public final ApiRequest.Factory providesApiRequestFactory() {
        return new ApiRequest.Factory(null, null, null, 7, null);
    }
}