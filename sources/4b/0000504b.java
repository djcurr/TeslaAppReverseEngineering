package com.stripe.android.link.ui.verification;

import c1.i;
import com.stripe.android.link.LinkPaymentLauncher;
import h00.l;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class VerificationDialogKt$LinkVerificationDialog$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ LinkPaymentLauncher $linkLauncher;
    final /* synthetic */ l<Boolean, b0> $verificationCallback;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VerificationDialogKt$LinkVerificationDialog$2(LinkPaymentLauncher linkPaymentLauncher, l<? super Boolean, b0> lVar, int i11) {
        super(2);
        this.$linkLauncher = linkPaymentLauncher;
        this.$verificationCallback = lVar;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        VerificationDialogKt.LinkVerificationDialog(this.$linkLauncher, this.$verificationCallback, iVar, this.$$changed | 1);
    }
}