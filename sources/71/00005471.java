package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.payments.paymentlauncher.PaymentLauncher;
import h00.l;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
/* synthetic */ class PaymentLauncher$Companion$createForCompose$1 extends p implements l<PaymentResult, b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public PaymentLauncher$Companion$createForCompose$1(Object obj) {
        super(1, obj, PaymentLauncher.PaymentResultCallback.class, "onPaymentResult", "onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V", 0);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(PaymentResult paymentResult) {
        invoke2(paymentResult);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PaymentResult p02) {
        s.g(p02, "p0");
        ((PaymentLauncher.PaymentResultCallback) this.receiver).onPaymentResult(p02);
    }
}