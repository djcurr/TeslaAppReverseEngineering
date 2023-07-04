package com.stripe.android.payments.paymentlauncher;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.model.ConfirmStripeIntentParams;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;

/* loaded from: classes6.dex */
public final class PaymentLauncherContract extends f.a<Args, PaymentResult> {
    public static final int $stable = 0;

    @Override // f.a
    public Intent createIntent(Context context, Args input) {
        Window window;
        s.g(context, "context");
        s.g(input, "input");
        Integer num = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            num = Integer.valueOf(window.getStatusBarColor());
        }
        input.setStatusBarColor(num);
        Intent putExtras = new Intent(context, PaymentLauncherConfirmationActivity.class).putExtras(input.toBundle());
        s.f(putExtras, "Intent(\n            cont…tExtras(input.toBundle())");
        return putExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // f.a
    public PaymentResult parseResult(int i11, Intent intent) {
        return PaymentResult.Companion.fromIntent(intent);
    }

    /* loaded from: classes6.dex */
    public static abstract class Args implements Parcelable {
        private static final String EXTRA_ARGS = "extra_args";
        private final boolean enableLogging;
        private final String injectorKey;
        private final Set<String> productUsage;
        private final String publishableKey;
        private Integer statusBarColor;
        private final String stripeAccountId;
        public static final Companion Companion = new Companion(null);
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
        public static final class IntentConfirmationArgs extends Args {
            private final ConfirmStripeIntentParams confirmStripeIntentParams;
            private final boolean enableLogging;
            private final String injectorKey;
            private final Set<String> productUsage;
            private final String publishableKey;
            private Integer statusBarColor;
            private final String stripeAccountId;
            public static final Parcelable.Creator<IntentConfirmationArgs> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<IntentConfirmationArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IntentConfirmationArgs createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    boolean z11 = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new IntentConfirmationArgs(readString, readString2, readString3, z11, linkedHashSet, (ConfirmStripeIntentParams) parcel.readParcelable(IntentConfirmationArgs.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IntentConfirmationArgs[] newArray(int i11) {
                    return new IntentConfirmationArgs[i11];
                }
            }

            public /* synthetic */ IntentConfirmationArgs(String str, String str2, String str3, boolean z11, Set set, ConfirmStripeIntentParams confirmStripeIntentParams, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, z11, set, confirmStripeIntentParams, (i11 & 64) != 0 ? null : num);
            }

            public static /* synthetic */ IntentConfirmationArgs copy$default(IntentConfirmationArgs intentConfirmationArgs, String str, String str2, String str3, boolean z11, Set set, ConfirmStripeIntentParams confirmStripeIntentParams, Integer num, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = intentConfirmationArgs.getInjectorKey();
                }
                if ((i11 & 2) != 0) {
                    str2 = intentConfirmationArgs.getPublishableKey();
                }
                String str4 = str2;
                if ((i11 & 4) != 0) {
                    str3 = intentConfirmationArgs.getStripeAccountId();
                }
                String str5 = str3;
                if ((i11 & 8) != 0) {
                    z11 = intentConfirmationArgs.getEnableLogging();
                }
                boolean z12 = z11;
                Set<String> set2 = set;
                if ((i11 & 16) != 0) {
                    set2 = intentConfirmationArgs.getProductUsage();
                }
                Set set3 = set2;
                if ((i11 & 32) != 0) {
                    confirmStripeIntentParams = intentConfirmationArgs.confirmStripeIntentParams;
                }
                ConfirmStripeIntentParams confirmStripeIntentParams2 = confirmStripeIntentParams;
                if ((i11 & 64) != 0) {
                    num = intentConfirmationArgs.getStatusBarColor();
                }
                return intentConfirmationArgs.copy(str, str4, str5, z12, set3, confirmStripeIntentParams2, num);
            }

            public final String component1() {
                return getInjectorKey();
            }

            public final String component2() {
                return getPublishableKey();
            }

            public final String component3() {
                return getStripeAccountId();
            }

            public final boolean component4() {
                return getEnableLogging();
            }

            public final Set<String> component5() {
                return getProductUsage();
            }

            public final ConfirmStripeIntentParams component6() {
                return this.confirmStripeIntentParams;
            }

            public final Integer component7() {
                return getStatusBarColor();
            }

