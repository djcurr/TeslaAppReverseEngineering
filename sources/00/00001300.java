package com.adyen.checkout.components.model.payments.response;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class QrCodeAction extends Action {
    public static final String ACTION_TYPE = "qrCode";
    private static final String QR_CODE_DATA = "qrCodeData";
    private static final String URL = "url";
    private String qrCodeData;
    private String url;
    public static final c.a<QrCodeAction> CREATOR = new c.a<>(QrCodeAction.class);
    public static final c.b<QrCodeAction> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<QrCodeAction> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public QrCodeAction a(JSONObject jSONObject) {
            QrCodeAction qrCodeAction = new QrCodeAction();
            qrCodeAction.setType(jSONObject.optString("type", null));
            qrCodeAction.setPaymentData(jSONObject.optString("paymentData", null));
            qrCodeAction.setPaymentMethodType(jSONObject.optString(Action.PAYMENT_METHOD_TYPE, null));
            qrCodeAction.setQrCodeData(jSONObject.optString(QrCodeAction.QR_CODE_DATA));
            qrCodeAction.setUrl(jSONObject.optString("url"));
            return qrCodeAction;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(QrCodeAction qrCodeAction) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", qrCodeAction.getType());
                jSONObject.putOpt("paymentData", qrCodeAction.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, qrCodeAction.getPaymentMethodType());
                jSONObject.putOpt(QrCodeAction.QR_CODE_DATA, qrCodeAction.getQrCodeData());
                jSONObject.putOpt("url", qrCodeAction.getUrl());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(QrCodeAction.class, e11);
            }
        }
    }

    public String getQrCodeData() {
        return this.qrCodeData;
    }

    public String getUrl() {
        return this.url;
    }

    public void setQrCodeData(String str) {
        this.qrCodeData = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}