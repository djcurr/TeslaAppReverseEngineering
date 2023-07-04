package com.adyen.checkout.components.model.payments.response;

import android.os.Parcel;
import com.adyen.checkout.components.model.payments.Amount;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;
import p7.d;

/* loaded from: classes.dex */
public class VoucherAction extends Action {
    public static final String ACTION_TYPE = "voucher";
    private static final String ALTERNATIVE_REFERENCE = "alternativeReference";
    private static final String EXPIRES_AT = "expiresAt";
    private static final String INITIAL_AMOUNT = "initialAmount";
    private static final String ISSUER = "issuer";
    private static final String MERCHANT_NAME = "merchantName";
    private static final String REFERENCE = "reference";
    private static final String SURCHARGE = "surcharge";
    private static final String TOTAL_AMOUNT = "totalAmount";
    private static final String URL = "url";
    private String alternativeReference;
    private String expiresAt;
    private Amount initialAmount;
    private String issuer;
    private String merchantName;
    private String reference;
    private Amount surcharge;
    private Amount totalAmount;
    private String url;
    public static final c.a<VoucherAction> CREATOR = new c.a<>(VoucherAction.class);
    public static final c.b<VoucherAction> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<VoucherAction> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public VoucherAction a(JSONObject jSONObject) {
            VoucherAction voucherAction = new VoucherAction();
            voucherAction.setType(jSONObject.optString("type", null));
            voucherAction.setPaymentData(jSONObject.optString("paymentData", null));
            voucherAction.setPaymentMethodType(jSONObject.optString(Action.PAYMENT_METHOD_TYPE, null));
            JSONObject optJSONObject = jSONObject.optJSONObject(VoucherAction.SURCHARGE);
            c.b<Amount> bVar = Amount.SERIALIZER;
            voucherAction.setSurcharge((Amount) d.b(optJSONObject, bVar));
            voucherAction.setInitialAmount((Amount) d.b(jSONObject.optJSONObject(VoucherAction.INITIAL_AMOUNT), bVar));
            voucherAction.setTotalAmount((Amount) d.b(jSONObject.optJSONObject(VoucherAction.TOTAL_AMOUNT), bVar));
            voucherAction.setIssuer(jSONObject.optString(VoucherAction.ISSUER));
            voucherAction.setExpiresAt(jSONObject.optString(VoucherAction.EXPIRES_AT));
            voucherAction.setReference(jSONObject.optString(VoucherAction.REFERENCE));
            voucherAction.setAlternativeReference(jSONObject.optString(VoucherAction.ALTERNATIVE_REFERENCE));
            voucherAction.setMerchantName(jSONObject.optString("merchantName"));
            voucherAction.setUrl(jSONObject.optString("url"));
            return voucherAction;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(VoucherAction voucherAction) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", voucherAction.getType());
                jSONObject.putOpt("paymentData", voucherAction.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, voucherAction.getPaymentMethodType());
                Amount surcharge = voucherAction.getSurcharge();
                c.b<Amount> bVar = Amount.SERIALIZER;
                jSONObject.putOpt(VoucherAction.SURCHARGE, d.e(surcharge, bVar));
                jSONObject.putOpt(VoucherAction.INITIAL_AMOUNT, d.e(voucherAction.getInitialAmount(), bVar));
                jSONObject.putOpt(VoucherAction.TOTAL_AMOUNT, d.e(voucherAction.getTotalAmount(), bVar));
                jSONObject.putOpt(VoucherAction.ISSUER, voucherAction.getIssuer());
                jSONObject.putOpt(VoucherAction.EXPIRES_AT, voucherAction.getExpiresAt());
                jSONObject.putOpt(VoucherAction.REFERENCE, voucherAction.getReference());
                jSONObject.putOpt(VoucherAction.ALTERNATIVE_REFERENCE, voucherAction.getAlternativeReference());
                jSONObject.putOpt("merchantName", voucherAction.getMerchantName());
                jSONObject.putOpt("url", voucherAction.getUrl());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(VoucherAction.class, e11);
            }
        }
    }

    public String getAlternativeReference() {
        return this.alternativeReference;
    }

    public String getExpiresAt() {
        return this.expiresAt;
    }

    public Amount getInitialAmount() {
        return this.initialAmount;
    }

    public String getIssuer() {
        return this.issuer;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getReference() {
        return this.reference;
    }

    public Amount getSurcharge() {
        return this.surcharge;
    }

    public Amount getTotalAmount() {
        return this.totalAmount;
    }

    public String getUrl() {
        return this.url;
    }

    public void setAlternativeReference(String str) {
        this.alternativeReference = str;
    }

    public void setExpiresAt(String str) {
        this.expiresAt = str;
    }

    public void setInitialAmount(Amount amount) {
        this.initialAmount = amount;
    }

    public void setIssuer(String str) {
        this.issuer = str;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setReference(String str) {
        this.reference = str;
    }

    public void setSurcharge(Amount amount) {
        this.surcharge = amount;
    }

    public void setTotalAmount(Amount amount) {
        this.totalAmount = amount;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}