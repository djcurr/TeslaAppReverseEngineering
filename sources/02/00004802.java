package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.g4;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkErrorType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class LinkError implements Parcelable {
    private final String displayMessage;
    private final LinkErrorCode errorCode;
    private final String errorJson;
    private final String errorMessage;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LinkError> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkError fromException$link_sdk_release(Throwable th2) {
            return new LinkError(new LinkErrorCode.INTERNAL_ERROR((th2 == null || (r2 = th2.getMessage()) == null) ? "Internal Error" : "Internal Error", new LinkErrorType.INTERNAL_ERROR_TYPE(th2 != null ? th2.getClass().getSimpleName() : "Internal Error")), (th2 == null || (r0 = th2.getLocalizedMessage()) == null) ? "Internal exception occurred" : "Internal exception occurred", (th2 == null || (r9 = th2.getMessage()) == null) ? "An unknown error occurred, please try again later" : "An unknown error occurred, please try again later", null, 8, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LinkError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkError createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new LinkError((LinkErrorCode) parcel.readParcelable(LinkError.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkError[] newArray(int i11) {
            return new LinkError[i11];
        }
    }

    public LinkError(LinkErrorCode errorCode, String errorMessage, String str, String str2) {
        s.g(errorCode, "errorCode");
        s.g(errorMessage, "errorMessage");
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.displayMessage = str;
        this.errorJson = str2;
    }

    public static /* synthetic */ LinkError copy$default(LinkError linkError, LinkErrorCode linkErrorCode, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            linkErrorCode = linkError.errorCode;
        }
        if ((i11 & 2) != 0) {
            str = linkError.errorMessage;
        }
        if ((i11 & 4) != 0) {
            str2 = linkError.displayMessage;
        }
        if ((i11 & 8) != 0) {
            str3 = linkError.errorJson;
        }
        return linkError.copy(linkErrorCode, str, str2, str3);
    }

    public final LinkErrorCode component1() {
        return this.errorCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final String component3() {
        return this.displayMessage;
    }

    public final String component4() {
        return this.errorJson;
    }

    public final LinkError copy(LinkErrorCode errorCode, String errorMessage, String str, String str2) {
        s.g(errorCode, "errorCode");
        s.g(errorMessage, "errorMessage");
        return new LinkError(errorCode, errorMessage, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkError) {
            LinkError linkError = (LinkError) obj;
            return s.c(this.errorCode, linkError.errorCode) && s.c(this.errorMessage, linkError.errorMessage) && s.c(this.displayMessage, linkError.displayMessage) && s.c(this.errorJson, linkError.errorJson);
        }
        return false;
    }

    public final String getDisplayMessage() {
        return this.displayMessage;
    }

    public final LinkErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorJson() {
        return this.errorJson;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        int hashCode = (this.errorMessage.hashCode() + (this.errorCode.hashCode() * 31)) * 31;
        String str = this.displayMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorJson;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a11 = g4.a("LinkError(errorCode=");
        a11.append(this.errorCode);
        a11.append(", errorMessage=");
        a11.append(this.errorMessage);
        a11.append(", displayMessage=");
        a11.append((Object) this.displayMessage);
        a11.append(", errorJson=");
        a11.append((Object) this.errorJson);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeParcelable(this.errorCode, i11);
        out.writeString(this.errorMessage);
        out.writeString(this.displayMessage);
        out.writeString(this.errorJson);
    }

    public /* synthetic */ LinkError(LinkErrorCode linkErrorCode, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(linkErrorCode, str, str2, (i11 & 8) != 0 ? null : str3);
    }
}