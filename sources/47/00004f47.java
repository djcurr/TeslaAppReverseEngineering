package com.stripe.android.link.repositories;

import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.networking.StripeRepository;
import h00.a;
import java.util.Locale;
import kotlin.jvm.internal.s;
import zz.g;

/* loaded from: classes6.dex */
public final class LinkApiRepository implements LinkRepository {
    private final Locale locale;
    private final Logger logger;
    private final a<String> publishableKeyProvider;
    private final a<String> stripeAccountIdProvider;
    private final StripeRepository stripeRepository;
    private final g workContext;

    public LinkApiRepository(a<String> publishableKeyProvider, a<String> stripeAccountIdProvider, StripeRepository stripeRepository, Logger logger, @IOContext g workContext, Locale locale) {
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(stripeAccountIdProvider, "stripeAccountIdProvider");
        s.g(stripeRepository, "stripeRepository");
        s.g(logger, "logger");
        s.g(workContext, "workContext");
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeAccountIdProvider = stripeAccountIdProvider;
        this.stripeRepository = stripeRepository;
        this.logger = logger;
        this.workContext = workContext;
        this.locale = locale;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: confirmVerification-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo164confirmVerificationBWLJW6A(java.lang.String r11, java.lang.String r12, java.lang.String r13, zz.d<? super vz.q<com.stripe.android.model.ConsumerSession>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.stripe.android.link.repositories.LinkApiRepository$confirmVerification$1
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.link.repositories.LinkApiRepository$confirmVerification$1 r0 = (com.stripe.android.link.repositories.LinkApiRepository$confirmVerification$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.link.repositories.LinkApiRepository$confirmVerification$1 r0 = new com.stripe.android.link.repositories.LinkApiRepository$confirmVerification$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r14)
            goto L4a
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            vz.r.b(r14)
            zz.g r14 = r10.workContext
            com.stripe.android.link.repositories.LinkApiRepository$confirmVerification$2 r2 = new com.stripe.android.link.repositories.LinkApiRepository$confirmVerification$2
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.label = r3
            java.lang.Object r14 = v20.i.g(r14, r2, r0)
            if (r14 != r1) goto L4a
            return r1
        L4a:
            vz.q r14 = (vz.q) r14
            java.lang.Object r11 = r14.j()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.repositories.LinkApiRepository.mo164confirmVerificationBWLJW6A(java.lang.String, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: consumerSignUp-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo165consumerSignUpyxL6bBk(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, zz.d<? super vz.q<com.stripe.android.model.ConsumerSession>> r18) {
        /*
            r13 = this;
            r7 = r13
            r0 = r18
            boolean r1 = r0 instanceof com.stripe.android.link.repositories.LinkApiRepository$consumerSignUp$1
            if (r1 == 0) goto L16
            r1 = r0
            com.stripe.android.link.repositories.LinkApiRepository$consumerSignUp$1 r1 = (com.stripe.android.link.repositories.LinkApiRepository$consumerSignUp$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
            goto L1b
        L16:
            com.stripe.android.link.repositories.LinkApiRepository$consumerSignUp$1 r1 = new com.stripe.android.link.repositories.LinkApiRepository$consumerSignUp$1
            r1.<init>(r13, r0)
        L1b:
            r8 = r1
            java.lang.Object r0 = r8.result
            java.lang.Object r9 = a00.b.d()
            int r1 = r8.label
            r10 = 1
            if (r1 == 0) goto L35
            if (r1 != r10) goto L2d
            vz.r.b(r0)
            goto L51
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            vz.r.b(r0)
            zz.g r11 = r7.workContext
            com.stripe.android.link.repositories.LinkApiRepository$consumerSignUp$2 r12 = new com.stripe.android.link.repositories.LinkApiRepository$consumerSignUp$2
            r6 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.label = r10
            java.lang.Object r0 = v20.i.g(r11, r12, r8)
            if (r0 != r9) goto L51
            return r9
        L51:
            vz.q r0 = (vz.q) r0
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.repositories.LinkApiRepository.mo165consumerSignUpyxL6bBk(java.lang.String, java.lang.String, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: createPaymentDetails-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo166createPaymentDetailsyxL6bBk(com.stripe.android.model.ConsumerPaymentDetailsCreateParams r14, java.lang.String r15, com.stripe.android.model.StripeIntent r16, java.util.Map<java.lang.String, ? extends java.lang.Object> r17, zz.d<? super vz.q<com.stripe.android.link.LinkPaymentDetails>> r18) {
        /*
            r13 = this;
            r7 = r13
            r0 = r18
            boolean r1 = r0 instanceof com.stripe.android.link.repositories.LinkApiRepository$createPaymentDetails$1
            if (r1 == 0) goto L16
            r1 = r0
            com.stripe.android.link.repositories.LinkApiRepository$createPaymentDetails$1 r1 = (com.stripe.android.link.repositories.LinkApiRepository$createPaymentDetails$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
            goto L1b
        L16:
            com.stripe.android.link.repositories.LinkApiRepository$createPaymentDetails$1 r1 = new com.stripe.android.link.repositories.LinkApiRepository$createPaymentDetails$1
            r1.<init>(r13, r0)
        L1b:
            r8 = r1
            java.lang.Object r0 = r8.result
            java.lang.Object r9 = a00.b.d()
            int r1 = r8.label
            r10 = 1
            if (r1 == 0) goto L35
            if (r1 != r10) goto L2d
            vz.r.b(r0)
            goto L51
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            vz.r.b(r0)
            zz.g r11 = r7.workContext
            com.stripe.android.link.repositories.LinkApiRepository$createPaymentDetails$2 r12 = new com.stripe.android.link.repositories.LinkApiRepository$createPaymentDetails$2
            r6 = 0
            r0 = r12
            r1 = r13
            r2 = r15
            r3 = r14
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.label = r10
            java.lang.Object r0 = v20.i.g(r11, r12, r8)
            if (r0 != r9) goto L51
            return r9
        L51:
            vz.q r0 = (vz.q) r0
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.repositories.LinkApiRepository.mo166createPaymentDetailsyxL6bBk(com.stripe.android.model.ConsumerPaymentDetailsCreateParams, java.lang.String, com.stripe.android.model.StripeIntent, java.util.Map, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: deletePaymentDetails-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo167deletePaymentDetails0E7RQCE(java.lang.String r6, java.lang.String r7, zz.d<? super vz.q<vz.b0>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.link.repositories.LinkApiRepository$deletePaymentDetails$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.link.repositories.LinkApiRepository$deletePaymentDetails$1 r0 = (com.stripe.android.link.repositories.LinkApiRepository$deletePaymentDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.link.repositories.LinkApiRepository$deletePaymentDetails$1 r0 = new com.stripe.android.link.repositories.LinkApiRepository$deletePaymentDetails$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            vz.r.b(r8)
            zz.g r8 = r5.workContext
            com.stripe.android.link.repositories.LinkApiRepository$deletePaymentDetails$2 r2 = new com.stripe.android.link.repositories.LinkApiRepository$deletePaymentDetails$2
            r4 = 0
            r2.<init>(r5, r6, r7, r4)
            r0.label = r3
            java.lang.Object r8 = v20.i.g(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            vz.q r8 = (vz.q) r8
            java.lang.Object r6 = r8.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.repositories.LinkApiRepository.mo167deletePaymentDetails0E7RQCE(java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: listPaymentDetails-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo168listPaymentDetailsgIAlus(java.lang.String r6, zz.d<? super vz.q<com.stripe.android.model.ConsumerPaymentDetails>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.stripe.android.link.repositories.LinkApiRepository$listPaymentDetails$1
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.link.repositories.LinkApiRepository$listPaymentDetails$1 r0 = (com.stripe.android.link.repositories.LinkApiRepository$listPaymentDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.link.repositories.LinkApiRepository$listPaymentDetails$1 r0 = new com.stripe.android.link.repositories.LinkApiRepository$listPaymentDetails$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            vz.r.b(r7)
            zz.g r7 = r5.workContext
            com.stripe.android.link.repositories.LinkApiRepository$listPaymentDetails$2 r2 = new com.stripe.android.link.repositories.LinkApiRepository$listPaymentDetails$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.label = r3
            java.lang.Object r7 = v20.i.g(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            vz.q r7 = (vz.q) r7
            java.lang.Object r6 = r7.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.repositories.LinkApiRepository.mo168listPaymentDetailsgIAlus(java.lang.String, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: logout-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo169logout0E7RQCE(java.lang.String r6, java.lang.String r7, zz.d<? super vz.q<com.stripe.android.model.ConsumerSession>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.link.repositories.LinkApiRepository$logout$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.link.repositories.LinkApiRepository$logout$1 r0 = (com.stripe.android.link.repositories.LinkApiRepository$logout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.link.repositories.LinkApiRepository$logout$1 r0 = new com.stripe.android.link.repositories.LinkApiRepository$logout$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            vz.r.b(r8)
            zz.g r8 = r5.workContext
            com.stripe.android.link.repositories.LinkApiRepository$logout$2 r2 = new com.stripe.android.link.repositories.LinkApiRepository$logout$2
            r4 = 0
            r2.<init>(r5, r6, r7, r4)
            r0.label = r3
            java.lang.Object r8 = v20.i.g(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            vz.q r8 = (vz.q) r8
            java.lang.Object r6 = r8.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.repositories.LinkApiRepository.mo169logout0E7RQCE(java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: lookupConsumer-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo170lookupConsumer0E7RQCE(java.lang.String r6, java.lang.String r7, zz.d<? super vz.q<com.stripe.android.model.ConsumerSessionLookup>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.link.repositories.LinkApiRepository$lookupConsumer$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.link.repositories.LinkApiRepository$lookupConsumer$1 r0 = (com.stripe.android.link.repositories.LinkApiRepository$lookupConsumer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.link.repositories.LinkApiRepository$lookupConsumer$1 r0 = new com.stripe.android.link.repositories.LinkApiRepository$lookupConsumer$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            vz.r.b(r8)
            zz.g r8 = r5.workContext
            com.stripe.android.link.repositories.LinkApiRepository$lookupConsumer$2 r2 = new com.stripe.android.link.repositories.LinkApiRepository$lookupConsumer$2
            r4 = 0
            r2.<init>(r5, r6, r7, r4)
            r0.label = r3
            java.lang.Object r8 = v20.i.g(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            vz.q r8 = (vz.q) r8
            java.lang.Object r6 = r8.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.repositories.LinkApiRepository.mo170lookupConsumer0E7RQCE(java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: startVerification-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo171startVerification0E7RQCE(java.lang.String r6, java.lang.String r7, zz.d<? super vz.q<com.stripe.android.model.ConsumerSession>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.link.repositories.LinkApiRepository$startVerification$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.link.repositories.LinkApiRepository$startVerification$1 r0 = (com.stripe.android.link.repositories.LinkApiRepository$startVerification$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.link.repositories.LinkApiRepository$startVerification$1 r0 = new com.stripe.android.link.repositories.LinkApiRepository$startVerification$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            vz.r.b(r8)
            zz.g r8 = r5.workContext
            com.stripe.android.link.repositories.LinkApiRepository$startVerification$2 r2 = new com.stripe.android.link.repositories.LinkApiRepository$startVerification$2
            r4 = 0
            r2.<init>(r5, r6, r7, r4)
            r0.label = r3
            java.lang.Object r8 = v20.i.g(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            vz.q r8 = (vz.q) r8
            java.lang.Object r6 = r8.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.repositories.LinkApiRepository.mo171startVerification0E7RQCE(java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: updatePaymentDetails-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo172updatePaymentDetails0E7RQCE(com.stripe.android.model.ConsumerPaymentDetailsUpdateParams r6, java.lang.String r7, zz.d<? super vz.q<com.stripe.android.model.ConsumerPaymentDetails>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.link.repositories.LinkApiRepository$updatePaymentDetails$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.link.repositories.LinkApiRepository$updatePaymentDetails$1 r0 = (com.stripe.android.link.repositories.LinkApiRepository$updatePaymentDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.link.repositories.LinkApiRepository$updatePaymentDetails$1 r0 = new com.stripe.android.link.repositories.LinkApiRepository$updatePaymentDetails$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            vz.r.b(r8)
            zz.g r8 = r5.workContext
            com.stripe.android.link.repositories.LinkApiRepository$updatePaymentDetails$2 r2 = new com.stripe.android.link.repositories.LinkApiRepository$updatePaymentDetails$2
            r4 = 0
            r2.<init>(r5, r7, r6, r4)
            r0.label = r3
            java.lang.Object r8 = v20.i.g(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            vz.q r8 = (vz.q) r8
            java.lang.Object r6 = r8.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.repositories.LinkApiRepository.mo172updatePaymentDetails0E7RQCE(com.stripe.android.model.ConsumerPaymentDetailsUpdateParams, java.lang.String, zz.d):java.lang.Object");
    }
}