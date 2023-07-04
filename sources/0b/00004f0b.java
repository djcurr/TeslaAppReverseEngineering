package com.stripe.android.link.account;

import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.repositories.LinkRepository;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes6.dex */
public final class LinkAccountManager_Factory implements e<LinkAccountManager> {
    private final Provider<LinkActivityContract.Args> argsProvider;
    private final Provider<CookieStore> cookieStoreProvider;
    private final Provider<LinkRepository> linkRepositoryProvider;

    public LinkAccountManager_Factory(Provider<LinkActivityContract.Args> provider, Provider<LinkRepository> provider2, Provider<CookieStore> provider3) {
        this.argsProvider = provider;
        this.linkRepositoryProvider = provider2;
        this.cookieStoreProvider = provider3;
    }

    public static LinkAccountManager_Factory create(Provider<LinkActivityContract.Args> provider, Provider<LinkRepository> provider2, Provider<CookieStore> provider3) {
        return new LinkAccountManager_Factory(provider, provider2, provider3);
    }

    public static LinkAccountManager newInstance(LinkActivityContract.Args args, LinkRepository linkRepository, CookieStore cookieStore) {
        return new LinkAccountManager(args, linkRepository, cookieStore);
    }

    @Override // javax.inject.Provider
    public LinkAccountManager get() {
        return newInstance(this.argsProvider.get(), this.linkRepositoryProvider.get(), this.cookieStoreProvider.get());
    }
}