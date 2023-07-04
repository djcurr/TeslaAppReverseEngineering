package com.adyen.checkout.components.model.payments.response;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class WeChatPaySdkData extends SdkData {
    private static final String APP_ID = "appid";
    private static final String NONCE_STR = "noncestr";
    private static final String PACKAGE_VALUE = "packageValue";
    private static final String PARTNER_ID = "partnerid";
    private static final String PREPAY_ID = "prepayid";
    private static final String SIGN = "sign";
    private static final String TIMESTAMP = "timestamp";
    private String appid;
    private String noncestr;
    private String packageValue;
    private String partnerid;
    private String prepayid;
    private String sign;
    private String timestamp;
    public static final c.a<WeChatPaySdkData> CREATOR = new c.a<>(WeChatPaySdkData.class);
    public static final c.b<WeChatPaySdkData> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<WeChatPaySdkData> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public WeChatPaySdkData a(JSONObject jSONObject) {
            WeChatPaySdkData weChatPaySdkData = new WeChatPaySdkData();
            weChatPaySdkData.setAppid(jSONObject.optString(WeChatPaySdkData.APP_ID, null));
            weChatPaySdkData.setNoncestr(jSONObject.optString(WeChatPaySdkData.NONCE_STR, null));
            weChatPaySdkData.setPackageValue(jSONObject.optString(WeChatPaySdkData.PACKAGE_VALUE, null));
            weChatPaySdkData.setPartnerid(jSONObject.optString(WeChatPaySdkData.PARTNER_ID, null));
            weChatPaySdkData.setPrepayid(jSONObject.optString(WeChatPaySdkData.PREPAY_ID, null));
            weChatPaySdkData.setSign(jSONObject.optString(WeChatPaySdkData.SIGN, null));
            weChatPaySdkData.setTimestamp(jSONObject.optString("timestamp", null));
            return weChatPaySdkData;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(WeChatPaySdkData weChatPaySdkData) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(WeChatPaySdkData.APP_ID, weChatPaySdkData.getAppid());
                jSONObject.putOpt(WeChatPaySdkData.NONCE_STR, weChatPaySdkData.getNoncestr());
                jSONObject.putOpt(WeChatPaySdkData.PACKAGE_VALUE, weChatPaySdkData.getPackageValue());
                jSONObject.putOpt(WeChatPaySdkData.PARTNER_ID, weChatPaySdkData.getPartnerid());
                jSONObject.putOpt(WeChatPaySdkData.PREPAY_ID, weChatPaySdkData.getPrepayid());
                jSONObject.putOpt(WeChatPaySdkData.SIGN, weChatPaySdkData.getSign());
                jSONObject.putOpt("timestamp", weChatPaySdkData.getTimestamp());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(WeChatPaySdkData.class, e11);
            }
        }
    }

    public String getAppid() {
        return this.appid;
    }

    public String getNoncestr() {
        return this.noncestr;
    }

    public String getPackageValue() {
        return this.packageValue;
    }

    public String getPartnerid() {
        return this.partnerid;
    }

    public String getPrepayid() {
        return this.prepayid;
    }

    public String getSign() {
        return this.sign;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setNoncestr(String str) {
        this.noncestr = str;
    }

    public void setPackageValue(String str) {
        this.packageValue = str;
    }

    public void setPartnerid(String str) {
        this.partnerid = str;
    }

    public void setPrepayid(String str) {
        this.prepayid = str;
    }

    public void setSign(String str) {
        this.sign = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}