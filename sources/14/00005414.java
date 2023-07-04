package com.stripe.android.payments.core.authentication.threeds2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;

/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionContract extends f.a<Args, PaymentFlowResult.Unvalidated> {

    /* loaded from: classes6.dex */
    public static final class Args implements Parcelable {
        private static final String EXTRA_ARGS = "extra_args";
        private final PaymentAuthConfig.Stripe3ds2Config config;
        private final boolean enableLogging;
        private final String injectorKey;
        private final StripeIntent.NextActionData.SdkData.Use3DS2 nextActionData;
        private final Set<String> productUsage;
        private final String publishableKey;
        private final ApiRequest.Options requestOptions;
        private final SdkTransactionId sdkTransactionId;
        private final Integer statusBarColor;
        private final StripeIntent stripeIntent;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Args fromIntent(Intent intent) {
                s.g(intent, "intent");
                return (Args) intent.getParcelableExtra(Args.EXTRA_ARGS);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                SdkTransactionId sdkTransactionId = (SdkTransactionId) parcel.readParcelable(Args.class.getClassLoader());
                PaymentAuthConfig.Stripe3ds2Config createFromParcel = PaymentAuthConfig.Stripe3ds2Config.CREATOR.createFromParcel(parcel);
                StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(Args.class.getClassLoader());
                StripeIntent.NextActionData.SdkData.Use3DS2 createFromParcel2 = StripeIntent.NextActionData.SdkData.Use3DS2.CREATOR.createFromParcel(parcel);
                ApiRequest.Options options = (ApiRequest.Options) parcel.readParcelable(Args.class.getClassLoader());
                boolean z11 = parcel.readInt() != 0;
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new Args(sdkTransactionId, createFromParcel, stripeIntent, createFromParcel2, options, z11, valueOf, readString, readString2, linkedHashSet);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        public Args(SdkTransactionId sdkTransactionId, PaymentAuthConfig.Stripe3ds2Config config, StripeIntent stripeIntent, StripeIntent.NextActionData.SdkData.Use3DS2 nextActionData, ApiRequest.Options requestOptions, boolean z11, Integer num, @InjectorKey String injectorKey, String publishableKey, Set<String> productUsage) {
            s.g(sdkTransactionId, "sdkTransactionId");
            s.g(config, "config");
            s.g(stripeIntent, "stripeIntent");
            s.g(nextActionData, "nextActionData");
            s.g(requestOptions, "requestOptions");
            s.g(injectorKey, "injectorKey");
            s.g(publishableKey, "publishableKey");
            s.g(productUsage, "productUsage");
            this.sdkTransactionId = sdkTransactionId;
            this.config = config;
            this.stripeIntent = stripeIntent;
            this.nextActionData = nextActionData;
            this.requestOptions = requestOptions;
            this.enableLogging = z11;
            this.statusBarColor = num;
            this.injectorKey = injectorKey;
            this.publishableKey = publishableKey;
            this.productUsage = productUsage;
        }

        public final SdkTransactionId component1() {
            return this.sdkTransactionId;
        }

        public final Set<String> component10() {
            return this.productUsage;
        }

        public final PaymentAuthConfig.Stripe3ds2Config component2() {
            return this.config;
        }

        public final StripeIntent component3() {
            return this.stripeIntent;
        }

        public final StripeIntent.NextActionData.SdkData.Use3DS2 component4() {
            return this.nextActionData;
        }

        public final ApiRequest.Options component5() {
            return this.requestOptions;
        }

        public final boolean component6() {
            return this.enableLogging;
        }

        public final Integer component7() {
            return this.statusBarColor;
        }

        public final String component8() {
            return this.injectorKey;
        }

        public final String component9() {
            return this.publishableKey;
        }

        public final Args copy(SdkTransactionId sdkTransactionId, PaymentAuthConfig.Stripe3ds2Config config, StripeIntent stripeIntent, StripeIntent.NextActionData.SdkData.Use3DS2 nextActionData, ApiRequest.Options requestOptions, boolean z11, Integer num, @InjectorKey String injectorKey, String publishableKey, Set<String> productUsage) {
            s.g(sdkTransactionId, "sdkTransactionId");
            s.g(config, "config");
            s.g(stripeIntent, "stripeIntent");
            s.g(nextActionData, "nextActionData");
            s.g(requestOptions, "requestOptions");
            s.g(injectorKey, "injectorKey");
            s.g(publishableKey, "publishableKey");
            s.g(productUsage, "productUsage");
            return new Args(sdkTransactionId, config, stripeIntent, nextActionData, requestOptions, z11, num, injectorKey, publishableKey, productUsage);
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
                return s.c(this.sdkTransactionId, args.sdkTransactionId) && s.c(this.config, args.config) && s.c(this.stripeIntent, args.stripeIntent) && s.c(this.nextActionData, args.nextActionData) && s.c(this.requestOptions, args.requestOptions) && this.enableLogging == args.enableLogging && s.c(this.statusBarColor, args.statusBarColor) && s.c(this.injectorKey, args.injectorKey) && s.c(this.publishableKey, args.publishableKey) && s.c(this.productUsage, args.productUsage);
            }
            return false;
        }

        public final PaymentAuthConfig.Stripe3ds2Config getConfig() {
            return this.config;
        }

        public final boolean getEnableLogging() {
            return this.enableLogging;
        }

        public final Stripe3ds2Fingerprint getFingerprint() {
            return new Stripe3ds2Fingerprint(this.nextActionData);
        }

        public final String getInjectorKey() {
            return this.injectorKey;
        }

        public final StripeIntent.NextActionData.SdkData.Use3DS2 getNextActionData() {
            return this.nextActionData;
        }

        public final Set<String> getProductUsage() {
            return this.productUsage;
        }

        public final String getPublishableKey() {
            return this.publishableKey;
        }

        public final ApiRequest.Options getRequestOptions() {
            return this.requestOptions;
        }

        public final SdkTransactionId getSdkTransactionId() {
            return this.sdkTransactionId;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public final StripeIntent getStripeIntent() {
            return this.stripeIntent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((((((this.sdkTransactionId.hashCode() * 31) + this.config.hashCode()) * 31) + this.stripeIntent.hashCode()) * 31) + this.nextActionData.hashCode()) * 31) + this.requestOptions.hashCode()) * 31;
            boolean z11 = this.enableLogging;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode + i11) * 31;
            Integer num = this.statusBarColor;
            return ((((((i12 + (num == null ? 0 : num.hashCode())) * 31) + this.injectorKey.hashCode()) * 31) + this.publishableKey.hashCode()) * 31) + this.productUsage.hashCode();
        }

        public final Bundle toBundle() {
            return r3.b.a(v.a(EXTRA_ARGS, this));
        }

        public String toString() {
            return "Args(sdkTransactionId=" + this.sdkTransactionId + ", config=" + this.config + ", stripeIntent=" + this.stripeIntent + ", nextActionData=" + this.nextActionData + ", requestOptions=" + this.requestOptions + ", enableLogging=" + this.enableLogging + ", statusBarColor=" + this.statusBarColor + ", injectorKey=" + this.injectorKey + ", publishableKey=" + this.publishableKey + ", productUsage=" + this.productUsage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            int intValue;
            s.g(out, "out");
            out.writeParcelable(this.sdkTransactionId, i11);
            this.config.writeToParcel(out, i11);
            out.writeParcelable(this.stripeIntent, i11);
            this.nextActionData.writeToParcel(out, i11);
            out.writeParcelable(this.requestOptions, i11);
            out.writeInt(this.enableLogging ? 1 : 0);
            Integer num = this.statusBarColor;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeString(this.injectorKey);
            out.writeString(this.publishableKey);
            Set<String> set = this.productUsage;
            out.writeInt(set.size());
            for (String str : set) {
                out.writeString(str);
            }
        }
    }

    @Override // f.a
    public Intent createIntent(Context context, Args input) {
        s.g(context, "context");
        s.g(input, "input");
        Intent putExtras = new Intent(context, Stripe3ds2TransactionActivity.class).putExtras(input.toBundle());
        s.f(putExtras, "Intent(context, Stripe3d…tExtras(input.toBundle())");
        return putExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // f.a
    public PaymentFlowResult.Unvalidated parseResult(int i11, Intent intent) {
        return PaymentFlowResult.Unvalidated.Companion.fromIntent(intent);
    }
}