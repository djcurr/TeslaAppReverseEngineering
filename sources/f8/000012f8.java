package com.adyen.checkout.components.model.payments.response;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class AwaitAction extends Action {
    public static final String ACTION_TYPE = "await";
    public static final c.a<AwaitAction> CREATOR = new c.a<>(AwaitAction.class);
    public static final c.b<AwaitAction> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<AwaitAction> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public AwaitAction a(JSONObject jSONObject) {
            AwaitAction awaitAction = new AwaitAction();
            awaitAction.setType(jSONObject.optString("type", null));
            awaitAction.setPaymentData(jSONObject.optString("paymentData", null));
            awaitAction.setPaymentMethodType(jSONObject.optString(Action.PAYMENT_METHOD_TYPE, null));
            return awaitAction;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(AwaitAction awaitAction) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", awaitAction.getType());
                jSONObject.putOpt("paymentData", awaitAction.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, awaitAction.getPaymentMethodType());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(RedirectAction.class, e11);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}