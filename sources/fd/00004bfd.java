package com.stripe.android;

import android.content.Intent;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;

@f(c = "com.stripe.android.Stripe$onPaymentResult$1", f = "Stripe.kt", l = {387}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Stripe$onPaymentResult$1 extends l implements h00.l<zz.d<? super PaymentIntentResult>, Object> {
    final /* synthetic */ Intent $data;
    int label;
    final /* synthetic */ Stripe this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe$onPaymentResult$1(Stripe stripe, Intent intent, zz.d<? super Stripe$onPaymentResult$1> dVar) {
        super(1, dVar);
        this.this$0 = stripe;
        this.$data = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(zz.d<?> dVar) {
        return new Stripe$onPaymentResult$1(this.this$0, this.$data, dVar);
    }

    @Override // h00.l
    public final Object invoke(zz.d<? super PaymentIntentResult> dVar) {
        return ((Stripe$onPaymentResult$1) create(dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            PaymentController paymentController$payments_core_release = this.this$0.getPaymentController$payments_core_release();
            Intent intent = this.$data;
            this.label = 1;
            obj = paymentController$payments_core_release.getPaymentIntentResult(intent, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        return obj;
    }
}