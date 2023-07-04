package com.stripe.android.link.ui.paymentmethod;

import c1.i;
import com.stripe.android.link.ui.ErrorMessage;
import h00.a;
import h00.p;
import h00.q;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentMethodScreenKt$PaymentMethodBody$6 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ q<p0.i, i, Integer, b0> $formContent;
    final /* synthetic */ boolean $isProcessing;
    final /* synthetic */ a<b0> $onPayAnotherWayClick;
    final /* synthetic */ a<b0> $onPrimaryButtonClick;
    final /* synthetic */ boolean $primaryButtonEnabled;
    final /* synthetic */ String $primaryButtonLabel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodScreenKt$PaymentMethodBody$6(boolean z11, String str, boolean z12, ErrorMessage errorMessage, a<b0> aVar, a<b0> aVar2, q<? super p0.i, ? super i, ? super Integer, b0> qVar, int i11) {
        super(2);
        this.$isProcessing = z11;
        this.$primaryButtonLabel = str;
        this.$primaryButtonEnabled = z12;
        this.$errorMessage = errorMessage;
        this.$onPrimaryButtonClick = aVar;
        this.$onPayAnotherWayClick = aVar2;
        this.$formContent = qVar;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        PaymentMethodScreenKt.PaymentMethodBody(this.$isProcessing, this.$primaryButtonLabel, this.$primaryButtonEnabled, this.$errorMessage, this.$onPrimaryButtonClick, this.$onPayAnotherWayClick, this.$formContent, iVar, this.$$changed | 1);
    }
}