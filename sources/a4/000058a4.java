package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ErrorMessage implements Parcelable {
    public static final Parcelable.Creator<ErrorMessage> CREATOR = new Creator();
    private final String errorCode;
    private final String errorDescription;
    private final String errorDetails;
    private final String transactionId;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ErrorMessage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorMessage createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new ErrorMessage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorMessage[] newArray(int i11) {
            return new ErrorMessage[i11];
        }
    }

    public ErrorMessage(String transactionId, String errorCode, String errorDescription, String errorDetails) {
        s.g(transactionId, "transactionId");
        s.g(errorCode, "errorCode");
        s.g(errorDescription, "errorDescription");
        s.g(errorDetails, "errorDetails");
        this.transactionId = transactionId;
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
        this.errorDetails = errorDetails;
    }

    public static /* synthetic */ ErrorMessage copy$default(ErrorMessage errorMessage, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = errorMessage.transactionId;
        }
        if ((i11 & 2) != 0) {
            str2 = errorMessage.errorCode;
        }
        if ((i11 & 4) != 0) {
            str3 = errorMessage.errorDescription;
        }
        if ((i11 & 8) != 0) {
            str4 = errorMessage.errorDetails;
        }
        return errorMessage.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.transactionId;
    }

    public final String component2() {
        return this.errorCode;
    }

    public final String component3() {
        return this.errorDescription;
    }

    public final String component4() {
        return this.errorDetails;
    }

    public final ErrorMessage copy(String transactionId, String errorCode, String errorDescription, String errorDetails) {
        s.g(transactionId, "transactionId");
        s.g(errorCode, "errorCode");
        s.g(errorDescription, "errorDescription");
        s.g(errorDetails, "errorDetails");
        return new ErrorMessage(transactionId, errorCode, errorDescription, errorDetails);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorMessage) {
            ErrorMessage errorMessage = (ErrorMessage) obj;
            return s.c(this.transactionId, errorMessage.transactionId) && s.c(this.errorCode, errorMessage.errorCode) && s.c(this.errorDescription, errorMessage.errorDescription) && s.c(this.errorDetails, errorMessage.errorDetails);
        }
        return false;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final String getErrorDetails() {
        return this.errorDetails;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        return (((((this.transactionId.hashCode() * 31) + this.errorCode.hashCode()) * 31) + this.errorDescription.hashCode()) * 31) + this.errorDetails.hashCode();
    }

    public String toString() {
        return "ErrorMessage(transactionId=" + this.transactionId + ", errorCode=" + this.errorCode + ", errorDescription=" + this.errorDescription + ", errorDetails=" + this.errorDetails + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.transactionId);
        out.writeString(this.errorCode);
        out.writeString(this.errorDescription);
        out.writeString(this.errorDetails);
    }
}