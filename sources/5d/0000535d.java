package com.stripe.android.networking;

import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class StripeApiRepository$updateIssuingCardPin$2 extends u implements h00.a<b0> {
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$updateIssuingCardPin$2(StripeApiRepository stripeApiRepository) {
        super(0);
        this.this$0 = stripeApiRepository;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.fireAnalyticsRequest(PaymentAnalyticsEvent.IssuingUpdatePin);
    }
}