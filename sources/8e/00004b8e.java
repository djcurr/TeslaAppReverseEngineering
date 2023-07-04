package com.stripe.android;

import android.os.Bundle;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.view.AuthActivityStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public interface PaymentBrowserAuthStarter extends AuthActivityStarter<PaymentBrowserAuthContract.Args> {

    /* loaded from: classes2.dex */
    public static final class Legacy implements PaymentBrowserAuthStarter {
        public static final int $stable = 0;
        private final DefaultReturnUrl defaultReturnUrl;
        private final AuthActivityStarterHost host;

        public Legacy(AuthActivityStarterHost host, DefaultReturnUrl defaultReturnUrl) {
            s.g(host, "host");
            s.g(defaultReturnUrl, "defaultReturnUrl");
            this.host = host;
            this.defaultReturnUrl = defaultReturnUrl;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(PaymentBrowserAuthContract.Args args) {
            Class<?> cls;
            s.g(args, "args");
            Bundle bundle = PaymentBrowserAuthContract.Args.copy$default(args, null, 0, null, null, null, false, null, null, false, false, this.host.getStatusBarColor$payments_core_release(), null, false, 7167, null).toBundle();
            AuthActivityStarterHost authActivityStarterHost = this.host;
            boolean z11 = args.hasDefaultReturnUrl$payments_core_release(this.defaultReturnUrl) || args.isInstantApp();
            if (z11) {
                cls = StripeBrowserLauncherActivity.class;
            } else if (!z11) {
                cls = PaymentAuthWebViewActivity.class;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            authActivityStarterHost.startActivityForResult(cls, bundle, args.getRequestCode());
        }
    }

    /* loaded from: classes2.dex */
    public static final class Modern implements PaymentBrowserAuthStarter {
        public static final int $stable = 8;
        private final androidx.activity.result.d<PaymentBrowserAuthContract.Args> launcher;

        public Modern(androidx.activity.result.d<PaymentBrowserAuthContract.Args> launcher) {
            s.g(launcher, "launcher");
            this.launcher = launcher;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(PaymentBrowserAuthContract.Args args) {
            s.g(args, "args");
            this.launcher.b(args);
        }
    }
}