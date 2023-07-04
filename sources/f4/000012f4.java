package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class ShopperName extends c {
    private static final String FIRST_NAME = "firstName";
    private static final String GENDER = "gender";
    private static final String INFIX = "infix";
    private static final String LAST_NAME = "lastName";
    private String firstName;
    private String gender;
    private String infix;
    private String lastName;
    public static final c.a<ShopperName> CREATOR = new c.a<>(ShopperName.class);
    public static final c.b<ShopperName> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<ShopperName> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public ShopperName a(JSONObject jSONObject) {
            ShopperName shopperName = new ShopperName();
            shopperName.setFirstName(jSONObject.optString(ShopperName.FIRST_NAME, null));
            shopperName.setInfix(jSONObject.optString(ShopperName.INFIX, null));
            shopperName.setLastName(jSONObject.optString(ShopperName.LAST_NAME, null));
            shopperName.setGender(jSONObject.optString(ShopperName.GENDER, null));
            return shopperName;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(ShopperName shopperName) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(ShopperName.FIRST_NAME, shopperName.getFirstName());
                jSONObject.putOpt(ShopperName.INFIX, shopperName.getInfix());
                jSONObject.putOpt(ShopperName.LAST_NAME, shopperName.getLastName());
                jSONObject.putOpt(ShopperName.GENDER, shopperName.getGender());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(ShopperName.class, e11);
            }
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getGender() {
        return this.gender;
    }

    public String getInfix() {
        return this.infix;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public void setInfix(String str) {
        this.infix = str;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}