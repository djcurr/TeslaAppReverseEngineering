package com.stripe.android.payments.core.authentication;

import androidx.activity.result.b;
import androidx.activity.result.c;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.l;
import kotlin.jvm.internal.s;
import vz.b0;
import zz.d;

/* loaded from: classes6.dex */
public final class NoOpIntentAuthenticator implements PaymentAuthenticator<StripeIntent> {
    private final l<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory;

    public NoOpIntentAuthenticator(l<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory) {
        s.g(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        this.paymentRelayStarterFactory = paymentRelayStarterFactory;
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

    /* renamed from: authenticate  reason: avoid collision after fix types in other method */
    public Object authenticate2(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, d<b0> dVar) {
        this.paymentRelayStarterFactory.invoke(authActivityStarterHost).start(PaymentRelayStarter.Args.Companion.create(stripeIntent, options.getStripeAccount()));
        return b0.f54756a;
    }
}