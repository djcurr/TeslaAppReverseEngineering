package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class ChallengeRequestResult implements Parcelable {

    /* loaded from: classes6.dex */
    public static abstract class Failure extends ChallengeRequestResult {
        private Failure() {
            super(null);
        }

        public /* synthetic */ Failure(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class ProtocolError extends Failure {
        public static final Parcelable.Creator<ProtocolError> CREATOR = new Creator();
        private final ErrorData data;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<ProtocolError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProtocolError createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new ProtocolError(ErrorData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProtocolError[] newArray(int i11) {
                return new ProtocolError[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProtocolError(ErrorData data) {
            super(null);
            s.g(data, "data");
            this.data = data;
        }

        public static /* synthetic */ ProtocolError copy$default(ProtocolError protocolError, ErrorData errorData, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                errorData = protocolError.data;
            }
            return protocolError.copy(errorData);
        }

        public final ErrorData component1() {
            return this.data;
        }

        public final ProtocolError copy(ErrorData data) {
            s.g(data, "data");
            return new ProtocolError(data);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProtocolError) && s.c(this.data, ((ProtocolError) obj).data);
        }

        public final ErrorData getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "ProtocolError(data=" + this.data + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            this.data.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class RuntimeError extends Failure {
        public static final Parcelable.Creator<RuntimeError> CREATOR = new Creator();
        private final Throwable throwable;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<RuntimeError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuntimeError createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new RuntimeError((Throwable) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuntimeError[] newArray(int i11) {
                return new RuntimeError[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RuntimeError(Throwable throwable) {
            super(null);
            s.g(throwable, "throwable");
            this.throwable = throwable;
        }

        public static /* synthetic */ RuntimeError copy$default(RuntimeError runtimeError, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = runtimeError.throwable;
            }
            return runtimeError.copy(th2);
        }

        public final Throwable component1() {
            return this.throwable;
        }

        public final RuntimeError copy(Throwable throwable) {
            s.g(throwable, "throwable");
            return new RuntimeError(throwable);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RuntimeError) && s.c(this.throwable, ((RuntimeError) obj).throwable);
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "RuntimeError(throwable=" + this.throwable + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeSerializable(this.throwable);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Success extends ChallengeRequestResult {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private final ChallengeRequestData creqData;
        private final ChallengeRequestExecutor.Config creqExecutorConfig;
        private final ChallengeResponseData cresData;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Success(ChallengeRequestData.CREATOR.createFromParcel(parcel), ChallengeResponseData.CREATOR.createFromParcel(parcel), ChallengeRequestExecutor.Config.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i11) {
                return new Success[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ChallengeRequestData creqData, ChallengeResponseData cresData, ChallengeRequestExecutor.Config creqExecutorConfig) {
            super(null);
            s.g(creqData, "creqData");
            s.g(cresData, "cresData");
            s.g(creqExecutorConfig, "creqExecutorConfig");
            this.creqData = creqData;
            this.cresData = cresData;
            this.creqExecutorConfig = creqExecutorConfig;
        }

        public static /* synthetic */ Success copy$default(Success success, ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData, ChallengeRequestExecutor.Config config, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                challengeRequestData = success.creqData;
            }
            if ((i11 & 2) != 0) {
                challengeResponseData = success.cresData;
            }
            if ((i11 & 4) != 0) {
                config = success.creqExecutorConfig;
            }
            return success.copy(challengeRequestData, challengeResponseData, config);
        }

        public final ChallengeRequestData component1() {
            return this.creqData;
        }

        public final ChallengeResponseData component2() {
            return this.cresData;
        }

        public final ChallengeRequestExecutor.Config component3$3ds2sdk_release() {
            return this.creqExecutorConfig;
        }

        public final Success copy(ChallengeRequestData creqData, ChallengeResponseData cresData, ChallengeRequestExecutor.Config creqExecutorConfig) {
            s.g(creqData, "creqData");
            s.g(cresData, "cresData");
            s.g(creqExecutorConfig, "creqExecutorConfig");
            return new Success(creqData, cresData, creqExecutorConfig);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Success) {
                Success success = (Success) obj;
                return s.c(this.creqData, success.creqData) && s.c(this.cresData, success.cresData) && s.c(this.creqExecutorConfig, success.creqExecutorConfig);
            }
            return false;
        }

        public final ChallengeRequestData getCreqData() {
            return this.creqData;
        }

        public final ChallengeRequestExecutor.Config getCreqExecutorConfig$3ds2sdk_release() {
            return this.creqExecutorConfig;
        }

        public final ChallengeResponseData getCresData() {
            return this.cresData;
        }

        public int hashCode() {
            return (((this.creqData.hashCode() * 31) + this.cresData.hashCode()) * 31) + this.creqExecutorConfig.hashCode();
        }

        public String toString() {
            return "Success(creqData=" + this.creqData + ", cresData=" + this.cresData + ", creqExecutorConfig=" + this.creqExecutorConfig + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            this.creqData.writeToParcel(out, i11);
            this.cresData.writeToParcel(out, i11);
            this.creqExecutorConfig.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Timeout extends Failure {
        public static final Parcelable.Creator<Timeout> CREATOR = new Creator();
        private final ErrorData data;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Timeout> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Timeout createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Timeout(ErrorData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Timeout[] newArray(int i11) {
                return new Timeout[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Timeout(ErrorData data) {
            super(null);
            s.g(data, "data");
            this.data = data;
        }

        public static /* synthetic */ Timeout copy$default(Timeout timeout, ErrorData errorData, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                errorData = timeout.data;
            }
            return timeout.copy(errorData);
        }

        public final ErrorData component1() {
            return this.data;
        }

        public final Timeout copy(ErrorData data) {
            s.g(data, "data");
            return new Timeout(data);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Timeout) && s.c(this.data, ((Timeout) obj).data);
        }

        public final ErrorData getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Timeout(data=" + this.data + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            this.data.writeToParcel(out, i11);
        }
    }

    private ChallengeRequestResult() {
    }

    public /* synthetic */ ChallengeRequestResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}