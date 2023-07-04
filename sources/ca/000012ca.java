package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class Address extends c {
    public static final String ADDRESS_COUNTRY_NULL_PLACEHOLDER = "ZZ";
    public static final String ADDRESS_NULL_PLACEHOLDER = "null";
    private static final String CITY = "city";
    private static final String COUNTRY = "country";
    private static final String HOUSE_NUMBER_OR_NAME = "houseNumberOrName";
    private static final String POSTAL_CODE = "postalCode";
    private static final String STATE_OR_PROVINCE = "stateOrProvince";
    private static final String STREET = "street";
    private String city;
    private String country;
    private String houseNumberOrName;
    private String postalCode;
    private String stateOrProvince;
    private String street;
    public static final c.a<Address> CREATOR = new c.a<>(Address.class);
    public static final c.b<Address> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<Address> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public Address a(JSONObject jSONObject) {
            Address address = new Address();
            address.setCity(jSONObject.optString(Address.CITY, null));
            address.setCountry(jSONObject.optString("country", null));
            address.setHouseNumberOrName(jSONObject.optString(Address.HOUSE_NUMBER_OR_NAME, null));
            address.setPostalCode(jSONObject.optString(Address.POSTAL_CODE, null));
            address.setStateOrProvince(jSONObject.optString(Address.STATE_OR_PROVINCE, null));
            address.setStreet(jSONObject.optString(Address.STREET, null));
            return address;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(Address address) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(Address.CITY, address.getCity());
                jSONObject.putOpt("country", address.getCountry());
                jSONObject.putOpt(Address.HOUSE_NUMBER_OR_NAME, address.getHouseNumberOrName());
                jSONObject.putOpt(Address.POSTAL_CODE, address.getPostalCode());
                jSONObject.putOpt(Address.STATE_OR_PROVINCE, address.getStateOrProvince());
                jSONObject.putOpt(Address.STREET, address.getStreet());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(Address.class, e11);
            }
        }
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getHouseNumberOrName() {
        return this.houseNumberOrName;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getStateOrProvince() {
        return this.stateOrProvince;
    }

    public String getStreet() {
        return this.street;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setHouseNumberOrName(String str) {
        this.houseNumberOrName = str;
    }

    public void setPostalCode(String str) {
        this.postalCode = str;
    }

    public void setStateOrProvince(String str) {
        this.stateOrProvince = str;
    }

    public void setStreet(String str) {
        this.street = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}