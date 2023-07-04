package com.stripe.android.link.ui.wallet;

import com.stripe.android.link.injection.SignedInViewModelSubcomponent;
import com.stripe.android.link.ui.wallet.WalletViewModel;
import javax.inject.Provider;
import sw.b;

/* loaded from: classes6.dex */
public final class WalletViewModel_Factory_MembersInjector implements b<WalletViewModel.Factory> {
    private final Provider<SignedInViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public WalletViewModel_Factory_MembersInjector(Provider<SignedInViewModelSubcomponent.Builder> provider) {
        this.subComponentBuilderProvider = provider;
    }

    public static b<WalletViewModel.Factory> create(Provider<SignedInViewModelSubcomponent.Builder> provider) {
        return new WalletViewModel_Factory_MembersInjector(provider);
    }

    public static void injectSubComponentBuilderProvider(WalletViewModel.Factory factory, Provider<SignedInViewModelSubcomponent.Builder> provider) {
        factory.subComponentBuilderProvider = provider;
    }

    public void injectMembers(WalletViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}