package com.stripe.android.paymentsheet;

import android.app.Application;
import androidx.lifecycle.l0;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory;
import com.stripe.android.link.injection.LinkPaymentLauncherFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.paymentsheet.PaymentSheetContract;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.StripeIntentValidator;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import javax.inject.Provider;

/* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1427PaymentSheetViewModel_Factory implements tw.e<PaymentSheetViewModel> {
    private final Provider<Application> applicationProvider;
    private final Provider<PaymentSheetContract.Args> argsProvider;
    private final Provider<CustomerRepository> customerRepositoryProvider;
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider;
    private final Provider<String> injectorKeyProvider;
    private final Provider<LinkPaymentLauncherFactory> linkPaymentLauncherFactoryProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<PaymentConfiguration> paymentConfigProvider;
    private final Provider<StripePaymentLauncherAssistedFactory> paymentLauncherFactoryProvider;
    private final Provider<PrefsRepository> prefsRepositoryProvider;
    private final Provider<ResourceRepository> resourceRepositoryProvider;
    private final Provider<l0> savedStateHandleProvider;
    private final Provider<StripeIntentRepository> stripeIntentRepositoryProvider;
    private final Provider<StripeIntentValidator> stripeIntentValidatorProvider;
    private final Provider<zz.g> workContextProvider;

    public C1427PaymentSheetViewModel_Factory(Provider<Application> provider, Provider<PaymentSheetContract.Args> provider2, Provider<EventReporter> provider3, Provider<PaymentConfiguration> provider4, Provider<StripeIntentRepository> provider5, Provider<StripeIntentValidator> provider6, Provider<CustomerRepository> provider7, Provider<PrefsRepository> provider8, Provider<ResourceRepository> provider9, Provider<StripePaymentLauncherAssistedFactory> provider10, Provider<GooglePayPaymentMethodLauncherFactory> provider11, Provider<Logger> provider12, Provider<zz.g> provider13, Provider<String> provider14, Provider<l0> provider15, Provider<LinkPaymentLauncherFactory> provider16) {
        this.applicationProvider = provider;
        this.argsProvider = provider2;
        this.eventReporterProvider = provider3;
        this.paymentConfigProvider = provider4;
        this.stripeIntentRepositoryProvider = provider5;
        this.stripeIntentValidatorProvider = provider6;
        this.customerRepositoryProvider = provider7;
        this.prefsRepositoryProvider = provider8;
        this.resourceRepositoryProvider = provider9;
        this.paymentLauncherFactoryProvider = provider10;
        this.googlePayPaymentMethodLauncherFactoryProvider = provider11;
        this.loggerProvider = provider12;
        this.workContextProvider = provider13;
        this.injectorKeyProvider = provider14;
        this.savedStateHandleProvider = provider15;
        this.linkPaymentLauncherFactoryProvider = provider16;
    }

    public static C1427PaymentSheetViewModel_Factory create(Provider<Application> provider, Provider<PaymentSheetContract.Args> provider2, Provider<EventReporter> provider3, Provider<PaymentConfiguration> provider4, Provider<StripeIntentRepository> provider5, Provider<StripeIntentValidator> provider6, Provider<CustomerRepository> provider7, Provider<PrefsRepository> provider8, Provider<ResourceRepository> provider9, Provider<StripePaymentLauncherAssistedFactory> provider10, Provider<GooglePayPaymentMethodLauncherFactory> provider11, Provider<Logger> provider12, Provider<zz.g> provider13, Provider<String> provider14, Provider<l0> provider15, Provider<LinkPaymentLauncherFactory> provider16) {
        return new C1427PaymentSheetViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    public static PaymentSheetViewModel newInstance(Application application, PaymentSheetContract.Args args, EventReporter eventReporter, sw.a<PaymentConfiguration> aVar, StripeIntentRepository stripeIntentRepository, StripeIntentValidator stripeIntentValidator, CustomerRepository customerRepository, PrefsRepository prefsRepository, ResourceRepository resourceRepository, StripePaymentLauncherAssistedFactory stripePaymentLauncherAssistedFactory, GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory, Logger logger, zz.g gVar, String str, l0 l0Var, LinkPaymentLauncherFactory linkPaymentLauncherFactory) {
        return new PaymentSheetViewModel(application, args, eventReporter, aVar, stripeIntentRepository, stripeIntentValidator, customerRepository, prefsRepository, resourceRepository, stripePaymentLauncherAssistedFactory, googlePayPaymentMethodLauncherFactory, logger, gVar, str, l0Var, linkPaymentLauncherFactory);
    }

    @Override // javax.inject.Provider
    public PaymentSheetViewModel get() {
        return newInstance(this.applicationProvider.get(), this.argsProvider.get(), this.eventReporterProvider.get(), tw.d.a(this.paymentConfigProvider), this.stripeIntentRepositoryProvider.get(), this.stripeIntentValidatorProvider.get(), this.customerRepositoryProvider.get(), this.prefsRepositoryProvider.get(), this.resourceRepositoryProvider.get(), this.paymentLauncherFactoryProvider.get(), this.googlePayPaymentMethodLauncherFactoryProvider.get(), this.loggerProvider.get(), this.workContextProvider.get(), this.injectorKeyProvider.get(), this.savedStateHandleProvider.get(), this.linkPaymentLauncherFactoryProvider.get());
    }
}