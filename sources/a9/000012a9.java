package com.adyen.checkout.components;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class ActionComponentData extends c {
    private static final String DETAILS = "details";
    private static final String PAYMENT_DATA = "paymentData";
    private JSONObject details;
    private String paymentData;
    public static final c.a<ActionComponentData> CREATOR = new c.a<>(ActionComponentData.class);
    public static final c.b<ActionComponentData> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<ActionComponentData> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public ActionComponentData a(JSONObject jSONObject) {
            ActionComponentData actionComponentData = new ActionComponentData();
            actionComponentData.setPaymentData(jSONObject.optString("paymentData"));
            actionComponentData.setDetails(jSONObject.optJSONObject("details"));
            return actionComponentData;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(ActionComponentData actionComponentData) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("paymentData", actionComponentData.getPaymentData());
                jSONObject.putOpt("details", actionComponentData.getDetails());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(ActionComponentData.class, e11);
            }
        }
    }

    public JSONObject getDetails() {
        return this.details;
    }

    public String getPaymentData() {
        return this.paymentData;
    }

    public void setDetails(JSONObject jSONObject) {
        this.details = jSONObject;
    }

    public void setPaymentData(String str) {
        this.paymentData = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}