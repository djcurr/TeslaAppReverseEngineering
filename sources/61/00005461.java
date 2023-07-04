package com.stripe.android.payments.core.injection;

import android.app.Application;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepositoryFactory;
import kotlin.jvm.internal.s;
import zz.g;

/* loaded from: classes6.dex */
public final class Stripe3dsTransactionViewModelModule {
    public final InitChallengeRepository providesInitChallengeRepository(Application application, Stripe3ds2TransactionContract.Args args, @IOContext g workContext) {
        s.g(application, "application");
        s.g(args, "args");
        s.g(workContext, "workContext");
        return new InitChallengeRepositoryFactory(application, args.getStripeIntent().isLiveMode(), args.getSdkTransactionId(), args.getConfig().getUiCustomization$payments_core_release().getUiCustomization(), args.getFingerprint().getDirectoryServerEncryption().getRootCerts(), args.getEnableLogging(), workContext).create();
    }
}