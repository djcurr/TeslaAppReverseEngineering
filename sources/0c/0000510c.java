package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ConsumerSessionLookup implements StripeModel {
    private final ConsumerSession consumerSession;
    private final String errorMessage;
    private final boolean exists;
    public static final Parcelable.Creator<ConsumerSessionLookup> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ConsumerSessionLookup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerSessionLookup createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new ConsumerSessionLookup(parcel.readInt() != 0, parcel.readInt() == 0 ? null : ConsumerSession.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerSessionLookup[] newArray(int i11) {
            return new ConsumerSessionLookup[i11];
        }
    }

    public ConsumerSessionLookup(boolean z11, ConsumerSession consumerSession, String str) {
        this.exists = z11;
        this.consumerSession = consumerSession;
        this.errorMessage = str;
    }

    public static /* synthetic */ ConsumerSessionLookup copy$default(ConsumerSessionLookup consumerSessionLookup, boolean z11, ConsumerSession consumerSession, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = consumerSessionLookup.exists;
        }
        if ((i11 & 2) != 0) {
            consumerSession = consumerSessionLookup.consumerSession;
        }
        if ((i11 & 4) != 0) {
            str = consumerSessionLookup.errorMessage;
        }
        return consumerSessionLookup.copy(z11, consumerSession, str);
    }

    public final boolean component1() {
        return this.exists;
    }

    public final ConsumerSession component2() {
        return this.consumerSession;
    }

    public final String component3() {
        return this.errorMessage;
    }

    public final ConsumerSessionLookup copy(boolean z11, ConsumerSession consumerSession, String str) {
        return new ConsumerSessionLookup(z11, consumerSession, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsumerSessionLookup) {
            ConsumerSessionLookup consumerSessionLookup = (ConsumerSessionLookup) obj;
            return this.exists == consumerSessionLookup.exists && s.c(this.consumerSession, consumerSessionLookup.consumerSession) && s.c(this.errorMessage, consumerSessionLookup.errorMessage);
        }
        return false;
    }

    public final ConsumerSession getConsumerSession() {
        return this.consumerSession;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getExists() {
        return this.exists;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        boolean z11 = this.exists;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        ConsumerSession consumerSession = this.consumerSession;
        int hashCode = (i11 + (consumerSession == null ? 0 : consumerSession.hashCode())) * 31;
        String str = this.errorMessage;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ConsumerSessionLookup(exists=" + this.exists + ", consumerSession=" + this.consumerSession + ", errorMessage=" + ((Object) this.errorMessage) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeInt(this.exists ? 1 : 0);
        ConsumerSession consumerSession = this.consumerSession;
        if (consumerSession == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            consumerSession.writeToParcel(out, i11);
        }
        out.writeString(this.errorMessage);
    }
}