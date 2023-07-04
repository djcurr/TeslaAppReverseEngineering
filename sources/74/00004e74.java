package com.stripe.android.googlepaylauncher;

import com.stripe.android.googlepaylauncher.StripeGooglePayViewModel;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class StripeGooglePayViewModel$Factory$create$1 extends u implements h00.a<String> {
    final /* synthetic */ StripeGooglePayViewModel.Factory this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeGooglePayViewModel$Factory$create$1(StripeGooglePayViewModel.Factory factory) {
        super(0);
        this.this$0 = factory;
    }

    @Override // h00.a
    public final String invoke() {
        String str;
        str = this.this$0.publishableKey;
        return str;
    }
}