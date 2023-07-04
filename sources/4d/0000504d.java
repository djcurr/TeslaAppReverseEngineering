package com.stripe.android.link.ui.verification;

import androidx.compose.ui.platform.n1;
import c1.v1;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import r1.g;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.ui.verification.VerificationScreenKt$VerificationBody$2", f = "VerificationScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class VerificationScreenKt$VerificationBody$2 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ g $focusManager;
    final /* synthetic */ v1<Boolean> $isProcessing$delegate;
    final /* synthetic */ n1 $keyboardController;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenKt$VerificationBody$2(g gVar, n1 n1Var, v1<Boolean> v1Var, d<? super VerificationScreenKt$VerificationBody$2> dVar) {
        super(2, dVar);
        this.$focusManager = gVar;
        this.$keyboardController = n1Var;
        this.$isProcessing$delegate = v1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new VerificationScreenKt$VerificationBody$2(this.$focusManager, this.$keyboardController, this.$isProcessing$delegate, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((VerificationScreenKt$VerificationBody$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean m239VerificationBody$lambda0;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            m239VerificationBody$lambda0 = VerificationScreenKt.m239VerificationBody$lambda0(this.$isProcessing$delegate);
            if (m239VerificationBody$lambda0) {
                this.$focusManager.b(true);
                n1 n1Var = this.$keyboardController;
                if (n1Var != null) {
                    n1Var.hide();
                }
            }
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}