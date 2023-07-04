package com.stripe.android.payments.core.authentication.threeds2;

import androidx.activity.result.d;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class Stripe3DS2Authenticator$stripe3ds2CompletionStarterFactory$1 extends u implements l<AuthActivityStarterHost, Stripe3ds2TransactionStarter> {
    final /* synthetic */ Stripe3DS2Authenticator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe3DS2Authenticator$stripe3ds2CompletionStarterFactory$1(Stripe3DS2Authenticator stripe3DS2Authenticator) {
        super(1);
        this.this$0 = stripe3DS2Authenticator;
    }

    @Override // h00.l
    public final Stripe3ds2TransactionStarter invoke(AuthActivityStarterHost host) {
        s.g(host, "host");
        d<Stripe3ds2TransactionContract.Args> stripe3ds2CompletionLauncher$payments_core_release = this.this$0.getStripe3ds2CompletionLauncher$payments_core_release();
        Stripe3ds2TransactionStarter.Modern modern = stripe3ds2CompletionLauncher$payments_core_release == null ? null : new Stripe3ds2TransactionStarter.Modern(stripe3ds2CompletionLauncher$payments_core_release);
        return modern == null ? new Stripe3ds2TransactionStarter.Legacy(host) : modern;
    }
}