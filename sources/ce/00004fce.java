package com.stripe.android.link.ui.forms;

import com.stripe.android.ui.core.elements.LayoutSpec;
import com.stripe.android.ui.core.forms.TransformSpecToElements;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import javax.inject.Provider;
import tw.e;
import v20.o0;

/* loaded from: classes6.dex */
public final class FormController_Factory implements e<FormController> {
    private final Provider<LayoutSpec> formSpecProvider;
    private final Provider<ResourceRepository> resourceRepositoryProvider;
    private final Provider<TransformSpecToElements> transformSpecToElementProvider;
    private final Provider<o0> viewModelScopeProvider;

    public FormController_Factory(Provider<LayoutSpec> provider, Provider<ResourceRepository> provider2, Provider<TransformSpecToElements> provider3, Provider<o0> provider4) {
        this.formSpecProvider = provider;
        this.resourceRepositoryProvider = provider2;
        this.transformSpecToElementProvider = provider3;
        this.viewModelScopeProvider = provider4;
    }

    public static FormController_Factory create(Provider<LayoutSpec> provider, Provider<ResourceRepository> provider2, Provider<TransformSpecToElements> provider3, Provider<o0> provider4) {
        return new FormController_Factory(provider, provider2, provider3, provider4);
    }

    public static FormController newInstance(LayoutSpec layoutSpec, ResourceRepository resourceRepository, TransformSpecToElements transformSpecToElements, o0 o0Var) {
        return new FormController(layoutSpec, resourceRepository, transformSpecToElements, o0Var);
    }

    @Override // javax.inject.Provider
    public FormController get() {
        return newInstance(this.formSpecProvider.get(), this.resourceRepositoryProvider.get(), this.transformSpecToElementProvider.get(), this.viewModelScopeProvider.get());
    }
}