package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class GooglePayPaymentMethod extends PaymentMethodDetails {
    private static final String GOOGLE_PAY_CARD_NETWORK = "googlePayCardNetwork";
    private static final String GOOGLE_PAY_TOKEN = "googlePayToken";
    private String googlePayCardNetwork;
    private String googlePayToken;
    public static final c.a<GooglePayPaymentMethod> CREATOR = new c.a<>(GooglePayPaymentMethod.class);
    public static final c.b<GooglePayPaymentMethod> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<GooglePayPaymentMethod> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public GooglePayPaymentMethod a(JSONObject jSONObject) {
            GooglePayPaymentMethod googlePayPaymentMethod = new GooglePayPaymentMethod();
            googlePayPaymentMethod.setType(jSONObject.optString("type", null));
            googlePayPaymentMethod.setGooglePayToken(jSONObject.optString(GooglePayPaymentMethod.GOOGLE_PAY_TOKEN, null));
            googlePayPaymentMethod.setGooglePayCardNetwork(jSONObject.optString(GooglePayPaymentMethod.GOOGLE_PAY_CARD_NETWORK, null));
            return googlePayPaymentMethod;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(GooglePayPaymentMethod googlePayPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", googlePayPaymentMethod.getType());
                jSONObject.putOpt(GooglePayPaymentMethod.GOOGLE_PAY_TOKEN, googlePayPaymentMethod.getGooglePayToken());
                jSONObject.putOpt(GooglePayPaymentMethod.GOOGLE_PAY_CARD_NETWORK, googlePayPaymentMethod.getGooglePayCardNetwork());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(GooglePayPaymentMethod.class, e11);
            }
        }
    }

    public String getGooglePayCardNetwork() {
        return this.googlePayCardNetwork;
    }

    public String getGooglePayToken() {
        return this.googlePayToken;
    }

    public void setGooglePayCardNetwork(String str) {
        this.googlePayCardNetwork = str;
    }

    public void setGooglePayToken(String str) {
        this.googlePayToken = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}