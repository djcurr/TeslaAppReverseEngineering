package com.stripe.android.ui.core.elements;

import android.content.Intent;
import c1.i;
import h00.l;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ScanCardButtonUIKt$ScanCardButtonUI$4 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ l<Intent, b0> $onResult;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScanCardButtonUIKt$ScanCardButtonUI$4(l<? super Intent, b0> lVar, int i11) {
        super(2);
        this.$onResult = lVar;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        ScanCardButtonUIKt.ScanCardButtonUI(this.$onResult, iVar, this.$$changed | 1);
    }
}