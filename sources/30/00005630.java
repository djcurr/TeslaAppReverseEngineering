package com.stripe.android.paymentsheet.forms;

import h00.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import p0.i;
import vz.b0;

/* renamed from: com.stripe.android.paymentsheet.forms.ComposableSingletons$FormUIKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$FormUIKt$lambda1$1 extends u implements q<i, c1.i, Integer, b0> {
    public static final ComposableSingletons$FormUIKt$lambda1$1 INSTANCE = new ComposableSingletons$FormUIKt$lambda1$1();

    ComposableSingletons$FormUIKt$lambda1$1() {
        super(3);
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, c1.i iVar2, Integer num) {
        invoke(iVar, iVar2, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i FormUI, c1.i iVar, int i11) {
        s.g(FormUI, "$this$FormUI");
        if (((i11 & 81) ^ 16) == 0 && iVar.i()) {
            iVar.G();
        } else {
            FormUIKt.Loading(iVar, 0);
        }
    }
}