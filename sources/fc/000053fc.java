package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.i;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public final class DefaultStripe3ds2ChallengeResultProcessor implements Stripe3ds2ChallengeResultProcessor {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int MAX_RETRIES = 3;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final Logger logger;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final RetryDelaySupplier retryDelaySupplier;
    private final StripeRepository stripeRepository;
    private final g workContext;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultStripe3ds2ChallengeResultProcessor(StripeRepository stripeRepository, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, RetryDelaySupplier retryDelaySupplier, Logger logger, @IOContext g workContext) {
        s.g(stripeRepository, "stripeRepository");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(retryDelaySupplier, "retryDelaySupplier");
        s.g(logger, "logger");
        s.g(workContext, "workContext");
        this.stripeRepository = stripeRepository;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.retryDelaySupplier = retryDelaySupplier;
        this.logger = logger;
        this.workContext = workContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object complete3ds2Auth(com.stripe.android.stripe3ds2.transaction.ChallengeResult r8, com.stripe.android.core.networking.ApiRequest.Options r9, int r10, zz.d<? super java.lang.Boolean> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1
            if (r0 == 0) goto L13
            r0 = r11
            com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1 r0 = (com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1 r0 = new com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1
            r0.<init>(r7, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.result
            java.lang.Object r0 = a00.b.d()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4b
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            vz.r.b(r11)
            goto Lbc
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            int r10 = r6.I$0
            java.lang.Object r8 = r6.L$2
            r9 = r8
            com.stripe.android.core.networking.ApiRequest$Options r9 = (com.stripe.android.core.networking.ApiRequest.Options) r9
            java.lang.Object r8 = r6.L$1
            com.stripe.android.stripe3ds2.transaction.ChallengeResult r8 = (com.stripe.android.stripe3ds2.transaction.ChallengeResult) r8
            java.lang.Object r1 = r6.L$0
            com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor r1 = (com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor) r1
            vz.r.b(r11)     // Catch: java.lang.Throwable -> L49
            goto L6c
        L49:
            r11 = move-exception
            goto L75
        L4b:
            vz.r.b(r11)
            vz.q$a r11 = vz.q.f54772b     // Catch: java.lang.Throwable -> L73
            com.stripe.android.networking.StripeRepository r11 = r7.stripeRepository     // Catch: java.lang.Throwable -> L73
            com.stripe.android.stripe3ds2.transaction.IntentData r1 = r8.getIntentData()     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = r1.getSourceId()     // Catch: java.lang.Throwable -> L73
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L73
            r6.L$1 = r8     // Catch: java.lang.Throwable -> L73
            r6.L$2 = r9     // Catch: java.lang.Throwable -> L73
            r6.I$0 = r10     // Catch: java.lang.Throwable -> L73
            r6.label = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r11 = r11.complete3ds2Auth$payments_core_release(r1, r9, r6)     // Catch: java.lang.Throwable -> L73
            if (r11 != r0) goto L6b
            return r0
        L6b:
            r1 = r7
        L6c:
            com.stripe.android.model.Stripe3ds2AuthResult r11 = (com.stripe.android.model.Stripe3ds2AuthResult) r11     // Catch: java.lang.Throwable -> L49
            java.lang.Object r11 = vz.q.b(r11)     // Catch: java.lang.Throwable -> L49
            goto L7f
        L73:
            r11 = move-exception
            r1 = r7
        L75:
            vz.q$a r4 = vz.q.f54772b
            java.lang.Object r11 = vz.r.a(r11)
            java.lang.Object r11 = vz.q.b(r11)
        L7f:
            r4 = r10
            java.lang.Throwable r5 = vz.q.e(r11)
            if (r5 != 0) goto Laa
            com.stripe.android.model.Stripe3ds2AuthResult r11 = (com.stripe.android.model.Stripe3ds2AuthResult) r11
            int r8 = 3 - r4
            com.stripe.android.core.Logger r9 = r1.logger
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "3DS2 challenge completion request was successful. "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = " retries attempted."
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.debug(r8)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r3)
            goto Lc6
        Laa:
            r10 = 0
            r6.L$0 = r10
            r6.L$1 = r10
            r6.L$2 = r10
            r6.label = r2
            r2 = r8
            r3 = r9
            java.lang.Object r11 = r1.onComplete3ds2AuthFailure(r2, r3, r4, r5, r6)
            if (r11 != r0) goto Lbc
            return r0
        Lbc:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r8 = r11.booleanValue()
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r8)
        Lc6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor.complete3ds2Auth(com.stripe.android.stripe3ds2.transaction.ChallengeResult, com.stripe.android.core.networking.ApiRequest$Options, int, zz.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object complete3ds2Auth$default(DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor, ChallengeResult challengeResult, ApiRequest.Options options, int i11, d dVar, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 3;
        }
        return defaultStripe3ds2ChallengeResultProcessor.complete3ds2Auth(challengeResult, options, i11, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a A[PHI: r11 
      PHI: (r11v7 java.lang.Object) = (r11v6 java.lang.Object), (r11v1 java.lang.Object) binds: [B:30:0x0097, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onComplete3ds2AuthFailure(com.stripe.android.stripe3ds2.transaction.ChallengeResult r7, com.stripe.android.core.networking.ApiRequest.Options r8, int r9, java.lang.Throwable r10, zz.d<? super java.lang.Boolean> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1
            if (r0 == 0) goto L13
            r0 = r11
            com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1 r0 = (com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1 r0 = new com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            vz.r.b(r11)
            goto L9a
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            int r9 = r0.I$0
            java.lang.Object r7 = r0.L$2
            r8 = r7
            com.stripe.android.core.networking.ApiRequest$Options r8 = (com.stripe.android.core.networking.ApiRequest.Options) r8
            java.lang.Object r7 = r0.L$1
            com.stripe.android.stripe3ds2.transaction.ChallengeResult r7 = (com.stripe.android.stripe3ds2.transaction.ChallengeResult) r7
            java.lang.Object r10 = r0.L$0
            com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor r10 = (com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor) r10
            vz.r.b(r11)
            goto L89
        L48:
            vz.r.b(r11)
            com.stripe.android.core.Logger r11 = r6.logger
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.c(r9)
            java.lang.String r5 = "3DS2 challenge completion request failed. Remaining retries: "
            java.lang.String r2 = kotlin.jvm.internal.s.p(r5, r2)
            r11.error(r2, r10)
            boolean r11 = r10 instanceof com.stripe.android.core.exception.StripeException
            r2 = 0
            if (r11 == 0) goto L66
            com.stripe.android.core.exception.StripeException r10 = (com.stripe.android.core.exception.StripeException) r10
            boolean r10 = r10.isClientError()
            goto L67
        L66:
            r10 = r2
        L67:
            if (r9 <= 0) goto L6d
            if (r10 == 0) goto L6d
            r10 = r4
            goto L6e
        L6d:
            r10 = r2
        L6e:
            if (r10 == 0) goto L9b
            com.stripe.android.core.networking.RetryDelaySupplier r10 = r6.retryDelaySupplier
            r11 = 3
            long r10 = r10.getDelayMillis(r11, r9)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.I$0 = r9
            r0.label = r4
            java.lang.Object r10 = v20.y0.b(r10, r0)
            if (r10 != r1) goto L88
            return r1
        L88:
            r10 = r6
        L89:
            int r9 = r9 - r4
            r11 = 0
            r0.L$0 = r11
            r0.L$1 = r11
            r0.L$2 = r11
            r0.label = r3
            java.lang.Object r11 = r10.complete3ds2Auth(r7, r8, r9, r0)
            if (r11 != r1) goto L9a
            return r1
        L9a:
            return r11
        L9b:
            com.stripe.android.core.Logger r7 = r6.logger
            java.lang.String r8 = "Did not make a successful 3DS2 challenge completion request after retrying."
            r7.debug(r8)
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor.onComplete3ds2AuthFailure(com.stripe.android.stripe3ds2.transaction.ChallengeResult, com.stripe.android.core.networking.ApiRequest$Options, int, java.lang.Throwable, zz.d):java.lang.Object");
    }

    @Override // com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2ChallengeResultProcessor
    public Object process(ChallengeResult challengeResult, d<? super PaymentFlowResult.Unvalidated> dVar) {
        return i.g(this.workContext, new DefaultStripe3ds2ChallengeResultProcessor$process$2(challengeResult, this, null), dVar);
    }
}