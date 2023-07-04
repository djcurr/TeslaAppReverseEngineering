package com.stripe.android.payments.paymentlauncher;

import android.app.Application;
import androidx.lifecycle.f0;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.InjectableKtxKt;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.injection.DaggerPaymentLauncherViewModelFactoryComponent;
import com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.k;
import wz.v;
import zz.g;

/* loaded from: classes6.dex */
public final class PaymentLauncherViewModel extends p0 {
    public static final Companion Companion = new Companion(null);
    private static final List<String> EXPAND_PAYMENT_METHOD;
    public static final String KEY_HAS_STARTED = "key_has_started";
    public static final String REQUIRED_ERROR = "API request returned an invalid response.";
    public static final String TIMEOUT_ERROR = "Payment fails due to time out. \n";
    public static final String UNKNOWN_ERROR = "Payment fails due to unknown error. \n";
    private final DefaultAnalyticsRequestExecutor analyticsRequestExecutor;
    private final Provider<ApiRequest.Options> apiRequestOptionsProvider;
    private final PaymentAuthenticatorRegistry authenticatorRegistry;
    private final DefaultReturnUrl defaultReturnUrl;
    private final boolean isInstantApp;
    private final boolean isPaymentIntent;
    private final sw.a<PaymentIntentFlowResultProcessor> lazyPaymentIntentFlowResultProcessor;
    private final sw.a<SetupIntentFlowResultProcessor> lazySetupIntentFlowResultProcessor;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final f0<PaymentResult> paymentLauncherResult;
    private final l0 savedStateHandle;
    private final StripeRepository stripeApiRepository;
    private final Map<String, String> threeDs1IntentReturnUrlMap;
    private final g uiContext;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getKEY_HAS_STARTED$payments_core_release$annotations() {
        }

