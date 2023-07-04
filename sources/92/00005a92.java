package com.stripe.android.ui.core.elements;

import c1.o0;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import n2.w;
import vz.b0;

/* loaded from: classes6.dex */
final class HtmlKt$ClickableText$2$1 extends u implements l<w, b0> {
    final /* synthetic */ o0<w> $layoutResult;
    final /* synthetic */ l<w, b0> $onTextLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HtmlKt$ClickableText$2$1(o0<w> o0Var, l<? super w, b0> lVar) {
        super(1);
        this.$layoutResult = o0Var;
        this.$onTextLayout = lVar;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(w wVar) {
        invoke2(wVar);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(w it2) {
        s.g(it2, "it");
        this.$layoutResult.setValue(it2);
        this.$onTextLayout.invoke(it2);
    }
}