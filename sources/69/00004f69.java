package com.stripe.android.link.ui;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CommonKt$ErrorText$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonKt$ErrorText$2(String str, int i11) {
        super(2);
        this.$text = str;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        CommonKt.ErrorText(this.$text, iVar, this.$$changed | 1);
    }
}