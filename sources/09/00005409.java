package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import zz.d;

/* loaded from: classes6.dex */
public interface Stripe3ds2ChallengeResultProcessor {
    Object process(ChallengeResult challengeResult, d<? super PaymentFlowResult.Unvalidated> dVar);
}