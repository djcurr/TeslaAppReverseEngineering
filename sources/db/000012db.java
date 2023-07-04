package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class GiftCardPaymentMethod extends PaymentMethodDetails {
    private static final String BRAND = "brand";
    private static final String ENCRYPTED_CARD_NUMBER = "encryptedCardNumber";
    private static final String ENCRYPTED_SECURITY_CODE = "encryptedSecurityCode";
    public static final String PAYMENT_METHOD_TYPE = "giftcard";
    private String brand;
    private String encryptedCardNumber;
    private String encryptedSecurityCode;
    public static final c.a<GiftCardPaymentMethod> CREATOR = new c.a<>(GiftCardPaymentMethod.class);
    public static final c.b<GiftCardPaymentMethod> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<GiftCardPaymentMethod> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public GiftCardPaymentMethod a(JSONObject jSONObject) {
            GiftCardPaymentMethod giftCardPaymentMethod = new GiftCardPaymentMethod();
            giftCardPaymentMethod.setType(jSONObject.optString("type", null));
            giftCardPaymentMethod.setEncryptedCardNumber(jSONObject.optString(GiftCardPaymentMethod.ENCRYPTED_CARD_NUMBER, null));
            giftCardPaymentMethod.setEncryptedSecurityCode(jSONObject.optString(GiftCardPaymentMethod.ENCRYPTED_SECURITY_CODE, null));
            giftCardPaymentMethod.setBrand(jSONObject.optString("brand"));
            return giftCardPaymentMethod;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(GiftCardPaymentMethod giftCardPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", giftCardPaymentMethod.getType());
                jSONObject.putOpt(GiftCardPaymentMethod.ENCRYPTED_CARD_NUMBER, giftCardPaymentMethod.getEncryptedCardNumber());
                jSONObject.putOpt(GiftCardPaymentMethod.ENCRYPTED_SECURITY_CODE, giftCardPaymentMethod.getEncryptedSecurityCode());
                jSONObject.putOpt("brand", giftCardPaymentMethod.getBrand());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(GooglePayPaymentMethod.class, e11);
            }
        }
    }

    public String getBrand() {
        return this.brand;
    }

    public String getEncryptedCardNumber() {
        return this.encryptedCardNumber;
    }

    public String getEncryptedSecurityCode() {
        return this.encryptedSecurityCode;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setEncryptedCardNumber(String str) {
        this.encryptedCardNumber = str;
    }

    public void setEncryptedSecurityCode(String str) {
        this.encryptedSecurityCode = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}