package com.adyen.checkout.components.model.payments.response;

import android.os.Parcel;
import com.adyen.checkout.components.model.payments.response.SdkData;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;
import p7.d;

/* loaded from: classes.dex */
public class SdkAction<SdkDataT extends SdkData> extends Action {
    public static final String ACTION_TYPE = "sdk";
    private static final String SDK_DATA = "sdkData";
    private SdkDataT sdkData;
    public static final c.a<SdkAction> CREATOR = new c.a<>(SdkAction.class);
    public static final c.b<SdkAction> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<SdkAction> {
        a() {
        }

        private c.b<? extends SdkData> d(String str) {
            if (str != null) {
                if (str.equals("wechatpaySDK")) {
                    return WeChatPaySdkData.SERIALIZER;
                }
                throw new CheckoutException("sdkData not found for type paymentMethodType - " + str);
            }
            throw new CheckoutException("SdkAction cannot be parsed with null paymentMethodType.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p7.c.b
        /* renamed from: c */
        public SdkAction a(JSONObject jSONObject) {
            SdkAction sdkAction = new SdkAction();
            sdkAction.setType(jSONObject.optString("type", null));
            sdkAction.setPaymentData(jSONObject.optString("paymentData", null));
            sdkAction.setPaymentMethodType(jSONObject.optString(Action.PAYMENT_METHOD_TYPE, null));
            sdkAction.setSdkData((SdkData) d.b(jSONObject.optJSONObject(SdkAction.SDK_DATA), d(sdkAction.getPaymentMethodType())));
            return sdkAction;
        }

        @Override // p7.c.b
        /* renamed from: e */
        public JSONObject b(SdkAction sdkAction) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", sdkAction.getType());
                jSONObject.putOpt("paymentData", sdkAction.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, sdkAction.getPaymentMethodType());
                c.b<? extends SdkData> d11 = d(sdkAction.getPaymentMethodType());
                if (sdkAction.getSdkData() != null) {
                    jSONObject.putOpt(SdkAction.SDK_DATA, d.e(sdkAction.getSdkData(), d11));
                }
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SdkAction.class, e11);
            }
        }
    }

    public SdkDataT getSdkData() {
        return this.sdkData;
    }

    public void setSdkData(SdkDataT sdkdatat) {
        this.sdkData = sdkdatat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}