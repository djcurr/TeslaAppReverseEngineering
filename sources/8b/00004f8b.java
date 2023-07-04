package com.stripe.android.link.ui;

import c1.i;
import h00.a;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PrimaryButtonKt$PrimaryButton$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Integer $icon;
    final /* synthetic */ String $label;
    final /* synthetic */ a<b0> $onButtonClick;
    final /* synthetic */ PrimaryButtonState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonKt$PrimaryButton$2(String str, PrimaryButtonState primaryButtonState, Integer num, a<b0> aVar, int i11, int i12) {
        super(2);
        this.$label = str;
        this.$state = primaryButtonState;
        this.$icon = num;
        this.$onButtonClick = aVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        PrimaryButtonKt.PrimaryButton(this.$label, this.$state, this.$icon, this.$onButtonClick, iVar, this.$$changed | 1, this.$$default);
    }
}