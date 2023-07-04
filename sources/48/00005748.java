package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.app.Application;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.savedstate.c;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.InjectableKtxKt;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.InjectorKt;
import com.stripe.android.financialconnections.model.BankAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.PaymentAccount;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.bankaccount.CollectBankAccountLauncher;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SetupIntentClientSecret;
import com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.di.DaggerUSBankAccountFormComponent;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelSubcomponent;
import com.stripe.android.ui.core.Amount;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.SaveForFutureUseElement;
import com.stripe.android.ui.core.elements.SaveForFutureUseSpec;
import com.stripe.android.ui.core.elements.SimpleTextFieldController;
import com.stripe.android.ui.core.elements.TextFieldController;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import javax.inject.Provider;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import v20.k;
import v20.o0;
import vz.b0;

/* loaded from: classes6.dex */
public final class USBankAccountFormViewModel extends p0 {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String HAS_LAUNCHED_KEY = "has_launched";
    private final u<USBankAccountFormScreenState> _currentScreenState;
    private final u<Boolean> _processing;
    private final Application application;
    private final Args args;
    private CollectBankAccountLauncher collectBankAccountLauncher;
    private final h0<String> email;
    private final TextFieldController emailController;
    private final Provider<PaymentConfiguration> lazyPaymentConfig;
    private final h0<String> name;
    private final TextFieldController nameController;
    private final e<Boolean> requiredFields;
    private final h0<Boolean> saveForFutureUse;
    private final SaveForFutureUseElement saveForFutureUseElement;
    private final l0 savedStateHandle;
    private final StripeRepository stripeRepository;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Factory extends androidx.lifecycle.a implements Injectable<FallbackInitializeParam> {
        private final h00.a<Application> applicationSupplier;
        private final h00.a<Args> argsSupplier;
        public Provider<USBankAccountFormViewModelSubcomponent.Builder> subComponentBuilderProvider;

        /* loaded from: classes6.dex */
        public static final class FallbackInitializeParam {
            private final Application application;

            public FallbackInitializeParam(Application application) {
                s.g(application, "application");
                this.application = application;
            }

            public static /* synthetic */ FallbackInitializeParam copy$default(FallbackInitializeParam fallbackInitializeParam, Application application, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    application = fallbackInitializeParam.application;
                }
                return fallbackInitializeParam.copy(application);
            }

            public final Application component1() {
                return this.application;
            }

            public final FallbackInitializeParam copy(Application application) {
                s.g(application, "application");
                return new FallbackInitializeParam(application);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FallbackInitializeParam) && s.c(this.application, ((FallbackInitializeParam) obj).application);
            }

            public final Application getApplication() {
                return this.application;
            }

            public int hashCode() {
                return this.application.hashCode();
            }

            public String toString() {
                return "FallbackInitializeParam(application=" + this.application + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        public /* synthetic */ Factory(h00.a aVar, h00.a aVar2, c cVar, Bundle bundle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, aVar2, cVar, (i11 & 8) != 0 ? null : bundle);
        }

        @Override // androidx.lifecycle.a
        protected <T extends p0> T create(String key, Class<T> modelClass, l0 savedStateHandle) {
            s.g(key, "key");
            s.g(modelClass, "modelClass");
            s.g(savedStateHandle, "savedStateHandle");
            Args invoke = this.argsSupplier.invoke();
            InjectableKtxKt.injectWithFallback(this, invoke.getInjectorKey$paymentsheet_release(), new FallbackInitializeParam(this.applicationSupplier.invoke()));
            return getSubComponentBuilderProvider().get().configuration(invoke).savedStateHandle(savedStateHandle).build().getViewModel();
        }

