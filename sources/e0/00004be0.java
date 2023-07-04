package com.stripe.android;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.Stripe$confirmAlipayPayment$1", f = "Stripe.kt", l = {201}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Stripe$confirmAlipayPayment$1 extends l implements h00.l<zz.d<? super PaymentIntentResult>, Object> {
    final /* synthetic */ AlipayAuthenticator $authenticator;
    final /* synthetic */ ConfirmPaymentIntentParams $confirmPaymentIntentParams;
    final /* synthetic */ String $stripeAccountId;
    int label;
    final /* synthetic */ Stripe this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe$confirmAlipayPayment$1(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, String str, zz.d<? super Stripe$confirmAlipayPayment$1> dVar) {
        super(1, dVar);
        this.this$0 = stripe;
        this.$confirmPaymentIntentParams = confirmPaymentIntentParams;
        this.$authenticator = alipayAuthenticator;
        this.$stripeAccountId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(zz.d<?> dVar) {
        return new Stripe$confirmAlipayPayment$1(this.this$0, this.$confirmPaymentIntentParams, this.$authenticator, this.$stripeAccountId, dVar);
    }

    @Override // h00.l
    public final Object invoke(zz.d<? super PaymentIntentResult> dVar) {
        return ((Stripe$confirmAlipayPayment$1) create(dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            PaymentController paymentController$payments_core_release = this.this$0.getPaymentController$payments_core_release();
            ConfirmPaymentIntentParams confirmPaymentIntentParams = this.$confirmPaymentIntentParams;
            AlipayAuthenticator alipayAuthenticator = this.$authenticator;
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.$stripeAccountId, null, 4, null);
            this.label = 1;
            obj = paymentController$payments_core_release.confirmAndAuthenticateAlipay(confirmPaymentIntentParams, alipayAuthenticator, options, this);
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