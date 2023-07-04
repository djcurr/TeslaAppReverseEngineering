package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2ChallengeResultProcessor;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import zz.g;

/* loaded from: classes6.dex */
public abstract class Stripe3ds2TransactionModule {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MessageVersionRegistry provideMessageVersionRegistry() {
            return new MessageVersionRegistry();
        }

        public final StripeThreeDs2Service provideStripeThreeDs2Service(Context context, boolean z11, @IOContext g workContext) {
            s.g(context, "context");
            s.g(workContext, "workContext");
            return new StripeThreeDs2ServiceImpl(context, z11, workContext);
        }
    }

    public abstract Stripe3ds2ChallengeResultProcessor bindsStripe3ds2ChallengeResultProcessor(DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor);
}