package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.security.KeyPair;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class InitChallengeArgs implements Parcelable {
    public static final Parcelable.Creator<InitChallengeArgs> CREATOR = new Creator();
    private final ChallengeParameters challengeParameters;
    private final IntentData intentData;
    private final KeyPair sdkKeyPair;
    private final String sdkReferenceNumber;
    private final int timeoutMins;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<InitChallengeArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InitChallengeArgs createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new InitChallengeArgs(parcel.readString(), (KeyPair) parcel.readSerializable(), ChallengeParameters.CREATOR.createFromParcel(parcel), parcel.readInt(), IntentData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InitChallengeArgs[] newArray(int i11) {
            return new InitChallengeArgs[i11];
        }
    }

    public InitChallengeArgs(String sdkReferenceNumber, KeyPair sdkKeyPair, ChallengeParameters challengeParameters, int i11, IntentData intentData) {
        s.g(sdkReferenceNumber, "sdkReferenceNumber");
        s.g(sdkKeyPair, "sdkKeyPair");
        s.g(challengeParameters, "challengeParameters");
        s.g(intentData, "intentData");
        this.sdkReferenceNumber = sdkReferenceNumber;
        this.sdkKeyPair = sdkKeyPair;
        this.challengeParameters = challengeParameters;
        this.timeoutMins = i11;
        this.intentData = intentData;
    }

    public static /* synthetic */ InitChallengeArgs copy$default(InitChallengeArgs initChallengeArgs, String str, KeyPair keyPair, ChallengeParameters challengeParameters, int i11, IntentData intentData, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = initChallengeArgs.sdkReferenceNumber;
        }
        if ((i12 & 2) != 0) {
            keyPair = initChallengeArgs.sdkKeyPair;
        }
        KeyPair keyPair2 = keyPair;
        if ((i12 & 4) != 0) {
            challengeParameters = initChallengeArgs.challengeParameters;
        }
        ChallengeParameters challengeParameters2 = challengeParameters;
        if ((i12 & 8) != 0) {
            i11 = initChallengeArgs.timeoutMins;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            intentData = initChallengeArgs.intentData;
        }
        return initChallengeArgs.copy(str, keyPair2, challengeParameters2, i13, intentData);
    }

    public final String component1$3ds2sdk_release() {
        return this.sdkReferenceNumber;
    }

    public final KeyPair component2$3ds2sdk_release() {
        return this.sdkKeyPair;
    }

    public final ChallengeParameters component3$3ds2sdk_release() {
        return this.challengeParameters;
    }

    public final int component4$3ds2sdk_release() {
        return this.timeoutMins;
    }

    public final IntentData component5$3ds2sdk_release() {
        return this.intentData;
    }

    public final InitChallengeArgs copy(String sdkReferenceNumber, KeyPair sdkKeyPair, ChallengeParameters challengeParameters, int i11, IntentData intentData) {
        s.g(sdkReferenceNumber, "sdkReferenceNumber");
        s.g(sdkKeyPair, "sdkKeyPair");
        s.g(challengeParameters, "challengeParameters");
        s.g(intentData, "intentData");
        return new InitChallengeArgs(sdkReferenceNumber, sdkKeyPair, challengeParameters, i11, intentData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InitChallengeArgs) {
            InitChallengeArgs initChallengeArgs = (InitChallengeArgs) obj;
            return s.c(this.sdkReferenceNumber, initChallengeArgs.sdkReferenceNumber) && s.c(this.sdkKeyPair, initChallengeArgs.sdkKeyPair) && s.c(this.challengeParameters, initChallengeArgs.challengeParameters) && this.timeoutMins == initChallengeArgs.timeoutMins && s.c(this.intentData, initChallengeArgs.intentData);
        }
        return false;
    }

    public final ChallengeParameters getChallengeParameters$3ds2sdk_release() {
        return this.challengeParameters;
    }

    public final IntentData getIntentData$3ds2sdk_release() {
        return this.intentData;
    }

    public final KeyPair getSdkKeyPair$3ds2sdk_release() {
        return this.sdkKeyPair;
    }

    public final String getSdkReferenceNumber$3ds2sdk_release() {
        return this.sdkReferenceNumber;
    }

    public final int getTimeoutMins$3ds2sdk_release() {
        return this.timeoutMins;
    }

    public int hashCode() {
        return (((((((this.sdkReferenceNumber.hashCode() * 31) + this.sdkKeyPair.hashCode()) * 31) + this.challengeParameters.hashCode()) * 31) + Integer.hashCode(this.timeoutMins)) * 31) + this.intentData.hashCode();
    }

    public String toString() {
        return "InitChallengeArgs(sdkReferenceNumber=" + this.sdkReferenceNumber + ", sdkKeyPair=" + this.sdkKeyPair + ", challengeParameters=" + this.challengeParameters + ", timeoutMins=" + this.timeoutMins + ", intentData=" + this.intentData + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.sdkReferenceNumber);
        out.writeSerializable(this.sdkKeyPair);
        this.challengeParameters.writeToParcel(out, i11);
        out.writeInt(this.timeoutMins);
        this.intentData.writeToParcel(out, i11);
    }
}