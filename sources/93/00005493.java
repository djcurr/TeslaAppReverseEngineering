package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.StripeIntentResult;
import com.stripe.android.model.StripeIntent;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$onPaymentFlowResult$1$2$1", f = "PaymentLauncherViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class PaymentLauncherViewModel$onPaymentFlowResult$1$2$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ StripeIntentResult<StripeIntent> $it;
    int label;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentLauncherViewModel$onPaymentFlowResult$1$2$1(PaymentLauncherViewModel paymentLauncherViewModel, StripeIntentResult<? extends StripeIntent> stripeIntentResult, d<? super PaymentLauncherViewModel$onPaymentFlowResult$1$2$1> dVar) {
        super(2, dVar);
        this.this$0 = paymentLauncherViewModel;
        this.$it = stripeIntentResult;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new PaymentLauncherViewModel$onPaymentFlowResult$1$2$1(this.this$0, this.$it, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((PaymentLauncherViewModel$onPaymentFlowResult$1$2$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            this.this$0.postResult(this.$it);
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}