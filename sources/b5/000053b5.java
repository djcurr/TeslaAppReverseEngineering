package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.networking.StripeRepository;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class VerifyWithMicrodeposit {
    private final StripeRepository stripeRepository;

    public VerifyWithMicrodeposit(StripeRepository stripeRepository) {
        s.g(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|12|(3:17|18|(2:20|21)(2:22|23))|14|15))|35|6|7|(0)(0)|11|12|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        r12 = vz.q.f54772b;
        r11 = vz.q.b(vz.r.a(r11));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: forPaymentIntent-BWLJW6A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m280forPaymentIntentBWLJW6A(java.lang.String r11, java.lang.String r12, java.lang.String r13, zz.d<? super vz.q<com.stripe.android.model.PaymentIntent>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forPaymentIntent$4
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forPaymentIntent$4 r0 = (com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forPaymentIntent$4) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forPaymentIntent$4 r0 = new com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forPaymentIntent$4
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r14)     // Catch: java.lang.Throwable -> L53
            goto L4c
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            vz.r.b(r14)
            vz.q$a r14 = vz.q.f54772b     // Catch: java.lang.Throwable -> L53
            com.stripe.android.networking.StripeRepository r14 = r10.stripeRepository     // Catch: java.lang.Throwable -> L53
            com.stripe.android.core.networking.ApiRequest$Options r2 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L53
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r2
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L53
            r0.label = r3     // Catch: java.lang.Throwable -> L53
            java.lang.Object r14 = r14.verifyPaymentIntentWithMicrodeposits(r12, r13, r2, r0)     // Catch: java.lang.Throwable -> L53
            if (r14 != r1) goto L4c
            return r1
        L4c:
            com.stripe.android.model.PaymentIntent r14 = (com.stripe.android.model.PaymentIntent) r14     // Catch: java.lang.Throwable -> L53
            java.lang.Object r11 = vz.q.b(r14)     // Catch: java.lang.Throwable -> L53
            goto L5e
        L53:
            r11 = move-exception
            vz.q$a r12 = vz.q.f54772b
            java.lang.Object r11 = vz.r.a(r11)
            java.lang.Object r11 = vz.q.b(r11)
        L5e:
            boolean r12 = vz.q.h(r11)
            if (r12 == 0) goto L7e
            vz.q$a r12 = vz.q.f54772b     // Catch: java.lang.Throwable -> L77
            com.stripe.android.model.PaymentIntent r11 = (com.stripe.android.model.PaymentIntent) r11     // Catch: java.lang.Throwable -> L77
            if (r11 == 0) goto L6f
            java.lang.Object r11 = vz.q.b(r11)     // Catch: java.lang.Throwable -> L77
            goto L82
        L6f:
            java.lang.InternalError r11 = new java.lang.InternalError     // Catch: java.lang.Throwable -> L77
            java.lang.String r12 = "Error verifying PaymentIntent with microdeposits"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L77
            throw r11     // Catch: java.lang.Throwable -> L77
        L77:
            r11 = move-exception
            vz.q$a r12 = vz.q.f54772b
            java.lang.Object r11 = vz.r.a(r11)
        L7e:
            java.lang.Object r11 = vz.q.b(r11)
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit.m280forPaymentIntentBWLJW6A(java.lang.String, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|12|(3:17|18|(2:20|21)(2:22|23))|14|15))|35|6|7|(0)(0)|11|12|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
        r2 = vz.q.f54772b;
        r0 = vz.q.b(vz.r.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: forPaymentIntent-yxL6bBk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m281forPaymentIntentyxL6bBk(java.lang.String r16, java.lang.String r17, int r18, int r19, zz.d<? super vz.q<com.stripe.android.model.PaymentIntent>> r20) {
        /*
            r15 = this;
            r1 = r15
            r0 = r20
            boolean r2 = r0 instanceof com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forPaymentIntent$1
            if (r2 == 0) goto L16
            r2 = r0
            com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forPaymentIntent$1 r2 = (com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forPaymentIntent$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
            goto L1b
        L16:
            com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forPaymentIntent$1 r2 = new com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forPaymentIntent$1
            r2.<init>(r15, r0)
        L1b:
            r8 = r2
            java.lang.Object r0 = r8.result
            java.lang.Object r2 = a00.b.d()
            int r3 = r8.label
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            vz.r.b(r0)     // Catch: java.lang.Throwable -> L5e
            goto L57
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L35:
            vz.r.b(r0)
            vz.q$a r0 = vz.q.f54772b     // Catch: java.lang.Throwable -> L5e
            com.stripe.android.networking.StripeRepository r3 = r1.stripeRepository     // Catch: java.lang.Throwable -> L5e
            com.stripe.android.core.networking.ApiRequest$Options r7 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L5e
            r11 = 0
            r12 = 0
            r13 = 6
            r14 = 0
            r9 = r7
            r10 = r16
            r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L5e
            r8.label = r4     // Catch: java.lang.Throwable -> L5e
            r4 = r17
            r5 = r18
            r6 = r19
            java.lang.Object r0 = r3.verifyPaymentIntentWithMicrodeposits(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5e
            if (r0 != r2) goto L57
            return r2
        L57:
            com.stripe.android.model.PaymentIntent r0 = (com.stripe.android.model.PaymentIntent) r0     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = vz.q.b(r0)     // Catch: java.lang.Throwable -> L5e
            goto L69
        L5e:
            r0 = move-exception
            vz.q$a r2 = vz.q.f54772b
            java.lang.Object r0 = vz.r.a(r0)
            java.lang.Object r0 = vz.q.b(r0)
        L69:
            boolean r2 = vz.q.h(r0)
            if (r2 == 0) goto L89
            vz.q$a r2 = vz.q.f54772b     // Catch: java.lang.Throwable -> L82
            com.stripe.android.model.PaymentIntent r0 = (com.stripe.android.model.PaymentIntent) r0     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L7a
            java.lang.Object r0 = vz.q.b(r0)     // Catch: java.lang.Throwable -> L82
            goto L8d
        L7a:
            java.lang.InternalError r0 = new java.lang.InternalError     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = "Error verifying PaymentIntent with microdeposits"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L82
            throw r0     // Catch: java.lang.Throwable -> L82
        L82:
            r0 = move-exception
            vz.q$a r2 = vz.q.f54772b
            java.lang.Object r0 = vz.r.a(r0)
        L89:
            java.lang.Object r0 = vz.q.b(r0)
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit.m281forPaymentIntentyxL6bBk(java.lang.String, java.lang.String, int, int, zz.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|12|(3:17|18|(2:20|21)(2:22|23))|14|15))|35|6|7|(0)(0)|11|12|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        r12 = vz.q.f54772b;
        r11 = vz.q.b(vz.r.a(r11));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: forSetupIntent-BWLJW6A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m282forSetupIntentBWLJW6A(java.lang.String r11, java.lang.String r12, java.lang.String r13, zz.d<? super vz.q<com.stripe.android.model.SetupIntent>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forSetupIntent$4
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forSetupIntent$4 r0 = (com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forSetupIntent$4) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forSetupIntent$4 r0 = new com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forSetupIntent$4
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r14)     // Catch: java.lang.Throwable -> L53
            goto L4c
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            vz.r.b(r14)
            vz.q$a r14 = vz.q.f54772b     // Catch: java.lang.Throwable -> L53
            com.stripe.android.networking.StripeRepository r14 = r10.stripeRepository     // Catch: java.lang.Throwable -> L53
            com.stripe.android.core.networking.ApiRequest$Options r2 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L53
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r2
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L53
            r0.label = r3     // Catch: java.lang.Throwable -> L53
            java.lang.Object r14 = r14.verifySetupIntentWithMicrodeposits(r12, r13, r2, r0)     // Catch: java.lang.Throwable -> L53
            if (r14 != r1) goto L4c
            return r1
        L4c:
            com.stripe.android.model.SetupIntent r14 = (com.stripe.android.model.SetupIntent) r14     // Catch: java.lang.Throwable -> L53
            java.lang.Object r11 = vz.q.b(r14)     // Catch: java.lang.Throwable -> L53
            goto L5e
        L53:
            r11 = move-exception
            vz.q$a r12 = vz.q.f54772b
            java.lang.Object r11 = vz.r.a(r11)
            java.lang.Object r11 = vz.q.b(r11)
        L5e:
            boolean r12 = vz.q.h(r11)
            if (r12 == 0) goto L7e
            vz.q$a r12 = vz.q.f54772b     // Catch: java.lang.Throwable -> L77
            com.stripe.android.model.SetupIntent r11 = (com.stripe.android.model.SetupIntent) r11     // Catch: java.lang.Throwable -> L77
            if (r11 == 0) goto L6f
            java.lang.Object r11 = vz.q.b(r11)     // Catch: java.lang.Throwable -> L77
            goto L82
        L6f:
            java.lang.InternalError r11 = new java.lang.InternalError     // Catch: java.lang.Throwable -> L77
            java.lang.String r12 = "Error verifying SetupIntent with microdeposits"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L77
            throw r11     // Catch: java.lang.Throwable -> L77
        L77:
            r11 = move-exception
            vz.q$a r12 = vz.q.f54772b
            java.lang.Object r11 = vz.r.a(r11)
        L7e:
            java.lang.Object r11 = vz.q.b(r11)
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit.m282forSetupIntentBWLJW6A(java.lang.String, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|12|(3:17|18|(2:20|21)(2:22|23))|14|15))|35|6|7|(0)(0)|11|12|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
        r2 = vz.q.f54772b;
        r0 = vz.q.b(vz.r.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: forSetupIntent-yxL6bBk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m283forSetupIntentyxL6bBk(java.lang.String r16, java.lang.String r17, int r18, int r19, zz.d<? super vz.q<com.stripe.android.model.SetupIntent>> r20) {
        /*
            r15 = this;
            r1 = r15
            r0 = r20
            boolean r2 = r0 instanceof com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forSetupIntent$1
            if (r2 == 0) goto L16
            r2 = r0
            com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forSetupIntent$1 r2 = (com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forSetupIntent$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
            goto L1b
        L16:
            com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forSetupIntent$1 r2 = new com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit$forSetupIntent$1
            r2.<init>(r15, r0)
        L1b:
            r8 = r2
            java.lang.Object r0 = r8.result
            java.lang.Object r2 = a00.b.d()
            int r3 = r8.label
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            vz.r.b(r0)     // Catch: java.lang.Throwable -> L5e
            goto L57
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L35:
            vz.r.b(r0)
            vz.q$a r0 = vz.q.f54772b     // Catch: java.lang.Throwable -> L5e
            com.stripe.android.networking.StripeRepository r3 = r1.stripeRepository     // Catch: java.lang.Throwable -> L5e
            com.stripe.android.core.networking.ApiRequest$Options r7 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L5e
            r11 = 0
            r12 = 0
            r13 = 6
            r14 = 0
            r9 = r7
            r10 = r16
            r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L5e
            r8.label = r4     // Catch: java.lang.Throwable -> L5e
            r4 = r17
            r5 = r18
            r6 = r19
            java.lang.Object r0 = r3.verifySetupIntentWithMicrodeposits(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5e
            if (r0 != r2) goto L57
            return r2
        L57:
            com.stripe.android.model.SetupIntent r0 = (com.stripe.android.model.SetupIntent) r0     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = vz.q.b(r0)     // Catch: java.lang.Throwable -> L5e
            goto L69
        L5e:
            r0 = move-exception
            vz.q$a r2 = vz.q.f54772b
            java.lang.Object r0 = vz.r.a(r0)
            java.lang.Object r0 = vz.q.b(r0)
        L69:
            boolean r2 = vz.q.h(r0)
            if (r2 == 0) goto L89
            vz.q$a r2 = vz.q.f54772b     // Catch: java.lang.Throwable -> L82
            com.stripe.android.model.SetupIntent r0 = (com.stripe.android.model.SetupIntent) r0     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L7a
            java.lang.Object r0 = vz.q.b(r0)     // Catch: java.lang.Throwable -> L82
            goto L8d
        L7a:
            java.lang.InternalError r0 = new java.lang.InternalError     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = "Error verifying SetupIntent with microdeposits"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L82
            throw r0     // Catch: java.lang.Throwable -> L82
        L82:
            r0 = move-exception
            vz.q$a r2 = vz.q.f54772b
            java.lang.Object r0 = vz.r.a(r0)
        L89:
            java.lang.Object r0 = vz.q.b(r0)
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit.m283forSetupIntentyxL6bBk(java.lang.String, java.lang.String, int, int, zz.d):java.lang.Object");
    }
}