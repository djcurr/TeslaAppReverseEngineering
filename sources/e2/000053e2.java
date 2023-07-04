package com.stripe.android.payments.bankaccount.ui;

import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$onConnectionsResult$1", f = "CollectBankAccountViewModel.kt", l = {94, 96}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CollectBankAccountViewModel$onConnectionsResult$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ FinancialConnectionsSheetResult $result;
    int label;
    final /* synthetic */ CollectBankAccountViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountViewModel$onConnectionsResult$1(FinancialConnectionsSheetResult financialConnectionsSheetResult, CollectBankAccountViewModel collectBankAccountViewModel, d<? super CollectBankAccountViewModel$onConnectionsResult$1> dVar) {
        super(2, dVar);
        this.$result = financialConnectionsSheetResult;
        this.this$0 = collectBankAccountViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new CollectBankAccountViewModel$onConnectionsResult$1(this.$result, this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((CollectBankAccountViewModel$onConnectionsResult$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        CollectBankAccountContract.Args args;
        Object finishWithError;
        Object finishWithResult;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            FinancialConnectionsSheetResult financialConnectionsSheetResult = this.$result;
            if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetResult.Canceled) {
                CollectBankAccountViewModel collectBankAccountViewModel = this.this$0;
                CollectBankAccountResult.Cancelled cancelled = CollectBankAccountResult.Cancelled.INSTANCE;
                this.label = 1;
                finishWithResult = collectBankAccountViewModel.finishWithResult(cancelled, this);
                if (finishWithResult == d11) {
                    return d11;
                }
            } else if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetResult.Failed) {
                CollectBankAccountViewModel collectBankAccountViewModel2 = this.this$0;
                Throwable error = ((FinancialConnectionsSheetResult.Failed) financialConnectionsSheetResult).getError();
                this.label = 2;
                finishWithError = collectBankAccountViewModel2.finishWithError(error, this);
                if (finishWithError == d11) {
                    return d11;
                }
            } else if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetResult.Completed) {
                args = this.this$0.args;
                if (args.getAttachToIntent()) {
                    this.this$0.attachFinancialConnectionsSessionToIntent(((FinancialConnectionsSheetResult.Completed) this.$result).getFinancialConnectionsSession());
                } else {
                    this.this$0.finishWithFinancialConnectionsSession(((FinancialConnectionsSheetResult.Completed) this.$result).getFinancialConnectionsSession());
                }
            }
        } else if (i11 != 1 && i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        return b0.f54756a;
    }
}