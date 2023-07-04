package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import zz.d;

/* loaded from: classes6.dex */
public interface ChallengeRequestResultRepository {
    Object get(ChallengeRequestExecutor.Config config, ChallengeRequestData challengeRequestData, d<? super ChallengeRequestResult> dVar);
}