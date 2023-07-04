package com.stripe.android.googlepaylauncher;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;

/* loaded from: classes6.dex */
public final class GooglePayLauncherContract extends f.a<Args, GooglePayLauncher.Result> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_RESULT = "extra_result";
    public static final String EXTRA_STATUS_BAR_COLOR = "extra_status_bar_color";

    /* loaded from: classes6.dex */
    public static abstract class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static final String EXTRA_ARGS = "extra_args";

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Args fromIntent$payments_core_release(Intent intent) {
                s.g(intent, "intent");
                return (Args) intent.getParcelableExtra(Args.EXTRA_ARGS);
            }
        }

        private Args() {
        }

        public /* synthetic */ Args(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String getClientSecret$payments_core_release();

        public abstract GooglePayLauncher.Config getConfig$payments_core_release();

        public final Bundle toBundle$payments_core_release() {
            return r3.b.a(v.a(EXTRA_ARGS, this));
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

    /* loaded from: classes6.dex */
    public static final class PaymentIntentArgs extends Args {
        private final String clientSecret;
        private final GooglePayLauncher.Config config;
        public static final Parcelable.Creator<PaymentIntentArgs> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<PaymentIntentArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentIntentArgs createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new PaymentIntentArgs(parcel.readString(), GooglePayLauncher.Config.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentIntentArgs[] newArray(int i11) {
                return new PaymentIntentArgs[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentIntentArgs(String clientSecret, GooglePayLauncher.Config config) {
            super(null);
            s.g(clientSecret, "clientSecret");
            s.g(config, "config");
            this.clientSecret = clientSecret;
            this.config = config;
        }

        public static /* synthetic */ PaymentIntentArgs copy$default(PaymentIntentArgs paymentIntentArgs, String str, GooglePayLauncher.Config config, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = paymentIntentArgs.getClientSecret$payments_core_release();
            }
            if ((i11 & 2) != 0) {
                config = paymentIntentArgs.getConfig$payments_core_release();
            }
            return paymentIntentArgs.copy(str, config);
        }

        public final String component1$payments_core_release() {
            return getClientSecret$payments_core_release();
        }

        public final GooglePayLauncher.Config component2$payments_core_release() {
            return getConfig$payments_core_release();
        }

        public final PaymentIntentArgs copy(String clientSecret, GooglePayLauncher.Config config) {
            s.g(clientSecret, "clientSecret");
            s.g(config, "config");
            return new PaymentIntentArgs(clientSecret, config);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PaymentIntentArgs) {
                PaymentIntentArgs paymentIntentArgs = (PaymentIntentArgs) obj;
                return s.c(getClientSecret$payments_core_release(), paymentIntentArgs.getClientSecret$payments_core_release()) && s.c(getConfig$payments_core_release(), paymentIntentArgs.getConfig$payments_core_release());
            }
            return false;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args
        public String getClientSecret$payments_core_release() {
            return this.clientSecret;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args
        public GooglePayLauncher.Config getConfig$payments_core_release() {
            return this.config;
        }

        public int hashCode() {
            return (getClientSecret$payments_core_release().hashCode() * 31) + getConfig$payments_core_release().hashCode();
        }

        public String toString() {
            return "PaymentIntentArgs(clientSecret=" + getClientSecret$payments_core_release() + ", config=" + getConfig$payments_core_release() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.clientSecret);
            this.config.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class SetupIntentArgs extends Args {
        private final String clientSecret;
        private final GooglePayLauncher.Config config;
        private final String currencyCode;
        public static final Parcelable.Creator<SetupIntentArgs> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<SetupIntentArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SetupIntentArgs createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new SetupIntentArgs(parcel.readString(), GooglePayLauncher.Config.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SetupIntentArgs[] newArray(int i11) {
                return new SetupIntentArgs[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetupIntentArgs(String clientSecret, GooglePayLauncher.Config config, String currencyCode) {
            super(null);
            s.g(clientSecret, "clientSecret");
            s.g(config, "config");
            s.g(currencyCode, "currencyCode");
            this.clientSecret = clientSecret;
            this.config = config;
            this.currencyCode = currencyCode;
        }

        public static /* synthetic */ SetupIntentArgs copy$default(SetupIntentArgs setupIntentArgs, String str, GooglePayLauncher.Config config, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = setupIntentArgs.getClientSecret$payments_core_release();
            }
            if ((i11 & 2) != 0) {
                config = setupIntentArgs.getConfig$payments_core_release();
            }
            if ((i11 & 4) != 0) {
                str2 = setupIntentArgs.currencyCode;
            }
            return setupIntentArgs.copy(str, config, str2);
        }

        public final String component1$payments_core_release() {
            return getClientSecret$payments_core_release();
        }

        public final GooglePayLauncher.Config component2$payments_core_release() {
            return getConfig$payments_core_release();
        }

        public final String component3$payments_core_release() {
            return this.currencyCode;
        }

        public final SetupIntentArgs copy(String clientSecret, GooglePayLauncher.Config config, String currencyCode) {
            s.g(clientSecret, "clientSecret");
            s.g(config, "config");
            s.g(currencyCode, "currencyCode");
            return new SetupIntentArgs(clientSecret, config, currencyCode);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetupIntentArgs) {
                SetupIntentArgs setupIntentArgs = (SetupIntentArgs) obj;
                return s.c(getClientSecret$payments_core_release(), setupIntentArgs.getClientSecret$payments_core_release()) && s.c(getConfig$payments_core_release(), setupIntentArgs.getConfig$payments_core_release()) && s.c(this.currencyCode, setupIntentArgs.currencyCode);
            }
            return false;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args
        public String getClientSecret$payments_core_release() {
            return this.clientSecret;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args
        public GooglePayLauncher.Config getConfig$payments_core_release() {
            return this.config;
        }

        public final String getCurrencyCode$payments_core_release() {
            return this.currencyCode;
        }

        public int hashCode() {
            return (((getClientSecret$payments_core_release().hashCode() * 31) + getConfig$payments_core_release().hashCode()) * 31) + this.currencyCode.hashCode();
        }

        public String toString() {
            return "SetupIntentArgs(clientSecret=" + getClientSecret$payments_core_release() + ", config=" + getConfig$payments_core_release() + ", currencyCode=" + this.currencyCode + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.clientSecret);
            this.config.writeToParcel(out, i11);
            out.writeString(this.currencyCode);
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
        Intent putExtras = new Intent(context, GooglePayLauncherActivity.class).putExtras(bundle$payments_core_release);
        s.f(putExtras, "Intent(context, GooglePa…       .putExtras(extras)");
        return putExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // f.a
    public GooglePayLauncher.Result parseResult(int i11, Intent intent) {
        GooglePayLauncher.Result result = intent == null ? null : (GooglePayLauncher.Result) intent.getParcelableExtra("extra_result");
        return result == null ? new GooglePayLauncher.Result.Failed(new IllegalStateException("Error while processing result from Google Pay.")) : result;
    }
}