package com.stripe.android;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Source;
import com.stripe.android.networking.StripeRepository;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.Stripe$retrieveSourceSynchronous$1", f = "Stripe.kt", l = {1090}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Stripe$retrieveSourceSynchronous$1 extends l implements p<o0, zz.d<? super Source>, Object> {
    final /* synthetic */ String $clientSecret;
    final /* synthetic */ String $sourceId;
    final /* synthetic */ String $stripeAccountId;
    int label;
    final /* synthetic */ Stripe this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe$retrieveSourceSynchronous$1(Stripe stripe, String str, String str2, String str3, zz.d<? super Stripe$retrieveSourceSynchronous$1> dVar) {
        super(2, dVar);
        this.this$0 = stripe;
        this.$sourceId = str;
        this.$clientSecret = str2;
        this.$stripeAccountId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        return new Stripe$retrieveSourceSynchronous$1(this.this$0, this.$sourceId, this.$clientSecret, this.$stripeAccountId, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super Source> dVar) {
        return ((Stripe$retrieveSourceSynchronous$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            StripeRepository stripeRepository$payments_core_release = this.this$0.getStripeRepository$payments_core_release();
            String str = this.$sourceId;
            String str2 = this.$clientSecret;
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.$stripeAccountId, null, 4, null);
            this.label = 1;
            obj = stripeRepository$payments_core_release.retrieveSource$payments_core_release(str, str2, options, this);
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