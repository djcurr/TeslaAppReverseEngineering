package com.stripe.android.link.ui.verification;

import h00.a;
import kotlin.jvm.internal.p;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public /* synthetic */ class VerificationScreenKt$VerificationBody$3 extends p implements a<b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public VerificationScreenKt$VerificationBody$3(Object obj) {
        super(0, obj, VerificationViewModel.class, "onBack", "onBack()V", 0);
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((VerificationViewModel) this.receiver).onBack();
    }
}