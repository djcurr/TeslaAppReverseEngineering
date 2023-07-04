package com.stripe.android.ui.core;

import c1.i;
import h00.p;
import h00.q;
import kotlin.jvm.internal.u;
import vz.b0;
import x2.g;

/* loaded from: classes6.dex */
final class MeasureComposableWidthKt$MeasureComposableWidth$1$1$contentPlaceable$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ float $composableWidth;
    final /* synthetic */ q<g, i, Integer, b0> $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MeasureComposableWidthKt$MeasureComposableWidth$1$1$contentPlaceable$1(q<? super g, ? super i, ? super Integer, b0> qVar, float f11, int i11) {
        super(2);
        this.$content = qVar;
        this.$composableWidth = f11;
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
            this.$content.invoke(g.c(this.$composableWidth), iVar, Integer.valueOf(this.$$dirty & 112));
        }
    }
}