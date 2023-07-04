package com.stripe.android.googlepaylauncher;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class GooglePayConfig implements Parcelable {
    public static final Parcelable.Creator<GooglePayConfig> CREATOR = new Creator();
    private Integer amount;
    private String countryCode;
    private String currencyCode;
    private GooglePayEnvironment environment;
    private boolean isEmailRequired;
    private String merchantName;
    private String transactionId;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<GooglePayConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayConfig createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new GooglePayConfig(GooglePayEnvironment.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayConfig[] newArray(int i11) {
            return new GooglePayConfig[i11];
        }
    }

    public GooglePayConfig(GooglePayEnvironment environment, Integer num, String countryCode, String currencyCode, boolean z11, String str, String str2) {
        s.g(environment, "environment");
        s.g(countryCode, "countryCode");
        s.g(currencyCode, "currencyCode");
        this.environment = environment;
        this.amount = num;
        this.countryCode = countryCode;
        this.currencyCode = currencyCode;
        this.isEmailRequired = z11;
        this.merchantName = str;
        this.transactionId = str2;
    }

    public static /* synthetic */ GooglePayConfig copy$default(GooglePayConfig googlePayConfig, GooglePayEnvironment googlePayEnvironment, Integer num, String str, String str2, boolean z11, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            googlePayEnvironment = googlePayConfig.environment;
        }
        if ((i11 & 2) != 0) {
            num = googlePayConfig.amount;
        }
        Integer num2 = num;
        if ((i11 & 4) != 0) {
            str = googlePayConfig.countryCode;
        }
        String str5 = str;
        if ((i11 & 8) != 0) {
            str2 = googlePayConfig.currencyCode;
        }
        String str6 = str2;
        if ((i11 & 16) != 0) {
            z11 = googlePayConfig.isEmailRequired;
        }
        boolean z12 = z11;
        if ((i11 & 32) != 0) {
            str3 = googlePayConfig.merchantName;
        }
        String str7 = str3;
        if ((i11 & 64) != 0) {
            str4 = googlePayConfig.transactionId;
        }
        return googlePayConfig.copy(googlePayEnvironment, num2, str5, str6, z12, str7, str4);
    }

    public final GooglePayEnvironment component1() {
        return this.environment;
    }

    public final Integer component2$payments_core_release() {
        return this.amount;
    }

    public final String component3$payments_core_release() {
        return this.countryCode;
    }

    public final String component4$payments_core_release() {
        return this.currencyCode;
    }

    public final boolean component5$payments_core_release() {
        return this.isEmailRequired;
    }

    public final String component6$payments_core_release() {
        return this.merchantName;
    }

    public final String component7$payments_core_release() {
        return this.transactionId;
    }

    public final GooglePayConfig copy(GooglePayEnvironment environment, Integer num, String countryCode, String currencyCode, boolean z11, String str, String str2) {
        s.g(environment, "environment");
        s.g(countryCode, "countryCode");
        s.g(currencyCode, "currencyCode");
        return new GooglePayConfig(environment, num, countryCode, currencyCode, z11, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GooglePayConfig) {
            GooglePayConfig googlePayConfig = (GooglePayConfig) obj;
            return this.environment == googlePayConfig.environment && s.c(this.amount, googlePayConfig.amount) && s.c(this.countryCode, googlePayConfig.countryCode) && s.c(this.currencyCode, googlePayConfig.currencyCode) && this.isEmailRequired == googlePayConfig.isEmailRequired && s.c(this.merchantName, googlePayConfig.merchantName) && s.c(this.transactionId, googlePayConfig.transactionId);
        }
        return false;
    }

    public final Integer getAmount$payments_core_release() {
        return this.amount;
    }

    public final String getCountryCode$payments_core_release() {
        return this.countryCode;
    }

    public final String getCurrencyCode$payments_core_release() {
        return this.currencyCode;
    }

    public final GooglePayEnvironment getEnvironment() {
        return this.environment;
    }

    public final String getMerchantName$payments_core_release() {
        return this.merchantName;
    }

    public final String getTransactionId$payments_core_release() {
        return this.transactionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.environment.hashCode() * 31;
        Integer num = this.amount;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.countryCode.hashCode()) * 31) + this.currencyCode.hashCode()) * 31;
        boolean z11 = this.isEmailRequired;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode2 + i11) * 31;
        String str = this.merchantName;
        int hashCode3 = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.transactionId;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isEmailRequired$payments_core_release() {
        return this.isEmailRequired;
    }

    public final void setAmount$payments_core_release(Integer num) {
        this.amount = num;
    }

    public final void setCountryCode$payments_core_release(String str) {
        s.g(str, "<set-?>");
        this.countryCode = str;
    }

    public final void setCurrencyCode$payments_core_release(String str) {
        s.g(str, "<set-?>");
        this.currencyCode = str;
    }

    public final void setEmailRequired$payments_core_release(boolean z11) {
        this.isEmailRequired = z11;
    }

    public final void setEnvironment(GooglePayEnvironment googlePayEnvironment) {
        s.g(googlePayEnvironment, "<set-?>");
        this.environment = googlePayEnvironment;
    }

    public final void setMerchantName$payments_core_release(String str) {
        this.merchantName = str;
    }

    public final void setTransactionId$payments_core_release(String str) {
        this.transactionId = str;
    }

    public String toString() {
        return "GooglePayConfig(environment=" + this.environment + ", amount=" + this.amount + ", countryCode=" + this.countryCode + ", currencyCode=" + this.currencyCode + ", isEmailRequired=" + this.isEmailRequired + ", merchantName=" + ((Object) this.merchantName) + ", transactionId=" + ((Object) this.transactionId) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        int intValue;
        s.g(out, "out");
        out.writeString(this.environment.name());
        Integer num = this.amount;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.countryCode);
        out.writeString(this.currencyCode);
        out.writeInt(this.isEmailRequired ? 1 : 0);
        out.writeString(this.merchantName);
        out.writeString(this.transactionId);
    }

    public /* synthetic */ GooglePayConfig(GooglePayEnvironment googlePayEnvironment, Integer num, String str, String str2, boolean z11, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(googlePayEnvironment, num, str, str2, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4);
    }
}