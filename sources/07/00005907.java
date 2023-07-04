package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor;
import kotlin.jvm.internal.u;
import v20.j0;

/* loaded from: classes6.dex */
final class ChallengeActivity$errorRequestExecutor$2 extends u implements h00.a<ErrorRequestExecutor> {
    final /* synthetic */ ChallengeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$errorRequestExecutor$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final ErrorRequestExecutor invoke() {
        j0 j0Var;
        ChallengeViewArgs viewArgs;
        ErrorReporter errorReporter;
        j0Var = ChallengeActivity.WORK_CONTEXT;
        StripeErrorRequestExecutor.Factory factory = new StripeErrorRequestExecutor.Factory(j0Var);
        viewArgs = this.this$0.getViewArgs();
        String acsUrl$3ds2sdk_release = viewArgs.getCreqExecutorConfig$3ds2sdk_release().getAcsUrl$3ds2sdk_release();
        errorReporter = this.this$0.getErrorReporter();
        return factory.create(acsUrl$3ds2sdk_release, errorReporter);
    }
}