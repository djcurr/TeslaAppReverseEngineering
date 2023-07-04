package com.stripe.android.paymentsheet.forms;

import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent;
import javax.inject.Provider;
import sw.b;

/* loaded from: classes6.dex */
public final class FormViewModel_Factory_MembersInjector implements b<FormViewModel.Factory> {
    private final Provider<FormViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public FormViewModel_Factory_MembersInjector(Provider<FormViewModelSubcomponent.Builder> provider) {
        this.subComponentBuilderProvider = provider;
    }

    public static b<FormViewModel.Factory> create(Provider<FormViewModelSubcomponent.Builder> provider) {
        return new FormViewModel_Factory_MembersInjector(provider);
    }

    public static void injectSubComponentBuilderProvider(FormViewModel.Factory factory, Provider<FormViewModelSubcomponent.Builder> provider) {
        factory.subComponentBuilderProvider = provider;
    }

    public void injectMembers(FormViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}