package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.model.parsers.TokenJsonParser;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class GooglePayResult implements Parcelable {
    private final Address address;
    private final String email;
    private final String name;
    private final String phoneNumber;
    private final ShippingInformation shippingInformation;
    private final Token token;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GooglePayResult> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ShippingInformation createShippingInformation(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("shippingAddress");
            if (optJSONObject == null) {
                return null;
            }
            String optString = StripeJsonUtils.optString(optJSONObject, "address1");
            String optString2 = StripeJsonUtils.optString(optJSONObject, "address2");
            String optString3 = StripeJsonUtils.optString(optJSONObject, "postalCode");
            return new ShippingInformation(new Address(StripeJsonUtils.optString(optJSONObject, PlaceTypes.LOCALITY), StripeJsonUtils.optString(optJSONObject, "countryCode"), optString, optString2, optString3, StripeJsonUtils.optString(optJSONObject, "administrativeArea")), StripeJsonUtils.optString(optJSONObject, "name"), StripeJsonUtils.optString(optJSONObject, "phoneNumber"));
        }

        public final GooglePayResult fromJson(JSONObject paymentDataJson) {
            Address address;
            s.g(paymentDataJson, "paymentDataJson");
            JSONObject jSONObject = paymentDataJson.getJSONObject("paymentMethodData");
            Token parse = new TokenJsonParser().parse(new JSONObject(jSONObject.getJSONObject("tokenizationData").getString("token")));
            JSONObject optJSONObject = jSONObject.getJSONObject("info").optJSONObject("billingAddress");
            if (optJSONObject == null) {
                address = null;
            } else {
                address = new Address(StripeJsonUtils.optString(optJSONObject, PlaceTypes.LOCALITY), StripeJsonUtils.optString(optJSONObject, "countryCode"), StripeJsonUtils.optString(optJSONObject, "address1"), StripeJsonUtils.optString(optJSONObject, "address2"), StripeJsonUtils.optString(optJSONObject, "postalCode"), StripeJsonUtils.optString(optJSONObject, "administrativeArea"));
            }
            return new GooglePayResult(parse, address, StripeJsonUtils.optString(optJSONObject, "name"), StripeJsonUtils.optString(paymentDataJson, "email"), StripeJsonUtils.optString(optJSONObject, "phoneNumber"), createShippingInformation(paymentDataJson));
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<GooglePayResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayResult createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new GooglePayResult((Token) parcel.readParcelable(GooglePayResult.class.getClassLoader()), parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ShippingInformation.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayResult[] newArray(int i11) {
            return new GooglePayResult[i11];
        }
    }

    public GooglePayResult() {
        this(null, null, null, null, null, null, 63, null);
    }

    public GooglePayResult(Token token, Address address, String str, String str2, String str3, ShippingInformation shippingInformation) {
        this.token = token;
        this.address = address;
        this.name = str;
        this.email = str2;
        this.phoneNumber = str3;
        this.shippingInformation = shippingInformation;
    }

    public static /* synthetic */ GooglePayResult copy$default(GooglePayResult googlePayResult, Token token, Address address, String str, String str2, String str3, ShippingInformation shippingInformation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            token = googlePayResult.token;
        }
        if ((i11 & 2) != 0) {
            address = googlePayResult.address;
        }
        Address address2 = address;
        if ((i11 & 4) != 0) {
            str = googlePayResult.name;
        }
        String str4 = str;
        if ((i11 & 8) != 0) {
            str2 = googlePayResult.email;
        }
        String str5 = str2;
        if ((i11 & 16) != 0) {
            str3 = googlePayResult.phoneNumber;
        }
        String str6 = str3;
        if ((i11 & 32) != 0) {
            shippingInformation = googlePayResult.shippingInformation;
        }
        return googlePayResult.copy(token, address2, str4, str5, str6, shippingInformation);
    }

    public static final GooglePayResult fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final Token component1() {
        return this.token;
    }

    public final Address component2() {
        return this.address;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.email;
    }

    public final String component5() {
        return this.phoneNumber;
    }

    public final ShippingInformation component6() {
        return this.shippingInformation;
    }

    public final GooglePayResult copy(Token token, Address address, String str, String str2, String str3, ShippingInformation shippingInformation) {
        return new GooglePayResult(token, address, str, str2, str3, shippingInformation);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GooglePayResult) {
            GooglePayResult googlePayResult = (GooglePayResult) obj;
            return s.c(this.token, googlePayResult.token) && s.c(this.address, googlePayResult.address) && s.c(this.name, googlePayResult.name) && s.c(this.email, googlePayResult.email) && s.c(this.phoneNumber, googlePayResult.phoneNumber) && s.c(this.shippingInformation, googlePayResult.shippingInformation);
        }
        return false;
    }

    public final Address getAddress() {
        return this.address;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }

    public final Token getToken() {
        return this.token;
    }

    public int hashCode() {
        Token token = this.token;
        int hashCode = (token == null ? 0 : token.hashCode()) * 31;
        Address address = this.address;
        int hashCode2 = (hashCode + (address == null ? 0 : address.hashCode())) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNumber;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ShippingInformation shippingInformation = this.shippingInformation;
        return hashCode5 + (shippingInformation != null ? shippingInformation.hashCode() : 0);
    }

    public String toString() {
        return "GooglePayResult(token=" + this.token + ", address=" + this.address + ", name=" + ((Object) this.name) + ", email=" + ((Object) this.email) + ", phoneNumber=" + ((Object) this.phoneNumber) + ", shippingInformation=" + this.shippingInformation + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeParcelable(this.token, i11);
        Address address = this.address;
        if (address == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            address.writeToParcel(out, i11);
        }
        out.writeString(this.name);
        out.writeString(this.email);
        out.writeString(this.phoneNumber);
        ShippingInformation shippingInformation = this.shippingInformation;
        if (shippingInformation == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        shippingInformation.writeToParcel(out, i11);
    }

    public /* synthetic */ GooglePayResult(Token token, Address address, String str, String str2, String str3, ShippingInformation shippingInformation, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : token, (i11 & 2) != 0 ? null : address, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : shippingInformation);
    }
}