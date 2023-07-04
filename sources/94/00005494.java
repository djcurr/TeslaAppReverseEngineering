package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.payments.paymentlauncher.PaymentResult;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$onPaymentFlowResult$1$3$1", f = "PaymentLauncherViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class PaymentLauncherViewModel$onPaymentFlowResult$1$3$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ Throwable $it;
    int label;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLauncherViewModel$onPaymentFlowResult$1$3$1(PaymentLauncherViewModel paymentLauncherViewModel, Throwable th2, d<? super PaymentLauncherViewModel$onPaymentFlowResult$1$3$1> dVar) {
        super(2, dVar);
        this.this$0 = paymentLauncherViewModel;
        this.$it = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new PaymentLauncherViewModel$onPaymentFlowResult$1$3$1(this.this$0, this.$it, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((PaymentLauncherViewModel$onPaymentFlowResult$1$3$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            this.this$0.getPaymentLauncherResult$payments_core_release().postValue(new PaymentResult.Failed(this.$it));
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}