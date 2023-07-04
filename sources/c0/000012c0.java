package com.adyen.checkout.components.model.paymentmethods;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class Issuer extends c {
    private static final String DISABLED = "disabled";
    private static final String ID = "id";
    private static final String NAME = "name";
    private boolean disabled;

    /* renamed from: id  reason: collision with root package name */
    private String f9561id;
    private String name;
    public static final c.a<Issuer> CREATOR = new c.a<>(Issuer.class);
    public static final c.b<Issuer> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<Issuer> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public Issuer a(JSONObject jSONObject) {
            Issuer issuer = new Issuer();
            issuer.setId(jSONObject.optString("id", null));
            issuer.setName(jSONObject.optString("name", null));
            issuer.setDisabled(jSONObject.optBoolean(Issuer.DISABLED, false));
            return issuer;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(Issuer issuer) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("id", issuer.getId());
                jSONObject.putOpt("name", issuer.getName());
                jSONObject.putOpt(Issuer.DISABLED, Boolean.valueOf(issuer.isDisabled()));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(PaymentMethod.class, e11);
            }
        }
    }

    public String getId() {
        return this.f9561id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isDisabled() {
        return this.disabled;
    }

    public void setDisabled(boolean z11) {
        this.disabled = z11;
    }

    public void setId(String str) {
        this.f9561id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}