package com.stripe.android.core.networking;

import h00.a;
import java.io.File;
import kotlin.jvm.internal.u;

/* loaded from: classes2.dex */
final class DefaultStripeNetworkClient$executeRequestForFile$2 extends u implements a<StripeResponse<File>> {
    final /* synthetic */ File $outputFile;
    final /* synthetic */ StripeRequest $request;
    final /* synthetic */ DefaultStripeNetworkClient this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStripeNetworkClient$executeRequestForFile$2(DefaultStripeNetworkClient defaultStripeNetworkClient, StripeRequest stripeRequest, File file) {
        super(0);
        this.this$0 = defaultStripeNetworkClient;
        this.$request = stripeRequest;
        this.$outputFile = file;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final StripeResponse<File> invoke() {
        StripeResponse<File> makeRequestForFile;
        makeRequestForFile = this.this$0.makeRequestForFile(this.$request, this.$outputFile);
        return makeRequestForFile;
    }
}