package com.stripe.android;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class StripePaymentController$paymentRelayStarterFactory$1 extends u implements l<AuthActivityStarterHost, PaymentRelayStarter> {
    final /* synthetic */ StripePaymentController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripePaymentController$paymentRelayStarterFactory$1(StripePaymentController stripePaymentController) {
        super(1);
        this.this$0 = stripePaymentController;
    }

    @Override // h00.l
    public final PaymentRelayStarter invoke(AuthActivityStarterHost host) {
        androidx.activity.result.d dVar;
        s.g(host, "host");
        dVar = this.this$0.paymentRelayLauncher;
        PaymentRelayStarter.Modern modern = dVar == null ? null : new PaymentRelayStarter.Modern(dVar);
        return modern == null ? new PaymentRelayStarter.Legacy(host) : modern;
    }
}