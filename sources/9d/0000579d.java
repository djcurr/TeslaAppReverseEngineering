package com.stripe.android.paymentsheet.ui;

import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class LpmSelectorTextKt$LpmSelectorText$2 extends u implements h00.p<c1.i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Integer $icon;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ o1.f $modifier;
    final /* synthetic */ String $text;
    final /* synthetic */ long $textColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LpmSelectorTextKt$LpmSelectorText$2(Integer num, String str, long j11, o1.f fVar, boolean z11, int i11, int i12) {
        super(2);
        this.$icon = num;
        this.$text = str;
        this.$textColor = j11;
        this.$modifier = fVar;
        this.$isEnabled = z11;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(c1.i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(c1.i iVar, int i11) {
        LpmSelectorTextKt.m346LpmSelectorTextT042LqI(this.$icon, this.$text, this.$textColor, this.$modifier, this.$isEnabled, iVar, this.$$changed | 1, this.$$default);
    }
}