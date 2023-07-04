package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.core.Logger;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.model.StripeIntentValidator;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import h00.l;
import javax.inject.Provider;
import tw.e;
import zz.g;

/* loaded from: classes6.dex */
public final class DefaultFlowControllerInitializer_Factory implements e<DefaultFlowControllerInitializer> {
    private final Provider<CustomerRepository> customerRepositoryProvider;
    private final Provider<l<GooglePayEnvironment, GooglePayRepository>> googlePayRepositoryFactoryProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<l<PaymentSheet.CustomerConfiguration, PrefsRepository>> prefsRepositoryFactoryProvider;
    private final Provider<ResourceRepository> resourceRepositoryProvider;
    private final Provider<StripeIntentRepository> stripeIntentRepositoryProvider;
    private final Provider<StripeIntentValidator> stripeIntentValidatorProvider;
    private final Provider<g> workContextProvider;

    public DefaultFlowControllerInitializer_Factory(Provider<l<PaymentSheet.CustomerConfiguration, PrefsRepository>> provider, Provider<l<GooglePayEnvironment, GooglePayRepository>> provider2, Provider<StripeIntentRepository> provider3, Provider<StripeIntentValidator> provider4, Provider<CustomerRepository> provider5, Provider<ResourceRepository> provider6, Provider<Logger> provider7, Provider<g> provider8) {
        this.prefsRepositoryFactoryProvider = provider;
        this.googlePayRepositoryFactoryProvider = provider2;
        this.stripeIntentRepositoryProvider = provider3;
        this.stripeIntentValidatorProvider = provider4;
        this.customerRepositoryProvider = provider5;
        this.resourceRepositoryProvider = provider6;
        this.loggerProvider = provider7;
        this.workContextProvider = provider8;
    }

    public static DefaultFlowControllerInitializer_Factory create(Provider<l<PaymentSheet.CustomerConfiguration, PrefsRepository>> provider, Provider<l<GooglePayEnvironment, GooglePayRepository>> provider2, Provider<StripeIntentRepository> provider3, Provider<StripeIntentValidator> provider4, Provider<CustomerRepository> provider5, Provider<ResourceRepository> provider6, Provider<Logger> provider7, Provider<g> provider8) {
        return new DefaultFlowControllerInitializer_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static DefaultFlowControllerInitializer newInstance(l<PaymentSheet.CustomerConfiguration, PrefsRepository> lVar, l<GooglePayEnvironment, GooglePayRepository> lVar2, StripeIntentRepository stripeIntentRepository, StripeIntentValidator stripeIntentValidator, CustomerRepository customerRepository, ResourceRepository resourceRepository, Logger logger, g gVar) {
        return new DefaultFlowControllerInitializer(lVar, lVar2, stripeIntentRepository, stripeIntentValidator, customerRepository, resourceRepository, logger, gVar);
    }

    @Override // javax.inject.Provider
    public DefaultFlowControllerInitializer get() {
        return newInstance(this.prefsRepositoryFactoryProvider.get(), this.googlePayRepositoryFactoryProvider.get(), this.stripeIntentRepositoryProvider.get(), this.stripeIntentValidatorProvider.get(), this.customerRepositoryProvider.get(), this.resourceRepositoryProvider.get(), this.loggerProvider.get(), this.workContextProvider.get());
    }
}