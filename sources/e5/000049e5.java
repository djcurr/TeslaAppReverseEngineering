package com.reactnativestripesdk;

import com.facebook.react.bridge.ReadableMap;
import com.stripe.android.model.Address;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.Map;
import java.util.Objects;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final ReadableMap f20296a;

    /* renamed from: b  reason: collision with root package name */
    private final ReadableMap f20297b;

    /* renamed from: c  reason: collision with root package name */
    private final k f20298c;

    /* renamed from: d  reason: collision with root package name */
    private final v f20299d;

    /* renamed from: e  reason: collision with root package name */
    private final PaymentMethod.BillingDetails f20300e;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20301a;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            iArr[PaymentMethod.Type.Ideal.ordinal()] = 2;
            iArr[PaymentMethod.Type.Alipay.ordinal()] = 3;
            iArr[PaymentMethod.Type.Sofort.ordinal()] = 4;
            iArr[PaymentMethod.Type.Bancontact.ordinal()] = 5;
            iArr[PaymentMethod.Type.SepaDebit.ordinal()] = 6;
            iArr[PaymentMethod.Type.Oxxo.ordinal()] = 7;
            iArr[PaymentMethod.Type.Giropay.ordinal()] = 8;
            iArr[PaymentMethod.Type.Eps.ordinal()] = 9;
            iArr[PaymentMethod.Type.GrabPay.ordinal()] = 10;
            iArr[PaymentMethod.Type.P24.ordinal()] = 11;
            iArr[PaymentMethod.Type.Fpx.ordinal()] = 12;
            iArr[PaymentMethod.Type.AfterpayClearpay.ordinal()] = 13;
            iArr[PaymentMethod.Type.AuBecsDebit.ordinal()] = 14;
            iArr[PaymentMethod.Type.Klarna.ordinal()] = 15;
            iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 16;
            iArr[PaymentMethod.Type.PayPal.ordinal()] = 17;
            iArr[PaymentMethod.Type.Affirm.ordinal()] = 18;
            f20301a = iArr;
        }
    }

    public h0(ReadableMap readableMap, ReadableMap options, k kVar, v vVar) {
        kotlin.jvm.internal.s.g(options, "options");
        this.f20296a = readableMap;
        this.f20297b = options;
        this.f20298c = kVar;
        this.f20299d = vVar;
        ReadableMap g11 = hr.d.g(readableMap, "billingDetails");
        Address address = null;
        Address cardAddress = kVar == null ? null : kVar.getCardAddress();
        if (cardAddress != null) {
            address = cardAddress;
        } else if (vVar != null) {
            address = vVar.getCardAddress();
        }
        this.f20300e = hr.d.I(g11, address);
    }

    private final PaymentMethodCreateParams a() {
        return PaymentMethodCreateParams.Companion.createAffirm$default(PaymentMethodCreateParams.Companion, this.f20300e, null, 2, null);
    }

    private final ConfirmStripeIntentParams b(String str, boolean z11) {
        if (z11) {
            return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(ConfirmPaymentIntentParams.Companion, a(), str, null, null, null, hr.d.J(hr.d.j(this.f20297b, "setupFutureUsage", null, 4, null)), null, null, 220, null);
        }
        throw new PaymentMethodCreateParamsException("Affirm is not yet supported through SetupIntents.");
    }

    private final PaymentMethodCreateParams c() {
        PaymentMethod.BillingDetails billingDetails = this.f20300e;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.createAfterpayClearpay$default(PaymentMethodCreateParams.Companion, billingDetails, null, 2, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams d() {
        return PaymentMethodCreateParams.Companion.createAlipay$default(PaymentMethodCreateParams.Companion, null, 1, null);
    }

    private final PaymentMethodCreateParams e() {
        ReadableMap g11 = hr.d.g(this.f20296a, "formDetails");
        if (g11 != null) {
            String j11 = hr.d.j(g11, "bsbNumber", null, 4, null);
            Objects.requireNonNull(j11, "null cannot be cast to non-null type kotlin.String");
            String j12 = hr.d.j(g11, "accountNumber", null, 4, null);
            Objects.requireNonNull(j12, "null cannot be cast to non-null type kotlin.String");
            String j13 = hr.d.j(g11, "name", null, 4, null);
            Objects.requireNonNull(j13, "null cannot be cast to non-null type kotlin.String");
            String j14 = hr.d.j(g11, "email", null, 4, null);
            Objects.requireNonNull(j14, "null cannot be cast to non-null type kotlin.String");
            return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, new PaymentMethodCreateParams.AuBecsDebit(j11, j12), new PaymentMethod.BillingDetails.Builder().setName(j13).setEmail(j14).build(), (Map) null, 4, (Object) null);
        }
        throw new PaymentMethodCreateParamsException("You must provide form details");
    }

    private final PaymentMethodCreateParams f() {
        PaymentMethod.BillingDetails billingDetails = this.f20300e;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.createBancontact$default(PaymentMethodCreateParams.Companion, billingDetails, null, 2, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams g() {
        PaymentMethodCreateParams.Card card = null;
        String i11 = hr.d.i(this.f20296a, "token", null);
        k kVar = this.f20298c;
        PaymentMethodCreateParams.Card cardParams = kVar == null ? null : kVar.getCardParams();
        if (cardParams == null) {
            v vVar = this.f20299d;
            if (vVar != null) {
                card = vVar.getCardParams();
            }
        } else {
            card = cardParams;
        }
        if (i11 != null) {
            card = PaymentMethodCreateParams.Card.Companion.create(i11);
        }
        PaymentMethodCreateParams.Card card2 = card;
        if (card2 != null) {
            return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, card2, this.f20300e, (Map) null, 4, (Object) null);
        }
        throw new PaymentMethodCreateParamsException("Card details not complete");
    }

    private final ConfirmStripeIntentParams h(String str, boolean z11) {
        String i11 = hr.d.i(this.f20296a, "paymentMethodId", null);
        ConfirmPaymentIntentParams.SetupFutureUsage J = hr.d.J(hr.d.j(this.f20297b, "setupFutureUsage", null, 4, null));
        if (i11 != null) {
            String i12 = hr.d.i(this.f20296a, "cvc", null);
            PaymentMethodOptionsParams.Card card = i12 != null ? new PaymentMethodOptionsParams.Card(i12, null, null, 6, null) : null;
            if (z11) {
                return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodId$default(ConfirmPaymentIntentParams.Companion, i11, str, null, card, null, null, J, null, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, null);
            }
            return ConfirmSetupIntentParams.Companion.create$default(ConfirmSetupIntentParams.Companion, i11, str, (MandateDataParams) null, (String) null, 12, (Object) null);
        }
        PaymentMethodCreateParams g11 = g();
        if (z11) {
            return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(ConfirmPaymentIntentParams.Companion, g11, str, null, null, null, J, null, null, 220, null);
        }
        return ConfirmSetupIntentParams.Companion.create$default(ConfirmSetupIntentParams.Companion, g11, str, (MandateDataParams) null, (String) null, 12, (Object) null);
    }

    private final PaymentMethodCreateParams i() {
        PaymentMethod.BillingDetails billingDetails = this.f20300e;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.createEps$default(PaymentMethodCreateParams.Companion, billingDetails, null, 2, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams j() {
        hr.d.e(this.f20296a, "testOfflineBank");
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, new PaymentMethodCreateParams.Fpx("test_offline_bank"), (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
    }

    private final PaymentMethodCreateParams k() {
        PaymentMethod.BillingDetails billingDetails = this.f20300e;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.createGiropay$default(PaymentMethodCreateParams.Companion, billingDetails, null, 2, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams l() {
        PaymentMethod.BillingDetails billingDetails = this.f20300e;
        if (billingDetails == null) {
            billingDetails = new PaymentMethod.BillingDetails(null, null, null, null, 15, null);
        }
        return PaymentMethodCreateParams.Companion.createGrabPay$default(PaymentMethodCreateParams.Companion, billingDetails, null, 2, null);
    }

    private final PaymentMethodCreateParams m() {
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, new PaymentMethodCreateParams.Ideal(hr.d.i(this.f20296a, "bankName", null)), this.f20300e, (Map) null, 4, (Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
        if (r0 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.stripe.android.model.PaymentMethodCreateParams n() {
        /*
            r4 = this;
            com.stripe.android.model.PaymentMethod$BillingDetails r0 = r4.f20300e
            if (r0 == 0) goto L38
            com.stripe.android.model.Address r0 = r0.address
            r1 = 0
            if (r0 != 0) goto Lb
            r0 = r1
            goto Lf
        Lb:
            java.lang.String r0 = r0.getCountry()
        Lf:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1c
            boolean r0 = kotlin.text.m.w(r0)
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            r0 = r2
            goto L1d
        L1c:
            r0 = r3
        L1d:
            if (r0 != 0) goto L38
            com.stripe.android.model.PaymentMethod$BillingDetails r0 = r4.f20300e
            java.lang.String r0 = r0.email
            if (r0 == 0) goto L2b
            boolean r0 = kotlin.text.m.w(r0)
            if (r0 == 0) goto L2c
        L2b:
            r2 = r3
        L2c:
            if (r2 != 0) goto L38
            com.stripe.android.model.PaymentMethodCreateParams$Companion r0 = com.stripe.android.model.PaymentMethodCreateParams.Companion
            com.stripe.android.model.PaymentMethod$BillingDetails r2 = r4.f20300e
            r3 = 2
            com.stripe.android.model.PaymentMethodCreateParams r0 = com.stripe.android.model.PaymentMethodCreateParams.Companion.createKlarna$default(r0, r2, r1, r3, r1)
            return r0
        L38:
            com.reactnativestripesdk.PaymentMethodCreateParamsException r0 = new com.reactnativestripesdk.PaymentMethodCreateParamsException
            java.lang.String r1 = "Klarna requires that you provide the following billing details: email, country"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativestripesdk.h0.n():com.stripe.android.model.PaymentMethodCreateParams");
    }

    private final PaymentMethodCreateParams o() {
        PaymentMethod.BillingDetails billingDetails = this.f20300e;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.createOxxo$default(PaymentMethodCreateParams.Companion, billingDetails, null, 2, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams p() {
        PaymentMethod.BillingDetails billingDetails = this.f20300e;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.createP24$default(PaymentMethodCreateParams.Companion, billingDetails, null, 2, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams r() {
        return PaymentMethodCreateParams.Companion.createPayPal(null);
    }

    private final ConfirmStripeIntentParams s(String str, boolean z11) {
        if (z11) {
            return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(ConfirmPaymentIntentParams.Companion, r(), str, null, null, null, null, null, null, 252, null);
        }
        throw new PaymentMethodCreateParamsException("PayPal is not yet supported through SetupIntents.");
    }

    private final PaymentMethodCreateParams u() {
        PaymentMethod.BillingDetails billingDetails = this.f20300e;
        if (billingDetails != null) {
            String i11 = hr.d.i(this.f20296a, "iban", null);
            if (i11 != null) {
                return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, new PaymentMethodCreateParams.SepaDebit(i11), billingDetails, (Map) null, 4, (Object) null);
            }
            throw new PaymentMethodCreateParamsException("You must provide IBAN");
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams v() {
        String i11 = hr.d.i(this.f20296a, "country", null);
        if (i11 != null) {
            return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, new PaymentMethodCreateParams.Sofort(i11), this.f20300e, (Map) null, 4, (Object) null);
        }
        throw new PaymentMethodCreateParamsException("You must provide bank account country");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r5 != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.stripe.android.model.PaymentMethodCreateParams w(com.facebook.react.bridge.ReadableMap r7) {
        /*
            r6 = this;
            java.lang.String r0 = "accountNumber"
            r1 = 0
            java.lang.String r0 = hr.d.i(r7, r0, r1)
            java.lang.String r2 = "routingNumber"
            java.lang.String r2 = hr.d.i(r7, r2, r1)
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L1a
            boolean r5 = kotlin.text.m.w(r0)
            if (r5 == 0) goto L18
            goto L1a
        L18:
            r5 = r3
            goto L1b
        L1a:
            r5 = r4
        L1b:
            if (r5 != 0) goto L52
            if (r2 == 0) goto L25
            boolean r5 = kotlin.text.m.w(r2)
            if (r5 == 0) goto L26
        L25:
            r3 = r4
        L26:
            if (r3 != 0) goto L4a
            com.stripe.android.model.PaymentMethodCreateParams$USBankAccount r3 = new com.stripe.android.model.PaymentMethodCreateParams$USBankAccount
            java.lang.String r4 = "accountType"
            java.lang.String r4 = hr.d.i(r7, r4, r1)
            com.stripe.android.model.PaymentMethod$USBankAccount$USBankAccountType r4 = hr.d.P(r4)
            java.lang.String r5 = "accountHolderType"
            java.lang.String r7 = hr.d.i(r7, r5, r1)
            com.stripe.android.model.PaymentMethod$USBankAccount$USBankAccountHolderType r7 = hr.d.O(r7)
            r3.<init>(r0, r2, r4, r7)
            com.stripe.android.model.PaymentMethodCreateParams$Companion r7 = com.stripe.android.model.PaymentMethodCreateParams.Companion
            com.stripe.android.model.PaymentMethod$BillingDetails r0 = r6.f20300e
            com.stripe.android.model.PaymentMethodCreateParams r7 = r7.create(r3, r0, r1)
            return r7
        L4a:
            com.reactnativestripesdk.PaymentMethodCreateParamsException r7 = new com.reactnativestripesdk.PaymentMethodCreateParamsException
            java.lang.String r0 = "When creating a US bank account payment method, you must provide the bank routing number"
            r7.<init>(r0)
            throw r7
        L52:
            com.reactnativestripesdk.PaymentMethodCreateParamsException r7 = new com.reactnativestripesdk.PaymentMethodCreateParamsException
            java.lang.String r0 = "When creating a US bank account payment method, you must provide the bank account number"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativestripesdk.h0.w(com.facebook.react.bridge.ReadableMap):com.stripe.android.model.PaymentMethodCreateParams");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.stripe.android.model.ConfirmStripeIntentParams x(java.lang.String r14, boolean r15) {
        /*
            r13 = this;
            com.facebook.react.bridge.ReadableMap r0 = r13.f20296a
            if (r0 != 0) goto L18
            if (r15 == 0) goto Lf
            com.stripe.android.model.ConfirmPaymentIntentParams$Companion r15 = com.stripe.android.model.ConfirmPaymentIntentParams.Companion
            com.stripe.android.model.PaymentMethod$Type r0 = com.stripe.android.model.PaymentMethod.Type.USBankAccount
            com.stripe.android.model.ConfirmPaymentIntentParams r14 = r15.create(r14, r0)
            goto L17
        Lf:
            com.stripe.android.model.ConfirmSetupIntentParams$Companion r15 = com.stripe.android.model.ConfirmSetupIntentParams.Companion
            com.stripe.android.model.PaymentMethod$Type r0 = com.stripe.android.model.PaymentMethod.Type.USBankAccount
            com.stripe.android.model.ConfirmSetupIntentParams r14 = r15.create(r14, r0)
        L17:
            return r14
        L18:
            com.stripe.android.model.PaymentMethod$BillingDetails r0 = r13.f20300e
            r1 = 0
            if (r0 != 0) goto L1f
            r0 = r1
            goto L21
        L1f:
            java.lang.String r0 = r0.name
        L21:
            if (r0 == 0) goto L2c
            boolean r0 = kotlin.text.m.w(r0)
            if (r0 == 0) goto L2a
            goto L2c
        L2a:
            r0 = 0
            goto L2d
        L2c:
            r0 = 1
        L2d:
            if (r0 != 0) goto L67
            if (r15 == 0) goto L54
            com.stripe.android.model.ConfirmPaymentIntentParams$Companion r2 = com.stripe.android.model.ConfirmPaymentIntentParams.Companion
            com.facebook.react.bridge.ReadableMap r15 = r13.f20296a
            com.stripe.android.model.PaymentMethodCreateParams r3 = r13.w(r15)
            r5 = 0
            r6 = 0
            r7 = 0
            com.facebook.react.bridge.ReadableMap r15 = r13.f20297b
            r0 = 4
            java.lang.String r4 = "setupFutureUsage"
            java.lang.String r15 = hr.d.j(r15, r4, r1, r0, r1)
            com.stripe.android.model.ConfirmPaymentIntentParams$SetupFutureUsage r8 = hr.d.J(r15)
            r9 = 0
            r10 = 0
            r11 = 220(0xdc, float:3.08E-43)
            r12 = 0
            r4 = r14
            com.stripe.android.model.ConfirmPaymentIntentParams r14 = com.stripe.android.model.ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L66
        L54:
            com.stripe.android.model.ConfirmSetupIntentParams$Companion r0 = com.stripe.android.model.ConfirmSetupIntentParams.Companion
            com.facebook.react.bridge.ReadableMap r15 = r13.f20296a
            com.stripe.android.model.PaymentMethodCreateParams r1 = r13.w(r15)
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r2 = r14
            com.stripe.android.model.ConfirmSetupIntentParams r14 = com.stripe.android.model.ConfirmSetupIntentParams.Companion.create$default(r0, r1, r2, r3, r4, r5, r6)
        L66:
            return r14
        L67:
            com.reactnativestripesdk.PaymentMethodCreateParamsException r14 = new com.reactnativestripesdk.PaymentMethodCreateParamsException
            java.lang.String r15 = "When creating a US bank account payment method, you must provide the following billing details: name"
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativestripesdk.h0.x(java.lang.String, boolean):com.stripe.android.model.ConfirmStripeIntentParams");
    }

    public final ConfirmStripeIntentParams q(String clientSecret, PaymentMethod.Type paymentMethodType, boolean z11) {
        kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
        kotlin.jvm.internal.s.g(paymentMethodType, "paymentMethodType");
        try {
            switch (a.f20301a[paymentMethodType.ordinal()]) {
                case 1:
                    return h(clientSecret, z11);
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    PaymentMethodCreateParams t11 = t(paymentMethodType);
                    if (z11) {
                        return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(ConfirmPaymentIntentParams.Companion, t11, clientSecret, null, null, null, hr.d.J(hr.d.j(this.f20297b, "setupFutureUsage", null, 4, null)), null, null, 220, null);
                    }
                    return ConfirmSetupIntentParams.Companion.create$default(ConfirmSetupIntentParams.Companion, t11, clientSecret, (MandateDataParams) null, (String) null, 12, (Object) null);
                case 16:
                    return x(clientSecret, z11);
                case 17:
                    return s(clientSecret, z11);
                case 18:
                    return b(clientSecret, z11);
                default:
                    throw new Exception("This paymentMethodType is not supported yet");
            }
        } catch (PaymentMethodCreateParamsException e11) {
            throw e11;
        }
    }

    public final PaymentMethodCreateParams t(PaymentMethod.Type paymentMethodType) {
        kotlin.jvm.internal.s.g(paymentMethodType, "paymentMethodType");
        try {
            switch (a.f20301a[paymentMethodType.ordinal()]) {
                case 1:
                    return g();
                case 2:
                    return m();
                case 3:
                    return d();
                case 4:
                    return v();
                case 5:
                    return f();
                case 6:
                    return u();
                case 7:
                    return o();
                case 8:
                    return k();
                case 9:
                    return i();
                case 10:
                    return l();
                case 11:
                    return p();
                case 12:
                    return j();
                case 13:
                    return c();
                case 14:
                    return e();
                case 15:
                    return n();
                case 16:
                    return w(this.f20296a);
                case 17:
                    return r();
                case 18:
                    return a();
                default:
                    throw new Exception("This paymentMethodType is not supported yet");
            }
        } catch (PaymentMethodCreateParamsException e11) {
            throw e11;
        }
    }
}