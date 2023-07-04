package com.stripe.android.stripe3ds2.transaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import r3.b;
import vz.v;

/* loaded from: classes6.dex */
public abstract class ChallengeResult implements Parcelable {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_RESULT = "extra_result";

    /* loaded from: classes6.dex */
    public static final class Canceled extends ChallengeResult {
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final String uiTypeCode;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Canceled(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i11) {
                return new Canceled[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Canceled(String str, UiType uiType, IntentData intentData) {
            super(null);
            s.g(intentData, "intentData");
            this.uiTypeCode = str;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        public static /* synthetic */ Canceled copy$default(Canceled canceled, String str, UiType uiType, IntentData intentData, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = canceled.uiTypeCode;
            }
            if ((i11 & 2) != 0) {
                uiType = canceled.getInitialUiType();
            }
            if ((i11 & 4) != 0) {
                intentData = canceled.getIntentData();
            }
            return canceled.copy(str, uiType, intentData);
        }

        public final String component1() {
            return this.uiTypeCode;
        }

        public final UiType component2() {
            return getInitialUiType();
        }

        public final IntentData component3() {
            return getIntentData();
        }

        public final Canceled copy(String str, UiType uiType, IntentData intentData) {
            s.g(intentData, "intentData");
            return new Canceled(str, uiType, intentData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Canceled) {
                Canceled canceled = (Canceled) obj;
                return s.c(this.uiTypeCode, canceled.uiTypeCode) && getInitialUiType() == canceled.getInitialUiType() && s.c(getIntentData(), canceled.getIntentData());
            }
            return false;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        public int hashCode() {
            String str = this.uiTypeCode;
            return ((((str == null ? 0 : str.hashCode()) * 31) + (getInitialUiType() != null ? getInitialUiType().hashCode() : 0)) * 31) + getIntentData().hashCode();
        }

        public String toString() {
            return "Canceled(uiTypeCode=" + ((Object) this.uiTypeCode) + ", initialUiType=" + getInitialUiType() + ", intentData=" + getIntentData() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(uiType.name());
            }
            this.intentData.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChallengeResult fromIntent(Intent intent) {
            ChallengeResult challengeResult = intent == null ? null : (ChallengeResult) intent.getParcelableExtra("extra_result");
            return challengeResult == null ? new RuntimeError(new IllegalStateException("Intent extras did not contain a valid ChallengeResult."), null, IntentData.Companion.getEMPTY()) : challengeResult;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Failed extends ChallengeResult {
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final String uiTypeCode;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Failed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Failed(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i11) {
                return new Failed[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(String uiTypeCode, UiType uiType, IntentData intentData) {
            super(null);
            s.g(uiTypeCode, "uiTypeCode");
            s.g(intentData, "intentData");
            this.uiTypeCode = uiTypeCode;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, UiType uiType, IntentData intentData, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = failed.uiTypeCode;
            }
            if ((i11 & 2) != 0) {
                uiType = failed.getInitialUiType();
            }
            if ((i11 & 4) != 0) {
                intentData = failed.getIntentData();
            }
            return failed.copy(str, uiType, intentData);
        }

        public final String component1() {
            return this.uiTypeCode;
        }

        public final UiType component2() {
            return getInitialUiType();
        }

        public final IntentData component3() {
            return getIntentData();
        }

        public final Failed copy(String uiTypeCode, UiType uiType, IntentData intentData) {
            s.g(uiTypeCode, "uiTypeCode");
            s.g(intentData, "intentData");
            return new Failed(uiTypeCode, uiType, intentData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Failed) {
                Failed failed = (Failed) obj;
                return s.c(this.uiTypeCode, failed.uiTypeCode) && getInitialUiType() == failed.getInitialUiType() && s.c(getIntentData(), failed.getIntentData());
            }
            return false;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        public int hashCode() {
            return (((this.uiTypeCode.hashCode() * 31) + (getInitialUiType() == null ? 0 : getInitialUiType().hashCode())) * 31) + getIntentData().hashCode();
        }

        public String toString() {
            return "Failed(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + getInitialUiType() + ", intentData=" + getIntentData() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(uiType.name());
            }
            this.intentData.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class ProtocolError extends ChallengeResult {
        public static final Parcelable.Creator<ProtocolError> CREATOR = new Creator();
        private final ErrorData data;
        private final UiType initialUiType;
        private final IntentData intentData;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<ProtocolError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProtocolError createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new ProtocolError(ErrorData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProtocolError[] newArray(int i11) {
                return new ProtocolError[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProtocolError(ErrorData data, UiType uiType, IntentData intentData) {
            super(null);
            s.g(data, "data");
            s.g(intentData, "intentData");
            this.data = data;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        public static /* synthetic */ ProtocolError copy$default(ProtocolError protocolError, ErrorData errorData, UiType uiType, IntentData intentData, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                errorData = protocolError.data;
            }
            if ((i11 & 2) != 0) {
                uiType = protocolError.getInitialUiType();
            }
            if ((i11 & 4) != 0) {
                intentData = protocolError.getIntentData();
            }
            return protocolError.copy(errorData, uiType, intentData);
        }

        public final ErrorData component1() {
            return this.data;
        }

        public final UiType component2() {
            return getInitialUiType();
        }

        public final IntentData component3() {
            return getIntentData();
        }

        public final ProtocolError copy(ErrorData data, UiType uiType, IntentData intentData) {
            s.g(data, "data");
            s.g(intentData, "intentData");
            return new ProtocolError(data, uiType, intentData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ProtocolError) {
                ProtocolError protocolError = (ProtocolError) obj;
                return s.c(this.data, protocolError.data) && getInitialUiType() == protocolError.getInitialUiType() && s.c(getIntentData(), protocolError.getIntentData());
            }
            return false;
        }

        public final ErrorData getData() {
            return this.data;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        public int hashCode() {
            return (((this.data.hashCode() * 31) + (getInitialUiType() == null ? 0 : getInitialUiType().hashCode())) * 31) + getIntentData().hashCode();
        }

        public String toString() {
            return "ProtocolError(data=" + this.data + ", initialUiType=" + getInitialUiType() + ", intentData=" + getIntentData() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            this.data.writeToParcel(out, i11);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(uiType.name());
            }
            this.intentData.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class RuntimeError extends ChallengeResult {
        public static final Parcelable.Creator<RuntimeError> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final Throwable throwable;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<RuntimeError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuntimeError createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new RuntimeError((Throwable) parcel.readSerializable(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuntimeError[] newArray(int i11) {
                return new RuntimeError[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RuntimeError(Throwable throwable, UiType uiType, IntentData intentData) {
            super(null);
            s.g(throwable, "throwable");
            s.g(intentData, "intentData");
            this.throwable = throwable;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        public static /* synthetic */ RuntimeError copy$default(RuntimeError runtimeError, Throwable th2, UiType uiType, IntentData intentData, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = runtimeError.throwable;
            }
            if ((i11 & 2) != 0) {
                uiType = runtimeError.getInitialUiType();
            }
            if ((i11 & 4) != 0) {
                intentData = runtimeError.getIntentData();
            }
            return runtimeError.copy(th2, uiType, intentData);
        }

        public final Throwable component1() {
            return this.throwable;
        }

        public final UiType component2() {
            return getInitialUiType();
        }

        public final IntentData component3() {
            return getIntentData();
        }

        public final RuntimeError copy(Throwable throwable, UiType uiType, IntentData intentData) {
            s.g(throwable, "throwable");
            s.g(intentData, "intentData");
            return new RuntimeError(throwable, uiType, intentData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RuntimeError) {
                RuntimeError runtimeError = (RuntimeError) obj;
                return s.c(this.throwable, runtimeError.throwable) && getInitialUiType() == runtimeError.getInitialUiType() && s.c(getIntentData(), runtimeError.getIntentData());
            }
            return false;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return (((this.throwable.hashCode() * 31) + (getInitialUiType() == null ? 0 : getInitialUiType().hashCode())) * 31) + getIntentData().hashCode();
        }

        public String toString() {
            return "RuntimeError(throwable=" + this.throwable + ", initialUiType=" + getInitialUiType() + ", intentData=" + getIntentData() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeSerializable(this.throwable);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(uiType.name());
            }
            this.intentData.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Succeeded extends ChallengeResult {
        public static final Parcelable.Creator<Succeeded> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final String uiTypeCode;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Succeeded> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Succeeded createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Succeeded(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Succeeded[] newArray(int i11) {
                return new Succeeded[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Succeeded(String uiTypeCode, UiType uiType, IntentData intentData) {
            super(null);
            s.g(uiTypeCode, "uiTypeCode");
            s.g(intentData, "intentData");
            this.uiTypeCode = uiTypeCode;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        public static /* synthetic */ Succeeded copy$default(Succeeded succeeded, String str, UiType uiType, IntentData intentData, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = succeeded.uiTypeCode;
            }
            if ((i11 & 2) != 0) {
                uiType = succeeded.getInitialUiType();
            }
            if ((i11 & 4) != 0) {
                intentData = succeeded.getIntentData();
            }
            return succeeded.copy(str, uiType, intentData);
        }

        public final String component1() {
            return this.uiTypeCode;
        }

        public final UiType component2() {
            return getInitialUiType();
        }

        public final IntentData component3() {
            return getIntentData();
        }

        public final Succeeded copy(String uiTypeCode, UiType uiType, IntentData intentData) {
            s.g(uiTypeCode, "uiTypeCode");
            s.g(intentData, "intentData");
            return new Succeeded(uiTypeCode, uiType, intentData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Succeeded) {
                Succeeded succeeded = (Succeeded) obj;
                return s.c(this.uiTypeCode, succeeded.uiTypeCode) && getInitialUiType() == succeeded.getInitialUiType() && s.c(getIntentData(), succeeded.getIntentData());
            }
            return false;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        public int hashCode() {
            return (((this.uiTypeCode.hashCode() * 31) + (getInitialUiType() == null ? 0 : getInitialUiType().hashCode())) * 31) + getIntentData().hashCode();
        }

        public String toString() {
            return "Succeeded(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + getInitialUiType() + ", intentData=" + getIntentData() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(uiType.name());
            }
            this.intentData.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Timeout extends ChallengeResult {
        public static final Parcelable.Creator<Timeout> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final String uiTypeCode;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Timeout> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Timeout createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Timeout(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Timeout[] newArray(int i11) {
                return new Timeout[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Timeout(String str, UiType uiType, IntentData intentData) {
            super(null);
            s.g(intentData, "intentData");
            this.uiTypeCode = str;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        public static /* synthetic */ Timeout copy$default(Timeout timeout, String str, UiType uiType, IntentData intentData, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = timeout.uiTypeCode;
            }
            if ((i11 & 2) != 0) {
                uiType = timeout.getInitialUiType();
            }
            if ((i11 & 4) != 0) {
                intentData = timeout.getIntentData();
            }
            return timeout.copy(str, uiType, intentData);
        }

        public final String component1() {
            return this.uiTypeCode;
        }

        public final UiType component2() {
            return getInitialUiType();
        }

        public final IntentData component3() {
            return getIntentData();
        }

        public final Timeout copy(String str, UiType uiType, IntentData intentData) {
            s.g(intentData, "intentData");
            return new Timeout(str, uiType, intentData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Timeout) {
                Timeout timeout = (Timeout) obj;
                return s.c(this.uiTypeCode, timeout.uiTypeCode) && getInitialUiType() == timeout.getInitialUiType() && s.c(getIntentData(), timeout.getIntentData());
            }
            return false;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        public int hashCode() {
            String str = this.uiTypeCode;
            return ((((str == null ? 0 : str.hashCode()) * 31) + (getInitialUiType() != null ? getInitialUiType().hashCode() : 0)) * 31) + getIntentData().hashCode();
        }

        public String toString() {
            return "Timeout(uiTypeCode=" + ((Object) this.uiTypeCode) + ", initialUiType=" + getInitialUiType() + ", intentData=" + getIntentData() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(uiType.name());
            }
            this.intentData.writeToParcel(out, i11);
        }
    }

    private ChallengeResult() {
    }

    public /* synthetic */ ChallengeResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract UiType getInitialUiType();

    public abstract IntentData getIntentData();

    public final Bundle toBundle$3ds2sdk_release() {
        return b.a(v.a("extra_result", this));
    }
}