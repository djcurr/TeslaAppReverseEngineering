package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public final class OpenBankingPaymentMethod extends IssuerListPaymentMethod {
    public static final String PAYMENT_METHOD_TYPE = "openbanking_UK";
    public static final c.a<OpenBankingPaymentMethod> CREATOR = new c.a<>(OpenBankingPaymentMethod.class);
    public static final c.b<OpenBankingPaymentMethod> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<OpenBankingPaymentMethod> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public OpenBankingPaymentMethod a(JSONObject jSONObject) {
            OpenBankingPaymentMethod openBankingPaymentMethod = new OpenBankingPaymentMethod();
            openBankingPaymentMethod.setType(jSONObject.optString("type", null));
            openBankingPaymentMethod.setIssuer(jSONObject.optString("issuer", null));
            return openBankingPaymentMethod;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(OpenBankingPaymentMethod openBankingPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", openBankingPaymentMethod.getType());
                jSONObject.putOpt("issuer", openBankingPaymentMethod.getIssuer());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(OpenBankingPaymentMethod.class, e11);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}