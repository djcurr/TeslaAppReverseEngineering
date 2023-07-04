package com.stripe.android.core;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class StripeError implements StripeModel, Serializable {
    public static final Parcelable.Creator<StripeError> CREATOR = new Creator();
    private final String charge;
    private final String code;
    private final String declineCode;
    private final String docUrl;
    private final String message;
    private final String param;
    private final String type;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<StripeError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StripeError createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new StripeError(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StripeError[] newArray(int i11) {
            return new StripeError[i11];
        }
    }

    public StripeError() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public StripeError(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.type = str;
        this.message = str2;
        this.code = str3;
        this.param = str4;
        this.declineCode = str5;
        this.charge = str6;
        this.docUrl = str7;
    }

    public static /* synthetic */ StripeError copy$default(StripeError stripeError, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = stripeError.type;
        }
        if ((i11 & 2) != 0) {
            str2 = stripeError.message;
        }
        String str8 = str2;
        if ((i11 & 4) != 0) {
            str3 = stripeError.code;
        }
        String str9 = str3;
        if ((i11 & 8) != 0) {
            str4 = stripeError.param;
        }
        String str10 = str4;
        if ((i11 & 16) != 0) {
            str5 = stripeError.declineCode;
        }
        String str11 = str5;
        if ((i11 & 32) != 0) {
            str6 = stripeError.charge;
        }
        String str12 = str6;
        if ((i11 & 64) != 0) {
            str7 = stripeError.docUrl;
        }
        return stripeError.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.code;
    }

    public final String component4() {
        return this.param;
    }

    public final String component5() {
        return this.declineCode;
    }

    public final String component6() {
        return this.charge;
    }

    public final String component7() {
        return this.docUrl;
    }

    public final StripeError copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new StripeError(str, str2, str3, str4, str5, str6, str7);
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
        if (obj instanceof StripeError) {
            StripeError stripeError = (StripeError) obj;
            return s.c(this.type, stripeError.type) && s.c(this.message, stripeError.message) && s.c(this.code, stripeError.code) && s.c(this.param, stripeError.param) && s.c(this.declineCode, stripeError.declineCode) && s.c(this.charge, stripeError.charge) && s.c(this.docUrl, stripeError.docUrl);
        }
        return false;
    }

    public final String getCharge() {
        return this.charge;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDeclineCode() {
        return this.declineCode;
    }

    public final String getDocUrl() {
        return this.docUrl;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getParam() {
        return this.param;
    }

    public final String getType() {
        return this.type;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.code;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.param;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.declineCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.charge;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.docUrl;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "StripeError(type=" + ((Object) this.type) + ", message=" + ((Object) this.message) + ", code=" + ((Object) this.code) + ", param=" + ((Object) this.param) + ", declineCode=" + ((Object) this.declineCode) + ", charge=" + ((Object) this.charge) + ", docUrl=" + ((Object) this.docUrl) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.type);
        out.writeString(this.message);
        out.writeString(this.code);
        out.writeString(this.param);
        out.writeString(this.declineCode);
        out.writeString(this.charge);
        out.writeString(this.docUrl);
    }

    public /* synthetic */ StripeError(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7);
    }
}