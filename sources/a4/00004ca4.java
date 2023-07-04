package com.stripe.android.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class CountryCode implements Parcelable {
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CountryCode> CREATOR = new Creator();
    private static final CountryCode US = new CountryCode("US");
    private static final CountryCode CA = new CountryCode("CA");
    private static final CountryCode GB = new CountryCode("GB");

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CountryCode create(String value) {
            s.g(value, "value");
            String upperCase = value.toUpperCase(Locale.ROOT);
            s.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return new CountryCode(upperCase);
        }

        public final CountryCode getCA() {
            return CountryCode.CA;
        }

        public final CountryCode getGB() {
            return CountryCode.GB;
        }

        public final CountryCode getUS() {
            return CountryCode.US;
        }

        public final boolean isCA(CountryCode countryCode) {
            return s.c(countryCode, getCA());
        }

        public final boolean isGB(CountryCode countryCode) {
            return s.c(countryCode, getGB());
        }

        public final boolean isUS(CountryCode countryCode) {
            return s.c(countryCode, getUS());
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<CountryCode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CountryCode createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new CountryCode(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CountryCode[] newArray(int i11) {
            return new CountryCode[i11];
        }
    }

    public CountryCode(String value) {
        s.g(value, "value");
        this.value = value;
    }

    public static /* synthetic */ CountryCode copy$default(CountryCode countryCode, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = countryCode.value;
        }
        return countryCode.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final CountryCode copy(String value) {
        s.g(value, "value");
        return new CountryCode(value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CountryCode) && s.c(this.value, ((CountryCode) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "CountryCode(value=" + this.value + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.value);
    }
}