package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class SepaPaymentMethod extends PaymentMethodDetails {
    private static final String IBAN = "iban";
    private static final String OWNER_NAME = "ownerName";
    public static final String PAYMENT_METHOD_TYPE = "sepadirectdebit";
    private String iban;
    private String ownerName;
    public static final c.a<SepaPaymentMethod> CREATOR = new c.a<>(SepaPaymentMethod.class);
    public static final c.b<SepaPaymentMethod> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<SepaPaymentMethod> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public SepaPaymentMethod a(JSONObject jSONObject) {
            SepaPaymentMethod sepaPaymentMethod = new SepaPaymentMethod();
            sepaPaymentMethod.setType(jSONObject.optString("type", null));
            sepaPaymentMethod.setOwnerName(jSONObject.optString(SepaPaymentMethod.OWNER_NAME, null));
            sepaPaymentMethod.setIban(jSONObject.optString(SepaPaymentMethod.IBAN, null));
            return sepaPaymentMethod;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(SepaPaymentMethod sepaPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", sepaPaymentMethod.getType());
                jSONObject.putOpt(SepaPaymentMethod.OWNER_NAME, sepaPaymentMethod.getOwnerName());
                jSONObject.putOpt(SepaPaymentMethod.IBAN, sepaPaymentMethod.getIban());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SepaPaymentMethod.class, e11);
            }
        }
    }

    public String getIban() {
        return this.iban;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setIban(String str) {
        this.iban = str;
    }

    public void setOwnerName(String str) {
        this.ownerName = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}