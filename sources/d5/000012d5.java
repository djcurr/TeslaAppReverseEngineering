package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public final class EPSPaymentMethod extends IssuerListPaymentMethod {
    public static final String PAYMENT_METHOD_TYPE = "eps";
    public static final c.a<EPSPaymentMethod> CREATOR = new c.a<>(EPSPaymentMethod.class);
    public static final c.b<EPSPaymentMethod> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<EPSPaymentMethod> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public EPSPaymentMethod a(JSONObject jSONObject) {
            EPSPaymentMethod ePSPaymentMethod = new EPSPaymentMethod();
            ePSPaymentMethod.setType(jSONObject.optString("type", null));
            ePSPaymentMethod.setIssuer(jSONObject.optString("issuer", null));
            return ePSPaymentMethod;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(EPSPaymentMethod ePSPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", ePSPaymentMethod.getType());
                jSONObject.putOpt("issuer", ePSPaymentMethod.getIssuer());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(EPSPaymentMethod.class, e11);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}