package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.StripePaymentController;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Source;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import h00.a;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.core.authentication.SourceAuthenticator$startSourceAuth$2", f = "SourceAuthenticator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SourceAuthenticator$startSourceAuth$2 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ PaymentBrowserAuthStarter $paymentBrowserAuthStarter;
    final /* synthetic */ ApiRequest.Options $requestOptions;
    final /* synthetic */ Source $source;
    int label;
    final /* synthetic */ SourceAuthenticator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceAuthenticator$startSourceAuth$2(SourceAuthenticator sourceAuthenticator, PaymentBrowserAuthStarter paymentBrowserAuthStarter, Source source, ApiRequest.Options options, d<SourceAuthenticator$startSourceAuth$2> dVar) {
        super(2, dVar);
        this.this$0 = sourceAuthenticator;
        this.$paymentBrowserAuthStarter = paymentBrowserAuthStarter;
        this.$source = source;
        this.$requestOptions = options;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new SourceAuthenticator$startSourceAuth$2(this.this$0, this.$paymentBrowserAuthStarter, this.$source, this.$requestOptions, dVar);
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, d<? super b0> dVar) {
        return invoke2(o0Var, (d<b0>) dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, d<b0> dVar) {
        return ((SourceAuthenticator$startSourceAuth$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AnalyticsRequestExecutor analyticsRequestExecutor;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
        boolean z11;
        a aVar;
        boolean z12;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            analyticsRequestExecutor = this.this$0.analyticsRequestExecutor;
            paymentAnalyticsRequestFactory = this.this$0.paymentAnalyticsRequestFactory;
            analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthSourceRedirect, null, null, null, null, 30, null));
            PaymentBrowserAuthStarter paymentBrowserAuthStarter = this.$paymentBrowserAuthStarter;
            String id2 = this.$source.getId();
            String str = id2 == null ? "" : id2;
            String clientSecret = this.$source.getClientSecret();
            String str2 = clientSecret == null ? "" : clientSecret;
            Source.Redirect redirect = this.$source.getRedirect();
            String url = redirect == null ? null : redirect.getUrl();
            String str3 = url == null ? "" : url;
            Source.Redirect redirect2 = this.$source.getRedirect();
            String returnUrl = redirect2 != null ? redirect2.getReturnUrl() : null;
            z11 = this.this$0.enableLogging;
            String stripeAccount = this.$requestOptions.getStripeAccount();
            aVar = this.this$0.publishableKeyProvider;
            String str4 = (String) aVar.invoke();
            z12 = this.this$0.isInstantApp;
            paymentBrowserAuthStarter.start(new PaymentBrowserAuthContract.Args(str, StripePaymentController.SOURCE_REQUEST_CODE, str2, str3, returnUrl, z11, null, stripeAccount, false, false, null, str4, z12, 1856, null));
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}