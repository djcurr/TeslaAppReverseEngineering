package com.adyen.checkout.components.model;

import android.os.Parcel;
import com.adyen.checkout.components.model.paymentmethods.PaymentMethod;
import com.adyen.checkout.components.model.paymentmethods.StoredPaymentMethod;
import com.adyen.checkout.core.exception.ModelSerializationException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;
import p7.d;

/* loaded from: classes.dex */
public final class PaymentMethodsApiResponse extends c {
    private static final String PAYMENT_METHODS = "paymentMethods";
    private static final String STORED_PAYMENT_METHODS = "storedPaymentMethods";
    private List<PaymentMethod> paymentMethods;
    private List<StoredPaymentMethod> storedPaymentMethods;
    public static final c.a<PaymentMethodsApiResponse> CREATOR = new c.a<>(PaymentMethodsApiResponse.class);
    public static final c.b<PaymentMethodsApiResponse> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<PaymentMethodsApiResponse> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public PaymentMethodsApiResponse a(JSONObject jSONObject) {
            PaymentMethodsApiResponse paymentMethodsApiResponse = new PaymentMethodsApiResponse();
            paymentMethodsApiResponse.setStoredPaymentMethods(d.c(jSONObject.optJSONArray(PaymentMethodsApiResponse.STORED_PAYMENT_METHODS), StoredPaymentMethod.SERIALIZER));
            paymentMethodsApiResponse.setPaymentMethods(d.c(jSONObject.optJSONArray(PaymentMethodsApiResponse.PAYMENT_METHODS), PaymentMethod.SERIALIZER));
            return paymentMethodsApiResponse;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(PaymentMethodsApiResponse paymentMethodsApiResponse) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(PaymentMethodsApiResponse.STORED_PAYMENT_METHODS, d.f(paymentMethodsApiResponse.getStoredPaymentMethods(), StoredPaymentMethod.SERIALIZER));
                jSONObject.putOpt(PaymentMethodsApiResponse.PAYMENT_METHODS, d.f(paymentMethodsApiResponse.getPaymentMethods(), PaymentMethod.SERIALIZER));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(PaymentMethodsApiResponse.class, e11);
            }
        }
    }

    public List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    public List<StoredPaymentMethod> getStoredPaymentMethods() {
        return this.storedPaymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> list) {
        this.paymentMethods = list;
    }

    public void setStoredPaymentMethods(List<StoredPaymentMethod> list) {
        this.storedPaymentMethods = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}