package com.stripe.android.link.ui.inline;

import com.stripe.android.core.Logger;
import com.stripe.android.link.account.LinkAccountManager;
import javax.inject.Provider;
import tw.e;

/* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1419InlineSignupViewModel_Factory implements e<InlineSignupViewModel> {
    private final Provider<String> customerEmailProvider;
    private final Provider<LinkAccountManager> linkAccountManagerProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<String> merchantNameProvider;

    public C1419InlineSignupViewModel_Factory(Provider<String> provider, Provider<String> provider2, Provider<LinkAccountManager> provider3, Provider<Logger> provider4) {
        this.merchantNameProvider = provider;
        this.customerEmailProvider = provider2;
        this.linkAccountManagerProvider = provider3;
        this.loggerProvider = provider4;
    }

    public static C1419InlineSignupViewModel_Factory create(Provider<String> provider, Provider<String> provider2, Provider<LinkAccountManager> provider3, Provider<Logger> provider4) {
        return new C1419InlineSignupViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static InlineSignupViewModel newInstance(String str, String str2, LinkAccountManager linkAccountManager, Logger logger) {
        return new InlineSignupViewModel(str, str2, linkAccountManager, logger);
    }

    @Override // javax.inject.Provider
    public InlineSignupViewModel get() {
        return newInstance(this.merchantNameProvider.get(), this.customerEmailProvider.get(), this.linkAccountManagerProvider.get(), this.loggerProvider.get());
    }
}