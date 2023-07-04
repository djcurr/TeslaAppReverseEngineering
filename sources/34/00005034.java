package com.stripe.android.link.ui.signup;

import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.o0;
import v20.p0;
import v20.y0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.link.ui.signup.SignUpViewModel$Debouncer$startWatching$1$1$emit$2", f = "SignUpViewModel.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class SignUpViewModel$Debouncer$startWatching$1$1$emit$2 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ String $email;
    final /* synthetic */ h00.l<SignUpState, b0> $onStateChanged;
    final /* synthetic */ h00.l<String, b0> $onValidEmailEntered;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SignUpViewModel$Debouncer$startWatching$1$1$emit$2(h00.l<? super SignUpState, b0> lVar, h00.l<? super String, b0> lVar2, String str, d<? super SignUpViewModel$Debouncer$startWatching$1$1$emit$2> dVar) {
        super(2, dVar);
        this.$onStateChanged = lVar;
        this.$onValidEmailEntered = lVar2;
        this.$email = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        SignUpViewModel$Debouncer$startWatching$1$1$emit$2 signUpViewModel$Debouncer$startWatching$1$1$emit$2 = new SignUpViewModel$Debouncer$startWatching$1$1$emit$2(this.$onStateChanged, this.$onValidEmailEntered, this.$email, dVar);
        signUpViewModel$Debouncer$startWatching$1$1$emit$2.L$0 = obj;
        return signUpViewModel$Debouncer$startWatching$1$1$emit$2;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((SignUpViewModel$Debouncer$startWatching$1$1$emit$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        o0 o0Var;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            o0 o0Var2 = (o0) this.L$0;
            this.L$0 = o0Var2;
            this.label = 1;
            if (y0.b(700L, this) == d11) {
                return d11;
            }
            o0Var = o0Var2;
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            o0Var = (o0) this.L$0;
            r.b(obj);
        }
        if (p0.f(o0Var)) {
            this.$onStateChanged.invoke(SignUpState.VerifyingEmail);
            this.$onValidEmailEntered.invoke(this.$email);
        }
        return b0.f54756a;
    }
}