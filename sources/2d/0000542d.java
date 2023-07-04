package com.stripe.android.payments.core.injection;

import androidx.activity.result.d;
import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import sw.a;

/* loaded from: classes6.dex */
final class AuthenticationModule$Companion$providePaymentBrowserAuthStarterFactory$1 extends u implements l<AuthActivityStarterHost, PaymentBrowserAuthStarter> {
    final /* synthetic */ DefaultReturnUrl $defaultReturnUrl;
    final /* synthetic */ a<DefaultPaymentAuthenticatorRegistry> $lazyRegistry;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationModule$Companion$providePaymentBrowserAuthStarterFactory$1(a<DefaultPaymentAuthenticatorRegistry> aVar, DefaultReturnUrl defaultReturnUrl) {
        super(1);
        this.$lazyRegistry = aVar;
        this.$defaultReturnUrl = defaultReturnUrl;
    }

    @Override // h00.l
    public final PaymentBrowserAuthStarter invoke(AuthActivityStarterHost host) {
        s.g(host, "host");
        d<PaymentBrowserAuthContract.Args> paymentBrowserAuthLauncher$payments_core_release = this.$lazyRegistry.get().getPaymentBrowserAuthLauncher$payments_core_release();
        PaymentBrowserAuthStarter.Modern modern = paymentBrowserAuthLauncher$payments_core_release == null ? null : new PaymentBrowserAuthStarter.Modern(paymentBrowserAuthLauncher$payments_core_release);
        return modern == null ? new PaymentBrowserAuthStarter.Legacy(host, this.$defaultReturnUrl) : modern;
    }
}