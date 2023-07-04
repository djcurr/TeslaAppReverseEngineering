package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class RuntimeErrorEvent implements Parcelable {
    public static final Parcelable.Creator<RuntimeErrorEvent> CREATOR = new Creator();
    private final String errorCode;
    private final String errorMessage;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<RuntimeErrorEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RuntimeErrorEvent createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new RuntimeErrorEvent(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RuntimeErrorEvent[] newArray(int i11) {
            return new RuntimeErrorEvent[i11];
        }
    }

    public RuntimeErrorEvent(String errorCode, String errorMessage) {
        s.g(errorCode, "errorCode");
        s.g(errorMessage, "errorMessage");
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public static /* synthetic */ RuntimeErrorEvent copy$default(RuntimeErrorEvent runtimeErrorEvent, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = runtimeErrorEvent.errorCode;
        }
        if ((i11 & 2) != 0) {
            str2 = runtimeErrorEvent.errorMessage;
        }
        return runtimeErrorEvent.copy(str, str2);
    }

    public final String component1() {
        return this.errorCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final RuntimeErrorEvent copy(String errorCode, String errorMessage) {
        s.g(errorCode, "errorCode");
        s.g(errorMessage, "errorMessage");
        return new RuntimeErrorEvent(errorCode, errorMessage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RuntimeErrorEvent) {
            RuntimeErrorEvent runtimeErrorEvent = (RuntimeErrorEvent) obj;
            return s.c(this.errorCode, runtimeErrorEvent.errorCode) && s.c(this.errorMessage, runtimeErrorEvent.errorMessage);
        }
        return false;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        return (this.errorCode.hashCode() * 31) + this.errorMessage.hashCode();
    }

    public String toString() {
        return "RuntimeErrorEvent(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.errorCode);
        out.writeString(this.errorMessage);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RuntimeErrorEvent(java.lang.Throwable r3) {
        /*
            r2 = this;
            java.lang.String r0 = "throwable"
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "throwable.javaClass.simpleName"
            kotlin.jvm.internal.s.f(r0, r1)
            java.lang.String r3 = r3.getMessage()
            if (r3 != 0) goto L1a
            java.lang.String r3 = ""
        L1a:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.RuntimeErrorEvent.<init>(java.lang.Throwable):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RuntimeErrorEvent(ErrorData errorData) {
        this(errorData.getErrorCode(), errorData.getErrorDetail());
        s.g(errorData, "errorData");
    }
}