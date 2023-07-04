package com.stripe.android.link.ui.verification;

import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.model.Navigator;
import h00.a;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class VerificationViewModel$onVerificationCompleted$1 extends u implements a<b0> {
    final /* synthetic */ VerificationViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationViewModel$onVerificationCompleted$1(VerificationViewModel verificationViewModel) {
        super(0);
        this.this$0 = verificationViewModel;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Navigator navigator;
        navigator = this.this$0.navigator;
        navigator.navigateTo(LinkScreen.Wallet.INSTANCE, true);
    }
}