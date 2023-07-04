package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class GenericPaymentMethod extends PaymentMethodDetails {
    public static final c.a<GenericPaymentMethod> CREATOR = new c.a<>(GenericPaymentMethod.class);
    public static final c.b<GenericPaymentMethod> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<GenericPaymentMethod> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public GenericPaymentMethod a(JSONObject jSONObject) {
            return new GenericPaymentMethod(jSONObject.optString("type", null));
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(GenericPaymentMethod genericPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", genericPaymentMethod.getType());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(GenericPaymentMethod.class, e11);
            }
        }
    }

    public GenericPaymentMethod(String str) {
        setType(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}