            public final IntentConfirmationArgs copy(@InjectorKey String injectorKey, String publishableKey, String str, boolean z11, Set<String> productUsage, ConfirmStripeIntentParams confirmStripeIntentParams, Integer num) {
                s.g(injectorKey, "injectorKey");
                s.g(publishableKey, "publishableKey");
                s.g(productUsage, "productUsage");
                s.g(confirmStripeIntentParams, "confirmStripeIntentParams");
                return new IntentConfirmationArgs(injectorKey, publishableKey, str, z11, productUsage, confirmStripeIntentParams, num);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof IntentConfirmationArgs) {
                    IntentConfirmationArgs intentConfirmationArgs = (IntentConfirmationArgs) obj;
                    return s.c(getInjectorKey(), intentConfirmationArgs.getInjectorKey()) && s.c(getPublishableKey(), intentConfirmationArgs.getPublishableKey()) && s.c(getStripeAccountId(), intentConfirmationArgs.getStripeAccountId()) && getEnableLogging() == intentConfirmationArgs.getEnableLogging() && s.c(getProductUsage(), intentConfirmationArgs.getProductUsage()) && s.c(this.confirmStripeIntentParams, intentConfirmationArgs.confirmStripeIntentParams) && s.c(getStatusBarColor(), intentConfirmationArgs.getStatusBarColor());
                }
                return false;
            }

