package com.stripe.android.payments.core.authentication.threeds2;

import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import com.stripe.android.StripePaymentController;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.authentication.threeds2.NextStep;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.InitChallengeArgs;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import com.stripe.android.stripe3ds2.transaction.InitChallengeResult;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.i;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionViewModel extends p0 {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String KEY_HAS_COMPLETED = "key_next_step";
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final Stripe3ds2TransactionContract.Args args;
    private final Stripe3ds2ChallengeResultProcessor challengeResultProcessor;
    private boolean hasCompleted;
    private final InitChallengeRepository initChallengeRepository;
    private final boolean isInstantApp;
    private final MessageVersionRegistry messageVersionRegistry;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final l0 savedStateHandle;
    private final StripeRepository stripeRepository;
    private final StripeThreeDs2Service threeDs2Service;
    private final g workContext;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Stripe3ds2TransactionViewModel(Stripe3ds2TransactionContract.Args args, StripeRepository stripeRepository, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, StripeThreeDs2Service threeDs2Service, MessageVersionRegistry messageVersionRegistry, Stripe3ds2ChallengeResultProcessor challengeResultProcessor, InitChallengeRepository initChallengeRepository, @IOContext g workContext, l0 savedStateHandle, boolean z11) {
        s.g(args, "args");
        s.g(stripeRepository, "stripeRepository");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(threeDs2Service, "threeDs2Service");
        s.g(messageVersionRegistry, "messageVersionRegistry");
        s.g(challengeResultProcessor, "challengeResultProcessor");
        s.g(initChallengeRepository, "initChallengeRepository");
        s.g(workContext, "workContext");
        s.g(savedStateHandle, "savedStateHandle");
        this.args = args;
        this.stripeRepository = stripeRepository;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.threeDs2Service = threeDs2Service;
        this.messageVersionRegistry = messageVersionRegistry;
        this.challengeResultProcessor = challengeResultProcessor;
        this.initChallengeRepository = initChallengeRepository;
        this.workContext = workContext;
        this.savedStateHandle = savedStateHandle;
        this.isInstantApp = z11;
        this.hasCompleted = savedStateHandle.a(KEY_HAS_COMPLETED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object begin3ds2Auth(com.stripe.android.model.Stripe3ds2Fingerprint r26, zz.d<? super com.stripe.android.payments.core.authentication.threeds2.NextStep> r27) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel.begin3ds2Auth(com.stripe.android.model.Stripe3ds2Fingerprint, zz.d):java.lang.Object");
    }

    private final NextStep on3ds2AuthFallback(String str) {
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Fallback, null, null, null, null, 30, null));
        String id2 = this.args.getStripeIntent().getId();
        String str2 = id2 == null ? "" : id2;
        int requestCode$payments_core_release = StripePaymentController.Companion.getRequestCode$payments_core_release(this.args.getStripeIntent());
        String clientSecret = this.args.getStripeIntent().getClientSecret();
        return new NextStep.StartFallback(new PaymentBrowserAuthContract.Args(str2, requestCode$payments_core_release, clientSecret == null ? "" : clientSecret, str, null, this.args.getEnableLogging(), null, this.args.getRequestOptions().getStripeAccount(), true, false, null, this.args.getPublishableKey(), this.isInstantApp, 1600, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object perform3ds2AuthenticationRequest(Transaction transaction, Stripe3ds2Fingerprint stripe3ds2Fingerprint, ApiRequest.Options options, int i11, d<? super Stripe3ds2AuthResult> dVar) {
        return i.g(this.workContext, new Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$2(transaction, stripe3ds2Fingerprint, i11, this, options, null), dVar);
    }

    private final NextStep startFrictionlessFlow() {
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Frictionless, null, null, null, null, 30, null));
        return new NextStep.Complete(new PaymentFlowResult.Unvalidated(this.args.getStripeIntent().getClientSecret(), 0, null, false, null, null, this.args.getRequestOptions().getStripeAccount(), 62, null));
    }

    public final boolean getHasCompleted() {
        return this.hasCompleted;
    }

    public final Object initChallenge(InitChallengeArgs initChallengeArgs, d<? super InitChallengeResult> dVar) {
        return this.initChallengeRepository.startChallenge(initChallengeArgs, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object on3ds2AuthSuccess$payments_core_release(com.stripe.android.model.Stripe3ds2AuthResult r11, com.stripe.android.stripe3ds2.transaction.Transaction r12, java.lang.String r13, int r14, zz.d<? super com.stripe.android.payments.core.authentication.threeds2.NextStep> r15) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel.on3ds2AuthSuccess$payments_core_release(com.stripe.android.model.Stripe3ds2AuthResult, com.stripe.android.stripe3ds2.transaction.Transaction, java.lang.String, int, zz.d):java.lang.Object");
    }

    public final Object processChallengeResult(ChallengeResult challengeResult, d<? super PaymentFlowResult.Unvalidated> dVar) {
        return this.challengeResultProcessor.process(challengeResult, dVar);
    }

    public final void setHasCompleted(boolean z11) {
        this.hasCompleted = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object start3ds2Flow(zz.d<? super com.stripe.android.payments.core.authentication.threeds2.NextStep> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$start3ds2Flow$1
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$start3ds2Flow$1 r0 = (com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$start3ds2Flow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$start3ds2Flow$1 r0 = new com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$start3ds2Flow$1
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.L$0
            com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel r0 = (com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel) r0
            vz.r.b(r15)     // Catch: java.lang.Throwable -> L2d
            goto L67
        L2d:
            r15 = move-exception
            goto L70
        L2f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L37:
            vz.r.b(r15)
            com.stripe.android.core.networking.AnalyticsRequestExecutor r15 = r14.analyticsRequestExecutor
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r4 = r14.paymentAnalyticsRequestFactory
            com.stripe.android.networking.PaymentAnalyticsEvent r5 = com.stripe.android.networking.PaymentAnalyticsEvent.Auth3ds2Fingerprint
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 30
            r11 = 0
            com.stripe.android.core.networking.AnalyticsRequest r2 = com.stripe.android.networking.PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(r4, r5, r6, r7, r8, r9, r10, r11)
            r15.executeAsync(r2)
            vz.q$a r15 = vz.q.f54772b     // Catch: java.lang.Throwable -> L6e
            com.stripe.android.model.Stripe3ds2Fingerprint r15 = new com.stripe.android.model.Stripe3ds2Fingerprint     // Catch: java.lang.Throwable -> L6e
            com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract$Args r2 = r14.args     // Catch: java.lang.Throwable -> L6e
            com.stripe.android.model.StripeIntent$NextActionData$SdkData$Use3DS2 r2 = r2.getNextActionData()     // Catch: java.lang.Throwable -> L6e
            r15.<init>(r2)     // Catch: java.lang.Throwable -> L6e
            r0.L$0 = r14     // Catch: java.lang.Throwable -> L6e
            r0.label = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r15 = r14.begin3ds2Auth(r15, r0)     // Catch: java.lang.Throwable -> L6e
            if (r15 != r1) goto L66
            return r1
        L66:
            r0 = r14
        L67:
            com.stripe.android.payments.core.authentication.threeds2.NextStep r15 = (com.stripe.android.payments.core.authentication.threeds2.NextStep) r15     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r15 = vz.q.b(r15)     // Catch: java.lang.Throwable -> L2d
            goto L7a
        L6e:
            r15 = move-exception
            r0 = r14
        L70:
            vz.q$a r1 = vz.q.f54772b
            java.lang.Object r15 = vz.r.a(r15)
            java.lang.Object r15 = vz.q.b(r15)
        L7a:
            java.lang.Throwable r1 = vz.q.e(r15)
            if (r1 != 0) goto L81
            goto Lad
        L81:
            com.stripe.android.core.networking.AnalyticsRequestExecutor r15 = r0.analyticsRequestExecutor
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r4 = r0.paymentAnalyticsRequestFactory
            com.stripe.android.networking.PaymentAnalyticsEvent r5 = com.stripe.android.networking.PaymentAnalyticsEvent.Auth3ds2RequestParamsFailed
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 30
            r11 = 0
            com.stripe.android.core.networking.AnalyticsRequest r2 = com.stripe.android.networking.PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(r4, r5, r6, r7, r8, r9, r10, r11)
            r15.executeAsync(r2)
            com.stripe.android.payments.core.authentication.threeds2.NextStep$Complete r15 = new com.stripe.android.payments.core.authentication.threeds2.NextStep$Complete
            com.stripe.android.payments.PaymentFlowResult$Unvalidated r2 = new com.stripe.android.payments.PaymentFlowResult$Unvalidated
            r5 = 0
            r6 = 0
            com.stripe.android.core.exception.StripeException$Companion r4 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r7 = r4.create(r1)
            r8 = 0
            r10 = 0
            r12 = 123(0x7b, float:1.72E-43)
            r13 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.<init>(r2)
        Lad:
            r1 = r15
            com.stripe.android.payments.core.authentication.threeds2.NextStep r1 = (com.stripe.android.payments.core.authentication.threeds2.NextStep) r1
            androidx.lifecycle.l0 r1 = r0.savedStateHandle
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r3)
            java.lang.String r4 = "key_next_step"
            r1.h(r4, r2)
            r0.setHasCompleted(r3)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel.start3ds2Flow(zz.d):java.lang.Object");
    }

    public final Object startChallengeFlow$payments_core_release(Stripe3ds2AuthResult.Ares ares, Transaction transaction, String str, int i11, d<? super NextStep.StartChallenge> dVar) {
        return i.g(this.workContext, new Stripe3ds2TransactionViewModel$startChallengeFlow$2(ares, transaction, i11, this, str, null), dVar);
    }
}