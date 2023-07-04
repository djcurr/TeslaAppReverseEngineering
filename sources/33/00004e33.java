package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.w;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.WeakMapInjectorRegistry;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import com.stripe.android.googlepaylauncher.injection.DaggerGooglePayPaymentMethodLauncherComponent;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import h00.l;
import h00.p;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.text.v;
import v20.k;
import v20.o0;
import vz.b0;
import vz.r;

/* loaded from: classes6.dex */
public final class GooglePayPaymentMethodLauncher {
    public static final int DEVELOPER_ERROR = 2;
    public static final int INTERNAL_ERROR = 1;
    public static final int NETWORK_ERROR = 3;
    public static final String PRODUCT_USAGE_TOKEN = "GooglePayPaymentMethodLauncher";
    private final androidx.activity.result.d<GooglePayPaymentMethodLauncherContract.Args> activityResultLauncher;
    private final Config config;
    private final boolean enableLogging;
    private final l<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory;
    private final GooglePayPaymentMethodLauncher$injector$1 injector;
    private final String injectorKey;
    private final zz.g ioContext;
    private boolean isReady;
    private final GooglePayPaymentMethodLauncherComponent launcherComponent;
    private final Set<String> productUsage;
    private final h00.a<String> publishableKeyProvider;
    private final ReadyCallback readyCallback;
    private final boolean skipReadyCheck;
    private final h00.a<String> stripeAccountIdProvider;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$2 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends u implements l<GooglePayEnvironment, GooglePayRepository> {
        final /* synthetic */ Config $config;
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, Config config) {
            super(1);
            this.$context = context;
            this.$config = config;
        }

