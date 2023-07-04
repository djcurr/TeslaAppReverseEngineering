package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.StripeIntentResult;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.PaymentFlowResultProcessor;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.i;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;
import zz.g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$onPaymentFlowResult$1", f = "PaymentLauncherViewModel.kt", l = {201, 204, 209}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class PaymentLauncherViewModel$onPaymentFlowResult$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ PaymentFlowResult.Unvalidated $paymentFlowResult;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLauncherViewModel$onPaymentFlowResult$1(PaymentLauncherViewModel paymentLauncherViewModel, PaymentFlowResult.Unvalidated unvalidated, d<? super PaymentLauncherViewModel$onPaymentFlowResult$1> dVar) {
        super(2, dVar);
        this.this$0 = paymentLauncherViewModel;
        this.$paymentFlowResult = unvalidated;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        PaymentLauncherViewModel$onPaymentFlowResult$1 paymentLauncherViewModel$onPaymentFlowResult$1 = new PaymentLauncherViewModel$onPaymentFlowResult$1(this.this$0, this.$paymentFlowResult, dVar);
        paymentLauncherViewModel$onPaymentFlowResult$1.L$0 = obj;
        return paymentLauncherViewModel$onPaymentFlowResult$1;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((PaymentLauncherViewModel$onPaymentFlowResult$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object b11;
        g gVar;
        g gVar2;
        boolean z11;
        sw.a aVar;
        PaymentFlowResultProcessor paymentFlowResultProcessor;
        sw.a aVar2;
        d11 = a00.d.d();
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            q.a aVar3 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (i11 == 0) {
            r.b(obj);
            o0 o0Var = (o0) this.L$0;
            PaymentLauncherViewModel paymentLauncherViewModel = this.this$0;
            PaymentFlowResult.Unvalidated unvalidated = this.$paymentFlowResult;
            q.a aVar4 = q.f54772b;
            z11 = paymentLauncherViewModel.isPaymentIntent;
            if (z11) {
                aVar2 = paymentLauncherViewModel.lazyPaymentIntentFlowResultProcessor;
                paymentFlowResultProcessor = (PaymentFlowResultProcessor) aVar2.get();
            } else {
                aVar = paymentLauncherViewModel.lazySetupIntentFlowResultProcessor;
                paymentFlowResultProcessor = (PaymentFlowResultProcessor) aVar.get();
            }
            this.label = 1;
            obj = paymentFlowResultProcessor.processResult(unvalidated, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return b0.f54756a;
        } else {
            r.b(obj);
        }
        b11 = q.b((StripeIntentResult) obj);
        PaymentLauncherViewModel paymentLauncherViewModel2 = this.this$0;
        Throwable e11 = q.e(b11);
        if (e11 == null) {
            gVar2 = paymentLauncherViewModel2.uiContext;
            PaymentLauncherViewModel$onPaymentFlowResult$1$2$1 paymentLauncherViewModel$onPaymentFlowResult$1$2$1 = new PaymentLauncherViewModel$onPaymentFlowResult$1$2$1(paymentLauncherViewModel2, (StripeIntentResult) b11, null);
            this.label = 2;
            if (i.g(gVar2, paymentLauncherViewModel$onPaymentFlowResult$1$2$1, this) == d11) {
                return d11;
            }
        } else {
            gVar = paymentLauncherViewModel2.uiContext;
            PaymentLauncherViewModel$onPaymentFlowResult$1$3$1 paymentLauncherViewModel$onPaymentFlowResult$1$3$1 = new PaymentLauncherViewModel$onPaymentFlowResult$1$3$1(paymentLauncherViewModel2, e11, null);
            this.label = 3;
            if (i.g(gVar, paymentLauncherViewModel$onPaymentFlowResult$1$3$1, this) == d11) {
                return d11;
            }
        }
        return b0.f54756a;
    }
}