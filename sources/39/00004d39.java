package com.stripe.android.financialconnections;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public abstract class FinancialConnectionsSheetResult implements Parcelable {

    /* loaded from: classes2.dex */
    public static final class Canceled extends FinancialConnectionsSheetResult {
        public static final Canceled INSTANCE = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return Canceled.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i11) {
                return new Canceled[i11];
            }
        }

        private Canceled() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Completed extends FinancialConnectionsSheetResult {
        public static final Parcelable.Creator<Completed> CREATOR = new Creator();
        private final FinancialConnectionsSession financialConnectionsSession;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Completed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Completed createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Completed(FinancialConnectionsSession.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Completed[] newArray(int i11) {
                return new Completed[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(FinancialConnectionsSession financialConnectionsSession) {
            super(null);
            s.g(financialConnectionsSession, "financialConnectionsSession");
            this.financialConnectionsSession = financialConnectionsSession;
        }

        public static /* synthetic */ Completed copy$default(Completed completed, FinancialConnectionsSession financialConnectionsSession, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                financialConnectionsSession = completed.financialConnectionsSession;
            }
            return completed.copy(financialConnectionsSession);
        }

        public final FinancialConnectionsSession component1() {
            return this.financialConnectionsSession;
        }

        public final Completed copy(FinancialConnectionsSession financialConnectionsSession) {
            s.g(financialConnectionsSession, "financialConnectionsSession");
            return new Completed(financialConnectionsSession);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Completed) && s.c(this.financialConnectionsSession, ((Completed) obj).financialConnectionsSession);
        }

        public final FinancialConnectionsSession getFinancialConnectionsSession() {
            return this.financialConnectionsSession;
        }

        public int hashCode() {
            return this.financialConnectionsSession.hashCode();
        }

        public String toString() {
            return "Completed(financialConnectionsSession=" + this.financialConnectionsSession + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            this.financialConnectionsSession.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Failed extends FinancialConnectionsSheetResult {
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();
        private final Throwable error;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Failed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Failed((Throwable) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i11) {
                return new Failed[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(Throwable error) {
            super(null);
            s.g(error, "error");
            this.error = error;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = failed.error;
            }
            return failed.copy(th2);
        }

        public final Throwable component1() {
            return this.error;
        }

        public final Failed copy(Throwable error) {
            s.g(error, "error");
            return new Failed(error);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && s.c(this.error, ((Failed) obj).error);
        }

        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.error + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeSerializable(this.error);
        }
    }

    private FinancialConnectionsSheetResult() {
    }

    public /* synthetic */ FinancialConnectionsSheetResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}