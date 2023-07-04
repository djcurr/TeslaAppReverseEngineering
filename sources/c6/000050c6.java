package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.ObjectBuilder;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.p;
import vz.v;
import wz.r0;
import wz.s0;
import wz.w;

/* loaded from: classes6.dex */
public final class AddressJapanParams implements StripeParamsModel, Parcelable {
    @Deprecated
    private static final String PARAM_CITY = "city";
    @Deprecated
    private static final String PARAM_COUNTRY = "country";
    @Deprecated
    private static final String PARAM_LINE_1 = "line1";
    @Deprecated
    private static final String PARAM_LINE_2 = "line2";
    @Deprecated
    private static final String PARAM_POSTAL_CODE = "postal_code";
    @Deprecated
    private static final String PARAM_STATE = "state";
    @Deprecated
    private static final String PARAM_TOWN = "town";
    private final String city;
    private final String country;
    private final String line1;
    private final String line2;
    private final String postalCode;
    private final String state;
    private final String town;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AddressJapanParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Builder implements ObjectBuilder<AddressJapanParams> {
        public static final int $stable = 8;
        private String city;
        private String country;
        private String line1;
        private String line2;
        private String postalCode;
        private String state;
        private String town;

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

        public final Builder setTown(String str) {
            this.town = str;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.stripe.android.ObjectBuilder
        public AddressJapanParams build() {
            return new AddressJapanParams(this.city, this.country, this.line1, this.line2, this.postalCode, this.state, this.town);
        }
    }

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<AddressJapanParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressJapanParams createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new AddressJapanParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressJapanParams[] newArray(int i11) {
            return new AddressJapanParams[i11];
        }
    }

    public AddressJapanParams() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public AddressJapanParams(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.city = str;
        this.country = str2;
        this.line1 = str3;
        this.line2 = str4;
        this.postalCode = str5;
        this.state = str6;
        this.town = str7;
    }

    public static /* synthetic */ AddressJapanParams copy$default(AddressJapanParams addressJapanParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addressJapanParams.city;
        }
        if ((i11 & 2) != 0) {
            str2 = addressJapanParams.country;
        }
        String str8 = str2;
        if ((i11 & 4) != 0) {
            str3 = addressJapanParams.line1;
        }
        String str9 = str3;
        if ((i11 & 8) != 0) {
            str4 = addressJapanParams.line2;
        }
        String str10 = str4;
        if ((i11 & 16) != 0) {
            str5 = addressJapanParams.postalCode;
        }
        String str11 = str5;
        if ((i11 & 32) != 0) {
            str6 = addressJapanParams.state;
        }
        String str12 = str6;
        if ((i11 & 64) != 0) {
            str7 = addressJapanParams.town;
        }
        return addressJapanParams.copy(str, str8, str9, str10, str11, str12, str7);
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

    public final String component7() {
        return this.town;
    }

    public final AddressJapanParams copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new AddressJapanParams(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddressJapanParams) {
            AddressJapanParams addressJapanParams = (AddressJapanParams) obj;
            return s.c(this.city, addressJapanParams.city) && s.c(this.country, addressJapanParams.country) && s.c(this.line1, addressJapanParams.line1) && s.c(this.line2, addressJapanParams.line2) && s.c(this.postalCode, addressJapanParams.postalCode) && s.c(this.state, addressJapanParams.state) && s.c(this.town, addressJapanParams.town);
        }
        return false;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
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

    public final String getTown() {
        return this.town;
    }

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
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.town;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        List<p> l11;
        Map<String, Object> i11;
        l11 = w.l(v.a(PARAM_CITY, this.city), v.a("country", this.country), v.a(PARAM_LINE_1, this.line1), v.a(PARAM_LINE_2, this.line2), v.a("postal_code", this.postalCode), v.a(PARAM_STATE, this.state), v.a(PARAM_TOWN, this.town));
        i11 = s0.i();
        for (p pVar : l11) {
            String str = (String) pVar.a();
            String str2 = (String) pVar.b();
            Map f11 = str2 == null ? null : r0.f(v.a(str, str2));
            if (f11 == null) {
                f11 = s0.i();
            }
            i11 = s0.p(i11, f11);
        }
        return i11;
    }

    public String toString() {
        return "AddressJapanParams(city=" + ((Object) this.city) + ", country=" + ((Object) this.country) + ", line1=" + ((Object) this.line1) + ", line2=" + ((Object) this.line2) + ", postalCode=" + ((Object) this.postalCode) + ", state=" + ((Object) this.state) + ", town=" + ((Object) this.town) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
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
        out.writeString(this.town);
    }

    public /* synthetic */ AddressJapanParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7);
    }
}