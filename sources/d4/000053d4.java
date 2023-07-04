package com.stripe.android.payments.bankaccount.ui;

import android.content.Intent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import h00.a;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class CollectBankAccountActivity$starterArgs$2 extends u implements a<CollectBankAccountContract.Args> {
    final /* synthetic */ CollectBankAccountActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountActivity$starterArgs$2(CollectBankAccountActivity collectBankAccountActivity) {
        super(0);
        this.this$0 = collectBankAccountActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final CollectBankAccountContract.Args invoke() {
        CollectBankAccountContract.Args.Companion companion = CollectBankAccountContract.Args.Companion;
        Intent intent = this.this$0.getIntent();
        s.f(intent, "intent");
        return companion.fromIntent(intent);
    }
}