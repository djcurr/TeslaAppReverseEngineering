package com.adyen.checkout.components.model.paymentmethods;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class Configuration extends c {
    private static final String GATEWAY_MERCHANT_ID = "gatewayMerchantId";
    private static final String INTENT = "intent";
    private static final String KOREAN_AUTHENTICATION_REQUIRED = "koreanAuthenticationRequired";
    private static final String MERCHANT_ID = "merchantId";
    private String gatewayMerchantId;
    private String intent;
    private String koreanAuthenticationRequired;
    private String merchantId;
    public static final c.a<Configuration> CREATOR = new c.a<>(Configuration.class);
    public static final c.b<Configuration> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<Configuration> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public Configuration a(JSONObject jSONObject) {
            Configuration configuration = new Configuration();
            configuration.setMerchantId(jSONObject.optString(Configuration.MERCHANT_ID, null));
            configuration.setGatewayMerchantId(jSONObject.optString(Configuration.GATEWAY_MERCHANT_ID, null));
            configuration.setIntent(jSONObject.optString(Configuration.INTENT, null));
            configuration.setKoreanAuthenticationRequired(jSONObject.optString(Configuration.KOREAN_AUTHENTICATION_REQUIRED, null));
            return configuration;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(Configuration configuration) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(Configuration.MERCHANT_ID, configuration.getMerchantId());
                jSONObject.putOpt(Configuration.GATEWAY_MERCHANT_ID, configuration.getGatewayMerchantId());
                jSONObject.putOpt(Configuration.INTENT, configuration.getIntent());
                jSONObject.putOpt(Configuration.KOREAN_AUTHENTICATION_REQUIRED, configuration.getKoreanAuthenticationRequired());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(PaymentMethod.class, e11);
            }
        }
    }

    public String getGatewayMerchantId() {
        return this.gatewayMerchantId;
    }

    public String getIntent() {
        return this.intent;
    }

    public String getKoreanAuthenticationRequired() {
        return this.koreanAuthenticationRequired;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public void setGatewayMerchantId(String str) {
        this.gatewayMerchantId = str;
    }

    public void setIntent(String str) {
        this.intent = str;
    }

    public void setKoreanAuthenticationRequired(String str) {
        this.koreanAuthenticationRequired = str;
    }

    public void setMerchantId(String str) {
        this.merchantId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}