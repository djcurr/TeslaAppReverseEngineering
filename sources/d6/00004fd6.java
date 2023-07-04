package com.stripe.android.link.ui.inline;

import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import com.stripe.android.core.Logger;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.injection.NonFallbackInjectable;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.ui.inline.UserInput;
import com.stripe.android.link.ui.signup.SignUpState;
import com.stripe.android.link.ui.signup.SignUpViewModel;
import com.stripe.android.ui.core.elements.PhoneNumberController;
import com.stripe.android.ui.core.elements.SimpleTextFieldController;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import kotlin.coroutines.jvm.internal.d;
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
public final class InlineSignupViewModel extends p0 {
    private final u<SignUpState> _signUpStatus;
    private final h0<String> consumerEmail;
    private final h0<String> consumerPhoneNumber;
    private SignUpViewModel.Debouncer debouncer;
    private final SimpleTextFieldController emailController;
    private boolean hasExpanded;
    private final u<Boolean> isExpanded;
    private final LinkAccountManager linkAccountManager;
    private final Logger logger;
    private final String merchantName;
    private final PhoneNumberController phoneController;
    private final String prefilledEmail;
    private final h0<SignUpState> signUpState;
    private final u<UserInput> userInput;

    /* loaded from: classes6.dex */
    public static final class Factory implements s0.b, NonFallbackInjectable {
        private final NonFallbackInjector injector;
        public InlineSignupViewModel viewModel;

        public Factory(NonFallbackInjector injector) {
            s.g(injector, "injector");
            this.injector = injector;
        }

        @Override // androidx.lifecycle.s0.b
        public <T extends p0> T create(Class<T> modelClass) {
            s.g(modelClass, "modelClass");
            this.injector.inject(this);
            return getViewModel();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.stripe.android.core.injection.Injectable
        public Void fallbackInitialize(b0 b0Var) {
            return NonFallbackInjectable.DefaultImpls.fallbackInitialize(this, b0Var);
        }

        public final InlineSignupViewModel getViewModel() {
            InlineSignupViewModel inlineSignupViewModel = this.viewModel;
            if (inlineSignupViewModel != null) {
                return inlineSignupViewModel;
            }
            s.x("viewModel");
            return null;
        }

        public final void setViewModel(InlineSignupViewModel inlineSignupViewModel) {
            s.g(inlineSignupViewModel, "<set-?>");
            this.viewModel = inlineSignupViewModel;
        }
    }

