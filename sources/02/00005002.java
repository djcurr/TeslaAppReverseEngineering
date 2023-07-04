package com.stripe.android.link.ui.paymentmethod;

import h00.a;
import kotlin.jvm.internal.p;
import vz.b0;

/* loaded from: classes6.dex */
/* synthetic */ class PaymentMethodScreenKt$PaymentMethodBody$2 extends p implements a<b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public PaymentMethodScreenKt$PaymentMethodBody$2(Object obj) {
        super(0, obj, PaymentMethodViewModel.class, "payAnotherWay", "payAnotherWay()V", 0);
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((PaymentMethodViewModel) this.receiver).payAnotherWay();
    }
}