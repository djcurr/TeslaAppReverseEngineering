package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.view.ActivityStarter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class StripeGooglePayContract extends f.a<Args, GooglePayLauncherResult> {

    /* loaded from: classes6.dex */
    public static final class Args implements ActivityStarter.Args {
        private GooglePayConfig config;
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

            public final /* synthetic */ Args create$payments_core_release(Intent intent) {
                s.g(intent, "intent");
                return (Args) intent.getParcelableExtra("extra_activity_args");
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Args(GooglePayConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        public Args(GooglePayConfig config, Integer num) {
            s.g(config, "config");
            this.config = config;
            this.statusBarColor = num;
        }

        public static /* synthetic */ Args copy$default(Args args, GooglePayConfig googlePayConfig, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                googlePayConfig = args.config;
            }
            if ((i11 & 2) != 0) {
                num = args.statusBarColor;
            }
            return args.copy(googlePayConfig, num);
        }

        public final GooglePayConfig component1() {
            return this.config;
        }

        public final Integer component2() {
            return this.statusBarColor;
        }

        public final Args copy(GooglePayConfig config, Integer num) {
            s.g(config, "config");
            return new Args(config, num);
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
                return s.c(this.config, args.config) && s.c(this.statusBarColor, args.statusBarColor);
            }
            return false;
        }

        public final GooglePayConfig getConfig() {
            return this.config;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public int hashCode() {
            int hashCode = this.config.hashCode() * 31;
            Integer num = this.statusBarColor;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final void setConfig(GooglePayConfig googlePayConfig) {
            s.g(googlePayConfig, "<set-?>");
            this.config = googlePayConfig;
        }

        public String toString() {
            return "Args(config=" + this.config + ", statusBarColor=" + this.statusBarColor + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            int intValue;
            s.g(out, "out");
            this.config.writeToParcel(out, i11);
            Integer num = this.statusBarColor;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
        }
    }

    @Override // f.a
    public Intent createIntent(Context context, Args input) {
        s.g(context, "context");
        s.g(input, "input");
        Intent putExtra = new Intent(context, StripeGooglePayActivity.class).putExtra("extra_activity_args", input);
        s.f(putExtra, "Intent(context, StripeGo…tarter.Args.EXTRA, input)");
        return putExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // f.a
    public GooglePayLauncherResult parseResult(int i11, Intent intent) {
        return GooglePayLauncherResult.Companion.fromIntent(intent);
    }
}