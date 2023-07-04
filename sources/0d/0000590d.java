package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.transaction.DefaultTransactionTimer;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import kotlin.jvm.internal.u;
import v20.j0;

/* loaded from: classes6.dex */
final class ChallengeActivity$transactionTimer$2 extends u implements h00.a<DefaultTransactionTimer> {
    final /* synthetic */ ChallengeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$transactionTimer$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final DefaultTransactionTimer invoke() {
        ChallengeViewArgs viewArgs;
        ErrorRequestExecutor errorRequestExecutor;
        ChallengeViewArgs viewArgs2;
        j0 j0Var;
        viewArgs = this.this$0.getViewArgs();
        int timeoutMins$3ds2sdk_release = viewArgs.getTimeoutMins$3ds2sdk_release();
        errorRequestExecutor = this.this$0.getErrorRequestExecutor();
        viewArgs2 = this.this$0.getViewArgs();
        ChallengeRequestData creqData$3ds2sdk_release = viewArgs2.getCreqData$3ds2sdk_release();
        j0Var = ChallengeActivity.WORK_CONTEXT;
        return new DefaultTransactionTimer(timeoutMins$3ds2sdk_release, errorRequestExecutor, creqData$3ds2sdk_release, j0Var);
    }
}