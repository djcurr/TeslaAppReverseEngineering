package com.stripe.android.paymentsheet.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class SavedSelection implements Parcelable {

    /* loaded from: classes6.dex */
    public static final class GooglePay extends SavedSelection {
        public static final GooglePay INSTANCE = new GooglePay();
        public static final Parcelable.Creator<GooglePay> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<GooglePay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePay createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return GooglePay.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePay[] newArray(int i11) {
                return new GooglePay[i11];
            }
        }

        private GooglePay() {
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
    public static final class None extends SavedSelection {
        public static final None INSTANCE = new None();
        public static final Parcelable.Creator<None> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<None> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return None.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None[] newArray(int i11) {
                return new None[i11];
            }
        }

        private None() {
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
    public static final class PaymentMethod extends SavedSelection {

        /* renamed from: id  reason: collision with root package name */
        private final String f20983id;
        public static final Parcelable.Creator<PaymentMethod> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<PaymentMethod> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethod createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new PaymentMethod(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethod[] newArray(int i11) {
                return new PaymentMethod[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentMethod(String id2) {
            super(null);
            s.g(id2, "id");
            this.f20983id = id2;
        }

        public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = paymentMethod.f20983id;
            }
            return paymentMethod.copy(str);
        }

        public final String component1() {
            return this.f20983id;
        }

        public final PaymentMethod copy(String id2) {
            s.g(id2, "id");
            return new PaymentMethod(id2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentMethod) && s.c(this.f20983id, ((PaymentMethod) obj).f20983id);
        }

        public final String getId() {
            return this.f20983id;
        }

        public int hashCode() {
            return this.f20983id.hashCode();
        }

        public String toString() {
            return "PaymentMethod(id=" + this.f20983id + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.f20983id);
        }
    }

    private SavedSelection() {
    }

    public /* synthetic */ SavedSelection(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}