package com.stripe.android.googlepaylauncher;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b30.a;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.api.Status;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.view.ActivityStarter;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;

/* loaded from: classes6.dex */
public abstract class GooglePayLauncherResult implements ActivityStarter.Result {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes6.dex */
    public static final class Canceled extends GooglePayLauncherResult {
        public static final Canceled INSTANCE = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();

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

        public final GooglePayLauncherResult fromIntent(Intent intent) {
            GooglePayLauncherResult googlePayLauncherResult = intent == null ? null : (GooglePayLauncherResult) intent.getParcelableExtra("extra_activity_result");
            return googlePayLauncherResult == null ? new Error(new IllegalStateException("Error while processing result from Google Pay."), null, null, null, 14, null) : googlePayLauncherResult;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Error extends GooglePayLauncherResult {
        private final Throwable exception;
        private final Status googlePayStatus;
        private final PaymentMethod paymentMethod;
        private final ShippingInformation shippingInformation;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Error> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        public static final class Companion implements b30.a<Error> {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: newArray */
            public Error[] m141newArray(int i11) {
                return (Error[]) a.C0144a.a(this, i11);
            }

            /* renamed from: create */
            public Error m140create(Parcel parcel) {
                s.g(parcel, "parcel");
                Serializable readSerializable = parcel.readSerializable();
                Objects.requireNonNull(readSerializable, "null cannot be cast to non-null type kotlin.Throwable");
                return new Error((Throwable) readSerializable, (Status) parcel.readParcelable(Status.class.getClassLoader()), null, null, 12, null);
            }

            public void write(Error error, Parcel parcel, int i11) {
                s.g(error, "<this>");
                s.g(parcel, "parcel");
                parcel.writeSerializable(error.getException());
                parcel.writeParcelable(error.getGooglePayStatus(), i11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return Error.Companion.m140create(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i11) {
                return new Error[i11];
            }
        }

        public /* synthetic */ Error(Throwable th2, Status status, PaymentMethod paymentMethod, ShippingInformation shippingInformation, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(th2, (i11 & 2) != 0 ? null : status, (i11 & 4) != 0 ? null : paymentMethod, (i11 & 8) != 0 ? null : shippingInformation);
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th2, Status status, PaymentMethod paymentMethod, ShippingInformation shippingInformation, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = error.exception;
            }
            if ((i11 & 2) != 0) {
                status = error.googlePayStatus;
            }
            if ((i11 & 4) != 0) {
                paymentMethod = error.paymentMethod;
            }
            if ((i11 & 8) != 0) {
                shippingInformation = error.shippingInformation;
            }
            return error.copy(th2, status, paymentMethod, shippingInformation);
        }

        public final Throwable component1() {
            return this.exception;
        }

        public final Status component2() {
            return this.googlePayStatus;
        }

        public final PaymentMethod component3() {
            return this.paymentMethod;
        }

        public final ShippingInformation component4() {
            return this.shippingInformation;
        }

        public final Error copy(Throwable exception, Status status, PaymentMethod paymentMethod, ShippingInformation shippingInformation) {
            s.g(exception, "exception");
            return new Error(exception, status, paymentMethod, shippingInformation);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Error) {
                Error error = (Error) obj;
                return s.c(this.exception, error.exception) && s.c(this.googlePayStatus, error.googlePayStatus) && s.c(this.paymentMethod, error.paymentMethod) && s.c(this.shippingInformation, error.shippingInformation);
            }
            return false;
        }

        public final Throwable getException() {
            return this.exception;
        }

        public final Status getGooglePayStatus() {
            return this.googlePayStatus;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final ShippingInformation getShippingInformation() {
            return this.shippingInformation;
        }

        public int hashCode() {
            int hashCode = this.exception.hashCode() * 31;
            Status status = this.googlePayStatus;
            int hashCode2 = (hashCode + (status == null ? 0 : status.hashCode())) * 31;
            PaymentMethod paymentMethod = this.paymentMethod;
            int hashCode3 = (hashCode2 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
            ShippingInformation shippingInformation = this.shippingInformation;
            return hashCode3 + (shippingInformation != null ? shippingInformation.hashCode() : 0);
        }

        public String toString() {
            return "Error(exception=" + this.exception + ", googlePayStatus=" + this.googlePayStatus + ", paymentMethod=" + this.paymentMethod + ", shippingInformation=" + this.shippingInformation + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            Companion.write(this, out, i11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable exception, Status status, PaymentMethod paymentMethod, ShippingInformation shippingInformation) {
            super(null);
            s.g(exception, "exception");
            this.exception = exception;
            this.googlePayStatus = status;
            this.paymentMethod = paymentMethod;
            this.shippingInformation = shippingInformation;
        }
    }

    /* loaded from: classes6.dex */
    public static final class PaymentData extends GooglePayLauncherResult {
        public static final Parcelable.Creator<PaymentData> CREATOR = new Creator();
        private final PaymentMethod paymentMethod;
        private final ShippingInformation shippingInformation;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<PaymentData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentData createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new PaymentData(PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ShippingInformation.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentData[] newArray(int i11) {
                return new PaymentData[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentData(PaymentMethod paymentMethod, ShippingInformation shippingInformation) {
            super(null);
            s.g(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
            this.shippingInformation = shippingInformation;
        }

        public static /* synthetic */ PaymentData copy$default(PaymentData paymentData, PaymentMethod paymentMethod, ShippingInformation shippingInformation, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paymentMethod = paymentData.paymentMethod;
            }
            if ((i11 & 2) != 0) {
                shippingInformation = paymentData.shippingInformation;
            }
            return paymentData.copy(paymentMethod, shippingInformation);
        }

        public final PaymentMethod component1() {
            return this.paymentMethod;
        }

        public final ShippingInformation component2() {
            return this.shippingInformation;
        }

        public final PaymentData copy(PaymentMethod paymentMethod, ShippingInformation shippingInformation) {
            s.g(paymentMethod, "paymentMethod");
            return new PaymentData(paymentMethod, shippingInformation);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PaymentData) {
                PaymentData paymentData = (PaymentData) obj;
                return s.c(this.paymentMethod, paymentData.paymentMethod) && s.c(this.shippingInformation, paymentData.shippingInformation);
            }
            return false;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final ShippingInformation getShippingInformation() {
            return this.shippingInformation;
        }

        public int hashCode() {
            int hashCode = this.paymentMethod.hashCode() * 31;
            ShippingInformation shippingInformation = this.shippingInformation;
            return hashCode + (shippingInformation == null ? 0 : shippingInformation.hashCode());
        }

        public String toString() {
            return "PaymentData(paymentMethod=" + this.paymentMethod + ", shippingInformation=" + this.shippingInformation + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            this.paymentMethod.writeToParcel(out, i11);
            ShippingInformation shippingInformation = this.shippingInformation;
            if (shippingInformation == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            shippingInformation.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Unavailable extends GooglePayLauncherResult {
        public static final Unavailable INSTANCE = new Unavailable();
        public static final Parcelable.Creator<Unavailable> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Unavailable> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unavailable createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return Unavailable.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unavailable[] newArray(int i11) {
                return new Unavailable[i11];
            }
        }

        private Unavailable() {
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

    private GooglePayLauncherResult() {
    }

    public /* synthetic */ GooglePayLauncherResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final GooglePayLauncherResult fromIntent(Intent intent) {
        return Companion.fromIntent(intent);
    }

    @Override // com.stripe.android.view.ActivityStarter.Result
    public Bundle toBundle() {
        return r3.b.a(v.a("extra_activity_result", this));
    }
}