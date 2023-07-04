package com.stripe.android.link.ui.cardedit;

import com.stripe.android.core.Logger;
import com.stripe.android.link.injection.FormControllerSubcomponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.link.repositories.LinkRepository;
import javax.inject.Provider;
import tw.e;

/* renamed from: com.stripe.android.link.ui.cardedit.CardEditViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1418CardEditViewModel_Factory implements e<CardEditViewModel> {
    private final Provider<FormControllerSubcomponent.Builder> formControllerProvider;
    private final Provider<LinkAccount> linkAccountProvider;
    private final Provider<LinkRepository> linkRepositoryProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<Navigator> navigatorProvider;

    public C1418CardEditViewModel_Factory(Provider<LinkAccount> provider, Provider<LinkRepository> provider2, Provider<Navigator> provider3, Provider<Logger> provider4, Provider<FormControllerSubcomponent.Builder> provider5) {
        this.linkAccountProvider = provider;
        this.linkRepositoryProvider = provider2;
        this.navigatorProvider = provider3;
        this.loggerProvider = provider4;
        this.formControllerProvider = provider5;
    }

    public static C1418CardEditViewModel_Factory create(Provider<LinkAccount> provider, Provider<LinkRepository> provider2, Provider<Navigator> provider3, Provider<Logger> provider4, Provider<FormControllerSubcomponent.Builder> provider5) {
        return new C1418CardEditViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static CardEditViewModel newInstance(LinkAccount linkAccount, LinkRepository linkRepository, Navigator navigator, Logger logger, Provider<FormControllerSubcomponent.Builder> provider) {
        return new CardEditViewModel(linkAccount, linkRepository, navigator, logger, provider);
    }

    @Override // javax.inject.Provider
    public CardEditViewModel get() {
        return newInstance(this.linkAccountProvider.get(), this.linkRepositoryProvider.get(), this.navigatorProvider.get(), this.loggerProvider.get(), this.formControllerProvider);
    }
}