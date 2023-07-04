package com.stripe.android.link.ui.wallet;

import h00.a;
import h00.l;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class WalletScreenKt$ExpandedPaymentDetails$1$2$1$1 extends u implements a<b0> {
    final /* synthetic */ int $index;
    final /* synthetic */ l<Integer, b0> $onIndexSelected;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletScreenKt$ExpandedPaymentDetails$1$2$1$1(l<? super Integer, b0> lVar, int i11) {
        super(0);
        this.$onIndexSelected = lVar;
        this.$index = i11;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onIndexSelected.invoke(Integer.valueOf(this.$index));
    }
}