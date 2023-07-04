package com.stripe.android.ui.core.elements;

import c1.i;
import h00.p;
import java.util.Map;
import kotlin.jvm.internal.u;
import n2.a0;
import n2.s;
import o1.f;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class HtmlKt$Html$3 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ String $html;
    final /* synthetic */ Map<String, EmbeddableImage> $imageGetter;
    final /* synthetic */ f $modifier;
    final /* synthetic */ a0 $style;
    final /* synthetic */ s $urlSpanStyle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlKt$Html$3(String str, Map<String, EmbeddableImage> map, long j11, a0 a0Var, f fVar, s sVar, int i11, int i12) {
        super(2);
        this.$html = str;
        this.$imageGetter = map;
        this.$color = j11;
        this.$style = a0Var;
        this.$modifier = fVar;
        this.$urlSpanStyle = sVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        HtmlKt.m444HtmlFU0evQE(this.$html, this.$imageGetter, this.$color, this.$style, this.$modifier, this.$urlSpanStyle, iVar, this.$$changed | 1, this.$$default);
    }
}