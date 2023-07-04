package com.stripe.android;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.networking.StripeRepository;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.Stripe$verifyPaymentIntentWithMicrodeposits$2", f = "Stripe.kt", l = {1704}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Stripe$verifyPaymentIntentWithMicrodeposits$2 extends l implements h00.l<zz.d<? super PaymentIntent>, Object> {
    final /* synthetic */ String $clientSecret;
    final /* synthetic */ String $descriptorCode;
    int label;
    final /* synthetic */ Stripe this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe$verifyPaymentIntentWithMicrodeposits$2(Stripe stripe, String str, String str2, zz.d<? super Stripe$verifyPaymentIntentWithMicrodeposits$2> dVar) {
        super(1, dVar);
        this.this$0 = stripe;
        this.$clientSecret = str;
        this.$descriptorCode = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(zz.d<?> dVar) {
        return new Stripe$verifyPaymentIntentWithMicrodeposits$2(this.this$0, this.$clientSecret, this.$descriptorCode, dVar);
    }

    @Override // h00.l
    public final Object invoke(zz.d<? super PaymentIntent> dVar) {
        return ((Stripe$verifyPaymentIntentWithMicrodeposits$2) create(dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            StripeRepository stripeRepository$payments_core_release = this.this$0.getStripeRepository$payments_core_release();
            String str = this.$clientSecret;
            String str2 = this.$descriptorCode;
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.this$0.getStripeAccountId$payments_core_release(), null, 4, null);
            this.label = 1;
            obj = stripeRepository$payments_core_release.verifyPaymentIntentWithMicrodeposits(str, str2, options, this);
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