        @Override // h00.l
        public final GooglePayRepository invoke(GooglePayEnvironment it2) {
            s.g(it2, "it");
            return new DefaultGooglePayRepository(this.$context, this.$config.getEnvironment(), GooglePayConfigConversionKtxKt.convert(this.$config.getBillingAddressConfig()), this.$config.getExistingPaymentMethodRequired(), this.$config.getAllowCreditCards(), null, 32, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$3 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends u implements h00.a<String> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // h00.a
        public final String invoke() {
            return PaymentConfiguration.Companion.getInstance(this.$context).getPublishableKey();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$4 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass4 extends u implements h00.a<String> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // h00.a
        public final String invoke() {
            return PaymentConfiguration.Companion.getInstance(this.$context).getStripeAccountId();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$5", f = "GooglePayPaymentMethodLauncher.kt", l = {206}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$5 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass5 extends kotlin.coroutines.jvm.internal.l implements p<o0, zz.d<? super b0>, Object> {
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(zz.d<AnonymousClass5> dVar) {
            super(2, dVar);
            GooglePayPaymentMethodLauncher.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new AnonymousClass5(dVar);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return invoke2(o0Var, (zz.d<b0>) dVar);
        }

        /* renamed from: invoke */
        public final Object invoke2(o0 o0Var, zz.d<b0> dVar) {
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
                ReadyCallback readyCallback2 = GooglePayPaymentMethodLauncher.this.readyCallback;
                kotlinx.coroutines.flow.e<Boolean> isReady = ((GooglePayRepository) GooglePayPaymentMethodLauncher.this.googlePayRepositoryFactory.invoke(GooglePayPaymentMethodLauncher.this.config.getEnvironment())).isReady();
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
            GooglePayPaymentMethodLauncher.this.isReady = bool.booleanValue();
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

    @Target({ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes6.dex */
    public @interface ErrorCode {
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
            private final PaymentMethod paymentMethod;
            public static final Parcelable.Creator<Completed> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Completed> {
                @Override // android.os.Parcelable.Creator
                public final Completed createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new Completed(PaymentMethod.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Completed[] newArray(int i11) {
                    return new Completed[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Completed(PaymentMethod paymentMethod) {
                super(null);
                s.g(paymentMethod, "paymentMethod");
                this.paymentMethod = paymentMethod;
            }

            public static /* synthetic */ Completed copy$default(Completed completed, PaymentMethod paymentMethod, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    paymentMethod = completed.paymentMethod;
                }
                return completed.copy(paymentMethod);
            }

            public final PaymentMethod component1() {
                return this.paymentMethod;
            }

            public final Completed copy(PaymentMethod paymentMethod) {
                s.g(paymentMethod, "paymentMethod");
                return new Completed(paymentMethod);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Completed) && s.c(this.paymentMethod, ((Completed) obj).paymentMethod);
            }

            public final PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public int hashCode() {
                return this.paymentMethod.hashCode();
            }

            public String toString() {
                return "Completed(paymentMethod=" + this.paymentMethod + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                this.paymentMethod.writeToParcel(out, i11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Failed extends Result {
            private final Throwable error;
            private final int errorCode;
            public static final Parcelable.Creator<Failed> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Failed> {
                @Override // android.os.Parcelable.Creator
                public final Failed createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new Failed((Throwable) parcel.readSerializable(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Failed[] newArray(int i11) {
                    return new Failed[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(Throwable error, @ErrorCode int i11) {
                super(null);
                s.g(error, "error");
                this.error = error;
                this.errorCode = i11;
            }

            public static /* synthetic */ Failed copy$default(Failed failed, Throwable th2, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    th2 = failed.error;
                }
                if ((i12 & 2) != 0) {
                    i11 = failed.errorCode;
                }
                return failed.copy(th2, i11);
            }

            public final Throwable component1() {
                return this.error;
            }

            public final int component2() {
                return this.errorCode;
            }

            public final Failed copy(Throwable error, @ErrorCode int i11) {
                s.g(error, "error");
                return new Failed(error, i11);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Failed) {
                    Failed failed = (Failed) obj;
                    return s.c(this.error, failed.error) && this.errorCode == failed.errorCode;
                }
                return false;
            }

            public final Throwable getError() {
                return this.error;
            }

            public final int getErrorCode() {
                return this.errorCode;
            }

            public int hashCode() {
                return (this.error.hashCode() * 31) + Integer.hashCode(this.errorCode);
            }

            public String toString() {
                return "Failed(error=" + this.error + ", errorCode=" + this.errorCode + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeSerializable(this.error);
                out.writeInt(this.errorCode);
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
    /* JADX WARN: Type inference failed for: r3v6, types: [com.stripe.android.core.injection.Injector, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$injector$1] */
    public GooglePayPaymentMethodLauncher(o0 lifecycleScope, Config config, ReadyCallback readyCallback, androidx.activity.result.d<GooglePayPaymentMethodLauncherContract.Args> activityResultLauncher, boolean z11, Context context, l<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory, Set<String> productUsage, h00.a<String> publishableKeyProvider, h00.a<String> stripeAccountIdProvider, boolean z12, @IOContext zz.g ioContext, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, StripeRepository stripeRepository) {
        s.g(lifecycleScope, "lifecycleScope");
        s.g(config, "config");
        s.g(readyCallback, "readyCallback");
        s.g(activityResultLauncher, "activityResultLauncher");
        s.g(context, "context");
        s.g(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        s.g(productUsage, "productUsage");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(stripeAccountIdProvider, "stripeAccountIdProvider");
        s.g(ioContext, "ioContext");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(stripeRepository, "stripeRepository");
        this.config = config;
        this.readyCallback = readyCallback;
        this.activityResultLauncher = activityResultLauncher;
        this.skipReadyCheck = z11;
        this.googlePayRepositoryFactory = googlePayRepositoryFactory;
        this.productUsage = productUsage;
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeAccountIdProvider = stripeAccountIdProvider;
        this.enableLogging = z12;
        this.ioContext = ioContext;
        this.launcherComponent = DaggerGooglePayPaymentMethodLauncherComponent.builder().context(context).ioContext(ioContext).analyticsRequestFactory(paymentAnalyticsRequestFactory).stripeRepository(stripeRepository).googlePayConfig(config).enableLogging(z12).publishableKeyProvider(publishableKeyProvider).stripeAccountIdProvider(stripeAccountIdProvider).build();
        WeakMapInjectorRegistry weakMapInjectorRegistry = WeakMapInjectorRegistry.INSTANCE;
        String o11 = m0.b(GooglePayPaymentMethodLauncher.class).o();
        if (o11 != null) {
            String nextKey = weakMapInjectorRegistry.nextKey(o11);
            this.injectorKey = nextKey;
            ?? r32 = new Injector() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$injector$1
                @Override // com.stripe.android.core.injection.Injector
                public void inject(Injectable<?> injectable) {
                    GooglePayPaymentMethodLauncherComponent googlePayPaymentMethodLauncherComponent;
                    s.g(injectable, "injectable");
                    if (injectable instanceof GooglePayPaymentMethodLauncherViewModel.Factory) {
                        googlePayPaymentMethodLauncherComponent = GooglePayPaymentMethodLauncher.this.launcherComponent;
                        googlePayPaymentMethodLauncherComponent.inject((GooglePayPaymentMethodLauncherViewModel.Factory) injectable);
                        return;
                    }
                    throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
                }
            };
            this.injector = r32;
            weakMapInjectorRegistry.register(r32, nextKey);
            analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.GooglePayPaymentMethodLauncherInit, null, null, null, null, 30, null));
            if (z11) {
                return;
            }
            k.d(lifecycleScope, null, null, new AnonymousClass5(null), 3, null);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: _init_$lambda-0 */
    public static final void m142_init_$lambda0(ResultCallback resultCallback, Result it2) {
        s.g(resultCallback, "$resultCallback");
        s.f(it2, "it");
        resultCallback.onResult(it2);
    }

    public static /* synthetic */ void a(ResultCallback resultCallback, Result result) {
        m142_init_$lambda0(resultCallback, result);
    }

    @InjectorKey
    private static /* synthetic */ void getInjectorKey$annotations() {
    }

    public static /* synthetic */ void present$default(GooglePayPaymentMethodLauncher googlePayPaymentMethodLauncher, String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            str2 = null;
        }
        googlePayPaymentMethodLauncher.present(str, i11, str2);
    }

    public final void present(String currencyCode) {
        s.g(currencyCode, "currencyCode");
        present$default(this, currencyCode, 0, null, 6, null);
    }

    public final void present(String currencyCode, int i11) {
        s.g(currencyCode, "currencyCode");
        present$default(this, currencyCode, i11, null, 4, null);
    }

    public final void present(String currencyCode, int i11, String str) {
        s.g(currencyCode, "currencyCode");
        if (this.skipReadyCheck || this.isReady) {
            this.activityResultLauncher.b(new GooglePayPaymentMethodLauncherContract.Args(this.config, currencyCode, i11, str, new GooglePayPaymentMethodLauncherContract.Args.InjectionParams(this.injectorKey, this.productUsage, this.enableLogging, this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke())));
            return;
        }
        throw new IllegalStateException("present() may only be called when Google Pay is available on this device.".toString());
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

        public final boolean component1() {
            return this.isRequired;
        }

        public final Format component2() {
            return this.format;
        }

        public final boolean component3() {
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

        public final Format getFormat() {
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

        public final boolean isPhoneNumberRequired() {
            return this.isPhoneNumberRequired;
        }

        public final boolean isRequired() {
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
    public /* synthetic */ GooglePayPaymentMethodLauncher(v20.o0 r23, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config r24, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ReadyCallback r25, androidx.activity.result.d r26, boolean r27, android.content.Context r28, h00.l r29, java.util.Set r30, h00.a r31, h00.a r32, boolean r33, zz.g r34, com.stripe.android.networking.PaymentAnalyticsRequestFactory r35, com.stripe.android.core.networking.AnalyticsRequestExecutor r36, com.stripe.android.networking.StripeRepository r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r22 = this;
            r10 = r28
            r0 = r38
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto Lb
            r1 = 0
            r5 = r1
            goto Ld
        Lb:
            r5 = r33
        Ld:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L18
            v20.j0 r1 = v20.e1.b()
            r17 = r1
            goto L1a
        L18:
            r17 = r34
        L1a:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            java.lang.String r2 = "GooglePayPaymentMethodLauncher"
            if (r1 == 0) goto L36
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r1 = new com.stripe.android.networking.PaymentAnalyticsRequestFactory
            com.stripe.android.PaymentConfiguration$Companion r3 = com.stripe.android.PaymentConfiguration.Companion
            com.stripe.android.PaymentConfiguration r3 = r3.getInstance(r10)
            java.lang.String r3 = r3.getPublishableKey()
            java.util.Set r4 = wz.v0.c(r2)
            r1.<init>(r10, r3, r4)
            r18 = r1
            goto L38
        L36:
            r18 = r35
        L38:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L44
            com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor r1 = new com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor
            r1.<init>()
            r19 = r1
            goto L46
        L44:
            r19 = r36
        L46:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L74
            com.stripe.android.networking.StripeApiRepository r20 = new com.stripe.android.networking.StripeApiRepository
            r0 = r20
            r3 = 0
            com.stripe.android.core.Logger$Companion r1 = com.stripe.android.core.Logger.Companion
            com.stripe.android.core.Logger r4 = r1.getInstance(r5)
            java.util.Set r6 = wz.v0.c(r2)
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 15812(0x3dc4, float:2.2157E-41)
            r16 = 0
            r1 = r28
            r2 = r31
            r21 = r5
            r5 = r17
            r10 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r15 = r20
            goto L78
        L74:
            r21 = r5
            r15 = r37
        L78:
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r21
            r12 = r17
            r13 = r18
            r14 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.<init>(v20.o0, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Config, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$ReadyCallback, androidx.activity.result.d, boolean, android.content.Context, h00.l, java.util.Set, h00.a, h00.a, boolean, zz.g, com.stripe.android.networking.PaymentAnalyticsRequestFactory, com.stripe.android.core.networking.AnalyticsRequestExecutor, com.stripe.android.networking.StripeRepository, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayPaymentMethodLauncher(ComponentActivity activity, Config config, ReadyCallback readyCallback, ResultCallback resultCallback) {
        this(activity, w.a(activity), activity, config, readyCallback, resultCallback);
        s.g(activity, "activity");
        s.g(config, "config");
        s.g(readyCallback, "readyCallback");
        s.g(resultCallback, "resultCallback");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GooglePayPaymentMethodLauncher(androidx.fragment.app.Fragment r9, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config r10, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ReadyCallback r11, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ResultCallback r12) {
        /*
            r8 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.s.g(r9, r0)
            java.lang.String r0 = "config"
            kotlin.jvm.internal.s.g(r10, r0)
            java.lang.String r0 = "readyCallback"
            kotlin.jvm.internal.s.g(r11, r0)
            java.lang.String r0 = "resultCallback"
            kotlin.jvm.internal.s.g(r12, r0)
            android.content.Context r2 = r9.requireContext()
            java.lang.String r0 = "fragment.requireContext()"
            kotlin.jvm.internal.s.f(r2, r0)
            androidx.lifecycle.v r0 = r9.getViewLifecycleOwner()
            java.lang.String r1 = "fragment.viewLifecycleOwner"
            kotlin.jvm.internal.s.f(r0, r1)
            androidx.lifecycle.q r3 = androidx.lifecycle.w.a(r0)
            r1 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.<init>(androidx.fragment.app.Fragment, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Config, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$ReadyCallback, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$ResultCallback):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private GooglePayPaymentMethodLauncher(android.content.Context r19, v20.o0 r20, androidx.activity.result.c r21, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config r22, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ReadyCallback r23, final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ResultCallback r24) {
        /*
            r18 = this;
            r5 = r19
            r0 = r18
            r6 = r19
            r1 = r20
            r2 = r22
            r3 = r23
            com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract r4 = new com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract
            r4.<init>()
            com.stripe.android.googlepaylauncher.e r7 = new com.stripe.android.googlepaylauncher.e
            r8 = r24
            r7.<init>()
            r8 = r21
            androidx.activity.result.d r7 = r8.registerForActivityResult(r4, r7)
            r4 = r7
            java.lang.String r8 = "activityResultCaller.reg…ck.onResult(it)\n        }"
            kotlin.jvm.internal.s.f(r7, r8)
            com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$2 r8 = new com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$2
            r7 = r8
            r9 = r22
            r8.<init>(r5, r9)
            java.lang.String r8 = "GooglePayPaymentMethodLauncher"
            java.util.Set r8 = wz.v0.c(r8)
            com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$3 r10 = new com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$3
            r9 = r10
            r10.<init>(r5)
            com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$4 r11 = new com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$4
            r10 = r11
            r11.<init>(r5)
            r5 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 31744(0x7c00, float:4.4483E-41)
            r17 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.<init>(android.content.Context, v20.o0, androidx.activity.result.c, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Config, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$ReadyCallback, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$ResultCallback):void");
    }
}