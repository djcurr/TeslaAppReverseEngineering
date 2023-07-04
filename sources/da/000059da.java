package com.stripe.android.ui.core.elements;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class AfterpayClearpayElementUIKt$AfterpayClearpayElementUI$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AfterpayClearpayHeaderElement $element;
    final /* synthetic */ boolean $enabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayClearpayElementUIKt$AfterpayClearpayElementUI$2(boolean z11, AfterpayClearpayHeaderElement afterpayClearpayHeaderElement, int i11) {
        super(2);
        this.$enabled = z11;
        this.$element = afterpayClearpayHeaderElement;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        AfterpayClearpayElementUIKt.AfterpayClearpayElementUI(this.$enabled, this.$element, iVar, this.$$changed | 1);
    }
}