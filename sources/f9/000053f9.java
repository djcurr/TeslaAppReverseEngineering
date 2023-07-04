package com.stripe.android.payments.core.authentication;

import androidx.activity.result.b;
import androidx.activity.result.c;
import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.a;
import h00.l;
import java.util.Map;
import kotlin.jvm.internal.s;
import v20.i;
import vz.b0;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public final class WebIntentAuthenticator implements PaymentAuthenticator<StripeIntent> {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final boolean enableLogging;
    private final boolean isInstantApp;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final l<AuthActivityStarterHost, PaymentBrowserAuthStarter> paymentBrowserAuthStarterFactory;
    private final a<String> publishableKeyProvider;
    private final Map<String, String> threeDs1IntentReturnUrlMap;
    private final g uiContext;

    public WebIntentAuthenticator(l<AuthActivityStarterHost, PaymentBrowserAuthStarter> paymentBrowserAuthStarterFactory, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z11, @UIContext g uiContext, Map<String, String> threeDs1IntentReturnUrlMap, a<String> publishableKeyProvider, boolean z12) {
        s.g(paymentBrowserAuthStarterFactory, "paymentBrowserAuthStarterFactory");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(uiContext, "uiContext");
        s.g(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        this.paymentBrowserAuthStarterFactory = paymentBrowserAuthStarterFactory;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.enableLogging = z11;
        this.uiContext = uiContext;
        this.threeDs1IntentReturnUrlMap = threeDs1IntentReturnUrlMap;
        this.publishableKeyProvider = publishableKeyProvider;
        this.isInstantApp = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object beginWebAuth(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, int i11, String str, String str2, String str3, String str4, boolean z11, boolean z12, d<b0> dVar) {
        Object d11;
        Object g11 = i.g(this.uiContext, new WebIntentAuthenticator$beginWebAuth$2(this, authActivityStarterHost, stripeIntent, i11, str, str2, str4, str3, z11, z12, null), dVar);
        d11 = a00.d.d();
        return g11 == d11 ? g11 : b0.f54756a;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticator
    public /* bridge */ /* synthetic */ Object authenticate(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, d dVar) {
        return authenticate2(authActivityStarterHost, stripeIntent, options, (d<b0>) dVar);
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onLauncherInvalidated() {
        PaymentAuthenticator.DefaultImpls.onLauncherInvalidated(this);
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onNewActivityResultCaller(c cVar, b<PaymentFlowResult.Unvalidated> bVar) {
        PaymentAuthenticator.DefaultImpls.onNewActivityResultCaller(this, cVar, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /* renamed from: authenticate  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object authenticate2(com.stripe.android.view.AuthActivityStarterHost r21, com.stripe.android.model.StripeIntent r22, com.stripe.android.core.networking.ApiRequest.Options r23, zz.d<vz.b0> r24) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.WebIntentAuthenticator.authenticate2(com.stripe.android.view.AuthActivityStarterHost, com.stripe.android.model.StripeIntent, com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }
}