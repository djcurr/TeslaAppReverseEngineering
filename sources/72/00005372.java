package com.stripe.android.payments;

import android.content.Context;
import com.stripe.android.PaymentIntentResult;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.networking.StripeRepository;
import java.util.List;
import javax.inject.Provider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public final class PaymentIntentFlowResultProcessor extends PaymentFlowResultProcessor<PaymentIntent, PaymentIntentResult> {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_RETRIES = 3;
    private final RetryDelaySupplier retryDelaySupplier;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentIntentFlowResultProcessor(Context context, final h00.a<String> publishableKeyProvider, StripeRepository stripeRepository, Logger logger, @IOContext g workContext, RetryDelaySupplier retryDelaySupplier) {
        super(context, new Provider() { // from class: com.stripe.android.payments.a
            @Override // javax.inject.Provider
            public final Object get() {
                return PaymentIntentFlowResultProcessor.a(publishableKeyProvider);
            }
        }, stripeRepository, logger, workContext, null);
        s.g(context, "context");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(stripeRepository, "stripeRepository");
        s.g(logger, "logger");
        s.g(workContext, "workContext");
        s.g(retryDelaySupplier, "retryDelaySupplier");
        this.retryDelaySupplier = retryDelaySupplier;
    }

    /* renamed from: _init_$lambda-0 */
    public static final String m271_init_$lambda0(h00.a tmp0) {
        s.g(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    public static /* synthetic */ String a(h00.a aVar) {
        return m271_init_$lambda0(aVar);
    }

    public final RetryDelaySupplier getRetryDelaySupplier() {
        return this.retryDelaySupplier;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x00be -> B:77:0x00c1). Please submit an issue!!! */
    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object refreshStripeIntentUntilTerminalState(java.lang.String r11, com.stripe.android.core.networking.ApiRequest.Options r12, zz.d<? super com.stripe.android.model.PaymentIntent> r13) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.PaymentIntentFlowResultProcessor.refreshStripeIntentUntilTerminalState(java.lang.String, com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }

    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    public Object retrieveStripeIntent(String str, ApiRequest.Options options, List<String> list, d<? super PaymentIntent> dVar) {
        return getStripeRepository().retrievePaymentIntent(str, options, list, dVar);
    }

    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    public Object cancelStripeIntentSource(PaymentIntent paymentIntent, ApiRequest.Options options, String str, d<? super PaymentIntent> dVar) {
        StripeRepository stripeRepository = getStripeRepository();
        String id2 = paymentIntent.getId();
        if (id2 == null) {
            id2 = "";
        }
        return stripeRepository.cancelPaymentIntentSource$payments_core_release(id2, str, options, dVar);
    }

    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    public PaymentIntentResult createStripeIntentResult(PaymentIntent stripeIntent, int i11, String str) {
        s.g(stripeIntent, "stripeIntent");
        return new PaymentIntentResult(stripeIntent, i11, str);
    }
}