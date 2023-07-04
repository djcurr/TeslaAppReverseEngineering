package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel;
import v20.o0;
import vz.b0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$submit$1", f = "ChallengeActivityViewModel.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ChallengeActivityViewModel$submit$1 extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {
    final /* synthetic */ ChallengeAction $action;
    Object L$0;
    int label;
    final /* synthetic */ ChallengeActivityViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivityViewModel$submit$1(ChallengeActivityViewModel challengeActivityViewModel, ChallengeAction challengeAction, zz.d<? super ChallengeActivityViewModel$submit$1> dVar) {
        super(2, dVar);
        this.this$0 = challengeActivityViewModel;
        this.$action = challengeAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        return new ChallengeActivityViewModel$submit$1(this.this$0, this.$action, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((ChallengeActivityViewModel$submit$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        ChallengeActivityViewModel.OnInactiveAwareMutableLiveData onInactiveAwareMutableLiveData;
        ChallengeActionHandler challengeActionHandler;
        ChallengeActivityViewModel.OnInactiveAwareMutableLiveData onInactiveAwareMutableLiveData2;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            onInactiveAwareMutableLiveData = this.this$0._challengeRequestResult;
            challengeActionHandler = this.this$0.challengeActionHandler;
            ChallengeAction challengeAction = this.$action;
            this.L$0 = onInactiveAwareMutableLiveData;
            this.label = 1;
            Object submit = challengeActionHandler.submit(challengeAction, this);
            if (submit == d11) {
                return d11;
            }
            onInactiveAwareMutableLiveData2 = onInactiveAwareMutableLiveData;
            obj = submit;
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            onInactiveAwareMutableLiveData2 = (ChallengeActivityViewModel.OnInactiveAwareMutableLiveData) this.L$0;
            r.b(obj);
        }
        onInactiveAwareMutableLiveData2.postValue(obj);
        return b0.f54756a;
    }
}