        public final List<String> getEXPAND_PAYMENT_METHOD() {
            return PaymentLauncherViewModel.EXPAND_PAYMENT_METHOD;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Factory extends androidx.lifecycle.a implements Injectable<FallbackInitializeParam> {
        private final h00.a<Application> applicationSupplier;
        private final h00.a<PaymentLauncherContract.Args> argsSupplier;
        public Provider<PaymentLauncherViewModelSubcomponent.Builder> subComponentBuilderProvider;

        /* loaded from: classes6.dex */
        public static final class FallbackInitializeParam {
            private final Application application;
            private final boolean enableLogging;
            private final Set<String> productUsage;
            private final String publishableKey;
            private final String stripeAccountId;

            public FallbackInitializeParam(Application application, boolean z11, String publishableKey, String str, Set<String> productUsage) {
                s.g(application, "application");
                s.g(publishableKey, "publishableKey");
                s.g(productUsage, "productUsage");
                this.application = application;
                this.enableLogging = z11;
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.productUsage = productUsage;
            }

            public static /* synthetic */ FallbackInitializeParam copy$default(FallbackInitializeParam fallbackInitializeParam, Application application, boolean z11, String str, String str2, Set set, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    application = fallbackInitializeParam.application;
                }
                if ((i11 & 2) != 0) {
                    z11 = fallbackInitializeParam.enableLogging;
                }
                boolean z12 = z11;
                if ((i11 & 4) != 0) {
                    str = fallbackInitializeParam.publishableKey;
                }
                String str3 = str;
                if ((i11 & 8) != 0) {
                    str2 = fallbackInitializeParam.stripeAccountId;
                }
                String str4 = str2;
                Set<String> set2 = set;
                if ((i11 & 16) != 0) {
                    set2 = fallbackInitializeParam.productUsage;
                }
                return fallbackInitializeParam.copy(application, z12, str3, str4, set2);
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

            public final FallbackInitializeParam copy(Application application, boolean z11, String publishableKey, String str, Set<String> productUsage) {
                s.g(application, "application");
                s.g(publishableKey, "publishableKey");
                s.g(productUsage, "productUsage");
                return new FallbackInitializeParam(application, z11, publishableKey, str, productUsage);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof FallbackInitializeParam) {
                    FallbackInitializeParam fallbackInitializeParam = (FallbackInitializeParam) obj;
                    return s.c(this.application, fallbackInitializeParam.application) && this.enableLogging == fallbackInitializeParam.enableLogging && s.c(this.publishableKey, fallbackInitializeParam.publishableKey) && s.c(this.stripeAccountId, fallbackInitializeParam.stripeAccountId) && s.c(this.productUsage, fallbackInitializeParam.productUsage);
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
                return "FallbackInitializeParam(application=" + this.application + ", enableLogging=" + this.enableLogging + ", publishableKey=" + this.publishableKey + ", stripeAccountId=" + ((Object) this.stripeAccountId) + ", productUsage=" + this.productUsage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Factory(h00.a<? extends PaymentLauncherContract.Args> argsSupplier, h00.a<? extends Application> applicationSupplier, androidx.savedstate.c owner) {
            super(owner, null);
            s.g(argsSupplier, "argsSupplier");
            s.g(applicationSupplier, "applicationSupplier");
            s.g(owner, "owner");
            this.argsSupplier = argsSupplier;
            this.applicationSupplier = applicationSupplier;
        }

        @Override // androidx.lifecycle.a
        protected <T extends p0> T create(String key, Class<T> modelClass, l0 handle) {
            s.g(key, "key");
            s.g(modelClass, "modelClass");
            s.g(handle, "handle");
            PaymentLauncherContract.Args invoke = this.argsSupplier.invoke();
            InjectableKtxKt.injectWithFallback(this, invoke.getInjectorKey(), new FallbackInitializeParam(this.applicationSupplier.invoke(), invoke.getEnableLogging(), invoke.getPublishableKey(), invoke.getStripeAccountId(), invoke.getProductUsage()));
            PaymentLauncherViewModelSubcomponent.Builder builder = getSubComponentBuilderProvider().get();
            boolean z11 = false;
            if (invoke instanceof PaymentLauncherContract.Args.IntentConfirmationArgs) {
                ConfirmStripeIntentParams confirmStripeIntentParams = ((PaymentLauncherContract.Args.IntentConfirmationArgs) invoke).getConfirmStripeIntentParams();
                if (!(confirmStripeIntentParams instanceof ConfirmPaymentIntentParams)) {
                    if (!(confirmStripeIntentParams instanceof ConfirmSetupIntentParams)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                z11 = true;
            } else {
                if (!(invoke instanceof PaymentLauncherContract.Args.PaymentIntentNextActionArgs)) {
                    if (!(invoke instanceof PaymentLauncherContract.Args.SetupIntentNextActionArgs)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                z11 = true;
            }
            return builder.isPaymentIntent(z11).savedStateHandle(handle).build().getViewModel();
        }

        public final Provider<PaymentLauncherViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            Provider<PaymentLauncherViewModelSubcomponent.Builder> provider = this.subComponentBuilderProvider;
            if (provider != null) {
                return provider;
            }
            s.x("subComponentBuilderProvider");
            return null;
        }

        public final void setSubComponentBuilderProvider(Provider<PaymentLauncherViewModelSubcomponent.Builder> provider) {
            s.g(provider, "<set-?>");
            this.subComponentBuilderProvider = provider;
        }

        @Override // com.stripe.android.core.injection.Injectable
        public void fallbackInitialize(FallbackInitializeParam arg) {
            s.g(arg, "arg");
            DaggerPaymentLauncherViewModelFactoryComponent.builder().context(arg.getApplication()).enableLogging(arg.getEnableLogging()).publishableKeyProvider(new PaymentLauncherViewModel$Factory$fallbackInitialize$1(arg)).stripeAccountIdProvider(new PaymentLauncherViewModel$Factory$fallbackInitialize$2(arg)).productUsage(arg.getProductUsage()).build().inject(this);
        }
    }

    static {
        List<String> d11;
        d11 = v.d("payment_method");
        EXPAND_PAYMENT_METHOD = d11;
    }

    public PaymentLauncherViewModel(boolean z11, StripeRepository stripeApiRepository, PaymentAuthenticatorRegistry authenticatorRegistry, DefaultReturnUrl defaultReturnUrl, Provider<ApiRequest.Options> apiRequestOptionsProvider, Map<String, String> threeDs1IntentReturnUrlMap, sw.a<PaymentIntentFlowResultProcessor> lazyPaymentIntentFlowResultProcessor, sw.a<SetupIntentFlowResultProcessor> lazySetupIntentFlowResultProcessor, DefaultAnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @UIContext g uiContext, l0 savedStateHandle, boolean z12) {
        s.g(stripeApiRepository, "stripeApiRepository");
        s.g(authenticatorRegistry, "authenticatorRegistry");
        s.g(defaultReturnUrl, "defaultReturnUrl");
        s.g(apiRequestOptionsProvider, "apiRequestOptionsProvider");
        s.g(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        s.g(lazyPaymentIntentFlowResultProcessor, "lazyPaymentIntentFlowResultProcessor");
        s.g(lazySetupIntentFlowResultProcessor, "lazySetupIntentFlowResultProcessor");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(uiContext, "uiContext");
        s.g(savedStateHandle, "savedStateHandle");
        this.isPaymentIntent = z11;
        this.stripeApiRepository = stripeApiRepository;
        this.authenticatorRegistry = authenticatorRegistry;
        this.defaultReturnUrl = defaultReturnUrl;
        this.apiRequestOptionsProvider = apiRequestOptionsProvider;
        this.threeDs1IntentReturnUrlMap = threeDs1IntentReturnUrlMap;
        this.lazyPaymentIntentFlowResultProcessor = lazyPaymentIntentFlowResultProcessor;
        this.lazySetupIntentFlowResultProcessor = lazySetupIntentFlowResultProcessor;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.uiContext = uiContext;
        this.savedStateHandle = savedStateHandle;
        this.isInstantApp = z12;
        this.paymentLauncherResult = new f0<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object confirmIntent(com.stripe.android.model.ConfirmStripeIntentParams r6, java.lang.String r7, zz.d<? super com.stripe.android.model.StripeIntent> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$confirmIntent$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$confirmIntent$1 r0 = (com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$confirmIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$confirmIntent$1 r0 = new com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$confirmIntent$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            vz.r.b(r8)
            goto L83
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            vz.r.b(r8)
            goto L62
        L38:
            vz.r.b(r8)
            r6.setReturnUrl(r7)
            com.stripe.android.model.ConfirmStripeIntentParams r6 = r6.withShouldUseStripeSdk(r4)
            boolean r7 = r6 instanceof com.stripe.android.model.ConfirmPaymentIntentParams
            java.lang.String r8 = "apiRequestOptionsProvider.get()"
            if (r7 == 0) goto L65
            com.stripe.android.networking.StripeRepository r7 = r5.stripeApiRepository
            com.stripe.android.model.ConfirmPaymentIntentParams r6 = (com.stripe.android.model.ConfirmPaymentIntentParams) r6
            javax.inject.Provider<com.stripe.android.core.networking.ApiRequest$Options> r2 = r5.apiRequestOptionsProvider
            java.lang.Object r2 = r2.get()
            kotlin.jvm.internal.s.f(r2, r8)
            com.stripe.android.core.networking.ApiRequest$Options r2 = (com.stripe.android.core.networking.ApiRequest.Options) r2
            java.util.List<java.lang.String> r8 = com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.EXPAND_PAYMENT_METHOD
            r0.label = r4
            java.lang.Object r8 = r7.confirmPaymentIntent$payments_core_release(r6, r2, r8, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            com.stripe.android.model.StripeIntent r8 = (com.stripe.android.model.StripeIntent) r8
            goto L85
        L65:
            boolean r7 = r6 instanceof com.stripe.android.model.ConfirmSetupIntentParams
            if (r7 == 0) goto L94
            com.stripe.android.networking.StripeRepository r7 = r5.stripeApiRepository
            com.stripe.android.model.ConfirmSetupIntentParams r6 = (com.stripe.android.model.ConfirmSetupIntentParams) r6
            javax.inject.Provider<com.stripe.android.core.networking.ApiRequest$Options> r2 = r5.apiRequestOptionsProvider
            java.lang.Object r2 = r2.get()
            kotlin.jvm.internal.s.f(r2, r8)
            com.stripe.android.core.networking.ApiRequest$Options r2 = (com.stripe.android.core.networking.ApiRequest.Options) r2
            java.util.List<java.lang.String> r8 = com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.EXPAND_PAYMENT_METHOD
            r0.label = r3
            java.lang.Object r8 = r7.confirmSetupIntent$payments_core_release(r6, r2, r8, r0)
            if (r8 != r1) goto L83
            return r1
        L83:
            com.stripe.android.model.StripeIntent r8 = (com.stripe.android.model.StripeIntent) r8
        L85:
            if (r8 == 0) goto L88
            return r8
        L88:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "API request returned an invalid response."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L94:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.confirmIntent(com.stripe.android.model.ConfirmStripeIntentParams, java.lang.String, zz.d):java.lang.Object");
    }

    private final boolean getHasStarted() {
        Boolean bool = (Boolean) this.savedStateHandle.c(KEY_HAS_STARTED);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logReturnUrl(String str) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        if (s.c(str, this.defaultReturnUrl.getValue())) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmReturnUrlDefault;
        } else if (str == null) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmReturnUrlNull;
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmReturnUrlCustom;
        }
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, paymentAnalyticsEvent, null, null, null, null, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postResult(StripeIntentResult<? extends StripeIntent> stripeIntentResult) {
        PaymentResult paymentResult;
        f0<PaymentResult> f0Var = this.paymentLauncherResult;
        int outcome = stripeIntentResult.getOutcome();
        if (outcome == 1) {
            paymentResult = PaymentResult.Completed.INSTANCE;
        } else if (outcome == 2) {
            paymentResult = new PaymentResult.Failed(new APIException(null, null, 0, stripeIntentResult.getFailureMessage(), null, 23, null));
        } else if (outcome == 3) {
            paymentResult = PaymentResult.Canceled.INSTANCE;
        } else if (outcome != 4) {
            paymentResult = new PaymentResult.Failed(new APIException(null, null, 0, s.p(UNKNOWN_ERROR, stripeIntentResult.getFailureMessage()), null, 23, null));
        } else {
            paymentResult = new PaymentResult.Failed(new APIException(null, null, 0, s.p(TIMEOUT_ERROR, stripeIntentResult.getFailureMessage()), null, 23, null));
        }
        f0Var.postValue(paymentResult);
    }

    public final void cleanUp$payments_core_release() {
        this.authenticatorRegistry.onLauncherInvalidated();
    }

    public final void confirmStripeIntent$payments_core_release(ConfirmStripeIntentParams confirmStripeIntentParams, AuthActivityStarterHost host) {
        s.g(confirmStripeIntentParams, "confirmStripeIntentParams");
        s.g(host, "host");
        if (getHasStarted()) {
            return;
        }
        k.d(q0.a(this), null, null, new PaymentLauncherViewModel$confirmStripeIntent$1(this, confirmStripeIntentParams, host, null), 3, null);
    }

    public final f0<PaymentResult> getPaymentLauncherResult$payments_core_release() {
        return this.paymentLauncherResult;
    }

    public final void handleNextActionForStripeIntent$payments_core_release(String clientSecret, AuthActivityStarterHost host) {
        s.g(clientSecret, "clientSecret");
        s.g(host, "host");
        if (getHasStarted()) {
            return;
        }
        k.d(q0.a(this), null, null, new PaymentLauncherViewModel$handleNextActionForStripeIntent$1(this, clientSecret, host, null), 3, null);
    }

    public final void onPaymentFlowResult$payments_core_release(PaymentFlowResult.Unvalidated paymentFlowResult) {
        s.g(paymentFlowResult, "paymentFlowResult");
        k.d(q0.a(this), null, null, new PaymentLauncherViewModel$onPaymentFlowResult$1(this, paymentFlowResult, null), 3, null);
    }

    public final void register$payments_core_release(androidx.activity.result.c caller) {
        s.g(caller, "caller");
        this.authenticatorRegistry.onNewActivityResultCaller(caller, new androidx.activity.result.b() { // from class: com.stripe.android.payments.paymentlauncher.c
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                PaymentLauncherViewModel.this.onPaymentFlowResult$payments_core_release((PaymentFlowResult.Unvalidated) obj);
            }
        });
    }
}