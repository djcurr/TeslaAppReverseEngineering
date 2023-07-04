package com.stripe.android.link;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethodCreateParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class LinkActivityResult implements Parcelable {
    public static final int $stable = 0;
    private final int resultCode;

    /* loaded from: classes6.dex */
    public static final class Canceled extends LinkActivityResult {
        public static final Canceled INSTANCE = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
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
            super(0, null);
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

    /* loaded from: classes6.dex */
    public static final class Failed extends LinkActivityResult {
        private final Throwable error;
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
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
            super(0, null);
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

    /* loaded from: classes6.dex */
    public static abstract class Success extends LinkActivityResult {
        public static final int $stable = 0;

        /* loaded from: classes6.dex */
        public static final class Completed extends Success {
            public static final Completed INSTANCE = new Completed();
            public static final Parcelable.Creator<Completed> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Completed> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Completed createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return Completed.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Completed[] newArray(int i11) {
                    return new Completed[i11];
                }
            }

            private Completed() {
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

        /* loaded from: classes6.dex */
        public static final class Selected extends Success {
            private final LinkPaymentDetails paymentDetails;
            public static final Parcelable.Creator<Selected> CREATOR = new Creator();
            public static final int $stable = PaymentMethodCreateParams.$stable | ConsumerPaymentDetails.PaymentDetails.$stable;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Selected> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Selected createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new Selected(LinkPaymentDetails.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Selected[] newArray(int i11) {
                    return new Selected[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Selected(LinkPaymentDetails paymentDetails) {
                super(null);
                s.g(paymentDetails, "paymentDetails");
                this.paymentDetails = paymentDetails;
            }

            public static /* synthetic */ Selected copy$default(Selected selected, LinkPaymentDetails linkPaymentDetails, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    linkPaymentDetails = selected.paymentDetails;
                }
                return selected.copy(linkPaymentDetails);
            }

            public final LinkPaymentDetails component1() {
                return this.paymentDetails;
            }

            public final Selected copy(LinkPaymentDetails paymentDetails) {
                s.g(paymentDetails, "paymentDetails");
                return new Selected(paymentDetails);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Selected) && s.c(this.paymentDetails, ((Selected) obj).paymentDetails);
            }

            public final LinkPaymentDetails getPaymentDetails() {
                return this.paymentDetails;
            }

            public int hashCode() {
                return this.paymentDetails.hashCode();
            }

            public String toString() {
                return "Selected(paymentDetails=" + this.paymentDetails + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                this.paymentDetails.writeToParcel(out, i11);
            }
        }

        private Success() {
            super(-1, null);
        }

        public /* synthetic */ Success(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private LinkActivityResult(int i11) {
        this.resultCode = i11;
    }

    public /* synthetic */ LinkActivityResult(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    public final int getResultCode() {
        return this.resultCode;
    }
}