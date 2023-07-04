package com.stripe.android.link.ui.signup;

import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.injection.NonFallbackInjectable;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.injection.SignUpViewModelSubcomponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.link.ui.ErrorMessageKt;
import com.stripe.android.ui.core.elements.PhoneNumberController;
import com.stripe.android.ui.core.elements.SimpleTextFieldController;
import com.stripe.android.ui.core.elements.TextFieldController;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import h00.l;
import h00.p;
import javax.inject.Provider;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import v20.a2;
import v20.k;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* loaded from: classes6.dex */
public final class SignUpViewModel extends p0 {
    public static final Companion Companion = new Companion(null);
    public static final long LOOKUP_DEBOUNCE_MS = 700;
    public static final String PREFILLED_EMAIL = "prefilled_email";
    private final u<ErrorMessage> _errorMessage;
    private final u<SignUpState> _signUpStatus;
    private final h0<String> consumerEmail;
    private final h0<String> consumerPhoneNumber;
    private final String customerEmail;
    private final Debouncer debouncer;
    private final TextFieldController emailController;
    private final h0<ErrorMessage> errorMessage;
    private final e<Boolean> isReadyToSignUp;
    private final LinkAccountManager linkAccountManager;
    private final Logger logger;
    private final String merchantName;
    private final Navigator navigator;
    private final PhoneNumberController phoneController;
    private final String prefilledEmail;
    private final h0<SignUpState> signUpState;

    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends kotlin.jvm.internal.u implements l<SignUpState, b0> {
        AnonymousClass1() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(SignUpState signUpState) {
            invoke2(signUpState);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(SignUpState it2) {
            s.g(it2, "it");
            SignUpViewModel.this._signUpStatus.setValue(it2);
        }
    }

    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass2 extends kotlin.jvm.internal.u implements l<String, b0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "com.stripe.android.link.ui.signup.SignUpViewModel$2$1", f = "SignUpViewModel.kt", l = {91}, m = "invokeSuspend")
        /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<o0, d<? super b0>, Object> {
            final /* synthetic */ String $it;
            int label;
            final /* synthetic */ SignUpViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SignUpViewModel signUpViewModel, String str, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = signUpViewModel;
                this.$it = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<b0> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.this$0, this.$it, dVar);
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, d<? super b0> dVar) {
                return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.label;
                if (i11 == 0) {
                    r.b(obj);
                    SignUpViewModel signUpViewModel = this.this$0;
                    String str = this.$it;
                    this.label = 1;
                    if (signUpViewModel.lookupConsumerEmail(str, this) == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    r.b(obj);
                }
                return b0.f54756a;
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(String str) {
            invoke2(str);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it2) {
            s.g(it2, "it");
            k.d(q0.a(SignUpViewModel.this), null, null, new AnonymousClass1(SignUpViewModel.this, it2, null), 3, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Debouncer {
        private final String initialEmail;
        private a2 lookupJob;

        public Debouncer(String str) {
            this.initialEmail = str;
        }

        public final void startWatching(o0 coroutineScope, h0<String> emailFlow, l<? super SignUpState, b0> onStateChanged, l<? super String, b0> onValidEmailEntered) {
            s.g(coroutineScope, "coroutineScope");
            s.g(emailFlow, "emailFlow");
            s.g(onStateChanged, "onStateChanged");
            s.g(onValidEmailEntered, "onValidEmailEntered");
            k.d(coroutineScope, null, null, new SignUpViewModel$Debouncer$startWatching$1(emailFlow, this, onStateChanged, onValidEmailEntered, null), 3, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Factory implements s0.b, NonFallbackInjectable {
        private final String email;
        private final NonFallbackInjector injector;
        public Provider<SignUpViewModelSubcomponent.Builder> subComponentBuilderProvider;

        public Factory(NonFallbackInjector injector, String str) {
            s.g(injector, "injector");
            this.injector = injector;
            this.email = str;
        }

        @Override // androidx.lifecycle.s0.b
        public <T extends p0> T create(Class<T> modelClass) {
            s.g(modelClass, "modelClass");
            this.injector.inject(this);
            return getSubComponentBuilderProvider().get().prefilledEmail(this.email).build().getSignUpViewModel();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.stripe.android.core.injection.Injectable
        public Void fallbackInitialize(b0 b0Var) {
            return NonFallbackInjectable.DefaultImpls.fallbackInitialize(this, b0Var);
        }

        public final Provider<SignUpViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            Provider<SignUpViewModelSubcomponent.Builder> provider = this.subComponentBuilderProvider;
            if (provider != null) {
                return provider;
            }
            s.x("subComponentBuilderProvider");
            return null;
        }

        public final void setSubComponentBuilderProvider(Provider<SignUpViewModelSubcomponent.Builder> provider) {
            s.g(provider, "<set-?>");
            this.subComponentBuilderProvider = provider;
        }
    }

    public SignUpViewModel(LinkActivityContract.Args args, String str, LinkAccountManager linkAccountManager, Navigator navigator, Logger logger) {
        s.g(args, "args");
        s.g(linkAccountManager, "linkAccountManager");
        s.g(navigator, "navigator");
        s.g(logger, "logger");
        this.customerEmail = str;
        this.linkAccountManager = linkAccountManager;
        this.navigator = navigator;
        this.logger = logger;
        str = linkAccountManager.hasUserLoggedOut(str) ? null : str;
        this.prefilledEmail = str;
        this.merchantName = args.getMerchantName$link_release();
        SimpleTextFieldController createEmailSectionController = SimpleTextFieldController.Companion.createEmailSectionController(str);
        this.emailController = createEmailSectionController;
        PhoneNumberController createPhoneNumberController$default = PhoneNumberController.Companion.createPhoneNumberController$default(PhoneNumberController.Companion, null, null, 3, null);
        this.phoneController = createPhoneNumberController$default;
        final e<FormFieldEntry> formFieldValue = createEmailSectionController.getFormFieldValue();
        e<String> eVar = new e<String>() { // from class: com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$1

            /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {
                final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;

                @f(c = "com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$1$2", f = "SignUpViewModel.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar) {
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
                        boolean r0 = r7 instanceof com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$1$2$1 r0 = (com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$1$2$1 r0 = new com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$1$2$1
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
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super String> fVar, d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        o0 a11 = q0.a(this);
        e0.a aVar = e0.f35254a;
        h0<String> E = g.E(eVar, a11, aVar.a(), str);
        this.consumerEmail = E;
        final e<FormFieldEntry> formFieldValue2 = createPhoneNumberController$default.getFormFieldValue();
        h0<String> E2 = g.E(new e<String>() { // from class: com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$2

            /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {
                final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;

                @f(c = "com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$2$2", f = "SignUpViewModel.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar) {
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
                        boolean r0 = r7 instanceof com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$2$2$1 r0 = (com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$2$2$1 r0 = new com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$2$2$1
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
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.ui.signup.SignUpViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super String> fVar, d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        }, q0.a(this), aVar.a(), null);
        this.consumerPhoneNumber = E2;
        this.isReadyToSignUp = g.h(E, E2, new SignUpViewModel$isReadyToSignUp$1(null));
        u<SignUpState> a12 = j0.a(SignUpState.InputtingEmail);
        this._signUpStatus = a12;
        this.signUpState = a12;
        u<ErrorMessage> a13 = j0.a(null);
        this._errorMessage = a13;
        this.errorMessage = a13;
        Debouncer debouncer = new Debouncer(str);
        this.debouncer = debouncer;
        debouncer.startWatching(q0.a(this), E, new AnonymousClass1(), new AnonymousClass2());
    }

    private final void clearError() {
        this._errorMessage.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object lookupConsumerEmail(java.lang.String r8, zz.d<? super vz.b0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.stripe.android.link.ui.signup.SignUpViewModel$lookupConsumerEmail$1
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.link.ui.signup.SignUpViewModel$lookupConsumerEmail$1 r0 = (com.stripe.android.link.ui.signup.SignUpViewModel$lookupConsumerEmail$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.link.ui.signup.SignUpViewModel$lookupConsumerEmail$1 r0 = new com.stripe.android.link.ui.signup.SignUpViewModel$lookupConsumerEmail$1
            r0.<init>(r7, r9)
        L18:
            r4 = r0
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = a00.b.d()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r8 = r4.L$0
            com.stripe.android.link.ui.signup.SignUpViewModel r8 = (com.stripe.android.link.ui.signup.SignUpViewModel) r8
            vz.r.b(r9)
            vz.q r9 = (vz.q) r9
            java.lang.Object r9 = r9.j()
            goto L54
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            vz.r.b(r9)
            r7.clearError()
            com.stripe.android.link.account.LinkAccountManager r1 = r7.linkAccountManager
            r3 = 0
            r5 = 2
            r6 = 0
            r4.L$0 = r7
            r4.label = r2
            r2 = r8
            java.lang.Object r9 = com.stripe.android.link.account.LinkAccountManager.m157lookupConsumer0E7RQCE$default(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L53
            return r0
        L53:
            r8 = r7
        L54:
            java.lang.Throwable r0 = vz.q.e(r9)
            if (r0 != 0) goto L6a
            com.stripe.android.link.model.LinkAccount r9 = (com.stripe.android.link.model.LinkAccount) r9
            if (r9 == 0) goto L62
            r8.onAccountFetched(r9)
            goto L6d
        L62:
            kotlinx.coroutines.flow.u<com.stripe.android.link.ui.signup.SignUpState> r8 = r8._signUpStatus
            com.stripe.android.link.ui.signup.SignUpState r9 = com.stripe.android.link.ui.signup.SignUpState.InputtingPhone
            r8.setValue(r9)
            goto L6d
        L6a:
            r8.onError(r0)
        L6d:
            vz.b0 r8 = vz.b0.f54756a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.ui.signup.SignUpViewModel.lookupConsumerEmail(java.lang.String, zz.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAccountFetched(LinkAccount linkAccount) {
        if (linkAccount.isVerified()) {
            this.navigator.navigateTo(LinkScreen.Wallet.INSTANCE, true);
            return;
        }
        Navigator.navigateTo$default(this.navigator, LinkScreen.Verification.INSTANCE, false, 2, null);
        this.emailController.onRawValueChange("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Throwable th2) {
        ErrorMessage errorMessage = ErrorMessageKt.getErrorMessage(th2);
        this.logger.error("Error: ", th2);
        this._errorMessage.setValue(errorMessage);
    }

    public final TextFieldController getEmailController() {
        return this.emailController;
    }

    public final h0<ErrorMessage> getErrorMessage() {
        return this.errorMessage;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final PhoneNumberController getPhoneController() {
        return this.phoneController;
    }

    public final h0<SignUpState> getSignUpState() {
        return this.signUpState;
    }

    public final e<Boolean> isReadyToSignUp() {
        return this.isReadyToSignUp;
    }

    public final void onSignUpClick() {
        clearError();
        String value = this.consumerEmail.getValue();
        if (value != null) {
            String str = value;
            PhoneNumberController phoneNumberController = this.phoneController;
            String value2 = this.consumerPhoneNumber.getValue();
            if (value2 != null) {
                k.d(q0.a(this), null, null, new SignUpViewModel$onSignUpClick$1(this, str, phoneNumberController.getE164PhoneNumber(value2), this.phoneController.getCountryCode(), null), 3, null);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}