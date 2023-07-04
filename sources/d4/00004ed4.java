package com.stripe.android.link;

import com.stripe.android.link.LinkActivityViewModel;
import javax.inject.Provider;
import sw.b;

/* loaded from: classes6.dex */
public final class LinkActivityViewModel_Factory_MembersInjector implements b<LinkActivityViewModel.Factory> {
    private final Provider<LinkActivityViewModel> viewModelProvider;

    public LinkActivityViewModel_Factory_MembersInjector(Provider<LinkActivityViewModel> provider) {
        this.viewModelProvider = provider;
    }

    public static b<LinkActivityViewModel.Factory> create(Provider<LinkActivityViewModel> provider) {
        return new LinkActivityViewModel_Factory_MembersInjector(provider);
    }

    public static void injectViewModel(LinkActivityViewModel.Factory factory, LinkActivityViewModel linkActivityViewModel) {
        factory.viewModel = linkActivityViewModel;
    }

    public void injectMembers(LinkActivityViewModel.Factory factory) {
        injectViewModel(factory, this.viewModelProvider.get());
    }
}