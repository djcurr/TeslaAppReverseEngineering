package com.stripe.android.ui.core.elements;

import androidx.compose.ui.platform.n1;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import r1.s;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.ui.core.elements.OTPElementUIKt$OTPElementUI$1$2", f = "OTPElementUI.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class OTPElementUIKt$OTPElementUI$1$2 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ s $focusRequester;
    final /* synthetic */ n1 $keyboardController;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPElementUIKt$OTPElementUI$1$2(s sVar, n1 n1Var, d<? super OTPElementUIKt$OTPElementUI$1$2> dVar) {
        super(2, dVar);
        this.$focusRequester = sVar;
        this.$keyboardController = n1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new OTPElementUIKt$OTPElementUI$1$2(this.$focusRequester, this.$keyboardController, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((OTPElementUIKt$OTPElementUI$1$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            this.$focusRequester.c();
            n1 n1Var = this.$keyboardController;
            if (n1Var != null) {
                n1Var.show();
            }
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}