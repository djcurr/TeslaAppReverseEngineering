package com.stripe.android.payments.bankaccount.ui;

import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import h00.a;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class CollectBankAccountActivity$viewModelFactory$2 extends u implements a<CollectBankAccountContract.Args> {
    final /* synthetic */ CollectBankAccountActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountActivity$viewModelFactory$2(CollectBankAccountActivity collectBankAccountActivity) {
        super(0);
        this.this$0 = collectBankAccountActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final CollectBankAccountContract.Args invoke() {
        CollectBankAccountContract.Args starterArgs;
        starterArgs = this.this$0.getStarterArgs();
        if (starterArgs != null) {
            return starterArgs;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}