package com.stripe.android.ui.core;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class MeasureComposableWidthKt$MeasureComposableWidth$1$1$composableWidth$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ p<i, Integer, b0> $composable;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MeasureComposableWidthKt$MeasureComposableWidth$1$1$composableWidth$1(p<? super i, ? super Integer, b0> pVar, int i11) {
        super(2);
        this.$composable = pVar;
        this.$$dirty = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
        } else {
            this.$composable.invoke(iVar, Integer.valueOf(this.$$dirty & 14));
        }
    }
}