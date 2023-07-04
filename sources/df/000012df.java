package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public final class IdealPaymentMethod extends IssuerListPaymentMethod {
    public static final String PAYMENT_METHOD_TYPE = "ideal";
    public static final c.a<IdealPaymentMethod> CREATOR = new c.a<>(IdealPaymentMethod.class);
    public static final c.b<IdealPaymentMethod> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<IdealPaymentMethod> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public IdealPaymentMethod a(JSONObject jSONObject) {
            IdealPaymentMethod idealPaymentMethod = new IdealPaymentMethod();
            idealPaymentMethod.setType(jSONObject.optString("type", null));
            idealPaymentMethod.setIssuer(jSONObject.optString("issuer", null));
            return idealPaymentMethod;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(IdealPaymentMethod idealPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", idealPaymentMethod.getType());
                jSONObject.putOpt("issuer", idealPaymentMethod.getIssuer());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(IdealPaymentMethod.class, e11);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}