package com.stripe.android.googlepaylauncher;

import android.app.Application;
import androidx.lifecycle.s0;
import com.stripe.android.googlepaylauncher.StripeGooglePayContract;
import com.stripe.android.googlepaylauncher.StripeGooglePayViewModel;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class StripeGooglePayActivity$viewModel$2 extends u implements h00.a<s0.b> {
    final /* synthetic */ StripeGooglePayActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeGooglePayActivity$viewModel$2(StripeGooglePayActivity stripeGooglePayActivity) {
        super(0);
        this.this$0 = stripeGooglePayActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        String publishableKey;
        String stripeAccountId;
        StripeGooglePayContract.Args args;
        Application application = this.this$0.getApplication();
        s.f(application, "application");
        publishableKey = this.this$0.getPublishableKey();
        stripeAccountId = this.this$0.getStripeAccountId();
        args = this.this$0.args;
        if (args == null) {
            s.x("args");
            args = null;
        }
        return new StripeGooglePayViewModel.Factory(application, publishableKey, stripeAccountId, args);
    }
}