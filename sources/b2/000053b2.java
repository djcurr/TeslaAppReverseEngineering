package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.networking.StripeRepository;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class RetrieveStripeIntent {
    private final StripeRepository stripeRepository;

    public RetrieveStripeIntent(StripeRepository stripeRepository) {
        s.g(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* renamed from: invoke-0E7RQCE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m279invoke0E7RQCE(java.lang.String r13, java.lang.String r14, zz.d<? super vz.q<? extends com.stripe.android.model.StripeIntent>> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent$invoke$1
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent$invoke$1 r0 = (com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent$invoke$1 r0 = new com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent$invoke$1
            r0.<init>(r12, r15)
        L18:
            r5 = r0
            java.lang.Object r15 = r5.result
            java.lang.Object r0 = a00.b.d()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            vz.r.b(r15)     // Catch: java.lang.Throwable -> L58
            goto L51
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            vz.r.b(r15)
            vz.q$a r15 = vz.q.f54772b     // Catch: java.lang.Throwable -> L58
            com.stripe.android.networking.StripeRepository r1 = r12.stripeRepository     // Catch: java.lang.Throwable -> L58
            com.stripe.android.core.networking.ApiRequest$Options r3 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L58
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r3
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L58
            r4 = 0
            r6 = 4
            r7 = 0
            r5.label = r2     // Catch: java.lang.Throwable -> L58
            r2 = r14
            java.lang.Object r15 = com.stripe.android.networking.StripeRepository.retrieveStripeIntent$payments_core_release$default(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L58
            if (r15 != r0) goto L51
            return r0
        L51:
            com.stripe.android.model.StripeIntent r15 = (com.stripe.android.model.StripeIntent) r15     // Catch: java.lang.Throwable -> L58
            java.lang.Object r13 = vz.q.b(r15)     // Catch: java.lang.Throwable -> L58
            goto L63
        L58:
            r13 = move-exception
            vz.q$a r14 = vz.q.f54772b
            java.lang.Object r13 = vz.r.a(r13)
            java.lang.Object r13 = vz.q.b(r13)
        L63:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent.m279invoke0E7RQCE(java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }
}