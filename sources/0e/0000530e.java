package com.stripe.android.networking;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class DefaultAlipayRepository implements AlipayRepository {
    @Deprecated
    private static final String ALIPAY_RESULT_FIELD = "resultStatus";
    private static final Companion Companion = new Companion(null);
    private final StripeRepository stripeRepository;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultAlipayRepository(StripeRepository stripeRepository) {
        s.g(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // com.stripe.android.networking.AlipayRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object authenticate(com.stripe.android.model.PaymentIntent r6, com.stripe.android.AlipayAuthenticator r7, com.stripe.android.core.networking.ApiRequest.Options r8, zz.d<? super com.stripe.android.model.AlipayAuthResult> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.stripe.android.networking.DefaultAlipayRepository$authenticate$1
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.networking.DefaultAlipayRepository$authenticate$1 r0 = (com.stripe.android.networking.DefaultAlipayRepository$authenticate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.networking.DefaultAlipayRepository$authenticate$1 r0 = new com.stripe.android.networking.DefaultAlipayRepository$authenticate$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            vz.r.b(r9)
            goto L8f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            vz.r.b(r9)
            com.stripe.android.model.PaymentMethod r9 = r6.getPaymentMethod()
            if (r9 != 0) goto L3d
        L3b:
            r9 = r3
            goto L42
        L3d:
            boolean r9 = r9.liveMode
            if (r9 != 0) goto L3b
            r9 = r4
        L42:
            if (r9 != 0) goto Lb6
            com.stripe.android.model.StripeIntent$NextActionData r6 = r6.getNextActionData()
            boolean r9 = r6 instanceof com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect
            if (r9 == 0) goto Lae
            com.stripe.android.model.StripeIntent$NextActionData$AlipayRedirect r6 = (com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect) r6
            java.lang.String r9 = r6.getData()
            java.util.Map r7 = r7.onAuthenticationRequest(r9)
            java.lang.String r9 = "resultStatus"
            java.lang.Object r7 = r7.get(r9)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto La8
            int r9 = r7.hashCode()
            r2 = 1596796(0x185d7c, float:2.237588E-39)
            if (r9 == r2) goto L9e
            r2 = 1656379(0x19463b, float:2.321081E-39)
            if (r9 == r2) goto L93
            r2 = 1745751(0x1aa357, float:2.446318E-39)
            if (r9 == r2) goto L74
            goto La8
        L74:
            java.lang.String r9 = "9000"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L7d
            goto La8
        L7d:
            java.lang.String r6 = r6.getAuthCompleteUrl()
            if (r6 != 0) goto L84
            goto L91
        L84:
            com.stripe.android.networking.StripeRepository r7 = r5.stripeRepository
            r0.label = r4
            java.lang.Object r9 = r7.retrieveObject$payments_core_release(r6, r8, r0)
            if (r9 != r1) goto L8f
            return r1
        L8f:
            org.json.JSONObject r9 = (org.json.JSONObject) r9
        L91:
            r3 = r4
            goto La8
        L93:
            java.lang.String r6 = "6001"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L9c
            goto La8
        L9c:
            r3 = 3
            goto La8
        L9e:
            java.lang.String r6 = "4000"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto La7
            goto La8
        La7:
            r3 = 2
        La8:
            com.stripe.android.model.AlipayAuthResult r6 = new com.stripe.android.model.AlipayAuthResult
            r6.<init>(r3)
            return r6
        Lae:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Unable to authenticate Payment Intent with Alipay SDK"
            r6.<init>(r7)
            throw r6
        Lb6:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Attempted to authenticate test mode PaymentIntent with the Alipay SDK.\nThe Alipay SDK does not support test mode payments."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.DefaultAlipayRepository.authenticate(com.stripe.android.model.PaymentIntent, com.stripe.android.AlipayAuthenticator, com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }
}