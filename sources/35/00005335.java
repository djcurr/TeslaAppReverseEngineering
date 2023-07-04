package com.stripe.android.networking;

import com.stripe.android.core.networking.RequestId;
import h00.l;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class StripeApiRepository$createFile$response$1 extends u implements l<RequestId, b0> {
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$createFile$response$1(StripeApiRepository stripeApiRepository) {
        super(1);
        this.this$0 = stripeApiRepository;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(RequestId requestId) {
        invoke2(requestId);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(RequestId requestId) {
        this.this$0.fireAnalyticsRequest(PaymentAnalyticsEvent.FileCreate);
    }
}