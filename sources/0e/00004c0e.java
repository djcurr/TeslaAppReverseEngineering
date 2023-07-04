package com.stripe.android;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.model.StripeFileParams;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.AccountParams;
import com.stripe.android.model.BankAccountTokenParams;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PersonTokenParams;
import com.stripe.android.model.SourceParams;
import kotlin.jvm.internal.s;
import vz.q;
import vz.r;

/* loaded from: classes2.dex */
public final class StripeKtxKt {
    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0080, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0081, code lost:
        r11 = vz.q.f54772b;
        r10 = vz.q.b(vz.r.a(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0055 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:44:0x0025, B:52:0x0051, B:54:0x0055, B:55:0x005a, B:56:0x007f, B:49:0x0034), top: B:65:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:44:0x0025, B:52:0x0051, B:54:0x0055, B:55:0x005a, B:56:0x007f, B:49:0x0034), top: B:65:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object confirmAlipayPayment(com.stripe.android.Stripe r10, com.stripe.android.model.ConfirmPaymentIntentParams r11, com.stripe.android.AlipayAuthenticator r12, java.lang.String r13, zz.d<? super com.stripe.android.PaymentIntentResult> r14) {
        /*
            boolean r0 = r14 instanceof com.stripe.android.StripeKtxKt$confirmAlipayPayment$1
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.StripeKtxKt$confirmAlipayPayment$1 r0 = (com.stripe.android.StripeKtxKt$confirmAlipayPayment$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$confirmAlipayPayment$1 r0 = new com.stripe.android.StripeKtxKt$confirmAlipayPayment$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r14)     // Catch: java.lang.Throwable -> L80
            goto L51
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            vz.r.b(r14)
            vz.q$a r14 = vz.q.f54772b     // Catch: java.lang.Throwable -> L80
            com.stripe.android.PaymentController r14 = r10.getPaymentController$payments_core_release()     // Catch: java.lang.Throwable -> L80
            com.stripe.android.core.networking.ApiRequest$Options r2 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L80
            java.lang.String r5 = r10.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L80
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r2
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L80
            r0.label = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r14 = r14.confirmAndAuthenticateAlipay(r11, r12, r2, r0)     // Catch: java.lang.Throwable -> L80
            if (r14 != r1) goto L51
            return r1
        L51:
            com.stripe.android.PaymentIntentResult r14 = (com.stripe.android.PaymentIntentResult) r14     // Catch: java.lang.Throwable -> L80
            if (r14 == 0) goto L5a
            java.lang.Object r10 = vz.q.b(r14)     // Catch: java.lang.Throwable -> L80
            goto L8b
        L5a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80
            r10.<init>()     // Catch: java.lang.Throwable -> L80
            java.lang.String r11 = "Failed to parse "
            r10.append(r11)     // Catch: java.lang.Throwable -> L80
            java.lang.Class<com.stripe.android.PaymentIntentResult> r11 = com.stripe.android.PaymentIntentResult.class
            java.lang.String r11 = r11.getSimpleName()     // Catch: java.lang.Throwable -> L80
            r10.append(r11)     // Catch: java.lang.Throwable -> L80
            r11 = 46
            r10.append(r11)     // Catch: java.lang.Throwable -> L80
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L80
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L80
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L80
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L80
            throw r11     // Catch: java.lang.Throwable -> L80
        L80:
            r10 = move-exception
            vz.q$a r11 = vz.q.f54772b
            java.lang.Object r10 = vz.r.a(r10)
            java.lang.Object r10 = vz.q.b(r10)
        L8b:
            java.lang.Throwable r11 = vz.q.e(r10)
            if (r11 != 0) goto L94
            com.stripe.android.core.model.StripeModel r10 = (com.stripe.android.core.model.StripeModel) r10
            return r10
        L94:
            com.stripe.android.core.exception.StripeException$Companion r10 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r10 = r10.create(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.confirmAlipayPayment(com.stripe.android.Stripe, com.stripe.android.model.ConfirmPaymentIntentParams, com.stripe.android.AlipayAuthenticator, java.lang.String, zz.d):java.lang.Object");
    }

    public static /* synthetic */ Object confirmAlipayPayment$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, String str, zz.d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = stripe.getStripeAccountId$payments_core_release();
        }
        return confirmAlipayPayment(stripe, confirmPaymentIntentParams, alipayAuthenticator, str, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0084, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0085, code lost:
        r9 = vz.q.f54772b;
        r8 = vz.q.b(vz.r.a(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0059 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:44:0x0026, B:52:0x0055, B:54:0x0059, B:55:0x005e, B:56:0x0083, B:49:0x0035), top: B:65:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005e A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:44:0x0026, B:52:0x0055, B:54:0x0059, B:55:0x005e, B:56:0x0083, B:49:0x0035), top: B:65:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object confirmPaymentIntent(com.stripe.android.Stripe r8, com.stripe.android.model.ConfirmPaymentIntentParams r9, java.lang.String r10, zz.d<? super com.stripe.android.model.PaymentIntent> r11) {
        /*
            boolean r0 = r11 instanceof com.stripe.android.StripeKtxKt$confirmPaymentIntent$1
            if (r0 == 0) goto L13
            r0 = r11
            com.stripe.android.StripeKtxKt$confirmPaymentIntent$1 r0 = (com.stripe.android.StripeKtxKt$confirmPaymentIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$confirmPaymentIntent$1 r0 = new com.stripe.android.StripeKtxKt$confirmPaymentIntent$1
            r0.<init>(r11)
        L18:
            r5 = r0
            java.lang.Object r11 = r5.result
            java.lang.Object r0 = a00.b.d()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            vz.r.b(r11)     // Catch: java.lang.Throwable -> L84
            goto L55
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            vz.r.b(r11)
            vz.q$a r11 = vz.q.f54772b     // Catch: java.lang.Throwable -> L84
            com.stripe.android.networking.StripeRepository r1 = r8.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L84
            com.stripe.android.core.networking.ApiRequest$Options r3 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L84
            java.lang.String r11 = r8.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L84
            java.lang.String r8 = r8.getStripeAccountId$payments_core_release()     // Catch: java.lang.Throwable -> L84
            r3.<init>(r11, r8, r10)     // Catch: java.lang.Throwable -> L84
            r4 = 0
            r6 = 4
            r7 = 0
            r5.label = r2     // Catch: java.lang.Throwable -> L84
            r2 = r9
            java.lang.Object r11 = com.stripe.android.networking.StripeRepository.confirmPaymentIntent$payments_core_release$default(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L84
            if (r11 != r0) goto L55
            return r0
        L55:
            com.stripe.android.model.PaymentIntent r11 = (com.stripe.android.model.PaymentIntent) r11     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L5e
            java.lang.Object r8 = vz.q.b(r11)     // Catch: java.lang.Throwable -> L84
            goto L8f
        L5e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r8.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = "Failed to parse "
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            java.lang.Class<com.stripe.android.model.PaymentIntent> r9 = com.stripe.android.model.PaymentIntent.class
            java.lang.String r9 = r9.getSimpleName()     // Catch: java.lang.Throwable -> L84
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            r9 = 46
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L84
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L84
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L84
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L84
            throw r9     // Catch: java.lang.Throwable -> L84
        L84:
            r8 = move-exception
            vz.q$a r9 = vz.q.f54772b
            java.lang.Object r8 = vz.r.a(r8)
            java.lang.Object r8 = vz.q.b(r8)
        L8f:
            java.lang.Throwable r9 = vz.q.e(r8)
            if (r9 != 0) goto L98
            com.stripe.android.core.model.StripeModel r8 = (com.stripe.android.core.model.StripeModel) r8
            return r8
        L98:
            com.stripe.android.core.exception.StripeException$Companion r8 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r8 = r8.create(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.confirmPaymentIntent(com.stripe.android.Stripe, com.stripe.android.model.ConfirmPaymentIntentParams, java.lang.String, zz.d):java.lang.Object");
    }

    public static /* synthetic */ Object confirmPaymentIntent$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, zz.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return confirmPaymentIntent(stripe, confirmPaymentIntentParams, str, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0084, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0085, code lost:
        r9 = vz.q.f54772b;
        r8 = vz.q.b(vz.r.a(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0059 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:44:0x0026, B:52:0x0055, B:54:0x0059, B:55:0x005e, B:56:0x0083, B:49:0x0035), top: B:65:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005e A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:44:0x0026, B:52:0x0055, B:54:0x0059, B:55:0x005e, B:56:0x0083, B:49:0x0035), top: B:65:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object confirmSetupIntent(com.stripe.android.Stripe r8, com.stripe.android.model.ConfirmSetupIntentParams r9, java.lang.String r10, zz.d<? super com.stripe.android.model.SetupIntent> r11) {
        /*
            boolean r0 = r11 instanceof com.stripe.android.StripeKtxKt$confirmSetupIntent$1
            if (r0 == 0) goto L13
            r0 = r11
            com.stripe.android.StripeKtxKt$confirmSetupIntent$1 r0 = (com.stripe.android.StripeKtxKt$confirmSetupIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$confirmSetupIntent$1 r0 = new com.stripe.android.StripeKtxKt$confirmSetupIntent$1
            r0.<init>(r11)
        L18:
            r5 = r0
            java.lang.Object r11 = r5.result
            java.lang.Object r0 = a00.b.d()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            vz.r.b(r11)     // Catch: java.lang.Throwable -> L84
            goto L55
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            vz.r.b(r11)
            vz.q$a r11 = vz.q.f54772b     // Catch: java.lang.Throwable -> L84
            com.stripe.android.networking.StripeRepository r1 = r8.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L84
            com.stripe.android.core.networking.ApiRequest$Options r3 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L84
            java.lang.String r11 = r8.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L84
            java.lang.String r8 = r8.getStripeAccountId$payments_core_release()     // Catch: java.lang.Throwable -> L84
            r3.<init>(r11, r8, r10)     // Catch: java.lang.Throwable -> L84
            r4 = 0
            r6 = 4
            r7 = 0
            r5.label = r2     // Catch: java.lang.Throwable -> L84
            r2 = r9
            java.lang.Object r11 = com.stripe.android.networking.StripeRepository.confirmSetupIntent$payments_core_release$default(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L84
            if (r11 != r0) goto L55
            return r0
        L55:
            com.stripe.android.model.SetupIntent r11 = (com.stripe.android.model.SetupIntent) r11     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L5e
            java.lang.Object r8 = vz.q.b(r11)     // Catch: java.lang.Throwable -> L84
            goto L8f
        L5e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r8.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = "Failed to parse "
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            java.lang.Class<com.stripe.android.model.SetupIntent> r9 = com.stripe.android.model.SetupIntent.class
            java.lang.String r9 = r9.getSimpleName()     // Catch: java.lang.Throwable -> L84
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            r9 = 46
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L84
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L84
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L84
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L84
            throw r9     // Catch: java.lang.Throwable -> L84
        L84:
            r8 = move-exception
            vz.q$a r9 = vz.q.f54772b
            java.lang.Object r8 = vz.r.a(r8)
            java.lang.Object r8 = vz.q.b(r8)
        L8f:
            java.lang.Throwable r9 = vz.q.e(r8)
            if (r9 != 0) goto L98
            com.stripe.android.core.model.StripeModel r8 = (com.stripe.android.core.model.StripeModel) r8
            return r8
        L98:
            com.stripe.android.core.exception.StripeException$Companion r8 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r8 = r8.create(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.confirmSetupIntent(com.stripe.android.Stripe, com.stripe.android.model.ConfirmSetupIntentParams, java.lang.String, zz.d):java.lang.Object");
    }

    public static /* synthetic */ Object confirmSetupIntent$default(Stripe stripe, ConfirmSetupIntentParams confirmSetupIntentParams, String str, zz.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return confirmSetupIntent(stripe, confirmSetupIntentParams, str, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)(2:16|17)))|27|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0058, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0059, code lost:
        r11 = vz.q.f54772b;
        r10 = vz.q.b(vz.r.a(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object confirmWeChatPayPayment(com.stripe.android.Stripe r10, com.stripe.android.model.ConfirmPaymentIntentParams r11, java.lang.String r12, zz.d<? super com.stripe.android.model.WeChatPayNextAction> r13) {
        /*
            boolean r0 = r13 instanceof com.stripe.android.StripeKtxKt$confirmWeChatPayPayment$1
            if (r0 == 0) goto L13
            r0 = r13
            com.stripe.android.StripeKtxKt$confirmWeChatPayPayment$1 r0 = (com.stripe.android.StripeKtxKt$confirmWeChatPayPayment$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$confirmWeChatPayPayment$1 r0 = new com.stripe.android.StripeKtxKt$confirmWeChatPayPayment$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r13)     // Catch: java.lang.Throwable -> L58
            goto L51
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            vz.r.b(r13)
            vz.q$a r13 = vz.q.f54772b     // Catch: java.lang.Throwable -> L58
            com.stripe.android.PaymentController r13 = r10.getPaymentController$payments_core_release()     // Catch: java.lang.Throwable -> L58
            com.stripe.android.core.networking.ApiRequest$Options r2 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = r10.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L58
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r2
            r6 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L58
            r0.label = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r13 = r13.confirmWeChatPay(r11, r2, r0)     // Catch: java.lang.Throwable -> L58
            if (r13 != r1) goto L51
            return r1
        L51:
            com.stripe.android.model.WeChatPayNextAction r13 = (com.stripe.android.model.WeChatPayNextAction) r13     // Catch: java.lang.Throwable -> L58
            java.lang.Object r10 = vz.q.b(r13)     // Catch: java.lang.Throwable -> L58
            goto L63
        L58:
            r10 = move-exception
            vz.q$a r11 = vz.q.f54772b
            java.lang.Object r10 = vz.r.a(r10)
            java.lang.Object r10 = vz.q.b(r10)
        L63:
            java.lang.Throwable r11 = vz.q.e(r10)
            if (r11 != 0) goto L6a
            return r10
        L6a:
            com.stripe.android.core.exception.StripeException$Companion r10 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r10 = r10.create(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.confirmWeChatPayPayment(com.stripe.android.Stripe, com.stripe.android.model.ConfirmPaymentIntentParams, java.lang.String, zz.d):java.lang.Object");
    }

    public static /* synthetic */ Object confirmWeChatPayPayment$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, zz.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = stripe.getStripeAccountId$payments_core_release();
        }
        return confirmWeChatPayPayment(stripe, confirmPaymentIntentParams, str, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007c, code lost:
        r5 = vz.q.f54772b;
        r4 = vz.q.b(vz.r.a(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0050 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:44:0x0025, B:52:0x004c, B:54:0x0050, B:55:0x0055, B:56:0x007a, B:49:0x0034), top: B:65:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0055 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:44:0x0025, B:52:0x004c, B:54:0x0050, B:55:0x0055, B:56:0x007a, B:49:0x0034), top: B:65:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object createAccountToken(com.stripe.android.Stripe r4, com.stripe.android.model.AccountParams r5, java.lang.String r6, java.lang.String r7, zz.d<? super com.stripe.android.model.Token> r8) {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createAccountToken$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.StripeKtxKt$createAccountToken$1 r0 = (com.stripe.android.StripeKtxKt$createAccountToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$createAccountToken$1 r0 = new com.stripe.android.StripeKtxKt$createAccountToken$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r8)     // Catch: java.lang.Throwable -> L7b
            goto L4c
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            vz.r.b(r8)
            vz.q$a r8 = vz.q.f54772b     // Catch: java.lang.Throwable -> L7b
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L7b
            com.stripe.android.core.networking.ApiRequest$Options r2 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r4, r7, r6)     // Catch: java.lang.Throwable -> L7b
            r0.label = r3     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r8 = r8.createToken$payments_core_release(r5, r2, r0)     // Catch: java.lang.Throwable -> L7b
            if (r8 != r1) goto L4c
            return r1
        L4c:
            com.stripe.android.model.Token r8 = (com.stripe.android.model.Token) r8     // Catch: java.lang.Throwable -> L7b
            if (r8 == 0) goto L55
            java.lang.Object r4 = vz.q.b(r8)     // Catch: java.lang.Throwable -> L7b
            goto L86
        L55:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r4.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.Class<com.stripe.android.model.Token> r5 = com.stripe.android.model.Token.class
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L7b
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            r5 = 46
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7b
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7b
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L7b
            throw r5     // Catch: java.lang.Throwable -> L7b
        L7b:
            r4 = move-exception
            vz.q$a r5 = vz.q.f54772b
            java.lang.Object r4 = vz.r.a(r4)
            java.lang.Object r4 = vz.q.b(r4)
        L86:
            java.lang.Throwable r5 = vz.q.e(r4)
            if (r5 != 0) goto L8f
            com.stripe.android.core.model.StripeModel r4 = (com.stripe.android.core.model.StripeModel) r4
            return r4
        L8f:
            com.stripe.android.core.exception.StripeException$Companion r4 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r4 = r4.create(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createAccountToken(com.stripe.android.Stripe, com.stripe.android.model.AccountParams, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    public static /* synthetic */ Object createAccountToken$default(Stripe stripe, AccountParams accountParams, String str, String str2, zz.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createAccountToken(stripe, accountParams, str, str2, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007c, code lost:
        r5 = vz.q.f54772b;
        r4 = vz.q.b(vz.r.a(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0050 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:44:0x0025, B:52:0x004c, B:54:0x0050, B:55:0x0055, B:56:0x007a, B:49:0x0034), top: B:65:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0055 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:44:0x0025, B:52:0x004c, B:54:0x0050, B:55:0x0055, B:56:0x007a, B:49:0x0034), top: B:65:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object createBankAccountToken(com.stripe.android.Stripe r4, com.stripe.android.model.BankAccountTokenParams r5, java.lang.String r6, java.lang.String r7, zz.d<? super com.stripe.android.model.Token> r8) {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createBankAccountToken$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.StripeKtxKt$createBankAccountToken$1 r0 = (com.stripe.android.StripeKtxKt$createBankAccountToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$createBankAccountToken$1 r0 = new com.stripe.android.StripeKtxKt$createBankAccountToken$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r8)     // Catch: java.lang.Throwable -> L7b
            goto L4c
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            vz.r.b(r8)
            vz.q$a r8 = vz.q.f54772b     // Catch: java.lang.Throwable -> L7b
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L7b
            com.stripe.android.core.networking.ApiRequest$Options r2 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r4, r7, r6)     // Catch: java.lang.Throwable -> L7b
            r0.label = r3     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r8 = r8.createToken$payments_core_release(r5, r2, r0)     // Catch: java.lang.Throwable -> L7b
            if (r8 != r1) goto L4c
            return r1
        L4c:
            com.stripe.android.model.Token r8 = (com.stripe.android.model.Token) r8     // Catch: java.lang.Throwable -> L7b
            if (r8 == 0) goto L55
            java.lang.Object r4 = vz.q.b(r8)     // Catch: java.lang.Throwable -> L7b
            goto L86
        L55:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r4.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.Class<com.stripe.android.model.Token> r5 = com.stripe.android.model.Token.class
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L7b
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            r5 = 46
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7b
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7b
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L7b
            throw r5     // Catch: java.lang.Throwable -> L7b
        L7b:
            r4 = move-exception
            vz.q$a r5 = vz.q.f54772b
            java.lang.Object r4 = vz.r.a(r4)
            java.lang.Object r4 = vz.q.b(r4)
        L86:
            java.lang.Throwable r5 = vz.q.e(r4)
            if (r5 != 0) goto L8f
            com.stripe.android.core.model.StripeModel r4 = (com.stripe.android.core.model.StripeModel) r4
            return r4
        L8f:
            com.stripe.android.core.exception.StripeException$Companion r4 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r4 = r4.create(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createBankAccountToken(com.stripe.android.Stripe, com.stripe.android.model.BankAccountTokenParams, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    public static /* synthetic */ Object createBankAccountToken$default(Stripe stripe, BankAccountTokenParams bankAccountTokenParams, String str, String str2, zz.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createBankAccountToken(stripe, bankAccountTokenParams, str, str2, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007c, code lost:
        r5 = vz.q.f54772b;
        r4 = vz.q.b(vz.r.a(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0050 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:44:0x0025, B:52:0x004c, B:54:0x0050, B:55:0x0055, B:56:0x007a, B:49:0x0034), top: B:65:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0055 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:44:0x0025, B:52:0x004c, B:54:0x0050, B:55:0x0055, B:56:0x007a, B:49:0x0034), top: B:65:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object createCardToken(com.stripe.android.Stripe r4, com.stripe.android.model.CardParams r5, java.lang.String r6, java.lang.String r7, zz.d<? super com.stripe.android.model.Token> r8) {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createCardToken$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.StripeKtxKt$createCardToken$1 r0 = (com.stripe.android.StripeKtxKt$createCardToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$createCardToken$1 r0 = new com.stripe.android.StripeKtxKt$createCardToken$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r8)     // Catch: java.lang.Throwable -> L7b
            goto L4c
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            vz.r.b(r8)
            vz.q$a r8 = vz.q.f54772b     // Catch: java.lang.Throwable -> L7b
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L7b
            com.stripe.android.core.networking.ApiRequest$Options r2 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r4, r7, r6)     // Catch: java.lang.Throwable -> L7b
            r0.label = r3     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r8 = r8.createToken$payments_core_release(r5, r2, r0)     // Catch: java.lang.Throwable -> L7b
            if (r8 != r1) goto L4c
            return r1
        L4c:
            com.stripe.android.model.Token r8 = (com.stripe.android.model.Token) r8     // Catch: java.lang.Throwable -> L7b
            if (r8 == 0) goto L55
            java.lang.Object r4 = vz.q.b(r8)     // Catch: java.lang.Throwable -> L7b
            goto L86
        L55:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r4.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.Class<com.stripe.android.model.Token> r5 = com.stripe.android.model.Token.class
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L7b
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            r5 = 46
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7b
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7b
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L7b
            throw r5     // Catch: java.lang.Throwable -> L7b
        L7b:
            r4 = move-exception
            vz.q$a r5 = vz.q.f54772b
            java.lang.Object r4 = vz.r.a(r4)
            java.lang.Object r4 = vz.q.b(r4)
        L86:
            java.lang.Throwable r5 = vz.q.e(r4)
            if (r5 != 0) goto L8f
            com.stripe.android.core.model.StripeModel r4 = (com.stripe.android.core.model.StripeModel) r4
            return r4
        L8f:
            com.stripe.android.core.exception.StripeException$Companion r4 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r4 = r4.create(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createCardToken(com.stripe.android.Stripe, com.stripe.android.model.CardParams, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    public static /* synthetic */ Object createCardToken$default(Stripe stripe, CardParams cardParams, String str, String str2, zz.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createCardToken(stripe, cardParams, str, str2, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0080, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0081, code lost:
        r5 = vz.q.f54772b;
        r4 = vz.q.b(vz.r.a(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0055 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:44:0x0025, B:52:0x0051, B:54:0x0055, B:55:0x005a, B:56:0x007f, B:49:0x0034), top: B:65:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:44:0x0025, B:52:0x0051, B:54:0x0055, B:55:0x005a, B:56:0x007f, B:49:0x0034), top: B:65:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object createCvcUpdateToken(com.stripe.android.Stripe r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, zz.d<? super com.stripe.android.model.Token> r8) {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createCvcUpdateToken$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.StripeKtxKt$createCvcUpdateToken$1 r0 = (com.stripe.android.StripeKtxKt$createCvcUpdateToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$createCvcUpdateToken$1 r0 = new com.stripe.android.StripeKtxKt$createCvcUpdateToken$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r8)     // Catch: java.lang.Throwable -> L80
            goto L51
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            vz.r.b(r8)
            vz.q$a r8 = vz.q.f54772b     // Catch: java.lang.Throwable -> L80
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L80
            com.stripe.android.model.CvcTokenParams r2 = new com.stripe.android.model.CvcTokenParams     // Catch: java.lang.Throwable -> L80
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L80
            com.stripe.android.core.networking.ApiRequest$Options r5 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L80
            r5.<init>(r4, r7, r6)     // Catch: java.lang.Throwable -> L80
            r0.label = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r8 = r8.createToken$payments_core_release(r2, r5, r0)     // Catch: java.lang.Throwable -> L80
            if (r8 != r1) goto L51
            return r1
        L51:
            com.stripe.android.model.Token r8 = (com.stripe.android.model.Token) r8     // Catch: java.lang.Throwable -> L80
            if (r8 == 0) goto L5a
            java.lang.Object r4 = vz.q.b(r8)     // Catch: java.lang.Throwable -> L80
            goto L8b
        L5a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80
            r4.<init>()     // Catch: java.lang.Throwable -> L80
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch: java.lang.Throwable -> L80
            java.lang.Class<com.stripe.android.model.Token> r5 = com.stripe.android.model.Token.class
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L80
            r4.append(r5)     // Catch: java.lang.Throwable -> L80
            r5 = 46
            r4.append(r5)     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L80
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L80
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L80
            throw r5     // Catch: java.lang.Throwable -> L80
        L80:
            r4 = move-exception
            vz.q$a r5 = vz.q.f54772b
            java.lang.Object r4 = vz.r.a(r4)
            java.lang.Object r4 = vz.q.b(r4)
        L8b:
            java.lang.Throwable r5 = vz.q.e(r4)
            if (r5 != 0) goto L94
            com.stripe.android.core.model.StripeModel r4 = (com.stripe.android.core.model.StripeModel) r4
            return r4
        L94:
            com.stripe.android.core.exception.StripeException$Companion r4 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r4 = r4.create(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createCvcUpdateToken(com.stripe.android.Stripe, java.lang.String, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    public static /* synthetic */ Object createCvcUpdateToken$default(Stripe stripe, String str, String str2, String str3, zz.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = stripe.getStripeAccountId$payments_core_release();
        }
        return createCvcUpdateToken(stripe, str, str2, str3, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007c, code lost:
        r5 = vz.q.f54772b;
        r4 = vz.q.b(vz.r.a(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0050 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:44:0x0025, B:52:0x004c, B:54:0x0050, B:55:0x0055, B:56:0x007a, B:49:0x0034), top: B:65:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0055 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:44:0x0025, B:52:0x004c, B:54:0x0050, B:55:0x0055, B:56:0x007a, B:49:0x0034), top: B:65:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object createFile(com.stripe.android.Stripe r4, com.stripe.android.core.model.StripeFileParams r5, java.lang.String r6, java.lang.String r7, zz.d<? super com.stripe.android.core.model.StripeFile> r8) {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createFile$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.StripeKtxKt$createFile$1 r0 = (com.stripe.android.StripeKtxKt$createFile$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$createFile$1 r0 = new com.stripe.android.StripeKtxKt$createFile$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r8)     // Catch: java.lang.Throwable -> L7b
            goto L4c
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            vz.r.b(r8)
            vz.q$a r8 = vz.q.f54772b     // Catch: java.lang.Throwable -> L7b
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L7b
            com.stripe.android.core.networking.ApiRequest$Options r2 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r4, r7, r6)     // Catch: java.lang.Throwable -> L7b
            r0.label = r3     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r8 = r8.createFile$payments_core_release(r5, r2, r0)     // Catch: java.lang.Throwable -> L7b
            if (r8 != r1) goto L4c
            return r1
        L4c:
            com.stripe.android.core.model.StripeFile r8 = (com.stripe.android.core.model.StripeFile) r8     // Catch: java.lang.Throwable -> L7b
            if (r8 == 0) goto L55
            java.lang.Object r4 = vz.q.b(r8)     // Catch: java.lang.Throwable -> L7b
            goto L86
        L55:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r4.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.Class<com.stripe.android.core.model.StripeFile> r5 = com.stripe.android.core.model.StripeFile.class
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L7b
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            r5 = 46
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7b
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7b
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L7b
            throw r5     // Catch: java.lang.Throwable -> L7b
        L7b:
            r4 = move-exception
            vz.q$a r5 = vz.q.f54772b
            java.lang.Object r4 = vz.r.a(r4)
            java.lang.Object r4 = vz.q.b(r4)
        L86:
            java.lang.Throwable r5 = vz.q.e(r4)
            if (r5 != 0) goto L8f
            com.stripe.android.core.model.StripeModel r4 = (com.stripe.android.core.model.StripeModel) r4
            return r4
        L8f:
            com.stripe.android.core.exception.StripeException$Companion r4 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r4 = r4.create(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createFile(com.stripe.android.Stripe, com.stripe.android.core.model.StripeFileParams, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    public static /* synthetic */ Object createFile$default(Stripe stripe, StripeFileParams stripeFileParams, String str, String str2, zz.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createFile(stripe, stripeFileParams, str, str2, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007c, code lost:
        r5 = vz.q.f54772b;
        r4 = vz.q.b(vz.r.a(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0050 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:44:0x0025, B:52:0x004c, B:54:0x0050, B:55:0x0055, B:56:0x007a, B:49:0x0034), top: B:65:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0055 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:44:0x0025, B:52:0x004c, B:54:0x0050, B:55:0x0055, B:56:0x007a, B:49:0x0034), top: B:65:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object createPaymentMethod(com.stripe.android.Stripe r4, com.stripe.android.model.PaymentMethodCreateParams r5, java.lang.String r6, java.lang.String r7, zz.d<? super com.stripe.android.model.PaymentMethod> r8) {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createPaymentMethod$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.StripeKtxKt$createPaymentMethod$1 r0 = (com.stripe.android.StripeKtxKt$createPaymentMethod$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$createPaymentMethod$1 r0 = new com.stripe.android.StripeKtxKt$createPaymentMethod$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r8)     // Catch: java.lang.Throwable -> L7b
            goto L4c
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            vz.r.b(r8)
            vz.q$a r8 = vz.q.f54772b     // Catch: java.lang.Throwable -> L7b
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L7b
            com.stripe.android.core.networking.ApiRequest$Options r2 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r4, r7, r6)     // Catch: java.lang.Throwable -> L7b
            r0.label = r3     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r8 = r8.createPaymentMethod(r5, r2, r0)     // Catch: java.lang.Throwable -> L7b
            if (r8 != r1) goto L4c
            return r1
        L4c:
            com.stripe.android.model.PaymentMethod r8 = (com.stripe.android.model.PaymentMethod) r8     // Catch: java.lang.Throwable -> L7b
            if (r8 == 0) goto L55
            java.lang.Object r4 = vz.q.b(r8)     // Catch: java.lang.Throwable -> L7b
            goto L86
        L55:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r4.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.Class<com.stripe.android.model.PaymentMethod> r5 = com.stripe.android.model.PaymentMethod.class
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L7b
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            r5 = 46
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7b
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7b
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L7b
            throw r5     // Catch: java.lang.Throwable -> L7b
        L7b:
            r4 = move-exception
            vz.q$a r5 = vz.q.f54772b
            java.lang.Object r4 = vz.r.a(r4)
            java.lang.Object r4 = vz.q.b(r4)
        L86:
            java.lang.Throwable r5 = vz.q.e(r4)
            if (r5 != 0) goto L8f
            com.stripe.android.core.model.StripeModel r4 = (com.stripe.android.core.model.StripeModel) r4
            return r4
        L8f:
            com.stripe.android.core.exception.StripeException$Companion r4 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r4 = r4.create(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createPaymentMethod(com.stripe.android.Stripe, com.stripe.android.model.PaymentMethodCreateParams, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    public static /* synthetic */ Object createPaymentMethod$default(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, zz.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createPaymentMethod(stripe, paymentMethodCreateParams, str, str2, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007c, code lost:
        r5 = vz.q.f54772b;
        r4 = vz.q.b(vz.r.a(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0050 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:44:0x0025, B:52:0x004c, B:54:0x0050, B:55:0x0055, B:56:0x007a, B:49:0x0034), top: B:65:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0055 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:44:0x0025, B:52:0x004c, B:54:0x0050, B:55:0x0055, B:56:0x007a, B:49:0x0034), top: B:65:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object createPersonToken(com.stripe.android.Stripe r4, com.stripe.android.model.PersonTokenParams r5, java.lang.String r6, java.lang.String r7, zz.d<? super com.stripe.android.model.Token> r8) {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createPersonToken$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.StripeKtxKt$createPersonToken$1 r0 = (com.stripe.android.StripeKtxKt$createPersonToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$createPersonToken$1 r0 = new com.stripe.android.StripeKtxKt$createPersonToken$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r8)     // Catch: java.lang.Throwable -> L7b
            goto L4c
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            vz.r.b(r8)
            vz.q$a r8 = vz.q.f54772b     // Catch: java.lang.Throwable -> L7b
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L7b
            com.stripe.android.core.networking.ApiRequest$Options r2 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r4, r7, r6)     // Catch: java.lang.Throwable -> L7b
            r0.label = r3     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r8 = r8.createToken$payments_core_release(r5, r2, r0)     // Catch: java.lang.Throwable -> L7b
            if (r8 != r1) goto L4c
            return r1
        L4c:
            com.stripe.android.model.Token r8 = (com.stripe.android.model.Token) r8     // Catch: java.lang.Throwable -> L7b
            if (r8 == 0) goto L55
            java.lang.Object r4 = vz.q.b(r8)     // Catch: java.lang.Throwable -> L7b
            goto L86
        L55:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r4.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.Class<com.stripe.android.model.Token> r5 = com.stripe.android.model.Token.class
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L7b
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            r5 = 46
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7b
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7b
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L7b
            throw r5     // Catch: java.lang.Throwable -> L7b
        L7b:
            r4 = move-exception
            vz.q$a r5 = vz.q.f54772b
            java.lang.Object r4 = vz.r.a(r4)
            java.lang.Object r4 = vz.q.b(r4)
        L86:
            java.lang.Throwable r5 = vz.q.e(r4)
            if (r5 != 0) goto L8f
            com.stripe.android.core.model.StripeModel r4 = (com.stripe.android.core.model.StripeModel) r4
            return r4
        L8f:
            com.stripe.android.core.exception.StripeException$Companion r4 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r4 = r4.create(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createPersonToken(com.stripe.android.Stripe, com.stripe.android.model.PersonTokenParams, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    public static /* synthetic */ Object createPersonToken$default(Stripe stripe, PersonTokenParams personTokenParams, String str, String str2, zz.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createPersonToken(stripe, personTokenParams, str, str2, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0080, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0081, code lost:
        r5 = vz.q.f54772b;
        r4 = vz.q.b(vz.r.a(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0055 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:44:0x0025, B:52:0x0051, B:54:0x0055, B:55:0x005a, B:56:0x007f, B:49:0x0034), top: B:65:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:44:0x0025, B:52:0x0051, B:54:0x0055, B:55:0x005a, B:56:0x007f, B:49:0x0034), top: B:65:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object createPiiToken(com.stripe.android.Stripe r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, zz.d<? super com.stripe.android.model.Token> r8) {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createPiiToken$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.StripeKtxKt$createPiiToken$1 r0 = (com.stripe.android.StripeKtxKt$createPiiToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$createPiiToken$1 r0 = new com.stripe.android.StripeKtxKt$createPiiToken$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r8)     // Catch: java.lang.Throwable -> L80
            goto L51
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            vz.r.b(r8)
            vz.q$a r8 = vz.q.f54772b     // Catch: java.lang.Throwable -> L80
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L80
            com.stripe.android.model.PiiTokenParams r2 = new com.stripe.android.model.PiiTokenParams     // Catch: java.lang.Throwable -> L80
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L80
            com.stripe.android.core.networking.ApiRequest$Options r5 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L80
            r5.<init>(r4, r7, r6)     // Catch: java.lang.Throwable -> L80
            r0.label = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r8 = r8.createToken$payments_core_release(r2, r5, r0)     // Catch: java.lang.Throwable -> L80
            if (r8 != r1) goto L51
            return r1
        L51:
            com.stripe.android.model.Token r8 = (com.stripe.android.model.Token) r8     // Catch: java.lang.Throwable -> L80
            if (r8 == 0) goto L5a
            java.lang.Object r4 = vz.q.b(r8)     // Catch: java.lang.Throwable -> L80
            goto L8b
        L5a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80
            r4.<init>()     // Catch: java.lang.Throwable -> L80
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch: java.lang.Throwable -> L80
            java.lang.Class<com.stripe.android.model.Token> r5 = com.stripe.android.model.Token.class
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L80
            r4.append(r5)     // Catch: java.lang.Throwable -> L80
            r5 = 46
            r4.append(r5)     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L80
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L80
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L80
            throw r5     // Catch: java.lang.Throwable -> L80
        L80:
            r4 = move-exception
            vz.q$a r5 = vz.q.f54772b
            java.lang.Object r4 = vz.r.a(r4)
            java.lang.Object r4 = vz.q.b(r4)
        L8b:
            java.lang.Throwable r5 = vz.q.e(r4)
            if (r5 != 0) goto L94
            com.stripe.android.core.model.StripeModel r4 = (com.stripe.android.core.model.StripeModel) r4
            return r4
        L94:
            com.stripe.android.core.exception.StripeException$Companion r4 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r4 = r4.create(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createPiiToken(com.stripe.android.Stripe, java.lang.String, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    public static /* synthetic */ Object createPiiToken$default(Stripe stripe, String str, String str2, String str3, zz.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = stripe.getStripeAccountId$payments_core_release();
        }
        return createPiiToken(stripe, str, str2, str3, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0083, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0084, code lost:
        r11 = vz.q.f54772b;
        r10 = vz.q.b(vz.r.a(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0058 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:44:0x0025, B:52:0x0054, B:54:0x0058, B:55:0x005d, B:56:0x0082, B:49:0x0034), top: B:65:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005d A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:44:0x0025, B:52:0x0054, B:54:0x0058, B:55:0x005d, B:56:0x0082, B:49:0x0034), top: B:65:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object createRadarSession(com.stripe.android.Stripe r10, zz.d<? super com.stripe.android.model.RadarSession> r11) {
        /*
            boolean r0 = r11 instanceof com.stripe.android.StripeKtxKt$createRadarSession$1
            if (r0 == 0) goto L13
            r0 = r11
            com.stripe.android.StripeKtxKt$createRadarSession$1 r0 = (com.stripe.android.StripeKtxKt$createRadarSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$createRadarSession$1 r0 = new com.stripe.android.StripeKtxKt$createRadarSession$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r11)     // Catch: java.lang.Throwable -> L83
            goto L54
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            vz.r.b(r11)
            vz.q$a r11 = vz.q.f54772b     // Catch: java.lang.Throwable -> L83
            com.stripe.android.networking.StripeRepository r11 = r10.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L83
            com.stripe.android.core.networking.ApiRequest$Options r2 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L83
            java.lang.String r5 = r10.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = r10.getStripeAccountId$payments_core_release()     // Catch: java.lang.Throwable -> L83
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L83
            r0.label = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r11 = r11.createRadarSession$payments_core_release(r2, r0)     // Catch: java.lang.Throwable -> L83
            if (r11 != r1) goto L54
            return r1
        L54:
            com.stripe.android.model.RadarSession r11 = (com.stripe.android.model.RadarSession) r11     // Catch: java.lang.Throwable -> L83
            if (r11 == 0) goto L5d
            java.lang.Object r10 = vz.q.b(r11)     // Catch: java.lang.Throwable -> L83
            goto L8e
        L5d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r10.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r11 = "Failed to parse "
            r10.append(r11)     // Catch: java.lang.Throwable -> L83
            java.lang.Class<com.stripe.android.model.RadarSession> r11 = com.stripe.android.model.RadarSession.class
            java.lang.String r11 = r11.getSimpleName()     // Catch: java.lang.Throwable -> L83
            r10.append(r11)     // Catch: java.lang.Throwable -> L83
            r11 = 46
            r10.append(r11)     // Catch: java.lang.Throwable -> L83
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L83
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L83
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L83
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L83
            throw r11     // Catch: java.lang.Throwable -> L83
        L83:
            r10 = move-exception
            vz.q$a r11 = vz.q.f54772b
            java.lang.Object r10 = vz.r.a(r10)
            java.lang.Object r10 = vz.q.b(r10)
        L8e:
            java.lang.Throwable r11 = vz.q.e(r10)
            if (r11 != 0) goto L97
            com.stripe.android.core.model.StripeModel r10 = (com.stripe.android.core.model.StripeModel) r10
            return r10
        L97:
            com.stripe.android.core.exception.StripeException$Companion r10 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r10 = r10.create(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createRadarSession(com.stripe.android.Stripe, zz.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007c, code lost:
        r5 = vz.q.f54772b;
        r4 = vz.q.b(vz.r.a(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0050 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:44:0x0025, B:52:0x004c, B:54:0x0050, B:55:0x0055, B:56:0x007a, B:49:0x0034), top: B:65:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0055 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:44:0x0025, B:52:0x004c, B:54:0x0050, B:55:0x0055, B:56:0x007a, B:49:0x0034), top: B:65:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object createSource(com.stripe.android.Stripe r4, com.stripe.android.model.SourceParams r5, java.lang.String r6, java.lang.String r7, zz.d<? super com.stripe.android.model.Source> r8) {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createSource$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.StripeKtxKt$createSource$1 r0 = (com.stripe.android.StripeKtxKt$createSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$createSource$1 r0 = new com.stripe.android.StripeKtxKt$createSource$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r8)     // Catch: java.lang.Throwable -> L7b
            goto L4c
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            vz.r.b(r8)
            vz.q$a r8 = vz.q.f54772b     // Catch: java.lang.Throwable -> L7b
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L7b
            com.stripe.android.core.networking.ApiRequest$Options r2 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r4, r7, r6)     // Catch: java.lang.Throwable -> L7b
            r0.label = r3     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r8 = r8.createSource$payments_core_release(r5, r2, r0)     // Catch: java.lang.Throwable -> L7b
            if (r8 != r1) goto L4c
            return r1
        L4c:
            com.stripe.android.model.Source r8 = (com.stripe.android.model.Source) r8     // Catch: java.lang.Throwable -> L7b
            if (r8 == 0) goto L55
            java.lang.Object r4 = vz.q.b(r8)     // Catch: java.lang.Throwable -> L7b
            goto L86
        L55:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r4.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.Class<com.stripe.android.model.Source> r5 = com.stripe.android.model.Source.class
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L7b
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            r5 = 46
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7b
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7b
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L7b
            throw r5     // Catch: java.lang.Throwable -> L7b
        L7b:
            r4 = move-exception
            vz.q$a r5 = vz.q.f54772b
            java.lang.Object r4 = vz.r.a(r4)
            java.lang.Object r4 = vz.q.b(r4)
        L86:
            java.lang.Throwable r5 = vz.q.e(r4)
            if (r5 != 0) goto L8f
            com.stripe.android.core.model.StripeModel r4 = (com.stripe.android.core.model.StripeModel) r4
            return r4
        L8f:
            com.stripe.android.core.exception.StripeException$Companion r4 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r4 = r4.create(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createSource(com.stripe.android.Stripe, com.stripe.android.model.SourceParams, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    public static /* synthetic */ Object createSource$default(Stripe stripe, SourceParams sourceParams, String str, String str2, zz.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createSource(stripe, sourceParams, str, str2, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(2:24|(1:26))(2:27|28))|11|12|(2:14|15)(2:17|18)))|31|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0076, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0077, code lost:
        r5 = vz.q.f54772b;
        r4 = vz.q.b(vz.r.a(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object getAuthenticateSourceResult(com.stripe.android.Stripe r4, int r5, android.content.Intent r6, zz.d<? super com.stripe.android.model.Source> r7) {
        /*
            boolean r0 = r7 instanceof com.stripe.android.StripeKtxKt$getAuthenticateSourceResult$1
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.StripeKtxKt$getAuthenticateSourceResult$1 r0 = (com.stripe.android.StripeKtxKt$getAuthenticateSourceResult$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$getAuthenticateSourceResult$1 r0 = new com.stripe.android.StripeKtxKt$getAuthenticateSourceResult$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r7)     // Catch: java.lang.Throwable -> L76
            goto L49
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            vz.r.b(r7)
            boolean r5 = r4.isAuthenticateSourceResult(r5, r6)
            vz.q$a r7 = vz.q.f54772b     // Catch: java.lang.Throwable -> L76
            if (r5 == 0) goto L50
            com.stripe.android.PaymentController r4 = r4.getPaymentController$payments_core_release()     // Catch: java.lang.Throwable -> L76
            r0.label = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r7 = r4.getAuthenticateSourceResult(r6, r0)     // Catch: java.lang.Throwable -> L76
            if (r7 != r1) goto L49
            return r1
        L49:
            com.stripe.android.model.Source r7 = (com.stripe.android.model.Source) r7     // Catch: java.lang.Throwable -> L76
            java.lang.Object r4 = vz.q.b(r7)     // Catch: java.lang.Throwable -> L76
            goto L81
        L50:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r4.<init>()     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = "Incorrect requestCode and data for "
            r4.append(r5)     // Catch: java.lang.Throwable -> L76
            java.lang.Class<com.stripe.android.model.Source> r5 = com.stripe.android.model.Source.class
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L76
            r4.append(r5)     // Catch: java.lang.Throwable -> L76
            r5 = 46
            r4.append(r5)     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L76
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L76
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L76
            throw r5     // Catch: java.lang.Throwable -> L76
        L76:
            r4 = move-exception
            vz.q$a r5 = vz.q.f54772b
            java.lang.Object r4 = vz.r.a(r4)
            java.lang.Object r4 = vz.q.b(r4)
        L81:
            java.lang.Throwable r5 = vz.q.e(r4)
            if (r5 != 0) goto L8a
            com.stripe.android.core.model.StripeModel r4 = (com.stripe.android.core.model.StripeModel) r4
            return r4
        L8a:
            com.stripe.android.core.exception.StripeException$Companion r4 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r4 = r4.create(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.getAuthenticateSourceResult(com.stripe.android.Stripe, int, android.content.Intent, zz.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(2:24|(1:26))(2:27|28))|11|12|(2:14|15)(2:17|18)))|31|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0076, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0077, code lost:
        r5 = vz.q.f54772b;
        r4 = vz.q.b(vz.r.a(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object getPaymentIntentResult(com.stripe.android.Stripe r4, int r5, android.content.Intent r6, zz.d<? super com.stripe.android.PaymentIntentResult> r7) {
        /*
            boolean r0 = r7 instanceof com.stripe.android.StripeKtxKt$getPaymentIntentResult$1
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.StripeKtxKt$getPaymentIntentResult$1 r0 = (com.stripe.android.StripeKtxKt$getPaymentIntentResult$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$getPaymentIntentResult$1 r0 = new com.stripe.android.StripeKtxKt$getPaymentIntentResult$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r7)     // Catch: java.lang.Throwable -> L76
            goto L49
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            vz.r.b(r7)
            boolean r5 = r4.isPaymentResult(r5, r6)
            vz.q$a r7 = vz.q.f54772b     // Catch: java.lang.Throwable -> L76
            if (r5 == 0) goto L50
            com.stripe.android.PaymentController r4 = r4.getPaymentController$payments_core_release()     // Catch: java.lang.Throwable -> L76
            r0.label = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r7 = r4.getPaymentIntentResult(r6, r0)     // Catch: java.lang.Throwable -> L76
            if (r7 != r1) goto L49
            return r1
        L49:
            com.stripe.android.PaymentIntentResult r7 = (com.stripe.android.PaymentIntentResult) r7     // Catch: java.lang.Throwable -> L76
            java.lang.Object r4 = vz.q.b(r7)     // Catch: java.lang.Throwable -> L76
            goto L81
        L50:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r4.<init>()     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = "Incorrect requestCode and data for "
            r4.append(r5)     // Catch: java.lang.Throwable -> L76
            java.lang.Class<com.stripe.android.PaymentIntentResult> r5 = com.stripe.android.PaymentIntentResult.class
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L76
            r4.append(r5)     // Catch: java.lang.Throwable -> L76
            r5 = 46
            r4.append(r5)     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L76
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L76
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L76
            throw r5     // Catch: java.lang.Throwable -> L76
        L76:
            r4 = move-exception
            vz.q$a r5 = vz.q.f54772b
            java.lang.Object r4 = vz.r.a(r4)
            java.lang.Object r4 = vz.q.b(r4)
        L81:
            java.lang.Throwable r5 = vz.q.e(r4)
            if (r5 != 0) goto L8a
            com.stripe.android.core.model.StripeModel r4 = (com.stripe.android.core.model.StripeModel) r4
            return r4
        L8a:
            com.stripe.android.core.exception.StripeException$Companion r4 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r4 = r4.create(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.getPaymentIntentResult(com.stripe.android.Stripe, int, android.content.Intent, zz.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(2:24|(1:26))(2:27|28))|11|12|(2:14|15)(2:17|18)))|31|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0076, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0077, code lost:
        r5 = vz.q.f54772b;
        r4 = vz.q.b(vz.r.a(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object getSetupIntentResult(com.stripe.android.Stripe r4, int r5, android.content.Intent r6, zz.d<? super com.stripe.android.SetupIntentResult> r7) {
        /*
            boolean r0 = r7 instanceof com.stripe.android.StripeKtxKt$getSetupIntentResult$1
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.StripeKtxKt$getSetupIntentResult$1 r0 = (com.stripe.android.StripeKtxKt$getSetupIntentResult$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$getSetupIntentResult$1 r0 = new com.stripe.android.StripeKtxKt$getSetupIntentResult$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r7)     // Catch: java.lang.Throwable -> L76
            goto L49
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            vz.r.b(r7)
            boolean r5 = r4.isSetupResult(r5, r6)
            vz.q$a r7 = vz.q.f54772b     // Catch: java.lang.Throwable -> L76
            if (r5 == 0) goto L50
            com.stripe.android.PaymentController r4 = r4.getPaymentController$payments_core_release()     // Catch: java.lang.Throwable -> L76
            r0.label = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r7 = r4.getSetupIntentResult(r6, r0)     // Catch: java.lang.Throwable -> L76
            if (r7 != r1) goto L49
            return r1
        L49:
            com.stripe.android.SetupIntentResult r7 = (com.stripe.android.SetupIntentResult) r7     // Catch: java.lang.Throwable -> L76
            java.lang.Object r4 = vz.q.b(r7)     // Catch: java.lang.Throwable -> L76
            goto L81
        L50:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r4.<init>()     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = "Incorrect requestCode and data for "
            r4.append(r5)     // Catch: java.lang.Throwable -> L76
            java.lang.Class<com.stripe.android.SetupIntentResult> r5 = com.stripe.android.SetupIntentResult.class
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L76
            r4.append(r5)     // Catch: java.lang.Throwable -> L76
            r5 = 46
            r4.append(r5)     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L76
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L76
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L76
            throw r5     // Catch: java.lang.Throwable -> L76
        L76:
            r4 = move-exception
            vz.q$a r5 = vz.q.f54772b
            java.lang.Object r4 = vz.r.a(r4)
            java.lang.Object r4 = vz.q.b(r4)
        L81:
            java.lang.Throwable r5 = vz.q.e(r4)
            if (r5 != 0) goto L8a
            com.stripe.android.core.model.StripeModel r4 = (com.stripe.android.core.model.StripeModel) r4
            return r4
        L8a:
            com.stripe.android.core.exception.StripeException$Companion r4 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r4 = r4.create(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.getSetupIntentResult(com.stripe.android.Stripe, int, android.content.Intent, zz.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0085, code lost:
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
        r13 = vz.q.f54772b;
        r12 = vz.q.b(vz.r.a(r12));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005a A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:44:0x0026, B:52:0x0056, B:54:0x005a, B:55:0x005f, B:56:0x0084, B:49:0x0035), top: B:65:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005f A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:44:0x0026, B:52:0x0056, B:54:0x005a, B:55:0x005f, B:56:0x0084, B:49:0x0035), top: B:65:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object retrievePaymentIntent(com.stripe.android.Stripe r12, java.lang.String r13, java.lang.String r14, zz.d<? super com.stripe.android.model.PaymentIntent> r15) {
        /*
            boolean r0 = r15 instanceof com.stripe.android.StripeKtxKt$retrievePaymentIntent$1
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.StripeKtxKt$retrievePaymentIntent$1 r0 = (com.stripe.android.StripeKtxKt$retrievePaymentIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$retrievePaymentIntent$1 r0 = new com.stripe.android.StripeKtxKt$retrievePaymentIntent$1
            r0.<init>(r15)
        L18:
            r5 = r0
            java.lang.Object r15 = r5.result
            java.lang.Object r0 = a00.b.d()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            vz.r.b(r15)     // Catch: java.lang.Throwable -> L85
            goto L56
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            vz.r.b(r15)
            vz.q$a r15 = vz.q.f54772b     // Catch: java.lang.Throwable -> L85
            com.stripe.android.networking.StripeRepository r1 = r12.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L85
            com.stripe.android.core.networking.ApiRequest$Options r3 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = r12.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L85
            r9 = 0
            r10 = 4
            r11 = 0
            r6 = r3
            r8 = r14
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L85
            r4 = 0
            r6 = 4
            r7 = 0
            r5.label = r2     // Catch: java.lang.Throwable -> L85
            r2 = r13
            java.lang.Object r15 = com.stripe.android.networking.StripeRepository.retrievePaymentIntent$default(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L85
            if (r15 != r0) goto L56
            return r0
        L56:
            com.stripe.android.model.PaymentIntent r15 = (com.stripe.android.model.PaymentIntent) r15     // Catch: java.lang.Throwable -> L85
            if (r15 == 0) goto L5f
            java.lang.Object r12 = vz.q.b(r15)     // Catch: java.lang.Throwable -> L85
            goto L90
        L5f:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r12.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r13 = "Failed to parse "
            r12.append(r13)     // Catch: java.lang.Throwable -> L85
            java.lang.Class<com.stripe.android.model.PaymentIntent> r13 = com.stripe.android.model.PaymentIntent.class
            java.lang.String r13 = r13.getSimpleName()     // Catch: java.lang.Throwable -> L85
            r12.append(r13)     // Catch: java.lang.Throwable -> L85
            r13 = 46
            r12.append(r13)     // Catch: java.lang.Throwable -> L85
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L85
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L85
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L85
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L85
            throw r13     // Catch: java.lang.Throwable -> L85
        L85:
            r12 = move-exception
            vz.q$a r13 = vz.q.f54772b
            java.lang.Object r12 = vz.r.a(r12)
            java.lang.Object r12 = vz.q.b(r12)
        L90:
            java.lang.Throwable r13 = vz.q.e(r12)
            if (r13 != 0) goto L99
            com.stripe.android.core.model.StripeModel r12 = (com.stripe.android.core.model.StripeModel) r12
            return r12
        L99:
            com.stripe.android.core.exception.StripeException$Companion r12 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r12 = r12.create(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.retrievePaymentIntent(com.stripe.android.Stripe, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    public static /* synthetic */ Object retrievePaymentIntent$default(Stripe stripe, String str, String str2, zz.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return retrievePaymentIntent(stripe, str, str2, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0085, code lost:
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
        r13 = vz.q.f54772b;
        r12 = vz.q.b(vz.r.a(r12));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005a A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:44:0x0026, B:52:0x0056, B:54:0x005a, B:55:0x005f, B:56:0x0084, B:49:0x0035), top: B:65:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005f A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:44:0x0026, B:52:0x0056, B:54:0x005a, B:55:0x005f, B:56:0x0084, B:49:0x0035), top: B:65:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object retrieveSetupIntent(com.stripe.android.Stripe r12, java.lang.String r13, java.lang.String r14, zz.d<? super com.stripe.android.model.SetupIntent> r15) {
        /*
            boolean r0 = r15 instanceof com.stripe.android.StripeKtxKt$retrieveSetupIntent$1
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.StripeKtxKt$retrieveSetupIntent$1 r0 = (com.stripe.android.StripeKtxKt$retrieveSetupIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$retrieveSetupIntent$1 r0 = new com.stripe.android.StripeKtxKt$retrieveSetupIntent$1
            r0.<init>(r15)
        L18:
            r5 = r0
            java.lang.Object r15 = r5.result
            java.lang.Object r0 = a00.b.d()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            vz.r.b(r15)     // Catch: java.lang.Throwable -> L85
            goto L56
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            vz.r.b(r15)
            vz.q$a r15 = vz.q.f54772b     // Catch: java.lang.Throwable -> L85
            com.stripe.android.networking.StripeRepository r1 = r12.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L85
            com.stripe.android.core.networking.ApiRequest$Options r3 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = r12.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L85
            r9 = 0
            r10 = 4
            r11 = 0
            r6 = r3
            r8 = r14
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L85
            r4 = 0
            r6 = 4
            r7 = 0
            r5.label = r2     // Catch: java.lang.Throwable -> L85
            r2 = r13
            java.lang.Object r15 = com.stripe.android.networking.StripeRepository.retrieveSetupIntent$default(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L85
            if (r15 != r0) goto L56
            return r0
        L56:
            com.stripe.android.model.SetupIntent r15 = (com.stripe.android.model.SetupIntent) r15     // Catch: java.lang.Throwable -> L85
            if (r15 == 0) goto L5f
            java.lang.Object r12 = vz.q.b(r15)     // Catch: java.lang.Throwable -> L85
            goto L90
        L5f:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r12.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r13 = "Failed to parse "
            r12.append(r13)     // Catch: java.lang.Throwable -> L85
            java.lang.Class<com.stripe.android.model.SetupIntent> r13 = com.stripe.android.model.SetupIntent.class
            java.lang.String r13 = r13.getSimpleName()     // Catch: java.lang.Throwable -> L85
            r12.append(r13)     // Catch: java.lang.Throwable -> L85
            r13 = 46
            r12.append(r13)     // Catch: java.lang.Throwable -> L85
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L85
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L85
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L85
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L85
            throw r13     // Catch: java.lang.Throwable -> L85
        L85:
            r12 = move-exception
            vz.q$a r13 = vz.q.f54772b
            java.lang.Object r12 = vz.r.a(r12)
            java.lang.Object r12 = vz.q.b(r12)
        L90:
            java.lang.Throwable r13 = vz.q.e(r12)
            if (r13 != 0) goto L99
            com.stripe.android.core.model.StripeModel r12 = (com.stripe.android.core.model.StripeModel) r12
            return r12
        L99:
            com.stripe.android.core.exception.StripeException$Companion r12 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r12 = r12.create(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.retrieveSetupIntent(com.stripe.android.Stripe, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    public static /* synthetic */ Object retrieveSetupIntent$default(Stripe stripe, String str, String str2, zz.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return retrieveSetupIntent(stripe, str, str2, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0080, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0081, code lost:
        r11 = vz.q.f54772b;
        r10 = vz.q.b(vz.r.a(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0055 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:44:0x0025, B:52:0x0051, B:54:0x0055, B:55:0x005a, B:56:0x007f, B:49:0x0034), top: B:65:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:44:0x0025, B:52:0x0051, B:54:0x0055, B:55:0x005a, B:56:0x007f, B:49:0x0034), top: B:65:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object retrieveSource(com.stripe.android.Stripe r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, zz.d<? super com.stripe.android.model.Source> r14) {
        /*
            boolean r0 = r14 instanceof com.stripe.android.StripeKtxKt$retrieveSource$1
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.StripeKtxKt$retrieveSource$1 r0 = (com.stripe.android.StripeKtxKt$retrieveSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$retrieveSource$1 r0 = new com.stripe.android.StripeKtxKt$retrieveSource$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r14)     // Catch: java.lang.Throwable -> L80
            goto L51
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            vz.r.b(r14)
            vz.q$a r14 = vz.q.f54772b     // Catch: java.lang.Throwable -> L80
            com.stripe.android.networking.StripeRepository r14 = r10.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L80
            com.stripe.android.core.networking.ApiRequest$Options r2 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L80
            java.lang.String r5 = r10.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L80
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r2
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L80
            r0.label = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r14 = r14.retrieveSource$payments_core_release(r11, r12, r2, r0)     // Catch: java.lang.Throwable -> L80
            if (r14 != r1) goto L51
            return r1
        L51:
            com.stripe.android.model.Source r14 = (com.stripe.android.model.Source) r14     // Catch: java.lang.Throwable -> L80
            if (r14 == 0) goto L5a
            java.lang.Object r10 = vz.q.b(r14)     // Catch: java.lang.Throwable -> L80
            goto L8b
        L5a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80
            r10.<init>()     // Catch: java.lang.Throwable -> L80
            java.lang.String r11 = "Failed to parse "
            r10.append(r11)     // Catch: java.lang.Throwable -> L80
            java.lang.Class<com.stripe.android.model.Source> r11 = com.stripe.android.model.Source.class
            java.lang.String r11 = r11.getSimpleName()     // Catch: java.lang.Throwable -> L80
            r10.append(r11)     // Catch: java.lang.Throwable -> L80
            r11 = 46
            r10.append(r11)     // Catch: java.lang.Throwable -> L80
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L80
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L80
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L80
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L80
            throw r11     // Catch: java.lang.Throwable -> L80
        L80:
            r10 = move-exception
            vz.q$a r11 = vz.q.f54772b
            java.lang.Object r10 = vz.r.a(r10)
            java.lang.Object r10 = vz.q.b(r10)
        L8b:
            java.lang.Throwable r11 = vz.q.e(r10)
            if (r11 != 0) goto L94
            com.stripe.android.core.model.StripeModel r10 = (com.stripe.android.core.model.StripeModel) r10
            return r10
        L94:
            com.stripe.android.core.exception.StripeException$Companion r10 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r10 = r10.create(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.retrieveSource(com.stripe.android.Stripe, java.lang.String, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    public static /* synthetic */ Object retrieveSource$default(Stripe stripe, String str, String str2, String str3, zz.d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = stripe.getStripeAccountId$payments_core_release();
        }
        return retrieveSource(stripe, str, str2, str3, dVar);
    }

    private static final /* synthetic */ <ApiObject extends StripeModel> ApiObject runApiRequest(h00.a<? extends ApiObject> aVar) {
        Object b11;
        ApiObject invoke;
        try {
            q.a aVar2 = q.f54772b;
            invoke = aVar.invoke();
        } catch (Throwable th2) {
            q.a aVar3 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (invoke != null) {
            b11 = q.b(invoke);
            Throwable e11 = q.e(b11);
            if (e11 == null) {
                return (ApiObject) b11;
            }
            throw StripeException.Companion.create(e11);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to parse ");
        s.m(4, "ApiObject");
        sb2.append((Object) StripeModel.class.getSimpleName());
        sb2.append(CoreConstants.DOT);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008c, code lost:
        r1 = vz.q.f54772b;
        r0 = vz.q.b(vz.r.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0060 A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:44:0x0028, B:52:0x005c, B:54:0x0060, B:55:0x0065, B:56:0x008a, B:49:0x0037), top: B:65:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0065 A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:44:0x0028, B:52:0x005c, B:54:0x0060, B:55:0x0065, B:56:0x008a, B:49:0x0037), top: B:65:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object verifyPaymentIntentWithMicrodeposits(com.stripe.android.Stripe r14, java.lang.String r15, int r16, int r17, zz.d<? super com.stripe.android.model.PaymentIntent> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof com.stripe.android.StripeKtxKt$verifyPaymentIntentWithMicrodeposits$1
            if (r1 == 0) goto L15
            r1 = r0
            com.stripe.android.StripeKtxKt$verifyPaymentIntentWithMicrodeposits$1 r1 = (com.stripe.android.StripeKtxKt$verifyPaymentIntentWithMicrodeposits$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.stripe.android.StripeKtxKt$verifyPaymentIntentWithMicrodeposits$1 r1 = new com.stripe.android.StripeKtxKt$verifyPaymentIntentWithMicrodeposits$1
            r1.<init>(r0)
        L1a:
            r7 = r1
            java.lang.Object r0 = r7.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r7.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            vz.r.b(r0)     // Catch: java.lang.Throwable -> L8b
            goto L5c
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            vz.r.b(r0)
            vz.q$a r0 = vz.q.f54772b     // Catch: java.lang.Throwable -> L8b
            com.stripe.android.networking.StripeRepository r2 = r14.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L8b
            com.stripe.android.core.networking.ApiRequest$Options r6 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L8b
            java.lang.String r9 = r14.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r10 = r14.getStripeAccountId$payments_core_release()     // Catch: java.lang.Throwable -> L8b
            r11 = 0
            r12 = 4
            r13 = 0
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L8b
            r7.label = r3     // Catch: java.lang.Throwable -> L8b
            r3 = r15
            r4 = r16
            r5 = r17
            java.lang.Object r0 = r2.verifyPaymentIntentWithMicrodeposits(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8b
            if (r0 != r1) goto L5c
            return r1
        L5c:
            com.stripe.android.model.PaymentIntent r0 = (com.stripe.android.model.PaymentIntent) r0     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L65
            java.lang.Object r0 = vz.q.b(r0)     // Catch: java.lang.Throwable -> L8b
            goto L96
        L65:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r0.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "Failed to parse "
            r0.append(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.Class<com.stripe.android.model.PaymentIntent> r1 = com.stripe.android.model.PaymentIntent.class
            java.lang.String r1 = r1.getSimpleName()     // Catch: java.lang.Throwable -> L8b
            r0.append(r1)     // Catch: java.lang.Throwable -> L8b
            r1 = 46
            r0.append(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8b
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L8b
            throw r1     // Catch: java.lang.Throwable -> L8b
        L8b:
            r0 = move-exception
            vz.q$a r1 = vz.q.f54772b
            java.lang.Object r0 = vz.r.a(r0)
            java.lang.Object r0 = vz.q.b(r0)
        L96:
            java.lang.Throwable r1 = vz.q.e(r0)
            if (r1 != 0) goto L9f
            com.stripe.android.core.model.StripeModel r0 = (com.stripe.android.core.model.StripeModel) r0
            return r0
        L9f:
            com.stripe.android.core.exception.StripeException$Companion r0 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r0 = r0.create(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.verifyPaymentIntentWithMicrodeposits(com.stripe.android.Stripe, java.lang.String, int, int, zz.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008c, code lost:
        r1 = vz.q.f54772b;
        r0 = vz.q.b(vz.r.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0060 A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:44:0x0028, B:52:0x005c, B:54:0x0060, B:55:0x0065, B:56:0x008a, B:49:0x0037), top: B:65:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0065 A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:44:0x0028, B:52:0x005c, B:54:0x0060, B:55:0x0065, B:56:0x008a, B:49:0x0037), top: B:65:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object verifySetupIntentWithMicrodeposits(com.stripe.android.Stripe r14, java.lang.String r15, int r16, int r17, zz.d<? super com.stripe.android.model.SetupIntent> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof com.stripe.android.StripeKtxKt$verifySetupIntentWithMicrodeposits$1
            if (r1 == 0) goto L15
            r1 = r0
            com.stripe.android.StripeKtxKt$verifySetupIntentWithMicrodeposits$1 r1 = (com.stripe.android.StripeKtxKt$verifySetupIntentWithMicrodeposits$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.stripe.android.StripeKtxKt$verifySetupIntentWithMicrodeposits$1 r1 = new com.stripe.android.StripeKtxKt$verifySetupIntentWithMicrodeposits$1
            r1.<init>(r0)
        L1a:
            r7 = r1
            java.lang.Object r0 = r7.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r7.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            vz.r.b(r0)     // Catch: java.lang.Throwable -> L8b
            goto L5c
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            vz.r.b(r0)
            vz.q$a r0 = vz.q.f54772b     // Catch: java.lang.Throwable -> L8b
            com.stripe.android.networking.StripeRepository r2 = r14.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L8b
            com.stripe.android.core.networking.ApiRequest$Options r6 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L8b
            java.lang.String r9 = r14.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r10 = r14.getStripeAccountId$payments_core_release()     // Catch: java.lang.Throwable -> L8b
            r11 = 0
            r12 = 4
            r13 = 0
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L8b
            r7.label = r3     // Catch: java.lang.Throwable -> L8b
            r3 = r15
            r4 = r16
            r5 = r17
            java.lang.Object r0 = r2.verifySetupIntentWithMicrodeposits(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8b
            if (r0 != r1) goto L5c
            return r1
        L5c:
            com.stripe.android.model.SetupIntent r0 = (com.stripe.android.model.SetupIntent) r0     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L65
            java.lang.Object r0 = vz.q.b(r0)     // Catch: java.lang.Throwable -> L8b
            goto L96
        L65:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r0.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "Failed to parse "
            r0.append(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.Class<com.stripe.android.model.SetupIntent> r1 = com.stripe.android.model.SetupIntent.class
            java.lang.String r1 = r1.getSimpleName()     // Catch: java.lang.Throwable -> L8b
            r0.append(r1)     // Catch: java.lang.Throwable -> L8b
            r1 = 46
            r0.append(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8b
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L8b
            throw r1     // Catch: java.lang.Throwable -> L8b
        L8b:
            r0 = move-exception
            vz.q$a r1 = vz.q.f54772b
            java.lang.Object r0 = vz.r.a(r0)
            java.lang.Object r0 = vz.q.b(r0)
        L96:
            java.lang.Throwable r1 = vz.q.e(r0)
            if (r1 != 0) goto L9f
            com.stripe.android.core.model.StripeModel r0 = (com.stripe.android.core.model.StripeModel) r0
            return r0
        L9f:
            com.stripe.android.core.exception.StripeException$Companion r0 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r0 = r0.create(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.verifySetupIntentWithMicrodeposits(com.stripe.android.Stripe, java.lang.String, int, int, zz.d):java.lang.Object");
    }

    public static final /* synthetic */ <ApiObject extends StripeModel> ApiObject runApiRequest(boolean z11, h00.a<? extends ApiObject> block) {
        Object b11;
        s.g(block, "block");
        try {
            q.a aVar = q.f54772b;
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (z11) {
            b11 = q.b(block.invoke());
            Throwable e11 = q.e(b11);
            if (e11 == null) {
                return (ApiObject) b11;
            }
            throw StripeException.Companion.create(e11);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Incorrect requestCode and data for ");
        s.m(4, "ApiObject");
        sb2.append((Object) StripeModel.class.getSimpleName());
        sb2.append(CoreConstants.DOT);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0083, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0084, code lost:
        r11 = vz.q.f54772b;
        r10 = vz.q.b(vz.r.a(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0058 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:44:0x0025, B:52:0x0054, B:54:0x0058, B:55:0x005d, B:56:0x0082, B:49:0x0034), top: B:65:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005d A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:44:0x0025, B:52:0x0054, B:54:0x0058, B:55:0x005d, B:56:0x0082, B:49:0x0034), top: B:65:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object verifyPaymentIntentWithMicrodeposits(com.stripe.android.Stripe r10, java.lang.String r11, java.lang.String r12, zz.d<? super com.stripe.android.model.PaymentIntent> r13) {
        /*
            boolean r0 = r13 instanceof com.stripe.android.StripeKtxKt$verifyPaymentIntentWithMicrodeposits$3
            if (r0 == 0) goto L13
            r0 = r13
            com.stripe.android.StripeKtxKt$verifyPaymentIntentWithMicrodeposits$3 r0 = (com.stripe.android.StripeKtxKt$verifyPaymentIntentWithMicrodeposits$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$verifyPaymentIntentWithMicrodeposits$3 r0 = new com.stripe.android.StripeKtxKt$verifyPaymentIntentWithMicrodeposits$3
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r13)     // Catch: java.lang.Throwable -> L83
            goto L54
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            vz.r.b(r13)
            vz.q$a r13 = vz.q.f54772b     // Catch: java.lang.Throwable -> L83
            com.stripe.android.networking.StripeRepository r13 = r10.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L83
            com.stripe.android.core.networking.ApiRequest$Options r2 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L83
            java.lang.String r5 = r10.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = r10.getStripeAccountId$payments_core_release()     // Catch: java.lang.Throwable -> L83
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L83
            r0.label = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r13 = r13.verifyPaymentIntentWithMicrodeposits(r11, r12, r2, r0)     // Catch: java.lang.Throwable -> L83
            if (r13 != r1) goto L54
            return r1
        L54:
            com.stripe.android.model.PaymentIntent r13 = (com.stripe.android.model.PaymentIntent) r13     // Catch: java.lang.Throwable -> L83
            if (r13 == 0) goto L5d
            java.lang.Object r10 = vz.q.b(r13)     // Catch: java.lang.Throwable -> L83
            goto L8e
        L5d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r10.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r11 = "Failed to parse "
            r10.append(r11)     // Catch: java.lang.Throwable -> L83
            java.lang.Class<com.stripe.android.model.PaymentIntent> r11 = com.stripe.android.model.PaymentIntent.class
            java.lang.String r11 = r11.getSimpleName()     // Catch: java.lang.Throwable -> L83
            r10.append(r11)     // Catch: java.lang.Throwable -> L83
            r11 = 46
            r10.append(r11)     // Catch: java.lang.Throwable -> L83
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L83
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L83
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L83
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L83
            throw r11     // Catch: java.lang.Throwable -> L83
        L83:
            r10 = move-exception
            vz.q$a r11 = vz.q.f54772b
            java.lang.Object r10 = vz.r.a(r10)
            java.lang.Object r10 = vz.q.b(r10)
        L8e:
            java.lang.Throwable r11 = vz.q.e(r10)
            if (r11 != 0) goto L97
            com.stripe.android.core.model.StripeModel r10 = (com.stripe.android.core.model.StripeModel) r10
            return r10
        L97:
            com.stripe.android.core.exception.StripeException$Companion r10 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r10 = r10.create(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.verifyPaymentIntentWithMicrodeposits(com.stripe.android.Stripe, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|(3:13|14|(2:16|17)(2:19|20))(2:21|22)))|31|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0083, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0084, code lost:
        r11 = vz.q.f54772b;
        r10 = vz.q.b(vz.r.a(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0058 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:44:0x0025, B:52:0x0054, B:54:0x0058, B:55:0x005d, B:56:0x0082, B:49:0x0034), top: B:65:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005d A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:44:0x0025, B:52:0x0054, B:54:0x0058, B:55:0x005d, B:56:0x0082, B:49:0x0034), top: B:65:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object verifySetupIntentWithMicrodeposits(com.stripe.android.Stripe r10, java.lang.String r11, java.lang.String r12, zz.d<? super com.stripe.android.model.SetupIntent> r13) {
        /*
            boolean r0 = r13 instanceof com.stripe.android.StripeKtxKt$verifySetupIntentWithMicrodeposits$3
            if (r0 == 0) goto L13
            r0 = r13
            com.stripe.android.StripeKtxKt$verifySetupIntentWithMicrodeposits$3 r0 = (com.stripe.android.StripeKtxKt$verifySetupIntentWithMicrodeposits$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripeKtxKt$verifySetupIntentWithMicrodeposits$3 r0 = new com.stripe.android.StripeKtxKt$verifySetupIntentWithMicrodeposits$3
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r13)     // Catch: java.lang.Throwable -> L83
            goto L54
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            vz.r.b(r13)
            vz.q$a r13 = vz.q.f54772b     // Catch: java.lang.Throwable -> L83
            com.stripe.android.networking.StripeRepository r13 = r10.getStripeRepository$payments_core_release()     // Catch: java.lang.Throwable -> L83
            com.stripe.android.core.networking.ApiRequest$Options r2 = new com.stripe.android.core.networking.ApiRequest$Options     // Catch: java.lang.Throwable -> L83
            java.lang.String r5 = r10.getPublishableKey$payments_core_release()     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = r10.getStripeAccountId$payments_core_release()     // Catch: java.lang.Throwable -> L83
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L83
            r0.label = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r13 = r13.verifySetupIntentWithMicrodeposits(r11, r12, r2, r0)     // Catch: java.lang.Throwable -> L83
            if (r13 != r1) goto L54
            return r1
        L54:
            com.stripe.android.model.SetupIntent r13 = (com.stripe.android.model.SetupIntent) r13     // Catch: java.lang.Throwable -> L83
            if (r13 == 0) goto L5d
            java.lang.Object r10 = vz.q.b(r13)     // Catch: java.lang.Throwable -> L83
            goto L8e
        L5d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r10.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r11 = "Failed to parse "
            r10.append(r11)     // Catch: java.lang.Throwable -> L83
            java.lang.Class<com.stripe.android.model.SetupIntent> r11 = com.stripe.android.model.SetupIntent.class
            java.lang.String r11 = r11.getSimpleName()     // Catch: java.lang.Throwable -> L83
            r10.append(r11)     // Catch: java.lang.Throwable -> L83
            r11 = 46
            r10.append(r11)     // Catch: java.lang.Throwable -> L83
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L83
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L83
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L83
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L83
            throw r11     // Catch: java.lang.Throwable -> L83
        L83:
            r10 = move-exception
            vz.q$a r11 = vz.q.f54772b
            java.lang.Object r10 = vz.r.a(r10)
            java.lang.Object r10 = vz.q.b(r10)
        L8e:
            java.lang.Throwable r11 = vz.q.e(r10)
            if (r11 != 0) goto L97
            com.stripe.android.core.model.StripeModel r10 = (com.stripe.android.core.model.StripeModel) r10
            return r10
        L97:
            com.stripe.android.core.exception.StripeException$Companion r10 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r10 = r10.create(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.verifySetupIntentWithMicrodeposits(com.stripe.android.Stripe, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }
}