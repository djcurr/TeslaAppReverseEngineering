package com.stripe.android.ui.core.elements;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SectionUIKt$Section$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ p<i, Integer, b0> $contentInCard;
    final /* synthetic */ p<i, Integer, b0> $contentOutsideCard;
    final /* synthetic */ String $error;
    final /* synthetic */ Integer $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SectionUIKt$Section$2(Integer num, String str, p<? super i, ? super Integer, b0> pVar, p<? super i, ? super Integer, b0> pVar2, int i11, int i12) {
        super(2);
        this.$title = num;
        this.$error = str;
        this.$contentOutsideCard = pVar;
        this.$contentInCard = pVar2;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        SectionUIKt.Section(this.$title, this.$error, this.$contentOutsideCard, this.$contentInCard, iVar, this.$$changed | 1, this.$$default);
    }
}