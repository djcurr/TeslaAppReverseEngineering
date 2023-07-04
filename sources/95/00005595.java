package com.stripe.android.paymentsheet;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.InjectorKt;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.paymentsheet.model.SetupIntentClientSecret;
import com.stripe.android.view.ActivityStarter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PaymentSheetContract extends f.a<Args, PaymentSheetResult> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_ARGS = "com.stripe.android.paymentsheet.PaymentSheetContract.extra_args";
    private static final String EXTRA_RESULT = "com.stripe.android.paymentsheet.PaymentSheetContract.extra_result";

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getEXTRA_ARGS$annotations() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class Result implements ActivityStarter.Result {
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        private final PaymentSheetResult paymentSheetResult;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new Result((PaymentSheetResult) parcel.readParcelable(Result.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i11) {
                return new Result[i11];
            }
        }

        public Result(PaymentSheetResult paymentSheetResult) {
            kotlin.jvm.internal.s.g(paymentSheetResult, "paymentSheetResult");
            this.paymentSheetResult = paymentSheetResult;
        }

        public static /* synthetic */ Result copy$default(Result result, PaymentSheetResult paymentSheetResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paymentSheetResult = result.paymentSheetResult;
            }
            return result.copy(paymentSheetResult);
        }

        public final PaymentSheetResult component1() {
            return this.paymentSheetResult;
        }

        public final Result copy(PaymentSheetResult paymentSheetResult) {
            kotlin.jvm.internal.s.g(paymentSheetResult, "paymentSheetResult");
            return new Result(paymentSheetResult);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && kotlin.jvm.internal.s.c(this.paymentSheetResult, ((Result) obj).paymentSheetResult);
        }

        public final PaymentSheetResult getPaymentSheetResult() {
            return this.paymentSheetResult;
        }

        public int hashCode() {
            return this.paymentSheetResult.hashCode();
        }

        @Override // com.stripe.android.view.ActivityStarter.Result
        public Bundle toBundle() {
            return r3.b.a(vz.v.a(PaymentSheetContract.EXTRA_RESULT, this));
        }

        public String toString() {
            return "Result(paymentSheetResult=" + this.paymentSheetResult + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeParcelable(this.paymentSheetResult, i11);
        }
    }

    @Override // f.a
    public Intent createIntent(Context context, Args input) {
        Window window;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(input, "input");
        Integer num = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            num = Integer.valueOf(window.getStatusBarColor());
        }
        Intent putExtra = new Intent(context, PaymentSheetActivity.class).putExtra(EXTRA_ARGS, Args.copy$default(input, null, null, num, null, 11, null));
        kotlin.jvm.internal.s.f(putExtra, "Intent(context, PaymentS…rColor = statusBarColor))");
        return putExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // f.a
    public PaymentSheetResult parseResult(int i11, Intent intent) {
        Result result;
        PaymentSheetResult paymentSheetResult = null;
        if (intent != null && (result = (Result) intent.getParcelableExtra(EXTRA_RESULT)) != null) {
            paymentSheetResult = result.getPaymentSheetResult();
        }
        return paymentSheetResult == null ? new PaymentSheetResult.Failed(new IllegalArgumentException("Failed to retrieve a PaymentSheetResult.")) : paymentSheetResult;
    }

    /* loaded from: classes6.dex */
    public static final class Args implements ActivityStarter.Args {
        private final ClientSecret clientSecret;
        private final PaymentSheet.Configuration config;
        private final String injectorKey;
        private final Integer statusBarColor;
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

            public static /* synthetic */ Args createPaymentIntentArgs$default(Companion companion, String str, PaymentSheet.Configuration configuration, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    configuration = null;
                }
                return companion.createPaymentIntentArgs(str, configuration);
            }

            public static /* synthetic */ Args createPaymentIntentArgsWithInjectorKey$paymentsheet_release$default(Companion companion, String str, PaymentSheet.Configuration configuration, String str2, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    configuration = null;
                }
                return companion.createPaymentIntentArgsWithInjectorKey$paymentsheet_release(str, configuration, str2);
            }

            public static /* synthetic */ Args createSetupIntentArgs$default(Companion companion, String str, PaymentSheet.Configuration configuration, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    configuration = null;
                }
                return companion.createSetupIntentArgs(str, configuration);
            }

            public static /* synthetic */ Args createSetupIntentArgsWithInjectorKey$paymentsheet_release$default(Companion companion, String str, PaymentSheet.Configuration configuration, String str2, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    configuration = null;
                }
                return companion.createSetupIntentArgsWithInjectorKey$paymentsheet_release(str, configuration, str2);
            }

            public final Args createPaymentIntentArgs(String clientSecret, PaymentSheet.Configuration configuration) {
                kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
                return new Args(new PaymentIntentClientSecret(clientSecret), configuration, null, null, 12, null);
            }

            public final Args createPaymentIntentArgsWithInjectorKey$paymentsheet_release(String clientSecret, PaymentSheet.Configuration configuration, @InjectorKey String injectorKey) {
                kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
                kotlin.jvm.internal.s.g(injectorKey, "injectorKey");
                return new Args(new PaymentIntentClientSecret(clientSecret), configuration, null, injectorKey, 4, null);
            }

            public final Args createSetupIntentArgs(String clientSecret, PaymentSheet.Configuration configuration) {
                kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
                return new Args(new SetupIntentClientSecret(clientSecret), configuration, null, null, 12, null);
            }

            public final Args createSetupIntentArgsWithInjectorKey$paymentsheet_release(String clientSecret, PaymentSheet.Configuration configuration, @InjectorKey String injectorKey) {
                kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
                kotlin.jvm.internal.s.g(injectorKey, "injectorKey");
                return new Args(new SetupIntentClientSecret(clientSecret), configuration, null, injectorKey, 4, null);
            }

            public final Args fromIntent$paymentsheet_release(Intent intent) {
                kotlin.jvm.internal.s.g(intent, "intent");
                return (Args) intent.getParcelableExtra(PaymentSheetContract.EXTRA_ARGS);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new Args((ClientSecret) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() == 0 ? null : PaymentSheet.Configuration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        public Args(ClientSecret clientSecret, PaymentSheet.Configuration configuration, Integer num, @InjectorKey String injectorKey) {
            kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
            kotlin.jvm.internal.s.g(injectorKey, "injectorKey");
            this.clientSecret = clientSecret;
            this.config = configuration;
            this.statusBarColor = num;
            this.injectorKey = injectorKey;
        }

        public static /* synthetic */ Args copy$default(Args args, ClientSecret clientSecret, PaymentSheet.Configuration configuration, Integer num, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                clientSecret = args.clientSecret;
            }
            if ((i11 & 2) != 0) {
                configuration = args.config;
            }
            if ((i11 & 4) != 0) {
                num = args.statusBarColor;
            }
            if ((i11 & 8) != 0) {
                str = args.injectorKey;
            }
            return args.copy(clientSecret, configuration, num, str);
        }

        public final ClientSecret component1$paymentsheet_release() {
            return this.clientSecret;
        }

        public final PaymentSheet.Configuration component2$paymentsheet_release() {
            return this.config;
        }

        public final Integer component3$paymentsheet_release() {
            return this.statusBarColor;
        }

        public final String component4$paymentsheet_release() {
            return this.injectorKey;
        }

        public final Args copy(ClientSecret clientSecret, PaymentSheet.Configuration configuration, Integer num, @InjectorKey String injectorKey) {
            kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
            kotlin.jvm.internal.s.g(injectorKey, "injectorKey");
            return new Args(clientSecret, configuration, num, injectorKey);
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
                return kotlin.jvm.internal.s.c(this.clientSecret, args.clientSecret) && kotlin.jvm.internal.s.c(this.config, args.config) && kotlin.jvm.internal.s.c(this.statusBarColor, args.statusBarColor) && kotlin.jvm.internal.s.c(this.injectorKey, args.injectorKey);
            }
            return false;
        }

        public final ClientSecret getClientSecret$paymentsheet_release() {
            return this.clientSecret;
        }

        public final PaymentSheet.Configuration getConfig$paymentsheet_release() {
            return this.config;
        }

        public final PaymentSheet.GooglePayConfiguration getGooglePayConfig() {
            PaymentSheet.Configuration configuration = this.config;
            if (configuration == null) {
                return null;
            }
            return configuration.getGooglePay();
        }

        public final String getInjectorKey$paymentsheet_release() {
            return this.injectorKey;
        }

        public final Integer getStatusBarColor$paymentsheet_release() {
            return this.statusBarColor;
        }

        public int hashCode() {
            int hashCode = this.clientSecret.hashCode() * 31;
            PaymentSheet.Configuration configuration = this.config;
            int hashCode2 = (hashCode + (configuration == null ? 0 : configuration.hashCode())) * 31;
            Integer num = this.statusBarColor;
            return ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.injectorKey.hashCode();
        }

        public String toString() {
            return "Args(clientSecret=" + this.clientSecret + ", config=" + this.config + ", statusBarColor=" + this.statusBarColor + ", injectorKey=" + this.injectorKey + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeParcelable(this.clientSecret, i11);
            PaymentSheet.Configuration configuration = this.config;
            if (configuration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                configuration.writeToParcel(out, i11);
            }
            Integer num = this.statusBarColor;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.injectorKey);
        }

        public /* synthetic */ Args(ClientSecret clientSecret, PaymentSheet.Configuration configuration, Integer num, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(clientSecret, configuration, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? InjectorKt.DUMMY_INJECTOR_KEY : str);
        }
    }
}