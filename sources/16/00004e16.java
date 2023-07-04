package com.stripe.android.googlepaylauncher;

import android.app.Application;
import androidx.lifecycle.s0;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class GooglePayLauncherActivity$viewModel$2 extends u implements h00.a<s0.b> {
    final /* synthetic */ GooglePayLauncherActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherActivity$viewModel$2(GooglePayLauncherActivity googlePayLauncherActivity) {
        super(0);
        this.this$0 = googlePayLauncherActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        GooglePayLauncherContract.Args args;
        Application application = this.this$0.getApplication();
        s.f(application, "application");
        args = this.this$0.args;
        if (args == null) {
            s.x("args");
            args = null;
        }
        return new GooglePayLauncherViewModel.Factory(application, args, false, null, 12, null);
    }
}