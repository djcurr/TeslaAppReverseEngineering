package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import h00.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$submit$2", f = "ChallengeActionHandler.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class ChallengeActionHandler$Default$submit$2 extends l implements p<o0, d<? super ChallengeRequestResult>, Object> {
    final /* synthetic */ ChallengeAction $action;
    int label;
    final /* synthetic */ ChallengeActionHandler.Default this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActionHandler$Default$submit$2(ChallengeActionHandler.Default r12, ChallengeAction challengeAction, d<? super ChallengeActionHandler$Default$submit$2> dVar) {
        super(2, dVar);
        this.this$0 = r12;
        this.$action = challengeAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new ChallengeActionHandler$Default$submit$2(this.this$0, this.$action, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super ChallengeRequestResult> dVar) {
        return ((ChallengeActionHandler$Default$submit$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        ChallengeRequestData challengeRequestData;
        ChallengeRequestData challengeRequestData2;
        ChallengeRequestData challengeRequestData3;
        ChallengeRequestData challengeRequestData4;
        ChallengeRequestData challengeRequestData5;
        ChallengeRequestData copy$default;
        Object executeChallengeRequest;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                r.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.b(obj);
        challengeRequestData = this.this$0.creqData;
        String messageVersion = challengeRequestData.getMessageVersion();
        challengeRequestData2 = this.this$0.creqData;
        String threeDsServerTransId = challengeRequestData2.getThreeDsServerTransId();
        challengeRequestData3 = this.this$0.creqData;
        String acsTransId = challengeRequestData3.getAcsTransId();
        challengeRequestData4 = this.this$0.creqData;
        SdkTransactionId sdkTransId = challengeRequestData4.getSdkTransId();
        challengeRequestData5 = this.this$0.creqData;
        ChallengeRequestData challengeRequestData6 = new ChallengeRequestData(messageVersion, threeDsServerTransId, acsTransId, sdkTransId, null, null, null, challengeRequestData5.getMessageExtensions(), null, null, 880, null);
        ChallengeAction challengeAction = this.$action;
        if (challengeAction instanceof ChallengeAction.NativeForm) {
            copy$default = ChallengeRequestData.copy$default(challengeRequestData6, null, null, null, null, ((ChallengeAction.NativeForm) challengeAction).getUserEntry$3ds2sdk_release(), null, null, null, null, null, 1007, null);
        } else if (challengeAction instanceof ChallengeAction.HtmlForm) {
            copy$default = ChallengeRequestData.copy$default(challengeRequestData6, null, null, null, null, null, null, ((ChallengeAction.HtmlForm) challengeAction).getUserEntry$3ds2sdk_release(), null, null, null, 959, null);
        } else if (challengeAction instanceof ChallengeAction.Oob) {
            copy$default = ChallengeRequestData.copy$default(challengeRequestData6, null, null, null, null, null, null, null, null, b.a(true), null, 767, null);
        } else if (challengeAction instanceof ChallengeAction.Resend) {
            copy$default = ChallengeRequestData.copy$default(challengeRequestData6, null, null, null, null, null, null, null, null, null, b.a(true), 511, null);
        } else if (challengeAction instanceof ChallengeAction.Cancel) {
            copy$default = ChallengeRequestData.copy$default(challengeRequestData6, null, null, null, null, null, ChallengeRequestData.CancelReason.UserSelected, null, null, null, null, 991, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ChallengeActionHandler.Default r42 = this.this$0;
        this.label = 1;
        executeChallengeRequest = r42.executeChallengeRequest(copy$default, this);
        return executeChallengeRequest == d11 ? d11 : executeChallengeRequest;
    }
}