        public final Provider<USBankAccountFormViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            Provider<USBankAccountFormViewModelSubcomponent.Builder> provider = this.subComponentBuilderProvider;
            if (provider != null) {
                return provider;
            }
            s.x("subComponentBuilderProvider");
            return null;
        }

        public final void setSubComponentBuilderProvider(Provider<USBankAccountFormViewModelSubcomponent.Builder> provider) {
            s.g(provider, "<set-?>");
            this.subComponentBuilderProvider = provider;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Factory(h00.a<? extends Application> applicationSupplier, h00.a<Args> argsSupplier, c owner, Bundle bundle) {
            super(owner, bundle);
            s.g(applicationSupplier, "applicationSupplier");
            s.g(argsSupplier, "argsSupplier");
            s.g(owner, "owner");
            this.applicationSupplier = applicationSupplier;
            this.argsSupplier = argsSupplier;
        }

        @Override // com.stripe.android.core.injection.Injectable
        public void fallbackInitialize(FallbackInitializeParam arg) {
            s.g(arg, "arg");
            DaggerUSBankAccountFormComponent.builder().application(arg.getApplication()).injectorKey(InjectorKt.DUMMY_INJECTOR_KEY).build().inject(this);
        }
    }

    public USBankAccountFormViewModel(Args args, Application application, StripeRepository stripeRepository, Provider<PaymentConfiguration> lazyPaymentConfig, l0 savedStateHandle) {
        PaymentMethodCreateParams paymentMethodCreateParams;
        USBankAccountFormScreenState value;
        String value2;
        String str;
        s.g(args, "args");
        s.g(application, "application");
        s.g(stripeRepository, "stripeRepository");
        s.g(lazyPaymentConfig, "lazyPaymentConfig");
        s.g(savedStateHandle, "savedStateHandle");
        this.args = args;
        this.application = application;
        this.stripeRepository = stripeRepository;
        this.lazyPaymentConfig = lazyPaymentConfig;
        this.savedStateHandle = savedStateHandle;
        SimpleTextFieldController.Companion companion = SimpleTextFieldController.Companion;
        PaymentSheet.BillingDetails billingDetails = args.getFormArgs().getBillingDetails();
        SimpleTextFieldController createNameSectionController = companion.createNameSectionController(billingDetails == null ? null : billingDetails.getName());
        this.nameController = createNameSectionController;
        final e<FormFieldEntry> formFieldValue = createNameSectionController.getFormFieldValue();
        e<String> eVar = new e<String>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$1

            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$1$2", f = "USBankAccountFormViewModel.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$1$2$1 r0 = (com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$1$2$1 r0 = new com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L56
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        com.stripe.android.ui.core.forms.FormFieldEntry r5 = (com.stripe.android.ui.core.forms.FormFieldEntry) r5
                        boolean r2 = r5.isComplete()
                        if (r2 == 0) goto L3f
                        goto L40
                    L3f:
                        r5 = 0
                    L40:
                        java.lang.String r2 = ""
                        if (r5 != 0) goto L45
                        goto L4d
                    L45:
                        java.lang.String r5 = r5.getValue()
                        if (r5 != 0) goto L4c
                        goto L4d
                    L4c:
                        r2 = r5
                    L4d:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r2, r0)
                        if (r5 != r1) goto L56
                        return r1
                    L56:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super String> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        o0 a11 = q0.a(this);
        e0.a aVar = e0.f35254a;
        h0<String> E = g.E(eVar, a11, aVar.a(), "");
        this.name = E;
        PaymentSheet.BillingDetails billingDetails2 = args.getFormArgs().getBillingDetails();
        SimpleTextFieldController createEmailSectionController = companion.createEmailSectionController(billingDetails2 == null ? null : billingDetails2.getEmail());
        this.emailController = createEmailSectionController;
        final e<FormFieldEntry> formFieldValue2 = createEmailSectionController.getFormFieldValue();
        h0<String> E2 = g.E(new e<String>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$2

            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$2$2", f = "USBankAccountFormViewModel.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$2$2$1  reason: invalid class name */
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
                public final java.lang.Object emit(java.lang.Object r6, zz.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$2$2$1 r0 = (com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$2$2$1 r0 = new com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$2$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r7)
                        goto L51
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        vz.r.b(r7)
                        kotlinx.coroutines.flow.f r7 = r5.$this_unsafeFlow
                        com.stripe.android.ui.core.forms.FormFieldEntry r6 = (com.stripe.android.ui.core.forms.FormFieldEntry) r6
                        boolean r2 = r6.isComplete()
                        r4 = 0
                        if (r2 == 0) goto L40
                        goto L41
                    L40:
                        r6 = r4
                    L41:
                        if (r6 != 0) goto L44
                        goto L48
                    L44:
                        java.lang.String r4 = r6.getValue()
                    L48:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r4, r0)
                        if (r6 != r1) goto L51
                        return r1
                    L51:
                        vz.b0 r6 = vz.b0.f54756a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super String> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        }, q0.a(this), aVar.a(), null);
        this.email = E2;
        USBankAccountFormScreenState savedScreenState = args.getSavedScreenState();
        u<USBankAccountFormScreenState> a12 = j0.a(savedScreenState == null ? new USBankAccountFormScreenState.NameAndEmailCollection(null, E.getValue(), E2.getValue(), application.getString(R.string.stripe_continue_button_label), 1, null) : savedScreenState);
        this._currentScreenState = a12;
        SaveForFutureUseElement saveForFutureUseElement = (SaveForFutureUseElement) new SaveForFutureUseSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null).transform(args.getFormArgs().getShowCheckbox(), args.getFormArgs().getMerchantName());
        this.saveForFutureUseElement = saveForFutureUseElement;
        this.saveForFutureUse = g.E(saveForFutureUseElement.getController().getSaveForFutureUse(), q0.a(this), aVar.b(), Boolean.valueOf(args.getFormArgs().getShowCheckbox()));
        final e<FormFieldEntry> formFieldValue3 = createNameSectionController.getFormFieldValue();
        e<Boolean> eVar2 = new e<Boolean>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$3

            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$3$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$3$2", f = "USBankAccountFormViewModel.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$3$2$1  reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$3$2$1 r0 = (com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$3$2$1 r0 = new com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$3$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        com.stripe.android.ui.core.forms.FormFieldEntry r5 = (com.stripe.android.ui.core.forms.FormFieldEntry) r5
                        boolean r5 = r5.isComplete()
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super Boolean> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        final e<FormFieldEntry> formFieldValue4 = createEmailSectionController.getFormFieldValue();
        this.requiredFields = g.h(eVar2, new e<Boolean>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$4

            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$4$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$4$2", f = "USBankAccountFormViewModel.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$4$2$1  reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$4$2$1 r0 = (com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$4$2$1 r0 = new com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$4$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        com.stripe.android.ui.core.forms.FormFieldEntry r5 = (com.stripe.android.ui.core.forms.FormFieldEntry) r5
                        boolean r5 = r5.isComplete()
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super Boolean> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        }, new USBankAccountFormViewModel$requiredFields$3(null));
        this._processing = j0.a(Boolean.FALSE);
        PaymentSelection.New.USBankAccount savedPaymentMethod = args.getSavedPaymentMethod();
        if (savedPaymentMethod == null || (paymentMethodCreateParams = savedPaymentMethod.getPaymentMethodCreateParams()) == null) {
            return;
        }
        do {
            value = a12.getValue();
            PaymentMethod.BillingDetails billingDetails3 = paymentMethodCreateParams.getBillingDetails();
            String str2 = billingDetails3 == null ? null : billingDetails3.name;
            value2 = str2 == null ? getName().getValue() : str2;
            PaymentMethod.BillingDetails billingDetails4 = paymentMethodCreateParams.getBillingDetails();
            str = billingDetails4 == null ? null : billingDetails4.email;
        } while (!a12.compareAndSet(value, new USBankAccountFormScreenState.SavedAccount(value2, str == null ? getEmail().getValue() : str, this.args.getSavedPaymentMethod().getFinancialConnectionsSessionId(), this.args.getSavedPaymentMethod().getIntentId(), this.args.getSavedPaymentMethod().getBankName(), this.args.getSavedPaymentMethod().getLast4(), buildPrimaryButtonText(), buildMandateText(), this.args.getFormArgs().getShowCheckbox())));
    }

    private final void attachFinancialAccountToIntent(ClientSecret clientSecret, String str, String str2, String str3, String str4) {
        if (str3 == null || str4 == null) {
            return;
        }
        k.d(q0.a(this), null, null, new USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1(clientSecret, this, str, str2, str4, str3, null), 3, null);
    }

    private final String buildMandateText() {
        if (this.saveForFutureUse.getValue().booleanValue()) {
            String string = this.application.getString(R.string.stripe_paymentsheet_ach_save_mandate, new Object[]{formattedMerchantName()});
            s.f(string, "{\n            applicatio…)\n            )\n        }");
            return string;
        }
        return ACHText.INSTANCE.getContinueMandateText(this.application);
    }

    private final String buildPrimaryButtonText() {
        if (this.args.getCompletePayment()) {
            if (this.args.getClientSecret() instanceof PaymentIntentClientSecret) {
                Amount amount = this.args.getFormArgs().getAmount();
                if (amount == null) {
                    return null;
                }
                Resources resources = this.application.getResources();
                s.f(resources, "application.resources");
                return amount.buildPayButtonLabel(resources);
            }
            return this.application.getString(R.string.stripe_setup_button_label);
        }
        return this.application.getString(R.string.stripe_continue_button_label);
    }

    private final void collectBankAccount(ClientSecret clientSecret) {
        CollectBankAccountLauncher collectBankAccountLauncher;
        if (getHasLaunched()) {
            return;
        }
        setHasLaunched(true);
        if (clientSecret instanceof PaymentIntentClientSecret) {
            CollectBankAccountLauncher collectBankAccountLauncher2 = this.collectBankAccountLauncher;
            if (collectBankAccountLauncher2 == null) {
                return;
            }
            collectBankAccountLauncher2.presentWithPaymentIntent(this.lazyPaymentConfig.get().getPublishableKey(), clientSecret.getValue(), new CollectBankAccountConfiguration.USBankAccount(this.name.getValue(), this.email.getValue()));
        } else if (!(clientSecret instanceof SetupIntentClientSecret) || (collectBankAccountLauncher = this.collectBankAccountLauncher) == null) {
        } else {
            collectBankAccountLauncher.presentWithSetupIntent(this.lazyPaymentConfig.get().getPublishableKey(), clientSecret.getValue(), new CollectBankAccountConfiguration.USBankAccount(this.name.getValue(), this.email.getValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirm(ClientSecret clientSecret, PaymentSelection.New r82) {
        k.d(q0.a(this), null, null, new USBankAccountFormViewModel$confirm$1(clientSecret, r82, this, null), 3, null);
    }

    public static /* synthetic */ void getCollectBankAccountLauncher$annotations() {
    }

    private final boolean getHasLaunched() {
        return s.c(this.savedStateHandle.c("has_launched"), Boolean.TRUE);
    }

    public static /* synthetic */ void reset$default(USBankAccountFormViewModel uSBankAccountFormViewModel, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        uSBankAccountFormViewModel.reset(num);
    }

    private final void setHasLaunched(boolean z11) {
        this.savedStateHandle.h("has_launched", Boolean.valueOf(z11));
    }

    public final String formattedMerchantName() {
        CharSequence charSequence;
        String merchantName = this.args.getFormArgs().getMerchantName();
        int length = merchantName.length() - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (!(merchantName.charAt(length) == '.')) {
                    charSequence = merchantName.subSequence(0, length + 1);
                    break;
                } else if (i11 < 0) {
                    break;
                } else {
                    length = i11;
                }
            }
        }
        charSequence = "";
        return charSequence.toString();
    }

    public final USBankAccountFormScreenState generateSavedState(USBankAccountFormScreenState screenState) {
        s.g(screenState, "screenState");
        if (screenState instanceof USBankAccountFormScreenState.Finished) {
            USBankAccountFormScreenState.Finished finished = (USBankAccountFormScreenState.Finished) screenState;
            return new USBankAccountFormScreenState.SavedAccount(this.name.getValue(), this.email.getValue(), finished.getFinancialConnectionsSessionId(), finished.getIntentId(), finished.getBankName(), finished.getLast4(), buildPrimaryButtonText(), buildMandateText(), this.saveForFutureUse.getValue().booleanValue());
        }
        return null;
    }

    public final CollectBankAccountLauncher getCollectBankAccountLauncher() {
        return this.collectBankAccountLauncher;
    }

    public final h0<USBankAccountFormScreenState> getCurrentScreenState() {
        return this._currentScreenState;
    }

    public final h0<String> getEmail() {
        return this.email;
    }

    public final TextFieldController getEmailController() {
        return this.emailController;
    }

    public final h0<String> getName() {
        return this.name;
    }

    public final TextFieldController getNameController() {
        return this.nameController;
    }

    public final h0<Boolean> getProcessing() {
        return this._processing;
    }

    public final e<Boolean> getRequiredFields() {
        return this.requiredFields;
    }

    public final h0<Boolean> getSaveForFutureUse() {
        return this.saveForFutureUse;
    }

    public final SaveForFutureUseElement getSaveForFutureUseElement() {
        return this.saveForFutureUseElement;
    }

    public final void handleCollectBankAccountResult(CollectBankAccountResult result) {
        s.g(result, "result");
        setHasLaunched(false);
        if (result instanceof CollectBankAccountResult.Completed) {
            CollectBankAccountResult.Completed completed = (CollectBankAccountResult.Completed) result;
            PaymentAccount paymentAccount = completed.getResponse().getFinancialConnectionsSession().getPaymentAccount();
            if (paymentAccount instanceof BankAccount) {
                String id2 = completed.getResponse().getIntent().getId();
                if (id2 == null) {
                    return;
                }
                u<USBankAccountFormScreenState> uVar = this._currentScreenState;
                do {
                } while (!uVar.compareAndSet(uVar.getValue(), new USBankAccountFormScreenState.VerifyWithMicrodeposits(getName().getValue(), getEmail().getValue(), (BankAccount) paymentAccount, completed.getResponse().getFinancialConnectionsSession().getId(), id2, buildPrimaryButtonText(), buildMandateText(), getSaveForFutureUse().getValue().booleanValue())));
            } else if (!(paymentAccount instanceof FinancialConnectionsAccount)) {
                if (paymentAccount == null) {
                    reset(Integer.valueOf(R.string.stripe_paymentsheet_ach_something_went_wrong));
                }
            } else {
                String id3 = completed.getResponse().getIntent().getId();
                if (id3 == null) {
                    return;
                }
                u<USBankAccountFormScreenState> uVar2 = this._currentScreenState;
                do {
                } while (!uVar2.compareAndSet(uVar2.getValue(), new USBankAccountFormScreenState.MandateCollection(getName().getValue(), getEmail().getValue(), (FinancialConnectionsAccount) paymentAccount, completed.getResponse().getFinancialConnectionsSession().getId(), id3, buildPrimaryButtonText(), buildMandateText(), getSaveForFutureUse().getValue().booleanValue())));
            }
        } else if (result instanceof CollectBankAccountResult.Failed) {
            reset(Integer.valueOf(R.string.stripe_paymentsheet_ach_something_went_wrong));
        } else if (result instanceof CollectBankAccountResult.Cancelled) {
            reset$default(this, null, 1, null);
        }
    }

    public final void handlePrimaryButtonClick(USBankAccountFormScreenState screenState) {
        ClientSecret clientSecret;
        USBankAccountFormScreenState.SavedAccount savedAccount;
        String financialConnectionsSessionId;
        s.g(screenState, "screenState");
        u<USBankAccountFormScreenState> uVar = this._currentScreenState;
        uVar.setValue(uVar.getValue().updateInputs(this.name.getValue(), this.email.getValue(), this.saveForFutureUse.getValue().booleanValue()));
        if (screenState instanceof USBankAccountFormScreenState.NameAndEmailCollection) {
            ClientSecret clientSecret2 = this.args.getClientSecret();
            if (clientSecret2 == null) {
                return;
            }
            collectBankAccount(clientSecret2);
        } else if (screenState instanceof USBankAccountFormScreenState.MandateCollection) {
            ClientSecret clientSecret3 = this.args.getClientSecret();
            if (clientSecret3 == null) {
                return;
            }
            USBankAccountFormScreenState.MandateCollection mandateCollection = (USBankAccountFormScreenState.MandateCollection) screenState;
            attachFinancialAccountToIntent(clientSecret3, mandateCollection.getIntentId(), mandateCollection.getFinancialConnectionsSessionId(), mandateCollection.getPaymentAccount().getInstitutionName(), mandateCollection.getPaymentAccount().getLast4());
        } else if (screenState instanceof USBankAccountFormScreenState.VerifyWithMicrodeposits) {
            ClientSecret clientSecret4 = this.args.getClientSecret();
            if (clientSecret4 == null) {
                return;
            }
            USBankAccountFormScreenState.VerifyWithMicrodeposits verifyWithMicrodeposits = (USBankAccountFormScreenState.VerifyWithMicrodeposits) screenState;
            attachFinancialAccountToIntent(clientSecret4, verifyWithMicrodeposits.getIntentId(), verifyWithMicrodeposits.getFinancialConnectionsSessionId(), verifyWithMicrodeposits.getPaymentAccount().getBankName(), verifyWithMicrodeposits.getPaymentAccount().getLast4());
        } else if (!(screenState instanceof USBankAccountFormScreenState.SavedAccount) || (clientSecret = this.args.getClientSecret()) == null || (financialConnectionsSessionId = (savedAccount = (USBankAccountFormScreenState.SavedAccount) screenState).getFinancialConnectionsSessionId()) == null) {
        } else {
            attachFinancialAccountToIntent(clientSecret, savedAccount.getIntentId(), financialConnectionsSessionId, savedAccount.getBankName(), savedAccount.getLast4());
        }
    }

    public final void onDestroy() {
        this.collectBankAccountLauncher = null;
    }

    public final void registerFragment(Fragment fragment) {
        s.g(fragment, "fragment");
        this.collectBankAccountLauncher = CollectBankAccountLauncher.Companion.create(fragment, new USBankAccountFormViewModel$registerFragment$1(this));
    }

    public final void reset(Integer num) {
        setHasLaunched(false);
        this.saveForFutureUseElement.getController().onValueChange(true);
        u<USBankAccountFormScreenState> uVar = this._currentScreenState;
        do {
        } while (!uVar.compareAndSet(uVar.getValue(), new USBankAccountFormScreenState.NameAndEmailCollection(num, getName().getValue(), getEmail().getValue(), this.application.getString(R.string.stripe_continue_button_label))));
    }

    public final void setCollectBankAccountLauncher(CollectBankAccountLauncher collectBankAccountLauncher) {
        this.collectBankAccountLauncher = collectBankAccountLauncher;
    }

    public final void setProcessing(boolean z11) {
        Boolean value;
        u<Boolean> uVar = this._processing;
        do {
            value = uVar.getValue();
            value.booleanValue();
        } while (!uVar.compareAndSet(value, Boolean.valueOf(z11)));
    }

    /* loaded from: classes6.dex */
    public static final class Args {
        public static final int $stable;
        private final ClientSecret clientSecret;
        private final boolean completePayment;
        private final FormFragmentArguments formArgs;
        private final String injectorKey;
        private final PaymentSelection.New.USBankAccount savedPaymentMethod;
        private final USBankAccountFormScreenState savedScreenState;

        static {
            int i11 = PaymentMethodCreateParams.$stable;
            $stable = i11 | i11 | Amount.$stable;
        }

        public Args(FormFragmentArguments formArgs, boolean z11, ClientSecret clientSecret, USBankAccountFormScreenState uSBankAccountFormScreenState, PaymentSelection.New.USBankAccount uSBankAccount, @InjectorKey String injectorKey) {
            s.g(formArgs, "formArgs");
            s.g(injectorKey, "injectorKey");
            this.formArgs = formArgs;
            this.completePayment = z11;
            this.clientSecret = clientSecret;
            this.savedScreenState = uSBankAccountFormScreenState;
            this.savedPaymentMethod = uSBankAccount;
            this.injectorKey = injectorKey;
        }

        public static /* synthetic */ Args copy$default(Args args, FormFragmentArguments formFragmentArguments, boolean z11, ClientSecret clientSecret, USBankAccountFormScreenState uSBankAccountFormScreenState, PaymentSelection.New.USBankAccount uSBankAccount, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                formFragmentArguments = args.formArgs;
            }
            if ((i11 & 2) != 0) {
                z11 = args.completePayment;
            }
            boolean z12 = z11;
            if ((i11 & 4) != 0) {
                clientSecret = args.clientSecret;
            }
            ClientSecret clientSecret2 = clientSecret;
            if ((i11 & 8) != 0) {
                uSBankAccountFormScreenState = args.savedScreenState;
            }
            USBankAccountFormScreenState uSBankAccountFormScreenState2 = uSBankAccountFormScreenState;
            if ((i11 & 16) != 0) {
                uSBankAccount = args.savedPaymentMethod;
            }
            PaymentSelection.New.USBankAccount uSBankAccount2 = uSBankAccount;
            if ((i11 & 32) != 0) {
                str = args.injectorKey;
            }
            return args.copy(formFragmentArguments, z12, clientSecret2, uSBankAccountFormScreenState2, uSBankAccount2, str);
        }

        public final FormFragmentArguments component1() {
            return this.formArgs;
        }

        public final boolean component2() {
            return this.completePayment;
        }

        public final ClientSecret component3() {
            return this.clientSecret;
        }

        public final USBankAccountFormScreenState component4() {
            return this.savedScreenState;
        }

        public final PaymentSelection.New.USBankAccount component5() {
            return this.savedPaymentMethod;
        }

        public final String component6$paymentsheet_release() {
            return this.injectorKey;
        }

        public final Args copy(FormFragmentArguments formArgs, boolean z11, ClientSecret clientSecret, USBankAccountFormScreenState uSBankAccountFormScreenState, PaymentSelection.New.USBankAccount uSBankAccount, @InjectorKey String injectorKey) {
            s.g(formArgs, "formArgs");
            s.g(injectorKey, "injectorKey");
            return new Args(formArgs, z11, clientSecret, uSBankAccountFormScreenState, uSBankAccount, injectorKey);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Args) {
                Args args = (Args) obj;
                return s.c(this.formArgs, args.formArgs) && this.completePayment == args.completePayment && s.c(this.clientSecret, args.clientSecret) && s.c(this.savedScreenState, args.savedScreenState) && s.c(this.savedPaymentMethod, args.savedPaymentMethod) && s.c(this.injectorKey, args.injectorKey);
            }
            return false;
        }

        public final ClientSecret getClientSecret() {
            return this.clientSecret;
        }

        public final boolean getCompletePayment() {
            return this.completePayment;
        }

        public final FormFragmentArguments getFormArgs() {
            return this.formArgs;
        }

        public final String getInjectorKey$paymentsheet_release() {
            return this.injectorKey;
        }

        public final PaymentSelection.New.USBankAccount getSavedPaymentMethod() {
            return this.savedPaymentMethod;
        }

        public final USBankAccountFormScreenState getSavedScreenState() {
            return this.savedScreenState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.formArgs.hashCode() * 31;
            boolean z11 = this.completePayment;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode + i11) * 31;
            ClientSecret clientSecret = this.clientSecret;
            int hashCode2 = (i12 + (clientSecret == null ? 0 : clientSecret.hashCode())) * 31;
            USBankAccountFormScreenState uSBankAccountFormScreenState = this.savedScreenState;
            int hashCode3 = (hashCode2 + (uSBankAccountFormScreenState == null ? 0 : uSBankAccountFormScreenState.hashCode())) * 31;
            PaymentSelection.New.USBankAccount uSBankAccount = this.savedPaymentMethod;
            return ((hashCode3 + (uSBankAccount != null ? uSBankAccount.hashCode() : 0)) * 31) + this.injectorKey.hashCode();
        }

        public String toString() {
            return "Args(formArgs=" + this.formArgs + ", completePayment=" + this.completePayment + ", clientSecret=" + this.clientSecret + ", savedScreenState=" + this.savedScreenState + ", savedPaymentMethod=" + this.savedPaymentMethod + ", injectorKey=" + this.injectorKey + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ Args(FormFragmentArguments formFragmentArguments, boolean z11, ClientSecret clientSecret, USBankAccountFormScreenState uSBankAccountFormScreenState, PaymentSelection.New.USBankAccount uSBankAccount, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(formFragmentArguments, z11, clientSecret, uSBankAccountFormScreenState, uSBankAccount, (i11 & 32) != 0 ? InjectorKt.DUMMY_INJECTOR_KEY : str);
        }
    }
}