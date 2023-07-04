package com.stripe.android.link.injection;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.LinkPaymentLauncher_Factory;
import javax.inject.Provider;
import tw.f;

/* loaded from: classes6.dex */
public final class LinkPaymentLauncherFactory_Impl implements LinkPaymentLauncherFactory {
    private final LinkPaymentLauncher_Factory delegateFactory;

    LinkPaymentLauncherFactory_Impl(LinkPaymentLauncher_Factory linkPaymentLauncher_Factory) {
        this.delegateFactory = linkPaymentLauncher_Factory;
    }

    @Override // com.stripe.android.link.injection.LinkPaymentLauncherFactory
    public LinkPaymentLauncher create(String str, String str2) {
        return this.delegateFactory.get(str, str2);
    }

    public static Provider<LinkPaymentLauncherFactory> create(LinkPaymentLauncher_Factory linkPaymentLauncher_Factory) {
        return f.a(new LinkPaymentLauncherFactory_Impl(linkPaymentLauncher_Factory));
    }
}