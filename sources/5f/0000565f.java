package com.stripe.android.paymentsheet.forms;

import com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import javax.inject.Provider;
import tw.e;

/* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1428FormViewModel_Factory implements e<FormViewModel> {
    private final Provider<FormFragmentArguments> configProvider;
    private final Provider<String> paymentMethodCodeProvider;
    private final Provider<ResourceRepository> resourceRepositoryProvider;
    private final Provider<TransformSpecToElement> transformSpecToElementProvider;

    public C1428FormViewModel_Factory(Provider<String> provider, Provider<FormFragmentArguments> provider2, Provider<ResourceRepository> provider3, Provider<TransformSpecToElement> provider4) {
        this.paymentMethodCodeProvider = provider;
        this.configProvider = provider2;
        this.resourceRepositoryProvider = provider3;
        this.transformSpecToElementProvider = provider4;
    }

    public static C1428FormViewModel_Factory create(Provider<String> provider, Provider<FormFragmentArguments> provider2, Provider<ResourceRepository> provider3, Provider<TransformSpecToElement> provider4) {
        return new C1428FormViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static FormViewModel newInstance(String str, FormFragmentArguments formFragmentArguments, ResourceRepository resourceRepository, TransformSpecToElement transformSpecToElement) {
        return new FormViewModel(str, formFragmentArguments, resourceRepository, transformSpecToElement);
    }

    @Override // javax.inject.Provider
    public FormViewModel get() {
        return newInstance(this.paymentMethodCodeProvider.get(), this.configProvider.get(), this.resourceRepositoryProvider.get(), this.transformSpecToElementProvider.get());
    }
}