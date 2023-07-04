package com.stripe.android.financialconnections;

import com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlinx.coroutines.flow.t;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$onActivityResult$1", f = "FinancialConnectionsSheetViewModel.kt", l = {135}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetViewModel$onActivityResult$1 extends l implements p<o0, d<? super b0>, Object> {
    int label;
    final /* synthetic */ FinancialConnectionsSheetViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetViewModel$onActivityResult$1(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, d<? super FinancialConnectionsSheetViewModel$onActivityResult$1> dVar) {
        super(2, dVar);
        this.this$0 = financialConnectionsSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new FinancialConnectionsSheetViewModel$onActivityResult$1(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((FinancialConnectionsSheetViewModel$onActivityResult$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        t tVar;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            tVar = this.this$0._viewEffect;
            FinancialConnectionsSheetViewEffect.FinishWithResult finishWithResult = new FinancialConnectionsSheetViewEffect.FinishWithResult(FinancialConnectionsSheetActivityResult.Canceled.INSTANCE);
            this.label = 1;
            if (tVar.emit(finishWithResult, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        return b0.f54756a;
    }
}