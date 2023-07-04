package com.stripe.android.ui.core.elements;

import android.content.res.Resources;
import c1.o0;
import h00.l;
import kotlin.jvm.internal.u;
import vz.b0;
import x2.g;
import x2.o;

/* loaded from: classes6.dex */
final class RowElementUIKt$RowElementUI$3$1$1$1 extends u implements l<o, b0> {
    final /* synthetic */ o0<g> $dividerHeight;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowElementUIKt$RowElementUI$3$1$1$1(o0<g> o0Var) {
        super(1);
        this.$dividerHeight = o0Var;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(o oVar) {
        m471invokeozmzZPI(oVar.j());
        return b0.f54756a;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m471invokeozmzZPI(long j11) {
        this.$dividerHeight.setValue(g.c(g.f(o.f(j11) / Resources.getSystem().getDisplayMetrics().density)));
    }
}