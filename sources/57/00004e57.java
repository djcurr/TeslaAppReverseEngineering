package com.stripe.android.googlepaylauncher;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.InjectableKtxKt;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.injection.DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent;
import com.stripe.android.networking.StripeRepository;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import wz.w0;

/* loaded from: classes6.dex */
public final class GooglePayPaymentMethodLauncherViewModel extends p0 {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String HAS_LAUNCHED_KEY = "has_launched";
    private final f0<GooglePayPaymentMethodLauncher.Result> _googleResult;
    private final GooglePayPaymentMethodLauncherContract.Args args;
    private final GooglePayJsonFactory googlePayJsonFactory;
    private final GooglePayRepository googlePayRepository;
    private final LiveData<GooglePayPaymentMethodLauncher.Result> googlePayResult;
    private final PaymentsClient paymentsClient;
    private final ApiRequest.Options requestOptions;
    private final l0 savedStateHandle;
    private final StripeRepository stripeRepository;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Factory extends androidx.lifecycle.a implements Injectable<FallbackInjectionParams> {
        private final Application application;
        private final GooglePayPaymentMethodLauncherContract.Args args;
        public GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder subComponentBuilder;

        /* loaded from: classes6.dex */
        public static final class FallbackInjectionParams {
            private final Application application;
            private final boolean enableLogging;
            private final Set<String> productUsage;
            private final String publishableKey;
            private final String stripeAccountId;

            public FallbackInjectionParams(Application application, boolean z11, String publishableKey, String str, Set<String> productUsage) {
                s.g(application, "application");
                s.g(publishableKey, "publishableKey");
                s.g(productUsage, "productUsage");
                this.application = application;
                this.enableLogging = z11;
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.productUsage = productUsage;
            }

            public static /* synthetic */ FallbackInjectionParams copy$default(FallbackInjectionParams fallbackInjectionParams, Application application, boolean z11, String str, String str2, Set set, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    application = fallbackInjectionParams.application;
                }
                if ((i11 & 2) != 0) {
                    z11 = fallbackInjectionParams.enableLogging;
                }
                boolean z12 = z11;
                if ((i11 & 4) != 0) {
                    str = fallbackInjectionParams.publishableKey;
                }
                String str3 = str;
                if ((i11 & 8) != 0) {
                    str2 = fallbackInjectionParams.stripeAccountId;
                }
                String str4 = str2;
                Set<String> set2 = set;
                if ((i11 & 16) != 0) {
                    set2 = fallbackInjectionParams.productUsage;
                }
                return fallbackInjectionParams.copy(application, z12, str3, str4, set2);
            }

            public final Application component1() {
                return this.application;
            }

            public final boolean component2() {
                return this.enableLogging;
            }

            public final String component3() {
                return this.publishableKey;
            }

            public final String component4() {
                return this.stripeAccountId;
            }

            public final Set<String> component5() {
                return this.productUsage;
            }

            public final FallbackInjectionParams copy(Application application, boolean z11, String publishableKey, String str, Set<String> productUsage) {
                s.g(application, "application");
                s.g(publishableKey, "publishableKey");
                s.g(productUsage, "productUsage");
                return new FallbackInjectionParams(application, z11, publishableKey, str, productUsage);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof FallbackInjectionParams) {
                    FallbackInjectionParams fallbackInjectionParams = (FallbackInjectionParams) obj;
                    return s.c(this.application, fallbackInjectionParams.application) && this.enableLogging == fallbackInjectionParams.enableLogging && s.c(this.publishableKey, fallbackInjectionParams.publishableKey) && s.c(this.stripeAccountId, fallbackInjectionParams.stripeAccountId) && s.c(this.productUsage, fallbackInjectionParams.productUsage);
                }
                return false;
            }

            public final Application getApplication() {
                return this.application;
            }

