package com.stripe.android.stripe3ds2.transaction;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import r3.b;
import vz.v;

/* loaded from: classes6.dex */
public abstract class InitChallengeResult implements Parcelable {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_RESULT = "key_init_challenge_result";

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InitChallengeResult fromBundle(Bundle bundle) {
            s.g(bundle, "bundle");
            InitChallengeResult initChallengeResult = (InitChallengeResult) bundle.getParcelable(InitChallengeResult.KEY_RESULT);
            return initChallengeResult == null ? new End(new ChallengeResult.RuntimeError(new IllegalArgumentException("Could not retrieve result."), null, IntentData.Companion.getEMPTY())) : initChallengeResult;
        }
    }

    /* loaded from: classes6.dex */
    public static final class End extends InitChallengeResult {
        public static final Parcelable.Creator<End> CREATOR = new Creator();
        private final ChallengeResult challengeResult;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<End> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final End createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new End((ChallengeResult) parcel.readParcelable(End.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final End[] newArray(int i11) {
                return new End[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public End(ChallengeResult challengeResult) {
            super(null);
            s.g(challengeResult, "challengeResult");
            this.challengeResult = challengeResult;
        }

        public static /* synthetic */ End copy$default(End end, ChallengeResult challengeResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                challengeResult = end.challengeResult;
            }
            return end.copy(challengeResult);
        }

        public final ChallengeResult component1() {
            return this.challengeResult;
        }

        public final End copy(ChallengeResult challengeResult) {
            s.g(challengeResult, "challengeResult");
            return new End(challengeResult);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof End) && s.c(this.challengeResult, ((End) obj).challengeResult);
        }

        public final ChallengeResult getChallengeResult() {
            return this.challengeResult;
        }

        public int hashCode() {
            return this.challengeResult.hashCode();
        }

        public String toString() {
            return "End(challengeResult=" + this.challengeResult + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeParcelable(this.challengeResult, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Start extends InitChallengeResult {
        public static final Parcelable.Creator<Start> CREATOR = new Creator();
        private final ChallengeViewArgs challengeViewArgs;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Start> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Start createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Start(ChallengeViewArgs.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Start[] newArray(int i11) {
                return new Start[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Start(ChallengeViewArgs challengeViewArgs) {
            super(null);
            s.g(challengeViewArgs, "challengeViewArgs");
            this.challengeViewArgs = challengeViewArgs;
        }

        public static /* synthetic */ Start copy$default(Start start, ChallengeViewArgs challengeViewArgs, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                challengeViewArgs = start.challengeViewArgs;
            }
            return start.copy(challengeViewArgs);
        }

        public final ChallengeViewArgs component1() {
            return this.challengeViewArgs;
        }

        public final Start copy(ChallengeViewArgs challengeViewArgs) {
            s.g(challengeViewArgs, "challengeViewArgs");
            return new Start(challengeViewArgs);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Start) && s.c(this.challengeViewArgs, ((Start) obj).challengeViewArgs);
        }

        public final ChallengeViewArgs getChallengeViewArgs() {
            return this.challengeViewArgs;
        }

        public int hashCode() {
            return this.challengeViewArgs.hashCode();
        }

        public String toString() {
            return "Start(challengeViewArgs=" + this.challengeViewArgs + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            this.challengeViewArgs.writeToParcel(out, i11);
        }
    }

    private InitChallengeResult() {
    }

    public /* synthetic */ InitChallengeResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Bundle toBundle() {
        return b.a(v.a(KEY_RESULT, this));
    }
}