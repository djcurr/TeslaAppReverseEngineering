package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class BlikPaymentMethod extends PaymentMethodDetails {
    private static final String BLIK_CODE = "blikCode";
    public static final String PAYMENT_METHOD_TYPE = "blik";
    private static final String STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
    private String blikCode;
    private String storedPaymentMethodId;
    public static final c.a<BlikPaymentMethod> CREATOR = new c.a<>(BlikPaymentMethod.class);
    public static final c.b<BlikPaymentMethod> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<BlikPaymentMethod> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public BlikPaymentMethod a(JSONObject jSONObject) {
            BlikPaymentMethod blikPaymentMethod = new BlikPaymentMethod();
            blikPaymentMethod.setType(jSONObject.optString("type", null));
            blikPaymentMethod.setBlikCode(jSONObject.optString(BlikPaymentMethod.BLIK_CODE, null));
            blikPaymentMethod.setStoredPaymentMethodId(jSONObject.optString(BlikPaymentMethod.STORED_PAYMENT_METHOD_ID, null));
            return blikPaymentMethod;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(BlikPaymentMethod blikPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", blikPaymentMethod.getType());
                jSONObject.putOpt(BlikPaymentMethod.BLIK_CODE, blikPaymentMethod.getBlikCode());
                jSONObject.putOpt(BlikPaymentMethod.STORED_PAYMENT_METHOD_ID, blikPaymentMethod.getStoredPaymentMethodId());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(BlikPaymentMethod.class, e11);
            }
        }
    }

    public String getBlikCode() {
        return this.blikCode;
    }

    public String getStoredPaymentMethodId() {
        return this.storedPaymentMethodId;
    }

    public void setBlikCode(String str) {
        this.blikCode = str;
    }

    public void setStoredPaymentMethodId(String str) {
        this.storedPaymentMethodId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}