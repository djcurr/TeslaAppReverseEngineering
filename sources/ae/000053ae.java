package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.networking.StripeRepository;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class CreateFinancialConnectionsSession {
    private final StripeRepository stripeRepository;

    public CreateFinancialConnectionsSession(StripeRepository stripeRepository) {
        s.g(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|12|(3:17|18|(2:20|21)(2:22|23))|14|15))|35|6|7|(0)(0)|11|12|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        r2 = vz.q.f54772b;
        r0 = vz.q.b(vz.r.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: forPaymentIntent-yxL6bBk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m277forPaymentIntentyxL6bBk(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, zz.d<? super vz.q<com.stripe.android.model.FinancialConnectionsSession>> r19) {
        /*
            r14 = this;
            r1 = r14
            r0 = r16
            r2 = r19
            boolean r3 = r2 instanceof com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession$forPaymentIntent$1
            if (r3 == 0) goto L18
            r3 = r2
            com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession$forPaymentIntent$1 r3 = (com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession$forPaymentIntent$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L18
            int r4 = r4 - r5
            r3.label = r4
            goto L1d
        L18:
            com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession$forPaymentIntent$1 r3 = new com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession$forPaymentIntent$1
            r3.<init>(r14, r2)
        L1d:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = a00.b.d()
            int r5 = r3.label
            r6 = 1
            if (r5 == 0) goto L36
            if (r5 != r6) goto L2e
            vz.r.b(r2)     // Catch: java.lang.Throwable -> L6a
            goto L63
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L36:
            vz.r.b(r2)
            vz.q$a r2 = vz.q.f54772b     // Catch: java.lang.Throwable -> L6a
            com.stripe.android.networking.StripeRepository r2 = r1.stripeRepository     // Catch: java.lang.Throwable -> L6a
            com.stripe.android.model.PaymentIntent$ClientSecret r5 = new com.stripe.android.model.PaymentIntent$ClientSecret     // Catch: java.lang.Throwable -> L6a
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = r5.getPaymentIntentId$payments_core_release()     // Catch: java.lang.Throwable -> L6a
            com.stripe.android.model.CreateFinancialConnectionsSessionParams r7 = new com.stripe.android.model.CreateFinancialConnectionsSessionParams     // Catch: java.lang.Throwable -> L6a
            r8 = r17
            r9 = r18
            r7.<init>(r0, r8, r9)     // Catch: java.lang.Throwable -> L6a
            com.stripe.android.core.networking.ApiRequest$Options r0 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L6a
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r0
            r9 = r15
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L6a
            r3.label = r6     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r2 = r2.createPaymentIntentFinancialConnectionsSession$payments_core_release(r5, r7, r0, r3)     // Catch: java.lang.Throwable -> L6a
            if (r2 != r4) goto L63
            return r4
        L63:
            com.stripe.android.model.FinancialConnectionsSession r2 = (com.stripe.android.model.FinancialConnectionsSession) r2     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = vz.q.b(r2)     // Catch: java.lang.Throwable -> L6a
            goto L75
        L6a:
            r0 = move-exception
            vz.q$a r2 = vz.q.f54772b
            java.lang.Object r0 = vz.r.a(r0)
            java.lang.Object r0 = vz.q.b(r0)
        L75:
            boolean r2 = vz.q.h(r0)
            if (r2 == 0) goto L95
            vz.q$a r2 = vz.q.f54772b     // Catch: java.lang.Throwable -> L8e
            com.stripe.android.model.FinancialConnectionsSession r0 = (com.stripe.android.model.FinancialConnectionsSession) r0     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L86
            java.lang.Object r0 = vz.q.b(r0)     // Catch: java.lang.Throwable -> L8e
            goto L99
        L86:
            java.lang.InternalError r0 = new java.lang.InternalError     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = "Error creating session for PaymentIntent"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L8e
            throw r0     // Catch: java.lang.Throwable -> L8e
        L8e:
            r0 = move-exception
            vz.q$a r2 = vz.q.f54772b
            java.lang.Object r0 = vz.r.a(r0)
        L95:
            java.lang.Object r0 = vz.q.b(r0)
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession.m277forPaymentIntentyxL6bBk(java.lang.String, java.lang.String, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|12|(3:17|18|(2:20|21)(2:22|23))|14|15))|35|6|7|(0)(0)|11|12|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        r2 = vz.q.f54772b;
        r0 = vz.q.b(vz.r.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: forSetupIntent-yxL6bBk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m278forSetupIntentyxL6bBk(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, zz.d<? super vz.q<com.stripe.android.model.FinancialConnectionsSession>> r19) {
        /*
            r14 = this;
            r1 = r14
            r0 = r16
            r2 = r19
            boolean r3 = r2 instanceof com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession$forSetupIntent$1
            if (r3 == 0) goto L18
            r3 = r2
            com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession$forSetupIntent$1 r3 = (com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession$forSetupIntent$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L18
            int r4 = r4 - r5
            r3.label = r4
            goto L1d
        L18:
            com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession$forSetupIntent$1 r3 = new com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession$forSetupIntent$1
            r3.<init>(r14, r2)
        L1d:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = a00.b.d()
            int r5 = r3.label
            r6 = 1
            if (r5 == 0) goto L36
            if (r5 != r6) goto L2e
            vz.r.b(r2)     // Catch: java.lang.Throwable -> L6a
            goto L63
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L36:
            vz.r.b(r2)
            vz.q$a r2 = vz.q.f54772b     // Catch: java.lang.Throwable -> L6a
            com.stripe.android.networking.StripeRepository r2 = r1.stripeRepository     // Catch: java.lang.Throwable -> L6a
            com.stripe.android.model.SetupIntent$ClientSecret r5 = new com.stripe.android.model.SetupIntent$ClientSecret     // Catch: java.lang.Throwable -> L6a
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = r5.getSetupIntentId$payments_core_release()     // Catch: java.lang.Throwable -> L6a
            com.stripe.android.model.CreateFinancialConnectionsSessionParams r7 = new com.stripe.android.model.CreateFinancialConnectionsSessionParams     // Catch: java.lang.Throwable -> L6a
            r8 = r17
            r9 = r18
            r7.<init>(r0, r8, r9)     // Catch: java.lang.Throwable -> L6a
            com.stripe.android.core.networking.ApiRequest$Options r0 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L6a
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r0
            r9 = r15
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L6a
            r3.label = r6     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r2 = r2.createSetupIntentFinancialConnectionsSession$payments_core_release(r5, r7, r0, r3)     // Catch: java.lang.Throwable -> L6a
            if (r2 != r4) goto L63
            return r4
        L63:
            com.stripe.android.model.FinancialConnectionsSession r2 = (com.stripe.android.model.FinancialConnectionsSession) r2     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = vz.q.b(r2)     // Catch: java.lang.Throwable -> L6a
            goto L75
        L6a:
            r0 = move-exception
            vz.q$a r2 = vz.q.f54772b
            java.lang.Object r0 = vz.r.a(r0)
            java.lang.Object r0 = vz.q.b(r0)
        L75:
            boolean r2 = vz.q.h(r0)
            if (r2 == 0) goto L95
            vz.q$a r2 = vz.q.f54772b     // Catch: java.lang.Throwable -> L8e
            com.stripe.android.model.FinancialConnectionsSession r0 = (com.stripe.android.model.FinancialConnectionsSession) r0     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L86
            java.lang.Object r0 = vz.q.b(r0)     // Catch: java.lang.Throwable -> L8e
            goto L99
        L86:
            java.lang.InternalError r0 = new java.lang.InternalError     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = "Error creating session for SetupIntent"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L8e
            throw r0     // Catch: java.lang.Throwable -> L8e
        L8e:
            r0 = move-exception
            vz.q$a r2 = vz.q.f54772b
            java.lang.Object r0 = vz.r.a(r0)
        L95:
            java.lang.Object r0 = vz.q.b(r0)
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession.m278forSetupIntentyxL6bBk(java.lang.String, java.lang.String, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }
}