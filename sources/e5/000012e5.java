package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class MBWayPaymentMethod extends PaymentMethodDetails {
    public static final String PAYMENT_METHOD_TYPE = "mbway";
    private static final String TELEPHONE_NUMBER = "telephoneNumber";
    private String telephoneNumber;
    public static final c.a<MBWayPaymentMethod> CREATOR = new c.a<>(MBWayPaymentMethod.class);
    public static final c.b<MBWayPaymentMethod> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<MBWayPaymentMethod> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public MBWayPaymentMethod a(JSONObject jSONObject) {
            MBWayPaymentMethod mBWayPaymentMethod = new MBWayPaymentMethod();
            mBWayPaymentMethod.setType(jSONObject.optString("type", null));
            mBWayPaymentMethod.setTelephoneNumber(jSONObject.optString(MBWayPaymentMethod.TELEPHONE_NUMBER, null));
            return mBWayPaymentMethod;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(MBWayPaymentMethod mBWayPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", mBWayPaymentMethod.getType());
                jSONObject.putOpt(MBWayPaymentMethod.TELEPHONE_NUMBER, mBWayPaymentMethod.getTelephoneNumber());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(GooglePayPaymentMethod.class, e11);
            }
        }
    }

    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public void setTelephoneNumber(String str) {
        this.telephoneNumber = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}