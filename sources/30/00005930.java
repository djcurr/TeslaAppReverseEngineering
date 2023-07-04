package com.stripe.android.stripe3ds2.views;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;

/* loaded from: classes6.dex */
public final class ChallengeViewArgs implements Parcelable {
    private static final String EXTRA_ARGS = "extra_args";
    private final ChallengeRequestData creqData;
    private final ChallengeRequestExecutor.Config creqExecutorConfig;
    private final ChallengeRequestExecutor.Factory creqExecutorFactory;
    private final ChallengeResponseData cresData;
    private final IntentData intentData;
    private final int timeoutMins;
    private final StripeUiCustomization uiCustomization;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChallengeViewArgs> CREATOR = new Creator();

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChallengeViewArgs create(Bundle extras) {
            s.g(extras, "extras");
            Parcelable parcelable = extras.getParcelable(ChallengeViewArgs.EXTRA_ARGS);
            if (parcelable != null) {
                return (ChallengeViewArgs) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ChallengeViewArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeViewArgs createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new ChallengeViewArgs(ChallengeResponseData.CREATOR.createFromParcel(parcel), ChallengeRequestData.CREATOR.createFromParcel(parcel), (StripeUiCustomization) parcel.readParcelable(ChallengeViewArgs.class.getClassLoader()), ChallengeRequestExecutor.Config.CREATOR.createFromParcel(parcel), (ChallengeRequestExecutor.Factory) parcel.readSerializable(), parcel.readInt(), IntentData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeViewArgs[] newArray(int i11) {
            return new ChallengeViewArgs[i11];
        }
    }

    public ChallengeViewArgs(ChallengeResponseData cresData, ChallengeRequestData creqData, StripeUiCustomization uiCustomization, ChallengeRequestExecutor.Config creqExecutorConfig, ChallengeRequestExecutor.Factory creqExecutorFactory, int i11, IntentData intentData) {
        s.g(cresData, "cresData");
        s.g(creqData, "creqData");
        s.g(uiCustomization, "uiCustomization");
        s.g(creqExecutorConfig, "creqExecutorConfig");
        s.g(creqExecutorFactory, "creqExecutorFactory");
        s.g(intentData, "intentData");
        this.cresData = cresData;
        this.creqData = creqData;
        this.uiCustomization = uiCustomization;
        this.creqExecutorConfig = creqExecutorConfig;
        this.creqExecutorFactory = creqExecutorFactory;
        this.timeoutMins = i11;
        this.intentData = intentData;
    }

    public static /* synthetic */ ChallengeViewArgs copy$default(ChallengeViewArgs challengeViewArgs, ChallengeResponseData challengeResponseData, ChallengeRequestData challengeRequestData, StripeUiCustomization stripeUiCustomization, ChallengeRequestExecutor.Config config, ChallengeRequestExecutor.Factory factory, int i11, IntentData intentData, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            challengeResponseData = challengeViewArgs.cresData;
        }
        if ((i12 & 2) != 0) {
            challengeRequestData = challengeViewArgs.creqData;
        }
        ChallengeRequestData challengeRequestData2 = challengeRequestData;
        if ((i12 & 4) != 0) {
            stripeUiCustomization = challengeViewArgs.uiCustomization;
        }
        StripeUiCustomization stripeUiCustomization2 = stripeUiCustomization;
        if ((i12 & 8) != 0) {
            config = challengeViewArgs.creqExecutorConfig;
        }
        ChallengeRequestExecutor.Config config2 = config;
        if ((i12 & 16) != 0) {
            factory = challengeViewArgs.creqExecutorFactory;
        }
        ChallengeRequestExecutor.Factory factory2 = factory;
        if ((i12 & 32) != 0) {
            i11 = challengeViewArgs.timeoutMins;
        }
        int i13 = i11;
        if ((i12 & 64) != 0) {
            intentData = challengeViewArgs.intentData;
        }
        return challengeViewArgs.copy(challengeResponseData, challengeRequestData2, stripeUiCustomization2, config2, factory2, i13, intentData);
    }

    public final ChallengeResponseData component1$3ds2sdk_release() {
        return this.cresData;
    }

    public final ChallengeRequestData component2$3ds2sdk_release() {
        return this.creqData;
    }

    public final StripeUiCustomization component3$3ds2sdk_release() {
        return this.uiCustomization;
    }

    public final ChallengeRequestExecutor.Config component4$3ds2sdk_release() {
        return this.creqExecutorConfig;
    }

    public final ChallengeRequestExecutor.Factory component5$3ds2sdk_release() {
        return this.creqExecutorFactory;
    }

    public final int component6$3ds2sdk_release() {
        return this.timeoutMins;
    }

    public final IntentData component7$3ds2sdk_release() {
        return this.intentData;
    }

    public final ChallengeViewArgs copy(ChallengeResponseData cresData, ChallengeRequestData creqData, StripeUiCustomization uiCustomization, ChallengeRequestExecutor.Config creqExecutorConfig, ChallengeRequestExecutor.Factory creqExecutorFactory, int i11, IntentData intentData) {
        s.g(cresData, "cresData");
        s.g(creqData, "creqData");
        s.g(uiCustomization, "uiCustomization");
        s.g(creqExecutorConfig, "creqExecutorConfig");
        s.g(creqExecutorFactory, "creqExecutorFactory");
        s.g(intentData, "intentData");
        return new ChallengeViewArgs(cresData, creqData, uiCustomization, creqExecutorConfig, creqExecutorFactory, i11, intentData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChallengeViewArgs) {
            ChallengeViewArgs challengeViewArgs = (ChallengeViewArgs) obj;
            return s.c(this.cresData, challengeViewArgs.cresData) && s.c(this.creqData, challengeViewArgs.creqData) && s.c(this.uiCustomization, challengeViewArgs.uiCustomization) && s.c(this.creqExecutorConfig, challengeViewArgs.creqExecutorConfig) && s.c(this.creqExecutorFactory, challengeViewArgs.creqExecutorFactory) && this.timeoutMins == challengeViewArgs.timeoutMins && s.c(this.intentData, challengeViewArgs.intentData);
        }
        return false;
    }

    public final ChallengeRequestData getCreqData$3ds2sdk_release() {
        return this.creqData;
    }

    public final ChallengeRequestExecutor.Config getCreqExecutorConfig$3ds2sdk_release() {
        return this.creqExecutorConfig;
    }

    public final ChallengeRequestExecutor.Factory getCreqExecutorFactory$3ds2sdk_release() {
        return this.creqExecutorFactory;
    }

    public final ChallengeResponseData getCresData$3ds2sdk_release() {
        return this.cresData;
    }

    public final IntentData getIntentData$3ds2sdk_release() {
        return this.intentData;
    }

    public final SdkTransactionId getSdkTransactionId$3ds2sdk_release() {
        return this.creqData.getSdkTransId();
    }

    public final int getTimeoutMins$3ds2sdk_release() {
        return this.timeoutMins;
    }

    public final StripeUiCustomization getUiCustomization$3ds2sdk_release() {
        return this.uiCustomization;
    }

    public int hashCode() {
        return (((((((((((this.cresData.hashCode() * 31) + this.creqData.hashCode()) * 31) + this.uiCustomization.hashCode()) * 31) + this.creqExecutorConfig.hashCode()) * 31) + this.creqExecutorFactory.hashCode()) * 31) + Integer.hashCode(this.timeoutMins)) * 31) + this.intentData.hashCode();
    }

    public final Bundle toBundle() {
        return r3.b.a(v.a(EXTRA_ARGS, this));
    }

    public String toString() {
        return "ChallengeViewArgs(cresData=" + this.cresData + ", creqData=" + this.creqData + ", uiCustomization=" + this.uiCustomization + ", creqExecutorConfig=" + this.creqExecutorConfig + ", creqExecutorFactory=" + this.creqExecutorFactory + ", timeoutMins=" + this.timeoutMins + ", intentData=" + this.intentData + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        this.cresData.writeToParcel(out, i11);
        this.creqData.writeToParcel(out, i11);
        out.writeParcelable(this.uiCustomization, i11);
        this.creqExecutorConfig.writeToParcel(out, i11);
        out.writeSerializable(this.creqExecutorFactory);
        out.writeInt(this.timeoutMins);
        this.intentData.writeToParcel(out, i11);
    }
}