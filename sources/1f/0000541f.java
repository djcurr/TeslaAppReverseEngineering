package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$2", f = "Stripe3ds2TransactionViewModel.kt", l = {141, 158}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$2 extends l implements p<o0, d<? super Stripe3ds2AuthResult>, Object> {
    final /* synthetic */ ApiRequest.Options $requestOptions;
    final /* synthetic */ Stripe3ds2Fingerprint $stripe3ds2Fingerprint;
    final /* synthetic */ int $timeout;
    final /* synthetic */ Transaction $transaction;
    int label;
    final /* synthetic */ Stripe3ds2TransactionViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$2(Transaction transaction, Stripe3ds2Fingerprint stripe3ds2Fingerprint, int i11, Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel, ApiRequest.Options options, d<? super Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$2> dVar) {
        super(2, dVar);
        this.$transaction = transaction;
        this.$stripe3ds2Fingerprint = stripe3ds2Fingerprint;
        this.$timeout = i11;
        this.this$0 = stripe3ds2TransactionViewModel;
        this.$requestOptions = options;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$2(this.$transaction, this.$stripe3ds2Fingerprint, this.$timeout, this.this$0, this.$requestOptions, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super Stripe3ds2AuthResult> dVar) {
        return ((Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = a00.b.d()
            int r1 = r13.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            vz.r.b(r14)
            goto L6a
        L12:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1a:
            vz.r.b(r14)
            goto L2c
        L1e:
            vz.r.b(r14)
            com.stripe.android.stripe3ds2.transaction.Transaction r14 = r13.$transaction
            r13.label = r3
            java.lang.Object r14 = r14.createAuthenticationRequestParameters(r13)
            if (r14 != r0) goto L2c
            return r0
        L2c:
            com.stripe.android.stripe3ds2.transaction.AuthenticationRequestParameters r14 = (com.stripe.android.stripe3ds2.transaction.AuthenticationRequestParameters) r14
            com.stripe.android.model.Stripe3ds2AuthParams r1 = new com.stripe.android.model.Stripe3ds2AuthParams
            com.stripe.android.model.Stripe3ds2Fingerprint r3 = r13.$stripe3ds2Fingerprint
            java.lang.String r4 = r3.getSource()
            java.lang.String r5 = r14.getSdkAppId()
            java.lang.String r6 = r14.getSdkReferenceNumber()
            com.stripe.android.stripe3ds2.transaction.SdkTransactionId r3 = r14.getSdkTransactionId()
            java.lang.String r7 = r3.getValue()
            java.lang.String r8 = r14.getDeviceData()
            java.lang.String r9 = r14.getSdkEphemeralPublicKey()
            java.lang.String r10 = r14.getMessageVersion()
            int r11 = r13.$timeout
            r12 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel r14 = r13.this$0
            com.stripe.android.networking.StripeRepository r14 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel.access$getStripeRepository$p(r14)
            com.stripe.android.core.networking.ApiRequest$Options r3 = r13.$requestOptions
            r13.label = r2
            java.lang.Object r14 = r14.start3ds2Auth$payments_core_release(r1, r3, r13)
            if (r14 != r0) goto L6a
            return r0
        L6a:
            if (r14 == 0) goto L6d
            return r14
        L6d:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}