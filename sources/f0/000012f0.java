package com.adyen.checkout.components.model.payments.request;

import android.text.TextUtils;
import com.adyen.checkout.core.exception.CheckoutException;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public abstract class PaymentMethodDetails extends c {
    public static final c.b<PaymentMethodDetails> SERIALIZER = new a();
    public static final String TYPE = "type";
    private String type;

    /* loaded from: classes.dex */
    class a implements c.b<PaymentMethodDetails> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public PaymentMethodDetails a(JSONObject jSONObject) {
            String optString = jSONObject.optString("type", null);
            if (!TextUtils.isEmpty(optString)) {
                return PaymentMethodDetails.getChildSerializer(optString).a(jSONObject);
            }
            throw new CheckoutException("PaymentMethod type not found");
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(PaymentMethodDetails paymentMethodDetails) {
            String type = paymentMethodDetails.getType();
            if (!TextUtils.isEmpty(type)) {
                return PaymentMethodDetails.getChildSerializer(type).b(paymentMethodDetails);
            }
            throw new CheckoutException("PaymentMethod type not found");
        }
    }

    static c.b<? extends PaymentMethodDetails> getChildSerializer(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1647305830:
                if (str.equals("molpay_ebanking_fpx_MY")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1325974849:
                if (str.equals(DotpayPaymentMethod.PAYMENT_METHOD_TYPE)) {
                    c11 = 1;
                    break;
                }
                break;
            case -907987547:
                if (str.equals(CardPaymentMethod.PAYMENT_METHOD_TYPE)) {
                    c11 = 2;
                    break;
                }
                break;
            case -857582069:
                if (str.equals(EntercashPaymentMethod.PAYMENT_METHOD_TYPE)) {
                    c11 = 3;
                    break;
                }
                break;
            case 100648:
                if (str.equals("eps")) {
                    c11 = 4;
                    break;
                }
                break;
            case 3026668:
                if (str.equals(BlikPaymentMethod.PAYMENT_METHOD_TYPE)) {
                    c11 = 5;
                    break;
                }
                break;
            case 19088375:
                if (str.equals(BacsDirectDebitPaymentMethod.PAYMENT_METHOD_TYPE)) {
                    c11 = 6;
                    break;
                }
                break;
            case 100048981:
                if (str.equals("ideal")) {
                    c11 = 7;
                    break;
                }
                break;
            case 103700794:
                if (str.equals(MBWayPaymentMethod.PAYMENT_METHOD_TYPE)) {
                    c11 = '\b';
                    break;
                }
                break;
            case 849792064:
                if (str.equals(GiftCardPaymentMethod.PAYMENT_METHOD_TYPE)) {
                    c11 = '\t';
                    break;
                }
                break;
            case 970824177:
                if (str.equals("molpay_ebanking_TH")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 970824245:
                if (str.equals("molpay_ebanking_VN")) {
                    c11 = 11;
                    break;
                }
                break;
            case 1200873767:
                if (str.equals("paywithgoogle")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 1474526159:
                if (str.equals(PaymentSheetEvent.FIELD_GOOGLE_PAY)) {
                    c11 = '\r';
                    break;
                }
                break;
            case 1545915136:
                if (str.equals(SepaPaymentMethod.PAYMENT_METHOD_TYPE)) {
                    c11 = 14;
                    break;
                }
                break;
            case 1984622361:
                if (str.equals(OpenBankingPaymentMethod.PAYMENT_METHOD_TYPE)) {
                    c11 = 15;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case '\n':
            case 11:
                return MolpayPaymentMethod.SERIALIZER;
            case 1:
                return DotpayPaymentMethod.SERIALIZER;
            case 2:
                return CardPaymentMethod.SERIALIZER;
            case 3:
                return EntercashPaymentMethod.SERIALIZER;
            case 4:
                return EPSPaymentMethod.SERIALIZER;
            case 5:
                return BlikPaymentMethod.SERIALIZER;
            case 6:
                return BacsDirectDebitPaymentMethod.SERIALIZER;
            case 7:
                return IdealPaymentMethod.SERIALIZER;
            case '\b':
                return MBWayPaymentMethod.SERIALIZER;
            case '\t':
                return GiftCardPaymentMethod.SERIALIZER;
            case '\f':
            case '\r':
                return GooglePayPaymentMethod.SERIALIZER;
            case 14:
                return SepaPaymentMethod.SERIALIZER;
            case 15:
                return OpenBankingPaymentMethod.SERIALIZER;
            default:
                return GenericPaymentMethod.SERIALIZER;
        }
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }
}