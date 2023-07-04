package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public final class EntercashPaymentMethod extends IssuerListPaymentMethod {
    public static final String PAYMENT_METHOD_TYPE = "entercash";
    public static final c.a<EntercashPaymentMethod> CREATOR = new c.a<>(EntercashPaymentMethod.class);
    public static final c.b<EntercashPaymentMethod> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<EntercashPaymentMethod> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public EntercashPaymentMethod a(JSONObject jSONObject) {
            EntercashPaymentMethod entercashPaymentMethod = new EntercashPaymentMethod();
            entercashPaymentMethod.setType(jSONObject.optString("type", null));
            entercashPaymentMethod.setIssuer(jSONObject.optString("issuer", null));
            return entercashPaymentMethod;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(EntercashPaymentMethod entercashPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", entercashPaymentMethod.getType());
                jSONObject.putOpt("issuer", entercashPaymentMethod.getIssuer());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(EntercashPaymentMethod.class, e11);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}