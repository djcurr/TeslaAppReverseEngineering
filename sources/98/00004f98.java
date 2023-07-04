package com.stripe.android.link.ui.cardedit;

import c1.i;
import com.stripe.android.link.ui.ErrorMessage;
import h00.a;
import h00.l;
import h00.p;
import h00.q;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CardEditScreenKt$CardEditBody$5 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ q<p0.i, i, Integer, b0> $formContent;
    final /* synthetic */ boolean $isDefault;
    final /* synthetic */ boolean $isProcessing;
    final /* synthetic */ a<b0> $onCancelClick;
    final /* synthetic */ a<b0> $onPrimaryButtonClick;
    final /* synthetic */ l<Boolean, b0> $onSetAsDefaultClick;
    final /* synthetic */ boolean $primaryButtonEnabled;
    final /* synthetic */ boolean $setAsDefaultChecked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardEditScreenKt$CardEditBody$5(boolean z11, boolean z12, boolean z13, boolean z14, ErrorMessage errorMessage, l<? super Boolean, b0> lVar, a<b0> aVar, a<b0> aVar2, q<? super p0.i, ? super i, ? super Integer, b0> qVar, int i11) {
        super(2);
        this.$isProcessing = z11;
        this.$isDefault = z12;
        this.$setAsDefaultChecked = z13;
        this.$primaryButtonEnabled = z14;
        this.$errorMessage = errorMessage;
        this.$onSetAsDefaultClick = lVar;
        this.$onPrimaryButtonClick = aVar;
        this.$onCancelClick = aVar2;
        this.$formContent = qVar;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        CardEditScreenKt.CardEditBody(this.$isProcessing, this.$isDefault, this.$setAsDefaultChecked, this.$primaryButtonEnabled, this.$errorMessage, this.$onSetAsDefaultClick, this.$onPrimaryButtonClick, this.$onCancelClick, this.$formContent, iVar, this.$$changed | 1);
    }
}