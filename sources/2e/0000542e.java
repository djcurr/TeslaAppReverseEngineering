package com.stripe.android.payments.core.injection;

import androidx.activity.result.d;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import sw.a;

/* loaded from: classes6.dex */
final class AuthenticationModule$Companion$providePaymentRelayStarterFactory$1 extends u implements l<AuthActivityStarterHost, PaymentRelayStarter> {
    final /* synthetic */ a<DefaultPaymentAuthenticatorRegistry> $lazyRegistry;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationModule$Companion$providePaymentRelayStarterFactory$1(a<DefaultPaymentAuthenticatorRegistry> aVar) {
        super(1);
        this.$lazyRegistry = aVar;
    }

    @Override // h00.l
    public final PaymentRelayStarter invoke(AuthActivityStarterHost host) {
        s.g(host, "host");
        d<PaymentRelayStarter.Args> paymentRelayLauncher$payments_core_release = this.$lazyRegistry.get().getPaymentRelayLauncher$payments_core_release();
        PaymentRelayStarter.Modern modern = paymentRelayLauncher$payments_core_release == null ? null : new PaymentRelayStarter.Modern(paymentRelayLauncher$payments_core_release);
        return modern == null ? new PaymentRelayStarter.Legacy(host) : modern;
    }
}