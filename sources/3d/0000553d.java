package com.stripe.android.paymentsheet;

import android.app.Application;
import androidx.lifecycle.l0;
import com.stripe.android.core.Logger;
import com.stripe.android.link.injection.LinkPaymentLauncherFactory;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import javax.inject.Provider;

/* renamed from: com.stripe.android.paymentsheet.PaymentOptionsViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1426PaymentOptionsViewModel_Factory implements tw.e<PaymentOptionsViewModel> {
    private final Provider<Application> applicationProvider;
    private final Provider<PaymentOptionContract.Args> argsProvider;
    private final Provider<CustomerRepository> customerRepositoryProvider;
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<String> injectorKeyProvider;
    private final Provider<LinkPaymentLauncherFactory> linkPaymentLauncherFactoryProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<h00.l<PaymentSheet.CustomerConfiguration, PrefsRepository>> prefsRepositoryFactoryProvider;
    private final Provider<ResourceRepository> resourceRepositoryProvider;
    private final Provider<l0> savedStateHandleProvider;
    private final Provider<zz.g> workContextProvider;

    public C1426PaymentOptionsViewModel_Factory(Provider<PaymentOptionContract.Args> provider, Provider<h00.l<PaymentSheet.CustomerConfiguration, PrefsRepository>> provider2, Provider<EventReporter> provider3, Provider<CustomerRepository> provider4, Provider<zz.g> provider5, Provider<Application> provider6, Provider<Logger> provider7, Provider<String> provider8, Provider<ResourceRepository> provider9, Provider<l0> provider10, Provider<LinkPaymentLauncherFactory> provider11) {
        this.argsProvider = provider;
        this.prefsRepositoryFactoryProvider = provider2;
        this.eventReporterProvider = provider3;
        this.customerRepositoryProvider = provider4;
        this.workContextProvider = provider5;
        this.applicationProvider = provider6;
        this.loggerProvider = provider7;
        this.injectorKeyProvider = provider8;
        this.resourceRepositoryProvider = provider9;
        this.savedStateHandleProvider = provider10;
        this.linkPaymentLauncherFactoryProvider = provider11;
    }

    public static C1426PaymentOptionsViewModel_Factory create(Provider<PaymentOptionContract.Args> provider, Provider<h00.l<PaymentSheet.CustomerConfiguration, PrefsRepository>> provider2, Provider<EventReporter> provider3, Provider<CustomerRepository> provider4, Provider<zz.g> provider5, Provider<Application> provider6, Provider<Logger> provider7, Provider<String> provider8, Provider<ResourceRepository> provider9, Provider<l0> provider10, Provider<LinkPaymentLauncherFactory> provider11) {
        return new C1426PaymentOptionsViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static PaymentOptionsViewModel newInstance(PaymentOptionContract.Args args, h00.l<PaymentSheet.CustomerConfiguration, PrefsRepository> lVar, EventReporter eventReporter, CustomerRepository customerRepository, zz.g gVar, Application application, Logger logger, String str, ResourceRepository resourceRepository, l0 l0Var, LinkPaymentLauncherFactory linkPaymentLauncherFactory) {
        return new PaymentOptionsViewModel(args, lVar, eventReporter, customerRepository, gVar, application, logger, str, resourceRepository, l0Var, linkPaymentLauncherFactory);
    }

    @Override // javax.inject.Provider
    public PaymentOptionsViewModel get() {
        return newInstance(this.argsProvider.get(), this.prefsRepositoryFactoryProvider.get(), this.eventReporterProvider.get(), this.customerRepositoryProvider.get(), this.workContextProvider.get(), this.applicationProvider.get(), this.loggerProvider.get(), this.injectorKeyProvider.get(), this.resourceRepositoryProvider.get(), this.savedStateHandleProvider.get(), this.linkPaymentLauncherFactoryProvider.get());
    }
}