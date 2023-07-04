package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ChallengeParameters implements Parcelable {
    public static final Parcelable.Creator<ChallengeParameters> CREATOR = new Creator();
    private String acsRefNumber;
    private String acsSignedContent;
    private String acsTransactionId;
    private String threeDSRequestorAppURL;
    private String threeDsServerTransactionId;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ChallengeParameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeParameters createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new ChallengeParameters(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeParameters[] newArray(int i11) {
            return new ChallengeParameters[i11];
        }
    }

    public ChallengeParameters() {
        this(null, null, null, null, null, 31, null);
    }

    public ChallengeParameters(String str, String str2, String str3, String str4, String str5) {
        this.threeDsServerTransactionId = str;
        this.acsTransactionId = str2;
        this.acsRefNumber = str3;
        this.acsSignedContent = str4;
        this.threeDSRequestorAppURL = str5;
    }

    public static /* synthetic */ ChallengeParameters copy$default(ChallengeParameters challengeParameters, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = challengeParameters.threeDsServerTransactionId;
        }
        if ((i11 & 2) != 0) {
            str2 = challengeParameters.acsTransactionId;
        }
        String str6 = str2;
        if ((i11 & 4) != 0) {
            str3 = challengeParameters.acsRefNumber;
        }
        String str7 = str3;
        if ((i11 & 8) != 0) {
            str4 = challengeParameters.acsSignedContent;
        }
        String str8 = str4;
        if ((i11 & 16) != 0) {
            str5 = challengeParameters.threeDSRequestorAppURL;
        }
        return challengeParameters.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.threeDsServerTransactionId;
    }

    public final String component2() {
        return this.acsTransactionId;
    }

    public final String component3() {
        return this.acsRefNumber;
    }

    public final String component4() {
        return this.acsSignedContent;
    }

    public final String component5() {
        return this.threeDSRequestorAppURL;
    }

    public final ChallengeParameters copy(String str, String str2, String str3, String str4, String str5) {
        return new ChallengeParameters(str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChallengeParameters) {
            ChallengeParameters challengeParameters = (ChallengeParameters) obj;
            return s.c(this.threeDsServerTransactionId, challengeParameters.threeDsServerTransactionId) && s.c(this.acsTransactionId, challengeParameters.acsTransactionId) && s.c(this.acsRefNumber, challengeParameters.acsRefNumber) && s.c(this.acsSignedContent, challengeParameters.acsSignedContent) && s.c(this.threeDSRequestorAppURL, challengeParameters.threeDSRequestorAppURL);
        }
        return false;
    }

    public final String getAcsRefNumber() {
        return this.acsRefNumber;
    }

    public final String getAcsSignedContent() {
        return this.acsSignedContent;
    }

    public final String getAcsTransactionId() {
        return this.acsTransactionId;
    }

    public final String getThreeDSRequestorAppURL() {
        return this.threeDSRequestorAppURL;
    }

    public final String getThreeDsServerTransactionId() {
        return this.threeDsServerTransactionId;
    }

    public int hashCode() {
        String str = this.threeDsServerTransactionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.acsTransactionId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.acsRefNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.acsSignedContent;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.threeDSRequestorAppURL;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setAcsRefNumber(String str) {
        this.acsRefNumber = str;
    }

    public final void setAcsSignedContent(String str) {
        this.acsSignedContent = str;
    }

    public final void setAcsTransactionId(String str) {
        this.acsTransactionId = str;
    }

    public final void setThreeDSRequestorAppURL(String str) {
        this.threeDSRequestorAppURL = str;
    }

    public final void setThreeDsServerTransactionId(String str) {
        this.threeDsServerTransactionId = str;
    }

    public String toString() {
        return "ChallengeParameters(threeDsServerTransactionId=" + ((Object) this.threeDsServerTransactionId) + ", acsTransactionId=" + ((Object) this.acsTransactionId) + ", acsRefNumber=" + ((Object) this.acsRefNumber) + ", acsSignedContent=" + ((Object) this.acsSignedContent) + ", threeDSRequestorAppURL=" + ((Object) this.threeDSRequestorAppURL) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.threeDsServerTransactionId);
        out.writeString(this.acsTransactionId);
        out.writeString(this.acsRefNumber);
        out.writeString(this.acsSignedContent);
        out.writeString(this.threeDSRequestorAppURL);
    }

    public /* synthetic */ ChallengeParameters(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5);
    }
}