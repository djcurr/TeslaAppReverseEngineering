package com.stripe.android.link.injection;

import android.content.Context;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.forms.TransformSpecToElements;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class FormControllerModule_Companion_ProvideTransformSpecToElementsFactory implements e<TransformSpecToElements> {
    private final Provider<Context> contextProvider;
    private final Provider<Map<IdentifierSpec, String>> initialValuesProvider;
    private final Provider<ResourceRepository> resourceRepositoryProvider;
    private final Provider<LinkActivityContract.Args> starterArgsProvider;
    private final Provider<Set<IdentifierSpec>> viewOnlyFieldsProvider;

    public FormControllerModule_Companion_ProvideTransformSpecToElementsFactory(Provider<ResourceRepository> provider, Provider<Context> provider2, Provider<LinkActivityContract.Args> provider3, Provider<Map<IdentifierSpec, String>> provider4, Provider<Set<IdentifierSpec>> provider5) {
        this.resourceRepositoryProvider = provider;
        this.contextProvider = provider2;
        this.starterArgsProvider = provider3;
        this.initialValuesProvider = provider4;
        this.viewOnlyFieldsProvider = provider5;
    }

    public static FormControllerModule_Companion_ProvideTransformSpecToElementsFactory create(Provider<ResourceRepository> provider, Provider<Context> provider2, Provider<LinkActivityContract.Args> provider3, Provider<Map<IdentifierSpec, String>> provider4, Provider<Set<IdentifierSpec>> provider5) {
        return new FormControllerModule_Companion_ProvideTransformSpecToElementsFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static TransformSpecToElements provideTransformSpecToElements(ResourceRepository resourceRepository, Context context, LinkActivityContract.Args args, Map<IdentifierSpec, String> map, Set<IdentifierSpec> set) {
        return (TransformSpecToElements) h.e(FormControllerModule.Companion.provideTransformSpecToElements(resourceRepository, context, args, map, set));
    }

    @Override // javax.inject.Provider
    public TransformSpecToElements get() {
        return provideTransformSpecToElements(this.resourceRepositoryProvider.get(), this.contextProvider.get(), this.starterArgsProvider.get(), this.initialValuesProvider.get(), this.viewOnlyFieldsProvider.get());
    }
}