package com.adyen.checkout.components.status.model;

import android.os.Parcel;
import com.adyen.checkout.components.model.payments.request.Address;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class StatusResponse extends c {
    public static final String PAYLOAD = "payload";
    public static final String RESULT_CODE = "resultCode";
    public static final String TYPE = "type";
    private String payload;
    private String resultCode;
    private String type;
    public static final c.a<StatusResponse> CREATOR = new c.a<>(StatusResponse.class);
    public static final c.b<StatusResponse> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<StatusResponse> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public StatusResponse a(JSONObject jSONObject) {
            StatusResponse statusResponse = new StatusResponse();
            statusResponse.setType(jSONObject.optString("type", null));
            statusResponse.setPayload(jSONObject.optString(StatusResponse.PAYLOAD, null));
            statusResponse.setResultCode(jSONObject.optString(StatusResponse.RESULT_CODE, null));
            return statusResponse;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(StatusResponse statusResponse) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", statusResponse.getType());
                jSONObject.putOpt(StatusResponse.PAYLOAD, statusResponse.getPayload());
                jSONObject.putOpt(StatusResponse.RESULT_CODE, statusResponse.getResultCode());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(Address.class, e11);
            }
        }
    }

    public String getPayload() {
        return this.payload;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public String getType() {
        return this.type;
    }

    public void setPayload(String str) {
        this.payload = str;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}