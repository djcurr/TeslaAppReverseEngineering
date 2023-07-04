package com.stripe.android.payments.bankaccount.di;

import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import h00.a;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class CollectBankAccountModule$providePublishableKey$1 extends u implements a<String> {
    final /* synthetic */ CollectBankAccountContract.Args $args;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountModule$providePublishableKey$1(CollectBankAccountContract.Args args) {
        super(0);
        this.$args = args;
    }

    @Override // h00.a
    public final String invoke() {
        return this.$args.getPublishableKey();
    }
}