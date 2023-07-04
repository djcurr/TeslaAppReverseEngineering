package com.stripe.android.googlepaylauncher;

import android.app.Application;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import h00.l;
import h00.p;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.text.v;
import v20.k;
import v20.o0;
import vz.b0;
import vz.r;

/* loaded from: classes6.dex */
public final class GooglePayLauncher {
    public static final String PRODUCT_USAGE = "GooglePayLauncher";
    private final androidx.activity.result.d<GooglePayLauncherContract.Args> activityResultLauncher;
    private final Config config;
    private final l<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory;
    private boolean isReady;
    private final ReadyCallback readyCallback;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncher$2 */
    /* loaded from: classes6.dex */
    static final class AnonymousClass2 extends u implements l<GooglePayEnvironment, GooglePayRepository> {
        final /* synthetic */ ComponentActivity $activity;
        final /* synthetic */ Config $config;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ComponentActivity componentActivity, Config config) {
            super(1);
            this.$activity = componentActivity;
            this.$config = config;
        }

        @Override // h00.l
        public final GooglePayRepository invoke(GooglePayEnvironment it2) {
            s.g(it2, "it");
            Application application = this.$activity.getApplication();
            s.f(application, "activity.application");
            return new DefaultGooglePayRepository(application, this.$config.getEnvironment(), GooglePayConfigConversionKtxKt.convert(this.$config.getBillingAddressConfig()), this.$config.getExistingPaymentMethodRequired(), this.$config.getAllowCreditCards(), null, 32, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncher$4 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass4 extends u implements l<GooglePayEnvironment, GooglePayRepository> {
        final /* synthetic */ Config $config;
        final /* synthetic */ Fragment $fragment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Fragment fragment, Config config) {
            super(1);
            this.$fragment = fragment;
            this.$config = config;
        }

        @Override // h00.l
        public final GooglePayRepository invoke(GooglePayEnvironment it2) {
            s.g(it2, "it");
            Application application = this.$fragment.requireActivity().getApplication();
            s.f(application, "fragment.requireActivity().application");
            return new DefaultGooglePayRepository(application, this.$config.getEnvironment(), GooglePayConfigConversionKtxKt.convert(this.$config.getBillingAddressConfig()), this.$config.getExistingPaymentMethodRequired(), this.$config.getAllowCreditCards(), null, 32, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.googlepaylauncher.GooglePayLauncher$5", f = "GooglePayLauncher.kt", l = {133}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncher$5 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass5 extends kotlin.coroutines.jvm.internal.l implements p<o0, zz.d<? super b0>, Object> {
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(zz.d<? super AnonymousClass5> dVar) {
            super(2, dVar);
            GooglePayLauncher.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new AnonymousClass5(dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((AnonymousClass5) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            ReadyCallback readyCallback;
            d11 = a00.d.d();
            int i11 = this.label;
            if (i11 == 0) {
                r.b(obj);
                ReadyCallback readyCallback2 = GooglePayLauncher.this.readyCallback;
                kotlinx.coroutines.flow.e<Boolean> isReady = ((GooglePayRepository) GooglePayLauncher.this.googlePayRepositoryFactory.invoke(GooglePayLauncher.this.config.getEnvironment())).isReady();
                this.L$0 = readyCallback2;
                this.label = 1;
                obj = kotlinx.coroutines.flow.g.r(isReady, this);
                if (obj == d11) {
                    return d11;
                }
                readyCallback = readyCallback2;
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                readyCallback = (ReadyCallback) this.L$0;
                r.b(obj);
            }
            Boolean bool = (Boolean) obj;
            GooglePayLauncher.this.isReady = bool.booleanValue();
            readyCallback.onReady(bool.booleanValue());
            return b0.f54756a;
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
    public interface ReadyCallback {
        void onReady(boolean z11);
    }

    /* loaded from: classes6.dex */
    public static abstract class Result implements Parcelable {
        public static final int $stable = 0;

        /* loaded from: classes6.dex */
        public static final class Canceled extends Result {
            public static final Canceled INSTANCE = new Canceled();
            public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Canceled> {
                @Override // android.os.Parcelable.Creator
                public final Canceled createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return Canceled.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Canceled[] newArray(int i11) {
                    return new Canceled[i11];
                }
            }

            private Canceled() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Completed extends Result {
            public static final Completed INSTANCE = new Completed();
            public static final Parcelable.Creator<Completed> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Completed> {
                @Override // android.os.Parcelable.Creator
                public final Completed createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return Completed.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Completed[] newArray(int i11) {
                    return new Completed[i11];
                }
            }

            private Completed() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Failed extends Result {
            private final Throwable error;
            public static final Parcelable.Creator<Failed> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Failed> {
                @Override // android.os.Parcelable.Creator
                public final Failed createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new Failed((Throwable) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Failed[] newArray(int i11) {
                    return new Failed[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(Throwable error) {
                super(null);
                s.g(error, "error");
                this.error = error;
            }

            public static /* synthetic */ Failed copy$default(Failed failed, Throwable th2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    th2 = failed.error;
                }
                return failed.copy(th2);
            }

            public final Throwable component1() {
                return this.error;
            }

            public final Failed copy(Throwable error) {
                s.g(error, "error");
                return new Failed(error);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failed) && s.c(this.error, ((Failed) obj).error);
            }

            public final Throwable getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.error + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeSerializable(this.error);
            }
        }

        private Result() {
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public interface ResultCallback {
        void onResult(Result result);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GooglePayLauncher(o0 lifecycleScope, Config config, ReadyCallback readyCallback, androidx.activity.result.d<GooglePayLauncherContract.Args> activityResultLauncher, l<? super GooglePayEnvironment, ? extends GooglePayRepository> googlePayRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor) {
        s.g(lifecycleScope, "lifecycleScope");
        s.g(config, "config");
        s.g(readyCallback, "readyCallback");
        s.g(activityResultLauncher, "activityResultLauncher");
        s.g(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        this.config = config;
        this.readyCallback = readyCallback;
        this.activityResultLauncher = activityResultLauncher;
        this.googlePayRepositoryFactory = googlePayRepositoryFactory;
        analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.GooglePayLauncherInit, null, null, null, null, 30, null));
        k.d(lifecycleScope, null, null, new AnonymousClass5(null), 3, null);
    }

    /* renamed from: _init_$lambda-0 */
    public static final void m137_init_$lambda0(ResultCallback resultCallback, Result it2) {
        s.g(resultCallback, "$resultCallback");
        s.f(it2, "it");
        resultCallback.onResult(it2);
    }

    /* renamed from: _init_$lambda-1 */
    public static final void m138_init_$lambda1(ResultCallback resultCallback, Result it2) {
        s.g(resultCallback, "$resultCallback");
        s.f(it2, "it");
        resultCallback.onResult(it2);
    }

    public static /* synthetic */ void a(ResultCallback resultCallback, Result result) {
        m138_init_$lambda1(resultCallback, result);
    }

    public static /* synthetic */ void b(ResultCallback resultCallback, Result result) {
        m137_init_$lambda0(resultCallback, result);
    }

    public final void presentForPaymentIntent(String clientSecret) {
        s.g(clientSecret, "clientSecret");
        if (this.isReady) {
            this.activityResultLauncher.b(new GooglePayLauncherContract.PaymentIntentArgs(clientSecret, this.config));
            return;
        }
        throw new IllegalStateException("presentForPaymentIntent() may only be called when Google Pay is available on this device.".toString());
    }

    public final void presentForSetupIntent(String clientSecret, String currencyCode) {
        s.g(clientSecret, "clientSecret");
        s.g(currencyCode, "currencyCode");
        if (this.isReady) {
            this.activityResultLauncher.b(new GooglePayLauncherContract.SetupIntentArgs(clientSecret, this.config, currencyCode));
            return;
        }
        throw new IllegalStateException("presentForSetupIntent() may only be called when Google Pay is available on this device.".toString());
    }

    /* loaded from: classes6.dex */
    public static final class BillingAddressConfig implements Parcelable {
        private final Format format;
        private final boolean isPhoneNumberRequired;
        private final boolean isRequired;
        public static final Parcelable.Creator<BillingAddressConfig> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<BillingAddressConfig> {
            @Override // android.os.Parcelable.Creator
            public final BillingAddressConfig createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new BillingAddressConfig(parcel.readInt() != 0, Format.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final BillingAddressConfig[] newArray(int i11) {
                return new BillingAddressConfig[i11];
            }
        }

        /* loaded from: classes6.dex */
        public enum Format {
            Min("MIN"),
            Full("FULL");
            
            private final String code;

            Format(String str) {
                this.code = str;
            }

            public final String getCode$payments_core_release() {
                return this.code;
            }
        }

        public BillingAddressConfig() {
            this(false, null, false, 7, null);
        }

        public BillingAddressConfig(boolean z11) {
            this(z11, null, false, 6, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public BillingAddressConfig(boolean z11, Format format) {
            this(z11, format, false, 4, null);
            s.g(format, "format");
        }

        public BillingAddressConfig(boolean z11, Format format, boolean z12) {
            s.g(format, "format");
            this.isRequired = z11;
            this.format = format;
            this.isPhoneNumberRequired = z12;
        }

        public static /* synthetic */ BillingAddressConfig copy$default(BillingAddressConfig billingAddressConfig, boolean z11, Format format, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = billingAddressConfig.isRequired;
            }
            if ((i11 & 2) != 0) {
                format = billingAddressConfig.format;
            }
            if ((i11 & 4) != 0) {
                z12 = billingAddressConfig.isPhoneNumberRequired;
            }
            return billingAddressConfig.copy(z11, format, z12);
        }

        public final boolean component1$payments_core_release() {
            return this.isRequired;
        }

        public final Format component2$payments_core_release() {
            return this.format;
        }

        public final boolean component3$payments_core_release() {
            return this.isPhoneNumberRequired;
        }

        public final BillingAddressConfig copy(boolean z11, Format format, boolean z12) {
            s.g(format, "format");
            return new BillingAddressConfig(z11, format, z12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BillingAddressConfig) {
                BillingAddressConfig billingAddressConfig = (BillingAddressConfig) obj;
                return this.isRequired == billingAddressConfig.isRequired && this.format == billingAddressConfig.format && this.isPhoneNumberRequired == billingAddressConfig.isPhoneNumberRequired;
            }
            return false;
        }

        public final Format getFormat$payments_core_release() {
            return this.format;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z11 = this.isRequired;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            int hashCode = ((r02 * 31) + this.format.hashCode()) * 31;
            boolean z12 = this.isPhoneNumberRequired;
            return hashCode + (z12 ? 1 : z12 ? 1 : 0);
        }

        public final boolean isPhoneNumberRequired$payments_core_release() {
            return this.isPhoneNumberRequired;
        }

        public final boolean isRequired$payments_core_release() {
            return this.isRequired;
        }

        public String toString() {
            return "BillingAddressConfig(isRequired=" + this.isRequired + ", format=" + this.format + ", isPhoneNumberRequired=" + this.isPhoneNumberRequired + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(this.isRequired ? 1 : 0);
            out.writeString(this.format.name());
            out.writeInt(this.isPhoneNumberRequired ? 1 : 0);
        }

        public /* synthetic */ BillingAddressConfig(boolean z11, Format format, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? Format.Min : format, (i11 & 4) != 0 ? false : z12);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Config implements Parcelable {
        private boolean allowCreditCards;
        private BillingAddressConfig billingAddressConfig;
        private final GooglePayEnvironment environment;
        private boolean existingPaymentMethodRequired;
        private boolean isEmailRequired;
        private final String merchantCountryCode;
        private final String merchantName;
        public static final Parcelable.Creator<Config> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Config> {
            @Override // android.os.Parcelable.Creator
            public final Config createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Config(GooglePayEnvironment.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, BillingAddressConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Config[] newArray(int i11) {
                return new Config[i11];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(GooglePayEnvironment environment, String merchantCountryCode, String merchantName) {
            this(environment, merchantCountryCode, merchantName, false, null, false, false, 120, null);
            s.g(environment, "environment");
            s.g(merchantCountryCode, "merchantCountryCode");
            s.g(merchantName, "merchantName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(GooglePayEnvironment environment, String merchantCountryCode, String merchantName, boolean z11) {
            this(environment, merchantCountryCode, merchantName, z11, null, false, false, 112, null);
            s.g(environment, "environment");
            s.g(merchantCountryCode, "merchantCountryCode");
            s.g(merchantName, "merchantName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(GooglePayEnvironment environment, String merchantCountryCode, String merchantName, boolean z11, BillingAddressConfig billingAddressConfig) {
            this(environment, merchantCountryCode, merchantName, z11, billingAddressConfig, false, false, 96, null);
            s.g(environment, "environment");
            s.g(merchantCountryCode, "merchantCountryCode");
            s.g(merchantName, "merchantName");
            s.g(billingAddressConfig, "billingAddressConfig");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(GooglePayEnvironment environment, String merchantCountryCode, String merchantName, boolean z11, BillingAddressConfig billingAddressConfig, boolean z12) {
            this(environment, merchantCountryCode, merchantName, z11, billingAddressConfig, z12, false, 64, null);
            s.g(environment, "environment");
            s.g(merchantCountryCode, "merchantCountryCode");
            s.g(merchantName, "merchantName");
            s.g(billingAddressConfig, "billingAddressConfig");
        }

        public Config(GooglePayEnvironment environment, String merchantCountryCode, String merchantName, boolean z11, BillingAddressConfig billingAddressConfig, boolean z12, boolean z13) {
            s.g(environment, "environment");
            s.g(merchantCountryCode, "merchantCountryCode");
            s.g(merchantName, "merchantName");
            s.g(billingAddressConfig, "billingAddressConfig");
            this.environment = environment;
            this.merchantCountryCode = merchantCountryCode;
            this.merchantName = merchantName;
            this.isEmailRequired = z11;
            this.billingAddressConfig = billingAddressConfig;
            this.existingPaymentMethodRequired = z12;
            this.allowCreditCards = z13;
        }

        public static /* synthetic */ Config copy$default(Config config, GooglePayEnvironment googlePayEnvironment, String str, String str2, boolean z11, BillingAddressConfig billingAddressConfig, boolean z12, boolean z13, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                googlePayEnvironment = config.environment;
            }
            if ((i11 & 2) != 0) {
                str = config.merchantCountryCode;
            }
            String str3 = str;
            if ((i11 & 4) != 0) {
                str2 = config.merchantName;
            }
            String str4 = str2;
            if ((i11 & 8) != 0) {
                z11 = config.isEmailRequired;
            }
            boolean z14 = z11;
            if ((i11 & 16) != 0) {
                billingAddressConfig = config.billingAddressConfig;
            }
            BillingAddressConfig billingAddressConfig2 = billingAddressConfig;
            if ((i11 & 32) != 0) {
                z12 = config.existingPaymentMethodRequired;
            }
            boolean z15 = z12;
            if ((i11 & 64) != 0) {
                z13 = config.allowCreditCards;
            }
            return config.copy(googlePayEnvironment, str3, str4, z14, billingAddressConfig2, z15, z13);
        }

        public final GooglePayEnvironment component1() {
            return this.environment;
        }

        public final String component2() {
            return this.merchantCountryCode;
        }

        public final String component3() {
            return this.merchantName;
        }

        public final boolean component4() {
            return this.isEmailRequired;
        }

        public final BillingAddressConfig component5() {
            return this.billingAddressConfig;
        }

        public final boolean component6() {
            return this.existingPaymentMethodRequired;
        }

        public final boolean component7() {
            return this.allowCreditCards;
        }

        public final Config copy(GooglePayEnvironment environment, String merchantCountryCode, String merchantName, boolean z11, BillingAddressConfig billingAddressConfig, boolean z12, boolean z13) {
            s.g(environment, "environment");
            s.g(merchantCountryCode, "merchantCountryCode");
            s.g(merchantName, "merchantName");
            s.g(billingAddressConfig, "billingAddressConfig");
            return new Config(environment, merchantCountryCode, merchantName, z11, billingAddressConfig, z12, z13);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Config) {
                Config config = (Config) obj;
                return this.environment == config.environment && s.c(this.merchantCountryCode, config.merchantCountryCode) && s.c(this.merchantName, config.merchantName) && this.isEmailRequired == config.isEmailRequired && s.c(this.billingAddressConfig, config.billingAddressConfig) && this.existingPaymentMethodRequired == config.existingPaymentMethodRequired && this.allowCreditCards == config.allowCreditCards;
            }
            return false;
        }

        public final boolean getAllowCreditCards() {
            return this.allowCreditCards;
        }

        public final BillingAddressConfig getBillingAddressConfig() {
            return this.billingAddressConfig;
        }

        public final GooglePayEnvironment getEnvironment() {
            return this.environment;
        }

        public final boolean getExistingPaymentMethodRequired() {
            return this.existingPaymentMethodRequired;
        }

        public final String getMerchantCountryCode() {
            return this.merchantCountryCode;
        }

        public final String getMerchantName() {
            return this.merchantName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((this.environment.hashCode() * 31) + this.merchantCountryCode.hashCode()) * 31) + this.merchantName.hashCode()) * 31;
            boolean z11 = this.isEmailRequired;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int hashCode2 = (((hashCode + i11) * 31) + this.billingAddressConfig.hashCode()) * 31;
            boolean z12 = this.existingPaymentMethodRequired;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            int i13 = (hashCode2 + i12) * 31;
            boolean z13 = this.allowCreditCards;
            return i13 + (z13 ? 1 : z13 ? 1 : 0);
        }

        public final boolean isEmailRequired() {
            return this.isEmailRequired;
        }

        public final boolean isJcbEnabled$payments_core_release() {
            boolean u11;
            u11 = v.u(this.merchantCountryCode, Locale.JAPAN.getCountry(), true);
            return u11;
        }

        public final void setAllowCreditCards(boolean z11) {
            this.allowCreditCards = z11;
        }

        public final void setBillingAddressConfig(BillingAddressConfig billingAddressConfig) {
            s.g(billingAddressConfig, "<set-?>");
            this.billingAddressConfig = billingAddressConfig;
        }

        public final void setEmailRequired(boolean z11) {
            this.isEmailRequired = z11;
        }

        public final void setExistingPaymentMethodRequired(boolean z11) {
            this.existingPaymentMethodRequired = z11;
        }

        public String toString() {
            return "Config(environment=" + this.environment + ", merchantCountryCode=" + this.merchantCountryCode + ", merchantName=" + this.merchantName + ", isEmailRequired=" + this.isEmailRequired + ", billingAddressConfig=" + this.billingAddressConfig + ", existingPaymentMethodRequired=" + this.existingPaymentMethodRequired + ", allowCreditCards=" + this.allowCreditCards + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.environment.name());
            out.writeString(this.merchantCountryCode);
            out.writeString(this.merchantName);
            out.writeInt(this.isEmailRequired ? 1 : 0);
            this.billingAddressConfig.writeToParcel(out, i11);
            out.writeInt(this.existingPaymentMethodRequired ? 1 : 0);
            out.writeInt(this.allowCreditCards ? 1 : 0);
        }

        public /* synthetic */ Config(GooglePayEnvironment googlePayEnvironment, String str, String str2, boolean z11, BillingAddressConfig billingAddressConfig, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(googlePayEnvironment, str, str2, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? new BillingAddressConfig(false, null, false, 7, null) : billingAddressConfig, (i11 & 32) != 0 ? true : z12, (i11 & 64) != 0 ? true : z13);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GooglePayLauncher(androidx.activity.ComponentActivity r10, com.stripe.android.googlepaylauncher.GooglePayLauncher.Config r11, com.stripe.android.googlepaylauncher.GooglePayLauncher.ReadyCallback r12, final com.stripe.android.googlepaylauncher.GooglePayLauncher.ResultCallback r13) {
        /*
            r9 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.s.g(r10, r0)
            java.lang.String r0 = "config"
            kotlin.jvm.internal.s.g(r11, r0)
            java.lang.String r0 = "readyCallback"
            kotlin.jvm.internal.s.g(r12, r0)
            java.lang.String r0 = "resultCallback"
            kotlin.jvm.internal.s.g(r13, r0)
            androidx.lifecycle.q r2 = androidx.lifecycle.w.a(r10)
            com.stripe.android.googlepaylauncher.GooglePayLauncherContract r0 = new com.stripe.android.googlepaylauncher.GooglePayLauncherContract
            r0.<init>()
            com.stripe.android.googlepaylauncher.c r1 = new com.stripe.android.googlepaylauncher.c
            r1.<init>()
            androidx.activity.result.d r5 = r10.registerForActivityResult(r0, r1)
            java.lang.String r13 = "activity.registerForActi…ck.onResult(it)\n        }"
            kotlin.jvm.internal.s.f(r5, r13)
            com.stripe.android.googlepaylauncher.GooglePayLauncher$2 r6 = new com.stripe.android.googlepaylauncher.GooglePayLauncher$2
            r6.<init>(r10, r11)
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r7 = new com.stripe.android.networking.PaymentAnalyticsRequestFactory
            com.stripe.android.PaymentConfiguration$Companion r13 = com.stripe.android.PaymentConfiguration.Companion
            com.stripe.android.PaymentConfiguration r13 = r13.getInstance(r10)
            java.lang.String r13 = r13.getPublishableKey()
            java.lang.String r0 = "GooglePayLauncher"
            java.util.Set r0 = wz.v0.c(r0)
            r7.<init>(r10, r13, r0)
            com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor r8 = new com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor
            r8.<init>()
            r1 = r9
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.GooglePayLauncher.<init>(androidx.activity.ComponentActivity, com.stripe.android.googlepaylauncher.GooglePayLauncher$Config, com.stripe.android.googlepaylauncher.GooglePayLauncher$ReadyCallback, com.stripe.android.googlepaylauncher.GooglePayLauncher$ResultCallback):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GooglePayLauncher(androidx.fragment.app.Fragment r11, com.stripe.android.googlepaylauncher.GooglePayLauncher.Config r12, com.stripe.android.googlepaylauncher.GooglePayLauncher.ReadyCallback r13, final com.stripe.android.googlepaylauncher.GooglePayLauncher.ResultCallback r14) {
        /*
            r10 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.s.g(r11, r0)
            java.lang.String r0 = "config"
            kotlin.jvm.internal.s.g(r12, r0)
            java.lang.String r0 = "readyCallback"
            kotlin.jvm.internal.s.g(r13, r0)
            java.lang.String r0 = "resultCallback"
            kotlin.jvm.internal.s.g(r14, r0)
            androidx.lifecycle.v r0 = r11.getViewLifecycleOwner()
            java.lang.String r1 = "fragment.viewLifecycleOwner"
            kotlin.jvm.internal.s.f(r0, r1)
            androidx.lifecycle.q r3 = androidx.lifecycle.w.a(r0)
            com.stripe.android.googlepaylauncher.GooglePayLauncherContract r0 = new com.stripe.android.googlepaylauncher.GooglePayLauncherContract
            r0.<init>()
            com.stripe.android.googlepaylauncher.b r1 = new com.stripe.android.googlepaylauncher.b
            r1.<init>()
            androidx.activity.result.d r6 = r11.registerForActivityResult(r0, r1)
            java.lang.String r14 = "fragment.registerForActi…ck.onResult(it)\n        }"
            kotlin.jvm.internal.s.f(r6, r14)
            com.stripe.android.googlepaylauncher.GooglePayLauncher$4 r7 = new com.stripe.android.googlepaylauncher.GooglePayLauncher$4
            r7.<init>(r11, r12)
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r8 = new com.stripe.android.networking.PaymentAnalyticsRequestFactory
            android.content.Context r14 = r11.requireContext()
            java.lang.String r0 = "fragment.requireContext()"
            kotlin.jvm.internal.s.f(r14, r0)
            com.stripe.android.PaymentConfiguration$Companion r1 = com.stripe.android.PaymentConfiguration.Companion
            android.content.Context r11 = r11.requireContext()
            kotlin.jvm.internal.s.f(r11, r0)
            com.stripe.android.PaymentConfiguration r11 = r1.getInstance(r11)
            java.lang.String r11 = r11.getPublishableKey()
            java.lang.String r0 = "GooglePayLauncher"
            java.util.Set r0 = wz.v0.c(r0)
            r8.<init>(r14, r11, r0)
            com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor r9 = new com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor
            r9.<init>()
            r2 = r10
            r4 = r12
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.GooglePayLauncher.<init>(androidx.fragment.app.Fragment, com.stripe.android.googlepaylauncher.GooglePayLauncher$Config, com.stripe.android.googlepaylauncher.GooglePayLauncher$ReadyCallback, com.stripe.android.googlepaylauncher.GooglePayLauncher$ResultCallback):void");
    }
}