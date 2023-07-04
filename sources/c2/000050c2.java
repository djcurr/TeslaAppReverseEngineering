package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.parsers.AddressJsonParser;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import org.json.JSONObject;
import vz.p;
import wz.s0;

/* loaded from: classes6.dex */
public final class Address implements StripeModel, StripeParamsModel {
    private static final String PARAM_CITY = "city";
    private static final String PARAM_COUNTRY = "country";
    private static final String PARAM_LINE_1 = "line1";
    private static final String PARAM_LINE_2 = "line2";
    private static final String PARAM_POSTAL_CODE = "postal_code";
    private static final String PARAM_STATE = "state";
    private final String city;
    private final String country;
    private final String line1;
    private final String line2;
    private final String postalCode;
    private final String state;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Address> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Builder implements ObjectBuilder<Address> {
        public static final int $stable = 8;
        private String city;
        private String country;
        private String line1;
        private String line2;
        private String postalCode;
        private String state;

        public final Builder setCity(String str) {
            this.city = str;
            return this;
        }

        public final Builder setCountry(String str) {
            String upperCase;
            if (str == null) {
                upperCase = null;
            } else {
                upperCase = str.toUpperCase(Locale.ROOT);
                s.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            }
            this.country = upperCase;
            return this;
        }

        public final Builder setCountryCode(CountryCode countryCode) {
            this.country = countryCode == null ? null : countryCode.getValue();
            return this;
        }

        public final Builder setLine1(String str) {
            this.line1 = str;
            return this;
        }

        public final Builder setLine2(String str) {
            this.line2 = str;
            return this;
        }

        public final Builder setPostalCode(String str) {
            this.postalCode = str;
            return this;
        }

        public final Builder setState(String str) {
            this.state = str;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.stripe.android.ObjectBuilder
        public Address build() {
            return new Address(this.city, this.country, this.line1, this.line2, this.postalCode, this.state);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Address fromJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new AddressJsonParser().parse(jSONObject);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Address> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Address createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Address[] newArray(int i11) {
            return new Address[i11];
        }
    }

    public Address() {
        this(null, null, null, null, null, null, 63, null);
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6) {
        this.city = str;
        this.country = str2;
        this.line1 = str3;
        this.line2 = str4;
        this.postalCode = str5;
        this.state = str6;
    }

    public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = address.city;
        }
        if ((i11 & 2) != 0) {
            str2 = address.country;
        }
        String str7 = str2;
        if ((i11 & 4) != 0) {
            str3 = address.line1;
        }
        String str8 = str3;
        if ((i11 & 8) != 0) {
            str4 = address.line2;
        }
        String str9 = str4;
        if ((i11 & 16) != 0) {
            str5 = address.postalCode;
        }
        String str10 = str5;
        if ((i11 & 32) != 0) {
            str6 = address.state;
        }
        return address.copy(str, str7, str8, str9, str10, str6);
    }

    public static final Address fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final String component1() {
        return this.city;
    }

    public final String component2() {
        return this.country;
    }

    public final String component3() {
        return this.line1;
    }

    public final String component4() {
        return this.line2;
    }

    public final String component5() {
        return this.postalCode;
    }

    public final String component6() {
        return this.state;
    }

    public final Address copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new Address(str, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Address) {
            Address address = (Address) obj;
            return s.c(this.city, address.city) && s.c(this.country, address.country) && s.c(this.line1, address.line1) && s.c(this.line2, address.line2) && s.c(this.postalCode, address.postalCode) && s.c(this.state, address.state);
        }
        return false;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final CountryCode getCountryCode() {
        return getCountryCode$payments_core_release();
    }

    public final CountryCode getCountryCode$payments_core_release() {
        boolean w11;
        String str = this.country;
        if (str == null) {
            return null;
        }
        w11 = v.w(str);
        if (w11) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return CountryCode.Companion.create(str);
    }

    public final String getLine1() {
        return this.line1;
    }

    public final String getLine2() {
        return this.line2;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.city;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.line1;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.line2;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postalCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.state;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map l11;
        p[] pVarArr = new p[6];
        String str = this.city;
        if (str == null) {
            str = "";
        }
        pVarArr[0] = vz.v.a(PARAM_CITY, str);
        String str2 = this.country;
        if (str2 == null) {
            str2 = "";
        }
        pVarArr[1] = vz.v.a("country", str2);
        String str3 = this.line1;
        if (str3 == null) {
            str3 = "";
        }
        pVarArr[2] = vz.v.a(PARAM_LINE_1, str3);
        String str4 = this.line2;
        if (str4 == null) {
            str4 = "";
        }
        pVarArr[3] = vz.v.a(PARAM_LINE_2, str4);
        String str5 = this.postalCode;
        if (str5 == null) {
            str5 = "";
        }
        pVarArr[4] = vz.v.a("postal_code", str5);
        String str6 = this.state;
        pVarArr[5] = vz.v.a(PARAM_STATE, str6 != null ? str6 : "");
        l11 = s0.l(pVarArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : l11.entrySet()) {
            if (((String) entry.getValue()).length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        return "Address(city=" + ((Object) this.city) + ", country=" + ((Object) this.country) + ", line1=" + ((Object) this.line1) + ", line2=" + ((Object) this.line2) + ", postalCode=" + ((Object) this.postalCode) + ", state=" + ((Object) this.state) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.city);
        out.writeString(this.country);
        out.writeString(this.line1);
        out.writeString(this.line2);
        out.writeString(this.postalCode);
        out.writeString(this.state);
    }

    public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }
}