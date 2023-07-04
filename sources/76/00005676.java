package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import android.content.res.Resources;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.forms.FormViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.forms.TransformSpecToElement;
import com.stripe.android.paymentsheet.injection.FormViewModelComponent;
import com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent;
import com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments;
import com.stripe.android.ui.core.forms.resources.AsyncResourceRepository;
import com.stripe.android.ui.core.forms.resources.AsyncResourceRepository_Factory;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import java.util.Locale;
import javax.inject.Provider;
import tw.d;
import tw.f;
import tw.h;
import zz.g;

/* loaded from: classes6.dex */
public final class DaggerFormViewModelComponent implements FormViewModelComponent {
    private Provider<AsyncResourceRepository> asyncResourceRepositoryProvider;
    private final Context context;
    private final DaggerFormViewModelComponent formViewModelComponent;
    private Provider<FormViewModelSubcomponent.Builder> formViewModelSubcomponentBuilderProvider;
    private Provider<Locale> provideLocaleProvider;
    private Provider<g> provideWorkContextProvider;
    private Provider<Resources> resourcesProvider;

    /* loaded from: classes6.dex */
    private static final class Builder implements FormViewModelComponent.Builder {
        private Context context;
        private Resources resources;

        private Builder() {
        }

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelComponent.Builder
        public FormViewModelComponent build() {
            h.a(this.context, Context.class);
            h.a(this.resources, Resources.class);
            return new DaggerFormViewModelComponent(new CoroutineContextModule(), this.context, this.resources);
        }

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) h.b(context);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelComponent.Builder
        public Builder resources(Resources resources) {
            this.resources = (Resources) h.b(resources);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class FormViewModelSubcomponentBuilder implements FormViewModelSubcomponent.Builder {
        private FormFragmentArguments formFragmentArguments;
        private final DaggerFormViewModelComponent formViewModelComponent;
        private String paymentMethodCode;

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder
        public FormViewModelSubcomponent build() {
            h.a(this.paymentMethodCode, String.class);
            h.a(this.formFragmentArguments, FormFragmentArguments.class);
            return new FormViewModelSubcomponentImpl(this.paymentMethodCode, this.formFragmentArguments);
        }

        private FormViewModelSubcomponentBuilder(DaggerFormViewModelComponent daggerFormViewModelComponent) {
            this.formViewModelComponent = daggerFormViewModelComponent;
        }

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder
        public FormViewModelSubcomponentBuilder formFragmentArguments(FormFragmentArguments formFragmentArguments) {
            this.formFragmentArguments = (FormFragmentArguments) h.b(formFragmentArguments);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder
        public FormViewModelSubcomponentBuilder paymentMethodCode(String str) {
            this.paymentMethodCode = (String) h.b(str);
            return this;
        }
    }

    /* loaded from: classes6.dex */
    private static final class FormViewModelSubcomponentImpl implements FormViewModelSubcomponent {
        private final FormFragmentArguments formFragmentArguments;
        private final DaggerFormViewModelComponent formViewModelComponent;
        private final FormViewModelSubcomponentImpl formViewModelSubcomponentImpl;
        private final String paymentMethodCode;

        private TransformSpecToElement transformSpecToElement() {
            return new TransformSpecToElement((ResourceRepository) this.formViewModelComponent.asyncResourceRepositoryProvider.get(), this.formFragmentArguments, this.formViewModelComponent.context);
        }

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent
        public FormViewModel getViewModel() {
            return new FormViewModel(this.paymentMethodCode, this.formFragmentArguments, (ResourceRepository) this.formViewModelComponent.asyncResourceRepositoryProvider.get(), transformSpecToElement());
        }

        private FormViewModelSubcomponentImpl(DaggerFormViewModelComponent daggerFormViewModelComponent, String str, FormFragmentArguments formFragmentArguments) {
            this.formViewModelSubcomponentImpl = this;
            this.formViewModelComponent = daggerFormViewModelComponent;
            this.paymentMethodCode = str;
            this.formFragmentArguments = formFragmentArguments;
        }
    }

    public static FormViewModelComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(CoroutineContextModule coroutineContextModule, Context context, Resources resources) {
        this.formViewModelSubcomponentBuilderProvider = new Provider<FormViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerFormViewModelComponent.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            public FormViewModelSubcomponent.Builder get() {
                return new FormViewModelSubcomponentBuilder();
            }
        };
        this.resourcesProvider = f.a(resources);
        this.provideWorkContextProvider = d.b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
        Provider<Locale> b11 = d.b(FormViewModelModule_Companion_ProvideLocaleFactory.create());
        this.provideLocaleProvider = b11;
        this.asyncResourceRepositoryProvider = d.b(AsyncResourceRepository_Factory.create(this.resourcesProvider, this.provideWorkContextProvider, b11));
    }

    private FormViewModel.Factory injectFactory(FormViewModel.Factory factory) {
        FormViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.formViewModelSubcomponentBuilderProvider);
        return factory;
    }

    @Override // com.stripe.android.paymentsheet.injection.FormViewModelComponent
    public void inject(FormViewModel.Factory factory) {
        injectFactory(factory);
    }

    private DaggerFormViewModelComponent(CoroutineContextModule coroutineContextModule, Context context, Resources resources) {
        this.formViewModelComponent = this;
        this.context = context;
        initialize(coroutineContextModule, context, resources);
    }
}