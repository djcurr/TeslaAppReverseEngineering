package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class AuthenticationRequestParameters implements Parcelable {
    public static final Parcelable.Creator<AuthenticationRequestParameters> CREATOR = new Creator();
    private final String deviceData;
    private final String messageVersion;
    private final String sdkAppId;
    private final String sdkEphemeralPublicKey;
    private final String sdkReferenceNumber;
    private final SdkTransactionId sdkTransactionId;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<AuthenticationRequestParameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthenticationRequestParameters createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new AuthenticationRequestParameters(parcel.readString(), SdkTransactionId.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthenticationRequestParameters[] newArray(int i11) {
            return new AuthenticationRequestParameters[i11];
        }
    }

    public AuthenticationRequestParameters(String deviceData, SdkTransactionId sdkTransactionId, String sdkAppId, String sdkReferenceNumber, String sdkEphemeralPublicKey, String messageVersion) {
        s.g(deviceData, "deviceData");
        s.g(sdkTransactionId, "sdkTransactionId");
        s.g(sdkAppId, "sdkAppId");
        s.g(sdkReferenceNumber, "sdkReferenceNumber");
        s.g(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        s.g(messageVersion, "messageVersion");
        this.deviceData = deviceData;
        this.sdkTransactionId = sdkTransactionId;
        this.sdkAppId = sdkAppId;
        this.sdkReferenceNumber = sdkReferenceNumber;
        this.sdkEphemeralPublicKey = sdkEphemeralPublicKey;
        this.messageVersion = messageVersion;
    }

    public static /* synthetic */ AuthenticationRequestParameters copy$default(AuthenticationRequestParameters authenticationRequestParameters, String str, SdkTransactionId sdkTransactionId, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = authenticationRequestParameters.deviceData;
        }
        if ((i11 & 2) != 0) {
            sdkTransactionId = authenticationRequestParameters.sdkTransactionId;
        }
        SdkTransactionId sdkTransactionId2 = sdkTransactionId;
        if ((i11 & 4) != 0) {
            str2 = authenticationRequestParameters.sdkAppId;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = authenticationRequestParameters.sdkReferenceNumber;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            str4 = authenticationRequestParameters.sdkEphemeralPublicKey;
        }
        String str8 = str4;
        if ((i11 & 32) != 0) {
            str5 = authenticationRequestParameters.messageVersion;
        }
        return authenticationRequestParameters.copy(str, sdkTransactionId2, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.deviceData;
    }

    public final SdkTransactionId component2() {
        return this.sdkTransactionId;
    }

    public final String component3() {
        return this.sdkAppId;
    }

    public final String component4() {
        return this.sdkReferenceNumber;
    }

    public final String component5() {
        return this.sdkEphemeralPublicKey;
    }

    public final String component6() {
        return this.messageVersion;
    }

    public final AuthenticationRequestParameters copy(String deviceData, SdkTransactionId sdkTransactionId, String sdkAppId, String sdkReferenceNumber, String sdkEphemeralPublicKey, String messageVersion) {
        s.g(deviceData, "deviceData");
        s.g(sdkTransactionId, "sdkTransactionId");
        s.g(sdkAppId, "sdkAppId");
        s.g(sdkReferenceNumber, "sdkReferenceNumber");
        s.g(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        s.g(messageVersion, "messageVersion");
        return new AuthenticationRequestParameters(deviceData, sdkTransactionId, sdkAppId, sdkReferenceNumber, sdkEphemeralPublicKey, messageVersion);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthenticationRequestParameters) {
            AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) obj;
            return s.c(this.deviceData, authenticationRequestParameters.deviceData) && s.c(this.sdkTransactionId, authenticationRequestParameters.sdkTransactionId) && s.c(this.sdkAppId, authenticationRequestParameters.sdkAppId) && s.c(this.sdkReferenceNumber, authenticationRequestParameters.sdkReferenceNumber) && s.c(this.sdkEphemeralPublicKey, authenticationRequestParameters.sdkEphemeralPublicKey) && s.c(this.messageVersion, authenticationRequestParameters.messageVersion);
        }
        return false;
    }

    public final String getDeviceData() {
        return this.deviceData;
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final String getSdkAppId() {
        return this.sdkAppId;
    }

    public final String getSdkEphemeralPublicKey() {
        return this.sdkEphemeralPublicKey;
    }

    public final String getSdkReferenceNumber() {
        return this.sdkReferenceNumber;
    }

    public final SdkTransactionId getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    public int hashCode() {
        return (((((((((this.deviceData.hashCode() * 31) + this.sdkTransactionId.hashCode()) * 31) + this.sdkAppId.hashCode()) * 31) + this.sdkReferenceNumber.hashCode()) * 31) + this.sdkEphemeralPublicKey.hashCode()) * 31) + this.messageVersion.hashCode();
    }

    public String toString() {
        return "AuthenticationRequestParameters(deviceData=" + this.deviceData + ", sdkTransactionId=" + this.sdkTransactionId + ", sdkAppId=" + this.sdkAppId + ", sdkReferenceNumber=" + this.sdkReferenceNumber + ", sdkEphemeralPublicKey=" + this.sdkEphemeralPublicKey + ", messageVersion=" + this.messageVersion + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.deviceData);
        this.sdkTransactionId.writeToParcel(out, i11);
        out.writeString(this.sdkAppId);
        out.writeString(this.sdkReferenceNumber);
        out.writeString(this.sdkEphemeralPublicKey);
        out.writeString(this.messageVersion);
    }
}