package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class IntentData implements Parcelable {
    private final String accountId;
    private final String clientSecret;
    private final String publishableKey;
    private final String sourceId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<IntentData> CREATOR = new Creator();
    private static final IntentData EMPTY = new IntentData("", "", "", null);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntentData getEMPTY() {
            return IntentData.EMPTY;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<IntentData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntentData createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new IntentData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntentData[] newArray(int i11) {
            return new IntentData[i11];
        }
    }

    public IntentData(String clientSecret, String sourceId, String publishableKey, String str) {
        s.g(clientSecret, "clientSecret");
        s.g(sourceId, "sourceId");
        s.g(publishableKey, "publishableKey");
        this.clientSecret = clientSecret;
        this.sourceId = sourceId;
        this.publishableKey = publishableKey;
        this.accountId = str;
    }

    public static /* synthetic */ IntentData copy$default(IntentData intentData, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = intentData.clientSecret;
        }
        if ((i11 & 2) != 0) {
            str2 = intentData.sourceId;
        }
        if ((i11 & 4) != 0) {
            str3 = intentData.publishableKey;
        }
        if ((i11 & 8) != 0) {
            str4 = intentData.accountId;
        }
        return intentData.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.clientSecret;
    }

    public final String component2() {
        return this.sourceId;
    }

    public final String component3() {
        return this.publishableKey;
    }

    public final String component4() {
        return this.accountId;
    }

    public final IntentData copy(String clientSecret, String sourceId, String publishableKey, String str) {
        s.g(clientSecret, "clientSecret");
        s.g(sourceId, "sourceId");
        s.g(publishableKey, "publishableKey");
        return new IntentData(clientSecret, sourceId, publishableKey, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntentData) {
            IntentData intentData = (IntentData) obj;
            return s.c(this.clientSecret, intentData.clientSecret) && s.c(this.sourceId, intentData.sourceId) && s.c(this.publishableKey, intentData.publishableKey) && s.c(this.accountId, intentData.accountId);
        }
        return false;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public int hashCode() {
        int hashCode = ((((this.clientSecret.hashCode() * 31) + this.sourceId.hashCode()) * 31) + this.publishableKey.hashCode()) * 31;
        String str = this.accountId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "IntentData(clientSecret=" + this.clientSecret + ", sourceId=" + this.sourceId + ", publishableKey=" + this.publishableKey + ", accountId=" + ((Object) this.accountId) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.clientSecret);
        out.writeString(this.sourceId);
        out.writeString(this.publishableKey);
        out.writeString(this.accountId);
    }

    public /* synthetic */ IntentData(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : str4);
    }
}