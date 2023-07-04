package com.stripe.android.paymentsheet.flowcontroller;

import androidx.lifecycle.v;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.paymentsheet.PaymentOptionCallback;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import java.util.Set;
import javax.inject.Provider;
import tw.e;
import v20.o0;
import zz.g;

/* loaded from: classes6.dex */
public final class DefaultFlowController_Factory implements e<DefaultFlowController> {
    private final Provider<androidx.activity.result.c> activityResultCallerProvider;
    private final Provider<Boolean> enableLoggingProvider;
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<FlowControllerInitializer> flowControllerInitializerProvider;
    private final Provider<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider;
    private final Provider<String> injectorKeyProvider;
    private final Provider<PaymentConfiguration> lazyPaymentConfigurationProvider;
    private final Provider<v> lifecycleOwnerProvider;
    private final Provider<o0> lifecycleScopeProvider;
    private final Provider<StripePaymentLauncherAssistedFactory> paymentLauncherFactoryProvider;
    private final Provider<PaymentOptionCallback> paymentOptionCallbackProvider;
    private final Provider<PaymentOptionFactory> paymentOptionFactoryProvider;
    private final Provider<PaymentSheetResultCallback> paymentResultCallbackProvider;
    private final Provider<Set<String>> productUsageProvider;
    private final Provider<ResourceRepository> resourceRepositoryProvider;
    private final Provider<h00.a<Integer>> statusBarColorProvider;
    private final Provider<g> uiContextProvider;
    private final Provider<FlowControllerViewModel> viewModelProvider;

    public DefaultFlowController_Factory(Provider<o0> provider, Provider<v> provider2, Provider<h00.a<Integer>> provider3, Provider<PaymentOptionFactory> provider4, Provider<PaymentOptionCallback> provider5, Provider<PaymentSheetResultCallback> provider6, Provider<androidx.activity.result.c> provider7, Provider<String> provider8, Provider<FlowControllerInitializer> provider9, Provider<EventReporter> provider10, Provider<FlowControllerViewModel> provider11, Provider<StripePaymentLauncherAssistedFactory> provider12, Provider<ResourceRepository> provider13, Provider<PaymentConfiguration> provider14, Provider<g> provider15, Provider<Boolean> provider16, Provider<Set<String>> provider17, Provider<GooglePayPaymentMethodLauncherFactory> provider18) {
        this.lifecycleScopeProvider = provider;
        this.lifecycleOwnerProvider = provider2;
        this.statusBarColorProvider = provider3;
        this.paymentOptionFactoryProvider = provider4;
        this.paymentOptionCallbackProvider = provider5;
        this.paymentResultCallbackProvider = provider6;
        this.activityResultCallerProvider = provider7;
        this.injectorKeyProvider = provider8;
        this.flowControllerInitializerProvider = provider9;
        this.eventReporterProvider = provider10;
        this.viewModelProvider = provider11;
        this.paymentLauncherFactoryProvider = provider12;
        this.resourceRepositoryProvider = provider13;
        this.lazyPaymentConfigurationProvider = provider14;
        this.uiContextProvider = provider15;
        this.enableLoggingProvider = provider16;
        this.productUsageProvider = provider17;
        this.googlePayPaymentMethodLauncherFactoryProvider = provider18;
    }

    public static DefaultFlowController_Factory create(Provider<o0> provider, Provider<v> provider2, Provider<h00.a<Integer>> provider3, Provider<PaymentOptionFactory> provider4, Provider<PaymentOptionCallback> provider5, Provider<PaymentSheetResultCallback> provider6, Provider<androidx.activity.result.c> provider7, Provider<String> provider8, Provider<FlowControllerInitializer> provider9, Provider<EventReporter> provider10, Provider<FlowControllerViewModel> provider11, Provider<StripePaymentLauncherAssistedFactory> provider12, Provider<ResourceRepository> provider13, Provider<PaymentConfiguration> provider14, Provider<g> provider15, Provider<Boolean> provider16, Provider<Set<String>> provider17, Provider<GooglePayPaymentMethodLauncherFactory> provider18) {
        return new DefaultFlowController_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18);
    }

    public static DefaultFlowController newInstance(o0 o0Var, v vVar, h00.a<Integer> aVar, PaymentOptionFactory paymentOptionFactory, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentSheetResultCallback, androidx.activity.result.c cVar, String str, FlowControllerInitializer flowControllerInitializer, EventReporter eventReporter, FlowControllerViewModel flowControllerViewModel, StripePaymentLauncherAssistedFactory stripePaymentLauncherAssistedFactory, ResourceRepository resourceRepository, Provider<PaymentConfiguration> provider, g gVar, boolean z11, Set<String> set, GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory) {
        return new DefaultFlowController(o0Var, vVar, aVar, paymentOptionFactory, paymentOptionCallback, paymentSheetResultCallback, cVar, str, flowControllerInitializer, eventReporter, flowControllerViewModel, stripePaymentLauncherAssistedFactory, resourceRepository, provider, gVar, z11, set, googlePayPaymentMethodLauncherFactory);
    }

    @Override // javax.inject.Provider
    public DefaultFlowController get() {
        return newInstance(this.lifecycleScopeProvider.get(), this.lifecycleOwnerProvider.get(), this.statusBarColorProvider.get(), this.paymentOptionFactoryProvider.get(), this.paymentOptionCallbackProvider.get(), this.paymentResultCallbackProvider.get(), this.activityResultCallerProvider.get(), this.injectorKeyProvider.get(), this.flowControllerInitializerProvider.get(), this.eventReporterProvider.get(), this.viewModelProvider.get(), this.paymentLauncherFactoryProvider.get(), this.resourceRepositoryProvider.get(), this.lazyPaymentConfigurationProvider, this.uiContextProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.productUsageProvider.get(), this.googlePayPaymentMethodLauncherFactoryProvider.get());
    }
}