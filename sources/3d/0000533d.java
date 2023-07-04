package com.stripe.android.networking;

import com.stripe.android.model.TokenParams;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class StripeApiRepository$createToken$2 extends u implements h00.a<b0> {
    final /* synthetic */ TokenParams $tokenParams;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$createToken$2(StripeApiRepository stripeApiRepository, TokenParams tokenParams) {
        super(0);
        this.this$0 = stripeApiRepository;
        this.$tokenParams = tokenParams;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
        StripeApiRepository stripeApiRepository = this.this$0;
        paymentAnalyticsRequestFactory = stripeApiRepository.paymentAnalyticsRequestFactory;
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(paymentAnalyticsRequestFactory.createTokenCreation$payments_core_release(this.$tokenParams.getAttribution(), this.$tokenParams.getTokenType()));
    }
}