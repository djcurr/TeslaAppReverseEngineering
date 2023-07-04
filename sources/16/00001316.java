package com.adyen.checkout.components.status.model;

import android.os.Parcel;
import com.adyen.checkout.components.model.payments.request.Address;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class StatusRequest extends c {
    public static final String PAYMENT_DATA = "paymentData";
    private String paymentData;
    public static final c.a<StatusRequest> CREATOR = new c.a<>(StatusRequest.class);
    public static final c.b<StatusRequest> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<StatusRequest> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public StatusRequest a(JSONObject jSONObject) {
            StatusRequest statusRequest = new StatusRequest();
            statusRequest.setPaymentData(jSONObject.optString("paymentData", null));
            return statusRequest;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(StatusRequest statusRequest) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("paymentData", statusRequest.getPaymentData());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(Address.class, e11);
            }
        }
    }

    public String getPaymentData() {
        return this.paymentData;
    }

    public void setPaymentData(String str) {
        this.paymentData = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}