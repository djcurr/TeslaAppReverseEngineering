package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.a2;
import v20.o0;
import vz.b0;
import vz.k;
import zz.d;

@f(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$3", f = "Stripe3ds2TransactionActivity.kt", l = {108, 112}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class Stripe3ds2TransactionActivity$onCreate$3 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ androidx.activity.result.d<PaymentBrowserAuthContract.Args> $browserLauncher;
    final /* synthetic */ androidx.activity.result.d<ChallengeViewArgs> $challengeLauncher;
    final /* synthetic */ h00.l<ChallengeResult, a2> $onChallengeResult;
    final /* synthetic */ k<Stripe3ds2TransactionViewModel> $viewModel$delegate;
    int label;
    final /* synthetic */ Stripe3ds2TransactionActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Stripe3ds2TransactionActivity$onCreate$3(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, androidx.activity.result.d<ChallengeViewArgs> dVar, h00.l<? super ChallengeResult, ? extends a2> lVar, androidx.activity.result.d<PaymentBrowserAuthContract.Args> dVar2, k<Stripe3ds2TransactionViewModel> kVar, d<? super Stripe3ds2TransactionActivity$onCreate$3> dVar3) {
        super(2, dVar3);
        this.this$0 = stripe3ds2TransactionActivity;
        this.$challengeLauncher = dVar;
        this.$onChallengeResult = lVar;
        this.$browserLauncher = dVar2;
        this.$viewModel$delegate = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new Stripe3ds2TransactionActivity$onCreate$3(this.this$0, this.$challengeLauncher, this.$onChallengeResult, this.$browserLauncher, this.$viewModel$delegate, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((Stripe3ds2TransactionActivity$onCreate$3) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = a00.b.d()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            vz.r.b(r5)
            goto L53
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            vz.r.b(r5)
            goto L38
        L1e:
            vz.r.b(r5)
            com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity r5 = r4.this$0
            boolean r5 = r5.isFinishing()
            if (r5 != 0) goto L94
            vz.k<com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel> r5 = r4.$viewModel$delegate
            com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel r5 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.m284access$onCreate$lambda6(r5)
            r4.label = r3
            java.lang.Object r5 = r5.start3ds2Flow(r4)
            if (r5 != r0) goto L38
            return r0
        L38:
            com.stripe.android.payments.core.authentication.threeds2.NextStep r5 = (com.stripe.android.payments.core.authentication.threeds2.NextStep) r5
            boolean r1 = r5 instanceof com.stripe.android.payments.core.authentication.threeds2.NextStep.StartChallenge
            if (r1 == 0) goto L75
            vz.k<com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel> r1 = r4.$viewModel$delegate
            com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel r1 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.m284access$onCreate$lambda6(r1)
            com.stripe.android.payments.core.authentication.threeds2.NextStep$StartChallenge r5 = (com.stripe.android.payments.core.authentication.threeds2.NextStep.StartChallenge) r5
            com.stripe.android.stripe3ds2.transaction.InitChallengeArgs r5 = r5.getArgs()
            r4.label = r2
            java.lang.Object r5 = r1.initChallenge(r5, r4)
            if (r5 != r0) goto L53
            return r0
        L53:
            com.stripe.android.stripe3ds2.transaction.InitChallengeResult r5 = (com.stripe.android.stripe3ds2.transaction.InitChallengeResult) r5
            boolean r0 = r5 instanceof com.stripe.android.stripe3ds2.transaction.InitChallengeResult.Start
            if (r0 == 0) goto L65
            androidx.activity.result.d<com.stripe.android.stripe3ds2.views.ChallengeViewArgs> r0 = r4.$challengeLauncher
            com.stripe.android.stripe3ds2.transaction.InitChallengeResult$Start r5 = (com.stripe.android.stripe3ds2.transaction.InitChallengeResult.Start) r5
            com.stripe.android.stripe3ds2.views.ChallengeViewArgs r5 = r5.getChallengeViewArgs()
            r0.b(r5)
            goto L94
        L65:
            boolean r0 = r5 instanceof com.stripe.android.stripe3ds2.transaction.InitChallengeResult.End
            if (r0 == 0) goto L94
            h00.l<com.stripe.android.stripe3ds2.transaction.ChallengeResult, v20.a2> r0 = r4.$onChallengeResult
            com.stripe.android.stripe3ds2.transaction.InitChallengeResult$End r5 = (com.stripe.android.stripe3ds2.transaction.InitChallengeResult.End) r5
            com.stripe.android.stripe3ds2.transaction.ChallengeResult r5 = r5.getChallengeResult()
            r0.invoke(r5)
            goto L94
        L75:
            boolean r0 = r5 instanceof com.stripe.android.payments.core.authentication.threeds2.NextStep.StartFallback
            if (r0 == 0) goto L85
            androidx.activity.result.d<com.stripe.android.auth.PaymentBrowserAuthContract$Args> r0 = r4.$browserLauncher
            com.stripe.android.payments.core.authentication.threeds2.NextStep$StartFallback r5 = (com.stripe.android.payments.core.authentication.threeds2.NextStep.StartFallback) r5
            com.stripe.android.auth.PaymentBrowserAuthContract$Args r5 = r5.getArgs()
            r0.b(r5)
            goto L94
        L85:
            boolean r0 = r5 instanceof com.stripe.android.payments.core.authentication.threeds2.NextStep.Complete
            if (r0 == 0) goto L94
            com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity r0 = r4.this$0
            com.stripe.android.payments.core.authentication.threeds2.NextStep$Complete r5 = (com.stripe.android.payments.core.authentication.threeds2.NextStep.Complete) r5
            com.stripe.android.payments.PaymentFlowResult$Unvalidated r5 = r5.getResult()
            com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.access$finishWithResult(r0, r5)
        L94:
            vz.b0 r5 = vz.b0.f54756a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}