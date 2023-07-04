package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transactions.UiType;
import h00.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$process$2", f = "Stripe3ds2ChallengeResultProcessor.kt", l = {95}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class DefaultStripe3ds2ChallengeResultProcessor$process$2 extends l implements p<o0, d<? super PaymentFlowResult.Unvalidated>, Object> {
    final /* synthetic */ ChallengeResult $challengeResult;
    Object L$0;
    int label;
    final /* synthetic */ DefaultStripe3ds2ChallengeResultProcessor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStripe3ds2ChallengeResultProcessor$process$2(ChallengeResult challengeResult, DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor, d<? super DefaultStripe3ds2ChallengeResultProcessor$process$2> dVar) {
        super(2, dVar);
        this.$challengeResult = challengeResult;
        this.this$0 = defaultStripe3ds2ChallengeResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new DefaultStripe3ds2ChallengeResultProcessor$process$2(this.$challengeResult, this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super PaymentFlowResult.Unvalidated> dVar) {
        return ((DefaultStripe3ds2ChallengeResultProcessor$process$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        AnalyticsRequestExecutor analyticsRequestExecutor;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
        AnalyticsRequestExecutor analyticsRequestExecutor2;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory2;
        AnalyticsRequestExecutor analyticsRequestExecutor3;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory3;
        AnalyticsRequestExecutor analyticsRequestExecutor4;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory4;
        AnalyticsRequestExecutor analyticsRequestExecutor5;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory5;
        AnalyticsRequestExecutor analyticsRequestExecutor6;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory6;
        ApiRequest.Options options;
        AnalyticsRequestExecutor analyticsRequestExecutor7;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory7;
        d11 = a00.d.d();
        int i11 = this.label;
        int i12 = 1;
        if (i11 == 0) {
            r.b(obj);
            ChallengeResult challengeResult = this.$challengeResult;
            if (challengeResult instanceof ChallengeResult.Succeeded) {
                analyticsRequestExecutor7 = this.this$0.analyticsRequestExecutor;
                paymentAnalyticsRequestFactory7 = this.this$0.paymentAnalyticsRequestFactory;
                analyticsRequestExecutor7.executeAsync(paymentAnalyticsRequestFactory7.create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent.Auth3ds2ChallengeCompleted, ((ChallengeResult.Succeeded) this.$challengeResult).getUiTypeCode()));
            } else if (challengeResult instanceof ChallengeResult.Failed) {
                analyticsRequestExecutor5 = this.this$0.analyticsRequestExecutor;
                paymentAnalyticsRequestFactory5 = this.this$0.paymentAnalyticsRequestFactory;
                analyticsRequestExecutor5.executeAsync(paymentAnalyticsRequestFactory5.create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent.Auth3ds2ChallengeCompleted, ((ChallengeResult.Failed) this.$challengeResult).getUiTypeCode()));
            } else if (challengeResult instanceof ChallengeResult.Canceled) {
                analyticsRequestExecutor4 = this.this$0.analyticsRequestExecutor;
                paymentAnalyticsRequestFactory4 = this.this$0.paymentAnalyticsRequestFactory;
                analyticsRequestExecutor4.executeAsync(paymentAnalyticsRequestFactory4.create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent.Auth3ds2ChallengeCanceled, ((ChallengeResult.Canceled) this.$challengeResult).getUiTypeCode()));
            } else if (challengeResult instanceof ChallengeResult.ProtocolError) {
                analyticsRequestExecutor3 = this.this$0.analyticsRequestExecutor;
                paymentAnalyticsRequestFactory3 = this.this$0.paymentAnalyticsRequestFactory;
                analyticsRequestExecutor3.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(paymentAnalyticsRequestFactory3, PaymentAnalyticsEvent.Auth3ds2ChallengeErrored, null, null, null, null, 30, null));
            } else if (challengeResult instanceof ChallengeResult.RuntimeError) {
                analyticsRequestExecutor2 = this.this$0.analyticsRequestExecutor;
                paymentAnalyticsRequestFactory2 = this.this$0.paymentAnalyticsRequestFactory;
                analyticsRequestExecutor2.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(paymentAnalyticsRequestFactory2, PaymentAnalyticsEvent.Auth3ds2ChallengeErrored, null, null, null, null, 30, null));
            } else if (challengeResult instanceof ChallengeResult.Timeout) {
                analyticsRequestExecutor = this.this$0.analyticsRequestExecutor;
                paymentAnalyticsRequestFactory = this.this$0.paymentAnalyticsRequestFactory;
                analyticsRequestExecutor.executeAsync(paymentAnalyticsRequestFactory.create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent.Auth3ds2ChallengeTimedOut, ((ChallengeResult.Timeout) this.$challengeResult).getUiTypeCode()));
            }
            analyticsRequestExecutor6 = this.this$0.analyticsRequestExecutor;
            paymentAnalyticsRequestFactory6 = this.this$0.paymentAnalyticsRequestFactory;
            PaymentAnalyticsEvent paymentAnalyticsEvent = PaymentAnalyticsEvent.Auth3ds2ChallengePresented;
            UiType initialUiType = this.$challengeResult.getInitialUiType();
            String code = initialUiType == null ? null : initialUiType.getCode();
            if (code == null) {
                code = "";
            }
            analyticsRequestExecutor6.executeAsync(paymentAnalyticsRequestFactory6.create3ds2Challenge$payments_core_release(paymentAnalyticsEvent, code));
            ApiRequest.Options options2 = new ApiRequest.Options(this.$challengeResult.getIntentData().getPublishableKey(), this.$challengeResult.getIntentData().getAccountId(), null, 4, null);
            DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor = this.this$0;
            ChallengeResult challengeResult2 = this.$challengeResult;
            this.L$0 = options2;
            this.label = 1;
            Object complete3ds2Auth$default = DefaultStripe3ds2ChallengeResultProcessor.complete3ds2Auth$default(defaultStripe3ds2ChallengeResultProcessor, challengeResult2, options2, 0, this, 4, null);
            if (complete3ds2Auth$default == d11) {
                return d11;
            }
            options = options2;
            obj = complete3ds2Auth$default;
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            options = (ApiRequest.Options) this.L$0;
            r.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            ChallengeResult challengeResult3 = this.$challengeResult;
            if (!(challengeResult3 instanceof ChallengeResult.Succeeded)) {
                if (!(challengeResult3 instanceof ChallengeResult.Failed)) {
                    if (challengeResult3 instanceof ChallengeResult.Canceled) {
                        i12 = 3;
                    } else if (!(challengeResult3 instanceof ChallengeResult.ProtocolError) && !(challengeResult3 instanceof ChallengeResult.RuntimeError)) {
                        if (!(challengeResult3 instanceof ChallengeResult.Timeout)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i12 = 4;
                    }
                }
            }
            return new PaymentFlowResult.Unvalidated(this.$challengeResult.getIntentData().getClientSecret(), i12, null, false, null, null, options.getStripeAccount(), 60, null);
        }
        i12 = 2;
        return new PaymentFlowResult.Unvalidated(this.$challengeResult.getIntentData().getClientSecret(), i12, null, false, null, null, options.getStripeAccount(), 60, null);
    }
}