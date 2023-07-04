package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ProtocolErrorEvent implements Parcelable {
    public static final Parcelable.Creator<ProtocolErrorEvent> CREATOR = new Creator();
    private final ErrorMessage errorMessage;
    private final SdkTransactionId sdkTransactionId;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ProtocolErrorEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProtocolErrorEvent createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new ProtocolErrorEvent(parcel.readInt() == 0 ? null : SdkTransactionId.CREATOR.createFromParcel(parcel), ErrorMessage.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProtocolErrorEvent[] newArray(int i11) {
            return new ProtocolErrorEvent[i11];
        }
    }

    public ProtocolErrorEvent(SdkTransactionId sdkTransactionId, ErrorMessage errorMessage) {
        s.g(errorMessage, "errorMessage");
        this.sdkTransactionId = sdkTransactionId;
        this.errorMessage = errorMessage;
    }

    public static /* synthetic */ ProtocolErrorEvent copy$default(ProtocolErrorEvent protocolErrorEvent, SdkTransactionId sdkTransactionId, ErrorMessage errorMessage, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sdkTransactionId = protocolErrorEvent.sdkTransactionId;
        }
        if ((i11 & 2) != 0) {
            errorMessage = protocolErrorEvent.errorMessage;
        }
        return protocolErrorEvent.copy(sdkTransactionId, errorMessage);
    }

    public final SdkTransactionId component1() {
        return this.sdkTransactionId;
    }

    public final ErrorMessage component2() {
        return this.errorMessage;
    }

    public final ProtocolErrorEvent copy(SdkTransactionId sdkTransactionId, ErrorMessage errorMessage) {
        s.g(errorMessage, "errorMessage");
        return new ProtocolErrorEvent(sdkTransactionId, errorMessage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProtocolErrorEvent) {
            ProtocolErrorEvent protocolErrorEvent = (ProtocolErrorEvent) obj;
            return s.c(this.sdkTransactionId, protocolErrorEvent.sdkTransactionId) && s.c(this.errorMessage, protocolErrorEvent.errorMessage);
        }
        return false;
    }

    public final ErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    public final SdkTransactionId getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    public int hashCode() {
        SdkTransactionId sdkTransactionId = this.sdkTransactionId;
        return ((sdkTransactionId == null ? 0 : sdkTransactionId.hashCode()) * 31) + this.errorMessage.hashCode();
    }

    public String toString() {
        return "ProtocolErrorEvent(sdkTransactionId=" + this.sdkTransactionId + ", errorMessage=" + this.errorMessage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        SdkTransactionId sdkTransactionId = this.sdkTransactionId;
        if (sdkTransactionId == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sdkTransactionId.writeToParcel(out, i11);
        }
        this.errorMessage.writeToParcel(out, i11);
    }
}