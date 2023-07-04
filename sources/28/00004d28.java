package com.stripe.android.financialconnections;

import h00.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlinx.coroutines.flow.h0;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$setupObservers$1", f = "FinancialConnectionsSheetActivity.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetActivity$setupObservers$1 extends l implements p<o0, d<? super b0>, Object> {
    int label;
    final /* synthetic */ FinancialConnectionsSheetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetActivity$setupObservers$1(FinancialConnectionsSheetActivity financialConnectionsSheetActivity, d<? super FinancialConnectionsSheetActivity$setupObservers$1> dVar) {
        super(2, dVar);
        this.this$0 = financialConnectionsSheetActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new FinancialConnectionsSheetActivity$setupObservers$1(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((FinancialConnectionsSheetActivity$setupObservers$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        FinancialConnectionsSheetViewModel viewModel;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            viewModel = this.this$0.getViewModel();
            h0<FinancialConnectionsSheetState> state$financial_connections_release = viewModel.getState$financial_connections_release();
            kotlinx.coroutines.flow.f<? super FinancialConnectionsSheetState> fVar = new kotlinx.coroutines.flow.f() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$setupObservers$1.1
                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((FinancialConnectionsSheetState) obj2, (d<? super b0>) dVar);
                }

                public final Object emit(FinancialConnectionsSheetState financialConnectionsSheetState, d<? super b0> dVar) {
                    return b0.f54756a;
                }
            };
            this.label = 1;
            if (state$financial_connections_release.collect(fVar, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}