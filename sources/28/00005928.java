package com.stripe.android.stripe3ds2.views;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;

/* loaded from: classes6.dex */
public final class ChallengeProgressArgs implements Parcelable {
    private static final String EXTRA_ARGS = "com.stripe.android.stripe3ds2.views.ChallengeProgressArgs";
    private final Integer accentColor;
    private final String directoryServerName;
    private final SdkTransactionId sdkTransactionId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChallengeProgressArgs> CREATOR = new Creator();

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChallengeProgressArgs fromBundle(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            return (ChallengeProgressArgs) bundle.getParcelable(ChallengeProgressArgs.EXTRA_ARGS);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ChallengeProgressArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeProgressArgs createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new ChallengeProgressArgs(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), SdkTransactionId.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeProgressArgs[] newArray(int i11) {
            return new ChallengeProgressArgs[i11];
        }
    }

    public ChallengeProgressArgs(String directoryServerName, Integer num, SdkTransactionId sdkTransactionId) {
        s.g(directoryServerName, "directoryServerName");
        s.g(sdkTransactionId, "sdkTransactionId");
        this.directoryServerName = directoryServerName;
        this.accentColor = num;
        this.sdkTransactionId = sdkTransactionId;
    }

    public static /* synthetic */ ChallengeProgressArgs copy$default(ChallengeProgressArgs challengeProgressArgs, String str, Integer num, SdkTransactionId sdkTransactionId, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = challengeProgressArgs.directoryServerName;
        }
        if ((i11 & 2) != 0) {
            num = challengeProgressArgs.accentColor;
        }
        if ((i11 & 4) != 0) {
            sdkTransactionId = challengeProgressArgs.sdkTransactionId;
        }
        return challengeProgressArgs.copy(str, num, sdkTransactionId);
    }

    public final String component1() {
        return this.directoryServerName;
    }

    public final Integer component2() {
        return this.accentColor;
    }

    public final SdkTransactionId component3() {
        return this.sdkTransactionId;
    }

    public final ChallengeProgressArgs copy(String directoryServerName, Integer num, SdkTransactionId sdkTransactionId) {
        s.g(directoryServerName, "directoryServerName");
        s.g(sdkTransactionId, "sdkTransactionId");
        return new ChallengeProgressArgs(directoryServerName, num, sdkTransactionId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChallengeProgressArgs) {
            ChallengeProgressArgs challengeProgressArgs = (ChallengeProgressArgs) obj;
            return s.c(this.directoryServerName, challengeProgressArgs.directoryServerName) && s.c(this.accentColor, challengeProgressArgs.accentColor) && s.c(this.sdkTransactionId, challengeProgressArgs.sdkTransactionId);
        }
        return false;
    }

    public final Integer getAccentColor() {
        return this.accentColor;
    }

    public final String getDirectoryServerName() {
        return this.directoryServerName;
    }

    public final SdkTransactionId getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    public int hashCode() {
        int hashCode = this.directoryServerName.hashCode() * 31;
        Integer num = this.accentColor;
        return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.sdkTransactionId.hashCode();
    }

    public final Bundle toBundle() {
        return r3.b.a(v.a(EXTRA_ARGS, this));
    }

    public String toString() {
        return "ChallengeProgressArgs(directoryServerName=" + this.directoryServerName + ", accentColor=" + this.accentColor + ", sdkTransactionId=" + this.sdkTransactionId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        int intValue;
        s.g(out, "out");
        out.writeString(this.directoryServerName);
        Integer num = this.accentColor;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        this.sdkTransactionId.writeToParcel(out, i11);
    }
}