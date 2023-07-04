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
public final class BalanceRefresh implements StripeModel, Parcelable {
    private final int lastAttemptedAt;
    private final BalanceRefreshStatus status;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BalanceRefresh> CREATOR = new Creator();

    @a
    /* loaded from: classes2.dex */
    public enum BalanceRefreshStatus {
        FAILED("failed"),
        PENDING("pending"),
        SUCCEEDED("succeeded"),
        UNKNOWN("unknown");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b<BalanceRefreshStatus> serializer() {
                return BalanceRefresh$BalanceRefreshStatus$$serializer.INSTANCE;
            }
        }

        BalanceRefreshStatus(String str) {
            this.code = str;
        }

        public final String getCode$financial_connections_release() {
            return this.code;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<BalanceRefresh> serializer() {
            return BalanceRefresh$$serializer.INSTANCE;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<BalanceRefresh> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BalanceRefresh createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new BalanceRefresh(parcel.readInt() == 0 ? null : BalanceRefreshStatus.valueOf(parcel.readString()), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BalanceRefresh[] newArray(int i11) {
            return new BalanceRefresh[i11];
        }
    }

    public /* synthetic */ BalanceRefresh(int i11, BalanceRefreshStatus balanceRefreshStatus, int i12, q1 q1Var) {
        if (2 != (i11 & 2)) {
            f1.a(i11, 2, BalanceRefresh$$serializer.INSTANCE.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.status = BalanceRefreshStatus.UNKNOWN;
        } else {
            this.status = balanceRefreshStatus;
        }
        this.lastAttemptedAt = i12;
    }

    public static /* synthetic */ BalanceRefresh copy$default(BalanceRefresh balanceRefresh, BalanceRefreshStatus balanceRefreshStatus, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            balanceRefreshStatus = balanceRefresh.status;
        }
        if ((i12 & 2) != 0) {
            i11 = balanceRefresh.lastAttemptedAt;
        }
        return balanceRefresh.copy(balanceRefreshStatus, i11);
    }

    public static /* synthetic */ void getLastAttemptedAt$annotations() {
    }

    public static /* synthetic */ void getStatus$annotations() {
    }

    public static final void write$Self(BalanceRefresh self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || self.status != BalanceRefreshStatus.UNKNOWN) {
            output.D(serialDesc, 0, BalanceRefresh$BalanceRefreshStatus$$serializer.INSTANCE, self.status);
        }
        output.n(serialDesc, 1, self.lastAttemptedAt);
    }

    public final BalanceRefreshStatus component1() {
        return this.status;
    }

    public final int component2() {
        return this.lastAttemptedAt;
    }

    public final BalanceRefresh copy(BalanceRefreshStatus balanceRefreshStatus, int i11) {
        return new BalanceRefresh(balanceRefreshStatus, i11);
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
        if (obj instanceof BalanceRefresh) {
            BalanceRefresh balanceRefresh = (BalanceRefresh) obj;
            return this.status == balanceRefresh.status && this.lastAttemptedAt == balanceRefresh.lastAttemptedAt;
        }
        return false;
    }

    public final int getLastAttemptedAt() {
        return this.lastAttemptedAt;
    }

    public final BalanceRefreshStatus getStatus() {
        return this.status;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        BalanceRefreshStatus balanceRefreshStatus = this.status;
        return ((balanceRefreshStatus == null ? 0 : balanceRefreshStatus.hashCode()) * 31) + Integer.hashCode(this.lastAttemptedAt);
    }

    public String toString() {
        return "BalanceRefresh(status=" + this.status + ", lastAttemptedAt=" + this.lastAttemptedAt + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        BalanceRefreshStatus balanceRefreshStatus = this.status;
        if (balanceRefreshStatus == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(balanceRefreshStatus.name());
        }
        out.writeInt(this.lastAttemptedAt);
    }

    public BalanceRefresh(BalanceRefreshStatus balanceRefreshStatus, int i11) {
        this.status = balanceRefreshStatus;
        this.lastAttemptedAt = i11;
    }

    public /* synthetic */ BalanceRefresh(BalanceRefreshStatus balanceRefreshStatus, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? BalanceRefreshStatus.UNKNOWN : balanceRefreshStatus, i11);
    }
}