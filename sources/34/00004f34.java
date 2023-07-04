package com.stripe.android.link.injection;

import java.util.Locale;
import tw.e;

/* loaded from: classes6.dex */
public final class LinkPaymentLauncherModule_Companion_ProvideLocaleFactory implements e<Locale> {

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final LinkPaymentLauncherModule_Companion_ProvideLocaleFactory INSTANCE = new LinkPaymentLauncherModule_Companion_ProvideLocaleFactory();

        private InstanceHolder() {
        }
    }

    public static LinkPaymentLauncherModule_Companion_ProvideLocaleFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Locale provideLocale() {
        return LinkPaymentLauncherModule.Companion.provideLocale();
    }

    @Override // javax.inject.Provider
    public Locale get() {
        return provideLocale();
    }
}