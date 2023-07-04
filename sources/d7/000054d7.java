package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.view.ActivityStarter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PaymentOptionContract extends f.a<Args, PaymentOptionResult> {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_ARGS = "extra_activity_args";

    /* loaded from: classes6.dex */
    public static final class Args implements ActivityStarter.Args {
        private final PaymentSheet.Configuration config;
        private final boolean enableLogging;
        private final String injectorKey;
        private final boolean isGooglePayReady;
        private final PaymentSelection.New newLpm;
        private final List<PaymentMethod> paymentMethods;
        private final Set<String> productUsage;
        private final Integer statusBarColor;
        private final StripeIntent stripeIntent;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Args fromIntent$paymentsheet_release(Intent intent) {
                kotlin.jvm.internal.s.g(intent, "intent");
                return (Args) intent.getParcelableExtra("extra_activity_args");
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(Args.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                PaymentSheet.Configuration createFromParcel = parcel.readInt() == 0 ? null : PaymentSheet.Configuration.CREATOR.createFromParcel(parcel);
                boolean z11 = parcel.readInt() != 0;
                PaymentSelection.New r72 = (PaymentSelection.New) parcel.readParcelable(Args.class.getClassLoader());
                Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                String readString = parcel.readString();
                boolean z12 = parcel.readInt() != 0;
                int readInt2 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new Args(stripeIntent, arrayList, createFromParcel, z11, r72, valueOf, readString, z12, linkedHashSet);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        public Args(StripeIntent stripeIntent, List<PaymentMethod> paymentMethods, PaymentSheet.Configuration configuration, boolean z11, PaymentSelection.New r62, Integer num, @InjectorKey String injectorKey, boolean z12, Set<String> productUsage) {
            kotlin.jvm.internal.s.g(stripeIntent, "stripeIntent");
            kotlin.jvm.internal.s.g(paymentMethods, "paymentMethods");
            kotlin.jvm.internal.s.g(injectorKey, "injectorKey");
            kotlin.jvm.internal.s.g(productUsage, "productUsage");
            this.stripeIntent = stripeIntent;
            this.paymentMethods = paymentMethods;
            this.config = configuration;
            this.isGooglePayReady = z11;
            this.newLpm = r62;
            this.statusBarColor = num;
            this.injectorKey = injectorKey;
            this.enableLogging = z12;
            this.productUsage = productUsage;
        }

        public final StripeIntent component1() {
            return this.stripeIntent;
        }

        public final List<PaymentMethod> component2() {
            return this.paymentMethods;
        }

        public final PaymentSheet.Configuration component3() {
            return this.config;
        }

        public final boolean component4() {
            return this.isGooglePayReady;
        }

        public final PaymentSelection.New component5() {
            return this.newLpm;
        }

        public final Integer component6() {
            return this.statusBarColor;
        }

        public final String component7() {
            return this.injectorKey;
        }

        public final boolean component8() {
            return this.enableLogging;
        }

        public final Set<String> component9() {
            return this.productUsage;
        }

        public final Args copy(StripeIntent stripeIntent, List<PaymentMethod> paymentMethods, PaymentSheet.Configuration configuration, boolean z11, PaymentSelection.New r16, Integer num, @InjectorKey String injectorKey, boolean z12, Set<String> productUsage) {
            kotlin.jvm.internal.s.g(stripeIntent, "stripeIntent");
            kotlin.jvm.internal.s.g(paymentMethods, "paymentMethods");
            kotlin.jvm.internal.s.g(injectorKey, "injectorKey");
            kotlin.jvm.internal.s.g(productUsage, "productUsage");
            return new Args(stripeIntent, paymentMethods, configuration, z11, r16, num, injectorKey, z12, productUsage);
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
                return kotlin.jvm.internal.s.c(this.stripeIntent, args.stripeIntent) && kotlin.jvm.internal.s.c(this.paymentMethods, args.paymentMethods) && kotlin.jvm.internal.s.c(this.config, args.config) && this.isGooglePayReady == args.isGooglePayReady && kotlin.jvm.internal.s.c(this.newLpm, args.newLpm) && kotlin.jvm.internal.s.c(this.statusBarColor, args.statusBarColor) && kotlin.jvm.internal.s.c(this.injectorKey, args.injectorKey) && this.enableLogging == args.enableLogging && kotlin.jvm.internal.s.c(this.productUsage, args.productUsage);
            }
            return false;
        }

        public final PaymentSheet.Configuration getConfig() {
            return this.config;
        }

        public final boolean getEnableLogging() {
            return this.enableLogging;
        }

        public final String getInjectorKey() {
            return this.injectorKey;
        }

        public final PaymentSelection.New getNewLpm() {
            return this.newLpm;
        }

        public final List<PaymentMethod> getPaymentMethods() {
            return this.paymentMethods;
        }

        public final Set<String> getProductUsage() {
            return this.productUsage;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public final StripeIntent getStripeIntent() {
            return this.stripeIntent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.stripeIntent.hashCode() * 31) + this.paymentMethods.hashCode()) * 31;
            PaymentSheet.Configuration configuration = this.config;
            int hashCode2 = (hashCode + (configuration == null ? 0 : configuration.hashCode())) * 31;
            boolean z11 = this.isGooglePayReady;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode2 + i11) * 31;
            PaymentSelection.New r12 = this.newLpm;
            int hashCode3 = (i12 + (r12 == null ? 0 : r12.hashCode())) * 31;
            Integer num = this.statusBarColor;
            int hashCode4 = (((hashCode3 + (num != null ? num.hashCode() : 0)) * 31) + this.injectorKey.hashCode()) * 31;
            boolean z12 = this.enableLogging;
            return ((hashCode4 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + this.productUsage.hashCode();
        }

        public final boolean isGooglePayReady() {
            return this.isGooglePayReady;
        }

        public String toString() {
            return "Args(stripeIntent=" + this.stripeIntent + ", paymentMethods=" + this.paymentMethods + ", config=" + this.config + ", isGooglePayReady=" + this.isGooglePayReady + ", newLpm=" + this.newLpm + ", statusBarColor=" + this.statusBarColor + ", injectorKey=" + this.injectorKey + ", enableLogging=" + this.enableLogging + ", productUsage=" + this.productUsage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeParcelable(this.stripeIntent, i11);
            List<PaymentMethod> list = this.paymentMethods;
            out.writeInt(list.size());
            for (PaymentMethod paymentMethod : list) {
                out.writeParcelable(paymentMethod, i11);
            }
            PaymentSheet.Configuration configuration = this.config;
            if (configuration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                configuration.writeToParcel(out, i11);
            }
            out.writeInt(this.isGooglePayReady ? 1 : 0);
            out.writeParcelable(this.newLpm, i11);
            Integer num = this.statusBarColor;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.injectorKey);
            out.writeInt(this.enableLogging ? 1 : 0);
            Set<String> set = this.productUsage;
            out.writeInt(set.size());
            for (String str : set) {
                out.writeString(str);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // f.a
    public Intent createIntent(Context context, Args input) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(input, "input");
        Intent putExtra = new Intent(context, PaymentOptionsActivity.class).putExtra("extra_activity_args", input);
        kotlin.jvm.internal.s.f(putExtra, "Intent(context, PaymentO…tExtra(EXTRA_ARGS, input)");
        return putExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // f.a
    public PaymentOptionResult parseResult(int i11, Intent intent) {
        return PaymentOptionResult.Companion.fromIntent$paymentsheet_release(intent);
    }
}