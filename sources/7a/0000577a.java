package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import zz.d;

@f(c = "com.stripe.android.paymentsheet.repositories.StripeIntentRepository$Api$get$2", f = "StripeIntentRepository.kt", l = {57, 62, 74, 79}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class StripeIntentRepository$Api$get$2 extends l implements p<o0, d<? super StripeIntent>, Object> {
    final /* synthetic */ ClientSecret $clientSecret;
    int label;
    final /* synthetic */ StripeIntentRepository.Api this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeIntentRepository$Api$get$2(ClientSecret clientSecret, StripeIntentRepository.Api api, d<? super StripeIntentRepository$Api$get$2> dVar) {
        super(2, dVar);
        this.$clientSecret = clientSecret;
        this.this$0 = api;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new StripeIntentRepository$Api$get$2(this.$clientSecret, this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super StripeIntent> dVar) {
        return ((StripeIntentRepository$Api$get$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
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
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.repositories.StripeIntentRepository$Api$get$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}