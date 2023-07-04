package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import kotlin.jvm.internal.u;
import v20.j0;

/* loaded from: classes6.dex */
final class ChallengeActivity$challengeActionHandler$2 extends u implements h00.a<ChallengeActionHandler.Default> {
    final /* synthetic */ ChallengeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$challengeActionHandler$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final ChallengeActionHandler.Default invoke() {
        ChallengeViewArgs viewArgs;
        ErrorReporter errorReporter;
        ChallengeViewArgs viewArgs2;
        j0 j0Var;
        viewArgs = this.this$0.getViewArgs();
        ChallengeRequestData creqData$3ds2sdk_release = viewArgs.getCreqData$3ds2sdk_release();
        errorReporter = this.this$0.getErrorReporter();
        viewArgs2 = this.this$0.getViewArgs();
        ChallengeRequestExecutor.Factory creqExecutorFactory$3ds2sdk_release = viewArgs2.getCreqExecutorFactory$3ds2sdk_release();
        j0Var = ChallengeActivity.WORK_CONTEXT;
        return new ChallengeActionHandler.Default(creqData$3ds2sdk_release, errorReporter, creqExecutorFactory$3ds2sdk_release, j0Var);
    }
}