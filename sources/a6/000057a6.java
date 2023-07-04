package com.stripe.android.paymentsheet.ui;

import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class PrimaryButton$onFinishProcessing$1 extends u implements h00.a<b0> {
    final /* synthetic */ h00.a<b0> $onAnimationEnd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButton$onFinishProcessing$1(h00.a<b0> aVar) {
        super(0);
        this.$onAnimationEnd = aVar;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onAnimationEnd.invoke();
    }
}