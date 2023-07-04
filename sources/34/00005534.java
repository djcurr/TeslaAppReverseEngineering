package com.stripe.android.paymentsheet;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.InjectableKtxKt;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionResult;
import com.stripe.android.paymentsheet.injection.DaggerPaymentOptionsViewModelFactoryComponent;
import com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent;
import com.stripe.android.paymentsheet.model.FragmentConfig;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.ACHText;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.Set;
import javax.inject.Provider;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PaymentOptionsViewModel extends BaseSheetViewModel<TransitionTarget> {
    private final f0<String> _error;
    private final f0<PaymentOptionResult> _paymentOptionResult;
    private boolean hasTransitionToUnsavedCard;
    private PaymentSelection.New newLpm;
    private final LiveData<PaymentOptionResult> paymentOptionResult;

    /* loaded from: classes6.dex */
    public static final class Factory extends androidx.lifecycle.a implements Injectable<FallbackInitializeParam> {
        private final h00.a<Application> applicationSupplier;
        private final h00.a<PaymentOptionContract.Args> starterArgsSupplier;
        public Provider<PaymentOptionsViewModelSubcomponent.Builder> subComponentBuilderProvider;

        /* loaded from: classes6.dex */
        public static final class FallbackInitializeParam {
            private final Application application;
            private final Set<String> productUsage;

            public FallbackInitializeParam(Application application, Set<String> productUsage) {
                kotlin.jvm.internal.s.g(application, "application");
                kotlin.jvm.internal.s.g(productUsage, "productUsage");
                this.application = application;
                this.productUsage = productUsage;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ FallbackInitializeParam copy$default(FallbackInitializeParam fallbackInitializeParam, Application application, Set set, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    application = fallbackInitializeParam.application;
                }
                if ((i11 & 2) != 0) {
                    set = fallbackInitializeParam.productUsage;
                }
                return fallbackInitializeParam.copy(application, set);
            }

            public final Application component1() {
                return this.application;
            }

            public final Set<String> component2() {
                return this.productUsage;
            }

            public final FallbackInitializeParam copy(Application application, Set<String> productUsage) {
                kotlin.jvm.internal.s.g(application, "application");
                kotlin.jvm.internal.s.g(productUsage, "productUsage");
                return new FallbackInitializeParam(application, productUsage);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof FallbackInitializeParam) {
                    FallbackInitializeParam fallbackInitializeParam = (FallbackInitializeParam) obj;
                    return kotlin.jvm.internal.s.c(this.application, fallbackInitializeParam.application) && kotlin.jvm.internal.s.c(this.productUsage, fallbackInitializeParam.productUsage);
                }
                return false;
            }

            public final Application getApplication() {
                return this.application;
            }

            public final Set<String> getProductUsage() {
                return this.productUsage;
            }

            public int hashCode() {
                return (this.application.hashCode() * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "FallbackInitializeParam(application=" + this.application + ", productUsage=" + this.productUsage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        public /* synthetic */ Factory(h00.a aVar, h00.a aVar2, androidx.savedstate.c cVar, Bundle bundle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, aVar2, cVar, (i11 & 8) != 0 ? null : bundle);
        }

        @Override // androidx.lifecycle.a
        protected <T extends p0> T create(String key, Class<T> modelClass, l0 savedStateHandle) {
            kotlin.jvm.internal.s.g(key, "key");
            kotlin.jvm.internal.s.g(modelClass, "modelClass");
            kotlin.jvm.internal.s.g(savedStateHandle, "savedStateHandle");
            Application invoke = this.applicationSupplier.invoke();
            PaymentOptionContract.Args invoke2 = this.starterArgsSupplier.invoke();
            InjectableKtxKt.injectWithFallback(this, this.starterArgsSupplier.invoke().getInjectorKey(), new FallbackInitializeParam(invoke, invoke2.getProductUsage()));
            return getSubComponentBuilderProvider().get().application(invoke).args(invoke2).savedStateHandle(savedStateHandle).build().getViewModel();
        }

        public final Provider<PaymentOptionsViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            Provider<PaymentOptionsViewModelSubcomponent.Builder> provider = this.subComponentBuilderProvider;
            if (provider != null) {
                return provider;
            }
            kotlin.jvm.internal.s.x("subComponentBuilderProvider");
            return null;
        }

        public final void setSubComponentBuilderProvider(Provider<PaymentOptionsViewModelSubcomponent.Builder> provider) {
            kotlin.jvm.internal.s.g(provider, "<set-?>");
            this.subComponentBuilderProvider = provider;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Factory(h00.a<Application> applicationSupplier, h00.a<PaymentOptionContract.Args> starterArgsSupplier, androidx.savedstate.c owner, Bundle bundle) {
            super(owner, bundle);
            kotlin.jvm.internal.s.g(applicationSupplier, "applicationSupplier");
            kotlin.jvm.internal.s.g(starterArgsSupplier, "starterArgsSupplier");
            kotlin.jvm.internal.s.g(owner, "owner");
            this.applicationSupplier = applicationSupplier;
            this.starterArgsSupplier = starterArgsSupplier;
        }

        @Override // com.stripe.android.core.injection.Injectable
        public void fallbackInitialize(FallbackInitializeParam arg) {
            kotlin.jvm.internal.s.g(arg, "arg");
            DaggerPaymentOptionsViewModelFactoryComponent.builder().context(arg.getApplication()).productUsage(arg.getProductUsage()).build().inject(this);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class TransitionTarget {

        /* loaded from: classes6.dex */
        public static final class AddPaymentMethodFull extends TransitionTarget {
            public static final int $stable = 8;
            private final FragmentConfig fragmentConfig;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddPaymentMethodFull(FragmentConfig fragmentConfig) {
                super(null);
                kotlin.jvm.internal.s.g(fragmentConfig, "fragmentConfig");
                this.fragmentConfig = fragmentConfig;
            }

            public static /* synthetic */ AddPaymentMethodFull copy$default(AddPaymentMethodFull addPaymentMethodFull, FragmentConfig fragmentConfig, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    fragmentConfig = addPaymentMethodFull.getFragmentConfig();
                }
                return addPaymentMethodFull.copy(fragmentConfig);
            }

            public final FragmentConfig component1() {
                return getFragmentConfig();
            }

            public final AddPaymentMethodFull copy(FragmentConfig fragmentConfig) {
                kotlin.jvm.internal.s.g(fragmentConfig, "fragmentConfig");
                return new AddPaymentMethodFull(fragmentConfig);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AddPaymentMethodFull) && kotlin.jvm.internal.s.c(getFragmentConfig(), ((AddPaymentMethodFull) obj).getFragmentConfig());
            }

            @Override // com.stripe.android.paymentsheet.PaymentOptionsViewModel.TransitionTarget
            public FragmentConfig getFragmentConfig() {
                return this.fragmentConfig;
            }

            public int hashCode() {
                return getFragmentConfig().hashCode();
            }

            public String toString() {
                return "AddPaymentMethodFull(fragmentConfig=" + getFragmentConfig() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* loaded from: classes6.dex */
        public static final class AddPaymentMethodSheet extends TransitionTarget {
            public static final int $stable = 8;
            private final FragmentConfig fragmentConfig;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddPaymentMethodSheet(FragmentConfig fragmentConfig) {
                super(null);
                kotlin.jvm.internal.s.g(fragmentConfig, "fragmentConfig");
                this.fragmentConfig = fragmentConfig;
            }

            public static /* synthetic */ AddPaymentMethodSheet copy$default(AddPaymentMethodSheet addPaymentMethodSheet, FragmentConfig fragmentConfig, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    fragmentConfig = addPaymentMethodSheet.getFragmentConfig();
                }
                return addPaymentMethodSheet.copy(fragmentConfig);
            }

            public final FragmentConfig component1() {
                return getFragmentConfig();
            }

            public final AddPaymentMethodSheet copy(FragmentConfig fragmentConfig) {
                kotlin.jvm.internal.s.g(fragmentConfig, "fragmentConfig");
                return new AddPaymentMethodSheet(fragmentConfig);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AddPaymentMethodSheet) && kotlin.jvm.internal.s.c(getFragmentConfig(), ((AddPaymentMethodSheet) obj).getFragmentConfig());
            }

            @Override // com.stripe.android.paymentsheet.PaymentOptionsViewModel.TransitionTarget
            public FragmentConfig getFragmentConfig() {
                return this.fragmentConfig;
            }

            public int hashCode() {
                return getFragmentConfig().hashCode();
            }

            public String toString() {
                return "AddPaymentMethodSheet(fragmentConfig=" + getFragmentConfig() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* loaded from: classes6.dex */
        public static final class SelectSavedPaymentMethod extends TransitionTarget {
            public static final int $stable = 8;
            private final FragmentConfig fragmentConfig;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectSavedPaymentMethod(FragmentConfig fragmentConfig) {
                super(null);
                kotlin.jvm.internal.s.g(fragmentConfig, "fragmentConfig");
                this.fragmentConfig = fragmentConfig;
            }

            public static /* synthetic */ SelectSavedPaymentMethod copy$default(SelectSavedPaymentMethod selectSavedPaymentMethod, FragmentConfig fragmentConfig, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    fragmentConfig = selectSavedPaymentMethod.getFragmentConfig();
                }
                return selectSavedPaymentMethod.copy(fragmentConfig);
            }

            public final FragmentConfig component1() {
                return getFragmentConfig();
            }

            public final SelectSavedPaymentMethod copy(FragmentConfig fragmentConfig) {
                kotlin.jvm.internal.s.g(fragmentConfig, "fragmentConfig");
                return new SelectSavedPaymentMethod(fragmentConfig);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SelectSavedPaymentMethod) && kotlin.jvm.internal.s.c(getFragmentConfig(), ((SelectSavedPaymentMethod) obj).getFragmentConfig());
            }

            @Override // com.stripe.android.paymentsheet.PaymentOptionsViewModel.TransitionTarget
            public FragmentConfig getFragmentConfig() {
                return this.fragmentConfig;
            }

            public int hashCode() {
                return getFragmentConfig().hashCode();
            }

            public String toString() {
                return "SelectSavedPaymentMethod(fragmentConfig=" + getFragmentConfig() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private TransitionTarget() {
        }

        public /* synthetic */ TransitionTarget(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract FragmentConfig getFragmentConfig();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PaymentOptionsViewModel(com.stripe.android.paymentsheet.PaymentOptionContract.Args r16, h00.l<com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration, com.stripe.android.paymentsheet.PrefsRepository> r17, com.stripe.android.paymentsheet.analytics.EventReporter r18, com.stripe.android.paymentsheet.repositories.CustomerRepository r19, @com.stripe.android.core.injection.IOContext zz.g r20, android.app.Application r21, com.stripe.android.core.Logger r22, @com.stripe.android.core.injection.InjectorKey java.lang.String r23, com.stripe.android.ui.core.forms.resources.ResourceRepository r24, androidx.lifecycle.l0 r25, com.stripe.android.link.injection.LinkPaymentLauncherFactory r26) {
        /*
            r15 = this;
            r12 = r15
            r0 = r17
            r13 = r25
            java.lang.String r1 = "args"
            r14 = r16
            kotlin.jvm.internal.s.g(r14, r1)
            java.lang.String r1 = "prefsRepositoryFactory"
            kotlin.jvm.internal.s.g(r0, r1)
            java.lang.String r1 = "eventReporter"
            r3 = r18
            kotlin.jvm.internal.s.g(r3, r1)
            java.lang.String r1 = "customerRepository"
            r4 = r19
            kotlin.jvm.internal.s.g(r4, r1)
            java.lang.String r1 = "workContext"
            r6 = r20
            kotlin.jvm.internal.s.g(r6, r1)
            java.lang.String r1 = "application"
            r2 = r21
            kotlin.jvm.internal.s.g(r2, r1)
            java.lang.String r1 = "logger"
            r7 = r22
            kotlin.jvm.internal.s.g(r7, r1)
            java.lang.String r1 = "injectorKey"
            r8 = r23
            kotlin.jvm.internal.s.g(r8, r1)
            java.lang.String r1 = "resourceRepository"
            r9 = r24
            kotlin.jvm.internal.s.g(r9, r1)
            java.lang.String r1 = "savedStateHandle"
            kotlin.jvm.internal.s.g(r13, r1)
            java.lang.String r1 = "linkPaymentLauncherFactory"
            r11 = r26
            kotlin.jvm.internal.s.g(r11, r1)
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r5 = r16.getConfig()
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r1 = r16.getConfig()
            if (r1 != 0) goto L5a
            r1 = 0
            goto L5e
        L5a:
            com.stripe.android.paymentsheet.PaymentSheet$CustomerConfiguration r1 = r1.getCustomer()
        L5e:
            java.lang.Object r0 = r0.invoke(r1)
            r10 = r0
            com.stripe.android.paymentsheet.PrefsRepository r10 = (com.stripe.android.paymentsheet.PrefsRepository) r10
            r0 = r15
            r1 = r21
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r10
            r6 = r20
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.lifecycle.f0 r0 = new androidx.lifecycle.f0
            r0.<init>()
            r12._paymentOptionResult = r0
            r12.paymentOptionResult = r0
            androidx.lifecycle.f0 r0 = new androidx.lifecycle.f0
            r0.<init>()
            r12._error = r0
            com.stripe.android.paymentsheet.model.PaymentSelection$New r0 = r16.getNewLpm()
            r12.newLpm = r0
            boolean r0 = r16.isGooglePayReady()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "google_pay_ready"
            r13.h(r1, r0)
            com.stripe.android.model.StripeIntent r0 = r16.getStripeIntent()
            r1 = 0
            r15.setupLink(r0, r1)
            com.stripe.android.model.StripeIntent r0 = r16.getStripeIntent()
            r15.setStripeIntent(r0)
            java.util.List r0 = r16.getPaymentMethods()
            java.lang.String r1 = "customer_payment_methods"
            r13.h(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r1 = "processing"
            r13.h(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentOptionsViewModel.<init>(com.stripe.android.paymentsheet.PaymentOptionContract$Args, h00.l, com.stripe.android.paymentsheet.analytics.EventReporter, com.stripe.android.paymentsheet.repositories.CustomerRepository, zz.g, android.app.Application, com.stripe.android.core.Logger, java.lang.String, com.stripe.android.ui.core.forms.resources.ResourceRepository, androidx.lifecycle.l0, com.stripe.android.link.injection.LinkPaymentLauncherFactory):void");
    }

    private final boolean getShouldTransitionToUnsavedCard() {
        return (this.hasTransitionToUnsavedCard || getNewLpm() == null) ? false : true;
    }

    public static /* synthetic */ void get_paymentOptionResult$paymentsheet_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processExistingPaymentMethod(PaymentSelection paymentSelection) {
        getPrefsRepository().savePaymentSelection(paymentSelection);
        this._paymentOptionResult.setValue(new PaymentOptionResult.Succeeded(paymentSelection, get_paymentMethods$paymentsheet_release().getValue()));
    }

    private final void processNewPaymentMethod(PaymentSelection paymentSelection) {
        getPrefsRepository().savePaymentSelection(paymentSelection);
        this._paymentOptionResult.setValue(new PaymentOptionResult.Succeeded(paymentSelection, get_paymentMethods$paymentsheet_release().getValue()));
    }

    public final LiveData<String> getError$paymentsheet_release() {
        return this._error;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public PaymentSelection.New getNewLpm() {
        return this.newLpm;
    }

    public final LiveData<PaymentOptionResult> getPaymentOptionResult$paymentsheet_release() {
        return this.paymentOptionResult;
    }

    public final f0<PaymentOptionResult> get_paymentOptionResult$paymentsheet_release() {
        return this._paymentOptionResult;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onError(Integer num) {
        String string;
        if (num == null) {
            string = null;
        } else {
            string = getApplication().getString(num.intValue());
        }
        onError(string);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onFatal(Throwable throwable) {
        kotlin.jvm.internal.s.g(throwable, "throwable");
        get_fatal().setValue(throwable);
        this._paymentOptionResult.setValue(new PaymentOptionResult.Failed(throwable, get_paymentMethods$paymentsheet_release().getValue()));
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onFinish() {
        onUserSelection();
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onLinkActivityResult(LinkActivityResult result) {
        kotlin.jvm.internal.s.g(result, "result");
        if (result instanceof LinkActivityResult.Success.Selected) {
            onLinkPaymentDetailsCollected(((LinkActivityResult.Success.Selected) result).getPaymentDetails());
            return;
        }
        if (result instanceof LinkActivityResult.Failed) {
            this._error.setValue(((LinkActivityResult.Failed) result).getError().getLocalizedMessage());
        }
        super.onLinkActivityResult(result);
        get_processing$paymentsheet_release().setValue(Boolean.FALSE);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onLinkLaunched() {
        super.onLinkLaunched();
        get_processing$paymentsheet_release().setValue(Boolean.TRUE);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onLinkPaymentDetailsCollected(LinkPaymentDetails linkPaymentDetails) {
        vz.b0 b0Var;
        if (linkPaymentDetails == null) {
            b0Var = null;
        } else {
            updateSelection(convertToPaymentSelection(linkPaymentDetails));
            onUserSelection();
            b0Var = vz.b0.f54756a;
        }
        if (b0Var == null) {
            onUserSelection();
        }
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onPaymentResult(PaymentResult paymentResult) {
        kotlin.jvm.internal.s.g(paymentResult, "paymentResult");
        get_processing$paymentsheet_release().setValue(Boolean.FALSE);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onUserCancel() {
        this._paymentOptionResult.setValue(new PaymentOptionResult.Canceled(get_fatal().getValue(), get_paymentMethods$paymentsheet_release().getValue()));
    }

    public final void onUserSelection() {
        PaymentSelection value = getSelection$paymentsheet_release().getValue();
        if (value == null) {
            return;
        }
        getEventReporter$paymentsheet_release().onSelectPaymentOption(value);
        if (value instanceof PaymentSelection.Saved) {
            if (((PaymentSelection.Saved) value).getPaymentMethod().type != PaymentMethod.Type.USBankAccount) {
                processExistingPaymentMethod(value);
            }
        } else if (value instanceof PaymentSelection.GooglePay) {
            processExistingPaymentMethod(value);
        } else if (value instanceof PaymentSelection.New) {
            processNewPaymentMethod(value);
        }
    }

    public final void resolveTransitionTarget(FragmentConfig config) {
        kotlin.jvm.internal.s.g(config, "config");
        if (getShouldTransitionToUnsavedCard()) {
            this.hasTransitionToUnsavedCard = true;
            transitionTo(new TransitionTarget.AddPaymentMethodFull(config));
        }
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void setNewLpm(PaymentSelection.New r12) {
        this.newLpm = r12;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void updateSelection(PaymentSelection paymentSelection) {
        super.updateSelection(paymentSelection);
        boolean z11 = paymentSelection instanceof PaymentSelection.Saved;
        if (z11 && ((PaymentSelection.Saved) paymentSelection).getPaymentMethod().type == PaymentMethod.Type.USBankAccount) {
            ACHText aCHText = ACHText.INSTANCE;
            Application application = getApplication();
            kotlin.jvm.internal.s.f(application, "getApplication()");
            updateBelowButtonText(aCHText.getContinueMandateText(application));
            updatePrimaryButtonUIState(new PrimaryButton.UIState(getApplication().getString(R.string.stripe_continue_button_label), new PaymentOptionsViewModel$updateSelection$1(this, paymentSelection), true, true));
            return;
        }
        if (!z11 && !(paymentSelection instanceof PaymentSelection.GooglePay)) {
            PrimaryButton.UIState value = getPrimaryButtonUIState().getValue();
            updatePrimaryButtonUIState(value != null ? value.copy(getApplication().getString(R.string.stripe_continue_button_label), new PaymentOptionsViewModel$updateSelection$2(this), true, true) : null);
            return;
        }
        PrimaryButton.UIState value2 = getPrimaryButtonUIState().getValue();
        updatePrimaryButtonUIState(value2 != null ? PrimaryButton.UIState.copy$default(value2, null, null, false, false, 7, null) : null);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onError(String str) {
        if (str == null) {
            return;
        }
        this._error.setValue(str);
    }
}