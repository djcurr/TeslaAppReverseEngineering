package com.stripe.android.googlepaylauncher;

import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class GooglePayPaymentMethodLauncherViewModel$Factory$fallbackInitialize$2 extends u implements h00.a<String> {
    final /* synthetic */ GooglePayPaymentMethodLauncherViewModel.Factory.FallbackInjectionParams $arg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayPaymentMethodLauncherViewModel$Factory$fallbackInitialize$2(GooglePayPaymentMethodLauncherViewModel.Factory.FallbackInjectionParams fallbackInjectionParams) {
        super(0);
        this.$arg = fallbackInjectionParams;
    }

    @Override // h00.a
    public final String invoke() {
        return this.$arg.getStripeAccountId();
    }
}