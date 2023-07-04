package com.stripe.android.core.networking;

import h00.a;
import kotlin.jvm.internal.u;

/* loaded from: classes2.dex */
final class DefaultStripeNetworkClient$executeRequest$2 extends u implements a<StripeResponse<String>> {
    final /* synthetic */ StripeRequest $request;
    final /* synthetic */ DefaultStripeNetworkClient this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStripeNetworkClient$executeRequest$2(DefaultStripeNetworkClient defaultStripeNetworkClient, StripeRequest stripeRequest) {
        super(0);
        this.this$0 = defaultStripeNetworkClient;
        this.$request = stripeRequest;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final StripeResponse<String> invoke() {
        StripeResponse<String> makeRequest;
        makeRequest = this.this$0.makeRequest(this.$request);
        return makeRequest;
    }
}