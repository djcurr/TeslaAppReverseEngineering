package com.stripe.android.payments.core.authentication.threeds2;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor", f = "Stripe3ds2ChallengeResultProcessor.kt", l = {200, 208}, m = "onComplete3ds2AuthFailure")
/* loaded from: classes6.dex */
public final class DefaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1 extends d {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultStripe3ds2ChallengeResultProcessor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1(DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor, zz.d<? super DefaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1> dVar) {
        super(dVar);
        this.this$0 = defaultStripe3ds2ChallengeResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object onComplete3ds2AuthFailure;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        onComplete3ds2AuthFailure = this.this$0.onComplete3ds2AuthFailure(null, null, 0, null, this);
        return onComplete3ds2AuthFailure;
    }
}