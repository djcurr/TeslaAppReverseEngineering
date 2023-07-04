package com.stripe.android.payments.bankaccount.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity;
import f.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import r3.b;
import vz.v;

/* loaded from: classes6.dex */
public final class CollectBankAccountContract extends a<Args, CollectBankAccountResult> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_ARGS = "com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args";
    private static final String EXTRA_RESULT = "com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result";

    /* loaded from: classes6.dex */
    public static abstract class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final boolean attachToIntent;
        private final String clientSecret;
        private final CollectBankAccountConfiguration configuration;
        private final String publishableKey;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Args fromIntent(Intent intent) {
                s.g(intent, "intent");
                return (Args) intent.getParcelableExtra(CollectBankAccountContract.EXTRA_ARGS);
            }
        }

        /* loaded from: classes6.dex */
        public static final class ForPaymentIntent extends Args {
            private final boolean attachToIntent;
            private final String clientSecret;
            private final CollectBankAccountConfiguration configuration;
            private final String publishableKey;
            public static final Parcelable.Creator<ForPaymentIntent> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<ForPaymentIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForPaymentIntent createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new ForPaymentIntent(parcel.readString(), parcel.readString(), (CollectBankAccountConfiguration) parcel.readParcelable(ForPaymentIntent.class.getClassLoader()), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForPaymentIntent[] newArray(int i11) {
                    return new ForPaymentIntent[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForPaymentIntent(String publishableKey, String clientSecret, CollectBankAccountConfiguration configuration, boolean z11) {
                super(publishableKey, clientSecret, configuration, z11, null);
                s.g(publishableKey, "publishableKey");
                s.g(clientSecret, "clientSecret");
                s.g(configuration, "configuration");
                this.publishableKey = publishableKey;
                this.clientSecret = clientSecret;
                this.configuration = configuration;
                this.attachToIntent = z11;
            }

            public static /* synthetic */ ForPaymentIntent copy$default(ForPaymentIntent forPaymentIntent, String str, String str2, CollectBankAccountConfiguration collectBankAccountConfiguration, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = forPaymentIntent.getPublishableKey();
                }
                if ((i11 & 2) != 0) {
                    str2 = forPaymentIntent.getClientSecret();
                }
                if ((i11 & 4) != 0) {
                    collectBankAccountConfiguration = forPaymentIntent.getConfiguration();
                }
                if ((i11 & 8) != 0) {
                    z11 = forPaymentIntent.getAttachToIntent();
                }
                return forPaymentIntent.copy(str, str2, collectBankAccountConfiguration, z11);
            }

            public final String component1() {
                return getPublishableKey();
            }

            public final String component2() {
                return getClientSecret();
            }

            public final CollectBankAccountConfiguration component3() {
                return getConfiguration();
            }

            public final boolean component4() {
                return getAttachToIntent();
            }

            public final ForPaymentIntent copy(String publishableKey, String clientSecret, CollectBankAccountConfiguration configuration, boolean z11) {
                s.g(publishableKey, "publishableKey");
                s.g(clientSecret, "clientSecret");
                s.g(configuration, "configuration");
                return new ForPaymentIntent(publishableKey, clientSecret, configuration, z11);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ForPaymentIntent) {
                    ForPaymentIntent forPaymentIntent = (ForPaymentIntent) obj;
                    return s.c(getPublishableKey(), forPaymentIntent.getPublishableKey()) && s.c(getClientSecret(), forPaymentIntent.getClientSecret()) && s.c(getConfiguration(), forPaymentIntent.getConfiguration()) && getAttachToIntent() == forPaymentIntent.getAttachToIntent();
                }
                return false;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public boolean getAttachToIntent() {
                return this.attachToIntent;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getClientSecret() {
                return this.clientSecret;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public CollectBankAccountConfiguration getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            public int hashCode() {
                int hashCode = ((((getPublishableKey().hashCode() * 31) + getClientSecret().hashCode()) * 31) + getConfiguration().hashCode()) * 31;
                boolean attachToIntent = getAttachToIntent();
                int i11 = attachToIntent;
                if (attachToIntent) {
                    i11 = 1;
                }
                return hashCode + i11;
            }

            public String toString() {
                return "ForPaymentIntent(publishableKey=" + getPublishableKey() + ", clientSecret=" + getClientSecret() + ", configuration=" + getConfiguration() + ", attachToIntent=" + getAttachToIntent() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.publishableKey);
                out.writeString(this.clientSecret);
                out.writeParcelable(this.configuration, i11);
                out.writeInt(this.attachToIntent ? 1 : 0);
            }
        }

        /* loaded from: classes6.dex */
        public static final class ForSetupIntent extends Args {
            private final boolean attachToIntent;
            private final String clientSecret;
            private final CollectBankAccountConfiguration configuration;
            private final String publishableKey;
            public static final Parcelable.Creator<ForSetupIntent> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<ForSetupIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForSetupIntent createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new ForSetupIntent(parcel.readString(), parcel.readString(), (CollectBankAccountConfiguration) parcel.readParcelable(ForSetupIntent.class.getClassLoader()), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForSetupIntent[] newArray(int i11) {
                    return new ForSetupIntent[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForSetupIntent(String publishableKey, String clientSecret, CollectBankAccountConfiguration configuration, boolean z11) {
                super(publishableKey, clientSecret, configuration, z11, null);
                s.g(publishableKey, "publishableKey");
                s.g(clientSecret, "clientSecret");
                s.g(configuration, "configuration");
                this.publishableKey = publishableKey;
                this.clientSecret = clientSecret;
                this.configuration = configuration;
                this.attachToIntent = z11;
            }

            public static /* synthetic */ ForSetupIntent copy$default(ForSetupIntent forSetupIntent, String str, String str2, CollectBankAccountConfiguration collectBankAccountConfiguration, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = forSetupIntent.getPublishableKey();
                }
                if ((i11 & 2) != 0) {
                    str2 = forSetupIntent.getClientSecret();
                }
                if ((i11 & 4) != 0) {
                    collectBankAccountConfiguration = forSetupIntent.getConfiguration();
                }
                if ((i11 & 8) != 0) {
                    z11 = forSetupIntent.getAttachToIntent();
                }
                return forSetupIntent.copy(str, str2, collectBankAccountConfiguration, z11);
            }

            public final String component1() {
                return getPublishableKey();
            }

            public final String component2() {
                return getClientSecret();
            }

            public final CollectBankAccountConfiguration component3() {
                return getConfiguration();
            }

            public final boolean component4() {
                return getAttachToIntent();
            }

            public final ForSetupIntent copy(String publishableKey, String clientSecret, CollectBankAccountConfiguration configuration, boolean z11) {
                s.g(publishableKey, "publishableKey");
                s.g(clientSecret, "clientSecret");
                s.g(configuration, "configuration");
                return new ForSetupIntent(publishableKey, clientSecret, configuration, z11);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ForSetupIntent) {
                    ForSetupIntent forSetupIntent = (ForSetupIntent) obj;
                    return s.c(getPublishableKey(), forSetupIntent.getPublishableKey()) && s.c(getClientSecret(), forSetupIntent.getClientSecret()) && s.c(getConfiguration(), forSetupIntent.getConfiguration()) && getAttachToIntent() == forSetupIntent.getAttachToIntent();
                }
                return false;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public boolean getAttachToIntent() {
                return this.attachToIntent;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getClientSecret() {
                return this.clientSecret;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public CollectBankAccountConfiguration getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            public int hashCode() {
                int hashCode = ((((getPublishableKey().hashCode() * 31) + getClientSecret().hashCode()) * 31) + getConfiguration().hashCode()) * 31;
                boolean attachToIntent = getAttachToIntent();
                int i11 = attachToIntent;
                if (attachToIntent) {
                    i11 = 1;
                }
                return hashCode + i11;
            }

            public String toString() {
                return "ForSetupIntent(publishableKey=" + getPublishableKey() + ", clientSecret=" + getClientSecret() + ", configuration=" + getConfiguration() + ", attachToIntent=" + getAttachToIntent() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.publishableKey);
                out.writeString(this.clientSecret);
                out.writeParcelable(this.configuration, i11);
                out.writeInt(this.attachToIntent ? 1 : 0);
            }
        }

        private Args(String str, String str2, CollectBankAccountConfiguration collectBankAccountConfiguration, boolean z11) {
            this.publishableKey = str;
            this.clientSecret = str2;
            this.configuration = collectBankAccountConfiguration;
            this.attachToIntent = z11;
        }

        public /* synthetic */ Args(String str, String str2, CollectBankAccountConfiguration collectBankAccountConfiguration, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, collectBankAccountConfiguration, z11);
        }

        public boolean getAttachToIntent() {
            return this.attachToIntent;
        }

        public String getClientSecret() {
            return this.clientSecret;
        }

        public CollectBankAccountConfiguration getConfiguration() {
            return this.configuration;
        }

        public String getPublishableKey() {
            return this.publishableKey;
        }

        public final Bundle toBundle() {
            return b.a(v.a(CollectBankAccountContract.EXTRA_ARGS, this));
        }
    }

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
    public static final class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        private final CollectBankAccountResult collectBankAccountResult;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Result((CollectBankAccountResult) parcel.readParcelable(Result.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i11) {
                return new Result[i11];
            }
        }

        public Result(CollectBankAccountResult collectBankAccountResult) {
            s.g(collectBankAccountResult, "collectBankAccountResult");
            this.collectBankAccountResult = collectBankAccountResult;
        }

        public static /* synthetic */ Result copy$default(Result result, CollectBankAccountResult collectBankAccountResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                collectBankAccountResult = result.collectBankAccountResult;
            }
            return result.copy(collectBankAccountResult);
        }

        public final CollectBankAccountResult component1() {
            return this.collectBankAccountResult;
        }

        public final Result copy(CollectBankAccountResult collectBankAccountResult) {
            s.g(collectBankAccountResult, "collectBankAccountResult");
            return new Result(collectBankAccountResult);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && s.c(this.collectBankAccountResult, ((Result) obj).collectBankAccountResult);
        }

        public final CollectBankAccountResult getCollectBankAccountResult() {
            return this.collectBankAccountResult;
        }

        public int hashCode() {
            return this.collectBankAccountResult.hashCode();
        }

        public final Bundle toBundle() {
            return b.a(v.a(CollectBankAccountContract.EXTRA_RESULT, this));
        }

        public String toString() {
            return "Result(collectBankAccountResult=" + this.collectBankAccountResult + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeParcelable(this.collectBankAccountResult, i11);
        }
    }

    @Override // f.a
    public Intent createIntent(Context context, Args input) {
        s.g(context, "context");
        s.g(input, "input");
        Intent putExtra = new Intent(context, CollectBankAccountActivity.class).putExtra(EXTRA_ARGS, input);
        s.f(putExtra, "Intent(context, CollectB…tExtra(EXTRA_ARGS, input)");
        return putExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // f.a
    public CollectBankAccountResult parseResult(int i11, Intent intent) {
        Result result;
        CollectBankAccountResult collectBankAccountResult = null;
        if (intent != null && (result = (Result) intent.getParcelableExtra(EXTRA_RESULT)) != null) {
            collectBankAccountResult = result.getCollectBankAccountResult();
        }
        return collectBankAccountResult == null ? new CollectBankAccountResult.Failed(new IllegalArgumentException("Failed to retrieve a CollectBankAccountResult.")) : collectBankAccountResult;
    }
}