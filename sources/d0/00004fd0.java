package com.stripe.android.link.ui.forms;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.e;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FormUIKt$Form$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ e<Boolean> $enabledFlow;
    final /* synthetic */ FormController $formController;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormUIKt$Form$1(FormController formController, e<Boolean> eVar, int i11) {
        super(2);
        this.$formController = formController;
        this.$enabledFlow = eVar;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        FormUIKt.Form(this.$formController, this.$enabledFlow, iVar, this.$$changed | 1);
    }
}