            public final ConfirmStripeIntentParams getConfirmStripeIntentParams() {
                return this.confirmStripeIntentParams;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public boolean getEnableLogging() {
                return this.enableLogging;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getInjectorKey() {
                return this.injectorKey;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Set<String> getProductUsage() {
                return this.productUsage;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Integer getStatusBarColor() {
                return this.statusBarColor;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public int hashCode() {
                int hashCode = ((((getInjectorKey().hashCode() * 31) + getPublishableKey().hashCode()) * 31) + (getStripeAccountId() == null ? 0 : getStripeAccountId().hashCode())) * 31;
                boolean enableLogging = getEnableLogging();
                int i11 = enableLogging;
                if (enableLogging) {
                    i11 = 1;
                }
                return ((((((hashCode + i11) * 31) + getProductUsage().hashCode()) * 31) + this.confirmStripeIntentParams.hashCode()) * 31) + (getStatusBarColor() != null ? getStatusBarColor().hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public void setStatusBarColor(Integer num) {
                this.statusBarColor = num;
            }

            public String toString() {
                return "IntentConfirmationArgs(injectorKey=" + getInjectorKey() + ", publishableKey=" + getPublishableKey() + ", stripeAccountId=" + ((Object) getStripeAccountId()) + ", enableLogging=" + getEnableLogging() + ", productUsage=" + getProductUsage() + ", confirmStripeIntentParams=" + this.confirmStripeIntentParams + ", statusBarColor=" + getStatusBarColor() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                int intValue;
                s.g(out, "out");
                out.writeString(this.injectorKey);
                out.writeString(this.publishableKey);
                out.writeString(this.stripeAccountId);
                out.writeInt(this.enableLogging ? 1 : 0);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
                out.writeParcelable(this.confirmStripeIntentParams, i11);
                Integer num = this.statusBarColor;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IntentConfirmationArgs(@InjectorKey String injectorKey, String publishableKey, String str, boolean z11, Set<String> productUsage, ConfirmStripeIntentParams confirmStripeIntentParams, Integer num) {
                super(injectorKey, publishableKey, str, z11, productUsage, num, null);
                s.g(injectorKey, "injectorKey");
                s.g(publishableKey, "publishableKey");
                s.g(productUsage, "productUsage");
                s.g(confirmStripeIntentParams, "confirmStripeIntentParams");
                this.injectorKey = injectorKey;
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.enableLogging = z11;
                this.productUsage = productUsage;
                this.confirmStripeIntentParams = confirmStripeIntentParams;
                this.statusBarColor = num;
            }
        }

        /* loaded from: classes6.dex */
        public static final class PaymentIntentNextActionArgs extends Args {
            private final boolean enableLogging;
            private final String injectorKey;
            private final String paymentIntentClientSecret;
            private final Set<String> productUsage;
            private final String publishableKey;
            private Integer statusBarColor;
            private final String stripeAccountId;
            public static final Parcelable.Creator<PaymentIntentNextActionArgs> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<PaymentIntentNextActionArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentIntentNextActionArgs createFromParcel(Parcel parcel) {
                    String readString;
                    s.g(parcel, "parcel");
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    int i11 = 0;
                    boolean z11 = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    while (true) {
                        readString = parcel.readString();
                        if (i11 == readInt) {
                            break;
                        }
                        linkedHashSet.add(readString);
                        i11++;
                    }
                    return new PaymentIntentNextActionArgs(readString2, readString3, readString4, z11, linkedHashSet, readString, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentIntentNextActionArgs[] newArray(int i11) {
                    return new PaymentIntentNextActionArgs[i11];
                }
            }

            public /* synthetic */ PaymentIntentNextActionArgs(String str, String str2, String str3, boolean z11, Set set, String str4, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, z11, set, str4, (i11 & 64) != 0 ? null : num);
            }

            public static /* synthetic */ PaymentIntentNextActionArgs copy$default(PaymentIntentNextActionArgs paymentIntentNextActionArgs, String str, String str2, String str3, boolean z11, Set set, String str4, Integer num, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = paymentIntentNextActionArgs.getInjectorKey();
                }
                if ((i11 & 2) != 0) {
                    str2 = paymentIntentNextActionArgs.getPublishableKey();
                }
                String str5 = str2;
                if ((i11 & 4) != 0) {
                    str3 = paymentIntentNextActionArgs.getStripeAccountId();
                }
                String str6 = str3;
                if ((i11 & 8) != 0) {
                    z11 = paymentIntentNextActionArgs.getEnableLogging();
                }
                boolean z12 = z11;
                Set<String> set2 = set;
                if ((i11 & 16) != 0) {
                    set2 = paymentIntentNextActionArgs.getProductUsage();
                }
                Set set3 = set2;
                if ((i11 & 32) != 0) {
                    str4 = paymentIntentNextActionArgs.paymentIntentClientSecret;
                }
                String str7 = str4;
                if ((i11 & 64) != 0) {
                    num = paymentIntentNextActionArgs.getStatusBarColor();
                }
                return paymentIntentNextActionArgs.copy(str, str5, str6, z12, set3, str7, num);
            }

            public final String component1() {
                return getInjectorKey();
            }

            public final String component2() {
                return getPublishableKey();
            }

            public final String component3() {
                return getStripeAccountId();
            }

            public final boolean component4() {
                return getEnableLogging();
            }

            public final Set<String> component5() {
                return getProductUsage();
            }

            public final String component6() {
                return this.paymentIntentClientSecret;
            }

            public final Integer component7() {
                return getStatusBarColor();
            }

            public final PaymentIntentNextActionArgs copy(@InjectorKey String injectorKey, String publishableKey, String str, boolean z11, Set<String> productUsage, String paymentIntentClientSecret, Integer num) {
                s.g(injectorKey, "injectorKey");
                s.g(publishableKey, "publishableKey");
                s.g(productUsage, "productUsage");
                s.g(paymentIntentClientSecret, "paymentIntentClientSecret");
                return new PaymentIntentNextActionArgs(injectorKey, publishableKey, str, z11, productUsage, paymentIntentClientSecret, num);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof PaymentIntentNextActionArgs) {
                    PaymentIntentNextActionArgs paymentIntentNextActionArgs = (PaymentIntentNextActionArgs) obj;
                    return s.c(getInjectorKey(), paymentIntentNextActionArgs.getInjectorKey()) && s.c(getPublishableKey(), paymentIntentNextActionArgs.getPublishableKey()) && s.c(getStripeAccountId(), paymentIntentNextActionArgs.getStripeAccountId()) && getEnableLogging() == paymentIntentNextActionArgs.getEnableLogging() && s.c(getProductUsage(), paymentIntentNextActionArgs.getProductUsage()) && s.c(this.paymentIntentClientSecret, paymentIntentNextActionArgs.paymentIntentClientSecret) && s.c(getStatusBarColor(), paymentIntentNextActionArgs.getStatusBarColor());
                }
                return false;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public boolean getEnableLogging() {
                return this.enableLogging;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getInjectorKey() {
                return this.injectorKey;
            }

            public final String getPaymentIntentClientSecret() {
                return this.paymentIntentClientSecret;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Set<String> getProductUsage() {
                return this.productUsage;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Integer getStatusBarColor() {
                return this.statusBarColor;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public int hashCode() {
                int hashCode = ((((getInjectorKey().hashCode() * 31) + getPublishableKey().hashCode()) * 31) + (getStripeAccountId() == null ? 0 : getStripeAccountId().hashCode())) * 31;
                boolean enableLogging = getEnableLogging();
                int i11 = enableLogging;
                if (enableLogging) {
                    i11 = 1;
                }
                return ((((((hashCode + i11) * 31) + getProductUsage().hashCode()) * 31) + this.paymentIntentClientSecret.hashCode()) * 31) + (getStatusBarColor() != null ? getStatusBarColor().hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public void setStatusBarColor(Integer num) {
                this.statusBarColor = num;
            }

            public String toString() {
                return "PaymentIntentNextActionArgs(injectorKey=" + getInjectorKey() + ", publishableKey=" + getPublishableKey() + ", stripeAccountId=" + ((Object) getStripeAccountId()) + ", enableLogging=" + getEnableLogging() + ", productUsage=" + getProductUsage() + ", paymentIntentClientSecret=" + this.paymentIntentClientSecret + ", statusBarColor=" + getStatusBarColor() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                int intValue;
                s.g(out, "out");
                out.writeString(this.injectorKey);
                out.writeString(this.publishableKey);
                out.writeString(this.stripeAccountId);
                out.writeInt(this.enableLogging ? 1 : 0);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
                out.writeString(this.paymentIntentClientSecret);
                Integer num = this.statusBarColor;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentIntentNextActionArgs(@InjectorKey String injectorKey, String publishableKey, String str, boolean z11, Set<String> productUsage, String paymentIntentClientSecret, Integer num) {
                super(injectorKey, publishableKey, str, z11, productUsage, num, null);
                s.g(injectorKey, "injectorKey");
                s.g(publishableKey, "publishableKey");
                s.g(productUsage, "productUsage");
                s.g(paymentIntentClientSecret, "paymentIntentClientSecret");
                this.injectorKey = injectorKey;
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.enableLogging = z11;
                this.productUsage = productUsage;
                this.paymentIntentClientSecret = paymentIntentClientSecret;
                this.statusBarColor = num;
            }
        }

        /* loaded from: classes6.dex */
        public static final class SetupIntentNextActionArgs extends Args {
            private final boolean enableLogging;
            private final String injectorKey;
            private final Set<String> productUsage;
            private final String publishableKey;
            private final String setupIntentClientSecret;
            private Integer statusBarColor;
            private final String stripeAccountId;
            public static final Parcelable.Creator<SetupIntentNextActionArgs> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<SetupIntentNextActionArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SetupIntentNextActionArgs createFromParcel(Parcel parcel) {
                    String readString;
                    s.g(parcel, "parcel");
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    int i11 = 0;
                    boolean z11 = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    while (true) {
                        readString = parcel.readString();
                        if (i11 == readInt) {
                            break;
                        }
                        linkedHashSet.add(readString);
                        i11++;
                    }
                    return new SetupIntentNextActionArgs(readString2, readString3, readString4, z11, linkedHashSet, readString, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SetupIntentNextActionArgs[] newArray(int i11) {
                    return new SetupIntentNextActionArgs[i11];
                }
            }

            public /* synthetic */ SetupIntentNextActionArgs(String str, String str2, String str3, boolean z11, Set set, String str4, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, z11, set, str4, (i11 & 64) != 0 ? null : num);
            }

            public static /* synthetic */ SetupIntentNextActionArgs copy$default(SetupIntentNextActionArgs setupIntentNextActionArgs, String str, String str2, String str3, boolean z11, Set set, String str4, Integer num, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = setupIntentNextActionArgs.getInjectorKey();
                }
                if ((i11 & 2) != 0) {
                    str2 = setupIntentNextActionArgs.getPublishableKey();
                }
                String str5 = str2;
                if ((i11 & 4) != 0) {
                    str3 = setupIntentNextActionArgs.getStripeAccountId();
                }
                String str6 = str3;
                if ((i11 & 8) != 0) {
                    z11 = setupIntentNextActionArgs.getEnableLogging();
                }
                boolean z12 = z11;
                Set<String> set2 = set;
                if ((i11 & 16) != 0) {
                    set2 = setupIntentNextActionArgs.getProductUsage();
                }
                Set set3 = set2;
                if ((i11 & 32) != 0) {
                    str4 = setupIntentNextActionArgs.setupIntentClientSecret;
                }
                String str7 = str4;
                if ((i11 & 64) != 0) {
                    num = setupIntentNextActionArgs.getStatusBarColor();
                }
                return setupIntentNextActionArgs.copy(str, str5, str6, z12, set3, str7, num);
            }

            public final String component1() {
                return getInjectorKey();
            }

            public final String component2() {
                return getPublishableKey();
            }

            public final String component3() {
                return getStripeAccountId();
            }

            public final boolean component4() {
                return getEnableLogging();
            }

            public final Set<String> component5() {
                return getProductUsage();
            }

            public final String component6() {
                return this.setupIntentClientSecret;
            }

            public final Integer component7() {
                return getStatusBarColor();
            }

            public final SetupIntentNextActionArgs copy(@InjectorKey String injectorKey, String publishableKey, String str, boolean z11, Set<String> productUsage, String setupIntentClientSecret, Integer num) {
                s.g(injectorKey, "injectorKey");
                s.g(publishableKey, "publishableKey");
                s.g(productUsage, "productUsage");
                s.g(setupIntentClientSecret, "setupIntentClientSecret");
                return new SetupIntentNextActionArgs(injectorKey, publishableKey, str, z11, productUsage, setupIntentClientSecret, num);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof SetupIntentNextActionArgs) {
                    SetupIntentNextActionArgs setupIntentNextActionArgs = (SetupIntentNextActionArgs) obj;
                    return s.c(getInjectorKey(), setupIntentNextActionArgs.getInjectorKey()) && s.c(getPublishableKey(), setupIntentNextActionArgs.getPublishableKey()) && s.c(getStripeAccountId(), setupIntentNextActionArgs.getStripeAccountId()) && getEnableLogging() == setupIntentNextActionArgs.getEnableLogging() && s.c(getProductUsage(), setupIntentNextActionArgs.getProductUsage()) && s.c(this.setupIntentClientSecret, setupIntentNextActionArgs.setupIntentClientSecret) && s.c(getStatusBarColor(), setupIntentNextActionArgs.getStatusBarColor());
                }
                return false;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public boolean getEnableLogging() {
                return this.enableLogging;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getInjectorKey() {
                return this.injectorKey;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Set<String> getProductUsage() {
                return this.productUsage;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            public final String getSetupIntentClientSecret() {
                return this.setupIntentClientSecret;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Integer getStatusBarColor() {
                return this.statusBarColor;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public int hashCode() {
                int hashCode = ((((getInjectorKey().hashCode() * 31) + getPublishableKey().hashCode()) * 31) + (getStripeAccountId() == null ? 0 : getStripeAccountId().hashCode())) * 31;
                boolean enableLogging = getEnableLogging();
                int i11 = enableLogging;
                if (enableLogging) {
                    i11 = 1;
                }
                return ((((((hashCode + i11) * 31) + getProductUsage().hashCode()) * 31) + this.setupIntentClientSecret.hashCode()) * 31) + (getStatusBarColor() != null ? getStatusBarColor().hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public void setStatusBarColor(Integer num) {
                this.statusBarColor = num;
            }

            public String toString() {
                return "SetupIntentNextActionArgs(injectorKey=" + getInjectorKey() + ", publishableKey=" + getPublishableKey() + ", stripeAccountId=" + ((Object) getStripeAccountId()) + ", enableLogging=" + getEnableLogging() + ", productUsage=" + getProductUsage() + ", setupIntentClientSecret=" + this.setupIntentClientSecret + ", statusBarColor=" + getStatusBarColor() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                int intValue;
                s.g(out, "out");
                out.writeString(this.injectorKey);
                out.writeString(this.publishableKey);
                out.writeString(this.stripeAccountId);
                out.writeInt(this.enableLogging ? 1 : 0);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
                out.writeString(this.setupIntentClientSecret);
                Integer num = this.statusBarColor;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupIntentNextActionArgs(@InjectorKey String injectorKey, String publishableKey, String str, boolean z11, Set<String> productUsage, String setupIntentClientSecret, Integer num) {
                super(injectorKey, publishableKey, str, z11, productUsage, num, null);
                s.g(injectorKey, "injectorKey");
                s.g(publishableKey, "publishableKey");
                s.g(productUsage, "productUsage");
                s.g(setupIntentClientSecret, "setupIntentClientSecret");
                this.injectorKey = injectorKey;
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.enableLogging = z11;
                this.productUsage = productUsage;
                this.setupIntentClientSecret = setupIntentClientSecret;
                this.statusBarColor = num;
            }
        }

        private Args(@InjectorKey String str, String str2, String str3, boolean z11, Set<String> set, Integer num) {
            this.injectorKey = str;
            this.publishableKey = str2;
            this.stripeAccountId = str3;
            this.enableLogging = z11;
            this.productUsage = set;
            this.statusBarColor = num;
        }

        public /* synthetic */ Args(String str, String str2, String str3, boolean z11, Set set, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, z11, set, num);
        }

        public boolean getEnableLogging() {
            return this.enableLogging;
        }

        public String getInjectorKey() {
            return this.injectorKey;
        }

        public Set<String> getProductUsage() {
            return this.productUsage;
        }

        public String getPublishableKey() {
            return this.publishableKey;
        }

        public Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public void setStatusBarColor(Integer num) {
            this.statusBarColor = num;
        }

        public final Bundle toBundle() {
            return r3.b.a(v.a(EXTRA_ARGS, this));
        }

        public /* synthetic */ Args(String str, String str2, String str3, boolean z11, Set set, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, z11, set, (i11 & 32) != 0 ? null : num, null);
        }
    }
}