package com.stripe.android.link.ui.wallet;

import c1.i;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.model.ConsumerPaymentDetails;
import h00.a;
import h00.l;
import h00.p;
import h00.q;
import java.util.List;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class WalletScreenKt$WalletBody$10 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ boolean $isProcessing;
    final /* synthetic */ a<b0> $onAddNewPaymentMethodClick;
    final /* synthetic */ l<ConsumerPaymentDetails.PaymentDetails, b0> $onDeletePaymentMethod;
    final /* synthetic */ l<ConsumerPaymentDetails.PaymentDetails, b0> $onEditPaymentMethod;
    final /* synthetic */ a<b0> $onPayAnotherWayClick;
    final /* synthetic */ l<ConsumerPaymentDetails.PaymentDetails, b0> $onPrimaryButtonClick;
    final /* synthetic */ List<ConsumerPaymentDetails.PaymentDetails> $paymentDetails;
    final /* synthetic */ String $primaryButtonLabel;
    final /* synthetic */ l<q<? super p0.i, ? super i, ? super Integer, b0>, b0> $showBottomSheetContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletScreenKt$WalletBody$10(boolean z11, List<? extends ConsumerPaymentDetails.PaymentDetails> list, String str, ErrorMessage errorMessage, a<b0> aVar, l<? super ConsumerPaymentDetails.PaymentDetails, b0> lVar, l<? super ConsumerPaymentDetails.PaymentDetails, b0> lVar2, l<? super ConsumerPaymentDetails.PaymentDetails, b0> lVar3, a<b0> aVar2, l<? super q<? super p0.i, ? super i, ? super Integer, b0>, b0> lVar4, int i11) {
        super(2);
        this.$isProcessing = z11;
        this.$paymentDetails = list;
        this.$primaryButtonLabel = str;
        this.$errorMessage = errorMessage;
        this.$onAddNewPaymentMethodClick = aVar;
        this.$onEditPaymentMethod = lVar;
        this.$onDeletePaymentMethod = lVar2;
        this.$onPrimaryButtonClick = lVar3;
        this.$onPayAnotherWayClick = aVar2;
        this.$showBottomSheetContent = lVar4;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        WalletScreenKt.WalletBody(this.$isProcessing, this.$paymentDetails, this.$primaryButtonLabel, this.$errorMessage, this.$onAddNewPaymentMethodClick, this.$onEditPaymentMethod, this.$onDeletePaymentMethod, this.$onPrimaryButtonClick, this.$onPayAnotherWayClick, this.$showBottomSheetContent, iVar, this.$$changed | 1);
    }
}