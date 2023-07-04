package com.stripe.android;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Token;
import com.stripe.android.model.TokenParams;
import com.stripe.android.networking.StripeRepository;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.Stripe$createToken$1", f = "Stripe.kt", l = {1553}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Stripe$createToken$1 extends l implements h00.l<zz.d<? super Token>, Object> {
    final /* synthetic */ String $idempotencyKey;
    final /* synthetic */ String $stripeAccountId;
    final /* synthetic */ TokenParams $tokenParams;
    int label;
    final /* synthetic */ Stripe this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe$createToken$1(Stripe stripe, TokenParams tokenParams, String str, String str2, zz.d<? super Stripe$createToken$1> dVar) {
        super(1, dVar);
        this.this$0 = stripe;
        this.$tokenParams = tokenParams;
        this.$stripeAccountId = str;
        this.$idempotencyKey = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(zz.d<?> dVar) {
        return new Stripe$createToken$1(this.this$0, this.$tokenParams, this.$stripeAccountId, this.$idempotencyKey, dVar);
    }

    @Override // h00.l
    public final Object invoke(zz.d<? super Token> dVar) {
        return ((Stripe$createToken$1) create(dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            StripeRepository stripeRepository$payments_core_release = this.this$0.getStripeRepository$payments_core_release();
            TokenParams tokenParams = this.$tokenParams;
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.$stripeAccountId, this.$idempotencyKey);
            this.label = 1;
            obj = stripeRepository$payments_core_release.createToken$payments_core_release(tokenParams, options, this);
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