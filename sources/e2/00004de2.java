package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import c30.b;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import e30.f;
import f30.d;
import g30.f1;
import g30.q1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;

@a
/* loaded from: classes2.dex */
public final class OwnershipRefresh implements Parcelable, StripeModel {
    private final int lastAttemptedAt;
    private final Status status;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OwnershipRefresh> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<OwnershipRefresh> serializer() {
            return OwnershipRefresh$$serializer.INSTANCE;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<OwnershipRefresh> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OwnershipRefresh createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new OwnershipRefresh(parcel.readInt(), Status.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OwnershipRefresh[] newArray(int i11) {
            return new OwnershipRefresh[i11];
        }
    }

    @a
    /* loaded from: classes2.dex */
    public enum Status {
        FAILED("failed"),
        PENDING("pending"),
        SUCCEEDED("succeeded"),
        UNKNOWN("unknown");
        
        public static final Companion Companion = new Companion(null);
        private final String value;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b<Status> serializer() {
                return OwnershipRefresh$Status$$serializer.INSTANCE;
            }
        }

        Status(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public /* synthetic */ OwnershipRefresh(int i11, int i12, Status status, q1 q1Var) {
        if (1 != (i11 & 1)) {
            f1.a(i11, 1, OwnershipRefresh$$serializer.INSTANCE.getDescriptor());
        }
        this.lastAttemptedAt = i12;
        if ((i11 & 2) == 0) {
            this.status = Status.UNKNOWN;
        } else {
            this.status = status;
        }
    }

    public static /* synthetic */ OwnershipRefresh copy$default(OwnershipRefresh ownershipRefresh, int i11, Status status, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = ownershipRefresh.lastAttemptedAt;
        }
        if ((i12 & 2) != 0) {
            status = ownershipRefresh.status;
        }
        return ownershipRefresh.copy(i11, status);
    }

    public static /* synthetic */ void getLastAttemptedAt$annotations() {
    }

    public static /* synthetic */ void getStatus$annotations() {
    }

    public static final void write$Self(OwnershipRefresh self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        output.n(serialDesc, 0, self.lastAttemptedAt);
        if (output.k(serialDesc, 1) || self.status != Status.UNKNOWN) {
            output.q(serialDesc, 1, OwnershipRefresh$Status$$serializer.INSTANCE, self.status);
        }
    }

    public final int component1() {
        return this.lastAttemptedAt;
    }

    public final Status component2() {
        return this.status;
    }

    public final OwnershipRefresh copy(int i11, Status status) {
        s.g(status, "status");
        return new OwnershipRefresh(i11, status);
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
        if (obj instanceof OwnershipRefresh) {
            OwnershipRefresh ownershipRefresh = (OwnershipRefresh) obj;
            return this.lastAttemptedAt == ownershipRefresh.lastAttemptedAt && this.status == ownershipRefresh.status;
        }
        return false;
    }

    public final int getLastAttemptedAt() {
        return this.lastAttemptedAt;
    }

    public final Status getStatus() {
        return this.status;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (Integer.hashCode(this.lastAttemptedAt) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "OwnershipRefresh(lastAttemptedAt=" + this.lastAttemptedAt + ", status=" + this.status + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeInt(this.lastAttemptedAt);
        out.writeString(this.status.name());
    }

    public OwnershipRefresh(int i11, Status status) {
        s.g(status, "status");
        this.lastAttemptedAt = i11;
        this.status = status;
    }

    public /* synthetic */ OwnershipRefresh(int i11, Status status, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? Status.UNKNOWN : status);
    }
}