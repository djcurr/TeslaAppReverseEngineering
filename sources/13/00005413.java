package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class Stripe3ds2TransactionActivity$viewModelFactory$2 extends u implements h00.a<Stripe3ds2TransactionContract.Args> {
    final /* synthetic */ Stripe3ds2TransactionActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2TransactionActivity$viewModelFactory$2(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity) {
        super(0);
        this.this$0 = stripe3ds2TransactionActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final Stripe3ds2TransactionContract.Args invoke() {
        return this.this$0.getArgs();
    }
}