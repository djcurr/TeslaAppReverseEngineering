package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.networking.StripeRepository;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class AttachFinancialConnectionsSession {
    private final StripeRepository stripeRepository;

    public AttachFinancialConnectionsSession(StripeRepository stripeRepository) {
        s.g(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|12|(3:17|18|(2:20|21)(2:22|23))|14|15))|35|6|7|(0)(0)|11|12|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
        r2 = vz.q.f54772b;
        r0 = vz.q.b(vz.r.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: forPaymentIntent-BWLJW6A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m275forPaymentIntentBWLJW6A(java.lang.String r16, java.lang.String r17, java.lang.String r18, zz.d<? super vz.q<com.stripe.android.model.PaymentIntent>> r19) {
        /*
            r15 = this;
            r1 = r15
            r0 = r19
            boolean r2 = r0 instanceof com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession$forPaymentIntent$1
            if (r2 == 0) goto L16
            r2 = r0
            com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession$forPaymentIntent$1 r2 = (com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession$forPaymentIntent$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
            goto L1b
        L16:
            com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession$forPaymentIntent$1 r2 = new com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession$forPaymentIntent$1
            r2.<init>(r15, r0)
        L1b:
            r8 = r2
            java.lang.Object r0 = r8.result
            java.lang.Object r2 = a00.b.d()
            int r3 = r8.label
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            vz.r.b(r0)     // Catch: java.lang.Throwable -> L68
            goto L61
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L35:
            vz.r.b(r0)
            vz.q$a r0 = vz.q.f54772b     // Catch: java.lang.Throwable -> L68
            com.stripe.android.networking.StripeRepository r3 = r1.stripeRepository     // Catch: java.lang.Throwable -> L68
            com.stripe.android.model.PaymentIntent$ClientSecret r0 = new com.stripe.android.model.PaymentIntent$ClientSecret     // Catch: java.lang.Throwable -> L68
            r5 = r18
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r0.getPaymentIntentId$payments_core_release()     // Catch: java.lang.Throwable -> L68
            com.stripe.android.core.networking.ApiRequest$Options r7 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L68
            r11 = 0
            r12 = 0
            r13 = 6
            r14 = 0
            r9 = r7
            r10 = r16
            r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L68
            r8.label = r4     // Catch: java.lang.Throwable -> L68
            r4 = r18
            r5 = r0
            r6 = r17
            java.lang.Object r0 = r3.attachFinancialConnectionsSessionToPaymentIntent(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L68
            if (r0 != r2) goto L61
            return r2
        L61:
            com.stripe.android.model.PaymentIntent r0 = (com.stripe.android.model.PaymentIntent) r0     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = vz.q.b(r0)     // Catch: java.lang.Throwable -> L68
            goto L73
        L68:
            r0 = move-exception
            vz.q$a r2 = vz.q.f54772b
            java.lang.Object r0 = vz.r.a(r0)
            java.lang.Object r0 = vz.q.b(r0)
        L73:
            boolean r2 = vz.q.h(r0)
            if (r2 == 0) goto L93
            vz.q$a r2 = vz.q.f54772b     // Catch: java.lang.Throwable -> L8c
            com.stripe.android.model.PaymentIntent r0 = (com.stripe.android.model.PaymentIntent) r0     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L84
            java.lang.Object r0 = vz.q.b(r0)     // Catch: java.lang.Throwable -> L8c
            goto L97
        L84:
            java.lang.InternalError r0 = new java.lang.InternalError     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "Error attaching session to PaymentIntent"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L8c
            throw r0     // Catch: java.lang.Throwable -> L8c
        L8c:
            r0 = move-exception
            vz.q$a r2 = vz.q.f54772b
            java.lang.Object r0 = vz.r.a(r0)
        L93:
            java.lang.Object r0 = vz.q.b(r0)
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession.m275forPaymentIntentBWLJW6A(java.lang.String, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|12|(3:17|18|(2:20|21)(2:22|23))|14|15))|35|6|7|(0)(0)|11|12|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
        r2 = vz.q.f54772b;
        r0 = vz.q.b(vz.r.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: forSetupIntent-BWLJW6A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m276forSetupIntentBWLJW6A(java.lang.String r16, java.lang.String r17, java.lang.String r18, zz.d<? super vz.q<com.stripe.android.model.SetupIntent>> r19) {
        /*
            r15 = this;
            r1 = r15
            r0 = r19
            boolean r2 = r0 instanceof com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession$forSetupIntent$1
            if (r2 == 0) goto L16
            r2 = r0
            com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession$forSetupIntent$1 r2 = (com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession$forSetupIntent$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
            goto L1b
        L16:
            com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession$forSetupIntent$1 r2 = new com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession$forSetupIntent$1
            r2.<init>(r15, r0)
        L1b:
            r8 = r2
            java.lang.Object r0 = r8.result
            java.lang.Object r2 = a00.b.d()
            int r3 = r8.label
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            vz.r.b(r0)     // Catch: java.lang.Throwable -> L68
            goto L61
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L35:
            vz.r.b(r0)
            vz.q$a r0 = vz.q.f54772b     // Catch: java.lang.Throwable -> L68
            com.stripe.android.networking.StripeRepository r3 = r1.stripeRepository     // Catch: java.lang.Throwable -> L68
            com.stripe.android.model.SetupIntent$ClientSecret r0 = new com.stripe.android.model.SetupIntent$ClientSecret     // Catch: java.lang.Throwable -> L68
            r5 = r18
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r0.getSetupIntentId$payments_core_release()     // Catch: java.lang.Throwable -> L68
            com.stripe.android.core.networking.ApiRequest$Options r7 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L68
            r11 = 0
            r12 = 0
            r13 = 6
            r14 = 0
            r9 = r7
            r10 = r16
            r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L68
            r8.label = r4     // Catch: java.lang.Throwable -> L68
            r4 = r18
            r5 = r0
            r6 = r17
            java.lang.Object r0 = r3.attachFinancialConnectionsSessionToSetupIntent(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L68
            if (r0 != r2) goto L61
            return r2
        L61:
            com.stripe.android.model.SetupIntent r0 = (com.stripe.android.model.SetupIntent) r0     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = vz.q.b(r0)     // Catch: java.lang.Throwable -> L68
            goto L73
        L68:
            r0 = move-exception
            vz.q$a r2 = vz.q.f54772b
            java.lang.Object r0 = vz.r.a(r0)
            java.lang.Object r0 = vz.q.b(r0)
        L73:
            boolean r2 = vz.q.h(r0)
            if (r2 == 0) goto L93
            vz.q$a r2 = vz.q.f54772b     // Catch: java.lang.Throwable -> L8c
            com.stripe.android.model.SetupIntent r0 = (com.stripe.android.model.SetupIntent) r0     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L84
            java.lang.Object r0 = vz.q.b(r0)     // Catch: java.lang.Throwable -> L8c
            goto L97
        L84:
            java.lang.InternalError r0 = new java.lang.InternalError     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "Error attaching session to SetupIntent"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L8c
            throw r0     // Catch: java.lang.Throwable -> L8c
        L8c:
            r0 = move-exception
            vz.q$a r2 = vz.q.f54772b
            java.lang.Object r0 = vz.r.a(r0)
        L93:
            java.lang.Object r0 = vz.q.b(r0)
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession.m276forSetupIntentBWLJW6A(java.lang.String, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }
}