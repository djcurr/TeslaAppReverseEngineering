package com.adyen.checkout.components.model.payments.response;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class RedirectAction extends Action {
    public static final String ACTION_TYPE = "redirect";
    private static final String METHOD = "method";
    private static final String URL = "url";
    private String method;
    private String url;
    public static final c.a<RedirectAction> CREATOR = new c.a<>(RedirectAction.class);
    public static final c.b<RedirectAction> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<RedirectAction> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public RedirectAction a(JSONObject jSONObject) {
            RedirectAction redirectAction = new RedirectAction();
            redirectAction.setType(jSONObject.optString("type", null));
            redirectAction.setPaymentData(jSONObject.optString("paymentData", null));
            redirectAction.setPaymentMethodType(jSONObject.optString(Action.PAYMENT_METHOD_TYPE, null));
            redirectAction.setMethod(jSONObject.optString(RedirectAction.METHOD, null));
            redirectAction.setUrl(jSONObject.optString("url", null));
            return redirectAction;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(RedirectAction redirectAction) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", redirectAction.getType());
                jSONObject.putOpt("paymentData", redirectAction.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, redirectAction.getPaymentMethodType());
                jSONObject.putOpt(RedirectAction.METHOD, redirectAction.getMethod());
                jSONObject.putOpt("url", redirectAction.getUrl());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(RedirectAction.class, e11);
            }
        }
    }

    public String getMethod() {
        return this.method;
    }

    public String getUrl() {
        return this.url;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}