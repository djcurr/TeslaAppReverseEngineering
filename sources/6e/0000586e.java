package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default", f = "ChallengeActionHandler.kt", l = {78, 81}, m = "executeChallengeRequest")
/* loaded from: classes6.dex */
public final class ChallengeActionHandler$Default$executeChallengeRequest$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChallengeActionHandler.Default this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActionHandler$Default$executeChallengeRequest$1(ChallengeActionHandler.Default r12, zz.d<? super ChallengeActionHandler$Default$executeChallengeRequest$1> dVar) {
        super(dVar);
        this.this$0 = r12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object executeChallengeRequest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        executeChallengeRequest = this.this$0.executeChallengeRequest(null, this);
        return executeChallengeRequest;
    }
}