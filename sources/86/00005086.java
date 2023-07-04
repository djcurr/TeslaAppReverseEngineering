package com.stripe.android.link.ui.wallet;

import kotlin.jvm.internal.a;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public /* synthetic */ class WalletScreenKt$WalletBody$1 extends a implements h00.a<b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public WalletScreenKt$WalletBody$1(Object obj) {
        super(0, obj, WalletViewModel.class, "addNewPaymentMethod", "addNewPaymentMethod(Z)V", 0);
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        WalletViewModel.addNewPaymentMethod$default((WalletViewModel) this.receiver, false, 1, null);
    }
}