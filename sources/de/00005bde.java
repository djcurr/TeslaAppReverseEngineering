package com.stripe.android.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.ActivityStarter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class AddPaymentMethodActivityStarter extends ActivityStarter<AddPaymentMethodActivity, Args> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int REQUEST_CODE = 6001;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class Result implements ActivityStarter.Result {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);

        /* loaded from: classes6.dex */
        public static final class Canceled extends Result {
            public static final Canceled INSTANCE = new Canceled();
            public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Canceled> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Canceled createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.s.g(parcel, "parcel");
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
                kotlin.jvm.internal.s.g(out, "out");
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

            public final Result fromIntent(Intent intent) {
                Result result = intent == null ? null : (Result) intent.getParcelableExtra("extra_activity_result");
                return result == null ? Canceled.INSTANCE : result;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Failure extends Result {
            private final Throwable exception;
            public static final Parcelable.Creator<Failure> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Failure> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Failure createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.s.g(parcel, "parcel");
                    return new Failure((Throwable) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Failure[] newArray(int i11) {
                    return new Failure[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(Throwable exception) {
                super(null);
                kotlin.jvm.internal.s.g(exception, "exception");
                this.exception = exception;
            }

            public static /* synthetic */ Failure copy$default(Failure failure, Throwable th2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    th2 = failure.exception;
                }
                return failure.copy(th2);
            }

            public final Throwable component1() {
                return this.exception;
            }

            public final Failure copy(Throwable exception) {
                kotlin.jvm.internal.s.g(exception, "exception");
                return new Failure(exception);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failure) && kotlin.jvm.internal.s.c(this.exception, ((Failure) obj).exception);
            }

            public final Throwable getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "Failure(exception=" + this.exception + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                kotlin.jvm.internal.s.g(out, "out");
                out.writeSerializable(this.exception);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Success extends Result {
            private final PaymentMethod paymentMethod;
            public static final Parcelable.Creator<Success> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Success> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.s.g(parcel, "parcel");
                    return new Success(PaymentMethod.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success[] newArray(int i11) {
                    return new Success[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(PaymentMethod paymentMethod) {
                super(null);
                kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
                this.paymentMethod = paymentMethod;
            }

            public static /* synthetic */ Success copy$default(Success success, PaymentMethod paymentMethod, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    paymentMethod = success.paymentMethod;
                }
                return success.copy(paymentMethod);
            }

            public final PaymentMethod component1() {
                return this.paymentMethod;
            }

            public final Success copy(PaymentMethod paymentMethod) {
                kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
                return new Success(paymentMethod);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && kotlin.jvm.internal.s.c(this.paymentMethod, ((Success) obj).paymentMethod);
            }

            public final PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public int hashCode() {
                return this.paymentMethod.hashCode();
            }

            public String toString() {
                return "Success(paymentMethod=" + this.paymentMethod + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                kotlin.jvm.internal.s.g(out, "out");
                this.paymentMethod.writeToParcel(out, i11);
            }
        }

        private Result() {
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final Result fromIntent(Intent intent) {
            return Companion.fromIntent(intent);
        }

        @Override // com.stripe.android.view.ActivityStarter.Result
        public Bundle toBundle() {
            return r3.b.a(vz.v.a("extra_activity_result", this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivityStarter(Activity activity) {
        super(activity, AddPaymentMethodActivity.class, (int) REQUEST_CODE, (Integer) null, 8, (DefaultConstructorMarker) null);
        kotlin.jvm.internal.s.g(activity, "activity");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivityStarter(Fragment fragment) {
        super(fragment, AddPaymentMethodActivity.class, (int) REQUEST_CODE, (Integer) null, 8, (DefaultConstructorMarker) null);
        kotlin.jvm.internal.s.g(fragment, "fragment");
    }

    /* loaded from: classes6.dex */
    public static final class Args implements ActivityStarter.Args {
        public static final int $stable = 0;
        private final int addPaymentMethodFooterLayoutId;
        private final BillingAddressFields billingAddressFields;
        private final boolean isPaymentSessionActive;
        private final PaymentConfiguration paymentConfiguration;
        private final PaymentMethod.Type paymentMethodType;
        private final boolean shouldAttachToCustomer;
        private final Integer windowFlags;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        public static final class Builder implements ObjectBuilder<Args> {
            public static final int $stable = 8;
            private int addPaymentMethodFooterLayoutId;
            private boolean isPaymentSessionActive;
            private PaymentConfiguration paymentConfiguration;
            private boolean shouldAttachToCustomer;
            private Integer windowFlags;
            private BillingAddressFields billingAddressFields = BillingAddressFields.PostalCode;
            private PaymentMethod.Type paymentMethodType = PaymentMethod.Type.Card;

            public final Builder setAddPaymentMethodFooter(int i11) {
                this.addPaymentMethodFooterLayoutId = i11;
                return this;
            }

            public final Builder setBillingAddressFields(BillingAddressFields billingAddressFields) {
                kotlin.jvm.internal.s.g(billingAddressFields, "billingAddressFields");
                this.billingAddressFields = billingAddressFields;
                return this;
            }

            public final /* synthetic */ Builder setIsPaymentSessionActive$payments_core_release(boolean z11) {
                this.isPaymentSessionActive = z11;
                return this;
            }

            public final /* synthetic */ Builder setPaymentConfiguration(PaymentConfiguration paymentConfiguration) {
                this.paymentConfiguration = paymentConfiguration;
                return this;
            }

            public final Builder setPaymentMethodType(PaymentMethod.Type paymentMethodType) {
                kotlin.jvm.internal.s.g(paymentMethodType, "paymentMethodType");
                this.paymentMethodType = paymentMethodType;
                return this;
            }

            public final Builder setShouldAttachToCustomer(boolean z11) {
                this.shouldAttachToCustomer = z11;
                return this;
            }

            public final Builder setWindowFlags(Integer num) {
                this.windowFlags = num;
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Args build() {
                BillingAddressFields billingAddressFields = this.billingAddressFields;
                boolean z11 = this.shouldAttachToCustomer;
                boolean z12 = this.isPaymentSessionActive;
                PaymentMethod.Type type = this.paymentMethodType;
                if (type == null) {
                    type = PaymentMethod.Type.Card;
                }
                return new Args(billingAddressFields, z11, z12, type, this.paymentConfiguration, this.addPaymentMethodFooterLayoutId, this.windowFlags);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Args create$payments_core_release(Intent intent) {
                kotlin.jvm.internal.s.g(intent, "intent");
                Parcelable parcelableExtra = intent.getParcelableExtra("extra_activity_args");
                if (parcelableExtra != null) {
                    return (Args) parcelableExtra;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new Args(BillingAddressFields.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, PaymentMethod.Type.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PaymentConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        public Args(BillingAddressFields billingAddressFields, boolean z11, boolean z12, PaymentMethod.Type paymentMethodType, PaymentConfiguration paymentConfiguration, int i11, Integer num) {
            kotlin.jvm.internal.s.g(billingAddressFields, "billingAddressFields");
            kotlin.jvm.internal.s.g(paymentMethodType, "paymentMethodType");
            this.billingAddressFields = billingAddressFields;
            this.shouldAttachToCustomer = z11;
            this.isPaymentSessionActive = z12;
            this.paymentMethodType = paymentMethodType;
            this.paymentConfiguration = paymentConfiguration;
            this.addPaymentMethodFooterLayoutId = i11;
            this.windowFlags = num;
        }

        public static /* synthetic */ Args copy$default(Args args, BillingAddressFields billingAddressFields, boolean z11, boolean z12, PaymentMethod.Type type, PaymentConfiguration paymentConfiguration, int i11, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                billingAddressFields = args.billingAddressFields;
            }
            if ((i12 & 2) != 0) {
                z11 = args.shouldAttachToCustomer;
            }
            boolean z13 = z11;
            if ((i12 & 4) != 0) {
                z12 = args.isPaymentSessionActive;
            }
            boolean z14 = z12;
            if ((i12 & 8) != 0) {
                type = args.paymentMethodType;
            }
            PaymentMethod.Type type2 = type;
            if ((i12 & 16) != 0) {
                paymentConfiguration = args.paymentConfiguration;
            }
            PaymentConfiguration paymentConfiguration2 = paymentConfiguration;
            if ((i12 & 32) != 0) {
                i11 = args.addPaymentMethodFooterLayoutId;
            }
            int i13 = i11;
            if ((i12 & 64) != 0) {
                num = args.windowFlags;
            }
            return args.copy(billingAddressFields, z13, z14, type2, paymentConfiguration2, i13, num);
        }

        public final BillingAddressFields component1$payments_core_release() {
            return this.billingAddressFields;
        }

        public final boolean component2$payments_core_release() {
            return this.shouldAttachToCustomer;
        }

        public final boolean component3$payments_core_release() {
            return this.isPaymentSessionActive;
        }

        public final PaymentMethod.Type component4$payments_core_release() {
            return this.paymentMethodType;
        }

        public final PaymentConfiguration component5$payments_core_release() {
            return this.paymentConfiguration;
        }

        public final int component6$payments_core_release() {
            return this.addPaymentMethodFooterLayoutId;
        }

        public final Integer component7$payments_core_release() {
            return this.windowFlags;
        }

        public final Args copy(BillingAddressFields billingAddressFields, boolean z11, boolean z12, PaymentMethod.Type paymentMethodType, PaymentConfiguration paymentConfiguration, int i11, Integer num) {
            kotlin.jvm.internal.s.g(billingAddressFields, "billingAddressFields");
            kotlin.jvm.internal.s.g(paymentMethodType, "paymentMethodType");
            return new Args(billingAddressFields, z11, z12, paymentMethodType, paymentConfiguration, i11, num);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Args) {
                Args args = (Args) obj;
                return this.billingAddressFields == args.billingAddressFields && this.shouldAttachToCustomer == args.shouldAttachToCustomer && this.isPaymentSessionActive == args.isPaymentSessionActive && this.paymentMethodType == args.paymentMethodType && kotlin.jvm.internal.s.c(this.paymentConfiguration, args.paymentConfiguration) && this.addPaymentMethodFooterLayoutId == args.addPaymentMethodFooterLayoutId && kotlin.jvm.internal.s.c(this.windowFlags, args.windowFlags);
            }
            return false;
        }

        public final int getAddPaymentMethodFooterLayoutId$payments_core_release() {
            return this.addPaymentMethodFooterLayoutId;
        }

        public final BillingAddressFields getBillingAddressFields$payments_core_release() {
            return this.billingAddressFields;
        }

        public final PaymentConfiguration getPaymentConfiguration$payments_core_release() {
            return this.paymentConfiguration;
        }

        public final PaymentMethod.Type getPaymentMethodType$payments_core_release() {
            return this.paymentMethodType;
        }

        public final boolean getShouldAttachToCustomer$payments_core_release() {
            return this.shouldAttachToCustomer;
        }

        public final Integer getWindowFlags$payments_core_release() {
            return this.windowFlags;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.billingAddressFields.hashCode() * 31;
            boolean z11 = this.shouldAttachToCustomer;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode + i11) * 31;
            boolean z12 = this.isPaymentSessionActive;
            int hashCode2 = (((i12 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + this.paymentMethodType.hashCode()) * 31;
            PaymentConfiguration paymentConfiguration = this.paymentConfiguration;
            int hashCode3 = (((hashCode2 + (paymentConfiguration == null ? 0 : paymentConfiguration.hashCode())) * 31) + Integer.hashCode(this.addPaymentMethodFooterLayoutId)) * 31;
            Integer num = this.windowFlags;
            return hashCode3 + (num != null ? num.hashCode() : 0);
        }

        public final boolean isPaymentSessionActive$payments_core_release() {
            return this.isPaymentSessionActive;
        }

        public String toString() {
            return "Args(billingAddressFields=" + this.billingAddressFields + ", shouldAttachToCustomer=" + this.shouldAttachToCustomer + ", isPaymentSessionActive=" + this.isPaymentSessionActive + ", paymentMethodType=" + this.paymentMethodType + ", paymentConfiguration=" + this.paymentConfiguration + ", addPaymentMethodFooterLayoutId=" + this.addPaymentMethodFooterLayoutId + ", windowFlags=" + this.windowFlags + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.billingAddressFields.name());
            out.writeInt(this.shouldAttachToCustomer ? 1 : 0);
            out.writeInt(this.isPaymentSessionActive ? 1 : 0);
            this.paymentMethodType.writeToParcel(out, i11);
            PaymentConfiguration paymentConfiguration = this.paymentConfiguration;
            if (paymentConfiguration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                paymentConfiguration.writeToParcel(out, i11);
            }
            out.writeInt(this.addPaymentMethodFooterLayoutId);
            Integer num = this.windowFlags;
            if (num == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(num.intValue());
        }

        public /* synthetic */ Args(BillingAddressFields billingAddressFields, boolean z11, boolean z12, PaymentMethod.Type type, PaymentConfiguration paymentConfiguration, int i11, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(billingAddressFields, z11, z12, type, paymentConfiguration, i11, (i12 & 64) != 0 ? null : num);
        }
    }
}