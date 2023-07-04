package com.stripe.android.paymentsheet.ui;

import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GooglePayDividerKt$GooglePayDividerUi$2 extends u implements h00.p<c1.i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayDividerKt$GooglePayDividerUi$2(String str, int i11, int i12) {
        super(2);
        this.$text = str;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(c1.i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(c1.i iVar, int i11) {
        GooglePayDividerKt.GooglePayDividerUi(this.$text, iVar, this.$$changed | 1, this.$$default);
    }
}