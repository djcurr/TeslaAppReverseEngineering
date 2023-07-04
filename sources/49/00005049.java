package com.stripe.android.link.ui.verification;

import c1.o0;
import com.stripe.android.link.ui.verification.VerificationDialogKt$LinkVerificationDialog$1;
import h00.a;
import h00.l;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class VerificationDialogKt$LinkVerificationDialog$1$1$1$2$1$1$1$1$1 extends u implements a<b0> {
    final /* synthetic */ o0<Boolean> $openDialog$delegate;
    final /* synthetic */ l<Boolean, b0> $verificationCallback;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VerificationDialogKt$LinkVerificationDialog$1$1$1$2$1$1$1$1$1(l<? super Boolean, b0> lVar, o0<Boolean> o0Var) {
        super(0);
        this.$verificationCallback = lVar;
        this.$openDialog$delegate = o0Var;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        VerificationDialogKt$LinkVerificationDialog$1.AnonymousClass1.m238invoke$lambda2(this.$openDialog$delegate, false);
        this.$verificationCallback.invoke(Boolean.FALSE);
    }
}