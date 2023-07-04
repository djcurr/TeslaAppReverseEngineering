package com.stripe.android.paymentsheet.ui;

import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GooglePayDividerKt$GooglePayDividerLine$1 extends u implements h00.p<c1.i, Integer, b0> {
    final /* synthetic */ int $$changed;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayDividerKt$GooglePayDividerLine$1(int i11) {
        super(2);
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(c1.i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(c1.i iVar, int i11) {
        GooglePayDividerKt.GooglePayDividerLine(iVar, this.$$changed | 1);
    }
}