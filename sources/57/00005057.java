package com.stripe.android.link.ui.verification;

import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.injection.NonFallbackInjectable;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.injection.SignedInViewModelSubcomponent;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.link.ui.ErrorMessageKt;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.OTPElement;
import com.stripe.android.ui.core.elements.OTPSpec;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import h00.a;
import h00.p;
import java.util.List;
import javax.inject.Provider;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import v20.k;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* loaded from: classes6.dex */
public final class VerificationViewModel extends p0 {
    private final u<ErrorMessage> _errorMessage;
    private final u<Boolean> _isProcessing;
    private final h0<ErrorMessage> errorMessage;
    private final h0<Boolean> isProcessing;
    private final LinkAccount linkAccount;
    private final LinkAccountManager linkAccountManager;
    private final Logger logger;
    private final Navigator navigator;
    private a<b0> onVerificationCompleted;
    private final h0<String> otpCode;
    private final OTPElement otpElement;

    @f(c = "com.stripe.android.link.ui.verification.VerificationViewModel$1", f = "VerificationViewModel.kt", l = {68}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends l implements p<o0, d<? super b0>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(dVar);
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
                h0 h0Var = VerificationViewModel.this.otpCode;
                final VerificationViewModel verificationViewModel = VerificationViewModel.this;
                kotlinx.coroutines.flow.f<String> fVar = new kotlinx.coroutines.flow.f<String>() { // from class: com.stripe.android.link.ui.verification.VerificationViewModel.1.1
                    @Override // kotlinx.coroutines.flow.f
                    public /* bridge */ /* synthetic */ Object emit(String str, d dVar) {
                        return emit2(str, (d<? super b0>) dVar);
                    }

                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(String str, d<? super b0> dVar) {
                        b0 b0Var;
                        Object d12;
                        if (str == null) {
                            b0Var = null;
                        } else {
                            VerificationViewModel.this.onVerificationCodeEntered(str);
                            b0Var = b0.f54756a;
                        }
                        d12 = a00.d.d();
                        return b0Var == d12 ? b0Var : b0.f54756a;
                    }
                };
                this.label = 1;
                if (h0Var.collect(fVar, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

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
            return getSubComponentBuilderProvider().get().linkAccount(this.linkAccount).build().getVerificationViewModel();
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

    public VerificationViewModel(LinkAccountManager linkAccountManager, Navigator navigator, Logger logger, LinkAccount linkAccount) {
        s.g(linkAccountManager, "linkAccountManager");
        s.g(navigator, "navigator");
        s.g(logger, "logger");
        s.g(linkAccount, "linkAccount");
        this.linkAccountManager = linkAccountManager;
        this.navigator = navigator;
        this.logger = logger;
        this.linkAccount = linkAccount;
        u<Boolean> a11 = j0.a(Boolean.FALSE);
        this._isProcessing = a11;
        this.isProcessing = a11;
        u<ErrorMessage> a12 = j0.a(null);
        this._errorMessage = a12;
        this.errorMessage = a12;
        this.onVerificationCompleted = new VerificationViewModel$onVerificationCompleted$1(this);
        if (linkAccount.getAccountStatus() != AccountStatus.VerificationStarted) {
            startVerification();
        }
        OTPElement transform = OTPSpec.INSTANCE.transform();
        this.otpElement = transform;
        final e<List<vz.p<IdentifierSpec, FormFieldEntry>>> formFieldValueFlow = transform.getFormFieldValueFlow();
        this.otpCode = g.E(new e<String>() { // from class: com.stripe.android.link.ui.verification.VerificationViewModel$special$$inlined$map$1

            /* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {
                final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;

                @f(c = "com.stripe.android.link.ui.verification.VerificationViewModel$special$$inlined$map$1$2", f = "VerificationViewModel.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
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
                        boolean r0 = r7 instanceof com.stripe.android.link.ui.verification.VerificationViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.stripe.android.link.ui.verification.VerificationViewModel$special$$inlined$map$1$2$1 r0 = (com.stripe.android.link.ui.verification.VerificationViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.link.ui.verification.VerificationViewModel$special$$inlined$map$1$2$1 r0 = new com.stripe.android.link.ui.verification.VerificationViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r7)
                        goto L63
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        vz.r.b(r7)
                        kotlinx.coroutines.flow.f r7 = r5.$this_unsafeFlow
                        java.util.List r6 = (java.util.List) r6
                        java.lang.Object r6 = wz.u.d0(r6)
                        vz.p r6 = (vz.p) r6
                        r2 = 0
                        if (r6 != 0) goto L42
                        goto L5a
                    L42:
                        java.lang.Object r6 = r6.d()
                        com.stripe.android.ui.core.forms.FormFieldEntry r6 = (com.stripe.android.ui.core.forms.FormFieldEntry) r6
                        if (r6 != 0) goto L4b
                        goto L5a
                    L4b:
                        boolean r4 = r6.isComplete()
                        if (r4 == 0) goto L52
                        goto L53
                    L52:
                        r6 = r2
                    L53:
                        if (r6 != 0) goto L56
                        goto L5a
                    L56:
                        java.lang.String r2 = r6.getValue()
                    L5a:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L63
                        return r1
                    L63:
                        vz.b0 r6 = vz.b0.f54756a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.ui.verification.VerificationViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super String> fVar, d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        }, q0.a(this), e0.f35254a.b(), null);
        k.d(q0.a(this), null, null, new AnonymousClass1(null), 3, null);
    }

    private final void clearError() {
        this._errorMessage.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Throwable th2) {
        ErrorMessage errorMessage = ErrorMessageKt.getErrorMessage(th2);
        this.logger.error("Error: ", th2);
        this._isProcessing.setValue(Boolean.FALSE);
        this._errorMessage.setValue(errorMessage);
    }

    public final h0<ErrorMessage> getErrorMessage() {
        return this.errorMessage;
    }

    public final LinkAccount getLinkAccount() {
        return this.linkAccount;
    }

    public final a<b0> getOnVerificationCompleted() {
        return this.onVerificationCompleted;
    }

    public final OTPElement getOtpElement() {
        return this.otpElement;
    }

    public final h0<Boolean> isProcessing() {
        return this.isProcessing;
    }

    public final void onBack() {
        clearError();
        this.navigator.onBack();
        this.linkAccountManager.logout();
    }

    public final void onChangeEmailClicked() {
        clearError();
        this.navigator.navigateTo(new LinkScreen.SignUp(null, 1, null), true);
        this.linkAccountManager.logout();
    }

    public final void onVerificationCodeEntered(String code) {
        s.g(code, "code");
        this._isProcessing.setValue(Boolean.TRUE);
        clearError();
        k.d(q0.a(this), null, null, new VerificationViewModel$onVerificationCodeEntered$1(this, code, null), 3, null);
    }

    public final void setOnVerificationCompleted(a<b0> aVar) {
        s.g(aVar, "<set-?>");
        this.onVerificationCompleted = aVar;
    }

    public final void startVerification() {
        clearError();
        k.d(q0.a(this), null, null, new VerificationViewModel$startVerification$1(this, null), 3, null);
    }
}