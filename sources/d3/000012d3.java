package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public final class DotpayPaymentMethod extends IssuerListPaymentMethod {
    public static final String PAYMENT_METHOD_TYPE = "dotpay";
    public static final c.a<DotpayPaymentMethod> CREATOR = new c.a<>(DotpayPaymentMethod.class);
    public static final c.b<DotpayPaymentMethod> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<DotpayPaymentMethod> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public DotpayPaymentMethod a(JSONObject jSONObject) {
            DotpayPaymentMethod dotpayPaymentMethod = new DotpayPaymentMethod();
            dotpayPaymentMethod.setType(jSONObject.optString("type", null));
            dotpayPaymentMethod.setIssuer(jSONObject.optString("issuer", null));
            return dotpayPaymentMethod;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(DotpayPaymentMethod dotpayPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", dotpayPaymentMethod.getType());
                jSONObject.putOpt("issuer", dotpayPaymentMethod.getIssuer());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(DotpayPaymentMethod.class, e11);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}