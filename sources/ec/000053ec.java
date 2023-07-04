package com.stripe.android.payments.core.authentication;

import androidx.activity.result.b;
import androidx.activity.result.c;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.Objects;
import kotlin.jvm.internal.s;
import vz.b0;
import zz.d;

/* loaded from: classes6.dex */
public final class OxxoAuthenticator implements PaymentAuthenticator<StripeIntent> {
    private final NoOpIntentAuthenticator noOpIntentAuthenticator;
    private final WebIntentAuthenticator webIntentAuthenticator;

    public OxxoAuthenticator(WebIntentAuthenticator webIntentAuthenticator, NoOpIntentAuthenticator noOpIntentAuthenticator) {
        s.g(webIntentAuthenticator, "webIntentAuthenticator");
        s.g(noOpIntentAuthenticator, "noOpIntentAuthenticator");
        this.webIntentAuthenticator = webIntentAuthenticator;
        this.noOpIntentAuthenticator = noOpIntentAuthenticator;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticator
    public /* bridge */ /* synthetic */ Object authenticate(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, d dVar) {
        return authenticate2(authActivityStarterHost, stripeIntent, options, (d<? super b0>) dVar);
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
    public Object authenticate2(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, d<? super b0> dVar) {
        Object d11;
        Object d12;
        StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
        Objects.requireNonNull(nextActionData, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.DisplayOxxoDetails");
        if (((StripeIntent.NextActionData.DisplayOxxoDetails) nextActionData).getHostedVoucherUrl() == null) {
            Object authenticate2 = this.noOpIntentAuthenticator.authenticate2(authActivityStarterHost, stripeIntent, options, (d<b0>) dVar);
            d12 = a00.d.d();
            if (authenticate2 == d12) {
                return authenticate2;
            }
        } else {
            Object authenticate22 = this.webIntentAuthenticator.authenticate2(authActivityStarterHost, stripeIntent, options, (d<b0>) dVar);
            d11 = a00.d.d();
            if (authenticate22 == d11) {
                return authenticate22;
            }
        }
        return b0.f54756a;
    }
}