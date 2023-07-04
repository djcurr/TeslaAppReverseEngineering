package com.stripe.android.stripe3ds2.transaction;

import zz.d;

/* loaded from: classes6.dex */
public interface Transaction {
    Object createAuthenticationRequestParameters(d<? super AuthenticationRequestParameters> dVar);

    InitChallengeArgs createInitChallengeArgs(ChallengeParameters challengeParameters, int i11, IntentData intentData);

    SdkTransactionId getSdkTransactionId();
}