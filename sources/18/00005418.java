package com.stripe.android.payments.core.authentication.threeds2;

import androidx.activity.result.d;
import com.stripe.android.StripePaymentController;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.view.AuthActivityStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public interface Stripe3ds2TransactionStarter extends AuthActivityStarter<Stripe3ds2TransactionContract.Args> {

    /* loaded from: classes6.dex */
    public static final class Legacy implements Stripe3ds2TransactionStarter {
        public static final int $stable = 0;
        private final AuthActivityStarterHost host;

        public Legacy(AuthActivityStarterHost host) {
            s.g(host, "host");
            this.host = host;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(Stripe3ds2TransactionContract.Args args) {
            s.g(args, "args");
            this.host.startActivityForResult(Stripe3ds2TransactionActivity.class, args.toBundle(), StripePaymentController.Companion.getRequestCode$payments_core_release(args.getStripeIntent()));
        }
    }

    /* loaded from: classes6.dex */
    public static final class Modern implements Stripe3ds2TransactionStarter {
        public static final int $stable = 8;
        private final d<Stripe3ds2TransactionContract.Args> launcher;

        public Modern(d<Stripe3ds2TransactionContract.Args> launcher) {
            s.g(launcher, "launcher");
            this.launcher = launcher;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(Stripe3ds2TransactionContract.Args args) {
            s.g(args, "args");
            this.launcher.b(args);
        }
    }
}