    public InlineSignupViewModel(String merchantName, String str, LinkAccountManager linkAccountManager, Logger logger) {
        s.g(merchantName, "merchantName");
        s.g(linkAccountManager, "linkAccountManager");
        s.g(logger, "logger");
        this.merchantName = merchantName;
        this.linkAccountManager = linkAccountManager;
        this.logger = logger;
        str = linkAccountManager.hasUserLoggedOut(str) ? null : str;
        this.prefilledEmail = str;
        SimpleTextFieldController createEmailSectionController = SimpleTextFieldController.Companion.createEmailSectionController(str);
        this.emailController = createEmailSectionController;
        PhoneNumberController createPhoneNumberController$default = PhoneNumberController.Companion.createPhoneNumberController$default(PhoneNumberController.Companion, null, null, 3, null);
        this.phoneController = createPhoneNumberController$default;
        final e<FormFieldEntry> formFieldValue = createEmailSectionController.getFormFieldValue();
        e<String> eVar = new e<String>() { // from class: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$1

            /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$1$2", f = "InlineSignupViewModel.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
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
                        boolean r0 = r7 instanceof com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$1$2$1 r0 = (com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$1$2$1 r0 = new com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$1$2$1
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
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
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
        this.consumerEmail = g.E(eVar, a11, aVar.b(), str);
        final e<FormFieldEntry> formFieldValue2 = createPhoneNumberController$default.getFormFieldValue();
        this.consumerPhoneNumber = g.E(new e<String>() { // from class: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$2

            /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$2$2", f = "InlineSignupViewModel.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$2$2$1  reason: invalid class name */
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
                        boolean r0 = r7 instanceof com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$2$2$1 r0 = (com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$2$2$1 r0 = new com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$2$2$1
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
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.ui.inline.InlineSignupViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super String> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        }, q0.a(this), aVar.b(), null);
        u<SignUpState> a12 = j0.a(SignUpState.InputtingEmail);
        this._signUpStatus = a12;
        this.signUpState = a12;
        this.isExpanded = j0.a(Boolean.FALSE);
        this.userInput = j0.a(null);
        this.debouncer = new SignUpViewModel.Debouncer(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object lookupConsumerEmail(java.lang.String r5, zz.d<? super vz.b0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.link.ui.inline.InlineSignupViewModel$lookupConsumerEmail$1
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.link.ui.inline.InlineSignupViewModel$lookupConsumerEmail$1 r0 = (com.stripe.android.link.ui.inline.InlineSignupViewModel$lookupConsumerEmail$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.link.ui.inline.InlineSignupViewModel$lookupConsumerEmail$1 r0 = new com.stripe.android.link.ui.inline.InlineSignupViewModel$lookupConsumerEmail$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            com.stripe.android.link.ui.inline.InlineSignupViewModel r0 = (com.stripe.android.link.ui.inline.InlineSignupViewModel) r0
            vz.r.b(r6)
            vz.q r6 = (vz.q) r6
            java.lang.Object r6 = r6.j()
            goto L53
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            vz.r.b(r6)
            com.stripe.android.link.account.LinkAccountManager r6 = r4.linkAccountManager
            r2 = 0
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.m160lookupConsumer0E7RQCE(r5, r2, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            r0 = r4
        L53:
            java.lang.Throwable r1 = vz.q.e(r6)
            if (r1 != 0) goto L81
            com.stripe.android.link.model.LinkAccount r6 = (com.stripe.android.link.model.LinkAccount) r6
            if (r6 == 0) goto L71
            kotlinx.coroutines.flow.u r6 = r0.getUserInput()
            com.stripe.android.link.ui.inline.UserInput$SignIn r1 = new com.stripe.android.link.ui.inline.UserInput$SignIn
            r1.<init>(r5)
            r6.setValue(r1)
            kotlinx.coroutines.flow.u<com.stripe.android.link.ui.signup.SignUpState> r5 = r0._signUpStatus
            com.stripe.android.link.ui.signup.SignUpState r6 = com.stripe.android.link.ui.signup.SignUpState.InputtingEmail
            r5.setValue(r6)
            goto L84
        L71:
            kotlinx.coroutines.flow.u r5 = r0.getUserInput()
            r6 = 0
            r5.setValue(r6)
            kotlinx.coroutines.flow.u<com.stripe.android.link.ui.signup.SignUpState> r5 = r0._signUpStatus
            com.stripe.android.link.ui.signup.SignUpState r6 = com.stripe.android.link.ui.signup.SignUpState.InputtingPhone
            r5.setValue(r6)
            goto L84
        L81:
            r0.onError(r1)
        L84:
            vz.b0 r5 = vz.b0.f54756a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.ui.inline.InlineSignupViewModel.lookupConsumerEmail(java.lang.String, zz.d):java.lang.Object");
    }

    private final void onError(Throwable th2) {
        Logger logger = this.logger;
        String localizedMessage = th2.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "Internal error.";
        }
        Logger.DefaultImpls.error$default(logger, localizedMessage, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPhoneInput(String str) {
        if (str != null) {
            String value = this.consumerEmail.getValue();
            if (value != null) {
                this.userInput.setValue(new UserInput.SignUp(value, this.phoneController.getE164PhoneNumber(str), this.phoneController.getCountryCode()));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.userInput.setValue(null);
    }

    private final void watchUserInput() {
        this.debouncer.startWatching(q0.a(this), this.consumerEmail, new InlineSignupViewModel$watchUserInput$1(this), new InlineSignupViewModel$watchUserInput$2(this));
        k.d(q0.a(this), null, null, new InlineSignupViewModel$watchUserInput$3(this, null), 3, null);
    }

    public final SimpleTextFieldController getEmailController() {
        return this.emailController;
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

    public final u<UserInput> getUserInput() {
        return this.userInput;
    }

    public final u<Boolean> isExpanded() {
        return this.isExpanded;
    }

    public final void toggleExpanded() {
        u<Boolean> uVar = this.isExpanded;
        uVar.setValue(Boolean.valueOf(!uVar.getValue().booleanValue()));
        if (!this.isExpanded.getValue().booleanValue() || this.hasExpanded) {
            return;
        }
        this.hasExpanded = true;
        watchUserInput();
    }
}