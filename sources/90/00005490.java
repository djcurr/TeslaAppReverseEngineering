package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$confirmStripeIntent$1", f = "PaymentLauncherViewModel.kt", l = {110, 120}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class PaymentLauncherViewModel$confirmStripeIntent$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ ConfirmStripeIntentParams $confirmStripeIntentParams;
    final /* synthetic */ AuthActivityStarterHost $host;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLauncherViewModel$confirmStripeIntent$1(PaymentLauncherViewModel paymentLauncherViewModel, ConfirmStripeIntentParams confirmStripeIntentParams, AuthActivityStarterHost authActivityStarterHost, d<? super PaymentLauncherViewModel$confirmStripeIntent$1> dVar) {
        super(2, dVar);
        this.this$0 = paymentLauncherViewModel;
        this.$confirmStripeIntentParams = confirmStripeIntentParams;
        this.$host = authActivityStarterHost;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        PaymentLauncherViewModel$confirmStripeIntent$1 paymentLauncherViewModel$confirmStripeIntent$1 = new PaymentLauncherViewModel$confirmStripeIntent$1(this.this$0, this.$confirmStripeIntentParams, this.$host, dVar);
        paymentLauncherViewModel$confirmStripeIntent$1.L$0 = obj;
        return paymentLauncherViewModel$confirmStripeIntent$1;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((PaymentLauncherViewModel$confirmStripeIntent$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$confirmStripeIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}