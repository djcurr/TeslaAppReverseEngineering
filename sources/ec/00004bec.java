package com.stripe.android;

import com.stripe.android.core.model.StripeFile;
import com.stripe.android.core.model.StripeFileParams;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.Stripe$createFile$1", f = "Stripe.kt", l = {1582}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Stripe$createFile$1 extends l implements h00.l<zz.d<? super StripeFile>, Object> {
    final /* synthetic */ StripeFileParams $fileParams;
    final /* synthetic */ String $idempotencyKey;
    final /* synthetic */ String $stripeAccountId;
    int label;
    final /* synthetic */ Stripe this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe$createFile$1(Stripe stripe, StripeFileParams stripeFileParams, String str, String str2, zz.d<? super Stripe$createFile$1> dVar) {
        super(1, dVar);
        this.this$0 = stripe;
        this.$fileParams = stripeFileParams;
        this.$stripeAccountId = str;
        this.$idempotencyKey = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(zz.d<?> dVar) {
        return new Stripe$createFile$1(this.this$0, this.$fileParams, this.$stripeAccountId, this.$idempotencyKey, dVar);
    }

    @Override // h00.l
    public final Object invoke(zz.d<? super StripeFile> dVar) {
        return ((Stripe$createFile$1) create(dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            StripeRepository stripeRepository$payments_core_release = this.this$0.getStripeRepository$payments_core_release();
            StripeFileParams stripeFileParams = this.$fileParams;
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.$stripeAccountId, this.$idempotencyKey);
            this.label = 1;
            obj = stripeRepository$payments_core_release.createFile$payments_core_release(stripeFileParams, options, this);
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