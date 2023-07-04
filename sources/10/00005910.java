package com.stripe.android.stripe3ds2.views;

import androidx.lifecycle.s0;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel;
import kotlin.jvm.internal.u;
import v20.j0;

/* loaded from: classes6.dex */
final class ChallengeActivity$viewModel$2 extends u implements h00.a<s0.b> {
    final /* synthetic */ ChallengeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$viewModel$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        ChallengeActionHandler challengeActionHandler;
        TransactionTimer transactionTimer;
        ErrorReporter errorReporter;
        j0 j0Var;
        challengeActionHandler = this.this$0.getChallengeActionHandler();
        transactionTimer = this.this$0.getTransactionTimer();
        errorReporter = this.this$0.getErrorReporter();
        j0Var = ChallengeActivity.WORK_CONTEXT;
        return new ChallengeActivityViewModel.Factory(challengeActionHandler, transactionTimer, errorReporter, j0Var);
    }
}