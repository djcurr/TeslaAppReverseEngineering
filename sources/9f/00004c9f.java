package com.stripe.android.core.injection;

import com.stripe.android.core.Logger;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes2.dex */
public final class LoggingModule_ProvideLoggerFactory implements e<Logger> {
    private final Provider<Boolean> enableLoggingProvider;
    private final LoggingModule module;

    public LoggingModule_ProvideLoggerFactory(LoggingModule loggingModule, Provider<Boolean> provider) {
        this.module = loggingModule;
        this.enableLoggingProvider = provider;
    }

    public static LoggingModule_ProvideLoggerFactory create(LoggingModule loggingModule, Provider<Boolean> provider) {
        return new LoggingModule_ProvideLoggerFactory(loggingModule, provider);
    }

    public static Logger provideLogger(LoggingModule loggingModule, boolean z11) {
        return (Logger) h.e(loggingModule.provideLogger(z11));
    }

    @Override // javax.inject.Provider
    public Logger get() {
        return provideLogger(this.module, this.enableLoggingProvider.get().booleanValue());
    }
}