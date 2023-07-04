package com.stripe.android.payments;

import com.stripe.android.payments.PaymentFlowResult;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [S] */
@f(c = "com.stripe.android.payments.PaymentFlowResultProcessor$processResult$2", f = "PaymentFlowResultProcessor.kt", l = {52, 60, 72}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class PaymentFlowResultProcessor$processResult$2<S> extends l implements p<o0, d<? super S>, Object> {
    final /* synthetic */ PaymentFlowResult.Unvalidated $unvalidatedResult;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PaymentFlowResultProcessor<T, S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentFlowResultProcessor$processResult$2(PaymentFlowResult.Unvalidated unvalidated, PaymentFlowResultProcessor<T, ? extends S> paymentFlowResultProcessor, d<? super PaymentFlowResultProcessor$processResult$2> dVar) {
        super(2, dVar);
        this.$unvalidatedResult = unvalidated;
        this.this$0 = paymentFlowResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new PaymentFlowResultProcessor$processResult$2(this.$unvalidatedResult, this.this$0, dVar);
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, Object obj) {
        return invoke(o0Var, (d) ((d) obj));
    }

    public final Object invoke(o0 o0Var, d<? super S> dVar) {
        return ((PaymentFlowResultProcessor$processResult$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.PaymentFlowResultProcessor$processResult$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}