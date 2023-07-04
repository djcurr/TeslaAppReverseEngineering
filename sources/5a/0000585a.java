package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.security.interfaces.ECPublicKey;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class AcsData implements Parcelable {
    public static final Parcelable.Creator<AcsData> CREATOR = new Creator();
    private final ECPublicKey acsEphemPubKey;
    private final String acsUrl;
    private final ECPublicKey sdkEphemPubKey;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<AcsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcsData createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new AcsData(parcel.readString(), (ECPublicKey) parcel.readSerializable(), (ECPublicKey) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcsData[] newArray(int i11) {
            return new AcsData[i11];
        }
    }

    public AcsData(String acsUrl, ECPublicKey acsEphemPubKey, ECPublicKey sdkEphemPubKey) {
        s.g(acsUrl, "acsUrl");
        s.g(acsEphemPubKey, "acsEphemPubKey");
        s.g(sdkEphemPubKey, "sdkEphemPubKey");
        this.acsUrl = acsUrl;
        this.acsEphemPubKey = acsEphemPubKey;
        this.sdkEphemPubKey = sdkEphemPubKey;
    }

    public static /* synthetic */ AcsData copy$default(AcsData acsData, String str, ECPublicKey eCPublicKey, ECPublicKey eCPublicKey2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = acsData.acsUrl;
        }
        if ((i11 & 2) != 0) {
            eCPublicKey = acsData.acsEphemPubKey;
        }
        if ((i11 & 4) != 0) {
            eCPublicKey2 = acsData.sdkEphemPubKey;
        }
        return acsData.copy(str, eCPublicKey, eCPublicKey2);
    }

    public final String component1() {
        return this.acsUrl;
    }

    public final ECPublicKey component2() {
        return this.acsEphemPubKey;
    }

    public final ECPublicKey component3() {
        return this.sdkEphemPubKey;
    }

    public final AcsData copy(String acsUrl, ECPublicKey acsEphemPubKey, ECPublicKey sdkEphemPubKey) {
        s.g(acsUrl, "acsUrl");
        s.g(acsEphemPubKey, "acsEphemPubKey");
        s.g(sdkEphemPubKey, "sdkEphemPubKey");
        return new AcsData(acsUrl, acsEphemPubKey, sdkEphemPubKey);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AcsData) {
            AcsData acsData = (AcsData) obj;
            return s.c(this.acsUrl, acsData.acsUrl) && s.c(this.acsEphemPubKey, acsData.acsEphemPubKey) && s.c(this.sdkEphemPubKey, acsData.sdkEphemPubKey);
        }
        return false;
    }

    public final ECPublicKey getAcsEphemPubKey() {
        return this.acsEphemPubKey;
    }

    public final String getAcsUrl() {
        return this.acsUrl;
    }

    public final ECPublicKey getSdkEphemPubKey() {
        return this.sdkEphemPubKey;
    }

    public int hashCode() {
        return (((this.acsUrl.hashCode() * 31) + this.acsEphemPubKey.hashCode()) * 31) + this.sdkEphemPubKey.hashCode();
    }

    public String toString() {
        return "AcsData(acsUrl=" + this.acsUrl + ", acsEphemPubKey=" + this.acsEphemPubKey + ", sdkEphemPubKey=" + this.sdkEphemPubKey + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.acsUrl);
        out.writeSerializable(this.acsEphemPubKey);
        out.writeSerializable(this.sdkEphemPubKey);
    }
}