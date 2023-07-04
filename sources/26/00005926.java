package com.stripe.android.stripe3ds2.views;

import androidx.lifecycle.s0;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel;
import kotlin.jvm.internal.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ChallengeFragment$viewModel$2 extends u implements h00.a<s0.b> {
    final /* synthetic */ ChallengeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFragment$viewModel$2(ChallengeFragment challengeFragment) {
        super(0);
        this.this$0 = challengeFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        ChallengeActionHandler challengeActionHandler;
        TransactionTimer transactionTimer;
        ErrorReporter errorReporter;
        zz.g gVar;
        challengeActionHandler = this.this$0.challengeActionHandler;
        transactionTimer = this.this$0.transactionTimer;
        errorReporter = this.this$0.errorReporter;
        gVar = this.this$0.workContext;
        return new ChallengeActivityViewModel.Factory(challengeActionHandler, transactionTimer, errorReporter, gVar);
    }
}