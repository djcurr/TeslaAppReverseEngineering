package com.stripe.android.googlepaylauncher;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;

/* loaded from: classes6.dex */
public final class GooglePayPaymentMethodLauncherContract extends f.a<Args, GooglePayPaymentMethodLauncher.Result> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_RESULT = "extra_result";
    public static final String EXTRA_STATUS_BAR_COLOR = "extra_status_bar_color";

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
        Window window;
        s.g(context, "context");
        s.g(input, "input");
        Integer num = null;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null) {
            num = Integer.valueOf(window.getStatusBarColor());
        }
        Bundle bundle$payments_core_release = input.toBundle$payments_core_release();
        if (num != null) {
            bundle$payments_core_release.putInt("extra_status_bar_color", num.intValue());
        }
        Intent putExtras = new Intent(context, GooglePayPaymentMethodLauncherActivity.class).putExtras(bundle$payments_core_release);
        s.f(putExtras, "Intent(context, GooglePa…       .putExtras(extras)");
        return putExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // f.a
    public GooglePayPaymentMethodLauncher.Result parseResult(int i11, Intent intent) {
        GooglePayPaymentMethodLauncher.Result result = intent == null ? null : (GooglePayPaymentMethodLauncher.Result) intent.getParcelableExtra("extra_result");
        return result == null ? new GooglePayPaymentMethodLauncher.Result.Failed(new IllegalArgumentException("Could not parse a valid result."), 1) : result;
    }

    /* loaded from: classes6.dex */
    public static final class Args implements Parcelable {
        private static final String EXTRA_ARGS = "extra_args";
        private final int amount;
        private final GooglePayPaymentMethodLauncher.Config config;
        private final String currencyCode;
        private final InjectionParams injectionParams;
        private final String transactionId;
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
                return new Args(GooglePayPaymentMethodLauncher.Config.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : InjectionParams.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        /* loaded from: classes6.dex */
        public static final class InjectionParams implements Parcelable {
            public static final Parcelable.Creator<InjectionParams> CREATOR = new Creator();
            private final boolean enableLogging;
            private final String injectorKey;
            private final Set<String> productUsage;
            private final String publishableKey;
            private final String stripeAccountId;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<InjectionParams> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InjectionParams createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new InjectionParams(readString, linkedHashSet, parcel.readInt() != 0, parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InjectionParams[] newArray(int i11) {
                    return new InjectionParams[i11];
                }
            }

            public InjectionParams(@InjectorKey String injectorKey, Set<String> productUsage, boolean z11, String publishableKey, String str) {
                s.g(injectorKey, "injectorKey");
                s.g(productUsage, "productUsage");
                s.g(publishableKey, "publishableKey");
                this.injectorKey = injectorKey;
                this.productUsage = productUsage;
                this.enableLogging = z11;
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
            }

            public static /* synthetic */ InjectionParams copy$default(InjectionParams injectionParams, String str, Set set, boolean z11, String str2, String str3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = injectionParams.injectorKey;
                }
                Set<String> set2 = set;
                if ((i11 & 2) != 0) {
                    set2 = injectionParams.productUsage;
                }
                Set set3 = set2;
                if ((i11 & 4) != 0) {
                    z11 = injectionParams.enableLogging;
                }
                boolean z12 = z11;
                if ((i11 & 8) != 0) {
                    str2 = injectionParams.publishableKey;
                }
                String str4 = str2;
                if ((i11 & 16) != 0) {
                    str3 = injectionParams.stripeAccountId;
                }
                return injectionParams.copy(str, set3, z12, str4, str3);
            }

            public final String component1() {
                return this.injectorKey;
            }

            public final Set<String> component2() {
                return this.productUsage;
            }

            public final boolean component3() {
                return this.enableLogging;
            }

            public final String component4() {
                return this.publishableKey;
            }

            public final String component5() {
                return this.stripeAccountId;
            }

            public final InjectionParams copy(@InjectorKey String injectorKey, Set<String> productUsage, boolean z11, String publishableKey, String str) {
                s.g(injectorKey, "injectorKey");
                s.g(productUsage, "productUsage");
                s.g(publishableKey, "publishableKey");
                return new InjectionParams(injectorKey, productUsage, z11, publishableKey, str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof InjectionParams) {
                    InjectionParams injectionParams = (InjectionParams) obj;
                    return s.c(this.injectorKey, injectionParams.injectorKey) && s.c(this.productUsage, injectionParams.productUsage) && this.enableLogging == injectionParams.enableLogging && s.c(this.publishableKey, injectionParams.publishableKey) && s.c(this.stripeAccountId, injectionParams.stripeAccountId);
                }
                return false;
            }

            public final boolean getEnableLogging() {
                return this.enableLogging;
            }

            public final String getInjectorKey() {
                return this.injectorKey;
            }

            public final Set<String> getProductUsage() {
                return this.productUsage;
            }

            public final String getPublishableKey() {
                return this.publishableKey;
            }

            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = ((this.injectorKey.hashCode() * 31) + this.productUsage.hashCode()) * 31;
                boolean z11 = this.enableLogging;
                int i11 = z11;
                if (z11 != 0) {
                    i11 = 1;
                }
                int hashCode2 = (((hashCode + i11) * 31) + this.publishableKey.hashCode()) * 31;
                String str = this.stripeAccountId;
                return hashCode2 + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "InjectionParams(injectorKey=" + this.injectorKey + ", productUsage=" + this.productUsage + ", enableLogging=" + this.enableLogging + ", publishableKey=" + this.publishableKey + ", stripeAccountId=" + ((Object) this.stripeAccountId) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.injectorKey);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
                out.writeInt(this.enableLogging ? 1 : 0);
                out.writeString(this.publishableKey);
                out.writeString(this.stripeAccountId);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Args(GooglePayPaymentMethodLauncher.Config config, String currencyCode, int i11) {
            this(config, currencyCode, i11, null, 8, null);
            s.g(config, "config");
            s.g(currencyCode, "currencyCode");
        }

        public Args(GooglePayPaymentMethodLauncher.Config config, String currencyCode, int i11, String str, InjectionParams injectionParams) {
            s.g(config, "config");
            s.g(currencyCode, "currencyCode");
            this.config = config;
            this.currencyCode = currencyCode;
            this.amount = i11;
            this.transactionId = str;
            this.injectionParams = injectionParams;
        }

        public static /* synthetic */ Args copy$default(Args args, GooglePayPaymentMethodLauncher.Config config, String str, int i11, String str2, InjectionParams injectionParams, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                config = args.config;
            }
            if ((i12 & 2) != 0) {
                str = args.currencyCode;
            }
            String str3 = str;
            if ((i12 & 4) != 0) {
                i11 = args.amount;
            }
            int i13 = i11;
            if ((i12 & 8) != 0) {
                str2 = args.transactionId;
            }
            String str4 = str2;
            if ((i12 & 16) != 0) {
                injectionParams = args.injectionParams;
            }
            return args.copy(config, str3, i13, str4, injectionParams);
        }

        public final GooglePayPaymentMethodLauncher.Config component1$payments_core_release() {
            return this.config;
        }

        public final String component2$payments_core_release() {
            return this.currencyCode;
        }

        public final int component3$payments_core_release() {
            return this.amount;
        }

        public final String component4$payments_core_release() {
            return this.transactionId;
        }

        public final InjectionParams component5$payments_core_release() {
            return this.injectionParams;
        }

        public final Args copy(GooglePayPaymentMethodLauncher.Config config, String currencyCode, int i11, String str, InjectionParams injectionParams) {
            s.g(config, "config");
            s.g(currencyCode, "currencyCode");
            return new Args(config, currencyCode, i11, str, injectionParams);
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
                return s.c(this.config, args.config) && s.c(this.currencyCode, args.currencyCode) && this.amount == args.amount && s.c(this.transactionId, args.transactionId) && s.c(this.injectionParams, args.injectionParams);
            }
            return false;
        }

        public final int getAmount$payments_core_release() {
            return this.amount;
        }

        public final GooglePayPaymentMethodLauncher.Config getConfig$payments_core_release() {
            return this.config;
        }

        public final String getCurrencyCode$payments_core_release() {
            return this.currencyCode;
        }

        public final InjectionParams getInjectionParams$payments_core_release() {
            return this.injectionParams;
        }

        public final String getTransactionId$payments_core_release() {
            return this.transactionId;
        }

        public int hashCode() {
            int hashCode = ((((this.config.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + Integer.hashCode(this.amount)) * 31;
            String str = this.transactionId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            InjectionParams injectionParams = this.injectionParams;
            return hashCode2 + (injectionParams != null ? injectionParams.hashCode() : 0);
        }

        public final Bundle toBundle$payments_core_release() {
            return r3.b.a(v.a(EXTRA_ARGS, this));
        }

        public String toString() {
            return "Args(config=" + this.config + ", currencyCode=" + this.currencyCode + ", amount=" + this.amount + ", transactionId=" + ((Object) this.transactionId) + ", injectionParams=" + this.injectionParams + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            this.config.writeToParcel(out, i11);
            out.writeString(this.currencyCode);
            out.writeInt(this.amount);
            out.writeString(this.transactionId);
            InjectionParams injectionParams = this.injectionParams;
            if (injectionParams == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            injectionParams.writeToParcel(out, i11);
        }

        public /* synthetic */ Args(GooglePayPaymentMethodLauncher.Config config, String str, int i11, String str2, InjectionParams injectionParams, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(config, str, i11, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : injectionParams);
        }

        public /* synthetic */ Args(GooglePayPaymentMethodLauncher.Config config, String str, int i11, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(config, str, i11, (i12 & 8) != 0 ? null : str2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Args(GooglePayPaymentMethodLauncher.Config config, String currencyCode, int i11, String str) {
            this(config, currencyCode, i11, str, null);
            s.g(config, "config");
            s.g(currencyCode, "currencyCode");
        }
    }
}