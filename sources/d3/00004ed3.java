package com.stripe.android.link;

import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.confirmation.ConfirmationManager;
import com.stripe.android.link.model.Navigator;
import javax.inject.Provider;
import tw.e;

/* renamed from: com.stripe.android.link.LinkActivityViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1417LinkActivityViewModel_Factory implements e<LinkActivityViewModel> {
    private final Provider<LinkActivityContract.Args> argsProvider;
    private final Provider<ConfirmationManager> confirmationManagerProvider;
    private final Provider<LinkAccountManager> linkAccountManagerProvider;
    private final Provider<Navigator> navigatorProvider;

    public C1417LinkActivityViewModel_Factory(Provider<LinkActivityContract.Args> provider, Provider<LinkAccountManager> provider2, Provider<Navigator> provider3, Provider<ConfirmationManager> provider4) {
        this.argsProvider = provider;
        this.linkAccountManagerProvider = provider2;
        this.navigatorProvider = provider3;
        this.confirmationManagerProvider = provider4;
    }

    public static C1417LinkActivityViewModel_Factory create(Provider<LinkActivityContract.Args> provider, Provider<LinkAccountManager> provider2, Provider<Navigator> provider3, Provider<ConfirmationManager> provider4) {
        return new C1417LinkActivityViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static LinkActivityViewModel newInstance(LinkActivityContract.Args args, LinkAccountManager linkAccountManager, Navigator navigator, ConfirmationManager confirmationManager) {
        return new LinkActivityViewModel(args, linkAccountManager, navigator, confirmationManager);
    }

    @Override // javax.inject.Provider
    public LinkActivityViewModel get() {
        return newInstance(this.argsProvider.get(), this.linkAccountManagerProvider.get(), this.navigatorProvider.get(), this.confirmationManagerProvider.get());
    }
}