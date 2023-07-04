package com.stripe.android.paymentsheet.analytics;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import javax.inject.Provider;
import tw.e;
import zz.g;

/* loaded from: classes6.dex */
public final class DefaultEventReporter_Factory implements e<DefaultEventReporter> {
    private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Provider<DeviceIdRepository> deviceIdRepositoryProvider;
    private final Provider<EventReporter.Mode> modeProvider;
    private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Provider<g> workContextProvider;

    public DefaultEventReporter_Factory(Provider<EventReporter.Mode> provider, Provider<DeviceIdRepository> provider2, Provider<AnalyticsRequestExecutor> provider3, Provider<PaymentAnalyticsRequestFactory> provider4, Provider<g> provider5) {
        this.modeProvider = provider;
        this.deviceIdRepositoryProvider = provider2;
        this.analyticsRequestExecutorProvider = provider3;
        this.paymentAnalyticsRequestFactoryProvider = provider4;
        this.workContextProvider = provider5;
    }

    public static DefaultEventReporter_Factory create(Provider<EventReporter.Mode> provider, Provider<DeviceIdRepository> provider2, Provider<AnalyticsRequestExecutor> provider3, Provider<PaymentAnalyticsRequestFactory> provider4, Provider<g> provider5) {
        return new DefaultEventReporter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DefaultEventReporter newInstance(EventReporter.Mode mode, DeviceIdRepository deviceIdRepository, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, g gVar) {
        return new DefaultEventReporter(mode, deviceIdRepository, analyticsRequestExecutor, paymentAnalyticsRequestFactory, gVar);
    }

    @Override // javax.inject.Provider
    public DefaultEventReporter get() {
        return newInstance(this.modeProvider.get(), this.deviceIdRepositoryProvider.get(), this.analyticsRequestExecutorProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.workContextProvider.get());
    }
}