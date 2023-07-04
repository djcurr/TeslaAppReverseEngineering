package com.stripe.android.payments.bankaccount.ui;

import androidx.lifecycle.s0;
import h00.a;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class CollectBankAccountActivity$viewModel$2 extends u implements a<s0.b> {
    final /* synthetic */ CollectBankAccountActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountActivity$viewModel$2(CollectBankAccountActivity collectBankAccountActivity) {
        super(0);
        this.this$0 = collectBankAccountActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        return this.this$0.getViewModelFactory$payments_core_release();
    }
}