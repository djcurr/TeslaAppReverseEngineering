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
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PaymentMethodsActivityStarter extends ActivityStarter<PaymentMethodsActivity, Args> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int REQUEST_CODE = 6000;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivityStarter(Activity activity) {
        super(activity, PaymentMethodsActivity.class, 6000, (Integer) null, 8, (DefaultConstructorMarker) null);
        kotlin.jvm.internal.s.g(activity, "activity");
    }

    /* loaded from: classes6.dex */
    public static final class Result implements ActivityStarter.Result {
        public final PaymentMethod paymentMethod;
        private final boolean useGooglePay;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Result fromIntent(Intent intent) {
                if (intent == null) {
                    return null;
                }
                return (Result) intent.getParcelableExtra("extra_activity_result");
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new Result(parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i11) {
                return new Result[i11];
            }
        }

        public Result() {
            this(null, false, 3, null);
        }

        public Result(PaymentMethod paymentMethod, boolean z11) {
            this.paymentMethod = paymentMethod;
            this.useGooglePay = z11;
        }

        public static /* synthetic */ Result copy$default(Result result, PaymentMethod paymentMethod, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paymentMethod = result.paymentMethod;
            }
            if ((i11 & 2) != 0) {
                z11 = result.useGooglePay;
            }
            return result.copy(paymentMethod, z11);
        }

        public static final Result fromIntent(Intent intent) {
            return Companion.fromIntent(intent);
        }

        public final PaymentMethod component1() {
            return this.paymentMethod;
        }

        public final boolean component2() {
            return this.useGooglePay;
        }

        public final Result copy(PaymentMethod paymentMethod, boolean z11) {
            return new Result(paymentMethod, z11);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Result) {
                Result result = (Result) obj;
                return kotlin.jvm.internal.s.c(this.paymentMethod, result.paymentMethod) && this.useGooglePay == result.useGooglePay;
            }
            return false;
        }

        public final boolean getUseGooglePay() {
            return this.useGooglePay;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            PaymentMethod paymentMethod = this.paymentMethod;
            int hashCode = (paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31;
            boolean z11 = this.useGooglePay;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode + i11;
        }

        @Override // com.stripe.android.view.ActivityStarter.Result
        public Bundle toBundle() {
            return r3.b.a(vz.v.a("extra_activity_result", this));
        }

        public String toString() {
            return "Result(paymentMethod=" + this.paymentMethod + ", useGooglePay=" + this.useGooglePay + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            PaymentMethod paymentMethod = this.paymentMethod;
            if (paymentMethod == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                paymentMethod.writeToParcel(out, i11);
            }
            out.writeInt(this.useGooglePay ? 1 : 0);
        }

        public /* synthetic */ Result(PaymentMethod paymentMethod, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : paymentMethod, (i11 & 2) != 0 ? false : z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivityStarter(Fragment fragment) {
        super(fragment, PaymentMethodsActivity.class, 6000, (Integer) null, 8, (DefaultConstructorMarker) null);
        kotlin.jvm.internal.s.g(fragment, "fragment");
    }

    /* loaded from: classes6.dex */
    public static final class Args implements ActivityStarter.Args {
        private final int addPaymentMethodFooterLayoutId;
        private final BillingAddressFields billingAddressFields;
        private final boolean canDeletePaymentMethods;
        private final String initialPaymentMethodId;
        private final boolean isPaymentSessionActive;
        private final PaymentConfiguration paymentConfiguration;
        private final List<PaymentMethod.Type> paymentMethodTypes;
        private final int paymentMethodsFooterLayoutId;
        private final boolean shouldShowGooglePay;
        private final boolean useGooglePay;
        private final Integer windowFlags;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Builder implements ObjectBuilder<Args> {
            public static final int $stable = 8;
            private int addPaymentMethodFooterLayoutId;
            private BillingAddressFields billingAddressFields = BillingAddressFields.PostalCode;
            private boolean canDeletePaymentMethods = true;
            private String initialPaymentMethodId;
            private boolean isPaymentSessionActive;
            private PaymentConfiguration paymentConfiguration;
            private List<? extends PaymentMethod.Type> paymentMethodTypes;
            private int paymentMethodsFooterLayoutId;
            private boolean shouldShowGooglePay;
            private boolean useGooglePay;
            private Integer windowFlags;

            public final Builder setAddPaymentMethodFooter(int i11) {
                this.addPaymentMethodFooterLayoutId = i11;
                return this;
            }

            public final Builder setBillingAddressFields(BillingAddressFields billingAddressFields) {
                kotlin.jvm.internal.s.g(billingAddressFields, "billingAddressFields");
                this.billingAddressFields = billingAddressFields;
                return this;
            }

            public final Builder setCanDeletePaymentMethods(boolean z11) {
                this.canDeletePaymentMethods = z11;
                return this;
            }

            public final Builder setInitialPaymentMethodId(String str) {
                this.initialPaymentMethodId = str;
                return this;
            }

            public final Builder setIsPaymentSessionActive(boolean z11) {
                this.isPaymentSessionActive = z11;
                return this;
            }

            public final Builder setPaymentConfiguration(PaymentConfiguration paymentConfiguration) {
                this.paymentConfiguration = paymentConfiguration;
                return this;
            }

            public final Builder setPaymentMethodTypes(List<? extends PaymentMethod.Type> paymentMethodTypes) {
                kotlin.jvm.internal.s.g(paymentMethodTypes, "paymentMethodTypes");
                this.paymentMethodTypes = paymentMethodTypes;
                return this;
            }

            public final Builder setPaymentMethodsFooter(int i11) {
                this.paymentMethodsFooterLayoutId = i11;
                return this;
            }

            public final Builder setShouldShowGooglePay(boolean z11) {
                this.shouldShowGooglePay = z11;
                return this;
            }

            public final Builder setUseGooglePay$payments_core_release(boolean z11) {
                this.useGooglePay = z11;
                return this;
            }

            public final Builder setWindowFlags(Integer num) {
                this.windowFlags = num;
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Args build() {
                String str = this.initialPaymentMethodId;
                boolean z11 = this.isPaymentSessionActive;
                List<? extends PaymentMethod.Type> list = this.paymentMethodTypes;
                if (list == null) {
                    list = wz.v.d(PaymentMethod.Type.Card);
                }
                boolean z12 = this.shouldShowGooglePay;
                boolean z13 = this.useGooglePay;
                PaymentConfiguration paymentConfiguration = this.paymentConfiguration;
                return new Args(str, this.paymentMethodsFooterLayoutId, this.addPaymentMethodFooterLayoutId, z11, list, paymentConfiguration, this.windowFlags, this.billingAddressFields, z12, z13, this.canDeletePaymentMethods);
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
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                boolean z11 = parcel.readInt() != 0;
                int readInt3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt3);
                for (int i11 = 0; i11 != readInt3; i11++) {
                    arrayList.add(PaymentMethod.Type.CREATOR.createFromParcel(parcel));
                }
                return new Args(readString, readInt, readInt2, z11, arrayList, parcel.readInt() == 0 ? null : PaymentConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, BillingAddressFields.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(String str, int i11, int i12, boolean z11, List<? extends PaymentMethod.Type> paymentMethodTypes, PaymentConfiguration paymentConfiguration, Integer num, BillingAddressFields billingAddressFields, boolean z12, boolean z13, boolean z14) {
            kotlin.jvm.internal.s.g(paymentMethodTypes, "paymentMethodTypes");
            kotlin.jvm.internal.s.g(billingAddressFields, "billingAddressFields");
            this.initialPaymentMethodId = str;
            this.paymentMethodsFooterLayoutId = i11;
            this.addPaymentMethodFooterLayoutId = i12;
            this.isPaymentSessionActive = z11;
            this.paymentMethodTypes = paymentMethodTypes;
            this.paymentConfiguration = paymentConfiguration;
            this.windowFlags = num;
            this.billingAddressFields = billingAddressFields;
            this.shouldShowGooglePay = z12;
            this.useGooglePay = z13;
            this.canDeletePaymentMethods = z14;
        }

        public final String component1$payments_core_release() {
            return this.initialPaymentMethodId;
        }

        public final boolean component10$payments_core_release() {
            return this.useGooglePay;
        }

        public final boolean component11$payments_core_release() {
            return this.canDeletePaymentMethods;
        }

        public final int component2() {
            return this.paymentMethodsFooterLayoutId;
        }

        public final int component3() {
            return this.addPaymentMethodFooterLayoutId;
        }

        public final boolean component4$payments_core_release() {
            return this.isPaymentSessionActive;
        }

        public final List<PaymentMethod.Type> component5$payments_core_release() {
            return this.paymentMethodTypes;
        }

        public final PaymentConfiguration component6$payments_core_release() {
            return this.paymentConfiguration;
        }

        public final Integer component7$payments_core_release() {
            return this.windowFlags;
        }

        public final BillingAddressFields component8$payments_core_release() {
            return this.billingAddressFields;
        }

        public final boolean component9$payments_core_release() {
            return this.shouldShowGooglePay;
        }

        public final Args copy(String str, int i11, int i12, boolean z11, List<? extends PaymentMethod.Type> paymentMethodTypes, PaymentConfiguration paymentConfiguration, Integer num, BillingAddressFields billingAddressFields, boolean z12, boolean z13, boolean z14) {
            kotlin.jvm.internal.s.g(paymentMethodTypes, "paymentMethodTypes");
            kotlin.jvm.internal.s.g(billingAddressFields, "billingAddressFields");
            return new Args(str, i11, i12, z11, paymentMethodTypes, paymentConfiguration, num, billingAddressFields, z12, z13, z14);
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
                return kotlin.jvm.internal.s.c(this.initialPaymentMethodId, args.initialPaymentMethodId) && this.paymentMethodsFooterLayoutId == args.paymentMethodsFooterLayoutId && this.addPaymentMethodFooterLayoutId == args.addPaymentMethodFooterLayoutId && this.isPaymentSessionActive == args.isPaymentSessionActive && kotlin.jvm.internal.s.c(this.paymentMethodTypes, args.paymentMethodTypes) && kotlin.jvm.internal.s.c(this.paymentConfiguration, args.paymentConfiguration) && kotlin.jvm.internal.s.c(this.windowFlags, args.windowFlags) && this.billingAddressFields == args.billingAddressFields && this.shouldShowGooglePay == args.shouldShowGooglePay && this.useGooglePay == args.useGooglePay && this.canDeletePaymentMethods == args.canDeletePaymentMethods;
            }
            return false;
        }

        public final int getAddPaymentMethodFooterLayoutId() {
            return this.addPaymentMethodFooterLayoutId;
        }

        public final BillingAddressFields getBillingAddressFields$payments_core_release() {
            return this.billingAddressFields;
        }

        public final boolean getCanDeletePaymentMethods$payments_core_release() {
            return this.canDeletePaymentMethods;
        }

        public final String getInitialPaymentMethodId$payments_core_release() {
            return this.initialPaymentMethodId;
        }

        public final PaymentConfiguration getPaymentConfiguration$payments_core_release() {
            return this.paymentConfiguration;
        }

        public final List<PaymentMethod.Type> getPaymentMethodTypes$payments_core_release() {
            return this.paymentMethodTypes;
        }

        public final int getPaymentMethodsFooterLayoutId() {
            return this.paymentMethodsFooterLayoutId;
        }

        public final boolean getShouldShowGooglePay$payments_core_release() {
            return this.shouldShowGooglePay;
        }

        public final boolean getUseGooglePay$payments_core_release() {
            return this.useGooglePay;
        }

        public final Integer getWindowFlags$payments_core_release() {
            return this.windowFlags;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.initialPaymentMethodId;
            int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.paymentMethodsFooterLayoutId)) * 31) + Integer.hashCode(this.addPaymentMethodFooterLayoutId)) * 31;
            boolean z11 = this.isPaymentSessionActive;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int hashCode2 = (((hashCode + i11) * 31) + this.paymentMethodTypes.hashCode()) * 31;
            PaymentConfiguration paymentConfiguration = this.paymentConfiguration;
            int hashCode3 = (hashCode2 + (paymentConfiguration == null ? 0 : paymentConfiguration.hashCode())) * 31;
            Integer num = this.windowFlags;
            int hashCode4 = (((hashCode3 + (num != null ? num.hashCode() : 0)) * 31) + this.billingAddressFields.hashCode()) * 31;
            boolean z12 = this.shouldShowGooglePay;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            int i13 = (hashCode4 + i12) * 31;
            boolean z13 = this.useGooglePay;
            int i14 = z13;
            if (z13 != 0) {
                i14 = 1;
            }
            int i15 = (i13 + i14) * 31;
            boolean z14 = this.canDeletePaymentMethods;
            return i15 + (z14 ? 1 : z14 ? 1 : 0);
        }

        public final boolean isPaymentSessionActive$payments_core_release() {
            return this.isPaymentSessionActive;
        }

        public String toString() {
            return "Args(initialPaymentMethodId=" + ((Object) this.initialPaymentMethodId) + ", paymentMethodsFooterLayoutId=" + this.paymentMethodsFooterLayoutId + ", addPaymentMethodFooterLayoutId=" + this.addPaymentMethodFooterLayoutId + ", isPaymentSessionActive=" + this.isPaymentSessionActive + ", paymentMethodTypes=" + this.paymentMethodTypes + ", paymentConfiguration=" + this.paymentConfiguration + ", windowFlags=" + this.windowFlags + ", billingAddressFields=" + this.billingAddressFields + ", shouldShowGooglePay=" + this.shouldShowGooglePay + ", useGooglePay=" + this.useGooglePay + ", canDeletePaymentMethods=" + this.canDeletePaymentMethods + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.initialPaymentMethodId);
            out.writeInt(this.paymentMethodsFooterLayoutId);
            out.writeInt(this.addPaymentMethodFooterLayoutId);
            out.writeInt(this.isPaymentSessionActive ? 1 : 0);
            List<PaymentMethod.Type> list = this.paymentMethodTypes;
            out.writeInt(list.size());
            for (PaymentMethod.Type type : list) {
                type.writeToParcel(out, i11);
            }
            PaymentConfiguration paymentConfiguration = this.paymentConfiguration;
            if (paymentConfiguration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                paymentConfiguration.writeToParcel(out, i11);
            }
            Integer num = this.windowFlags;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.billingAddressFields.name());
            out.writeInt(this.shouldShowGooglePay ? 1 : 0);
            out.writeInt(this.useGooglePay ? 1 : 0);
            out.writeInt(this.canDeletePaymentMethods ? 1 : 0);
        }

        public /* synthetic */ Args(String str, int i11, int i12, boolean z11, List list, PaymentConfiguration paymentConfiguration, Integer num, BillingAddressFields billingAddressFields, boolean z12, boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11, i12, z11, list, paymentConfiguration, (i13 & 64) != 0 ? null : num, billingAddressFields, (i13 & 256) != 0 ? false : z12, (i13 & 512) != 0 ? false : z13, (i13 & 1024) != 0 ? true : z14);
        }
    }
}