package com.stripe.android.payments;

import android.app.Application;
import androidx.lifecycle.s0;
import com.stripe.android.payments.StripeBrowserLauncherViewModel;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class StripeBrowserLauncherActivity$viewModel$2 extends u implements h00.a<s0.b> {
    final /* synthetic */ StripeBrowserLauncherActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeBrowserLauncherActivity$viewModel$2(StripeBrowserLauncherActivity stripeBrowserLauncherActivity) {
        super(0);
        this.this$0 = stripeBrowserLauncherActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        Application application = this.this$0.getApplication();
        s.f(application, "application");
        return new StripeBrowserLauncherViewModel.Factory(application, this.this$0);
    }
}