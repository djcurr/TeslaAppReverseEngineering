package com.stripe.android.payments.paymentlauncher;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;

/* loaded from: classes6.dex */
public abstract class PaymentResult implements Parcelable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA = "extra_args";

    /* loaded from: classes6.dex */
    public static final class Canceled extends PaymentResult {
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
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PaymentResult fromIntent(Intent intent) {
            PaymentResult paymentResult = intent == null ? null : (PaymentResult) intent.getParcelableExtra(PaymentResult.EXTRA);
            return paymentResult == null ? new Failed(new IllegalStateException("Failed to get PaymentResult from Intent")) : paymentResult;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Completed extends PaymentResult {
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
    public static final class Failed extends PaymentResult {
        private final Throwable throwable;
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
        public Failed(Throwable throwable) {
            super(null);
            s.g(throwable, "throwable");
            this.throwable = throwable;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeSerializable(this.throwable);
        }
    }

    private PaymentResult() {
    }

    public /* synthetic */ PaymentResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final /* synthetic */ Bundle toBundle() {
        return r3.b.a(v.a(EXTRA, this));
    }
}