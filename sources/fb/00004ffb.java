package com.stripe.android.link.ui.paymentmethod;

import h00.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import p0.i;
import vz.b0;

/* renamed from: com.stripe.android.link.ui.paymentmethod.ComposableSingletons$PaymentMethodScreenKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$PaymentMethodScreenKt$lambda1$1 extends u implements q<i, c1.i, Integer, b0> {
    public static final ComposableSingletons$PaymentMethodScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$PaymentMethodScreenKt$lambda1$1();

    ComposableSingletons$PaymentMethodScreenKt$lambda1$1() {
        super(3);
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, c1.i iVar2, Integer num) {
        invoke(iVar, iVar2, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i PaymentMethodBody, c1.i iVar, int i11) {
        s.g(PaymentMethodBody, "$this$PaymentMethodBody");
        if (((i11 & 81) ^ 16) == 0 && iVar.i()) {
            iVar.G();
        }
    }
}