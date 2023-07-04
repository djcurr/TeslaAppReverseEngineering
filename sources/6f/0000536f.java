package com.stripe.android.payments;

import android.content.Context;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.StripeIntentKtxKt;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.PaymentFlowResult;
import java.util.List;
import javax.inject.Provider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v20.i;
import wz.v;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public abstract class PaymentFlowResultProcessor<T extends StripeIntent, S extends StripeIntentResult<? extends T>> {
    public static final Companion Companion = new Companion(null);
    private static final List<String> EXPAND_PAYMENT_METHOD;
    private final PaymentFlowFailureMessageFactory failureMessageFactory;
    private final Logger logger;
    private final Provider<String> publishableKeyProvider;
    private final StripeRepository stripeRepository;
    private final g workContext;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<String> getEXPAND_PAYMENT_METHOD() {
            return PaymentFlowResultProcessor.EXPAND_PAYMENT_METHOD;
        }
    }

    static {
        List<String> d11;
        d11 = v.d("payment_method");
        EXPAND_PAYMENT_METHOD = d11;
    }

    private PaymentFlowResultProcessor(Context context, Provider<String> provider, StripeRepository stripeRepository, Logger logger, g gVar) {
        this.publishableKeyProvider = provider;
        this.stripeRepository = stripeRepository;
        this.logger = logger;
        this.workContext = gVar;
        this.failureMessageFactory = new PaymentFlowFailureMessageFactory(context);
    }

    public /* synthetic */ PaymentFlowResultProcessor(Context context, Provider provider, StripeRepository stripeRepository, Logger logger, g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, provider, stripeRepository, logger, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldCancelIntentSource(StripeIntent stripeIntent, boolean z11) {
        return z11 && stripeIntent.requiresAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldRefreshIntent(StripeIntent stripeIntent, int i11) {
        return i11 == 1 && StripeIntentKtxKt.shouldRefresh(stripeIntent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object cancelStripeIntentSource(T t11, ApiRequest.Options options, String str, d<? super T> dVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract S createStripeIntentResult(T t11, int i11, String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final StripeRepository getStripeRepository() {
        return this.stripeRepository;
    }

    public final Object processResult(PaymentFlowResult.Unvalidated unvalidated, d<? super S> dVar) {
        return i.g(this.workContext, new PaymentFlowResultProcessor$processResult$2(unvalidated, this, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object refreshStripeIntentUntilTerminalState(String str, ApiRequest.Options options, d<? super T> dVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object retrieveStripeIntent(String str, ApiRequest.Options options, List<String> list, d<? super T> dVar);
}