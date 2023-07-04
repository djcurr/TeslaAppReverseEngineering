package com.stripe.android.payments.core.authentication;

import androidx.activity.result.b;
import androidx.activity.result.c;
import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Source;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.a;
import h00.l;
import kotlin.jvm.internal.s;
import v20.i;
import vz.b0;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public final class SourceAuthenticator implements PaymentAuthenticator<Source> {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final boolean enableLogging;
    private final boolean isInstantApp;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final l<AuthActivityStarterHost, PaymentBrowserAuthStarter> paymentBrowserAuthStarterFactory;
    private final l<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory;
    private final a<String> publishableKeyProvider;
    private final g uiContext;

    public SourceAuthenticator(l<AuthActivityStarterHost, PaymentBrowserAuthStarter> paymentBrowserAuthStarterFactory, l<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z11, @UIContext g uiContext, a<String> publishableKeyProvider, boolean z12) {
        s.g(paymentBrowserAuthStarterFactory, "paymentBrowserAuthStarterFactory");
        s.g(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(uiContext, "uiContext");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        this.paymentBrowserAuthStarterFactory = paymentBrowserAuthStarterFactory;
        this.paymentRelayStarterFactory = paymentRelayStarterFactory;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.enableLogging = z11;
        this.uiContext = uiContext;
        this.publishableKeyProvider = publishableKeyProvider;
        this.isInstantApp = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object bypassAuth(AuthActivityStarterHost authActivityStarterHost, Source source, String str, d<b0> dVar) {
        Object d11;
        Object g11 = i.g(this.uiContext, new SourceAuthenticator$bypassAuth$2(this, authActivityStarterHost, source, str, null), dVar);
        d11 = a00.d.d();
        return g11 == d11 ? g11 : b0.f54756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object startSourceAuth(PaymentBrowserAuthStarter paymentBrowserAuthStarter, Source source, ApiRequest.Options options, d<b0> dVar) {
        Object d11;
        Object g11 = i.g(this.uiContext, new SourceAuthenticator$startSourceAuth$2(this, paymentBrowserAuthStarter, source, options, null), dVar);
        d11 = a00.d.d();
        return g11 == d11 ? g11 : b0.f54756a;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticator
    public /* bridge */ /* synthetic */ Object authenticate(AuthActivityStarterHost authActivityStarterHost, Source source, ApiRequest.Options options, d dVar) {
        return authenticate2(authActivityStarterHost, source, options, (d<b0>) dVar);
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onLauncherInvalidated() {
        PaymentAuthenticator.DefaultImpls.onLauncherInvalidated(this);
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onNewActivityResultCaller(c cVar, b<PaymentFlowResult.Unvalidated> bVar) {
        PaymentAuthenticator.DefaultImpls.onNewActivityResultCaller(this, cVar, bVar);
    }

    /* renamed from: authenticate  reason: avoid collision after fix types in other method */
    public Object authenticate2(AuthActivityStarterHost authActivityStarterHost, Source source, ApiRequest.Options options, d<b0> dVar) {
        Object d11;
        Object d12;
        if (source.getFlow() == Source.Flow.Redirect) {
            Object startSourceAuth = startSourceAuth(this.paymentBrowserAuthStarterFactory.invoke(authActivityStarterHost), source, options, dVar);
            d12 = a00.d.d();
            return startSourceAuth == d12 ? startSourceAuth : b0.f54756a;
        }
        Object bypassAuth = bypassAuth(authActivityStarterHost, source, options.getStripeAccount(), dVar);
        d11 = a00.d.d();
        return bypassAuth == d11 ? bypassAuth : b0.f54756a;
    }
}