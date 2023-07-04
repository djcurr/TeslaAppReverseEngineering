package com.stripe.android.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.PaymentSessionData;
import com.stripe.android.view.ActivityStarter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PaymentFlowActivityStarter extends ActivityStarter<PaymentFlowActivity, Args> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int REQUEST_CODE = 6002;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivityStarter(Activity activity, PaymentSessionConfig config) {
        super(activity, PaymentFlowActivity.class, (int) REQUEST_CODE, (Integer) null, 8, (DefaultConstructorMarker) null);
        kotlin.jvm.internal.s.g(activity, "activity");
        kotlin.jvm.internal.s.g(config, "config");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivityStarter(Fragment fragment, PaymentSessionConfig config) {
        super(fragment, PaymentFlowActivity.class, (int) REQUEST_CODE, (Integer) null, 8, (DefaultConstructorMarker) null);
        kotlin.jvm.internal.s.g(fragment, "fragment");
        kotlin.jvm.internal.s.g(config, "config");
    }

    /* loaded from: classes6.dex */
    public static final class Args implements ActivityStarter.Args {
        private final boolean isPaymentSessionActive;
        private final PaymentSessionConfig paymentSessionConfig;
        private final PaymentSessionData paymentSessionData;
        private final Integer windowFlags;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Builder implements ObjectBuilder<Args> {
            public static final int $stable = 8;
            private boolean isPaymentSessionActive;
            private PaymentSessionConfig paymentSessionConfig;
            private PaymentSessionData paymentSessionData;
            private Integer windowFlags;

            public final Builder setIsPaymentSessionActive(boolean z11) {
                this.isPaymentSessionActive = z11;
                return this;
            }

            public final Builder setPaymentSessionConfig(PaymentSessionConfig paymentSessionConfig) {
                this.paymentSessionConfig = paymentSessionConfig;
                return this;
            }

            public final Builder setPaymentSessionData(PaymentSessionData paymentSessionData) {
                this.paymentSessionData = paymentSessionData;
                return this;
            }

            public final Builder setWindowFlags(Integer num) {
                this.windowFlags = num;
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Args build() {
                PaymentSessionConfig paymentSessionConfig = this.paymentSessionConfig;
                if (paymentSessionConfig != null) {
                    PaymentSessionData paymentSessionData = this.paymentSessionData;
                    if (paymentSessionData != null) {
                        return new Args(paymentSessionConfig, paymentSessionData, this.isPaymentSessionActive, this.windowFlags);
                    }
                    throw new IllegalArgumentException("PaymentFlowActivity launched without PaymentSessionData".toString());
                }
                throw new IllegalArgumentException("PaymentFlowActivity launched without PaymentSessionConfig".toString());
            }
        }

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Args create(Intent intent) {
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
                return new Args(PaymentSessionConfig.CREATOR.createFromParcel(parcel), PaymentSessionData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        public Args(PaymentSessionConfig paymentSessionConfig, PaymentSessionData paymentSessionData, boolean z11, Integer num) {
            kotlin.jvm.internal.s.g(paymentSessionConfig, "paymentSessionConfig");
            kotlin.jvm.internal.s.g(paymentSessionData, "paymentSessionData");
            this.paymentSessionConfig = paymentSessionConfig;
            this.paymentSessionData = paymentSessionData;
            this.isPaymentSessionActive = z11;
            this.windowFlags = num;
        }

        public static /* synthetic */ Args copy$default(Args args, PaymentSessionConfig paymentSessionConfig, PaymentSessionData paymentSessionData, boolean z11, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paymentSessionConfig = args.paymentSessionConfig;
            }
            if ((i11 & 2) != 0) {
                paymentSessionData = args.paymentSessionData;
            }
            if ((i11 & 4) != 0) {
                z11 = args.isPaymentSessionActive;
            }
            if ((i11 & 8) != 0) {
                num = args.windowFlags;
            }
            return args.copy(paymentSessionConfig, paymentSessionData, z11, num);
        }

        public static final Args create(Intent intent) {
            return Companion.create(intent);
        }

        public final PaymentSessionConfig component1$payments_core_release() {
            return this.paymentSessionConfig;
        }

        public final PaymentSessionData component2$payments_core_release() {
            return this.paymentSessionData;
        }

        public final boolean component3$payments_core_release() {
            return this.isPaymentSessionActive;
        }

        public final Integer component4$payments_core_release() {
            return this.windowFlags;
        }

        public final Args copy(PaymentSessionConfig paymentSessionConfig, PaymentSessionData paymentSessionData, boolean z11, Integer num) {
            kotlin.jvm.internal.s.g(paymentSessionConfig, "paymentSessionConfig");
            kotlin.jvm.internal.s.g(paymentSessionData, "paymentSessionData");
            return new Args(paymentSessionConfig, paymentSessionData, z11, num);
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
                return kotlin.jvm.internal.s.c(this.paymentSessionConfig, args.paymentSessionConfig) && kotlin.jvm.internal.s.c(this.paymentSessionData, args.paymentSessionData) && this.isPaymentSessionActive == args.isPaymentSessionActive && kotlin.jvm.internal.s.c(this.windowFlags, args.windowFlags);
            }
            return false;
        }

        public final PaymentSessionConfig getPaymentSessionConfig$payments_core_release() {
            return this.paymentSessionConfig;
        }

        public final PaymentSessionData getPaymentSessionData$payments_core_release() {
            return this.paymentSessionData;
        }

        public final Integer getWindowFlags$payments_core_release() {
            return this.windowFlags;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.paymentSessionConfig.hashCode() * 31) + this.paymentSessionData.hashCode()) * 31;
            boolean z11 = this.isPaymentSessionActive;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode + i11) * 31;
            Integer num = this.windowFlags;
            return i12 + (num == null ? 0 : num.hashCode());
        }

        public final boolean isPaymentSessionActive$payments_core_release() {
            return this.isPaymentSessionActive;
        }

        public String toString() {
            return "Args(paymentSessionConfig=" + this.paymentSessionConfig + ", paymentSessionData=" + this.paymentSessionData + ", isPaymentSessionActive=" + this.isPaymentSessionActive + ", windowFlags=" + this.windowFlags + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            int intValue;
            kotlin.jvm.internal.s.g(out, "out");
            this.paymentSessionConfig.writeToParcel(out, i11);
            this.paymentSessionData.writeToParcel(out, i11);
            out.writeInt(this.isPaymentSessionActive ? 1 : 0);
            Integer num = this.windowFlags;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
        }

        public /* synthetic */ Args(PaymentSessionConfig paymentSessionConfig, PaymentSessionData paymentSessionData, boolean z11, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentSessionConfig, paymentSessionData, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : num);
        }
    }
}