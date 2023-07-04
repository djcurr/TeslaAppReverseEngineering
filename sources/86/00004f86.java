package com.stripe.android.link.ui;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import o1.f;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class LinkTermsKt$LinkTerms$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ f $modifier;
    final /* synthetic */ int $textAlign;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkTermsKt$LinkTerms$1(f fVar, int i11, int i12, int i13) {
        super(2);
        this.$modifier = fVar;
        this.$textAlign = i11;
        this.$$changed = i12;
        this.$$default = i13;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        LinkTermsKt.m200LinkTerms5stqomU(this.$modifier, this.$textAlign, iVar, this.$$changed | 1, this.$$default);
    }
}