package com.stripe.android.stripe3ds2.transaction;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.stripe3ds2.transaction.DefaultInitChallengeRepository", f = "InitChallengeRepository.kt", l = {67}, m = "startChallenge")
/* loaded from: classes6.dex */
public final class DefaultInitChallengeRepository$startChallenge$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultInitChallengeRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultInitChallengeRepository$startChallenge$1(DefaultInitChallengeRepository defaultInitChallengeRepository, zz.d<? super DefaultInitChallengeRepository$startChallenge$1> dVar) {
        super(dVar);
        this.this$0 = defaultInitChallengeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.startChallenge(null, this);
    }
}