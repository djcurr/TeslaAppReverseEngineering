package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public final class MolpayPaymentMethod extends IssuerListPaymentMethod {
    public static final c.a<MolpayPaymentMethod> CREATOR = new c.a<>(MolpayPaymentMethod.class);
    public static final c.b<MolpayPaymentMethod> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<MolpayPaymentMethod> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public MolpayPaymentMethod a(JSONObject jSONObject) {
            MolpayPaymentMethod molpayPaymentMethod = new MolpayPaymentMethod();
            molpayPaymentMethod.setType(jSONObject.optString("type", null));
            molpayPaymentMethod.setIssuer(jSONObject.optString("issuer", null));
            return molpayPaymentMethod;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(MolpayPaymentMethod molpayPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", molpayPaymentMethod.getType());
                jSONObject.putOpt("issuer", molpayPaymentMethod.getIssuer());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(MolpayPaymentMethod.class, e11);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}