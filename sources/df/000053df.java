package com.stripe.android.payments.bankaccount.ui;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1", f = "CollectBankAccountViewModel.kt", l = {134, 139, 155, 157}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ FinancialConnectionsSession $financialConnectionsSession;
    Object L$0;
    int label;
    final /* synthetic */ CollectBankAccountViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1(CollectBankAccountViewModel collectBankAccountViewModel, FinancialConnectionsSession financialConnectionsSession, d<? super CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1> dVar) {
        super(2, dVar);
        this.this$0 = collectBankAccountViewModel;
        this.$financialConnectionsSession = financialConnectionsSession;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1(this.this$0, this.$financialConnectionsSession, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}