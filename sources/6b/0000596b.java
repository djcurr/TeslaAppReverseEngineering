package com.stripe.android.ui.core;

import c1.i;
import com.stripe.android.ui.core.elements.FormElement;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import h00.p;
import h00.q;
import java.util.List;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.e;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FormUIKt$FormUI$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ e<List<FormElement>> $elementsFlow;
    final /* synthetic */ e<Boolean> $enabledFlow;
    final /* synthetic */ e<List<IdentifierSpec>> $hiddenIdentifiersFlow;
    final /* synthetic */ e<IdentifierSpec> $lastTextFieldIdentifierFlow;
    final /* synthetic */ q<p0.i, i, Integer, b0> $loadingComposable;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FormUIKt$FormUI$2(e<? extends List<IdentifierSpec>> eVar, e<Boolean> eVar2, e<? extends List<? extends FormElement>> eVar3, e<IdentifierSpec> eVar4, q<? super p0.i, ? super i, ? super Integer, b0> qVar, int i11) {
        super(2);
        this.$hiddenIdentifiersFlow = eVar;
        this.$enabledFlow = eVar2;
        this.$elementsFlow = eVar3;
        this.$lastTextFieldIdentifierFlow = eVar4;
        this.$loadingComposable = qVar;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        FormUIKt.FormUI(this.$hiddenIdentifiersFlow, this.$enabledFlow, this.$elementsFlow, this.$lastTextFieldIdentifierFlow, this.$loadingComposable, iVar, this.$$changed | 1);
    }
}