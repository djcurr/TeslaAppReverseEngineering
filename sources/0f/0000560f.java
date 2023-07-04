package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.model.ConfirmStripeIntentParams;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$confirmPaymentSelection$1$1", f = "DefaultFlowController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class DefaultFlowController$confirmPaymentSelection$1$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ ConfirmStripeIntentParams $confirmParams;
    int label;
    final /* synthetic */ DefaultFlowController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlowController$confirmPaymentSelection$1$1(ConfirmStripeIntentParams confirmStripeIntentParams, DefaultFlowController defaultFlowController, d<? super DefaultFlowController$confirmPaymentSelection$1$1> dVar) {
        super(2, dVar);
        this.$confirmParams = confirmStripeIntentParams;
        this.this$0 = defaultFlowController;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new DefaultFlowController$confirmPaymentSelection$1$1(this.$confirmParams, this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((DefaultFlowController$confirmPaymentSelection$1$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        r2 = r1.this$0.paymentLauncher;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
        /*
            r1 = this;
            a00.b.d()
            int r0 = r1.label
            if (r0 != 0) goto L38
            vz.r.b(r2)
            com.stripe.android.model.ConfirmStripeIntentParams r2 = r1.$confirmParams
            boolean r0 = r2 instanceof com.stripe.android.model.ConfirmPaymentIntentParams
            if (r0 == 0) goto L21
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController r2 = r1.this$0
            com.stripe.android.payments.paymentlauncher.PaymentLauncher r2 = com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController.access$getPaymentLauncher$p(r2)
            if (r2 != 0) goto L19
            goto L35
        L19:
            com.stripe.android.model.ConfirmStripeIntentParams r0 = r1.$confirmParams
            com.stripe.android.model.ConfirmPaymentIntentParams r0 = (com.stripe.android.model.ConfirmPaymentIntentParams) r0
            r2.confirm(r0)
            goto L35
        L21:
            boolean r2 = r2 instanceof com.stripe.android.model.ConfirmSetupIntentParams
            if (r2 == 0) goto L35
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController r2 = r1.this$0
            com.stripe.android.payments.paymentlauncher.PaymentLauncher r2 = com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController.access$getPaymentLauncher$p(r2)
            if (r2 != 0) goto L2e
            goto L35
        L2e:
            com.stripe.android.model.ConfirmStripeIntentParams r0 = r1.$confirmParams
            com.stripe.android.model.ConfirmSetupIntentParams r0 = (com.stripe.android.model.ConfirmSetupIntentParams) r0
            r2.confirm(r0)
        L35:
            vz.b0 r2 = vz.b0.f54756a
            return r2
        L38:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$confirmPaymentSelection$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}