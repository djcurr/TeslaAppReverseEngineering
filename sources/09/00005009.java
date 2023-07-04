package com.stripe.android.link.ui.paymentmethod;

import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.confirmation.ConfirmStripeIntentParamsFactory;
import com.stripe.android.link.confirmation.ConfirmationManager;
import com.stripe.android.link.injection.FormControllerSubcomponent;
import com.stripe.android.link.injection.NonFallbackInjectable;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.injection.SignedInViewModelSubcomponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.link.ui.ErrorMessageKt;
import com.stripe.android.link.ui.forms.FormController;
import com.stripe.android.link.ui.paymentmethod.SupportedPaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.ui.core.FieldValuesToParamsMapConverter;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import v20.k;
import vz.b0;
import wz.x0;

/* loaded from: classes6.dex */
public final class PaymentMethodViewModel extends p0 {
    private final u<ErrorMessage> _errorMessage;
    private final u<Boolean> _isProcessing;
    private final LinkActivityContract.Args args;
    private final ConfirmationManager confirmationManager;
    private final h0<ErrorMessage> errorMessage;
    private final FormController formController;
    private final e<Boolean> isEnabled;
    private final h0<Boolean> isProcessing;
    private final LinkAccount linkAccount;
    private final LinkAccountManager linkAccountManager;
    private final LinkRepository linkRepository;
    private final Logger logger;
    private final Navigator navigator;
    private final SupportedPaymentMethod.Card paymentMethod;
    private final StripeIntent stripeIntent;

    /* loaded from: classes6.dex */
    public static final class Factory implements s0.b, NonFallbackInjectable {
        private final NonFallbackInjector injector;
        private final LinkAccount linkAccount;
        public Provider<SignedInViewModelSubcomponent.Builder> subComponentBuilderProvider;

        public Factory(LinkAccount linkAccount, NonFallbackInjector injector) {
            s.g(linkAccount, "linkAccount");
            s.g(injector, "injector");
            this.linkAccount = linkAccount;
            this.injector = injector;
        }

        @Override // androidx.lifecycle.s0.b
        public <T extends p0> T create(Class<T> modelClass) {
            s.g(modelClass, "modelClass");
            this.injector.inject(this);
            return getSubComponentBuilderProvider().get().linkAccount(this.linkAccount).build().getPaymentMethodViewModel();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.stripe.android.core.injection.Injectable
        public Void fallbackInitialize(b0 b0Var) {
            return NonFallbackInjectable.DefaultImpls.fallbackInitialize(this, b0Var);
        }

        public final Provider<SignedInViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            Provider<SignedInViewModelSubcomponent.Builder> provider = this.subComponentBuilderProvider;
            if (provider != null) {
                return provider;
            }
            s.x("subComponentBuilderProvider");
            return null;
        }

        public final void setSubComponentBuilderProvider(Provider<SignedInViewModelSubcomponent.Builder> provider) {
            s.g(provider, "<set-?>");
            this.subComponentBuilderProvider = provider;
        }
    }

    public PaymentMethodViewModel(LinkActivityContract.Args args, LinkAccount linkAccount, LinkRepository linkRepository, LinkAccountManager linkAccountManager, Navigator navigator, ConfirmationManager confirmationManager, Logger logger, Provider<FormControllerSubcomponent.Builder> formControllerProvider) {
        Map<IdentifierSpec, String> i11;
        Set<IdentifierSpec> d11;
        s.g(args, "args");
        s.g(linkAccount, "linkAccount");
        s.g(linkRepository, "linkRepository");
        s.g(linkAccountManager, "linkAccountManager");
        s.g(navigator, "navigator");
        s.g(confirmationManager, "confirmationManager");
        s.g(logger, "logger");
        s.g(formControllerProvider, "formControllerProvider");
        this.args = args;
        this.linkAccount = linkAccount;
        this.linkRepository = linkRepository;
        this.linkAccountManager = linkAccountManager;
        this.navigator = navigator;
        this.confirmationManager = confirmationManager;
        this.logger = logger;
        this.stripeIntent = args.getStripeIntent$link_release();
        final u<Boolean> a11 = j0.a(Boolean.FALSE);
        this._isProcessing = a11;
        this.isProcessing = a11;
        this.isEnabled = new e<Boolean>() { // from class: com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$special$$inlined$map$1

            /* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$special$$inlined$map$1$2", f = "PaymentMethodViewModel.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(zz.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$special$$inlined$map$1$2$1 r0 = (com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$special$$inlined$map$1$2$1 r0 = new com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L4a
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        java.lang.Boolean r5 = (java.lang.Boolean) r5
                        boolean r5 = r5.booleanValue()
                        r5 = r5 ^ r3
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4a
                        return r1
                    L4a:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super Boolean> fVar, zz.d dVar) {
                Object d12;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d12 = a00.d.d();
                return collect == d12 ? collect : b0.f54756a;
            }
        };
        u<ErrorMessage> a12 = j0.a(null);
        this._errorMessage = a12;
        this.errorMessage = a12;
        SupportedPaymentMethod.Card card = new SupportedPaymentMethod.Card();
        this.paymentMethod = card;
        FormControllerSubcomponent.Builder formSpec = formControllerProvider.get().formSpec(card.getFormSpec());
        i11 = wz.s0.i();
        FormControllerSubcomponent.Builder initialValues = formSpec.initialValues(i11);
        d11 = x0.d();
        this.formController = initialValues.viewOnlyFields(d11).viewModelScope(q0.a(this)).build().getFormController();
    }

    private final void clearError() {
        this._errorMessage.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void completePayment(LinkPaymentDetails linkPaymentDetails) {
        this.confirmationManager.confirmStripeIntent(ConfirmStripeIntentParamsFactory.Companion.createFactory(this.stripeIntent).createConfirmStripeIntentParams(linkPaymentDetails.getPaymentMethodCreateParams()), new PaymentMethodViewModel$completePayment$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Throwable th2) {
        ErrorMessage errorMessage = ErrorMessageKt.getErrorMessage(th2);
        this.logger.error("Error: ", th2);
        this._isProcessing.setValue(Boolean.FALSE);
        this._errorMessage.setValue(errorMessage);
    }

    public final LinkActivityContract.Args getArgs() {
        return this.args;
    }

    public final h0<ErrorMessage> getErrorMessage() {
        return this.errorMessage;
    }

    public final FormController getFormController() {
        return this.formController;
    }

    public final LinkAccount getLinkAccount() {
        return this.linkAccount;
    }

    public final SupportedPaymentMethod.Card getPaymentMethod() {
        return this.paymentMethod;
    }

    public final e<Boolean> isEnabled() {
        return this.isEnabled;
    }

    public final h0<Boolean> isProcessing() {
        return this.isProcessing;
    }

    public final void payAnotherWay() {
        clearError();
        Navigator.dismiss$default(this.navigator, null, 1, null);
        this.linkAccountManager.logout();
    }

    public final void startPayment(Map<IdentifierSpec, FormFieldEntry> formValues) {
        s.g(formValues, "formValues");
        clearError();
        k.d(q0.a(this), null, null, new PaymentMethodViewModel$startPayment$1(this, FieldValuesToParamsMapConverter.Companion.transformToPaymentMethodCreateParams(formValues, this.paymentMethod.getType()), null), 3, null);
    }
}