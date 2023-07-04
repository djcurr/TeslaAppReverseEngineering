package com.stripe.android.link.ui.signup;

import androidx.compose.ui.platform.n1;
import h00.a;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class SignUpScreenKt$SignUpBody$3$2$1$3$1 extends u implements a<b0> {
    final /* synthetic */ n1 $keyboardController;
    final /* synthetic */ a<b0> $onSignUpClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpScreenKt$SignUpBody$3$2$1$3$1(a<b0> aVar, n1 n1Var) {
        super(0);
        this.$onSignUpClick = aVar;
        this.$keyboardController = n1Var;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onSignUpClick.invoke();
        n1 n1Var = this.$keyboardController;
        if (n1Var == null) {
            return;
        }
        n1Var.hide();
    }
}