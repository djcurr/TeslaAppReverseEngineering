package com.stripe.android.payments;

import android.content.Context;
import com.stripe.android.SetupIntentResult;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.networking.StripeRepository;
import java.util.List;
import javax.inject.Provider;
import kotlin.jvm.internal.s;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public final class SetupIntentFlowResultProcessor extends PaymentFlowResultProcessor<SetupIntent, SetupIntentResult> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupIntentFlowResultProcessor(Context context, final h00.a<String> publishableKeyProvider, StripeRepository stripeRepository, Logger logger, @IOContext g workContext) {
        super(context, new Provider() { // from class: com.stripe.android.payments.b
            @Override // javax.inject.Provider
            public final Object get() {
                return SetupIntentFlowResultProcessor.a(publishableKeyProvider);
            }
        }, stripeRepository, logger, workContext, null);
        s.g(context, "context");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(stripeRepository, "stripeRepository");
        s.g(logger, "logger");
        s.g(workContext, "workContext");
    }

    /* renamed from: _init_$lambda-0 */
    public static final String m272_init_$lambda0(h00.a tmp0) {
        s.g(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    public static /* synthetic */ String a(h00.a aVar) {
        return m272_init_$lambda0(aVar);
    }

    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    public Object refreshStripeIntentUntilTerminalState(String str, ApiRequest.Options options, d<? super SetupIntent> dVar) {
        throw new InvalidRequestException(null, null, 0, s.p("refresh endpoint is not available for SetupIntent. client_secret: ", str), null, 23, null);
    }

    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    public Object retrieveStripeIntent(String str, ApiRequest.Options options, List<String> list, d<? super SetupIntent> dVar) {
        return getStripeRepository().retrieveSetupIntent(str, options, list, dVar);
    }

    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    public Object cancelStripeIntentSource(SetupIntent setupIntent, ApiRequest.Options options, String str, d<? super SetupIntent> dVar) {
        StripeRepository stripeRepository = getStripeRepository();
        String id2 = setupIntent.getId();
        if (id2 == null) {
            id2 = "";
        }
        return stripeRepository.cancelSetupIntentSource$payments_core_release(id2, str, options, dVar);
    }

    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    public SetupIntentResult createStripeIntentResult(SetupIntent stripeIntent, int i11, String str) {
        s.g(stripeIntent, "stripeIntent");
        return new SetupIntentResult(stripeIntent, i11, str);
    }
}