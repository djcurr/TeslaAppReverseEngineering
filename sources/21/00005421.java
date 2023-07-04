package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.StripePaymentController;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.payments.core.authentication.threeds2.NextStep;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.transaction.ChallengeParameters;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import v20.y0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$startChallengeFlow$2", f = "Stripe3ds2TransactionViewModel.kt", l = {259}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionViewModel$startChallengeFlow$2 extends l implements p<o0, d<? super NextStep.StartChallenge>, Object> {
    final /* synthetic */ Stripe3ds2AuthResult.Ares $ares;
    final /* synthetic */ int $maxTimeout;
    final /* synthetic */ String $sourceId;
    final /* synthetic */ Transaction $transaction;
    int label;
    final /* synthetic */ Stripe3ds2TransactionViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2TransactionViewModel$startChallengeFlow$2(Stripe3ds2AuthResult.Ares ares, Transaction transaction, int i11, Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel, String str, d<? super Stripe3ds2TransactionViewModel$startChallengeFlow$2> dVar) {
        super(2, dVar);
        this.$ares = ares;
        this.$transaction = transaction;
        this.$maxTimeout = i11;
        this.this$0 = stripe3ds2TransactionViewModel;
        this.$sourceId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new Stripe3ds2TransactionViewModel$startChallengeFlow$2(this.$ares, this.$transaction, this.$maxTimeout, this.this$0, this.$sourceId, dVar);
    }

    @Override // h00.p
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo160invoke(o0 o0Var, d<? super NextStep.StartChallenge> dVar) {
        return ((Stripe3ds2TransactionViewModel$startChallengeFlow$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Stripe3ds2TransactionContract.Args args;
        Stripe3ds2TransactionContract.Args args2;
        Stripe3ds2TransactionContract.Args args3;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            long cHALLENGE_DELAY$payments_core_release = StripePaymentController.Companion.getCHALLENGE_DELAY$payments_core_release();
            this.label = 1;
            if (y0.b(cHALLENGE_DELAY$payments_core_release, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        ChallengeParameters challengeParameters = new ChallengeParameters(this.$ares.getThreeDSServerTransId$payments_core_release(), this.$ares.getAcsTransId$payments_core_release(), null, this.$ares.getAcsSignedContent$payments_core_release(), null, 20, null);
        Transaction transaction = this.$transaction;
        int i12 = this.$maxTimeout;
        args = this.this$0.args;
        String clientSecret = args.getStripeIntent().getClientSecret();
        if (clientSecret == null) {
            clientSecret = "";
        }
        String str = this.$sourceId;
        args2 = this.this$0.args;
        String apiKey = args2.getRequestOptions().getApiKey();
        args3 = this.this$0.args;
        return new NextStep.StartChallenge(transaction.createInitChallengeArgs(challengeParameters, i12, new IntentData(clientSecret, str, apiKey, args3.getRequestOptions().getStripeAccount())));
    }
}