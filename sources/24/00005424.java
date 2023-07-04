package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class Stripe3ds2TransactionViewModelFactory$fallbackInitialize$1 extends u implements h00.a<String> {
    final /* synthetic */ Stripe3ds2TransactionViewModelFactory.FallbackInitializeParam $arg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2TransactionViewModelFactory$fallbackInitialize$1(Stripe3ds2TransactionViewModelFactory.FallbackInitializeParam fallbackInitializeParam) {
        super(0);
        this.$arg = fallbackInitializeParam;
    }

    @Override // h00.a
    public final String invoke() {
        return this.$arg.getPublishableKey();
    }
}