package com.stripe.android.view;

import android.app.Application;
import androidx.lifecycle.s0;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.Logger;
import com.stripe.android.view.PaymentAuthWebViewActivityViewModel;

/* loaded from: classes6.dex */
final class PaymentAuthWebViewActivity$viewModel$2 extends kotlin.jvm.internal.u implements h00.a<s0.b> {
    final /* synthetic */ PaymentAuthWebViewActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebViewActivity$viewModel$2(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
        super(0);
        this.this$0 = paymentAuthWebViewActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        Logger logger;
        PaymentBrowserAuthContract.Args args;
        Application application = this.this$0.getApplication();
        kotlin.jvm.internal.s.f(application, "application");
        logger = this.this$0.getLogger();
        args = this.this$0.get_args();
        if (args != null) {
            return new PaymentAuthWebViewActivityViewModel.Factory(application, logger, args);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}