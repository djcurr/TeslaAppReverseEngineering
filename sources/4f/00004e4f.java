package com.stripe.android.googlepaylauncher;

import android.app.Application;
import androidx.lifecycle.s0;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class GooglePayPaymentMethodLauncherActivity$viewModel$2 extends u implements h00.a<s0.b> {
    final /* synthetic */ GooglePayPaymentMethodLauncherActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayPaymentMethodLauncherActivity$viewModel$2(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity) {
        super(0);
        this.this$0 = googlePayPaymentMethodLauncherActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        GooglePayPaymentMethodLauncherContract.Args args;
        Application application = this.this$0.getApplication();
        s.f(application, "application");
        args = this.this$0.args;
        if (args == null) {
            s.x("args");
            args = null;
        }
        return new GooglePayPaymentMethodLauncherViewModel.Factory(application, args, this.this$0, null, 8, null);
    }
}