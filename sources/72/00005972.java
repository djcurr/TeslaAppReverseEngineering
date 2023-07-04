package com.stripe.android.ui.core;

import c1.i;
import h00.p;
import h00.q;
import kotlin.jvm.internal.u;
import vz.b0;
import x2.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MeasureComposableWidthKt$MeasureComposableWidth$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ p<i, Integer, b0> $composable;
    final /* synthetic */ q<g, i, Integer, b0> $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MeasureComposableWidthKt$MeasureComposableWidth$2(p<? super i, ? super Integer, b0> pVar, q<? super g, ? super i, ? super Integer, b0> qVar, int i11) {
        super(2);
        this.$composable = pVar;
        this.$content = qVar;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        MeasureComposableWidthKt.MeasureComposableWidth(this.$composable, this.$content, iVar, this.$$changed | 1);
    }
}