package com.stripe.android.link.ui.cardedit;

import com.stripe.android.link.injection.SignedInViewModelSubcomponent;
import com.stripe.android.link.ui.cardedit.CardEditViewModel;
import javax.inject.Provider;
import sw.b;

/* loaded from: classes6.dex */
public final class CardEditViewModel_Factory_MembersInjector implements b<CardEditViewModel.Factory> {
    private final Provider<SignedInViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public CardEditViewModel_Factory_MembersInjector(Provider<SignedInViewModelSubcomponent.Builder> provider) {
        this.subComponentBuilderProvider = provider;
    }

    public static b<CardEditViewModel.Factory> create(Provider<SignedInViewModelSubcomponent.Builder> provider) {
        return new CardEditViewModel_Factory_MembersInjector(provider);
    }

    public static void injectSubComponentBuilderProvider(CardEditViewModel.Factory factory, Provider<SignedInViewModelSubcomponent.Builder> provider) {
        factory.subComponentBuilderProvider = provider;
    }

    public void injectMembers(CardEditViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}