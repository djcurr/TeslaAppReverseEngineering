package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.a;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.core.authentication.WebIntentAuthenticator$beginWebAuth$2", f = "WebIntentAuthenticator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class WebIntentAuthenticator$beginWebAuth$2 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ String $authUrl;
    final /* synthetic */ String $clientSecret;
    final /* synthetic */ AuthActivityStarterHost $host;
    final /* synthetic */ int $requestCode;
    final /* synthetic */ String $returnUrl;
    final /* synthetic */ boolean $shouldCancelIntentOnUserNavigation;
    final /* synthetic */ boolean $shouldCancelSource;
    final /* synthetic */ String $stripeAccount;
    final /* synthetic */ StripeIntent $stripeIntent;
    int label;
    final /* synthetic */ WebIntentAuthenticator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebIntentAuthenticator$beginWebAuth$2(WebIntentAuthenticator webIntentAuthenticator, AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, int i11, String str, String str2, String str3, String str4, boolean z11, boolean z12, d<WebIntentAuthenticator$beginWebAuth$2> dVar) {
        super(2, dVar);
        this.this$0 = webIntentAuthenticator;
        this.$host = authActivityStarterHost;
        this.$stripeIntent = stripeIntent;
        this.$requestCode = i11;
        this.$clientSecret = str;
        this.$authUrl = str2;
        this.$returnUrl = str3;
        this.$stripeAccount = str4;
        this.$shouldCancelSource = z11;
        this.$shouldCancelIntentOnUserNavigation = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new WebIntentAuthenticator$beginWebAuth$2(this.this$0, this.$host, this.$stripeIntent, this.$requestCode, this.$clientSecret, this.$authUrl, this.$returnUrl, this.$stripeAccount, this.$shouldCancelSource, this.$shouldCancelIntentOnUserNavigation, dVar);
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, d<? super b0> dVar) {
        return invoke2(o0Var, (d<b0>) dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, d<b0> dVar) {
        return ((WebIntentAuthenticator$beginWebAuth$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        h00.l lVar;
        boolean z11;
        a aVar;
        boolean z12;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            lVar = this.this$0.paymentBrowserAuthStarterFactory;
            PaymentBrowserAuthStarter paymentBrowserAuthStarter = (PaymentBrowserAuthStarter) lVar.invoke(this.$host);
            String id2 = this.$stripeIntent.getId();
            if (id2 == null) {
                id2 = "";
            }
            String str = id2;
            int i11 = this.$requestCode;
            String str2 = this.$clientSecret;
            String str3 = this.$authUrl;
            String str4 = this.$returnUrl;
            z11 = this.this$0.enableLogging;
            String str5 = this.$stripeAccount;
            boolean z13 = this.$shouldCancelSource;
            boolean z14 = this.$shouldCancelIntentOnUserNavigation;
            aVar = this.this$0.publishableKeyProvider;
            String str6 = (String) aVar.invoke();
            z12 = this.this$0.isInstantApp;
            paymentBrowserAuthStarter.start(new PaymentBrowserAuthContract.Args(str, i11, str2, str3, str4, z11, null, str5, z13, z14, null, str6, z12, 1088, null));
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}