package com.stripe.android.link.ui.signup;

import com.stripe.android.link.ui.signup.SignUpViewModel;
import h00.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.h0;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.a2;
import v20.k;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.ui.signup.SignUpViewModel$Debouncer$startWatching$1", f = "SignUpViewModel.kt", l = {CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SignUpViewModel$Debouncer$startWatching$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ h0<String> $emailFlow;
    final /* synthetic */ h00.l<SignUpState, b0> $onStateChanged;
    final /* synthetic */ h00.l<String, b0> $onValidEmailEntered;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SignUpViewModel.Debouncer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SignUpViewModel$Debouncer$startWatching$1(h0<String> h0Var, SignUpViewModel.Debouncer debouncer, h00.l<? super SignUpState, b0> lVar, h00.l<? super String, b0> lVar2, d<? super SignUpViewModel$Debouncer$startWatching$1> dVar) {
        super(2, dVar);
        this.$emailFlow = h0Var;
        this.this$0 = debouncer;
        this.$onStateChanged = lVar;
        this.$onValidEmailEntered = lVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        SignUpViewModel$Debouncer$startWatching$1 signUpViewModel$Debouncer$startWatching$1 = new SignUpViewModel$Debouncer$startWatching$1(this.$emailFlow, this.this$0, this.$onStateChanged, this.$onValidEmailEntered, dVar);
        signUpViewModel$Debouncer$startWatching$1.L$0 = obj;
        return signUpViewModel$Debouncer$startWatching$1;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((SignUpViewModel$Debouncer$startWatching$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            final o0 o0Var = (o0) this.L$0;
            h0<String> h0Var = this.$emailFlow;
            final SignUpViewModel.Debouncer debouncer = this.this$0;
            final h00.l<SignUpState, b0> lVar = this.$onStateChanged;
            final h00.l<String, b0> lVar2 = this.$onValidEmailEntered;
            kotlinx.coroutines.flow.f<String> fVar = new kotlinx.coroutines.flow.f<String>() { // from class: com.stripe.android.link.ui.signup.SignUpViewModel$Debouncer$startWatching$1.1
                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(String str, d dVar) {
                    return emit2(str, (d<? super b0>) dVar);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(String str, d<? super b0> dVar) {
                    String str2;
                    a2 a2Var;
                    Object d12;
                    a2 d13;
                    a2 a2Var2;
                    Object d14;
                    str2 = SignUpViewModel.Debouncer.this.initialEmail;
                    if (s.c(str, str2)) {
                        a2Var2 = SignUpViewModel.Debouncer.this.lookupJob;
                        if (a2Var2 == null) {
                            if (str != null) {
                                b0 invoke = lVar.invoke(SignUpState.InputtingPhone);
                                d14 = a00.d.d();
                                if (invoke == d14) {
                                    return invoke;
                                }
                            }
                            return b0.f54756a;
                        }
                    }
                    a2Var = SignUpViewModel.Debouncer.this.lookupJob;
                    if (a2Var != null) {
                        a2.a.a(a2Var, null, 1, null);
                    }
                    if (str != null) {
                        SignUpViewModel.Debouncer debouncer2 = SignUpViewModel.Debouncer.this;
                        d13 = k.d(o0Var, null, null, new SignUpViewModel$Debouncer$startWatching$1$1$emit$2(lVar, lVar2, str, null), 3, null);
                        debouncer2.lookupJob = d13;
                    } else {
                        b0 invoke2 = lVar.invoke(SignUpState.InputtingEmail);
                        d12 = a00.d.d();
                        if (invoke2 == d12) {
                            return invoke2;
                        }
                    }
                    return b0.f54756a;
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