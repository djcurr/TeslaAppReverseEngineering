package com.stripe.android;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.RadarSession;
import com.stripe.android.networking.StripeRepository;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.Stripe$createRadarSession$1", f = "Stripe.kt", l = {1638}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Stripe$createRadarSession$1 extends l implements h00.l<zz.d<? super RadarSession>, Object> {
    final /* synthetic */ String $stripeAccountId;
    int label;
    final /* synthetic */ Stripe this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe$createRadarSession$1(Stripe stripe, String str, zz.d<? super Stripe$createRadarSession$1> dVar) {
        super(1, dVar);
        this.this$0 = stripe;
        this.$stripeAccountId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(zz.d<?> dVar) {
        return new Stripe$createRadarSession$1(this.this$0, this.$stripeAccountId, dVar);
    }

    @Override // h00.l
    public final Object invoke(zz.d<? super RadarSession> dVar) {
        return ((Stripe$createRadarSession$1) create(dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            StripeRepository stripeRepository$payments_core_release = this.this$0.getStripeRepository$payments_core_release();
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.$stripeAccountId, null, 4, null);
            this.label = 1;
            obj = stripeRepository$payments_core_release.createRadarSession$payments_core_release(options, this);
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