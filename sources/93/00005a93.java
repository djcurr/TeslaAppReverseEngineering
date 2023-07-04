package com.stripe.android.ui.core.elements;

import c1.i;
import h00.p;
import java.util.Map;
import kotlin.jvm.internal.u;
import n2.a;
import n2.a0;
import n2.w;
import o1.f;
import vz.b0;
import w0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class HtmlKt$ClickableText$3 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ Map<String, l> $inlineContent;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ f $modifier;
    final /* synthetic */ h00.l<Integer, b0> $onClick;
    final /* synthetic */ h00.l<w, b0> $onTextLayout;
    final /* synthetic */ int $overflow;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ a0 $style;
    final /* synthetic */ a $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HtmlKt$ClickableText$3(a aVar, f fVar, Map<String, l> map, long j11, a0 a0Var, boolean z11, int i11, int i12, h00.l<? super w, b0> lVar, h00.l<? super Integer, b0> lVar2, int i13, int i14) {
        super(2);
        this.$text = aVar;
        this.$modifier = fVar;
        this.$inlineContent = map;
        this.$color = j11;
        this.$style = a0Var;
        this.$softWrap = z11;
        this.$overflow = i11;
        this.$maxLines = i12;
        this.$onTextLayout = lVar;
        this.$onClick = lVar2;
        this.$$changed = i13;
        this.$$default = i14;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        HtmlKt.m443ClickableTextDauHOvk(this.$text, this.$modifier, this.$inlineContent, this.$color, this.$style, this.$softWrap, this.$overflow, this.$maxLines, this.$onTextLayout, this.$onClick, iVar, this.$$changed | 1, this.$$default);
    }
}