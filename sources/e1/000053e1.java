package com.stripe.android.payments.bankaccount.ui;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$finishWithFinancialConnectionsSession$1", f = "CollectBankAccountViewModel.kt", l = {113, 117, 126}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CollectBankAccountViewModel$finishWithFinancialConnectionsSession$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ FinancialConnectionsSession $financialConnectionsSession;
    Object L$0;
    int label;
    final /* synthetic */ CollectBankAccountViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountViewModel$finishWithFinancialConnectionsSession$1(CollectBankAccountViewModel collectBankAccountViewModel, FinancialConnectionsSession financialConnectionsSession, d<? super CollectBankAccountViewModel$finishWithFinancialConnectionsSession$1> dVar) {
        super(2, dVar);
        this.this$0 = collectBankAccountViewModel;
        this.$financialConnectionsSession = financialConnectionsSession;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new CollectBankAccountViewModel$finishWithFinancialConnectionsSession$1(this.this$0, this.$financialConnectionsSession, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((CollectBankAccountViewModel$finishWithFinancialConnectionsSession$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = a00.b.d()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            vz.r.b(r9)
            goto L8a
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.L$0
            vz.r.b(r9)
            goto L77
        L24:
            vz.r.b(r9)
            vz.q r9 = (vz.q) r9
            java.lang.Object r9 = r9.j()
            goto L54
        L2e:
            vz.r.b(r9)
            com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel r9 = r8.this$0
            com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent r9 = com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel.access$getRetrieveStripeIntent$p(r9)
            com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel r1 = r8.this$0
            com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$Args r1 = com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel.access$getArgs$p(r1)
            java.lang.String r1 = r1.getPublishableKey()
            com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel r5 = r8.this$0
            com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$Args r5 = com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel.access$getArgs$p(r5)
            java.lang.String r5 = r5.getClientSecret()
            r8.label = r4
            java.lang.Object r9 = r9.m279invoke0E7RQCE(r1, r5, r8)
            if (r9 != r0) goto L54
            return r0
        L54:
            r1 = r9
            com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel r9 = r8.this$0
            com.stripe.android.financialconnections.model.FinancialConnectionsSession r4 = r8.$financialConnectionsSession
            boolean r5 = vz.q.h(r1)
            if (r5 == 0) goto L77
            r5 = r1
            com.stripe.android.model.StripeIntent r5 = (com.stripe.android.model.StripeIntent) r5
            com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult$Completed r6 = new com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult$Completed
            com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponse r7 = new com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponse
            r7.<init>(r5, r4)
            r6.<init>(r7)
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r9 = com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel.access$finishWithResult(r9, r6, r8)
            if (r9 != r0) goto L77
            return r0
        L77:
            com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel r9 = r8.this$0
            java.lang.Throwable r3 = vz.q.e(r1)
            if (r3 == 0) goto L8a
            r8.L$0 = r1
            r8.label = r2
            java.lang.Object r9 = com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel.access$finishWithError(r9, r3, r8)
            if (r9 != r0) goto L8a
            return r0
        L8a:
            vz.b0 r9 = vz.b0.f54756a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$finishWithFinancialConnectionsSession$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}