package com.stripe.android;

import androidx.fragment.app.Fragment;
import com.stripe.android.PaymentController;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.Stripe$handleNextActionForPayment$2", f = "Stripe.kt", l = {348}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Stripe$handleNextActionForPayment$2 extends l implements p<o0, zz.d<? super b0>, Object> {
    final /* synthetic */ String $clientSecret;
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ String $stripeAccountId;
    int label;
    final /* synthetic */ Stripe this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe$handleNextActionForPayment$2(Stripe stripe, Fragment fragment, String str, String str2, zz.d<? super Stripe$handleNextActionForPayment$2> dVar) {
        super(2, dVar);
        this.this$0 = stripe;
        this.$fragment = fragment;
        this.$clientSecret = str;
        this.$stripeAccountId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        return new Stripe$handleNextActionForPayment$2(this.this$0, this.$fragment, this.$clientSecret, this.$stripeAccountId, dVar);
    }

    @Override // h00.p
    public final Object mo160invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((Stripe$handleNextActionForPayment$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            PaymentController paymentController$payments_core_release = this.this$0.getPaymentController$payments_core_release();
            AuthActivityStarterHost create$payments_core_release = AuthActivityStarterHost.Companion.create$payments_core_release(this.$fragment);
            String value$payments_core_release = new PaymentIntent.ClientSecret(this.$clientSecret).getValue$payments_core_release();
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.$stripeAccountId, null, 4, null);
            PaymentController.StripeIntentType stripeIntentType = PaymentController.StripeIntentType.PaymentIntent;
            this.label = 1;
            if (paymentController$payments_core_release.startAuth(create$payments_core_release, value$payments_core_release, options, stripeIntentType, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        return b0.f54756a;
    }
}