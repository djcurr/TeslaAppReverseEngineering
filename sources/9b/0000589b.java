package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import kotlin.jvm.internal.s;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public final class DefaultChallengeRequestResultRepository implements ChallengeRequestResultRepository {
    private final ErrorReporter errorReporter;
    private final g workContext;

    public DefaultChallengeRequestResultRepository(ErrorReporter errorReporter, g workContext) {
        s.g(errorReporter, "errorReporter");
        s.g(workContext, "workContext");
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.ChallengeRequestResultRepository
    public Object get(ChallengeRequestExecutor.Config config, ChallengeRequestData challengeRequestData, d<? super ChallengeRequestResult> dVar) {
        return new StripeChallengeRequestExecutor.Factory(config).create(this.errorReporter, this.workContext).execute(challengeRequestData, dVar);
    }
}