            public final boolean getEnableLogging() {
                return this.enableLogging;
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
                int hashCode = this.application.hashCode() * 31;
                boolean z11 = this.enableLogging;
                int i11 = z11;
                if (z11 != 0) {
                    i11 = 1;
                }
                int hashCode2 = (((hashCode + i11) * 31) + this.publishableKey.hashCode()) * 31;
                String str = this.stripeAccountId;
                return ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "FallbackInjectionParams(application=" + this.application + ", enableLogging=" + this.enableLogging + ", publishableKey=" + this.publishableKey + ", stripeAccountId=" + ((Object) this.stripeAccountId) + ", productUsage=" + this.productUsage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        public /* synthetic */ Factory(Application application, GooglePayPaymentMethodLauncherContract.Args args, androidx.savedstate.c cVar, Bundle bundle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(application, args, cVar, (i11 & 8) != 0 ? null : bundle);
        }

        @Override // androidx.lifecycle.a
        protected <T extends p0> T create(String key, Class<T> modelClass, l0 savedStateHandle) {
            String stripeAccountId;
            s.g(key, "key");
            s.g(modelClass, "modelClass");
            s.g(savedStateHandle, "savedStateHandle");
            GooglePayPaymentMethodLauncherContract.Args.InjectionParams injectionParams$payments_core_release = this.args.getInjectionParams$payments_core_release();
            String injectorKey = injectionParams$payments_core_release == null ? null : injectionParams$payments_core_release.getInjectorKey();
            Application application = this.application;
            GooglePayPaymentMethodLauncherContract.Args.InjectionParams injectionParams$payments_core_release2 = this.args.getInjectionParams$payments_core_release();
            boolean enableLogging = injectionParams$payments_core_release2 == null ? false : injectionParams$payments_core_release2.getEnableLogging();
            GooglePayPaymentMethodLauncherContract.Args.InjectionParams injectionParams$payments_core_release3 = this.args.getInjectionParams$payments_core_release();
            String publishableKey = injectionParams$payments_core_release3 == null ? null : injectionParams$payments_core_release3.getPublishableKey();
            if (publishableKey == null) {
                publishableKey = PaymentConfiguration.Companion.getInstance(this.application).getPublishableKey();
            }
            String str = publishableKey;
            if (this.args.getInjectionParams$payments_core_release() != null) {
                stripeAccountId = this.args.getInjectionParams$payments_core_release().getStripeAccountId();
            } else {
                stripeAccountId = PaymentConfiguration.Companion.getInstance(this.application).getStripeAccountId();
            }
            String str2 = stripeAccountId;
            GooglePayPaymentMethodLauncherContract.Args.InjectionParams injectionParams$payments_core_release4 = this.args.getInjectionParams$payments_core_release();
            Set<String> productUsage = injectionParams$payments_core_release4 != null ? injectionParams$payments_core_release4.getProductUsage() : null;
            if (productUsage == null) {
                productUsage = w0.c(GooglePayPaymentMethodLauncher.PRODUCT_USAGE_TOKEN);
            }
            InjectableKtxKt.injectWithFallback(this, injectorKey, new FallbackInjectionParams(application, enableLogging, str, str2, productUsage));
            return getSubComponentBuilder().args(this.args).savedStateHandle(savedStateHandle).build().getViewModel();
        }

        public final GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder getSubComponentBuilder() {
            GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder builder = this.subComponentBuilder;
            if (builder != null) {
                return builder;
            }
            s.x("subComponentBuilder");
            return null;
        }

        public final void setSubComponentBuilder(GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder builder) {
            s.g(builder, "<set-?>");
            this.subComponentBuilder = builder;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Factory(Application application, GooglePayPaymentMethodLauncherContract.Args args, androidx.savedstate.c owner, Bundle bundle) {
            super(owner, bundle);
            s.g(application, "application");
            s.g(args, "args");
            s.g(owner, "owner");
            this.application = application;
            this.args = args;
        }

        @Override // com.stripe.android.core.injection.Injectable
        public void fallbackInitialize(FallbackInjectionParams arg) {
            s.g(arg, "arg");
            DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent.builder().context(arg.getApplication()).enableLogging(arg.getEnableLogging()).publishableKeyProvider(new GooglePayPaymentMethodLauncherViewModel$Factory$fallbackInitialize$1(arg)).stripeAccountIdProvider(new GooglePayPaymentMethodLauncherViewModel$Factory$fallbackInitialize$2(arg)).productUsage(arg.getProductUsage()).googlePayConfig(this.args.getConfig$payments_core_release()).build().inject(this);
        }
    }

    public GooglePayPaymentMethodLauncherViewModel(PaymentsClient paymentsClient, ApiRequest.Options requestOptions, GooglePayPaymentMethodLauncherContract.Args args, StripeRepository stripeRepository, GooglePayJsonFactory googlePayJsonFactory, GooglePayRepository googlePayRepository, l0 savedStateHandle) {
        s.g(paymentsClient, "paymentsClient");
        s.g(requestOptions, "requestOptions");
        s.g(args, "args");
        s.g(stripeRepository, "stripeRepository");
        s.g(googlePayJsonFactory, "googlePayJsonFactory");
        s.g(googlePayRepository, "googlePayRepository");
        s.g(savedStateHandle, "savedStateHandle");
        this.paymentsClient = paymentsClient;
        this.requestOptions = requestOptions;
        this.args = args;
        this.stripeRepository = stripeRepository;
        this.googlePayJsonFactory = googlePayJsonFactory;
        this.googlePayRepository = googlePayRepository;
        this.savedStateHandle = savedStateHandle;
        f0<GooglePayPaymentMethodLauncher.Result> f0Var = new f0<>();
        this._googleResult = f0Var;
        LiveData<GooglePayPaymentMethodLauncher.Result> a11 = o0.a(f0Var);
        s.f(a11, "distinctUntilChanged(this)");
        this.googlePayResult = a11;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createLoadPaymentDataTask(zz.d<? super com.google.android.gms.tasks.Task<com.google.android.gms.wallet.PaymentData>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel$createLoadPaymentDataTask$1
            if (r0 == 0) goto L13
            r0 = r5
            com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel$createLoadPaymentDataTask$1 r0 = (com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel$createLoadPaymentDataTask$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel$createLoadPaymentDataTask$1 r0 = new com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel$createLoadPaymentDataTask$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel r0 = (com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel) r0
            vz.r.b(r5)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            vz.r.b(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.isReadyToPay(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L64
            com.google.android.gms.wallet.PaymentsClient r5 = r0.paymentsClient
            org.json.JSONObject r0 = r0.createPaymentDataRequest()
            java.lang.String r0 = r0.toString()
            com.google.android.gms.wallet.PaymentDataRequest r0 = com.google.android.gms.wallet.PaymentDataRequest.fromJson(r0)
            com.google.android.gms.tasks.Task r5 = r5.loadPaymentData(r0)
            java.lang.String r0 = "paymentsClient.loadPayme…t().toString())\n        )"
            kotlin.jvm.internal.s.f(r5, r0)
            return r5
        L64:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Google Pay is unavailable."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel.createLoadPaymentDataTask(zz.d):java.lang.Object");
    }

    public final JSONObject createPaymentDataRequest() {
        return GooglePayJsonFactory.createPaymentDataRequest$default(this.googlePayJsonFactory, createTransactionInfo$payments_core_release(this.args), GooglePayConfigConversionKtxKt.convert(this.args.getConfig$payments_core_release().getBillingAddressConfig()), null, this.args.getConfig$payments_core_release().isEmailRequired(), new GooglePayJsonFactory.MerchantInfo(this.args.getConfig$payments_core_release().getMerchantName()), Boolean.valueOf(this.args.getConfig$payments_core_release().getAllowCreditCards()), 4, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(5:5|6|7|(1:(1:10)(2:28|29))(3:30|31|(1:33))|(3:12|13|(2:15|16)(4:18|(1:20)(2:23|(1:25))|21|22))(2:26|27)))|36|6|7|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
        r6 = vz.q.f54772b;
        r5 = vz.q.b(vz.r.a(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x0025, B:20:0x0054, B:21:0x005b, B:22:0x0066, B:16:0x0043), top: B:36:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x0025, B:20:0x0054, B:21:0x005b, B:22:0x0066, B:16:0x0043), top: B:36:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createPaymentMethod(com.google.android.gms.wallet.PaymentData r5, zz.d<? super com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1 r0 = (com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1 r0 = new com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r6)     // Catch: java.lang.Throwable -> L67
            goto L52
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            vz.r.b(r6)
            org.json.JSONObject r6 = new org.json.JSONObject
            java.lang.String r5 = r5.toJson()
            r6.<init>(r5)
            com.stripe.android.model.PaymentMethodCreateParams$Companion r5 = com.stripe.android.model.PaymentMethodCreateParams.Companion
            com.stripe.android.model.PaymentMethodCreateParams r5 = r5.createFromGooglePay(r6)
            vz.q$a r6 = vz.q.f54772b     // Catch: java.lang.Throwable -> L67
            com.stripe.android.networking.StripeRepository r6 = r4.stripeRepository     // Catch: java.lang.Throwable -> L67
            com.stripe.android.core.networking.ApiRequest$Options r2 = r4.requestOptions     // Catch: java.lang.Throwable -> L67
            r0.label = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r6 = r6.createPaymentMethod(r5, r2, r0)     // Catch: java.lang.Throwable -> L67
            if (r6 != r1) goto L52
            return r1
        L52:
            if (r6 == 0) goto L5b
            com.stripe.android.model.PaymentMethod r6 = (com.stripe.android.model.PaymentMethod) r6     // Catch: java.lang.Throwable -> L67
            java.lang.Object r5 = vz.q.b(r6)     // Catch: java.lang.Throwable -> L67
            goto L72
        L5b:
            java.lang.String r5 = "Required value was null."
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L67
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L67
            throw r6     // Catch: java.lang.Throwable -> L67
        L67:
            r5 = move-exception
            vz.q$a r6 = vz.q.f54772b
            java.lang.Object r5 = vz.r.a(r5)
            java.lang.Object r5 = vz.q.b(r5)
        L72:
            java.lang.Throwable r6 = vz.q.e(r5)
            if (r6 != 0) goto L80
            com.stripe.android.model.PaymentMethod r5 = (com.stripe.android.model.PaymentMethod) r5
            com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Result$Completed r6 = new com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Result$Completed
            r6.<init>(r5)
            goto L91
        L80:
            com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Result$Failed r5 = new com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Result$Failed
            boolean r0 = r6 instanceof com.stripe.android.core.exception.APIConnectionException
            if (r0 == 0) goto L88
            r3 = 3
            goto L8d
        L88:
            boolean r0 = r6 instanceof com.stripe.android.core.exception.InvalidRequestException
            if (r0 == 0) goto L8d
            r3 = 2
        L8d:
            r5.<init>(r6, r3)
            r6 = r5
        L91:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel.createPaymentMethod(com.google.android.gms.wallet.PaymentData, zz.d):java.lang.Object");
    }

    public final GooglePayJsonFactory.TransactionInfo createTransactionInfo$payments_core_release(GooglePayPaymentMethodLauncherContract.Args args) {
        s.g(args, "args");
        return new GooglePayJsonFactory.TransactionInfo(args.getCurrencyCode$payments_core_release(), GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Estimated, args.getConfig$payments_core_release().getMerchantCountryCode(), args.getTransactionId$payments_core_release(), Integer.valueOf(args.getAmount$payments_core_release()), null, GooglePayJsonFactory.TransactionInfo.CheckoutOption.Default, 32, null);
    }

    public final LiveData<GooglePayPaymentMethodLauncher.Result> getGooglePayResult$payments_core_release() {
        return this.googlePayResult;
    }

    public final boolean getHasLaunched$payments_core_release() {
        return s.c(this.savedStateHandle.c("has_launched"), Boolean.TRUE);
    }

    public final Object isReadyToPay(zz.d<? super Boolean> dVar) {
        return kotlinx.coroutines.flow.g.r(this.googlePayRepository.isReady(), dVar);
    }

    public final void setHasLaunched$payments_core_release(boolean z11) {
        this.savedStateHandle.h("has_launched", Boolean.valueOf(z11));
    }

    public final void updateResult(GooglePayPaymentMethodLauncher.Result result) {
        s.g(result, "result");
        this._googleResult.setValue(result);
    }
}